package testPack;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class OffInDungeon {

	public OffInDungeon(Player player) {
		Location loc = player.getLocation();
		//잊혀진 바다 신전 3815 62 3747  3599 0 3812
		if(loc.getX() <= 3815 && loc.getY() <= 62 && loc.getZ() <= 3812 &&
				loc.getX() >= 3599 && loc.getY() >= 0 && loc.getZ() >= 3747) {
			player.setHealth(0);
			return;
		}
		//숲의 유적 3563 69 3787  3439 8 3681
		if(loc.getX() <= 3563 && loc.getY() <= 69 && loc.getZ() <= 3787 &&
				loc.getX() >= 3439 && loc.getY() >= 8 && loc.getZ() >= 3681) {
			player.setHealth(0);
			return;
		}
		//광산 3481 31 3837 3603 5 3976
		if(loc.getX() <= 3603 && loc.getY() <= 31 && loc.getZ() <= 3976 
				&& loc.getX() >= 3481 && loc.getY() >= 5 && loc.getZ() >= 3837) {
			player.setHealth(0);
			return;
		}
		//타락한 요정 왕국 3706 115 3591  3823 32 3287
		if(loc.getX() <= 3823 && loc.getY() <= 115 && loc.getZ() <= 3591 
				&& loc.getX() >= 3706 && loc.getY() >= 32 && loc.getZ() >= 3287) {
			//안전지대  3807 60 3505  3742 27 3585
			if(!(loc.getX() <= 3807 && loc.getY() <= 60 && loc.getZ() <= 3585 
				&& loc.getX() >= 3742 && loc.getY() >= 25 && loc.getZ() >= 3505)) {
				player.setHealth(0);
				return;
			}
			return;
		}
		//카루 던전 3844 223 3276  3628 2 3105
		if(loc.getX() <= 3844 && loc.getY() <= 223 && loc.getZ() <= 3276 
				&& loc.getX() >= 3628 && loc.getY() >= 2 && loc.getZ() >= 3105) {
			player.setHealth(0);
			return;
		}
		//아덴의 저택 3300 65 3706  3431 2 3835
		if(loc.getX() <= 3431 && loc.getY() <= 65 && loc.getZ() <= 3835 
				&& loc.getX() >= 3300 && loc.getY() >= 2 && loc.getZ() >= 3706) {
			player.setHealth(0);
			return;
		}
		// 코낭그 미궁 10 61 609  102 50 702
		if (loc.getX() <= 102 && loc.getY() <= 68 && loc.getZ() <= 702 && loc.getX() >= 10 && loc.getY() >= 50
				&& loc.getZ() >= 609) {
			player.setHealth(0);
			return;
		}
	}
	
}
