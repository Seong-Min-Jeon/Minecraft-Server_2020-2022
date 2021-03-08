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
		} else if(player.getUniqueId().toString().equals("0dca3279-a6b0-474f-94fd-fa6e970fc31a")) {
			why9196(player, num, inv);
		} else if(player.getUniqueId().toString().equals("83ed61a8-c6db-4155-8af7-c9b0cfb8d9ba")) {
			akilae3102(player, num, inv);
		} else if(player.getUniqueId().toString().equals("69ca53dc-73ab-454e-b3b4-a5cd2e6b4d03")) {
			woolring(player, num, inv);
		} else if(player.getUniqueId().toString().equals("fbdd3c7a-a8cc-4b27-ba54-8f58132b55d4")) {
			sarashina_ruka(player, num, inv);
		} else if(player.getUniqueId().toString().equals("eb9ad530-7504-432f-9895-0d3e79f7f9f2")) {
			junletTridner(player, num, inv);
		} 
	}
	
	public void yumehama(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3774, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3774, 5, 3745);
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
			Location chestLoc = new Location(player.getWorld(), 3784, 5, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 4) {
			Location chestLoc = new Location(player.getWorld(), 3784, 7, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		}
	}
	
	public void _nanoboost_(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3782, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3782, 5, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 4) {
			Location chestLoc = new Location(player.getWorld(), 3782, 7, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 5) {
			Location chestLoc = new Location(player.getWorld(), 3782, 9, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 6) {
			Location chestLoc = new Location(player.getWorld(), 3782, 11, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 7) {
			Location chestLoc = new Location(player.getWorld(), 3782, 13, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 8) {
			Location chestLoc = new Location(player.getWorld(), 3782, 15, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		}
		
	}
	
	public void why9196(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3780, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3780, 5, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 4) {
			Location chestLoc = new Location(player.getWorld(), 3780, 7, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 5) {
			Location chestLoc = new Location(player.getWorld(), 3780, 9, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		}
		
	}
	
	public void akilae3102(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3778, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3778, 5, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 4) {
			Location chestLoc = new Location(player.getWorld(), 3778, 7, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 5) {
			Location chestLoc = new Location(player.getWorld(), 3778, 9, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		}
		
	}
	
	public void woolring(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3776, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3776, 5, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 4) {
			Location chestLoc = new Location(player.getWorld(), 3776, 7, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			}
			closeInv(chestLoc.getBlock(), inv);
		} 
		
	}
	
	public void sarashina_ruka(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3772, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			} else 
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3772, 5, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			} else 
			closeInv(chestLoc.getBlock(), inv);
		}
		
	}
	
	public void junletTridner(Player player, int num, Inventory inv) {
		if(num == 2) {
			Location chestLoc = new Location(player.getWorld(), 3770, 3, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			} else 
			closeInv(chestLoc.getBlock(), inv);
		} else if(num == 3) {
			Location chestLoc = new Location(player.getWorld(), 3770, 5, 3745);
			if(inv == null) {
				openInv(player, chestLoc.getBlock());
				return;
			} else 
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
