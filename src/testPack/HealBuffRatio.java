package testPack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class HealBuffRatio {

	public void cal(Player player, double amount) {
		PotionRatio pr = new PotionRatio();
		pr.calculation(player, amount/4);
	}
}