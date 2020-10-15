package testPack;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ChestOwner {
	
	public ChestOwner(Player player, int num, Inventory inv) {
		if(player.getUniqueId().toString().equals("35f7dea5-e781-4d6a-836f-77c414ae490e")) {
			yumehama(player, num, inv);
		} else if(player.getUniqueId().toString().equals("60e679de-acf9-4eb4-8e98-ea1efacad6ff")) {
			espina_id(player, num, inv);
		} else if(player.getUniqueId().toString().equals("e2c3d778-b9f7-42b2-b39d-163b93d4ab89")) {
			_nanoboost_(player, num, inv);
		} 
		
	}
	
	public void yumehama(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3784, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3782, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		}
	}
	
	public void espina_id(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3784, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3782, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 4) {
			Location chestLoc = new Location(player.getWorld(), 3780, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		}
	}
	
	public void _nanoboost_(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3778, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3776, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		}
	}
	
	public void openInv(Player player, Block block) {
		Chest chest = (Chest) block.getState();
		player.closeInventory();
		player.openInventory(chest.getSnapshotInventory());
	}
	
	public void closeInv(Block block, Inventory inv) {
		Chest chest = (Chest) block.getState();
		chest.getInventory().clear();
		int idx = 0;
		for(ItemStack item : inv.getContents()) {
			if(item == null) {
				idx++;
				continue;
			}
			chest.getInventory().setItem(idx, item);
			idx++;
		}
	}
}
