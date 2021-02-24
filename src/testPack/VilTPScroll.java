package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class VilTPScroll {
	
	public void vilTP(Player player, Item itemArg) {
		wargunil(player, itemArg);
		forgan(player, itemArg);
		tiru(player, itemArg);
		miyu(player, itemArg);
		kaiman(player, itemArg);
		osu(player, itemArg);
		konno(player, itemArg);
		fuhidmeh(player, itemArg);
		karce(player,itemArg);
		kuredrat(player,itemArg);
		beiag(player,itemArg);
		magicTower(player, itemArg);
		longue(player, itemArg);
		hamabe(player, itemArg);
		colosseum(player, itemArg);
		kekktas(player, itemArg);
	}

	public void wargunil(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "워그닐 워프 스크롤")) {
			World world = player.getWorld();
			// 워그닐
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
				Location loc = new Location(world, -1848, 71, 3019);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world, -1848, 71, 3019);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void forgan(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "포르간 워프 스크롤")) {
			World world = player.getWorld();
			// 포르간
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
				Location loc = new Location(world, -1573, 53, 2458);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world, -1573, 53, 2458);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}

	public void tiru(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "티르 워프 스크롤")) {
			World world = player.getWorld();
			// 티르
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
				Location loc = new Location(world, -672, 46, 1942);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world, -672, 46, 1942);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void miyu(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "미푀르유 워프 스크롤")) {
			World world = player.getWorld();
			// 미유
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
				Location loc = new Location(world,-1143,181,1461);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-1143,181,1461);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void kaiman(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "카이만 워프 스크롤")) {
			World world = player.getWorld();
			// 카이만
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
				Location loc = new Location(world,-478,55,1302);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-478,55,1302);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void osu(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "오스 워프 스크롤")) {
			World world = player.getWorld();
			// 오스
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
				Location loc = new Location(world,-1370,51,976);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-1370,51,976);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void konno(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "콘노 워프 스크롤")) {
			World world = player.getWorld();
			// 콘노
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
				Location loc = new Location(world,-2465,52,543);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-2465,52,543);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void fuhidmeh(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "프휘 드 메흐 워프 스크롤")) {
			World world = player.getWorld();
			// 프휘 드 메흐
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
				Location loc = new Location(world,-429,98,721);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-429,98,721);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void karce(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "칼스 워프 스크롤")) {
			World world = player.getWorld();
			// 칼스
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
				Location loc = new Location(world,-199,67,541);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-199,67,541);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void kuredrat(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "크레드라트 워프 스크롤")) {
			World world = player.getWorld();
			// 크레드라트
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
				Location loc = new Location(world,-62,55,80);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-62,55,80);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void beiag(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "베아그 워프 스크롤")) {
			World world = player.getWorld();
			// 베아그
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
				Location loc = new Location(world,141,87,-329);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,141,87,-329);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void magicTower(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "마법탑 워프 스크롤")) {
			World world = player.getWorld();
			// 마법탑
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if (i == 1) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				Location loc = new Location(world,221,81,725,90,0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 1) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,221,81,725,90,0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void longue(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "롱게 워프 스크롤")) {
			World world = player.getWorld();
			// 롱게
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
				Location loc = new Location(world,822,71,511,270,0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,822,71,511,270,0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void hamabe(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "하마베 워프 스크롤")) {
			World world = player.getWorld();
			// 하마베
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
				Location loc = new Location(world,973,62,40,180,0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,973,62,40,180,0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void colosseum(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "투기장 워프 스크롤")) {
			World world = player.getWorld();
			// 투기장
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
				Location loc = new Location(world,128, 64, 1955, 90, 0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,128, 64, 1955, 90, 0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
	public void kekktas(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "캑터스 워프 스크롤")) {
			World world = player.getWorld();
			// 캑터스
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
				Location loc = new Location(world,-741,56,-894);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
					ItemStack item = new ItemStack(Material.MAGMA_CREAM);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.RED + "마나없음");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-741,56,-894);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "워프에 필요한 마나가 부족합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
			}
		}
	}
	
}
