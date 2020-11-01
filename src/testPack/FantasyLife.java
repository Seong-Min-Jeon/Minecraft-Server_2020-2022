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
		// 밭 이벤트
		if (block.getType() == Material.WHEAT) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "낡은 낫")) {
					int num1 = rnd.nextInt(10);
					if (num1 == 0) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "상처가 많은 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "상처가 많은 밀" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 낫")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "상처가 많은 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "상처가 많은 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "밀" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "광이 나는 낫")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "좋은 식재료가 될 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "좋은 식재료가 될 밀" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "사신의 낫")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "좋은 식재료가 될 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "좋은 식재료가 될 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "마스터 농부의 낫")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "윤기가 나는 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "윤기가 나는 밀" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "신의 낫")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "윤기가 나는 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "윤기가 나는 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 먹는다고 알려진 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 2000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 먹는다고 알려진 밀" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "에포나의 낫")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "윤기가 나는 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "윤기가 나는 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 먹는다고 알려진 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 2000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 먹는다고 알려진 밀" + ChatColor.WHITE + "을 획득했다.");
					}
				} else {
					player.sendMessage("낫을 이용해 채집할 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_GRASS_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("맨손으로 채집을 하시다니 제정신이십니까? 낫을 들고 하십쇼.");
				return false;
			}
		}
		return true;
	}

	public boolean coal(Player player, Block block, Location loc) {
		// 석탄이벤트
		if (block.getType() == Material.COAL_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "낡은 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "흠집이 생긴 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "흠집이 생긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "흠집이 생긴 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "흠집이 생긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "수제 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "깨끗한 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "깨끗한 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "유명한 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "깨끗한 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "깨끗한 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "마스터 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "절대적인 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "절대적인 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "신의 곡괭이")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "절대적인 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "절대적인 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "게브네의 곡괭이")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "절대적인 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "절대적인 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("맨손으로 광물을 캐다니 제정신이십니까? 곡괭이를 들고 하십쇼.");
				return false;
			}
		}
		return true;
	}

	public boolean iron(Player player, Block block, Location loc) {
		// 철이벤트
		if (block.getType() == Material.IRON_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "낡은 곡괭이")) {
					player.sendMessage(ChatColor.GRAY + "낡은 곡괭이" + ChatColor.WHITE + "로는 이 광물을 캘 수 없을 것 같다.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "상태가 좋지 않은 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "상태가 좋지 않은 철광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "수제 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "상태가 좋지 않은 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "상태가 좋지 않은 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "철광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "유명한 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "빛이나는 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "빛이나는 철광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "마스터 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "빛이나는 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "빛이나는 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "순백의 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "순백의 철광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "신의 곡괭이")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "순백의 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "순백의 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 철광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "게브네의 곡괭이")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "순백의 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "순백의 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 철광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("맨손으로 광물을 캐다니 제정신이십니까? 곡괭이를 들고 하십쇼.");
				return false;
			}
		}
		return true;
	}

	public boolean gold(Player player, Block block, Location loc) {
		// 금이벤트
		if (block.getType() == Material.GOLD_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "낡은 곡괭이")) {
					player.sendMessage(ChatColor.GRAY + "낡은 곡괭이" + ChatColor.WHITE + "로는 이 광물을 캘 수 없을 것 같다.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 곡괭이")) {
					player.sendMessage("평범한 곡괭이로는 이 광물을 캘 수 없을 것 같다.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "수제 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "가치가 떨어진 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "가치가 떨어진 금광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "유명한 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "가치가 떨어진 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "가치가 떨어진 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "금광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "마스터 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "금광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "쉽게 녹지 않는 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "쉽게 녹지 않는 금광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "신의 곡괭이")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "쉽게 녹지 않는 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "쉽게 녹지 않는 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 금광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "게브네의 곡괭이")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "쉽게 녹지 않는 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "쉽게 녹지 않는 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 금광석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("맨손으로 광물을 캐다니 제정신이십니까? 곡괭이를 들고 하십쇼.");
				return false;
			}
		}
		return true;
	}

	public boolean dia(Player player, Block block, Location loc) {
		// 다이아이벤트
		if (block.getType() == Material.DIAMOND_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "낡은 곡괭이")) {
					player.sendMessage(ChatColor.GRAY + "낡은 곡괭이" + ChatColor.WHITE + "로는 이 광물을 캘 수 없을 것 같다.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 곡괭이")) {
					player.sendMessage("평범한 곡괭이로는 이 광물을 캘 수 없을 것 같다.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "수제 곡괭이")) {
					player.sendMessage(ChatColor.YELLOW + "수제 곡괭이" + ChatColor.WHITE + "로는 이 광물을 캘 수 없을 것 같다.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "유명한 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "마스터 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "신의 곡괭이")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 4) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 19) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 24) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "빛나는 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.giveExp(160);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "빛나는 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 25) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "게브네의 곡괭이")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 4) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 19) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 24) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "빛나는 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.giveExp(160);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "빛나는 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 25) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					}
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("맨손으로 광물을 캐다니 제정신이십니까? 곡괭이를 들고 하십쇼.");
				return false;
			}
		}
		return true;
	}

	public boolean eme(Player player, Block block, Location loc) {
		// 에메랄드이벤트
		if (block.getType() == Material.EMERALD_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "낡은 곡괭이")) {
					player.sendMessage(ChatColor.GRAY + "낡은 곡괭이" + ChatColor.WHITE + "로는 이 광물을 캘 수 없을 것 같다.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 곡괭이")) {
					player.sendMessage("평범한 곡괭이로는 이 광물을 캘 수 없을 것 같다.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "수제 곡괭이")) {
					int num1 = rnd.nextInt(3) + 1;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "유명한 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(11) + 5;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "마스터 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(21) + 10;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "신의 곡괭이")) {
					int num1 = rnd.nextInt(31) + 30;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "게브네의 곡괭이")) {
					int num1 = rnd.nextInt(11) + 50;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("맨손으로 광물을 캐다니 제정신이십니까? 곡괭이를 들고 하십쇼.");
				return false;
			}
		}
		return true;
	}
	
	public boolean quartz(Player player, Block block, Location loc) {
		// 석영이벤트
		if (block.getType() == Material.NETHER_QUARTZ_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "낡은 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "깨질 듯한 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "깨질 듯한 석영" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "깨질 듯한 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "깨질 듯한 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "석영" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "수제 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "반듯한 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "반듯한 석영" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "유명한 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "반듯한 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "반듯한 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "매혹적인 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "매혹적인 석영" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "마스터 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "매혹적인 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "매혹적인 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "보석같은 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "보석같은 석영" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "신의 곡괭이")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "보석같은 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "보석같은 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 23) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 석영" + ChatColor.WHITE + "을 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "게브네의 곡괭이")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "보석같은 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "보석같은 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 23) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신의 힘이 담긴 석영" + ChatColor.WHITE + "을 획득했다.");
					}
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("맨손으로 광물을 캐다니 제정신이십니까? 곡괭이를 들고 하십쇼.");
				return false;
			}
		}
		return true;
	}
	
}
