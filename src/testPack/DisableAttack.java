package testPack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DisableAttack {

	public boolean disable(Player player) {
		if (player.getInventory().contains(Material.RED_DYE)
				&& (player.getInventory().getItemInMainHand().getType() == Material.WOODEN_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.IRON_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.GOLDEN_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.DIAMOND_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.NETHERITE_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.OAK_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.COBBLESTONE_WALL
						|| player.getInventory().getItemInMainHand().getType() == Material.MOSSY_COBBLESTONE_WALL
						|| player.getInventory().getItemInMainHand().getType() == Material.BROWN_CARPET
						|| player.getInventory().getItemInMainHand().getType() == Material.GREEN_CARPET
						|| player.getInventory().getItemInMainHand().getType() == Material.BLACK_CARPET
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE
						|| player.getInventory().getItemInMainHand().getType() == Material.OAK_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.BEDROCK
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CHISELED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CUT_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.LAPIS_BLOCK
						|| player.getInventory().getItemInMainHand().getType() == Material.MAGENTA_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.LIME_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.GRAY_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.LIGHT_GRAY_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.CYAN_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.PURPLE_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.OAK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.COBBLESTONE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_BRICK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.NETHER_BRICK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.QUARTZ_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.RED_SANDSTONE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.SMOOTH_RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.OBSIDIAN
						|| player.getInventory().getItemInMainHand().getType() == Material.SMOOTH_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CHISELED_RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CUT_RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.RED_SANDSTONE_STAIRS
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_STAIRS)) {
			return false;
		}
		if (player.getInventory().contains(Material.MAGENTA_DYE)
				&& (player.getInventory().getItemInMainHand().getType() == Material.WOODEN_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.IRON_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.GOLDEN_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.DIAMOND_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.NETHERITE_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.OAK_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.COBBLESTONE_WALL
						|| player.getInventory().getItemInMainHand().getType() == Material.MOSSY_COBBLESTONE_WALL
						|| player.getInventory().getItemInMainHand().getType() == Material.BROWN_CARPET
						|| player.getInventory().getItemInMainHand().getType() == Material.GREEN_CARPET
						|| player.getInventory().getItemInMainHand().getType() == Material.BLACK_CARPET
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE
						|| player.getInventory().getItemInMainHand().getType() == Material.OAK_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.BEDROCK
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CHISELED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CUT_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.LAPIS_BLOCK
						|| player.getInventory().getItemInMainHand().getType() == Material.MAGENTA_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.LIME_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.GRAY_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.LIGHT_GRAY_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.CYAN_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.PURPLE_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.OAK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.COBBLESTONE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_BRICK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.NETHER_BRICK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.QUARTZ_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.RED_SANDSTONE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.SMOOTH_RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.OBSIDIAN
						|| player.getInventory().getItemInMainHand().getType() == Material.SMOOTH_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CHISELED_RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CUT_RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.RED_SANDSTONE_STAIRS
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_STAIRS)) {
			return false;
		}
		if (player.getInventory().contains(Material.ORANGE_DYE)
				&& (player.getInventory().getItemInMainHand().getType() == Material.WOODEN_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.IRON_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.GOLDEN_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.DIAMOND_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.NETHERITE_SWORD
						|| player.getInventory().getItemInMainHand().getType() == Material.OAK_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_LEAVES
						|| player.getInventory().getItemInMainHand().getType() == Material.COBBLESTONE_WALL
						|| player.getInventory().getItemInMainHand().getType() == Material.MOSSY_COBBLESTONE_WALL
						|| player.getInventory().getItemInMainHand().getType() == Material.BROWN_CARPET
						|| player.getInventory().getItemInMainHand().getType() == Material.GREEN_CARPET
						|| player.getInventory().getItemInMainHand().getType() == Material.BLACK_CARPET
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE
						|| player.getInventory().getItemInMainHand().getType() == Material.OAK_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_PLANKS
						|| player.getInventory().getItemInMainHand().getType() == Material.BEDROCK
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_LOG
						|| player.getInventory().getItemInMainHand().getType() == Material.SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CHISELED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CUT_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.LAPIS_BLOCK
						|| player.getInventory().getItemInMainHand().getType() == Material.MAGENTA_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.LIME_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.GRAY_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.LIGHT_GRAY_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.CYAN_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.PURPLE_WOOL
						|| player.getInventory().getItemInMainHand().getType() == Material.OAK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.SPRUCE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.BIRCH_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.JUNGLE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.ACACIA_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.DARK_OAK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.COBBLESTONE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_BRICK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.NETHER_BRICK_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.QUARTZ_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.RED_SANDSTONE_SLAB
						|| player.getInventory().getItemInMainHand().getType() == Material.SMOOTH_RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.OBSIDIAN
						|| player.getInventory().getItemInMainHand().getType() == Material.SMOOTH_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CHISELED_RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.CUT_RED_SANDSTONE
						|| player.getInventory().getItemInMainHand().getType() == Material.RED_SANDSTONE_STAIRS
						|| player.getInventory().getItemInMainHand().getType() == Material.STONE_STAIRS)) {
			return false;
		}
	
		return true;
	}
	
}
