package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Husk;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Salmon;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.util.Vector;

public class Skill {

	Random rnd = new Random();
	private int sleep = 0;
	private int sleep2 = 0;
	
	GolemOwner go = new GolemOwner();

	public void effect(Player player) {
		
		try {
			ItemStack item = player.getInventory().getItemInMainHand();
			if(!(item.getType() == Material.LEATHER_HELMET || item.getType() == Material.LEATHER_CHESTPLATE || item.getType() == Material.LEATHER_LEGGINGS
					|| item.getType() == Material.LEATHER_BOOTS || item.getType() == Material.CHAINMAIL_HELMET || item.getType() == Material.CHAINMAIL_CHESTPLATE 
					|| item.getType() == Material.CHAINMAIL_LEGGINGS || item.getType() == Material.CHAINMAIL_BOOTS || item.getType() == Material.IRON_HELMET 
					|| item.getType() == Material.IRON_CHESTPLATE || item.getType() == Material.IRON_LEGGINGS || item.getType() == Material.IRON_BOOTS 
					|| item.getType() == Material.GOLDEN_HELMET || item.getType() == Material.GOLDEN_CHESTPLATE || item.getType() == Material.GOLDEN_LEGGINGS 
					|| item.getType() == Material.GOLDEN_BOOTS || item.getType() == Material.DIAMOND_HELMET || item.getType() == Material.DIAMOND_CHESTPLATE 
					|| item.getType() == Material.DIAMOND_LEGGINGS || item.getType() == Material.DIAMOND_BOOTS || item.getType() == Material.NETHERITE_HELMET 
					|| item.getType() == Material.NETHERITE_CHESTPLATE || item.getType() == Material.NETHERITE_LEGGINGS || item.getType() == Material.NETHERITE_BOOTS)) {
				LimitLevel la = new LimitLevel();
				if(la.limit(player, item) == false) {
					player.sendMessage(ChatColor.RED + "아직 이 무기를 다루기에는 내 힘이 부족하다.");
					return;
				}
			}
		} catch(Exception e) {
			
		}	
		
		ItemStack mainHand = player.getInventory().getItemInMainHand();
		if (player.getInventory().contains(Material.RED_DYE)
				&& player.getInventory().getItemInMainHand().getType() == Material.BONE) {
			skill1(player);
		}
		if (player.getInventory().contains(Material.GREEN_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill2(player);
		}
		if (player.getInventory().contains(Material.LAPIS_LAZULI)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill3(player);
		}
		if (player.getInventory().contains(Material.CYAN_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill4(player);
		}
		if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill5(player);
		}
		if (player.getInventory().contains(Material.GRAY_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill6(player);
		}
		if (player.getInventory().contains(Material.PINK_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill7(player);
		}
		if (player.getInventory().contains(Material.LIME_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill8(player);
		}
		if (player.getInventory().contains(Material.YELLOW_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill9(player);
		}
		if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill10(player);
		}
		if (player.getInventory().contains(Material.MAGENTA_DYE)
				&& (mainHand.getType() == Material.WOODEN_PICKAXE
						|| mainHand.getType() == Material.STONE_PICKAXE
						|| mainHand.getType() == Material.IRON_PICKAXE
						|| mainHand.getType() == Material.GOLDEN_PICKAXE
						|| mainHand.getType() == Material.DIAMOND_PICKAXE
						|| mainHand.getType() == Material.NETHERITE_PICKAXE)) {
			skill11(player);
		}
		if (player.getInventory().contains(Material.ORANGE_DYE)
				&& (mainHand.getType() == Material.WOODEN_HOE
						|| mainHand.getType() == Material.STONE_HOE
						|| mainHand.getType() == Material.IRON_HOE
						|| mainHand.getType() == Material.GOLDEN_HOE
						|| mainHand.getType() == Material.DIAMOND_HOE
						|| mainHand.getType() == Material.NETHERITE_HOE)) {
			skill12(player);
		}		
		if (player.getInventory().contains(Material.BROWN_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill14(player);
		}			
		
		if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
			ItemStack item = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.RED + "마나없음");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
		}
	}

	public void effect(Player player, String key) {
		
		try {
			ItemStack item = player.getInventory().getItemInMainHand();
			if(!(item.getType() == Material.LEATHER_HELMET || item.getType() == Material.LEATHER_CHESTPLATE || item.getType() == Material.LEATHER_LEGGINGS
					|| item.getType() == Material.LEATHER_BOOTS || item.getType() == Material.CHAINMAIL_HELMET || item.getType() == Material.CHAINMAIL_CHESTPLATE 
					|| item.getType() == Material.CHAINMAIL_LEGGINGS || item.getType() == Material.CHAINMAIL_BOOTS || item.getType() == Material.IRON_HELMET 
					|| item.getType() == Material.IRON_CHESTPLATE || item.getType() == Material.IRON_LEGGINGS || item.getType() == Material.IRON_BOOTS 
					|| item.getType() == Material.GOLDEN_HELMET || item.getType() == Material.GOLDEN_CHESTPLATE || item.getType() == Material.GOLDEN_LEGGINGS 
					|| item.getType() == Material.GOLDEN_BOOTS || item.getType() == Material.DIAMOND_HELMET || item.getType() == Material.DIAMOND_CHESTPLATE 
					|| item.getType() == Material.DIAMOND_LEGGINGS || item.getType() == Material.DIAMOND_BOOTS || item.getType() == Material.NETHERITE_HELMET 
					|| item.getType() == Material.NETHERITE_CHESTPLATE || item.getType() == Material.NETHERITE_LEGGINGS || item.getType() == Material.NETHERITE_BOOTS)) {
				LimitLevel la = new LimitLevel();
				if(la.limit(player, item) == false) {
					player.sendMessage(ChatColor.RED + "아직 이 무기를 다루기에는 내 힘이 부족하다.");
					return;
				}
			}
		} catch(Exception e) {
			
		}
		
		ItemStack mainHand = player.getInventory().getItemInMainHand();
		if (player.getInventory().contains(Material.CLAY_BALL)) {
			if (mainHand.getType() == Material.DEAD_BRAIN_CORAL_BLOCK 
					|| mainHand.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_FIRE_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_HORN_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_TUBE_CORAL_BLOCK) {
				skill17(player, key);
			}
		}
		if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
			if (mainHand.getType() == Material.DEAD_BRAIN_CORAL_BLOCK 
					|| mainHand.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_FIRE_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_HORN_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_TUBE_CORAL_BLOCK) {
				skill18(player, key);
			}
		}
		if (player.getInventory().contains(Material.BLUE_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill13(player, key);
		}
		if (player.getInventory().contains(Material.BLACK_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill15(player, key);
		}
		
		if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
			ItemStack item = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.RED + "마나없음");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
		}
	}
	
	public void leftEffect(Player player) {
		
		try {
			ItemStack item = player.getInventory().getItemInMainHand();
			if(!(item.getType() == Material.LEATHER_HELMET || item.getType() == Material.LEATHER_CHESTPLATE || item.getType() == Material.LEATHER_LEGGINGS
					|| item.getType() == Material.LEATHER_BOOTS || item.getType() == Material.CHAINMAIL_HELMET || item.getType() == Material.CHAINMAIL_CHESTPLATE 
					|| item.getType() == Material.CHAINMAIL_LEGGINGS || item.getType() == Material.CHAINMAIL_BOOTS || item.getType() == Material.IRON_HELMET 
					|| item.getType() == Material.IRON_CHESTPLATE || item.getType() == Material.IRON_LEGGINGS || item.getType() == Material.IRON_BOOTS 
					|| item.getType() == Material.GOLDEN_HELMET || item.getType() == Material.GOLDEN_CHESTPLATE || item.getType() == Material.GOLDEN_LEGGINGS 
					|| item.getType() == Material.GOLDEN_BOOTS || item.getType() == Material.DIAMOND_HELMET || item.getType() == Material.DIAMOND_CHESTPLATE 
					|| item.getType() == Material.DIAMOND_LEGGINGS || item.getType() == Material.DIAMOND_BOOTS || item.getType() == Material.NETHERITE_HELMET 
					|| item.getType() == Material.NETHERITE_CHESTPLATE || item.getType() == Material.NETHERITE_LEGGINGS || item.getType() == Material.NETHERITE_BOOTS)) {
				LimitLevel la = new LimitLevel();
				if(la.limit(player, item) == false) {
					player.sendMessage(ChatColor.RED + "아직 이 무기를 다루기에는 내 힘이 부족하다.");
					return;
				}
			}
		} catch(Exception e) {
			
		}
		
		ItemStack mainHand = player.getInventory().getItemInMainHand();	
		if (player.getInventory().contains(Material.INK_SAC)
				&& (mainHand.getType() == Material.BRAIN_CORAL_BLOCK 
				|| mainHand.getType() == Material.HORN_CORAL_BLOCK 
				|| mainHand.getType() == Material.TUBE_CORAL_BLOCK 
				|| mainHand.getType() == Material.BUBBLE_CORAL_BLOCK 
				|| mainHand.getType() == Material.FIRE_CORAL_BLOCK)) {
			skill16(player);
		}
		if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
			ItemStack item = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.RED + "마나없음");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
		}
	}
	
	public void skill1(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "본 파이터의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				int num = player.getLevel();
				Location loc = player.getLocation();
				List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() != EntityType.PLAYER) {
						if (nearEntity instanceof LivingEntity) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							nearMob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 32700));
							nearMob.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 140));
							nearMob.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 32700));
						}
					}
				}
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE2();
				// ================================================================
				player.sendMessage(ChatColor.GREEN + "[스킬]뼈감옥을 발동합니다.");
				player.sendMessage(ChatColor.GREEN + "10초간 적의 움직임을 멈춥니다.");
				world.playSound(loc, Sound.ENTITY_WOLF_SHAKE, 1.0f, 1.0f);
			} else if (i > 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				int num = player.getLevel();
				Location loc = player.getLocation();
				world.playEffect(loc, Effect.MOBSPAWNER_FLAMES, 1);
				world.playEffect(loc.add(1, 0, 0), Effect.MOBSPAWNER_FLAMES, 1);
				world.playEffect(loc.add(1, 0, 1), Effect.MOBSPAWNER_FLAMES, 1);
				world.playEffect(loc.add(-1, 0, 0), Effect.MOBSPAWNER_FLAMES, 1);
				world.playEffect(loc.add(-1, 0, 1), Effect.MOBSPAWNER_FLAMES, 1);
				world.playEffect(loc.add(1, 0, -1), Effect.MOBSPAWNER_FLAMES, 1);
				world.playEffect(loc.add(0, 0, -1), Effect.MOBSPAWNER_FLAMES, 1);
				world.playEffect(loc.add(0, 0, 1), Effect.MOBSPAWNER_FLAMES, 1);
				world.playEffect(loc.add(-1, 0, -1), Effect.MOBSPAWNER_FLAMES, 1);
				player.sendMessage(ChatColor.GREEN + "[스킬]본 체스트을 발동합니다.");
				if (num < 15) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 0,true,false,false));
				} else if (num < 30) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 150, 0,true,false,false));
				} else if (num < 45) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 0,true,false,false));
				} else if (num < 60) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 1,true,false,false));
				} else if (num < 75) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 150, 1,true,false,false));
				} else if (num < 90) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1,true,false,false));
				} else {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 2,true,false,false));
				}
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE1();
				// ================================================================
				world.playSound(loc, Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill2(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "기사의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				Location loc = player.getLocation();
				IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
				golem.setCustomName(ChatColor.GRAY + "디바인 나이트" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
				golem.setCustomNameVisible(true);
				((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 5) * 2);
				((LivingEntity) golem).setHealth((20 + player.getLevel() * 5) * 2);
				if (player.getLevel() >= 30) {
					int num = (player.getLevel() / 10);
					golem.addPotionEffect(
							new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, num - 3));
				} else if ((player.getLevel() / 10) == 1) {
					golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
				} else if ((player.getLevel() / 10) == 0) {
					golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 1));
				}
				golem.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, Integer.MAX_VALUE, 0));
				golem.setPlayerCreated(true);
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE3();
				// ================================================================
				world.playEffect(loc, Effect.SMOKE, 0);
				world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
				player.sendMessage(ChatColor.GREEN + "[스킬]디바인 링크가 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "디바인 나이트가 소환됩니다. 레벨: " + player.getLevel() + " " + "최대체력: "
						+ (int) ((20 + player.getLevel() * 5) * 2));
				List<Entity> entitylist = player.getNearbyEntities(10, 10, 10);
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob && (nearEntity.getType() != EntityType.IRON_GOLEM)) {
						if (nearEntity instanceof Zombie) {
							Zombie zombie = (Zombie) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof Skeleton) {
							Skeleton zombie = (Skeleton) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof WitherSkeleton) {
							WitherSkeleton zombie = (WitherSkeleton) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof Drowned) {
							WitherSkeleton zombie = (WitherSkeleton) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof Husk) {
							WitherSkeleton zombie = (WitherSkeleton) nearEntity;
							zombie.setTarget(golem);
						}
					}
				}
				go.put(golem.getUniqueId(), player);
						
			} else if (i > 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = player.getLocation();
				IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
				golem.setCustomName(ChatColor.GRAY + "팬텀 나이트" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
				golem.setCustomNameVisible(true);
				((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 5));
				((LivingEntity) golem).setHealth((20 + player.getLevel() * 5));
				if (player.getLevel() >= 40) {
					int num = (player.getLevel() / 10);
					golem.addPotionEffect(
							new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, num - 4));
				} else if ((player.getLevel() / 10) == 2) {
					golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
				} else if ((player.getLevel() / 10) == 1) {
					golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 1));
				} else if ((player.getLevel() / 10) == 0) {
					golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 2));
				}
				golem.setPlayerCreated(true);
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE4();
				// ================================================================
				world.playEffect(loc, Effect.SMOKE, 0);
				world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
				player.sendMessage(ChatColor.GREEN + "[스킬]증원이 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "펜텀 나이트가 소환됩니다. 레벨: " + player.getLevel() + " " + "최대체력: "
						+ (20 + player.getLevel() * 5));
				List<Entity> entitylist = player.getNearbyEntities(10, 10, 10);
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob && (nearEntity.getType() != EntityType.IRON_GOLEM)) {
						if (nearEntity instanceof Zombie) {
							Zombie zombie = (Zombie) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof Skeleton) {
							Skeleton zombie = (Skeleton) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof WitherSkeleton) {
							WitherSkeleton zombie = (WitherSkeleton) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof Drowned) {
							WitherSkeleton zombie = (WitherSkeleton) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof Husk) {
							WitherSkeleton zombie = (WitherSkeleton) nearEntity;
							zombie.setTarget(golem);
						}
					}
				}
				go.put(golem.getUniqueId(), player);

			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill3(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "프리스트의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearPlayer = (Player) nearEntity;
						int addHealth = (int) (player.getMaxHealth() * 20 / 100);
						if (nearPlayer.getHealth() + addHealth <= nearPlayer.getMaxHealth()) {
							nearPlayer.setHealth(nearPlayer.getHealth() + addHealth);
						} else {
							nearPlayer.setHealth(nearPlayer.getMaxHealth());
						}
						nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다.");
					}
				}
				if (player.getHealth() < player.getMaxHealth() * 10 / 100) {
					player.setHealth(player.getMaxHealth());
					Location loc = player.getLocation();
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE6();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]죽은 자의 소생이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "주변 아군의 체력이 회복됩니다.");
					player.sendMessage(ChatColor.GREEN + "체력이 모두 회복되었습니다.");
				} else {
					int addHealth = (int) (player.getMaxHealth() * 20 / 100);
					if (player.getHealth() + addHealth <= player.getMaxHealth()) {
						player.setHealth(player.getHealth() + addHealth);
					} else {
						player.setHealth(player.getMaxHealth());
					}
					Location loc = player.getLocation();
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE5();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]성스러운 힘이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다.");
				}
			} else if (i > 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearPlayer = (Player) nearEntity;
						int addHealth = (int) (player.getMaxHealth() * 20 / 100);
						if (nearPlayer.getHealth() + addHealth <= nearPlayer.getMaxHealth()) {
							nearPlayer.setHealth(nearPlayer.getHealth() + addHealth);
						} else {
							nearPlayer.setHealth(nearPlayer.getMaxHealth());
						}
						nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다.");
					}
				}
				int addHealth = (int) (player.getMaxHealth() * 20 / 100);
				if (player.getHealth() + addHealth <= player.getMaxHealth()) {
					player.setHealth(player.getHealth() + addHealth);
				} else {
					player.setHealth(player.getMaxHealth());
				}
				Location loc = player.getLocation();
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE5();
				// ================================================================
				world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
				player.sendMessage(ChatColor.GREEN + "[스킬]성스러운 힘이 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다.");
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill4(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "광전사의 증표"))) {
			int damNum = 0;
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
				damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 0,true,false,false));
				List<Entity> entitylist1 = player.getNearbyEntities(5, 5, 5);
				List<Entity> entitylist2 = player.getNearbyEntities(10, 10, 10);
				int num = 0;
				for (Entity nearEntity : entitylist1) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearPlayer = (Player) nearEntity;
						num++;
					}
				}
				if (num != 0) {
					Location loc = player.getLocation();
					for (Entity nearEntity : entitylist2) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.damage(player.getLevel() + damNum*4);
							}
						}
					}
					world.playEffect(loc, Effect.END_GATEWAY_SPAWN, 0);
					player.sendMessage(ChatColor.GREEN + "[스킬]메그니피센트가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "넓은 지역의 몬스터에게 피해를 줍니다.");
				} else {
					Location loc = player.getLocation();
					for (Entity nearEntity : entitylist1) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.damage(player.getLevel() + damNum*3);								
							}
						}
					}
					world.playEffect(loc, Effect.END_GATEWAY_SPAWN, 0);
					player.sendMessage(ChatColor.GREEN + "[스킬]파이널 히트가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "주변의 몬스터에게 피해를 줍니다.");
				}
			} else if (i > 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 0,true,false,false));
				Location loc = player.getLocation();
				List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() != EntityType.PLAYER) {
						if (nearEntity instanceof LivingEntity) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							nearMob.damage(player.getLevel() + damNum*3);
						}
					}
				}
				world.playEffect(loc, Effect.END_GATEWAY_SPAWN, 0);
				player.sendMessage(ChatColor.GREEN + "[스킬]파이널 히트가 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "주변의 몬스터에게 피해를 줍니다.");
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill5(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "도박사의 증표"))) {			
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				int num = rnd.nextInt(31);
				Location loc = player.getLocation();
				player.sendMessage(ChatColor.GREEN + "[스킬]무조건 이기는 판이 발동됩니다.");
				// ===============================================================
				ParticleData pd2 = new ParticleData(player.getUniqueId());
				if (pd2.hasID()) {
					pd2.endTask();
					pd2.removeID();
				}
				ParticleEffect pe2 = new ParticleEffect(player);
				pe2.startE8();
				// ================================================================
				world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
				Thread t = new Thread(player.getUniqueId());
				sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;

					@Override
					public void run() {
						if (!t.hasID()) {
							t.setID(sleep);
						}

						if (time >= 20) {
							if (num == 0) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 4));
							} else if (num == 1) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 5));
							} else if (num == 2) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 6));
							} else if (num == 3) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 7));
							} else if (num == 4) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 8));
							} else if (num == 5) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 9));
							} else if (num == 6) {
								player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 0));
							} else if (num == 7) {
								player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 1));
							} else if (num == 8) {
								player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 2));
							} else if (num == 9) {
								player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 3));
							} else if (num == 10) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1));
							} else if (num == 11) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 2));
							} else if (num == 12) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 3));
							} else if (num == 13) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 4));
							} else if (num == 14) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 5));
							} else if (num == 15) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 6));
							} else if (num == 16) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 7));
							} else if (num == 17) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 8));
							} else if (num == 18) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 9));
							} else if (num == 19) {
								player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1));
							} else if (num == 20) {
								player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
							} else if (num == 21) {
								player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 3));
							} else if (num == 22) {
								player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 4));
							} else if (num == 23) {
								player.sendMessage("체력이 조정됩니다.(100%)");
								player.setHealth(player.getMaxHealth());
							} else if (num == 24) {
								player.sendMessage("체력이 조정됩니다.(50%)");
								player.setHealth(player.getMaxHealth() / 2);
							} else if (num == 25) {
								player.sendMessage(ChatColor.GREEN + "[스킬]파이널 히트가 발동됩니다.");
								player.sendMessage(ChatColor.GREEN + "주변의 몬스터에게 피해를 줍니다.");
								List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.damage(player.getLevel()*50);
										}
									}
								}
								world.playEffect(loc, Effect.END_GATEWAY_SPAWN, 0);
							} else if (num == 26) {
								player.sendMessage(ChatColor.GREEN + "[스킬]성스러운 힘이 발동됩니다.");
								List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() == EntityType.PLAYER) {
										Player nearPlayer = (Player) nearEntity;
										int addHealth = (int) (player.getMaxHealth() * 20 / 100);
										if (nearPlayer.getHealth() + addHealth <= nearPlayer.getMaxHealth()) {
											nearPlayer.setHealth(nearPlayer.getHealth() + addHealth);
										} else {
											nearPlayer.setHealth(nearPlayer.getMaxHealth());
										}
										nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다.");
									}
								}
								int addHealth = (int) (player.getMaxHealth() * 20 / 100);
								if (player.getHealth() + addHealth <= player.getMaxHealth()) {
									player.setHealth(player.getHealth() + addHealth);
								} else {
									player.setHealth(player.getMaxHealth());
								}
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player);
								pe.startE5();
								// ================================================================
								world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
								player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다.");
							} else if (num == 27) {
								player.sendMessage(ChatColor.GREEN + "[스킬]증원이 발동됩니다.");
								IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
								golem.setCustomName(ChatColor.GRAY + "팬텀 나이트" + ChatColor.YELLOW + " [Lv."
										+ player.getLevel() + "]");
								golem.setCustomNameVisible(true);
								golem.setPlayerCreated(true);
								((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 10));
								((LivingEntity) golem).setHealth((20 + player.getLevel() * 10));
								if (player.getLevel() >= 60) {
									int num = (player.getLevel() / 10);
									golem.addPotionEffect(
											new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, num - 6));
								} else if ((player.getLevel() / 10) == 4) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
								} else if ((player.getLevel() / 10) == 3) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 1));
								} else if ((player.getLevel() / 10) == 2) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 2));
								} else if ((player.getLevel() / 10) == 1) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 3));
								} else if ((player.getLevel() / 10) == 0) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 4));
								}
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player);
								pe.startE4();
								// ================================================================
								world.playEffect(loc, Effect.SMOKE, 0);
								world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
								player.sendMessage(ChatColor.GREEN + "펜텀 나이트가 소환됩니다. 레벨: " + player.getLevel() + " "
										+ "최대체력: " + (20 + player.getLevel() * 10));								
								go.put(golem.getUniqueId(), player);
							} else if (num == 28) {
								player.sendMessage(ChatColor.GREEN + "[스킬]본 체스트가 발동됩니다.");
								world.playEffect(loc, Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(1, 0, 0), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(1, 0, 1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(-1, 0, 0), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(-1, 0, 1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(1, 0, -1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(0, 0, -1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(0, 0, 1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(-1, 0, -1), Effect.MOBSPAWNER_FLAMES, 1);
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 2,true,false,false));
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player);
								pe.startE1();
								// ================================================================
								world.playSound(loc, Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
							} else if (num == 29) {
								List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() == EntityType.PLAYER) {
										Player nearPlayer = (Player) nearEntity;
										int addHealth = (int) (player.getMaxHealth() * 20 / 100);
										if (nearPlayer.getHealth() + addHealth <= nearPlayer.getMaxHealth()) {
											nearPlayer.setHealth(nearPlayer.getHealth() + addHealth);
										} else {
											nearPlayer.setHealth(nearPlayer.getMaxHealth());
										}
										nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다.");
									}
								}
								if (player.getHealth() < player.getMaxHealth() * 10 / 100) {
									player.setHealth(player.getMaxHealth());
									Location ploc = player.getLocation();
									// ===============================================================
									ParticleData pd = new ParticleData(player.getUniqueId());
									if (pd.hasID()) {
										pd.endTask();
										pd.removeID();
									}
									ParticleEffect pe = new ParticleEffect(player);
									pe.startE6();
									// ================================================================
									world.playSound(loc, Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
									player.sendMessage(ChatColor.GREEN + "[스킬]버티기가 발동됩니다.");
									player.sendMessage(ChatColor.GREEN + "주변 아군의 체력이 회복됩니다.");
									player.sendMessage(ChatColor.GREEN + "체력이 모두 회복되었습니다.");
								} else {
									int addHealth = (int) (player.getMaxHealth() * 20 / 100);
									if (player.getHealth() + addHealth <= player.getMaxHealth()) {
										player.setHealth(player.getHealth() + addHealth);
									} else {
										player.setHealth(player.getMaxHealth());
									}
									Location ploc = player.getLocation();
									// ===============================================================
									ParticleData pd = new ParticleData(player.getUniqueId());
									if (pd.hasID()) {
										pd.endTask();
										pd.removeID();
									}
									ParticleEffect pe = new ParticleEffect(player);
									pe.startE5();
									// ================================================================
									world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
									player.sendMessage(ChatColor.GREEN + "[스킬]성스러운 힘이 발동됩니다.");
									player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다.");
								}
							} else if (num == 30) {
								int num2 = player.getLevel();
								Location ploc = player.getLocation();
								List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.addPotionEffect(
													new PotionEffect(PotionEffectType.SLOW, 200, 32700));
											nearMob.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 140));
											nearMob.addPotionEffect(
													new PotionEffect(PotionEffectType.WEAKNESS, 200, 32700));
										}
									}
								}
								player.sendMessage(ChatColor.GREEN + "[스킬]뼈감옥을 발동합니다.");
								player.sendMessage(ChatColor.GREEN + "10초간 적의 움직임을 멈춥니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player);
								pe.startE2();
								// ================================================================
								world.playSound(loc, Sound.ENTITY_WOLF_SHAKE, 1.0f, 1.0f);
							} else {
								player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
								world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
							}
							world.playEffect(loc, Effect.POTION_BREAK, 0);
							t.endTask();
							t.removeID();
						}
						time++;
					}
				}, 0, 1);
			} else if (i > 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				int num = rnd.nextInt(80);
				Location loc = player.getLocation();
				player.sendMessage(ChatColor.GREEN + "[스킬]도박사의 판이 발동됩니다.");
				// ===============================================================
				ParticleData pd2 = new ParticleData(player.getUniqueId());
				if (pd2.hasID()) {
					pd2.endTask();
					pd2.removeID();
				}
				ParticleEffect pe2 = new ParticleEffect(player);
				pe2.startE7();
				// ================================================================
				world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
				Thread t = new Thread(player.getUniqueId());
				sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;

					@Override
					public void run() {
						if (!t.hasID()) {
							t.setID(sleep);
						}

						if (time >= 20) {
							if (num == 0) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 0));
							} else if (num == 1) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 1));
							} else if (num == 2) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 2));
							} else if (num == 3) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 3));
							} else if (num == 4) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 4));
							} else if (num == 5) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 5));
							} else if (num == 6) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 6));
							} else if (num == 7) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 7));
							} else if (num == 8) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 8));
							} else if (num == 9) {
								player.sendMessage(ChatColor.GREEN + "추가체력이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 9));
							} else if (num == 10) {
								player.sendMessage(ChatColor.RED + "실명이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 0));
							} else if (num == 11) {
								player.sendMessage(ChatColor.RED + "실명이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 1));
							} else if (num == 12) {
								player.sendMessage(ChatColor.RED + "실명이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 2));
							} else if (num == 13) {
								player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 0));
							} else if (num == 14) {
								player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 1));
							} else if (num == 15) {
								player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 2));
							} else if (num == 16) {
								player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 3));
							} else if (num == 17) {
								player.sendMessage(ChatColor.GREEN + "야간투시가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 9));
							} else if (num == 18) {
								player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 0));
							} else if (num == 19) {
								player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1));
							} else if (num == 20) {
								player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 2));
							} else if (num == 21) {
								player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 3));
							} else if (num == 22) {
								player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 4));
							} else if (num == 23) {
								player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 5));
							} else if (num == 24) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 0));
							} else if (num == 25) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1));
							} else if (num == 26) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 2));
							} else if (num == 27) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 3));
							} else if (num == 28) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 4));
							} else if (num == 29) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 5));
							} else if (num == 30) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 6));
							} else if (num == 31) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 7));
							} else if (num == 32) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 8));
							} else if (num == 33) {
								player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 9));
							} else if (num == 34) {
								player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 0));
							} else if (num == 35) {
								player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 1));
							} else if (num == 36) {
								player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 2));
							} else if (num == 37) {
								player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 3));
							} else if (num == 38) {
								player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 4));
							} else if (num == 39) {
								player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 0));
							} else if (num == 40) {
								player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1));
							} else if (num == 41) {
								player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
							} else if (num == 42) {
								player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 3));
							} else if (num == 43) {
								player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 4));
							} else if (num == 44) {
								player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 0));
							} else if (num == 45) {
								player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 1));
							} else if (num == 46) {
								player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 2));
							} else if (num == 47) {
								player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 3));
							} else if (num == 48) {
								player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
								player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 4));
							} else if (num == 49) {
								player.sendMessage(ChatColor.RED + "경험치가 소실됩니다.");
								player.setExp(0);
							} else if (num == 50) {
								player.sendMessage("체력이 조정됩니다.(100%)");
								player.setHealth(player.getMaxHealth());
							} else if (num == 51) {
								player.sendMessage("체력이 조정됩니다.(50%)");
								player.setHealth(player.getMaxHealth() / 2);
							} else if (num == 52) {
								player.sendMessage("체력이 조정됩니다.(33%)");
								player.setHealth(player.getMaxHealth() / 3);
							} else if (num == 53) {
								player.sendMessage("체력이 조정됩니다.(25%)");
								player.setHealth(player.getMaxHealth() / 4);
							} else if (num == 54) {
								player.sendMessage("체력이 조정됩니다.(20%)");
								player.setHealth(player.getMaxHealth() / 5);
							} else if (num == 55) {
								player.sendMessage("체력이 조정됩니다.(10%)");
								player.setHealth(player.getMaxHealth() / 10);
							} else if (num == 56) {
								player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
								world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
							} else if (num == 57) {
								player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
								world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
							} else if (num == 58) {
								player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
								world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
							} else if (num == 59) {
								player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
								world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
							} else if (num == 60) {
								player.sendMessage(ChatColor.GREEN + "[스킬]파이널 히트가 발동됩니다.");
								player.sendMessage(ChatColor.GREEN + "주변의 몬스터에게 피해를 줍니다.");
								List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.damage(player.getLevel()*15);
										}
									}
								}
								world.playEffect(loc, Effect.END_GATEWAY_SPAWN, 0);
							} else if (num == 61) {
								player.sendMessage(ChatColor.GREEN + "[스킬]성스러운 힘이 발동됩니다.");
								List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() == EntityType.PLAYER) {
										Player nearPlayer = (Player) nearEntity;
										int addHealth = (int) (player.getMaxHealth() * 20 / 100);
										if (nearPlayer.getHealth() + addHealth <= nearPlayer.getMaxHealth()) {
											nearPlayer.setHealth(nearPlayer.getHealth() + addHealth);
										} else {
											nearPlayer.setHealth(nearPlayer.getMaxHealth());
										}
										nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다.");
									}
								}
								int addHealth = (int) (player.getMaxHealth() * 20 / 100);
								if (player.getHealth() + addHealth <= player.getMaxHealth()) {
									player.setHealth(player.getHealth() + addHealth);
								} else {
									player.setHealth(player.getMaxHealth());
								}
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player);
								pe.startE5();
								// ================================================================
								world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
								player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다.");
							} else if (num == 62) {
								player.sendMessage(ChatColor.GREEN + "[스킬]증원이 발동됩니다.");
								IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
								golem.setCustomName(ChatColor.GRAY + "팬텀 나이트" + ChatColor.YELLOW + " [Lv."
										+ player.getLevel() + "]");
								golem.setCustomNameVisible(true);
								golem.setPlayerCreated(true);
								((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 10));
								((LivingEntity) golem).setHealth((20 + player.getLevel() * 10));
								if (player.getLevel() >= 60) {
									int num = (player.getLevel() / 10);
									golem.addPotionEffect(
											new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, num - 6));
								} else if ((player.getLevel() / 10) == 4) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 0));
								} else if ((player.getLevel() / 10) == 3) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 1));
								} else if ((player.getLevel() / 10) == 2) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 2));
								} else if ((player.getLevel() / 10) == 1) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 3));
								} else if ((player.getLevel() / 10) == 0) {
									golem.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 4));
								}
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player);
								pe.startE4();
								// ================================================================
								world.playEffect(loc, Effect.SMOKE, 0);
								world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
								player.sendMessage(ChatColor.GREEN + "펜텀 나이트가 소환됩니다. 레벨: " + player.getLevel() + " "
										+ "최대체력: " + (20 + player.getLevel() * 10));								
								go.put(golem.getUniqueId(), player);
							} else if (num == 63) {
								player.sendMessage(ChatColor.GREEN + "[스킬]본 체스트가 발동됩니다.");
								world.playEffect(loc, Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(1, 0, 0), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(1, 0, 1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(-1, 0, 0), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(-1, 0, 1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(1, 0, -1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(0, 0, -1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(0, 0, 1), Effect.MOBSPAWNER_FLAMES, 1);
								world.playEffect(loc.add(-1, 0, -1), Effect.MOBSPAWNER_FLAMES, 1);
								player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 2,true,false,false));
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player);
								pe.startE1();
								// ================================================================
								world.playSound(loc, Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
							} else if (num == 64) {
								player.sendMessage("마나를 1획득합니다.");
								ItemStack mana = new ItemStack(Material.HEART_OF_THE_SEA);
								ItemMeta manaIm = mana.getItemMeta();
								manaIm.setDisplayName(ChatColor.BLUE + "마나");
								mana.setItemMeta(manaIm);
								if (player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
									int _ = 0;
									for (ItemStack is : player.getInventory().getContents()) {
										if (is == null)
											continue;
										if (is.getType() == Material.HEART_OF_THE_SEA) {
											_ = _ + is.getAmount();
										}
									}
									if (_ < 20)
										player.getInventory().addItem(mana);
								} else {
									player.getInventory().setItem(8, mana);
								}
							} else if (num == 65) {
								player.sendMessage(ChatColor.GREEN + "에메랄드를 1개 획득합니다.");
								player.getInventory().addItem(new ItemStack(Material.EMERALD));
							} else if (num == 66) {
								player.sendMessage(ChatColor.GREEN + "에메랄드를 10개 획득합니다.");
								player.getInventory().addItem(new ItemStack(Material.EMERALD, 10));
							} else if (num == 67) {
								player.sendMessage(ChatColor.GREEN + "에메랄드를 20개 획득합니다.");
								player.getInventory().addItem(new ItemStack(Material.EMERALD, 20));
							} else if (num == 68) {
								player.sendMessage(ChatColor.GREEN + "에메랄드를 30개 획득합니다.");
								player.getInventory().addItem(new ItemStack(Material.EMERALD, 30));
							} else if (num == 69) {
								player.sendMessage(ChatColor.GREEN + "에메랄드를 40개 획득합니다.");
								player.getInventory().addItem(new ItemStack(Material.EMERALD, 40));
							} else if (num == 70) {
								player.sendMessage(ChatColor.GREEN + "에메랄드를 50개 획득합니다.");
								player.getInventory().addItem(new ItemStack(Material.EMERALD, 50));
							} else if (num == 71) {
								player.sendMessage(ChatColor.GREEN + "에메랄드를 64개 획득합니다.");
								player.getInventory().addItem(new ItemStack(Material.EMERALD, 64));
							} else if (num == 72) {
								player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
								world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
							} else if (num == 73) {
								player.sendMessage(ChatColor.RED + "마나가 모두 사라집니다.");
								player.getInventory().remove(Material.HEART_OF_THE_SEA);
							} else {
								player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
								world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
							}
							world.playEffect(loc, Effect.POTION_BREAK, 0);
							t.endTask();
							t.removeID();
						}
						time++;
					}

				}, 0, 1);
			}
		} else {
			player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
			world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
		}
	}

	public void skill6(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "데빌의 증표"))) {
			int damNum = 0;
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
				damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				Location loc = player.getLocation();
				player.teleport(loc.add(0, 1, 0));
				player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 100, 0));
				player.setNoDamageTicks(100);				
				List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
				for (Entity nearEntity : entitylist) {
					if(!(nearEntity instanceof Player)) {
						if (nearEntity instanceof LivingEntity) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							nearMob.damage(player.getLevel()*10 + damNum*15);
						}
					}
				}
				player.sendMessage(ChatColor.GREEN + "[스킬]데빌 블레스터가 발동됩니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 1.0f, 1.0f);
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE10();
				// ================================================================
			} else if (i > 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = player.getLocation();
				Salmon salmon = (Salmon) world.spawnEntity(loc, EntityType.SALMON);
				salmon.setCustomName(ChatColor.GRAY + "연어 인형" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
				salmon.setCustomNameVisible(true);
				((LivingEntity) salmon).setMaxHealth(5);
				((LivingEntity) salmon).setHealth(5);
				salmon.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 1));
				world.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
				player.sendMessage(ChatColor.GREEN + "[스킬]악마의 장난이 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "연어 인형이 소환됩니다.");
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE9();
				// ================================================================
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill7(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "엔젤의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
				int num = 0;
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearPlayer = (Player) nearEntity;
						num++;
					}
				}
				if (num == 0) {
					Location loc = player.getLocation();					
					for (int _ = 0; _ < 4; _++) {
						IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
						golem.setCustomName(
								ChatColor.GRAY + "기사단원" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
						golem.setCustomNameVisible(true);
						((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 30) / 2);
						((LivingEntity) golem).setHealth((20 + player.getLevel() * 30) / 2);
						int golemLv = (player.getLevel() / 2);
						golem.addPotionEffect(
								new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, golemLv));						
						go.put(golem.getUniqueId(), player);
					}
					IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
					golem.setCustomName(ChatColor.GRAY + "기사단장" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
					golem.setCustomNameVisible(true);
					((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 30));
					((LivingEntity) golem).setHealth((20 + player.getLevel() * 30));
					int golemLv = player.getLevel();
					golem.addPotionEffect(
							new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, golemLv));
					golem.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, Integer.MAX_VALUE, 0));
					go.put(golem.getUniqueId(), player);
					player.sendMessage(ChatColor.GREEN + "[스킬]천사의 기사단이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "기사단이 소환됩니다. 레벨: " + player.getLevel());
					List<Entity> entlist = player.getNearbyEntities(10, 10, 10);
					for (Entity nearEntity : entlist) {
						if (nearEntity instanceof Mob && (nearEntity.getType() != EntityType.IRON_GOLEM)) {
							if (nearEntity instanceof Zombie) {
								Zombie zombie = (Zombie) nearEntity;
								zombie.setTarget(golem);
							}
							if (nearEntity instanceof Skeleton) {
								Skeleton zombie = (Skeleton) nearEntity;
								zombie.setTarget(golem);
							}
							if (nearEntity instanceof WitherSkeleton) {
								WitherSkeleton zombie = (WitherSkeleton) nearEntity;
								zombie.setTarget(golem);
							}
							if (nearEntity instanceof Drowned) {
								WitherSkeleton zombie = (WitherSkeleton) nearEntity;
								zombie.setTarget(golem);
							}
							if (nearEntity instanceof Husk) {
								WitherSkeleton zombie = (WitherSkeleton) nearEntity;
								zombie.setTarget(golem);
							}
						}
					}
					world.playEffect(loc, Effect.SMOKE, 0);
					world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE11();
					// ================================================================
				} else {
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							int addHealth = (int) (player.getMaxHealth() * 40 / 100);
							if (nearPlayer.getHealth() + addHealth <= nearPlayer.getMaxHealth()) {
								nearPlayer.setHealth(nearPlayer.getHealth() + addHealth);
							} else {
								nearPlayer.setHealth(nearPlayer.getMaxHealth());
							}
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 400, 2));
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다.");
							nearPlayer.sendMessage(
									ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초 동안 방어력이 상승합니다.");
						}
					}
					int addHealth = (int) (player.getMaxHealth() * 50 / 100);
					if (player.getHealth() + addHealth <= player.getMaxHealth()) {
						player.setHealth(player.getHealth() + addHealth);
					} else {
						player.setHealth(player.getMaxHealth());
					}
					Location loc = player.getLocation();
					world.playEffect(loc, Effect.DRAGON_BREATH, 0);
					player.sendMessage(ChatColor.GREEN + "[스킬]천사의 축복이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_PHANTOM_FLAP, 1.0f, 1.0f);
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE12();
					// ================================================================
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearPlayer = (Player) nearEntity;
						int addHealth = (int) (player.getMaxHealth() * 40 / 100);
						if (nearPlayer.getHealth() + addHealth <= nearPlayer.getMaxHealth()) {
							nearPlayer.setHealth(nearPlayer.getHealth() + addHealth);
						} else {
							nearPlayer.setHealth(nearPlayer.getMaxHealth());
						}
						nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 400, 2));
						nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다.");
						nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초 동안 방어력이 상승합니다.");
					}
				}
				int addHealth = (int) (player.getMaxHealth() * 50 / 100);
				if (player.getHealth() + addHealth <= player.getMaxHealth()) {
					player.setHealth(player.getHealth() + addHealth);
				} else {
					player.setHealth(player.getMaxHealth());
				}
				Location loc = player.getLocation();
				world.playEffect(loc, Effect.DRAGON_BREATH, 0);
				player.sendMessage(ChatColor.GREEN + "[스킬]천사의 축복이 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다.");
				world.playSound(player.getLocation(), Sound.ENTITY_PHANTOM_FLAP, 1.0f, 1.0f);
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE12();
				// ===============================================================
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill8(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "대행자의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i >= 20) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				Location loc = player.getLocation();
				int num = rnd.nextInt(6);
				player.sendMessage(ChatColor.GREEN + "[스킬]신의 주사위가 발동됩니다.");
				world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE13();
				// ================================================================				
				Thread t = new Thread(player.getUniqueId());
				Thread t2 = new Thread(player.getUniqueId());
				
				sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					
					@Override
					public void run() {
						if(!t.hasID()) {
							t.setID(sleep);
						}
						
						if(time>30) {
							if (num == 0) {
								player.sendMessage(ChatColor.RED + "주사위의 눈은 1!");
							} else if (num == 1) {
								player.sendMessage(ChatColor.GREEN + "주사위의 눈은 2!");
							} else if (num == 2) {
								player.sendMessage(ChatColor.GREEN + "주사위의 눈은 3!");
							} else if (num == 3) {
								player.sendMessage(ChatColor.GREEN + "주사위의 눈은 4!");
							} else if (num == 4) {
								player.sendMessage(ChatColor.GREEN + "주사위의 눈은 5!");
							} else if (num == 5) {
								player.sendMessage(ChatColor.GREEN + "주사위의 눈은 6!");
								player.sendMessage(ChatColor.GREEN + "[스킬]신의 장난이 발동됩니다.");
								world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
							}
							t.endTask();
							t.removeID();
						}
						
						time++;
						
					}
					
				}, 0, 1);
				
				sleep2 = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;

					@Override
					public void run() {
						if (!t2.hasID()) {
							t2.setID(sleep2);
						}
						
						if(time > 40) {
							if (num == 0) {
								if (time > 40) {
									player.setHealth(20);
									player.sendMessage(ChatColor.GREEN + "신의 경고가 발동됩니다.");
									player.sendMessage(ChatColor.GREEN + "정신이 번쩍 듭니다.");
									world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);									
								}
							} else if (num == 1) {
								if (time > 40) {
									List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
									for (Entity nearEntity : entitylist) {
										if (nearEntity.getType() != EntityType.PLAYER) {
											if (nearEntity instanceof LivingEntity) {
												LivingEntity nearMob = (LivingEntity) nearEntity;
												nearMob.damage(player.getLevel() * 15);
											}
										}
									}
									player.sendMessage(ChatColor.GREEN + "신의 통고가 발동됩니다.");
									world.playEffect(loc, Effect.END_GATEWAY_SPAWN, 0);							
								}
							} else if (num == 2) {
								if (time > 40) {
									List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
									for (Entity nearEntity : entitylist) {
										if (nearEntity.getType() != EntityType.PLAYER) {
											if (nearEntity instanceof LivingEntity) {
												LivingEntity nearMob = (LivingEntity) nearEntity;
												nearMob.damage(player.getLevel() * 40);
											}
										}
									}		
									player.sendMessage(ChatColor.GREEN + "신의 심판이 발동됩니다.");
									world.playEffect(loc, Effect.END_GATEWAY_SPAWN, 0);	
								}
							} else if (num == 3) {
								if (time > 40) {
									player.addPotionEffect(
											new PotionEffect(PotionEffectType.BLINDNESS, 40, Integer.MAX_VALUE));
									List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
									for (Entity nearEntity : entitylist) {
										if (nearEntity.getType() != EntityType.PLAYER) {
											if (nearEntity instanceof LivingEntity) {
												LivingEntity nearMob = (LivingEntity) nearEntity;
												nearMob.damage(player.getLevel() * 60);
											}
										}
									}		
									player.sendMessage(ChatColor.GREEN + "신의 강림이 발동됩니다.");
									world.playEffect(loc, Effect.END_GATEWAY_SPAWN, 0);									
								}
							} else if (num == 4) {
								if (time > 40) {
									player.sendMessage(ChatColor.GREEN + "신의 축복이 발동됩니다.");
									player.sendMessage(ChatColor.GREEN + "???상태가 됩니다.");
									player.setNoDamageTicks(200);
									world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);									
								}
							} else if (num == 5) {
								if (time > 40) {
									int num2 = rnd.nextInt(216);
									if (num2 < 215) {
										try {
											int num3 = rnd.nextInt(40);
											ItemStack item = player.getInventory().getItem(num3);
											if (item.getType() == Material.HEART_OF_THE_SEA
													|| item.getType() == Material.DIAMOND
													|| item.getType() == Material.LIME_DYE
													|| item.getType() == Material.MAGMA_CREAM
													|| item.getType() == Material.AIR
													|| item.getType() == Material.PLAYER_HEAD
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
													|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS
													|| item.getType() == Material.DEAD_BRAIN_CORAL_BLOCK || item.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK || item.getType() == Material.DEAD_FIRE_CORAL_BLOCK
													|| item.getType() == Material.DEAD_HORN_CORAL_BLOCK || item.getType() == Material.DEAD_TUBE_CORAL_BLOCK || item.getType() == Material.BRAIN_CORAL_BLOCK
													|| item.getType() == Material.HORN_CORAL_BLOCK || item.getType() == Material.TUBE_CORAL_BLOCK || item.getType() == Material.BUBBLE_CORAL_BLOCK
													|| item.getType() == Material.FIRE_CORAL_BLOCK || item.getType() == Material.POLISHED_GRANITE_STAIRS || item.getType() == Material.SMOOTH_RED_SANDSTONE_STAIRS 
													|| item.getType() == Material.MOSSY_COBBLESTONE_STAIRS || item.getType() == Material.MOSSY_STONE_BRICK_STAIRS || item.getType() == Material.POLISHED_DIORITE_STAIRS
													|| item.getType() == Material.END_STONE_BRICK_STAIRS || item.getType() == Material.STONE_STAIRS || item.getType() == Material.SMOOTH_SANDSTONE_STAIRS
													|| item.getType() == Material.SMOOTH_QUARTZ_STAIRS || item.getType() == Material.GRANITE_STAIRS) {
												player.sendMessage(ChatColor.RED + "스킬 발동에 실패하였습니다.");
												world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
											} else {
												player.getInventory().addItem(item);
												player.sendMessage(ChatColor.GREEN + "신의 장난으로 아이템이 복제되었습니다.");
												world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f,
														1.0f);
											}
										} catch (Exception e20) {
											player.sendMessage(ChatColor.RED + "스킬 발동에 실패하였습니다.");
											world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
										}
									} else {
										int num4 = rnd.nextInt(20);
										if (num4 < 20) {
											ItemStack weapon1 = new ItemStack(Material.DIAMOND);
											ItemMeta weapon1Im = weapon1.getItemMeta();
											weapon1Im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
											weapon1Im.setDisplayName(
													ChatColor.DARK_RED + "" + ChatColor.MAGIC + "The Item from God");
											ArrayList<String> weapon1Lore = new ArrayList();
											weapon1Lore.add(ChatColor.GRAY + "신의 힘이 담긴 아이템");
											weapon1Lore.add(ChatColor.GRAY + "5개를 모아 강화 재료로 사용할 수 있을 것 같다.");
											weapon1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
											weapon1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
											weapon1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
											weapon1Im.setUnbreakable(true);
											weapon1Im.setLore(weapon1Lore);
											weapon1.setItemMeta(weapon1Im);
											player.getInventory().addItem(weapon1);
											player.sendMessage(ChatColor.GREEN + "신에게 아이템을 받았습니다.");
											for (Player allPlayer : Bukkit.getOnlinePlayers()) {
												allPlayer.sendMessage(player.getDisplayName() + "님께서 신에게 아이템을 받았습니다.");
											}
											world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
										}
									}									
								}
							}
							t2.endTask();
							t2.removeID();
						}

						time++;
					}
				}, 0, 1);

			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill9(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "그림자 무사의 증표"))) {
			int damNum = 0;
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
				damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 10) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				Location loc = player.getLocation();
				if (player.getHealth() == player.getMaxHealth()) {
					player.setHealth((int) (player.getHealth() / 2));
					int num = (player.getLevel() / 10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 400, num * 3));
					player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 400, 5));
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE15();
					// ================================================================
					world.playSound(loc, Sound.BLOCK_CAMPFIRE_CRACKLE, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]나이트메어가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "능력치가 대폭 상승합니다.");
				} else {
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 100));
					List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.damage(player.getLevel()*5 + damNum*20);
							}
						}
					}
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE14();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]발도가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "눈앞의 적이 사라집니다.");
				}
			} else if (i > 10) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 10);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = player.getLocation();
				if (player.getHealth() == player.getMaxHealth()) {
					player.setHealth((int) (player.getHealth() / 2));
					int num = (player.getLevel() / 10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, num * 3));
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE15();
					// ================================================================
					world.playSound(loc, Sound.BLOCK_CAMPFIRE_CRACKLE, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]나이트메어가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "능력치가 대폭 상승합니다.");
				} else {
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 100));
					List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.damage(player.getLevel()*5 + damNum*20);
							}
						}
					}
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE14();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]발도가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "눈앞의 적이 사라집니다.");
				}
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void skill10(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "버서커의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 2) {
				if (player.getHealth() < player.getMaxHealth() / 5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					Location loc = player.getLocation();
					player.setHealth(player.getMaxHealth());
					player.setNoDamageTicks(200);
					player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 20));
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE17();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_WANDERING_TRADER_DRINK_POTION, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]포션 중독이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "잠시 고통이 모두 사라지지만, 심각한 디버프가 걸립니다.");
				} else {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					Location loc = player.getLocation();
					player.setHealth(player.getMaxHealth());
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 2));
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 200, 0));
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE16();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_WANDERING_TRADER_DRINK_POTION, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]포션의 부작용이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "체력이 모두 회복되지만, 디버프가 걸립니다.");
				}
			} else if (i > 2) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = player.getLocation();
				player.setHealth(player.getMaxHealth());
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 2));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 200, 0));
				world.playSound(loc, Sound.ENTITY_WANDERING_TRADER_DRINK_POTION, 1.0f, 1.0f);
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE16();
				// ================================================================
				player.sendMessage(ChatColor.GREEN + "[스킬]포션의 부작용이 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "체력이 모두 회복되지만, 디버프가 걸립니다.");
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void skill11(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "군인의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				Location loc = player.getLocation();
				int num = rnd.nextInt(20);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE18();
					// ================================================================
					world.playSound(loc, Sound.ITEM_BOOK_PAGE_TURN, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]마음의 편지가 발동됩니다.");
					player.sendMessage(ChatColor.RED + "효과가 없었습니다.");
				} else {
					player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 2));
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 4));
					player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1200, 10));
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE19();
					// ================================================================
					world.playSound(loc, Sound.ITEM_FIRECHARGE_USE, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]선임의 명령이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "많이 아프지만 효율적인 노동을 할 수 있습니다.");
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = player.getLocation();
				int num = rnd.nextInt(20);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE18();
					// ================================================================
					world.playSound(loc, Sound.ITEM_BOOK_PAGE_TURN, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]마음의 편지가 발동됩니다.");
					player.sendMessage(ChatColor.RED + "효과가 없었습니다.");
				} else {
					player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 2));
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 4));
					player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1200, 10));
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE19();
					// ================================================================
					world.playSound(loc, Sound.ITEM_FIRECHARGE_USE, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]선임의 명령이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "많이 아프지만 효율적인 노동을 할 수 있습니다.");
				}
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill12(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "그림 리퍼의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			int j = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.EMERALD_BLOCK) {
					j = j + is.getAmount();
				}
			}
			if (i == 1) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				Location loc = player.getLocation();
				if (j == 44) {
					player.getInventory().remove(Material.EMERALD_BLOCK);
					player.setNoDamageTicks(444);
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE20();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]죽음의 숫자가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "44개의 에메랄드 블럭을 소진하여 잠시 동안 무적이 됩니다.");
				} else {
					int num = 0;					
					List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.setFireTicks(200);
								nearMob.damage(player.getLevel());
								num++;
							}
						}
					}
					if (num == 0) {
						world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GREEN + "[스킬]지옥불이 발동됩니다.");
						player.sendMessage(ChatColor.RED + "대상이 없습니다.");
					} else {
						// ===============================================================
						ParticleData pd = new ParticleData(player.getUniqueId());
						if (pd.hasID()) {
							pd.endTask();
							pd.removeID();
						}
						ParticleEffect pe = new ParticleEffect(player);
						pe.startE21();
						// ================================================================
						world.playSound(loc, Sound.ENTITY_CAT_HISS, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GREEN + "[스킬]지옥불이 발동됩니다.");
						player.sendMessage(ChatColor.GREEN + "주변의 몬스터들이 불타게 됩니다.");
					}
				}
			} else if (i > 1) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = player.getLocation();
				if (j == 44) {
					player.getInventory().remove(Material.EMERALD_BLOCK);
					player.setNoDamageTicks(444);
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE20();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]죽음의 숫자가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "44개의 에메랄드 블럭을 소진하여 잠시 동안 무적이 됩니다.");
				} else {
					int num = 0;
					List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.damage(player.getLevel());
								nearMob.setFireTicks(200);
								num++;
							}
						}
					}
					if (num == 0) {
						world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GREEN + "[스킬]지옥불이 발동됩니다.");
						player.sendMessage(ChatColor.RED + "대상이 없습니다.");
					} else {
						// ===============================================================
						ParticleData pd = new ParticleData(player.getUniqueId());
						if (pd.hasID()) {
							pd.endTask();
							pd.removeID();
						}
						ParticleEffect pe = new ParticleEffect(player);
						pe.startE21();
						// ================================================================
						world.playSound(loc, Sound.ENTITY_CAT_HISS, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GREEN + "[스킬]지옥불이 발동됩니다.");
						player.sendMessage(ChatColor.GREEN + "주변의 몬스터들이 불타게 됩니다.");
					}
				}
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill13(Player player, String key) {
		World world = player.getWorld();
		Location loc = player.getLocation();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "마인의 증표"))) {
			int damNum = 0;
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
				damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=1) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,1,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						player.sendMessage(ChatColor.GREEN + "[스킬]블링크가 발동됩니다.");

						Vector vec = player.getEyeLocation().getDirection().multiply(3.0f);
						player.setVelocity(vec);
						world.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=2) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]루인 오브 노바가 발동됩니다.");
					player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 2));
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						int time = 0;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
							
							if(time >= 20) {
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player);
								pe.startE23();
								// ================================================================
								List<Entity> entitylist = player.getNearbyEntities(8, 8, 8);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.damage(player.getLevel()*100);
											world.spawnParticle(Particle.LAVA, nearMob.getLocation(), 10);
											world.playSound(nearMob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
										}
									}
								}
								t.endTask();
								t.removeID();								
							}
							
							time++;							
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=1) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]디바인 임팩트가 발동됩니다.");
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=20) {								
								t.endTask();
								t.removeID();
							} else if(time%2 == 0) {
								Snowball snow = player.launchProjectile(Snowball.class);
								snow.setShooter(player);
								snow.setVelocity(player.getLocation().getDirection().multiply(10.0f));	
								world.spawnParticle(Particle.CRIT_MAGIC, snow.getLocation(), 5);
								world.playSound(player.getLocation(), Sound.ENTITY_SNOWBALL_THROW, 1.0f, 1.0f);
							}
							
							time++;
						}						
						
					}, 0, 1);					
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=20) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 20);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);			
					
					player.sendMessage(ChatColor.GREEN + "[스킬]어나더 디비니티가 발동됩니다.");
					
					List<Entity> entity = player.getNearbyEntities(20, 5, 20);
					for(Entity e : entity) {
						if(e instanceof Mob) {
							LivingEntity mob = (LivingEntity) e; 
							mob.damage(player.getLevel()*10 + damNum*70);
							mob.setVelocity(new Vector(0,0.4,0));
							world.spawnParticle(Particle.DRAGON_BREATH, mob.getLocation().add(0,1,0), 0);
						}
					}
					world.spawnParticle(Particle.CRIT_MAGIC, player.getLocation().add(0,1,0), 0);
					world.playSound(player.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 1.0f, 1.0f);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			}
		}
	}

	public void skill14(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "팔라딘의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				Location loc = player.getLocation();
				List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearPlayer = (Player) nearEntity;
						int addHealth = (int) (player.getMaxHealth() * 30 / 100);
						if (nearPlayer.getHealth() + addHealth <= nearPlayer.getMaxHealth()) {
							nearPlayer.setHealth(nearPlayer.getHealth() + addHealth);
						} else {
							nearPlayer.setHealth(nearPlayer.getMaxHealth());
						}
						nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다.");
					}
				}
				int addHealth = (int) (player.getMaxHealth() * 100 / 100);
				player.setNoDamageTicks(60);
				if (player.getHealth() + addHealth <= player.getMaxHealth()) {
					player.setHealth(player.getHealth() + addHealth);
				} else {
					player.setHealth(player.getMaxHealth());
				}				
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE5();
				// ================================================================
				world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
				player.sendMessage(ChatColor.GREEN + "[스킬]에리니에스 테르포우시아가 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다.");
				player.sendMessage(ChatColor.GREEN + "3초 동안 무적이 됩니다.");
			} else if (i > 3) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = player.getLocation();
				List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearPlayer = (Player) nearEntity;
						int addHealth = (int) (player.getMaxHealth() * 30 / 100);
						if (nearPlayer.getHealth() + addHealth <= nearPlayer.getMaxHealth()) {
							nearPlayer.setHealth(nearPlayer.getHealth() + addHealth);
						} else {
							nearPlayer.setHealth(nearPlayer.getMaxHealth());
						}
						nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다.");
					}
				}
				int addHealth = (int) (player.getMaxHealth() * 30 / 100);
				if (player.getHealth() + addHealth <= player.getMaxHealth()) {
					player.setHealth(player.getHealth() + addHealth);
				} else {
					player.setHealth(player.getMaxHealth());
				}				
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE5();
				// ================================================================
				world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
				player.sendMessage(ChatColor.GREEN + "[스킬]라이트 오브 디비니티가 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다.");
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill15(Player player, String key) {
		World world = player.getWorld();
		Location loc = player.getLocation();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "용기사의 증표"))) {
			int damNum = 0;
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
				damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=2) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,1,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						player.sendMessage(ChatColor.GREEN + "[스킬]돌격이 발동됩니다.");
						world.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_CLOSE, 1.0f, 1.0f);
						
						Vector vec = player.getEyeLocation().add(0,2,0).getDirection().multiply(1.5f);
						player.setVelocity(vec);						
						double num1 = player.getLocation().getDirection().getX();
						double num2 = player.getLocation().getDirection().getY() + 1;
						double num3 = player.getLocation().getDirection().getZ();
						Location mobLoc = loc.add(num1, num2, num3);						
						List<Entity> entitylist = player.getNearbyEntities(3, 3, 3);				
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Mob) {
								LivingEntity ent = (LivingEntity) nearEntity;
								ent.setVelocity(vec);
								ent.damage(player.getLevel()*30 + damNum*20);
							}
						}						
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]헬파이어가 발동됩니다.");	
					world.playSound(player.getLocation(), Sound.ENTITY_DRAGON_FIREBALL_EXPLODE, 1.0f, 1.0f);
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE26();
					// ================================================================
					List<Entity> entitylist = player.getNearbyEntities(10, 4, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.setFireTicks(200);
								nearMob.damage(player.getLevel()*150);											
							}
						}
					}
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=3) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]용기사의 투지가 발동됩니다.");
					world.playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);	
					player.setNoDamageTicks(100);
					player.sendMessage(ChatColor.GREEN + "5초 동안 무적이 됩니다.");
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE27();
					// ================================================================														
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=1) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,1,0).getBlock().getType() != Material.AIR)) {
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);								
						player.sendMessage(ChatColor.GREEN + "[스킬]점프가 발동됩니다.");	
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 1.0f);
						Vector vec = new Vector(0, 1, 0);
						player.setVelocity(vec.multiply(1.5f));
						Thread t = new Thread(player.getUniqueId());
						sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
							
							int time;
							
							@Override
							public void run() {
								if (!t.hasID()) {
									t.setID(sleep);
								}
							
								if((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR)) {	
									if(player.getVelocity().getY() < 0) {
										if(time >= 20) {
											List<Entity> entitylist = player.getNearbyEntities(5, 4, 5);
											for (Entity nearEntity : entitylist) {
												if (nearEntity.getType() != EntityType.PLAYER) {
													if (nearEntity instanceof LivingEntity) {
														LivingEntity nearMob = (LivingEntity) nearEntity;
														nearMob.damage(player.getLevel()*30);											
													}
												}
											}
											world.playSound(player.getLocation(), Sound.ENTITY_WITHER_SHOOT, 1.0f, 1.0f);
											player.getWorld().spawnParticle(Particle.DRAGON_BREATH, loc, 30);
											t.endTask();
											t.removeID();
										} else {
											t.endTask();
											t.removeID();
										}
									}
								}
								
								time++;
								
							}						
							
						}, 0, 1);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			}
		}
	}
	
	public void skill16(Player player) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "대대장의 증표"))) {
			int damNum = 0;
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
				damNum = Integer.parseInt(im.getLocalizedName());
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 8) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				int num = player.getLevel();
				Location loc = player.getLocation();
				List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() != EntityType.PLAYER) {
						if (nearEntity instanceof LivingEntity) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							nearMob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 32700));
							nearMob.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 140));
							nearMob.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 32700));
						}
					}
				}
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE25();
				// ================================================================
				player.sendMessage(ChatColor.GREEN + "[스킬]라떼는 말이야가 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "적이 혼란에 빠집니다.");
				world.playSound(loc, Sound.BLOCK_NOTE_BLOCK_BELL, 1.0f, 1.0f);				
			} else if (i > 8) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 8);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = player.getLocation();
				int cnt = (player.getLevel() - 900)/10 + 1;
				for (int _ = 0; _ < cnt; _++) {
					IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
					golem.setCustomName(
							ChatColor.GRAY + "병사" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
					golem.setCustomNameVisible(true);
					((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 40));
					((LivingEntity) golem).setHealth((20 + player.getLevel() * 40));
					int golemLv = player.getLevel() / 4;
					golem.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, golemLv));						
					go.put(golem.getUniqueId(), player);
				}				
				
				IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
				golem.setCustomName(
						ChatColor.GRAY + "병사" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
				golem.setCustomNameVisible(true);
				((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 40));
				((LivingEntity) golem).setHealth((20 + player.getLevel() * 40));
				int golemLv = player.getLevel() / 4;
				golem.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, golemLv));						
				go.put(golem.getUniqueId(), player);
				
				player.sendMessage(ChatColor.GREEN + "[스킬]니 위로 내 밑으로가 발동됩니다.");
				player.sendMessage(ChatColor.GREEN + "병사들이 집합합니다. 레벨: " + player.getLevel());
				List<Entity> entitylist = player.getNearbyEntities(10, 10, 10);
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob && (nearEntity.getType() != EntityType.IRON_GOLEM)) {
						if (nearEntity instanceof Zombie) {
							Zombie zombie = (Zombie) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof Skeleton) {
							Skeleton zombie = (Skeleton) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof WitherSkeleton) {
							WitherSkeleton zombie = (WitherSkeleton) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof Drowned) {
							WitherSkeleton zombie = (WitherSkeleton) nearEntity;
							zombie.setTarget(golem);
						}
						if (nearEntity instanceof Husk) {
							WitherSkeleton zombie = (WitherSkeleton) nearEntity;
							zombie.setTarget(golem);
						}
					}
				}
				world.playEffect(loc, Effect.SMOKE, 0);
				world.playSound(loc, Sound.ENTITY_ZOMBIE_AMBIENT, 1.0f, 1.0f);
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE24();
				// ================================================================	
			} else {
				player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
				world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void skill17(Player player, String key) {
		World world = player.getWorld();
		Location loc = player.getLocation();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "아처의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("LRL")) {
				if(i>=6) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 6);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]에로우 스톰이 발동됩니다.");
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=20) {								
								t.endTask();
								t.removeID();
							} else if(time%2 == 0) {
								Arrow arrow = player.launchProjectile(Arrow.class);
								arrow.setShooter(player);
								arrow.setDamage(0);
								arrow.setVelocity(player.getLocation().getDirection().multiply(1.8f));		
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 5);
								world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
								
								SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.SPECTRAL_ARROW);
								sarrow.setVelocity(arrow.getVelocity());
							}
							
							time++;
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("LRR")) {
				if(i>=8) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 8);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]밤 에로우가 발동됩니다.");
					
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setVelocity(player.getLocation().getDirection().multiply(1.8f));		
					world.spawnParticle(Particle.FLAME, arrow.getLocation(), 5);
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
					
					SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.SPECTRAL_ARROW);
					sarrow.setVelocity(arrow.getVelocity());
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(arrow.isDead()) {	
								List<Entity> entitylist = arrow.getNearbyEntities(4, 4, 4);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.damage(player.getLevel()*11);
										}
									}
								}
								world.playSound(arrow.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
								world.spawnParticle(Particle.EXPLOSION_LARGE, arrow.getLocation(), 0);
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 10);
								t.endTask();
								t.removeID();
							}
							
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("LLL")) {
				if(i>=3) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,1,0).getBlock().getType() != Material.AIR)) {
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						player.sendMessage(ChatColor.GREEN + "[스킬]이스케이프가 발동됩니다.");
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 1.0f);
						Vector vec = player.getEyeLocation().getDirection().multiply(-1.5f);
						player.setVelocity(vec);
						player.setNoDamageTicks(20);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("LLR")) {
				if(i>=3) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);		
					
					player.sendMessage(ChatColor.GREEN + "[스킬]에로우 실드가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						double var = 0;
						Location loc, first, second;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=300) {								
								t.endTask();
								t.removeID();
							} 

							List<Entity> entity = player.getNearbyEntities(2, 2, 2);
							for(Entity e : entity) {
								if(e instanceof Mob) {
									LivingEntity mob = (LivingEntity) e; 
									mob.damage(1);
									mob.setVelocity(new Vector(0.3,1,0.3));
									time += 49;
								}
							}
						
							time++;
							
							var += Math.PI / 16;
							loc = player.getLocation();
							first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
							second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
							
							
							world.spawnParticle(Particle.TOTEM, first, 0);
							world.spawnParticle(Particle.TOTEM, second, 0);
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			}
		}		
	}
	
	public void skill18(Player player, String key) {
		World world = player.getWorld();
		Location loc = player.getLocation();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
				.equals(ChatColor.GOLD + "파워레인저의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("LRL")) {
				if(i>=3) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]에로우 스톰이 발동됩니다.");
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=40) {								
								t.endTask();
								t.removeID();
							} else if(time%2 == 0) {
								Arrow arrow = player.launchProjectile(Arrow.class);
								arrow.setShooter(player);
								arrow.setDamage(1);
								arrow.setVelocity(player.getLocation().getDirection().multiply(1.8f));		
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 5);
								world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);	
								
								SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.SPECTRAL_ARROW);
								sarrow.setVelocity(arrow.getVelocity());
							}
							
							time++;
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("LRR")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]밤 에로우가 발동됩니다.");
					
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setVelocity(player.getLocation().getDirection().multiply(1.8f));		
					world.spawnParticle(Particle.FLAME, arrow.getLocation(), 5);
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
					
					SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.SPECTRAL_ARROW);
					sarrow.setVelocity(arrow.getVelocity());
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(arrow.isDead()) {	
								List<Entity> entitylist = arrow.getNearbyEntities(7, 7, 7);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.damage(player.getLevel()*30);
										}
									}
								}
								world.playSound(arrow.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
								world.spawnParticle(Particle.EXPLOSION_HUGE, arrow.getLocation(), 0);
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 10);
								t.endTask();
								t.removeID();
							}
							
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("LLL")) {
				if(i>=1) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,1,0).getBlock().getType() != Material.AIR)) {
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						
						player.sendMessage(ChatColor.GREEN + "[스킬]이스케이프가 발동됩니다.");						
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 1.0f);
						Vector vec = player.getEyeLocation().getDirection().multiply(-1.5f);
						player.setVelocity(vec);					
						player.setNoDamageTicks(20);
						player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 3600, 2));
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else if(key.equals("LLR")) {
				if(i>=1) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);		
					
					player.sendMessage(ChatColor.GREEN + "[스킬]에로우 실드가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						double var = 0;
						Location loc, first, second;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=600) {								
								t.endTask();
								t.removeID();
							} 

							List<Entity> entity = player.getNearbyEntities(2, 2, 2);
							for(Entity e : entity) {
								if(e instanceof Mob) {
									LivingEntity mob = (LivingEntity) e; 
									mob.damage(player.getLevel());
									mob.setVelocity(new Vector(0.3,1,0.3));
									time += 29;
								}
							}
						
							time++;
							
							var += Math.PI / 16;
							loc = player.getLocation();
							first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
							second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
							
							
							world.spawnParticle(Particle.TOTEM, first, 0);
							world.spawnParticle(Particle.TOTEM, second, 0);
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			}
		}	
	}
	
}
