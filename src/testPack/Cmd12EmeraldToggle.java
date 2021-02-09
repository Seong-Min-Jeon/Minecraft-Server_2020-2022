package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Cmd12EmeraldToggle implements CommandExecutor {
	
	//에메랄드
	//경험치
	//아이템
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			try {
				ItemStack item = player.getInventory().getItem(7);
				ItemMeta im = item.getItemMeta();
				ArrayList<String> lores = (ArrayList<String>) im.getLore(); 
				String lore = lores.get(4);
				if(cmd.getName().equalsIgnoreCase("EmeraldToggle")) {
					if(lore.substring(2).equalsIgnoreCase("§a")) {
						player.sendMessage(ChatColor.RED + "You will not change emerald when you open an ender chest!");
						lores.set(4, ChatColor.RED + "Emerald Toggle: Off");
						im.setLore(lores);
						item.setItemMeta(im);
						player.getInventory().setItem(7, item);
						return true;
					} 
					player.sendMessage(ChatColor.GREEN + "You can change emerald when you open an ender chest!");
					lores.set(4, ChatColor.GREEN + "Emerald Toggle: On");
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
		String lore = lores.get(4);
		if(lore.substring(2).equalsIgnoreCase("§a")) {
			return true;
		} 
		return false;
	}

}
