package testPack;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Thorns {
	
	private int thorns = 0;

	public int thorns(Player player, Entity entity) {
//		if(player.getInventory().getItemInMainHand() != null) {
//			
//		}
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemStack item = player.getInventory().getItemInMainHand();
				if(item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
						|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
						|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
						|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
						|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
						|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
						|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
						|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
						|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
						|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
						|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
						|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
						|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
						|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
						|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
						|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
						|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
						|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
						|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
						|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS) {
					LimitLevel la = new LimitLevel();
					if(la.limit(player, item) == true) {
						String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
						thorns += Integer.parseInt(ench[9]);
					}
				}
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getHelmet() != null) {
				String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
				thorns += Integer.parseInt(ench[9]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getChestplate() != null) {
				String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
				thorns += Integer.parseInt(ench[9]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getLeggings() != null) {
				String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
				thorns += Integer.parseInt(ench[9]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getBoots() != null) {
				String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
				thorns += Integer.parseInt(ench[9]);
			}
		} catch(Exception e) {
			
		}
		
		thorns += new SpecialEffect().a2(player, thorns);
		thorns += new SpecialEffect().a3(player, thorns);
		thorns += new SpecialEffect().a4(player, thorns);
		thorns += new SpecialEffect().a5(player, thorns);
		thorns += new SpecialEffect().a6(player, thorns);
		
		return thorns;
	}
	
}
