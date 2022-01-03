package testPack;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

public class SantaGimmick {

	public boolean santaGimmick(Entity ent) {
		Location loc = ent.getLocation();
		// -2752 150 -879  -2454 30 -1150
		if(loc.getX() <= -2454 && loc.getY() <= 150 && loc.getZ() <= -879 
				&& loc.getX() >= -2752 && loc.getY() >= 30 && loc.getZ() >= -1150) {
			return true;
		}
		return false;
	}
	
}
