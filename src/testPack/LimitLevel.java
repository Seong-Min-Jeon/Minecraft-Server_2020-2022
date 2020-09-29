package testPack;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class LimitLevel {

	public boolean limit(Player player, ItemStack item) {
		int lvl = getLevel(item);
		if(player.getLevel() >= lvl) {
			return true;
		}
		return false;
	}
	
	public int getLevel(ItemStack item) {
		int lvl = 0;
		try {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			lvl = Integer.parseInt(ary[10]);
		} catch(Exception e) {
			
		}
		return lvl;
	}
	
}
