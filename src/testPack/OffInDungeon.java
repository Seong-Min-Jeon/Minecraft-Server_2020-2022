package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class OffInDungeon {

	public OffInDungeon(Player player) {
		removeMana(player);
		Location loc = player.getLocation();
		// 퀘스트 방 3787 29 3795  3826 0 3804
		if(loc.getX() <= 3826 && loc.getY() <= 29 && loc.getZ() <= 3804 &&
				loc.getX() >= 3787 && loc.getY() >= 0 && loc.getZ() >= 3795) {
			return;
		}
		//잊혀진 바다 신전 3815 62 3747  3599 0 3812
		if(loc.getX() <= 3815 && loc.getY() <= 62 && loc.getZ() <= 3812 &&
				loc.getX() >= 3599 && loc.getY() >= 0 && loc.getZ() >= 3747) {
			player.teleport(new Location(player.getWorld(), -1808, 53, 3024));
			return;
		}
		//숲의 유적 3590 109 3787  3439 8 3681
		if(loc.getX() <= 3590 && loc.getY() <= 109 && loc.getZ() <= 3787 &&
				loc.getX() >= 3439 && loc.getY() >= 8 && loc.getZ() >= 3681) {
			player.teleport(new Location(player.getWorld(), -2050, 64, 2455));
			return;
		}
		//광산 3481 31 3837 3603 5 3976
		if(loc.getX() <= 3603 && loc.getY() <= 31 && loc.getZ() <= 3976 
				&& loc.getX() >= 3481 && loc.getY() >= 5 && loc.getZ() >= 3837) {
			player.teleport(new Location(player.getWorld(), -1154, 24, 1558));
			return;
		}
		//타락한 요정 왕국 3706 115 3591  3823 32 3287
		if(loc.getX() <= 3823 && loc.getY() <= 115 && loc.getZ() <= 3591 
				&& loc.getX() >= 3706 && loc.getY() >= 32 && loc.getZ() >= 3287) {
			//안전지대  3807 60 3505  3742 27 3585
			if(!(loc.getX() <= 3807 && loc.getY() <= 60 && loc.getZ() <= 3585 
				&& loc.getX() >= 3742 && loc.getY() >= 25 && loc.getZ() >= 3505)) {
				player.teleport(new Location(player.getWorld(), 3774, 34, 3567));
				return;
			}
			return;
		}
		//카루 던전 3844 223 3276  3628 2 3105
		if(loc.getX() <= 3844 && loc.getY() <= 223 && loc.getZ() <= 3276 
				&& loc.getX() >= 3628 && loc.getY() >= 2 && loc.getZ() >= 3105) {
			player.teleport(new Location(player.getWorld(), -2424, 28, 770));
			return;
		}
		//아덴의 저택 3300 65 3706  3431 2 3835
		if(loc.getX() <= 3431 && loc.getY() <= 65 && loc.getZ() <= 3835 
				&& loc.getX() >= 3300 && loc.getY() >= 2 && loc.getZ() >= 3706) {
			player.teleport(new Location(player.getWorld(), -832, 55, 2029));
			return;
		}
		// 탑 90 -5  54 -41
		if (loc.getX() <= 90 && loc.getY() <= 255 && loc.getZ() <= -5 
				&& loc.getX() >= 54 && loc.getY() >= 0 && loc.getZ() >= -41) {
			player.teleport(new Location(player.getWorld(), 79, 64, -22));
			return;
		}
		// 코낭그 미궁 10 61 609  102 50 702
		if (loc.getX() <= 102 && loc.getY() <= 68 && loc.getZ() <= 702 
				&& loc.getX() >= 10 && loc.getY() >= 50 && loc.getZ() >= 609) {
			player.teleport(new Location(player.getWorld(), 221, 81, 725));
			return;
		}
		// 아라크네의 저주 699 59 552  789 0 634
		if (loc.getX() <= 789 && loc.getY() <= 59 && loc.getZ() <= 634 
				&& loc.getX() >= 699 && loc.getY() >= 0 && loc.getZ() >= 552) {
			player.teleport(new Location(player.getWorld(), 686, 49, 588));
			return;
		}
		// 고대의 사막 협곡
		if (loc.getX() <= 3839 && loc.getY() <= 255 && loc.getZ() <= 3096 
				&& loc.getX() >= 3626 && loc.getY() >= 0 && loc.getZ() >= 2810) {
			player.teleport(new Location(player.getWorld(), 164, 23, 1057));
			return;
		}
	}

	public void removeMana(Player player) {
		ItemStack item = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.RED + "마나없음");
		item.setItemMeta(itemIm);
		player.getInventory().setItem(8, item);
	}
	
}
