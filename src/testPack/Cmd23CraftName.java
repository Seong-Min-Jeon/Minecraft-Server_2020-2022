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
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class Cmd23CraftName implements CommandExecutor {
	
	static HashMap<Player, Boolean> limitTime = new HashMap<>();
	static HashMap<Player, Player> tradeRel = new HashMap<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;
			String name = "";
			for(String str : args) {
				name += str + " ";
			}
			if(name.equals("")) {
				player.sendMessage(ChatColor.RED + "사용할 수 없는 이름입니다.");
			} else {
				if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
					ItemStack item = player.getInventory().getItemInMainHand();
					ItemMeta im = item.getItemMeta();
					if(im.getDisplayName().substring(0, 2).equals("§3")) {
						String maker1 = "";
						String maker2 = "";
						String maker3 = "";
						try {
							maker1 = im.getLore().get(2).split(": ")[1];
						} catch(Exception e) {
							
						}
						try {
							maker2 = im.getLore().get(2);
						} catch(Exception e) {
							
						}
						try {
							maker3 = im.getLore().get(4).split(": ")[1];
						} catch(Exception e) {
							
						}
						try {
							if(!maker1.equalsIgnoreCase(player.getDisplayName()) && !maker2.contains(player.getDisplayName()) && !maker3.equalsIgnoreCase(player.getDisplayName())) {
								player.sendMessage(ChatColor.RED + "직접 제작한 플레이어만 이름 변경이 가능합니다.");
								return true;
							} 
							im.setDisplayName("§3" + name);
							item.setItemMeta(im);
							player.sendMessage(ChatColor.GREEN + "아이템의 이름이 변경되었습니다.");
							player.sendMessage(ChatColor.BOLD + "" + ChatColor.WHITE + "부적절한 단어 사용(음란한 어휘, 욕설 등)을 사용하셨을 시, 무통보 아이템 삭제 및 제재가 있을 수 있습니다.");
							return true;
						} catch(Exception e) {
							
						}
						return true;
					}
					player.sendMessage(ChatColor.RED + "이름 변경이 불가능한 아이템입니다.");
					return false;
				} else {
					player.sendMessage(ChatColor.RED + "오른손에 제작한 아이템을 들어야 합니다.");
				}
			}
		}	
		return true;
	}

}
