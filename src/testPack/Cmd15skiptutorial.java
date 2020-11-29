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
			
			// 튜토존 3674 85 3735  3775 30 3654
			if(loc.getX() <= 3775 && loc.getY() <= 85 && loc.getZ() <= 3735 
					&& loc.getX() >= 3674 && loc.getY() >= 30 && loc.getZ() >= 3654) {
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
