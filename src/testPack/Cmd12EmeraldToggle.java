package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd12EmeraldToggle implements CommandExecutor {
	
	private static ArrayList<String> ary = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			String name = player.getDisplayName();
			if(cmd.getName().equalsIgnoreCase("EmeraldToggle")) {
				if(ary.contains(name)) {
					player.sendMessage(ChatColor.RED + "You will not change emerald when you open an ender chest!");
					ary.remove(name);
					return true;
				} 
				player.sendMessage(ChatColor.GREEN + "You can change emerald when you open an ender chest!");
				ary.add(name);
				return true;
			}
		}	
		return true;
	}
	
	public boolean isOn(String name) {
		if(ary.contains(name)) {
			return true;
		} 
		return false;
	}

}
