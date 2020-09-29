package testPack;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class Thorns {
	
	private int thorns = 0;

	public int thorns(Player player, Entity entity) {
//		if(player.getInventory().getItemInMainHand() != null) {
//			
//		}
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
				thorns += Integer.parseInt(ench[9]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getHelmet() != null) {
				String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
				thorns += Integer.parseInt(ench[9]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getChestplate() != null) {
				String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
				thorns += Integer.parseInt(ench[9]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getLeggings() != null) {
				String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
				thorns += Integer.parseInt(ench[9]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getBoots() != null) {
				String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
				thorns += Integer.parseInt(ench[9]);
			}
		} catch(Exception e) {
			
		}
		return thorns;
	}
	
}
