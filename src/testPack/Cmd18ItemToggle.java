package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Cmd18ItemToggle implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			try {
				ItemStack item = player.getInventory().getItem(7);
				ItemMeta im = item.getItemMeta();
				ArrayList<String> lores = (ArrayList<String>) im.getLore(); 
				String lore = lores.get(6);
				if(cmd.getName().equalsIgnoreCase("ItemToggle")) {
					if(lore.substring(0,2).equalsIgnoreCase("§a")) {
						player.sendMessage(ChatColor.RED + "You can't be sent Getting Item Message! (When the Mob Loot and Gathering.)");
						lores.set(6, ChatColor.RED + "Item Toggle: Off");
						im.setLore(lores);
						item.setItemMeta(im);
						player.getInventory().setItem(7, item);
						return true;
					} 
					player.sendMessage(ChatColor.GREEN + "You can be sent Getting Item Message! (When the Mob Loot and Gathering.)");
					lores.set(6, ChatColor.GREEN + "Item Toggle: On");
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
		String lore = lores.get(6);
		if(lore.substring(2).equalsIgnoreCase("§a")) {
			return true;
		} 
		return false;
	}

}
