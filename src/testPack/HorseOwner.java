package testPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;

public class HorseOwner {

	private static Map<Player, Horse> horseOwner = new HashMap<>();
	
	public void put(Player player, Horse horse) {
		horseOwner.put(player, horse);
	}
	
	public boolean already(Player player) {
		if(horseOwner.containsKey(player)) {
			return true;
		} 
		return false;
	}
	
	public void remove(Player player) {
		horseOwner.remove(player);
	}
	
	public Horse returnHorse(Player player) {
		return horseOwner.get(player);
	}
	
}
