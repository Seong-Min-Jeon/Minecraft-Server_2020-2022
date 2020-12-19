package testPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.entity.Player;

public class GoldenPlayer {

	private static Map<Player, Integer> map = new HashMap<>();
	
	public void put(Player player, int time) {
		try {
			map.put(player, time);	
		} catch(Exception e) {
			
		}
	}
	
	public void remove(Player player) {
		try {
			map.remove(player);	
		} catch(Exception e) {
			
		}
	}
	
	public int returnTime(Player player) {
		try {
			if(map.containsKey(player)) {
				return map.get(player);
			} else {
				return 0;
			}
		} catch(Exception e) {
			return 0;
		}
	}
	
	public void addTime(Player player) {
		try {
			int time = map.get(player) + 1;
			map.remove(player);
			map.put(player, time);
		} catch(Exception e) {
			
		}
	}
	
}
