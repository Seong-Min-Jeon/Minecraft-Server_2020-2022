package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd15skiptutorial implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			World world = player.getWorld();
			Location loc = player.getLocation();
			
			// 튜토존 3838 255 3965  4066 0 3798
			if(loc.getX() <= 4066 && loc.getY() <= 255 && loc.getZ() <= 3965 
					&& loc.getX() >= 3838 && loc.getY() >= 0 && loc.getZ() >= 3798) {
				Location wargunil = new Location(world,-1844,70,3012);
				player.teleport(wargunil);
				if(player.getLevel() == 0) {
					player.setLevel(1);
				}
			} else {
				player.sendMessage(ChatColor.RED + "Not In Tutorial Zone");
			}
			
		}	
		return true;
	}


}
