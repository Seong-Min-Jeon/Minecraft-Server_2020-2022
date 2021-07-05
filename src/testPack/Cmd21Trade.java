package testPack;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.server.v1_16_R3.ChatMessageType;
import net.minecraft.server.v1_16_R3.IChatBaseComponent;
import net.minecraft.server.v1_16_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_16_R3.PacketPlayOutChat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class Cmd21Trade implements CommandExecutor {
	
	static HashMap<Player, Boolean> limitTime = new HashMap<>();
	static HashMap<Player, Player> tradeRel = new HashMap<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;
			Player player2 = null;
			if(cmd.getName().equalsIgnoreCase("trade")) {
				if(args.length == 0) {
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("help")) {
						player.sendMessage(ChatColor.RED + "");
						return true;
					} else if(args[0].equalsIgnoreCase("agreePlayerTradeYeah")) {
						try {
							player = Bukkit.getPlayer(args[1]);
							player2 = Bukkit.getPlayer(args[2]);
							
							boolean dist = false;
							for(Entity ent : player.getNearbyEntities(20, 20, 20)) {
								if(ent == player2) {
									dist = true;
								}
							}
							
							if(dist) {
								if(limitTime.containsKey(player)) {
									if(limitTime.get(player)) {
										agree(player, player2);
									} else {
										player2.sendMessage(ChatColor.RED + "기한이 만료되어 거래를 받을 수 없습니다.");
									}
								}
							} else {
								player.sendMessage(ChatColor.RED + "상대방과의 거리가 멀어 거래가 취소됩니다.");
								player2.sendMessage(ChatColor.RED + "상대방과의 거리가 멀어 거래가 취소됩니다.");
							}
							
						} catch(Exception e) {
							
						}
						return true;
					}
					boolean isOk = false; 
					for(Player allPlayer : Bukkit.getOnlinePlayers()) {
						if(allPlayer.getDisplayName().equalsIgnoreCase(args[0])) {
							isOk = true;
							player2 = allPlayer;
							break;
						}
					}
					
					if(player2 == null) {
						player.sendMessage(ChatColor.RED + "Undefined Player!");
						return false;
					}
					
					boolean dist = false;
					for(Entity ent : player.getNearbyEntities(20, 20, 20)) {
						if(ent == player2) {
							dist = true;
						}
					}
					
					if(dist) {
						if(isOk == true && player!=player2) {				
							player.sendMessage(ChatColor.GREEN + "Send trade to " + player2.getDisplayName() + ".");
							limitTime.put(player, true);
							trade(player, player2);
						} else {
							player.sendMessage(ChatColor.RED + "뭘 기대하신겁니까 휴먼.");
							return true;
						}
					} else {
						player.sendMessage(ChatColor.RED + "상대방과의 거리가 멀어 거래가 취소됩니다.");
						player2.sendMessage(ChatColor.RED + "상대방과의 거리가 멀어 거래가 취소됩니다.");
					}
					
				} catch(Exception e) {
					
				}
			}
		}	
		return true;
	}

	public void trade(Player player, Player player2) {
		try {
			new BukkitRunnable() {
				int time = 0;

				@Override
				public void run() {

					if (time == 0) {
						try {
							limitTime.put(player, true);
							IChatBaseComponent comp = ChatSerializer.a("{\"text\":\"" + "\",\"extra\":[{\"text\":\"" + ChatColor.GREEN + "" + ChatColor.UNDERLINE + "Click the message to trade with " + player.getDisplayName() + "!"
				                    + "\",\"clickEvent\": {\"action\":\"run_command\",\"value\":\"" + "/trade agreePlayerTradeYeah " + player.getDisplayName() + " " + player2.getDisplayName()
				                    +  "\",\"hoverEvent\": {\"action\":\"show_text\",\"value\":\"" + ""
				                    + "\"}}}]}"); 
							PacketPlayOutChat chat = new PacketPlayOutChat(comp, ChatMessageType.CHAT, player2.getUniqueId());
							Object handle = player2.getClass().getMethod("getHandle").invoke(player2);
					        Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
					        playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, chat);
						} catch(Exception e) {
							
						}
					}

					if (time >= 200) {
						limitTime.put(player, false);
						player.sendMessage(ChatColor.RED + "기한이 만료되어 거래가 취소되었습니다.");
						this.cancel();
					}

					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} catch(Exception e) {
			
		}
		return;
	}
	
	public void agree(Player player, Player player2) {
		player.sendMessage(ChatColor.GREEN + "Close the deal with" + player2.getDisplayName() + "!");
		player2.sendMessage(ChatColor.GREEN + "Close the deal with" + player.getDisplayName() + "!");
		
		Inventory inv = Bukkit.createInventory(player, 45, "Trading table");
		ItemStack ok = new ItemStack(Material.RED_CONCRETE);
		ItemMeta okIm = ok.getItemMeta();
		okIm.setDisplayName(ChatColor.GREEN + "거래 수락");
		okIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		okIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		ok.setItemMeta(okIm);
		ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
		ItemMeta barIm = bar.getItemMeta();
		barIm.setDisplayName(ChatColor.RED + " ");
		barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		bar.setItemMeta(barIm);
		inv.setItem(17, ok);
		inv.setItem(18, bar);
		inv.setItem(19, bar);
		inv.setItem(20, bar);
		inv.setItem(21, bar);
		inv.setItem(22, bar);
		inv.setItem(23, bar);
		inv.setItem(24, bar);
		inv.setItem(25, bar);
		inv.setItem(26, bar);
		inv.setItem(44, ok);
		player.openInventory(inv);
		player2.openInventory(inv);
		
		tradeRel.put(player, player2);
	}
	
	public HashMap<Player, Player> getMap() {
		return tradeRel;
	}
	
	
	private Class<?> getNMSClass(String name) {
		try {
	        return Class.forName("net.minecraft.server."
	                + Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3] + "." + name);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

}
