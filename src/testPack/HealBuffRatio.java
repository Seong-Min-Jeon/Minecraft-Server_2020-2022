package testPack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class HealBuffRatio {

	//단계: 틱당 회복량
	//0:1  1:2  2:4  3:8  4:16  5:32
	
	public void cal(Player player, double amount) {
		PotionRatio pr = new PotionRatio();
		pr.calculation(player, amount/4);
	}
}