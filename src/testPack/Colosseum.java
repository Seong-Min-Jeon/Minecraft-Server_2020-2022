package testPack;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

public class Colosseum {

	public boolean colosseum(Entity ent) {
		Location loc = ent.getLocation();
		// 3841 70 2736  4204 120 2178
		if(loc.getX() <= 4204 && loc.getY() <= 120 && loc.getZ() <= 2736 
				&& loc.getX() >= 3841 && loc.getY() >= 70 && loc.getZ() >= 2178) {
			return true;
		}
		return false;
	}
	
}
