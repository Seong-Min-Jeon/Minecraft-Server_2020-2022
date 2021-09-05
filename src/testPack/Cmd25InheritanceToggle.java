package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Cmd25InheritanceToggle implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			try {
				ItemStack item = player.getInventory().getItem(7);
				ItemMeta im = item.getItemMeta();
				ArrayList<String> lores = (ArrayList<String>) im.getLore(); 
				String lore = lores.get(7);
				if(cmd.getName().equalsIgnoreCase("InheritanceToggle")) {
					if(lore.substring(0,2).equalsIgnoreCase("§a")) {
						player.sendMessage(ChatColor.RED + "당신과 계승의 힘 사이의 연결이 약해집니다. (계승자 스크롤, 계승 반환 스크롤 사용 가능)");
						lores.set(7, ChatColor.RED + "Inheritance Toggle: Off");
						im.setLore(lores);
						item.setItemMeta(im);
						player.getInventory().setItem(7, item);
						return true;
					} 
					player.sendMessage(ChatColor.GREEN + "당신과 계승의 힘 사이의 연결이 강해집니다. (계승자 스크롤, 계승 반환 스크롤 사용 불가능)");
					lores.set(7, ChatColor.GREEN + "Inheritance Toggle: On");
					im.setLore(lores);
					item.setItemMeta(im);
					player.getInventory().setItem(7, item);
					return true;
				}
			} catch(Exception e) {
				
			}
		}	
		return true;
	}
	
	public boolean isOn(Player player) {
		ItemStack item = player.getInventory().getItem(7);
		ItemMeta im = item.getItemMeta();
		ArrayList<String> lores = (ArrayList<String>) im.getLore(); 
		String lore = lores.get(7);
		if(lore.substring(0,2).equalsIgnoreCase("§a")) {
			return true;
		} 
		return false;
	}

}
