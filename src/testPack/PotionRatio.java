package testPack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PotionRatio {

	public double calculation(Player player, double heal) {
		Inventory inv = player.getInventory();
		int lvl = player.getLevel();
		if(inv.contains(Material.RED_DYE)) {
			heal = ((int)(heal / ((20+lvl*8)/20.0)*100))/100.0;
		} else if(inv.contains(Material.GREEN_DYE)) {
			heal = ((int)(heal / ((20+lvl*5)/20.0)*100))/100.0;
		} else if(inv.contains(Material.LAPIS_LAZULI)) {
			heal = ((int)(heal / ((20+lvl*8)/20.0)*100))/100.0;
		} else if(inv.contains(Material.CYAN_DYE)) {
			heal = ((int)(heal / ((20+lvl*2)/20.0)*100))/100.0;
		} else if(inv.contains(Material.LIGHT_GRAY_DYE)) {
			heal = ((int)(heal / ((20+lvl*10)/20.0)*100))/100.0;
		} else if(inv.contains(Material.GRAY_DYE)) {
			heal = ((int)(heal / ((20+lvl*20)/20.0)*100))/100.0;
		} else if(inv.contains(Material.PINK_DYE)) {
			heal = ((int)(heal / ((20+lvl*30)/20.0)*100))/100.0;
		} else if(inv.contains(Material.LIME_DYE)) {
			heal = ((int)(heal / ((20+lvl*20)/20.0)*100))/100.0;
		} else if(inv.contains(Material.YELLOW_DYE)) {
			heal = ((int)(heal / ((20+lvl*8)/20.0)*100))/100.0;
		} else if(inv.contains(Material.LIGHT_BLUE_DYE)) {
			heal = ((int)(heal / ((20+lvl*3)/20.0)*100))/100.0;
		} else if(inv.contains(Material.MAGENTA_DYE)) {
			heal = ((int)(heal / ((20+lvl*15)/20.0)*100))/100.0;
		} else if(inv.contains(Material.ORANGE_DYE)) {
			heal = ((int)(heal / ((20+lvl*10)/20.0)*100))/100.0;
		} else if(inv.contains(Material.BLUE_DYE)) {
			heal = ((int)(heal / ((20+lvl*50)/20.0)*100))/100.0;
		} else if(inv.contains(Material.BROWN_DYE)) {
			heal = ((int)(heal / ((20+lvl*99)/20.0)*100))/100.0;
		} else if(inv.contains(Material.BLACK_DYE)) {
			heal = ((int)(heal / ((20+lvl*80)/20.0)*100))/100.0;
		} else if(inv.contains(Material.INK_SAC)) {
			heal = ((int)(heal / ((20+lvl*40)/20.0)*100))/100.0;
		} else if(inv.contains(Material.CLAY_BALL)) {
			heal = ((int)(heal / ((20+lvl*10)/20.0)*100))/100.0;
		} else if(inv.contains(Material.GLOWSTONE_DUST)) {
			heal = ((int)(heal / ((20+lvl*60)/20.0)*100))/100.0;
		}
		
		try {
			player.setHealth(player.getHealth()+heal);
		} catch(Exception e) {
			player.setHealth(20);
		}
		
		return heal;
	}
	
}
