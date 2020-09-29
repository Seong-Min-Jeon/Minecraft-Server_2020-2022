package testPack;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapView;
import org.bukkit.map.MapView.Scale;

public class AnotherScroll {

	public void effect(Player player, Item itemArg) {
		World world = player.getWorld();
		jobRemoveScroll(player, itemArg, world);
		questRemoveScroll(player, itemArg, world);
		mapPaper(player, itemArg, world);
	}
	
	public void jobRemoveScroll(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "���� �ʱ�ȭ ��ũ��")) {
			player.getInventory().clear();
			player.kickPlayer(ChatColor.RED + "Error Code:" + ChatColor.MAGIC + " Hi My Name Is Yumehama(The God)"
					+ "\n" + ChatColor.GRAY + "����� ���� ����� ������ �����ϱ� ���� ��� �߰������ ����� �̼��Ͽ����ϴ�.");
			itemArg.remove();
		}	
	}
	
	public void questRemoveScroll(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "����Ʈ ���� ��ũ��")) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			itemArg.remove();
		}	
	}
	
	public void mapPaper(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "������ ����")) {
			Location loc = player.getLocation();
			if(loc.getX() > 3500 || loc.getZ() > 3500 || loc.getX() < -3500 || loc.getZ() < -3500) {
				player.sendMessage(ChatColor.RED + "���Ұ� �����Դϴ�.");
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
	
}
