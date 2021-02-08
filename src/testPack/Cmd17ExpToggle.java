package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd17ExpToggle implements CommandExecutor {
	
	private static ArrayList<String> ary = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			String name = player.getDisplayName();
			if(cmd.getName().equalsIgnoreCase("ExpToggle")) {
				if(ary.contains(name)) {
					player.sendMessage(ChatColor.GREEN + "You can be sent Exp Message!");
					ary.remove(name);
					return true;
				} 
				player.sendMessage(ChatColor.RED + "You can't be sent Exp Message!");
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
