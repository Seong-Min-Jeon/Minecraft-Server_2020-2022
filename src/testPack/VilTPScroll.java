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
		
		// ������ ����
		try {
			new BossHealth().removePlayer(player);
		} catch (Exception e) {

		}
	}

	public void wargunil(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "���״� ���� ��ũ��")) {
			World world = player.getWorld();
			// ���״�
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world, -1848, 71, 3019);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void forgan(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "������ ���� ��ũ��")) {
			World world = player.getWorld();
			// ������
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world, -1573, 53, 2458);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}

	public void tiru(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "Ƽ�� ���� ��ũ��")) {
			World world = player.getWorld();
			// Ƽ��
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world, -672, 46, 1942);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void miyu(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "��ǣ���� ���� ��ũ��")) {
			World world = player.getWorld();
			// ����
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-1143,181,1461);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void kaiman(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "ī�̸� ���� ��ũ��")) {
			World world = player.getWorld();
			// ī�̸�
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-478,55,1302);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void osu(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "���� ���� ��ũ��")) {
			World world = player.getWorld();
			// ����
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-1370,51,976);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void konno(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "�ܳ� ���� ��ũ��")) {
			World world = player.getWorld();
			// �ܳ�
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-2465,52,543);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void fuhidmeh(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "���� �� ���� ���� ��ũ��")) {
			World world = player.getWorld();
			// ���� �� ����
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-429,98,721);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void karce(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "Į�� ���� ��ũ��")) {
			World world = player.getWorld();
			// Į��
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-199,67,541);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void kuredrat(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "ũ�����Ʈ ���� ��ũ��")) {
			World world = player.getWorld();
			// ũ�����Ʈ
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,-62,55,80);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void beiag(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "���Ʊ� ���� ��ũ��")) {
			World world = player.getWorld();
			// ���Ʊ�
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,141,87,-329);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void magicTower(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "����ž ���� ��ũ��")) {
			World world = player.getWorld();
			// ����ž
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 1) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,221,81,725,90,0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
	
	public void longue(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "�հ� ���� ��ũ��")) {
			World world = player.getWorld();
			// �հ�
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
					itemIm.setDisplayName(ChatColor.RED + "��������");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
				}
			} else if (i > 5) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "����");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = new Location(world,822,71,511,270,0);
				player.teleport(loc);
				itemArg.remove();
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			} else {
				player.sendMessage(ChatColor.RED + "������ �ʿ��� ������ �����մϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}
	}
}
