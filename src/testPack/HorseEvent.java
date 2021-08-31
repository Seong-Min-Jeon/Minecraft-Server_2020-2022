package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HorseEvent {
	
	Random rnd = new Random();

	public HorseEvent(Player player, ItemMeta im) {
		
		if(player.getVehicle() == null) {
			HorseOwner ho = new HorseOwner();
			if(ho.already(player)) {
				try {
					ho.returnHorse(player).remove();
				} catch(Exception e2) {
					
				}
				ho.remove(player);
			}
			if(im.getDisplayName().equals(ChatColor.GRAY + "갈색마")) {
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
				Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
				horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
				horse.setCustomNameVisible(true);
				horse.setBreed(false);
				horse.setMaxHealth(1);
				horse.setNoDamageTicks(Integer.MAX_VALUE);
				horse.setAdult();
				horse.setTamed(true);
				horse.setOwner(player);
				horse.setRemoveWhenFarAway(true);
				horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
				ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
				ItemMeta barIm = bar.getItemMeta();
				barIm.setDisplayName(ChatColor.RED + " ");
				barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				bar.setItemMeta(barIm);
				horse.getInventory().setArmor(bar);
				int num = rnd.nextInt(100);
				if(num < 60) {
					horse.setStyle(Horse.Style.NONE);
				} else if(num < 80) {
					horse.setStyle(Horse.Style.WHITE);
				} else if(num < 90) {
					horse.setStyle(Horse.Style.WHITEFIELD);
				} else if(num < 99) {
					horse.setStyle(Horse.Style.WHITE_DOTS);
				} else if(num < 100) {
					horse.setStyle(Horse.Style.BLACK_DOTS);
				}
				horse.setColor(Horse.Color.BROWN);
				horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.2);
				ho.put(player, horse);
			}
			if(im.getDisplayName().equals(ChatColor.WHITE + "검갈마")) {
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
				Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
				horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
				horse.setCustomNameVisible(true);
				horse.setBreed(false);
				horse.setMaxHealth(1);
				horse.setNoDamageTicks(Integer.MAX_VALUE);
				horse.setAdult();
				horse.setTamed(true);
				horse.setOwner(player);
				horse.setRemoveWhenFarAway(true);
				horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
				ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
				ItemMeta barIm = bar.getItemMeta();
				barIm.setDisplayName(ChatColor.RED + " ");
				barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				bar.setItemMeta(barIm);
				horse.getInventory().setArmor(bar);
				int num = rnd.nextInt(100);
				if(num < 60) {
					horse.setStyle(Horse.Style.NONE);
				} else if(num < 80) {
					horse.setStyle(Horse.Style.WHITE);
				} else if(num < 90) {
					horse.setStyle(Horse.Style.WHITEFIELD);
				} else if(num < 99) {
					horse.setStyle(Horse.Style.WHITE_DOTS);
				} else if(num < 100) {
					horse.setStyle(Horse.Style.BLACK_DOTS);
				}
				horse.setColor(Horse.Color.DARK_BROWN);
				horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.23);
				ho.put(player, horse);
			}
			if(im.getDisplayName().equals(ChatColor.YELLOW + "황갈마")) {
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
				Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
				horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
				horse.setCustomNameVisible(true);
				horse.setBreed(false);
				horse.setMaxHealth(1);
				horse.setNoDamageTicks(Integer.MAX_VALUE);
				horse.setAdult();
				horse.setTamed(true);
				horse.setOwner(player);
				horse.setRemoveWhenFarAway(true);
				horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
				ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
				ItemMeta barIm = bar.getItemMeta();
				barIm.setDisplayName(ChatColor.RED + " ");
				barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				bar.setItemMeta(barIm);
				horse.getInventory().setArmor(bar);
				int num = rnd.nextInt(100);
				if(num < 60) {
					horse.setStyle(Horse.Style.NONE);
				} else if(num < 80) {
					horse.setStyle(Horse.Style.WHITE);
				} else if(num < 90) {
					horse.setStyle(Horse.Style.WHITEFIELD);
				} else if(num < 99) {
					horse.setStyle(Horse.Style.WHITE_DOTS);
				} else if(num < 100) {
					horse.setStyle(Horse.Style.BLACK_DOTS);
				}
				horse.setColor(Horse.Color.CREAMY);
				horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.26);
				ho.put(player, horse);
			}
			if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "회색마")) {
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
				Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
				horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
				horse.setCustomNameVisible(true);
				horse.setBreed(false);
				horse.setMaxHealth(1);
				horse.setNoDamageTicks(Integer.MAX_VALUE);
				horse.setAdult();
				horse.setTamed(true);
				horse.setOwner(player);
				horse.setRemoveWhenFarAway(true);
				horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
				ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
				ItemMeta barIm = bar.getItemMeta();
				barIm.setDisplayName(ChatColor.RED + " ");
				barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				bar.setItemMeta(barIm);
				horse.getInventory().setArmor(bar);
				int num = rnd.nextInt(100);
				if(num < 60) {
					horse.setStyle(Horse.Style.NONE);
				} else if(num < 80) {
					horse.setStyle(Horse.Style.WHITE);
				} else if(num < 90) {
					horse.setStyle(Horse.Style.WHITEFIELD);
				} else if(num < 99) {
					horse.setStyle(Horse.Style.WHITE_DOTS);
				} else if(num < 100) {
					horse.setStyle(Horse.Style.BLACK_DOTS);
				}
				horse.setColor(Horse.Color.GRAY);
				horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.29);
				ho.put(player, horse);
			}
			if(im.getDisplayName().equals(ChatColor.AQUA + "황금갈기마")) {
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
				Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
				horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
				horse.setCustomNameVisible(true);
				horse.setBreed(false);
				horse.setMaxHealth(1);
				horse.setNoDamageTicks(Integer.MAX_VALUE);
				horse.setAdult();
				horse.setTamed(true);
				horse.setOwner(player);
				horse.setRemoveWhenFarAway(true);
				horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
				ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
				ItemMeta barIm = bar.getItemMeta();
				barIm.setDisplayName(ChatColor.RED + " ");
				barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				bar.setItemMeta(barIm);
				horse.getInventory().setArmor(bar);
				int num = rnd.nextInt(100);
				if(num < 60) {
					horse.setStyle(Horse.Style.NONE);
				} else if(num < 80) {
					horse.setStyle(Horse.Style.WHITE);
				} else if(num < 90) {
					horse.setStyle(Horse.Style.WHITEFIELD);
				} else if(num < 99) {
					horse.setStyle(Horse.Style.WHITE_DOTS);
				} else if(num < 100) {
					horse.setStyle(Horse.Style.BLACK_DOTS);
				}
				horse.setColor(Horse.Color.CHESTNUT);
				horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.32);
				ho.put(player, horse);
			}
			if(im.getDisplayName().equals(ChatColor.DARK_RED + "흑마")) {
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
				Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
				horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
				horse.setCustomNameVisible(true);
				horse.setBreed(false);
				horse.setMaxHealth(1);
				horse.setNoDamageTicks(Integer.MAX_VALUE);
				horse.setAdult();
				horse.setTamed(true);
				horse.setOwner(player);
				horse.setRemoveWhenFarAway(true);
				horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
				ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
				ItemMeta barIm = bar.getItemMeta();
				barIm.setDisplayName(ChatColor.RED + " ");
				barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				bar.setItemMeta(barIm);
				horse.getInventory().setArmor(bar);
				int num = rnd.nextInt(100);
				if(num < 60) {
					horse.setStyle(Horse.Style.NONE);
				} else if(num < 80) {
					horse.setStyle(Horse.Style.WHITE);
				} else if(num < 90) {
					horse.setStyle(Horse.Style.WHITEFIELD);
				} else if(num < 99) {
					horse.setStyle(Horse.Style.WHITE_DOTS);
				} else if(num < 100) {
					horse.setStyle(Horse.Style.BLACK_DOTS);
				}
				horse.setColor(Horse.Color.BLACK);
				horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.35);
				ho.put(player, horse);
			}
			if(im.getDisplayName().equals(ChatColor.DARK_PURPLE + "백마")) {
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
				Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
				horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
				horse.setCustomNameVisible(true);
				horse.setBreed(false);
				horse.setMaxHealth(1);
				horse.setNoDamageTicks(Integer.MAX_VALUE);
				horse.setAdult();
				horse.setTamed(true);
				horse.setOwner(player);
				horse.setRemoveWhenFarAway(true);
				horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
				ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
				ItemMeta barIm = bar.getItemMeta();
				barIm.setDisplayName(ChatColor.RED + " ");
				barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				bar.setItemMeta(barIm);
				horse.getInventory().setArmor(bar);
				int num = rnd.nextInt(100);
				if(num < 60) {
					horse.setStyle(Horse.Style.NONE);
				} else if(num < 80) {
					horse.setStyle(Horse.Style.WHITE);
				} else if(num < 90) {
					horse.setStyle(Horse.Style.WHITEFIELD);
				} else if(num < 99) {
					horse.setStyle(Horse.Style.WHITE_DOTS);
				} else if(num < 100) {
					horse.setStyle(Horse.Style.BLACK_DOTS);
				}
				horse.setColor(Horse.Color.WHITE);
				horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.38);
				ho.put(player, horse);
			}
		}
	}
	
}
