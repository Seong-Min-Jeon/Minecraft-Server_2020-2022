package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Transcendence {

	public void transcendence(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		t(player, is1, is2, inv);
	}
	
	public void t(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "���� ������ ��ǥ")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "���� �������� ��")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.ACACIA_LEAVES);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("50,0,0,50,0,0,0,0,0,0,100");
				weaponIm.setDisplayName(ChatColor.AQUA + "���� ���� ������ ��");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "���� ����: 100");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "���� ���� ���θ��� ���� �� �ִ� ��");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "��� �ʿ��� �����Ͽ����ϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "���ǿ� �´� ���, ���縦 �־��ּ���.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "���� ��")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "����� ��")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("100,40,0,0,0,30,0,10,10,70,100");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "���� ���� ��� ��");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "���� ����: 100");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "���� ���⸦ ���� ����� ��");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "��� �ʿ��� �����Ͽ����ϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "���ǿ� �´� ���, ���縦 �־��ּ���.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "�¾��� ��")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "����� ��")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("100,0,40,0,0,30,10,0,10,70,100");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "�¾��� ���� ��� ��");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "���� ����: 100");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "�¾��� ���⸦ ���� ����� ��");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "��� �ʿ��� �����Ͽ����ϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "���ǿ� �´� ���, ���縦 �־��ּ���.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "���� ������")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "���� ���� ��� ��")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("200,100,100,100,0,0,0,0,0,100,240");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "���� ���� ��� ��+");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "���� ����: 240");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "���� ���⸦ ���� ����� ��");
				weaponLore.add(ChatColor.GRAY + "�����̸� ��ü�� ���� ��������.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "��� �ʿ��� �����Ͽ����ϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "���ǿ� �´� ���, ���縦 �־��ּ���.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "���� ������")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "�¾��� ���� ��� ��")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("150,0,0,0,0,100,100,100,100,100,240");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "�¾��� ���� ��� ��+");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "���� ����: 240");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "�¾��� ���⸦ ���� ����� ��");
				weaponLore.add(ChatColor.GRAY + "�����̸� ��ü�� ���� ��������.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "��� �ʿ��� �����Ͽ����ϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "���ǿ� �´� ���, ���縦 �־��ּ���.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "ũ����Ż������ �ֱ�")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "����ȭ�� ��")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.SPRUCE_PLANKS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("300,0,0,100,300,200,100,0,0,0,250");
				weaponIm.setDisplayName(ChatColor.DARK_RED + "��ũ ���޼�");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "���� ����: 250");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "ũ����Ż������ �ֱ��� ������� ����");
				weaponLore.add(ChatColor.GRAY + "�̸��� ���� '����� ����ġ�� ��'�̴�.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "��� �ʿ��� �����Ͽ����ϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "���ǿ� �´� ���, ���縦 �־��ּ���.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "����� ������")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "����� ��")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("300,100,100,100,100,100,100,100,100,100,250");
				weaponIm.setDisplayName(ChatColor.GREEN + "Ȳȥ�� ��� ��");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "���� ����: 250");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "Ȳȥ�� ���迡�� �߰��� ������ ��ȭ�� ����� ��");
				weaponLore.add(ChatColor.GRAY + "����� ���� ���� ����� �� �ϳ���");
				weaponLore.add(ChatColor.GRAY + "�ִ�ġ�� ��� �� �ϴ�.");
				weaponLore.add(ChatColor.GRAY + "(��Ʈ ������)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "��� �ʿ��� �����Ͽ����ϴ�.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "���ǿ� �´� ���, ���縦 �־��ּ���.");
		}
	}
	
	public String makeEnch(String[] ary, String str, int num) {
		String result = "";
		for(int i = 0 ; i < 10 ; i++) {
			if(i == num) {
				result = result + "," + str;
				continue;
			}
			result = result + "," + ary[i];
		}
		String data = result.substring(1);
		return data;
	}
	
}
