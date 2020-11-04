package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AccessoryEffect {
	
	Random rnd = new Random();
	
	public void a1(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "은반지")) {
				if(rnd.nextInt(100) == 0) {
					ItemStack mana = new ItemStack(Material.HEART_OF_THE_SEA);
					ItemMeta manaIm = mana.getItemMeta();
					manaIm.setDisplayName(ChatColor.BLUE + "마나");
					mana.setItemMeta(manaIm);
					if (player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
						int i = 0;
						for (ItemStack is : player.getInventory().getContents()) {
							if (is == null)
								continue;
							if (is.getType() == Material.HEART_OF_THE_SEA) {
								i = i + is.getAmount();
							}
						}
						if (i < 20)
							player.getInventory().addItem(mana);
					} else {
						player.getInventory().setItem(8, mana);
					}
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	public int a2(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "무지개 반사")) {
				thorns *= 2;
			}
		} catch(Exception e) {
			
		}
		return thorns;
	}
}
