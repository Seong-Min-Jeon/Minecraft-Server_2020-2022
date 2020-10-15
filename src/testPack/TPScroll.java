package testPack;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

public class TPScroll {
	
	public void teleport(Player player, Item itemArg) {
		World world = player.getWorld();
		ticket1(player, itemArg, world);
		ticket2(player, itemArg, world);
		ticket3(player, itemArg, world);
		ticket4(player, itemArg, world);
		ticket5(player, itemArg, world);
		ticket6(player, itemArg, world);
		
		// 보스바 관련
		try {
			new BossHealth().removePlayer(player);
		} catch (Exception e) {

		}
	}
	
	public void ticket1(Player player, Item itemArg, World world) {
		// 워그닐->대륙  -1936 51 3013  -1941 57 3002
		Location loc = player.getLocation();
		if (loc.getX() <= -1936 && loc.getY() <= 57 && loc.getZ() <= 3013 && 
				loc.getX() >= -1941 && loc.getY() >= 51 && loc.getZ() >= 3002) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "대륙행 티켓")) {
				itemArg.remove();				
				Location loc3 = new Location(world, -1880, 52, 2714);
				List<Entity> list = player.getNearbyEntities(10, 10, 10);
				for(Entity e : list) {
					if(e instanceof Player) {					
						Location loc2 = e.getLocation();
						if(loc2.getX() <= -1936 && loc2.getY() <= 57 && loc2.getZ() <= 3013 && 
								loc2.getX() >= -1941 && loc2.getY() >= 51 && loc2.getZ() >= 3002) {
							e.teleport(loc3);
						}
					}
				}
				player.teleport(loc3);
				player.getWorld().playSound(loc3, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				
			}
		}
	}
	
	public void ticket2(Player player, Item itemArg, World world) {
		// 대륙->워그닐  -1882 49 2707  -1879 57 2719
		Location loc = player.getLocation();
		if (loc.getX() <= -1879 && loc.getY() <= 57 && loc.getZ() <= 2719 && 
				loc.getX() >= -1882 && loc.getY() >= 49 && loc.getZ() >= 2707) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "워그닐행 티켓")) {
				itemArg.remove();				
				Location loc3 = new Location(world, -1938, 53, 3007);
				List<Entity> list = player.getNearbyEntities(10, 10, 10);
				for(Entity e : list) {
					if(e instanceof Player) {					
						Location loc2 = e.getLocation();
						if(loc2.getX() <= -1879 && loc2.getY() <= 57 && loc2.getZ() <= 2719 && 
								loc2.getX() >= -1882 && loc2.getY() >= 49 && loc2.getZ() >= 2707) {
							e.teleport(loc3);
						}
					}
				}
				player.teleport(loc3);
				player.getWorld().playSound(loc3, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			}
		}
	}
	
	public void ticket3(Player player, Item itemArg, World world) {
		// 오스->아란모어 -1379 91 903  -1388 48 871
		Location loc = player.getLocation();
		if (loc.getX() <= -1379 && loc.getY() <= 91 && loc.getZ() <= 903 && 
				loc.getX() >= -1388 && loc.getY() >= 48 && loc.getZ() >= 871) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "아란모어행 티켓")) {
				itemArg.remove();				
				Location loc3 = new Location(world, -1927, 53, 451);
				List<Entity> list = player.getNearbyEntities(10, 10, 10);
				for(Entity e : list) {
					if(e instanceof Player) {					
						Location loc2 = e.getLocation();
						if(loc2.getX() <= -1379 && loc2.getY() <= 91 && loc2.getZ() <= 903 && 
								loc2.getX() >= -1388 && loc2.getY() >= 48 && loc2.getZ() >= 871) {
							e.teleport(loc3);
						}
					}
				}
				player.teleport(loc3);
				player.getWorld().playSound(loc3, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				
			}
		}
	}
	
	public void ticket4(Player player, Item itemArg, World world) {
		// 아란모어->오스  -1939 91 449  -1908 48 438
		Location loc = player.getLocation();
		if (loc.getX() <= -1908 && loc.getY() <= 91 && loc.getZ() <= 449 && 
				loc.getX() >= -1939 && loc.getY() >= 48 && loc.getZ() >= 438) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "오스행 티켓")) {
				itemArg.remove();				
				Location loc3 = new Location(world, -1377, 53, 889);
				List<Entity> list = player.getNearbyEntities(10, 10, 10);
				for(Entity e : list) {
					if(e instanceof Player) {					
						Location loc2 = e.getLocation();
						if(loc2.getX() <= -1908 && loc2.getY() <= 91 && loc2.getZ() <= 449 && 
								loc2.getX() >= -1939 && loc2.getY() >= 48 && loc2.getZ() >= 438) {
							e.teleport(loc3);
						}
					}
				}
				player.teleport(loc3);
				player.getWorld().playSound(loc3, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			}
		}
	}
	
	public void ticket5(Player player, Item itemArg, World world) {
		// 아란모어 숨겨진 장소 -2318 203 630  -2345 255 664
		Location loc = player.getLocation();
		if (loc.getX() <= -2318 && loc.getY() <= 255 && loc.getZ() <= 664 && 
				loc.getX() >= -2345 && loc.getY() >= 203 && loc.getZ() >= 630) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "성스러운 통행증")) {
				QuestBoard cb = new QuestBoard();
				if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 보물2===")) {
					itemArg.remove();				
					Location loc3 = new Location(world, -1994, 88, 139);
					player.teleport(loc3);
					player.getWorld().playSound(loc3, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
					int qNum = cb.getNum(player);
					cb.mq26(player, qNum + 1);
				}
			}
		}
	}
	
	public void ticket6(Player player, Item itemArg, World world) {
		// 미궁
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "미궁 워프 스크롤")) {
			if(player.getLevel() >= 340) {
				itemArg.remove();	
				Location loc = new Location(world, 96.5, 54, 695.5, 180, 0);
				player.teleport(loc);
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "이 아이템을 사용하기에는 레벨이 낮다.");
			}
			
		}
	}
}
