package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ChangeJob {

	public void changeJob1(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Change Job");
		
		ItemStack star9 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star9Im = star9.getItemMeta();
		star9Im.setDisplayName(ChatColor.LIGHT_PURPLE + "�׸��� ������ ��");
		ArrayList<String> star9Lore = new ArrayList();
		star9Lore.add(ChatColor.WHITE + "���� ���������� ���� ������ �� �ִ�.");
		star9Im.setLore(star9Lore);
		star9.setItemMeta(star9Im);
		
		ItemStack star10 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star10Im = star10.getItemMeta();
		star10Im.setDisplayName(ChatColor.LIGHT_PURPLE + "����Ŀ�� ��");
		ArrayList<String> star10Lore = new ArrayList();
		star10Lore.add(ChatColor.WHITE + "�е����� ������ ���� ������ �� �ִ�.");
		star10Im.setLore(star10Lore);
		star10.setItemMeta(star10Im);
		
		ItemStack star11 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star11Im = star11.getItemMeta();
		star11Im.setDisplayName(ChatColor.LIGHT_PURPLE + "������ ��");
		ArrayList<String> star11Lore = new ArrayList();
		star11Lore.add(ChatColor.WHITE + "�����ְ� ä���� �� �� �ִ� �����̴�.");
		star11Lore.add(ChatColor.WHITE + "(��� �̿��� ��������� ������ �� �� ����.)");
		star11Im.setLore(star11Lore);
		star11.setItemMeta(star11Im);
		
		ItemStack star12 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star12Im = star12.getItemMeta();
		star12Im.setDisplayName(ChatColor.LIGHT_PURPLE + "�׸� ������ ��");
		ArrayList<String> star12Lore = new ArrayList();
		star12Lore.add(ChatColor.WHITE + "���� ��� �ο�� ����� �ļ��� �ȴ�.");
		star12Lore.add(ChatColor.WHITE + "(�� �̿��� ��������� ������ �� �� ����.)");
		star12Im.setLore(star12Lore);
		star12.setItemMeta(star12Im);
		
		ItemStack star16 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star16Im = star16.getItemMeta();
		star16Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��ó�� ��");
		ArrayList<String> star16Lore = new ArrayList();
		star16Lore.add(ChatColor.WHITE + "Ȱ�� Ưȭ�� �����̴�.");
		star16Im.setLore(star16Lore);
		star16.setItemMeta(star16Im);
		
		ItemStack star17 = new ItemStack(Material.SHULKER_SHELL);
		ItemMeta star17Im = star17.getItemMeta();
		star17Im.setDisplayName(ChatColor.WHITE + "���ư���");
		star17.setItemMeta(star17Im);
		
		inv.setItem(0, star9);
		inv.setItem(1, star10);
		inv.setItem(2, star11);
		inv.setItem(3, star12);
		inv.setItem(4, star16);
		
		inv.setItem(8, star17);
		
		player.openInventory(inv);
	}
	
}
