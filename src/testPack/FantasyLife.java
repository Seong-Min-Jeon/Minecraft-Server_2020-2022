package testPack;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class FantasyLife {

	Random rnd = new Random();
	ExpSystem es = new ExpSystem();
	Cmd18ItemToggle it = new Cmd18ItemToggle();
	
	// 메세지
	public void sendMessage(Player player, String msg) {
		if (it.isOn(player)) {
			player.sendMessage(msg);
		}
	}
	
	public boolean fantasyLife(Player player, Block block, Location loc) {
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.GRAY + "상처가 많은 밀" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.ORANGE_DYE)) {
							ItemStack var1 = new ItemStack(Material.WHEAT);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.GRAY + "상처가 많은 밀");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.GRAY + "상처가 많은 밀" + ChatColor.WHITE + "을 획득했다.");
						}
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 낫")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "상처가 많은 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.GRAY + "상처가 많은 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.WHITE + "밀" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.ORANGE_DYE)) {
							ItemStack var1 = new ItemStack(Material.WHEAT);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.GRAY + "상처가 많은 밀");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.GRAY + "상처가 많은 밀" + ChatColor.WHITE + "을 획득했다.");
						}
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "광이 나는 낫")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.WHITE + "밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "좋은 식재료가 될 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "좋은 식재료가 될 밀" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.ORANGE_DYE)) {
							ItemStack var1 = new ItemStack(Material.WHEAT);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.WHITE + "밀");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 30000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.WHITE + "밀" + ChatColor.WHITE + "을 획득했다.");
						}
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "사신의 낫")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "좋은 식재료가 될 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "좋은 식재료가 될 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.ORANGE_DYE)) {
							ItemStack var1 = new ItemStack(Material.WHEAT);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.YELLOW + "좋은 식재료가 될 밀");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 150000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.YELLOW + "좋은 식재료가 될 밀" + ChatColor.WHITE + "을 획득했다.");
						}
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "마스터 농부의 낫")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "윤기가 나는 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "윤기가 나는 밀" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.ORANGE_DYE)) {
							ItemStack var1 = new ItemStack(Material.WHEAT);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 5000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀" + ChatColor.WHITE + "을 획득했다.");
						}
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "신의 낫")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "윤기가 나는 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "윤기가 나는 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 먹는다고 알려진 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 2000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신이 먹는다고 알려진 밀" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.ORANGE_DYE)) {
							ItemStack var1 = new ItemStack(Material.WHEAT);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "윤기가 나는 밀");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "윤기가 나는 밀" + ChatColor.WHITE + "을 획득했다.");
						}
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "에포나의 낫")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "윤기가 나는 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "윤기가 나는 밀" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 먹는다고 알려진 밀");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 2000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신이 먹는다고 알려진 밀" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.ORANGE_DYE)) {
							ItemStack var1 = new ItemStack(Material.WHEAT);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "윤기가 나는 밀");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "윤기가 나는 밀" + ChatColor.WHITE + "을 획득했다.");
						}
					}
				} else {
					player.sendMessage("낫을 이용해 채집할 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_GRASS_BREAK, 0.3f, 1.0f);
				
				if(loc.getX() <= 612 && loc.getZ() <= -1572
						&& loc.getX() >= 574 && loc.getZ() >= -1615) {
					if(rnd.nextInt(100) == 0) {
						Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
						Block wheat = chestLoc.getBlock();
						Chest chest = (Chest) wheat.getState();
						ItemStack weapon = chest.getInventory().getItem(1);
						player.getInventory().addItem(weapon);
						player.sendMessage(ChatColor.AQUA + "이상한 씨앗" + ChatColor.WHITE + "을 획득했다.");
						
						try {
							QuestBoard cb = new QuestBoard();
							if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===이베르모어3===")) {
								int qNum = cb.getNum(player);
								cb.mq52_2(player, qNum + 1);
							}
						} catch(Exception e) {
							
						}
						
					}
				}
				
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
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "낡은 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "흠집이 생긴 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.GRAY + "흠집이 생긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.COAL_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.GRAY + "흠집이 생긴 석탄 광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 1);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.GRAY + "흠집이 생긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 1, 0);
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "흠집이 생긴 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.GRAY + "흠집이 생긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.WHITE + "석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.COAL_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.GRAY + "흠집이 생긴 석탄 광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 1);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.GRAY + "흠집이 생긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 2, 0);
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "수제 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.WHITE + "석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "깨끗한 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "깨끗한 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.COAL_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.WHITE + "석탄 광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 30000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.WHITE + "석탄 광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 3, 0);
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "유명한 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "깨끗한 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "깨끗한 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.COAL_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.YELLOW + "깨끗한 석탄 광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 150000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.YELLOW + "깨끗한 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 4, 0);
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "마스터 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "절대적인 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "절대적인 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.COAL_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 5000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 5, 0);
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "신의 곡괭이")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "절대적인 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "절대적인 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.COAL_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "절대적인 석탄 광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "절대적인 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 6, 0);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "절대적인 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 석탄 광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.COAL_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "절대적인 석탄 광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "절대적인 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 7, 0);
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 0.3f, 1.0f);
				
				int num = rnd.nextInt(60);
				if(num == 0) {
					block.setType(Material.STONE);
					reload(Material.COAL_ORE, block.getLocation());
				}
				
				return false;
			} else {
				player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.WHITE + "상태가 좋지 않은 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.IRON_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.WHITE + "상태가 좋지 않은 철광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 30000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.WHITE + "상태가 좋지 않은 철광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 2, 1);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.WHITE + "상태가 좋지 않은 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "철광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.IRON_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.WHITE + "상태가 좋지 않은 철광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 30000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.WHITE + "상태가 좋지 않은 철광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 3, 1);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "빛이나는 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "빛이나는 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.IRON_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.YELLOW + "철광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 150000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.YELLOW + "철광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 4, 1);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "빛이나는 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "순백의 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "순백의 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.IRON_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "빛이나는 철광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 5000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.LIGHT_PURPLE + "빛이나는 철광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 5, 1);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "순백의 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.IRON_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "순백의 철광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "순백의 철광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 6, 1);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "순백의 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 철광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 철광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.IRON_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "순백의 철광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "순백의 철광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 7, 1);
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 0.3f, 1.0f);
				
				int num = rnd.nextInt(55);
				if(num == 0) {
					block.setType(Material.STONE);
					reload(Material.IRON_ORE, block.getLocation());
				}
				
				return false;
			} else {
				player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "가치가 떨어진 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.GOLD_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.YELLOW + "가치가 떨어진 금광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 150000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.YELLOW + "가치가 떨어진 금광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 3, 2);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "가치가 떨어진 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "금광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.GOLD_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.YELLOW + "가치가 떨어진 금광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 150000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.YELLOW + "가치가 떨어진 금광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 4, 2);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "금광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "쉽게 녹지 않는 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "쉽게 녹지 않는 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.GOLD_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "금광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 5000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.LIGHT_PURPLE + "금광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 5, 2);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "쉽게 녹지 않는 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.GOLD_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "쉽게 녹지 않는 금광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "쉽게 녹지 않는 금광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 6, 2);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "쉽게 녹지 않는 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 금광석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 금광석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.GOLD_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "쉽게 녹지 않는 금광석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "쉽게 녹지 않는 금광석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 7, 2);
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 0.3f, 1.0f);
				
				int num = rnd.nextInt(45);
				if(num == 0) {
					block.setType(Material.STONE);
					reload(Material.GOLD_ORE, block.getLocation());
				}
				
				return false;
			} else {
				player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 5000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 4, 3);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 5000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 5, 3);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 19) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 24) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "빛나는 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.giveExp(160);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "빛나는 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 25) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 5000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 6, 3);
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 19) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 24) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "빛나는 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.giveExp(160);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "빛나는 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 25) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드 원석");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 5000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + "을 획득했다.");
						}
					}
					giveJewel(player, 7, 3);
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 0.3f, 1.0f);
				
				int num = rnd.nextInt(40);
				if(num == 0) {
					block.setType(Material.STONE);
					reload(Material.DIAMOND_ORE, block.getLocation());
				}
				
				return false;
			} else {
				player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "유명한 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(11) + 5;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "마스터 대장장이의 곡괭이")) {
					int num1 = rnd.nextInt(21) + 10;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "신의 곡괭이")) {
					int num1 = rnd.nextInt(31) + 30;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "게브네의 곡괭이")) {
					int num1 = rnd.nextInt(11) + 50;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						player.sendMessage("에메랄드 " + num1 + "개를 획득했다.");
					}
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 0.3f, 1.0f);
				
				int num = rnd.nextInt(50);
				if(num == 0) {
					block.setType(Material.STONE);
					reload(Material.EMERALD_ORE, block.getLocation());
				}
				
				return false;
			} else {
				player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.GRAY + "깨질 듯한 석영" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.QUARTZ);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.GRAY + "깨질 듯한 석영");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 10);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.GRAY + "깨질 듯한 석영" + ChatColor.WHITE + "을 획득했다.");
						}
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.GRAY + "깨질 듯한 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.WHITE + "석영" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.QUARTZ);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.GRAY + "깨질 듯한 석영");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 10);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.GRAY + "깨질 듯한 석영" + ChatColor.WHITE + "을 획득했다.");
						}
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.WHITE + "석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "반듯한 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "반듯한 석영" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.QUARTZ);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.WHITE + "석영");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 30000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.WHITE + "석영" + ChatColor.WHITE + "을 획득했다.");
						}
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.YELLOW + "반듯한 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "매혹적인 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "매혹적인 석영" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.QUARTZ);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.YELLOW + "반듯한 석영");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 150000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.YELLOW + "반듯한 석영" + ChatColor.WHITE + "을 획득했다.");
						}
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.LIGHT_PURPLE + "매혹적인 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "보석같은 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "보석같은 석영" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.QUARTZ);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "매혹적인 석영");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 5000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.LIGHT_PURPLE + "매혹적인 석영" + ChatColor.WHITE + "을 획득했다.");
						}
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "보석같은 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 23) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 석영" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.QUARTZ);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "보석같은 석영");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "보석같은 석영" + ChatColor.WHITE + "을 획득했다.");
						}
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
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.AQUA + "보석같은 석영" + ChatColor.WHITE + "을 획득했다.");
					} else if (num1 <= 23) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신의 힘이 담긴 석영");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
						sendMessage(player, ChatColor.DARK_RED + "신의 힘이 담긴 석영" + ChatColor.WHITE + "을 획득했다.");
					} else {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							ItemStack var1 = new ItemStack(Material.QUARTZ);
							ItemMeta var1Im = var1.getItemMeta();
							var1Im.setDisplayName(ChatColor.AQUA + "보석같은 석영");
							var1.setItemMeta(var1Im);
							player.getInventory().addItem(var1);
							//es.giveExp(player, 8000000);
							player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.3f, 1.0f);
							sendMessage(player, ChatColor.AQUA + "보석같은 석영" + ChatColor.WHITE + "을 획득했다.");
						}
					}
				} else {
					player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 0.3f, 1.0f);
				
				int num = rnd.nextInt(50);
				if(num == 0) {
					block.setType(Material.NETHERRACK);
					reload(Material.NETHER_QUARTZ_ORE, block.getLocation());
				}
				
				return false;
			} else {
				player.sendMessage("곡괭이로 캘 수 있을 것 같다.");
				return false;
			}
		}
		return true;
	}
	
	public void giveJewel(Player player, int rank, int type) {
		int p = 1000000;
		if(type == 0) {
			p = rnd.nextInt(1000000);
		} else if(type == 1) {
			p = rnd.nextInt(800000);
		} else if(type == 2) {
			p = rnd.nextInt(600000);
		} else if(type == 3) {
			p = rnd.nextInt(500000);
		}
		
		if(rank == 1) {
			if(p < 1000) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.GRAY + "빛바랜 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "오랜 세월 잠식되어 있던 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "아쉽게도 강자의 영혼은 아닌듯 하다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.GRAY + "빛바랜 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1500) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.WHITE + "부서진 수호자의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "변질된 수호자의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "부서져버려 힘이 흩어져 버렸다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.WHITE + "부서진 수호자의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1750) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.YELLOW + "고대의 자수정 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "고대의 영혼이 자수정 안에 잠든 보석");
				var1Lore.add(ChatColor.GRAY + "꽤나 쓸만한 영혼이 담겨있다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.YELLOW + "고대의 자수정 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1800) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "불길한 운명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "상급 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "집어드는 것만으로도 소름이 끼친다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.LIGHT_PURPLE + "불길한 운명의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1820) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.AQUA + "망가진 마법사의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "마나를 쓰는 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "기분 나쁜 검은 마나가 느껴진다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.AQUA + "망가진 마법사의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1821) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_RED + "영롱한 여명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "포보르 왕의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "그가 가지고 있던 힘을 보여주듯이 매우 아름답다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_RED + "영롱한 여명의 보석" + ChatColor.WHITE + "을 획득했다.");
			}
		} else if(rank == 2) {
			if(p < 500) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.GRAY + "빛바랜 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "오랜 세월 잠식되어 있던 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "아쉽게도 강자의 영혼은 아닌듯 하다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.GRAY + "빛바랜 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1300) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.WHITE + "부서진 수호자의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "변질된 수호자의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "부서져버려 힘이 흩어져 버렸다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.WHITE + "부서진 수호자의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1750) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.YELLOW + "고대의 자수정 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "고대의 영혼이 자수정 안에 잠든 보석");
				var1Lore.add(ChatColor.GRAY + "꽤나 쓸만한 영혼이 담겨있다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.YELLOW + "고대의 자수정 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1830) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "불길한 운명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "상급 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "집어드는 것만으로도 소름이 끼친다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.LIGHT_PURPLE + "불길한 운명의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1870) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.AQUA + "망가진 마법사의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "마나를 쓰는 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "기분 나쁜 검은 마나가 느껴진다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.AQUA + "망가진 마법사의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1875) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_RED + "영롱한 여명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "포보르 왕의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "그가 가지고 있던 힘을 보여주듯이 매우 아름답다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_RED + "영롱한 여명의 보석" + ChatColor.WHITE + "을 획득했다.");
			}
		} else if(rank == 3) {
			if(p < 500) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.GRAY + "빛바랜 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "오랜 세월 잠식되어 있던 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "아쉽게도 강자의 영혼은 아닌듯 하다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.GRAY + "빛바랜 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1400) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.WHITE + "부서진 수호자의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "변질된 수호자의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "부서져버려 힘이 흩어져 버렸다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.WHITE + "부서진 수호자의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1800) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.YELLOW + "고대의 자수정 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "고대의 영혼이 자수정 안에 잠든 보석");
				var1Lore.add(ChatColor.GRAY + "꽤나 쓸만한 영혼이 담겨있다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.YELLOW + "고대의 자수정 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1900) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "불길한 운명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "상급 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "집어드는 것만으로도 소름이 끼친다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.LIGHT_PURPLE + "불길한 운명의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1950) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.AQUA + "망가진 마법사의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "마나를 쓰는 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "기분 나쁜 검은 마나가 느껴진다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.AQUA + "망가진 마법사의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1958) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_RED + "영롱한 여명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "포보르 왕의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "그가 가지고 있던 힘을 보여주듯이 매우 아름답다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_RED + "영롱한 여명의 보석" + ChatColor.WHITE + "을 획득했다.");
			}
		} else if(rank == 4) {
			if(p < 500) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.GRAY + "빛바랜 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "오랜 세월 잠식되어 있던 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "아쉽게도 강자의 영혼은 아닌듯 하다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.GRAY + "빛바랜 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1500) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.WHITE + "부서진 수호자의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "변질된 수호자의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "부서져버려 힘이 흩어져 버렸다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.WHITE + "부서진 수호자의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2000) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.YELLOW + "고대의 자수정 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "고대의 영혼이 자수정 안에 잠든 보석");
				var1Lore.add(ChatColor.GRAY + "꽤나 쓸만한 영혼이 담겨있다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.YELLOW + "고대의 자수정 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2150) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "불길한 운명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "상급 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "집어드는 것만으로도 소름이 끼친다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.LIGHT_PURPLE + "불길한 운명의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2280) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.AQUA + "망가진 마법사의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "마나를 쓰는 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "기분 나쁜 검은 마나가 느껴진다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.AQUA + "망가진 마법사의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2290) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_RED + "영롱한 여명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "포보르 왕의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "그가 가지고 있던 힘을 보여주듯이 매우 아름답다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_RED + "영롱한 여명의 보석" + ChatColor.WHITE + "을 획득했다.");
			}
		} else if(rank == 5) {
			if(p < 600) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.GRAY + "빛바랜 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "오랜 세월 잠식되어 있던 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "아쉽게도 강자의 영혼은 아닌듯 하다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.GRAY + "빛바랜 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1600) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.WHITE + "부서진 수호자의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "변질된 수호자의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "부서져버려 힘이 흩어져 버렸다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.WHITE + "부서진 수호자의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2150) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.YELLOW + "고대의 자수정 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "고대의 영혼이 자수정 안에 잠든 보석");
				var1Lore.add(ChatColor.GRAY + "꽤나 쓸만한 영혼이 담겨있다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.YELLOW + "고대의 자수정 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2350) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "불길한 운명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "상급 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "집어드는 것만으로도 소름이 끼친다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.LIGHT_PURPLE + "불길한 운명의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2550) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.AQUA + "망가진 마법사의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "마나를 쓰는 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "기분 나쁜 검은 마나가 느껴진다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.AQUA + "망가진 마법사의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2580) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_RED + "영롱한 여명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "포보르 왕의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "그가 가지고 있던 힘을 보여주듯이 매우 아름답다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_RED + "영롱한 여명의 보석" + ChatColor.WHITE + "을 획득했다.");
			}
		} else if(rank == 6) {
			if(p < 600) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.GRAY + "빛바랜 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "오랜 세월 잠식되어 있던 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "아쉽게도 강자의 영혼은 아닌듯 하다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.GRAY + "빛바랜 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 1600) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.WHITE + "부서진 수호자의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "변질된 수호자의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "부서져버려 힘이 흩어져 버렸다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.WHITE + "부서진 수호자의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2300) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.YELLOW + "고대의 자수정 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "고대의 영혼이 자수정 안에 잠든 보석");
				var1Lore.add(ChatColor.GRAY + "꽤나 쓸만한 영혼이 담겨있다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.YELLOW + "고대의 자수정 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2600) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "불길한 운명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "상급 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "집어드는 것만으로도 소름이 끼친다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.LIGHT_PURPLE + "불길한 운명의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2800) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.AQUA + "망가진 마법사의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "마나를 쓰는 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "기분 나쁜 검은 마나가 느껴진다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.AQUA + "망가진 마법사의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2900) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_RED + "영롱한 여명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "포보르 왕의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "그가 가지고 있던 힘을 보여주듯이 매우 아름답다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_RED + "영롱한 여명의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2901) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_PURPLE + "태양석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "태양을 창조한 신이 남긴 보석");
				var1Lore.add(ChatColor.GRAY + "이 작은 돌에 태양의 힘이 응집되어 있다고 한다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_PURPLE + "태양석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2902) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_PURPLE + "만월석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "달을 창조한 신이 남긴 보석");
				var1Lore.add(ChatColor.GRAY + "이 작은 돌에 달의 힘이 응집되어 있다고 한다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_PURPLE + "만월석" + ChatColor.WHITE + "을 획득했다.");
			}
		} else if(rank == 7) {
			if(p < 800) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.GRAY + "빛바랜 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "오랜 세월 잠식되어 있던 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "아쉽게도 강자의 영혼은 아닌듯 하다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.GRAY + "빛바랜 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2000) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.WHITE + "부서진 수호자의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "변질된 수호자의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "부서져버려 힘이 흩어져 버렸다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.WHITE + "부서진 수호자의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 2600) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.YELLOW + "고대의 자수정 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "고대의 영혼이 자수정 안에 잠든 보석");
				var1Lore.add(ChatColor.GRAY + "꽤나 쓸만한 영혼이 담겨있다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.YELLOW + "고대의 자수정 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 3100) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "불길한 운명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "상급 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "집어드는 것만으로도 소름이 끼친다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.LIGHT_PURPLE + "불길한 운명의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 3500) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.AQUA + "망가진 마법사의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "마나를 쓰는 포보르의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "기분 나쁜 검은 마나가 느껴진다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.AQUA + "망가진 마법사의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 3800) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_RED + "영롱한 여명의 보석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "포보르 왕의 영혼이 담긴 보석");
				var1Lore.add(ChatColor.GRAY + "그가 가지고 있던 힘을 보여주듯이 매우 아름답다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_RED + "영롱한 여명의 보석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 3810) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_PURPLE + "태양석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "태양을 창조한 신이 남긴 보석");
				var1Lore.add(ChatColor.GRAY + "이 작은 돌에 태양의 힘이 응집되어 있다고 한다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_PURPLE + "태양석" + ChatColor.WHITE + "을 획득했다.");
			} else if(p < 3820) {
				ItemStack var1 = new ItemStack(Material.BLACKSTONE_STAIRS);
				ItemMeta var1Im = var1.getItemMeta();
				var1Im.setDisplayName(ChatColor.DARK_PURPLE + "만월석");
				ArrayList<String> var1Lore = new ArrayList();
				var1Lore.add(ChatColor.GRAY + "달을 창조한 신이 남긴 보석");
				var1Lore.add(ChatColor.GRAY + "이 작은 돌에 달의 힘이 응집되어 있다고 한다.");
				var1Im.setLore(var1Lore);
				var1.setItemMeta(var1Im);
				player.getInventory().addItem(var1);
				sendMessage(player, ChatColor.DARK_PURPLE + "만월석" + ChatColor.WHITE + "을 획득했다.");
			}
		}
	}
	
	public void reload(Material mat, Location loc) {
		int time = rnd.nextInt(600) + 600;
		new BukkitRunnable() {
			@Override
			public void run() {
				loc.getBlock().setType(mat);
			}
		}.runTaskLater(Main.getPlugin(Main.class), time);
	}
	
}
