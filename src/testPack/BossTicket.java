package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BossTicket {
	
	public void summon(Player player, Item itemArg) {
		World world = player.getWorld();
		bossSkelE(player, itemArg, world);
		arachne(player, itemArg, world);
		hardArachne(player, itemArg, world);
	}

	public void bossSkelE(Player player, Item itemArg, World world) {
		//보스 스켈이 3686 39 3730  3712 47 3672
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.YELLOW + "보스 스켈이 소환 티켓")) {
			if (player.getLocation().getX() <= 3712 && player.getLocation().getY() <= 47
					&& player.getLocation().getZ() <= 3730 && player.getLocation().getX() >= 3686
					&& player.getLocation().getY() >= 39 && player.getLocation().getZ() >= 3672) {
				Location loc = new Location(world, 3707, 44, 3712);
				world.spawnEntity(loc, EntityType.SKELETON);
				itemArg.remove();
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 5);
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 100);
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 5);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1.0f, 1.0f);
			} else {
				itemArg.remove();
			}
		}
	}
	
	public void arachne(Player player, Item itemArg, World world) {
		//아라크네  708 27 293  726 27 312
		if (player.getLocation().getX() <= 727 && player.getLocation().getY() <= 30
				&& player.getLocation().getZ() <= 313 && player.getLocation().getX() >= 707
				&& player.getLocation().getY() >= 10 && player.getLocation().getZ() >= 292) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName()
					.equalsIgnoreCase(ChatColor.YELLOW + "아라크네 소환 티켓")) {
				Location loc = new Location(world, 723, 24, 304);
				Spider Boss = (Spider) world.spawnEntity(loc, EntityType.CAVE_SPIDER);
				Boss.setCustomName(ChatColor.GRAY + "아라크네" + ChatColor.YELLOW + " [Lv.23]");
				Boss.setCustomNameVisible(true);
				((LivingEntity) Boss).setMaxHealth(50);
				((LivingEntity) Boss).setHealth(50);
				EntityEquipment weapon = Boss.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DIAMOND_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = Boss.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.LEATHER_HELMET);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = Boss.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = Boss.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = Boss.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				itemArg.remove();
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 5);
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 100);
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 5);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1.0f, 1.0f);
			}
		}
	}
	
	public void hardArachne(Player player, Item itemArg, World world) {
		//[하드]아라크네 777 42 -6  796 48 -27
		if (player.getLocation().getX() <= 797 && player.getLocation().getY() <= 50 && player.getLocation().getZ() <= -5
				&& player.getLocation().getX() >= 776 && player.getLocation().getY() >= 40
				&& player.getLocation().getZ() >= -28) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName()
					.equalsIgnoreCase(ChatColor.YELLOW + "[하드]아라크네 소환 티켓")) {
				Location loc = new Location(world, 791, 42, -17);
				Spider Boss = (Spider) world.spawnEntity(loc, EntityType.CAVE_SPIDER);
				Boss.setCustomName(ChatColor.GRAY + "아라크네" + ChatColor.YELLOW + " [Lv.196]");
				Boss.setCustomNameVisible(true);
				((LivingEntity) Boss).setMaxHealth(1000);
				((LivingEntity) Boss).setHealth(1000);
				EntityEquipment weapon = Boss.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DIAMOND_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = Boss.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.LEATHER_HELMET);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = Boss.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = Boss.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = Boss.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				Boss.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 120));
				itemArg.remove();
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 5);
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 100);
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 5);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1.0f, 1.0f);
			}
		}

	}

}
