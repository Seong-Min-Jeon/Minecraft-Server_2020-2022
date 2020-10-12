package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

public class INNTicket {
	
	public void sleep(Player player, Item itemArg) {
		World world = player.getWorld();
		wargunil(player, itemArg, world);
		forgan(player, itemArg, world);
		tiru(player, itemArg, world);
		kaiman(player, itemArg, world);
		osu(player, itemArg, world);
		konno(player, itemArg, world);
		fuhidmeh(player, itemArg, world);
		sitasaidi(player, itemArg, world);
		karce(player, itemArg, world);
		kuredrat(player, itemArg, world);
		beiag(player, itemArg, world);
		longue(player, itemArg, world);
	}

	public void wargunil(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "워그닐 숙박 티켓")) {
			//워그닐 -1850 74 3048 -1829 80 3056 
			if (player.getLocation().getX() <= -1829 && player.getLocation().getY() <= 80 && player.getLocation().getZ() <= 3056 && 
					player.getLocation().getX() >= -1850 && player.getLocation().getY() >= 74 && player.getLocation().getZ() >= 3048) {
				Location loc = new Location(world, -1834, 76, 3051);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void forgan(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "포르간 숙박 티켓")) {
			//포르간 -1556 50 2437  -1586 104 2423
			if (player.getLocation().getX() <= -1556 && player.getLocation().getY() <= 100 && player.getLocation().getZ() <= 2437 && 
					player.getLocation().getX() >= -1586 && player.getLocation().getY() >= 50 && player.getLocation().getZ() >= 2423) {
				Location loc = new Location(world, -1566, 61, 2441);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void tiru(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "티르 숙박 티켓")) {
			//티르 -657 42 1937  -663 42 1949
			if (player.getLocation().getX() <= -657 && player.getLocation().getY() <= 45 && player.getLocation().getZ() <= 1949 && 
					player.getLocation().getX() >= -663 && player.getLocation().getY() >= 28 && player.getLocation().getZ() >= 1937) {
				Location loc = new Location(world, -660, 43, 1945);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void kaiman(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "카이만 숙박 티켓")) {
			//카이만 -483 53 1295  -465 59 1312
			if (player.getLocation().getX() <= -465 && player.getLocation().getY() <= 59 && player.getLocation().getZ() <= 1312 && 
					player.getLocation().getX() >= -483 && player.getLocation().getY() >= 53 && player.getLocation().getZ() >= 1295) {
				Location loc = new Location(world,-478,55,1302);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void osu(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "오스 숙박 티켓")) {
			//오스 -1382 53 997  -1374 59 1002
			if (player.getLocation().getX() <= -1374 && player.getLocation().getY() <= 59 && player.getLocation().getZ() <= 1002 && 
					player.getLocation().getX() >= -1382 && player.getLocation().getY() >= 53 && player.getLocation().getZ() >= 997) {
				Location loc = new Location(world,-1377.5,55,999);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void konno(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "콘노 숙박 티켓")) {
			//콘노 -2471 79 517  -2453 50 503
			if (player.getLocation().getX() <= -2453 && player.getLocation().getY() <= 79 && player.getLocation().getZ() <= 517 && 
					player.getLocation().getX() >= -2471 && player.getLocation().getY() >= 50 && player.getLocation().getZ() >= 503) {
				Location loc = new Location(world,-2462,55,509);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void fuhidmeh(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "프휘 드 메흐 숙박 티켓")) {
			//프휘 드 메드 -431 107 754  -423 95 733
			if (player.getLocation().getX() <= -423 && player.getLocation().getY() <= 107 && player.getLocation().getZ() <= 754 && 
					player.getLocation().getX() >= -431 && player.getLocation().getY() >= 95 && player.getLocation().getZ() >= 733) {
				Location loc = new Location(world,-430,101,753);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void sitasaidi(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "시타사이디 숙박 티켓")) {
			//시타사이디 -1151 63 651  -1111 47 662
			if (player.getLocation().getX() <= -1111 && player.getLocation().getY() <= 63 && player.getLocation().getZ() <= 662 && 
					player.getLocation().getX() >= -1151 && player.getLocation().getY() >= 47 && player.getLocation().getZ() >= 651) {
				Location loc = new Location(world,-1148,55,657);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void karce(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "칼스 숙박 티켓")) {
			//칼스 -181 64 565  -193 81 552
			if (player.getLocation().getX() <= -181 && player.getLocation().getY() <= 81 && player.getLocation().getZ() <= 565 && 
					player.getLocation().getX() >= -193 && player.getLocation().getY() >= 64 && player.getLocation().getZ() >= 552) {
				Location loc = new Location(world,-182,68,562);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void kuredrat(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "크레드라트 숙박 티켓")) {
			//크레드라트 -72 56 106  -55 74 97
			if (player.getLocation().getX() <= -55 && player.getLocation().getY() <= 74 && player.getLocation().getZ() <= 106 && 
					player.getLocation().getX() >= -72 && player.getLocation().getY() >= 55 && player.getLocation().getZ() >= 97) {
				Location loc = new Location(world,-65,61,101);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void beiag(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "베아그 숙박 티켓")) {
			//베아그 131 85 -334  109 113 -316
			if (player.getLocation().getX() <= 131 && player.getLocation().getY() <= 113 && player.getLocation().getZ() <= -316 && 
					player.getLocation().getX() >= 109 && player.getLocation().getY() >= 85 && player.getLocation().getZ() >= -334) {
				Location loc = new Location(world,114,97,-331);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
	public void longue(Player player, Item itemArg, World world) {	
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "롱게 숙박 티켓")) {
			//롱게 852 63 511  823 96 548
			if (player.getLocation().getX() <= 852 && player.getLocation().getY() <= 96 && player.getLocation().getZ() <= 548 && 
					player.getLocation().getX() >= 823 && player.getLocation().getY() >= 63 && player.getLocation().getZ() >= 511) {
				Location loc = new Location(world,829,74,525);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				player.setHealth(player.getMaxHealth());
			}
		}	
	}
	
}
