package testPack;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapView;
import org.bukkit.map.MapView.Scale;

public class AnotherScroll {
	
	private int taskID;

	public void effect(Player player, Item itemArg) {
		World world = player.getWorld();
		questRemoveScroll(player, itemArg, world);
		mapPaper(player, itemArg, world);
		levelUpScroll(player, itemArg, world);
		hellsGate(player, itemArg, world);
	}
	
	public void questRemoveScroll(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트 제거 스크롤")) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			itemArg.remove();
		}	
	}
	
	public void mapPaper(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "지도용 종이")) {
			Location loc = player.getLocation();
			if(loc.getX() > 3500 || loc.getZ() > 3500 || loc.getX() < -3500 || loc.getZ() < -3500) {
				player.sendMessage(ChatColor.RED + "사용불가 지역입니다.");
				return;
			}
			
			ItemStack item = new ItemStack(Material.FILLED_MAP);
			MapMeta mm = (MapMeta) item.getItemMeta();
			mm.setLore(null);
			mm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			mm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			mm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			MapView map = Bukkit.createMap(world);
			map.setCenterX(player.getLocation().getBlockX());
			map.setCenterZ(player.getLocation().getBlockZ());
			map.setScale(Scale.NORMAL);
			map.setTrackingPosition(true);
			map.setLocked(false);
			mm.setMapView(map);
			item.setItemMeta(mm);
			player.getInventory().addItem(item);
			itemArg.remove();
		}	
	}
	
	public void levelUpScroll(Player player, Item itemArg, World world) {	
		try {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().substring(0,9).equalsIgnoreCase(ChatColor.DARK_RED + "레벨업 스크롤")) {
				itemArg.remove();
				try {
					String str = itemArg.getItemStack().getItemMeta().getDisplayName();
					int lvl = Integer.parseInt(str.split("\\.")[1].split("\\]")[0]);
					player.setLevel(lvl);
				} catch(Exception e) {
					
				}
			}	
		} catch(Exception e) {
			
		}
	}
	
	public void hellsGate(Player player, Item itemArg, World world) {	
		// 하마베 탑  997 58 -4  1008 78 7
		Location loc = player.getLocation();
		if (loc.getX() <= 1008 && loc.getY() <= 78 && loc.getZ() <= 7 
				&& loc.getX() >= 997 && loc.getY() >= 58 && loc.getZ() >= -4) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "헬즈게이트")) {
				itemArg.remove();
				
				world.getBlockAt(new Location(world, 1003, 67, 0)).setType(Material.AIR);
				world.getBlockAt(new Location(world, 1002, 67, 0)).setType(Material.AIR);
				world.getBlockAt(new Location(world, 1001, 67, 0)).setType(Material.AIR);
				world.getBlockAt(new Location(world, 1003, 67, 1)).setType(Material.AIR);
				world.getBlockAt(new Location(world, 1002, 67, 1)).setType(Material.AIR);
				world.getBlockAt(new Location(world, 1001, 67, 1)).setType(Material.AIR);
				world.getBlockAt(new Location(world, 1003, 67, 2)).setType(Material.AIR);
				world.getBlockAt(new Location(world, 1002, 67, 2)).setType(Material.AIR);
				world.getBlockAt(new Location(world, 1001, 67, 2)).setType(Material.AIR);
				
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time >= 80) {
							world.getBlockAt(new Location(world, 1003, 67, 0)).setType(Material.CHISELED_STONE_BRICKS);
							world.getBlockAt(new Location(world, 1002, 67, 0)).setType(Material.SMOOTH_STONE);
							world.getBlockAt(new Location(world, 1001, 67, 0)).setType(Material.CHISELED_STONE_BRICKS);
							world.getBlockAt(new Location(world, 1003, 67, 1)).setType(Material.SMOOTH_STONE);
							world.getBlockAt(new Location(world, 1002, 67, 1)).setType(Material.CHISELED_STONE_BRICKS);
							world.getBlockAt(new Location(world, 1001, 67, 1)).setType(Material.SMOOTH_STONE);
							world.getBlockAt(new Location(world, 1003, 67, 2)).setType(Material.CHISELED_STONE_BRICKS);
							world.getBlockAt(new Location(world, 1002, 67, 2)).setType(Material.SMOOTH_STONE);
							world.getBlockAt(new Location(world, 1001, 67, 2)).setType(Material.CHISELED_STONE_BRICKS);
							td.endTask();
							td.removeID();
						}

						time++;
					}

				}, 0, 1);
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 50.0f, 1.0f);

			}
		}
	}
	
}
