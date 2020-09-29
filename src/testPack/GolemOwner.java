package testPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.entity.Player;

public class GolemOwner {

	private static Map<UUID, Player> golemOwner = new HashMap<>();
	
	public void put(UUID golemID, Player player) {
		golemOwner.put(golemID, player);
	}
	
	public void remove(UUID golemID) {
		golemOwner.remove(golemID);
	}
	
	public Player returnPlayer(UUID golemID) {
		return golemOwner.get(golemID);
	}
	
}
