package testPack;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class PitySystem {

	private static HashMap<Player, Integer> unique = new HashMap<>();
	private static HashMap<Player, Integer> legendary = new HashMap<>();
	private static HashMap<Player, Integer> hero = new HashMap<>();
	private static HashMap<Player, Integer> acc = new HashMap<>();
	
	public void addStack(Player player) {
		if(unique.containsKey(player)) {
			unique.put(player, unique.get(player)+1);
		} else {
			unique.put(player, 0);
		}
		
		if(legendary.containsKey(player)) {
			legendary.put(player, legendary.get(player)+1);
		} else {
			legendary.put(player, 0);
		}
		
		if(hero.containsKey(player)) {
			hero.put(player, hero.get(player)+1);
		} else {
			hero.put(player, 0);			
		}
		
		if(acc.containsKey(player)) {
			acc.put(player, acc.get(player)+1);
		} else {
			acc.put(player, 0);			
		}
	}
	
	public void removePlayer(Player player) {
		if(unique.containsKey(player)) {
			unique.remove(player);
		}
		if(legendary.containsKey(player)) {
			legendary.remove(player);
		}
		if(hero.containsKey(player)) {
			hero.remove(player);
		}
		if(acc.containsKey(player)) {
			acc.remove(player);
		}
	}
	
	public String reach(Player player) {
		if(unique.containsKey(player)) {
			if(unique.get(player) >= 100) {
				unique.put(player, 0);
				return "unique";
			}
		}
		if(legendary.containsKey(player)) {
			if(legendary.get(player) >= 500) {
				legendary.put(player, 0);
				return "legendary";
			}
		}
		if(hero.containsKey(player)) {
			if(hero.get(player) >= 2000) {
				hero.put(player, 0);
				return "hero";
			}
		}
		if(acc.containsKey(player)) {
			if(acc.get(player) >= 1000) {
				acc.put(player, 0);
				return "acc";
			}
		}
		return "";
	}
}
