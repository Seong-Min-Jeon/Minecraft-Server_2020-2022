package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FantasyLife {

	Random rnd = new Random();
	ExpSystem es = new ExpSystem();
	
	public boolean fantasyLift(Player player, Block block, Location loc) {
		if(wheat(player, block, loc) && coal(player, block, loc) && iron(player, block, loc) && gold(player, block, loc) &&
				dia(player, block, loc) && eme(player, block, loc) && quartz(player, block, loc)) {
			return true;
		} 
		return false;
	}

	public boolean wheat(Player player, Block block, Location loc) {
		// πÁ ¿Ã∫•∆Æ
		if (block.getType() == Material.WHEAT) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "≥∞¿∫ ≥¥")) {
					int num1 = rnd.nextInt(10);
					if (num1 == 0) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "ªÛ√≥∞° ∏π¿∫ π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "ªÛ√≥∞° ∏π¿∫ π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "∆Úπ¸«— ≥¥")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "ªÛ√≥∞° ∏π¿∫ π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "ªÛ√≥∞° ∏π¿∫ π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "±§¿Ã ≥™¥¬ ≥¥")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "¡¡¿∫ Ωƒ¿Á∑·∞° µ… π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "¡¡¿∫ Ωƒ¿Á∑·∞° µ… π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "ªÁΩ≈¿« ≥¥")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "¡¡¿∫ Ωƒ¿Á∑·∞° µ… π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "¡¡¿∫ Ωƒ¿Á∑·∞° µ… π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "¡§±≥«— »˚¿∏∑Œ ¿ﬂ∏∞ π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "¡§±≥«— »˚¿∏∑Œ ¿ﬂ∏∞ π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "∏∂Ω∫≈Õ ≥Û∫Œ¿« ≥¥")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "¡§±≥«— »˚¿∏∑Œ ¿ﬂ∏∞ π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "¡§±≥«— »˚¿∏∑Œ ¿ﬂ∏∞ π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "¿±±‚∞° ≥™¥¬ π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "¿±±‚∞° ≥™¥¬ π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "Ω≈¿« ≥¥")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "¿±±‚∞° ≥™¥¬ π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "¿±±‚∞° ≥™¥¬ π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿Ã ∏‘¥¬¥Ÿ∞Ì æÀ∑¡¡¯ π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 2000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿Ã ∏‘¥¬¥Ÿ∞Ì æÀ∑¡¡¯ π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "ø°∆˜≥™¿« ≥¥")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "¿±±‚∞° ≥™¥¬ π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "¿±±‚∞° ≥™¥¬ π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿Ã ∏‘¥¬¥Ÿ∞Ì æÀ∑¡¡¯ π–");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 2000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿Ã ∏‘¥¬¥Ÿ∞Ì æÀ∑¡¡¯ π–" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else {
					player.sendMessage("≥¥¿ª ¿ÃøÎ«ÿ √§¡˝«“ ºˆ ¿÷¿ª ∞Õ ∞∞¥Ÿ.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_GRASS_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("∏«º’¿∏∑Œ √§¡˝¿ª «œΩ√¥Ÿ¥œ ¡¶¡§Ω≈¿ÃΩ ¥œ±Ó? ≥¥¿ª µÈ∞Ì «œΩ ºÓ.");
				return false;
			}
		}
		return true;
	}

	public boolean coal(Player player, Block block, Location loc) {
		// ºÆ≈∫¿Ã∫•∆Æ
		if (block.getType() == Material.COAL_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "»Ï¡˝¿Ã ª˝±‰ ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "»Ï¡˝¿Ã ª˝±‰ ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "∆Úπ¸«— ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "»Ï¡˝¿Ã ª˝±‰ ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "»Ï¡˝¿Ã ª˝±‰ ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "ºˆ¡¶ ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "±˙≤˝«— ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "±˙≤˝«— ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "¿Ø∏Ì«— ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "±˙≤˝«— ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "±˙≤˝«— ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "º¯ºˆµµ∞° ≥Ù¿∫ ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "º¯ºˆµµ∞° ≥Ù¿∫ ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "∏∂Ω∫≈Õ ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "º¯ºˆµµ∞° ≥Ù¿∫ ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "º¯ºˆµµ∞° ≥Ù¿∫ ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "¿˝¥Î¿˚¿Œ ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "¿˝¥Î¿˚¿Œ ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "Ω≈¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "¿˝¥Î¿˚¿Œ ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "¿˝¥Î¿˚¿Œ ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "∞‘∫Í≥◊¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "¿˝¥Î¿˚¿Œ ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "¿˝¥Î¿˚¿Œ ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ºÆ≈∫ ±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ºÆ≈∫ ±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else {
					player.sendMessage("∞Ó±™¿Ã∑Œ ƒ∂ ºˆ ¿÷¿ª ∞Õ ∞∞¥Ÿ.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("∏«º’¿∏∑Œ ±§π∞¿ª ƒ≥¥Ÿ¥œ ¡¶¡§Ω≈¿ÃΩ ¥œ±Ó? ∞Ó±™¿Ã∏¶ µÈ∞Ì «œΩ ºÓ.");
				return false;
			}
		}
		return true;
	}

	public boolean iron(Player player, Block block, Location loc) {
		// √∂¿Ã∫•∆Æ
		if (block.getType() == Material.IRON_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã")) {
					player.sendMessage(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã" + ChatColor.WHITE + "∑Œ¥¬ ¿Ã ±§π∞¿ª ƒ∂ ºˆ æ¯¿ª ∞Õ ∞∞¥Ÿ.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "∆Úπ¸«— ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "ªÛ≈¬∞° ¡¡¡ˆ æ ¿∫ √∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "ªÛ≈¬∞° ¡¡¡ˆ æ ¿∫ √∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "ºˆ¡¶ ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "ªÛ≈¬∞° ¡¡¡ˆ æ ¿∫ √∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "ªÛ≈¬∞° ¡¡¡ˆ æ ¿∫ √∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "√∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "√∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "¿Ø∏Ì«— ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "√∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "√∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "∫˚¿Ã≥™¥¬ √∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "∫˚¿Ã≥™¥¬ √∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "∏∂Ω∫≈Õ ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "∫˚¿Ã≥™¥¬ √∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "∫˚¿Ã≥™¥¬ √∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "º¯πÈ¿« √∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "º¯πÈ¿« √∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "Ω≈¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "º¯πÈ¿« √∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "º¯πÈ¿« √∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ √∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ √∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "∞‘∫Í≥◊¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "º¯πÈ¿« √∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "º¯πÈ¿« √∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ √∂±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ √∂±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else {
					player.sendMessage("∞Ó±™¿Ã∑Œ ƒ∂ ºˆ ¿÷¿ª ∞Õ ∞∞¥Ÿ.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("∏«º’¿∏∑Œ ±§π∞¿ª ƒ≥¥Ÿ¥œ ¡¶¡§Ω≈¿ÃΩ ¥œ±Ó? ∞Ó±™¿Ã∏¶ µÈ∞Ì «œΩ ºÓ.");
				return false;
			}
		}
		return true;
	}

	public boolean gold(Player player, Block block, Location loc) {
		// ±›¿Ã∫•∆Æ
		if (block.getType() == Material.GOLD_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã")) {
					player.sendMessage(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã" + ChatColor.WHITE + "∑Œ¥¬ ¿Ã ±§π∞¿ª ƒ∂ ºˆ æ¯¿ª ∞Õ ∞∞¥Ÿ.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "∆Úπ¸«— ∞Ó±™¿Ã")) {
					player.sendMessage("∆Úπ¸«— ∞Ó±™¿Ã∑Œ¥¬ ¿Ã ±§π∞¿ª ƒ∂ ºˆ æ¯¿ª ∞Õ ∞∞¥Ÿ.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "ºˆ¡¶ ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "∞°ƒ°∞° ∂≥æÓ¡¯ ±›±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "∞°ƒ°∞° ∂≥æÓ¡¯ ±›±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "¿Ø∏Ì«— ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "∞°ƒ°∞° ∂≥æÓ¡¯ ±›±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "∞°ƒ°∞° ∂≥æÓ¡¯ ±›±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "±›±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "±›±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "∏∂Ω∫≈Õ ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "±›±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "±›±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "Ω±∞‘ ≥Ï¡ˆ æ ¥¬ ±›±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "Ω±∞‘ ≥Ï¡ˆ æ ¥¬ ±›±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "Ω≈¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "Ω±∞‘ ≥Ï¡ˆ æ ¥¬ ±›±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "Ω±∞‘ ≥Ï¡ˆ æ ¥¬ ±›±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ±›±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ±›±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "∞‘∫Í≥◊¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "Ω±∞‘ ≥Ï¡ˆ æ ¥¬ ±›±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "Ω±∞‘ ≥Ï¡ˆ æ ¥¬ ±›±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ±›±§ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ±›±§ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else {
					player.sendMessage("∞Ó±™¿Ã∑Œ ƒ∂ ºˆ ¿÷¿ª ∞Õ ∞∞¥Ÿ.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("∏«º’¿∏∑Œ ±§π∞¿ª ƒ≥¥Ÿ¥œ ¡¶¡§Ω≈¿ÃΩ ¥œ±Ó? ∞Ó±™¿Ã∏¶ µÈ∞Ì «œΩ ºÓ.");
				return false;
			}
		}
		return true;
	}

	public boolean dia(Player player, Block block, Location loc) {
		// ¥Ÿ¿Ãæ∆¿Ã∫•∆Æ
		if (block.getType() == Material.DIAMOND_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã")) {
					player.sendMessage(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã" + ChatColor.WHITE + "∑Œ¥¬ ¿Ã ±§π∞¿ª ƒ∂ ºˆ æ¯¿ª ∞Õ ∞∞¥Ÿ.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "∆Úπ¸«— ∞Ó±™¿Ã")) {
					player.sendMessage("∆Úπ¸«— ∞Ó±™¿Ã∑Œ¥¬ ¿Ã ±§π∞¿ª ƒ∂ ºˆ æ¯¿ª ∞Õ ∞∞¥Ÿ.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "ºˆ¡¶ ∞Ó±™¿Ã")) {
					player.sendMessage(ChatColor.YELLOW + "ºˆ¡¶ ∞Ó±™¿Ã" + ChatColor.WHITE + "∑Œ¥¬ ¿Ã ±§π∞¿ª ƒ∂ ºˆ æ¯¿ª ∞Õ ∞∞¥Ÿ.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "¿Ø∏Ì«— ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "»Ï¡˝¿Ã ≥≠ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "»Ï¡˝¿Ã ≥≠ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "∏∂Ω∫≈Õ ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "»Ï¡˝¿Ã ≥≠ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "»Ï¡˝¿Ã ≥≠ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "Ω≈¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 4) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "»Ï¡˝¿Ã ≥≠ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "»Ï¡˝¿Ã ≥≠ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 <= 19) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 <= 24) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "∫˚≥™¥¬ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.giveExp(160);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "∫˚≥™¥¬ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 25) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "∞‘∫Í≥◊¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 4) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "»Ï¡˝¿Ã ≥≠ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "»Ï¡˝¿Ã ≥≠ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 <= 19) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 <= 24) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "∫˚≥™¥¬ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.giveExp(160);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "∫˚≥™¥¬ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 25) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ¥Ÿ¿Ãæ∆∏ÛµÂ ø¯ºÆ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else {
					player.sendMessage("∞Ó±™¿Ã∑Œ ƒ∂ ºˆ ¿÷¿ª ∞Õ ∞∞¥Ÿ.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("∏«º’¿∏∑Œ ±§π∞¿ª ƒ≥¥Ÿ¥œ ¡¶¡§Ω≈¿ÃΩ ¥œ±Ó? ∞Ó±™¿Ã∏¶ µÈ∞Ì «œΩ ºÓ.");
				return false;
			}
		}
		return true;
	}

	public boolean eme(Player player, Block block, Location loc) {
		// ø°∏ﬁ∂ˆµÂ¿Ã∫•∆Æ
		if (block.getType() == Material.EMERALD_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã")) {
					player.sendMessage(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã" + ChatColor.WHITE + "∑Œ¥¬ ¿Ã ±§π∞¿ª ƒ∂ ºˆ æ¯¿ª ∞Õ ∞∞¥Ÿ.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "∆Úπ¸«— ∞Ó±™¿Ã")) {
					player.sendMessage("∆Úπ¸«— ∞Ó±™¿Ã∑Œ¥¬ ¿Ã ±§π∞¿ª ƒ∂ ºˆ æ¯¿ª ∞Õ ∞∞¥Ÿ.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "ºˆ¡¶ ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(3) + 1;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("ø°∏ﬁ∂ˆµÂ " + num1 + "∞≥∏¶ »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "¿Ø∏Ì«— ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(11) + 5;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("ø°∏ﬁ∂ˆµÂ " + num1 + "∞≥∏¶ »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "∏∂Ω∫≈Õ ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(21) + 10;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("ø°∏ﬁ∂ˆµÂ " + num1 + "∞≥∏¶ »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "Ω≈¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(31) + 30;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("ø°∏ﬁ∂ˆµÂ " + num1 + "∞≥∏¶ »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "∞‘∫Í≥◊¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(11) + 50;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("ø°∏ﬁ∂ˆµÂ " + num1 + "∞≥∏¶ »πµÊ«ﬂ¥Ÿ.");
					}
				} else {
					player.sendMessage("∞Ó±™¿Ã∑Œ ƒ∂ ºˆ ¿÷¿ª ∞Õ ∞∞¥Ÿ.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("∏«º’¿∏∑Œ ±§π∞¿ª ƒ≥¥Ÿ¥œ ¡¶¡§Ω≈¿ÃΩ ¥œ±Ó? ∞Ó±™¿Ã∏¶ µÈ∞Ì «œΩ ºÓ.");
				return false;
			}
		}
		return true;
	}
	
	public boolean quartz(Player player, Block block, Location loc) {
		// ºÆøµ¿Ã∫•∆Æ
		if (block.getType() == Material.NETHER_QUARTZ_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "≥∞¿∫ ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "±˙¡˙ µÌ«— ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "±˙¡˙ µÌ«— ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "∆Úπ¸«— ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "±˙¡˙ µÌ«— ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "±˙¡˙ µÌ«— ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "ºˆ¡¶ ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "π›µÌ«— ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "π›µÌ«— ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "¿Ø∏Ì«— ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "π›µÌ«— ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "π›µÌ«— ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "∏≈»§¿˚¿Œ ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "∏≈»§¿˚¿Œ ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "∏∂Ω∫≈Õ ¥Î¿Â¿Â¿Ã¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "∏≈»§¿˚¿Œ ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "∏≈»§¿˚¿Œ ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "∫∏ºÆ∞∞¿∫ ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "∫∏ºÆ∞∞¿∫ ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "Ω≈¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "∫∏ºÆ∞∞¿∫ ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "∫∏ºÆ∞∞¿∫ ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 <= 23) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "∞‘∫Í≥◊¿« ∞Ó±™¿Ã")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "∫∏ºÆ∞∞¿∫ ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "∫∏ºÆ∞∞¿∫ ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					} else if (num1 <= 23) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ºÆøµ");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "Ω≈¿« »˚¿Ã ¥„±‰ ºÆøµ" + ChatColor.WHITE + "¿ª »πµÊ«ﬂ¥Ÿ.");
					}
				} else {
					player.sendMessage("∞Ó±™¿Ã∑Œ ƒ∂ ºˆ ¿÷¿ª ∞Õ ∞∞¥Ÿ.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("∏«º’¿∏∑Œ ±§π∞¿ª ƒ≥¥Ÿ¥œ ¡¶¡§Ω≈¿ÃΩ ¥œ±Ó? ∞Ó±™¿Ã∏¶ µÈ∞Ì «œΩ ºÓ.");
				return false;
			}
		}
		return true;
	}
	
}
