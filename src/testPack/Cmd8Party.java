package testPack;

import java.util.ArrayList;

import net.minecraft.server.v1_16_R1.ChatMessageType;
import net.minecraft.server.v1_16_R1.IChatBaseComponent;
import net.minecraft.server.v1_16_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_16_R1.PacketPlayOutChat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd8Party implements CommandExecutor {
	
	private static ArrayList<ArrayList<Player>> party = new ArrayList<ArrayList<Player>>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;
			Player player2 = null;
			if(cmd.getName().equalsIgnoreCase("Party")) {
				if(args.length == 0) {
					for(ArrayList<Player> allParty : party) {
						if(allParty.contains(player)) {
							for(Player partyPlayer : allParty) {
								player.sendMessage(partyPlayer.getDisplayName() + " " + partyPlayer.getLevel() + "Lv");
							}
							return true;
						}
					}
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("help")) {
						player.sendMessage(ChatColor.RED + "party, party where, party 'name'");
						return true;
					} else if(args[0].equalsIgnoreCase("leave")) {
						for(ArrayList<Player> allParty : party) {
							if(allParty.contains(player)) {
								allParty.remove(player);
								return true;
							}
						}
					} else if(args[0].equalsIgnoreCase("where")) {
						for(ArrayList<Player> allParty : party) {
							if(allParty.contains(player)) {
								for(Player partyPlayer : allParty) {
									 player.sendMessage(partyPlayer.getDisplayName() + " " + (int)(partyPlayer.getLocation().getX()) + " " + (int)(partyPlayer.getLocation().getY()) + " " + (int)(partyPlayer.getLocation().getZ()));
								}
								return true;
							}
						}
					} else if(args[0].equalsIgnoreCase("agreePlayerParty")) {
						try {
							agree(args[1], args[2]);
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
					if(isOk == true && player!=player2) {				
						player.sendMessage("파티 신청을 보냈습니다.");
						party(player, player2);
					}
				} catch(Exception e) {
					
				}
			}
		}	
		return true;
	}

	public void party(Player player, Player player2) {
		ArrayList<Player> playersParty = new ArrayList<Player>();
		for(ArrayList<Player> allParty : party) {
			if(allParty.contains(player)) {
				playersParty = allParty;
			}
		}
		for(ArrayList<Player> allParty : party) {
			if(allParty.contains(player2)) {
				if(allParty.contains(player)) {
					player.sendMessage("이미 파티에 가입되어 있는 플레이어입니다.");
					return;
				}
				player.sendMessage("다른 파티에 가입되어 있는 플레이어입니다.");
				return;
			}
		}
		if(playersParty.size() > 5) {
			player.sendMessage("파티의 최대 인원 수는 5명입니다.");
			return;
		} else if(playersParty.size() == 0) {
			party.remove(playersParty);
			playersParty.add(player);
			party.add(playersParty);
			try {
				IChatBaseComponent comp = ChatSerializer.a("{\"text\":\"" + "\",\"extra\":[{\"text\":\"" + ChatColor.UNDERLINE + player.getDisplayName() + "님이 파티에 초대하였습니다. 클릭해 파티에 가입하다!"
	                    + "\",\"clickEvent\": {\"action\":\"run_command\",\"value\":\"" + "/party agreePlayerParty " + player.getDisplayName() + " " + player2.getDisplayName()
	                    +  "\",\"hoverEvent\": {\"action\":\"show_text\",\"value\":\"" + ""
	                    + "\"}}}]}"); 
				PacketPlayOutChat chat = new PacketPlayOutChat(comp, ChatMessageType.CHAT, player2.getUniqueId());
				Object handle = player2.getClass().getMethod("getHandle").invoke(player2);
		        Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
		        playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, chat);
			} catch(Exception e) {
				
			}
			return;
		} else { 
			try {
				IChatBaseComponent comp = ChatSerializer.a("{\"text\":\"" + "\",\"extra\":[{\"text\":\"" + ChatColor.UNDERLINE + player.getDisplayName() + "님이 파티에 초대하였습니다. 클릭해 파티에 가입하다!"
	                    + "\",\"clickEvent\": {\"action\":\"run_command\",\"value\":\"" + "/party agreePlayerParty " + player.getDisplayName() + " " + player2.getDisplayName()
	                    +  "\",\"hoverEvent\": {\"action\":\"show_text\",\"value\":\"" + ""
	                    + "\"}}}]}"); 
				PacketPlayOutChat chat = new PacketPlayOutChat(comp, ChatMessageType.CHAT, player2.getUniqueId());
				Object handle = player2.getClass().getMethod("getHandle").invoke(player2);
		        Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
		        playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, chat);
			} catch(Exception e) {
				
			}
			return;
		}
	}
	
	public void agree(String playerStr, String player2Str) {
		Player player = null;
		Player player2 = null;
		for(Player allPlayer : Bukkit.getOnlinePlayers()) {
			if(allPlayer.getDisplayName().equalsIgnoreCase(playerStr)) {
				player = allPlayer;
				break;
			}
		}
		for(Player allPlayer : Bukkit.getOnlinePlayers()) {
			if(allPlayer.getDisplayName().equalsIgnoreCase(player2Str)) {
				player2 = allPlayer;
				break;
			}
		}
		ArrayList<Player> playersParty = new ArrayList<Player>();
		for(ArrayList<Player> allParty : party) {
			if(allParty.contains(player)) {
				playersParty = allParty;
			}
		}
		if(playersParty.size() > 5) {
			player2.sendMessage("파티에 남은 자리가 없습니다.");
			return;
		}
		for(Player allPlayerInParty : playersParty) {
			if(!(playersParty.contains(player2))) {
				allPlayerInParty.sendMessage("파티에 " + player2.getDisplayName() + "님이 가입되었습니다.");
			}
		}
		if(!(playersParty.contains(player2))) {
			player2.sendMessage("파티에 가입되었습니다.");
			party.remove(playersParty);
			playersParty.add(player2);
			party.add(playersParty);
		}
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
	
	public ArrayList<Player> getPlayerParty(Player player) {
		ArrayList<Player> playerParty = new ArrayList<Player>();
		for(ArrayList<Player> allParty : party) {
			if(allParty.contains(player)) {
				playerParty = allParty;
			}
		}
		return playerParty;
	}

}
