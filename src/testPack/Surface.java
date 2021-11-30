package testPack;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Surface {
	static HashMap<Player, Material> hash = new HashMap<>();
	
	public Surface() {
		
	}
	
	public Surface(Player player, Block block) {
		if(hash.containsKey(player)) {
			if(block.getType() != hash.get(player)) {
				
				Location abLoc = block.getLocation();
				Location loc = block.getLocation();
				int r = 5;

				for (int x = (r * -1); x <= r; x++) {
					for (int y = (r * -1); y <= r; y++) {
						for (int z = (r * -1); z <= r; z++) {
							loc = abLoc.clone().add(x, y, z);
							if(loc.getBlock().getType() != Material.AIR && loc.getBlock().getType() != hash.get(player)) {
								if(loc.clone().add(1,0,0).getBlock().getType() == Material.AIR) loc.clone().add(1,0,0).getBlock().setType(hash.get(player));
								if(loc.clone().add(-1,0,0).getBlock().getType() == Material.AIR) loc.clone().add(-1,0,0).getBlock().setType(hash.get(player));
								if(loc.clone().add(0,1,0).getBlock().getType() == Material.AIR) loc.clone().add(0,1,0).getBlock().setType(hash.get(player));
								if(loc.clone().add(0,-1,0).getBlock().getType() == Material.AIR) loc.clone().add(0,-1,0).getBlock().setType(hash.get(player));
								if(loc.clone().add(0,0,1).getBlock().getType() == Material.AIR) loc.clone().add(0,0,1).getBlock().setType(hash.get(player));
								if(loc.clone().add(0,0,-1).getBlock().getType() == Material.AIR) loc.clone().add(0,0,-1).getBlock().setType(hash.get(player));
							}
						}
					}
				}
				
			}
		} else {
			player.sendMessage(ChatColor.WHITE + "material 지정 필수");
		}
	}
	
	public void setMat(Player player, Material mat) {
		hash.put(player, mat);
	}
}
