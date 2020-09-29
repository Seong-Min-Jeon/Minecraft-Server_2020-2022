package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinJob {

	public void chooseJob(Player player) {
		World world = player.getWorld();
		if(!(player.getInventory().contains(Material.RED_DYE)) && !(player.getInventory().contains(Material.GREEN_DYE)) 
				&& !(player.getInventory().contains(Material.LAPIS_LAZULI)) && !(player.getInventory().contains(Material.CYAN_DYE))
				&& !(player.getInventory().contains(Material.LIGHT_GRAY_DYE)) && !(player.getInventory().contains(Material.GRAY_DYE))
				&& !(player.getInventory().contains(Material.PINK_DYE)) && !(player.getInventory().contains(Material.LIME_DYE))
				&& !(player.getInventory().contains(Material.YELLOW_DYE)) && !(player.getInventory().contains(Material.LIGHT_BLUE_DYE))
				&& !(player.getInventory().contains(Material.MAGENTA_DYE)) && !(player.getInventory().contains(Material.ORANGE_DYE))
				&& !(player.getInventory().contains(Material.BLUE_DYE)) && !(player.getInventory().contains(Material.BROWN_DYE))
				&& !(player.getInventory().contains(Material.BLACK_DYE)) && !(player.getInventory().contains(Material.INK_SAC))
				&& !(player.getInventory().contains(Material.CLAY_BALL)) && !(player.getInventory().contains(Material.GLOWSTONE_DUST))) {
			player.teleport(new Location(world,-1870,60,3005));
			player.getInventory().clear();
			
			ItemStack star1 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star1Im = star1.getItemMeta();
			star1Im.setDisplayName(ChatColor.YELLOW + "�� �������� ��");
			ArrayList<String> star1Lore = new ArrayList();
			star1Lore.add(ChatColor.WHITE + "���� �̿��� ������ �� �� �ִ�.");
			star1Lore.add(ChatColor.WHITE + "(���� �̿��� ������ �� �� ����.)");
			star1Lore.add(ChatColor.WHITE + "ü��" + ChatColor.RED + "����������");
			star1Im.setLore(star1Lore);
			star1.setItemMeta(star1Im);
			player.getInventory().setItem(0,star1);	
			
			ItemStack star2 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star2Im = star2.getItemMeta();
			star2Im.setDisplayName(ChatColor.YELLOW + "����� ��");
			ArrayList<String> star2Lore = new ArrayList();
			star2Lore.add(ChatColor.WHITE + "�Ʊ��� ��ȯ�ϸ� �ο�� ��ä�ο� �����̴�.");
			star2Lore.add(ChatColor.WHITE + "ü��" + ChatColor.RED + "������");
			star2Im.setLore(star2Lore);
			star2.setItemMeta(star2Im);
			player.getInventory().setItem(1,star2);	
			
			ItemStack star3 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star3Im = star3.getItemMeta();
			star3Im.setDisplayName(ChatColor.YELLOW + "������Ʈ�� ��");
			ArrayList<String> star3Lore = new ArrayList();
			star3Lore.add(ChatColor.WHITE + "ȸ�� ����� ����ϸ� �ο� �� �ִ� �����̴�.");
			star3Lore.add(ChatColor.WHITE + "ü��" + ChatColor.RED + "��������");
			star3Im.setLore(star3Lore);
			star3.setItemMeta(star3Im);
			player.getInventory().setItem(2,star3);
			
			ItemStack star4 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star4Im = star4.getItemMeta();
			star4Im.setDisplayName(ChatColor.YELLOW + "�������� ��");
			ArrayList<String> star4Lore = new ArrayList();
			star4Lore.add(ChatColor.WHITE + "ü���� ������ �����Ҽ��� ���� ��������.");
			star4Lore.add(ChatColor.WHITE + "ü��" + ChatColor.RED + "��");
			star4Im.setLore(star4Lore);
			star4.setItemMeta(star4Im);
			player.getInventory().setItem(3,star4);
			
			ItemStack star5 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star5Im = star5.getItemMeta();
			star5Im.setDisplayName(ChatColor.YELLOW + "���ڻ��� ��");
			ArrayList<String> star5Lore = new ArrayList();
			star5Lore.add(ChatColor.WHITE + "� ���и� �Ŵ� �����̴�.");
			star5Lore.add(ChatColor.WHITE + "ü��" + ChatColor.RED + "����������");
			star5Im.setLore(star5Lore);
			star5.setItemMeta(star5Im);
			player.getInventory().setItem(4,star5);
			
			if(player.getDisplayName().equals("yumehama") || player.getDisplayName().equalsIgnoreCase("woolring")) {
				ItemStack star6 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star6Im = star6.getItemMeta();
				star6Im.setDisplayName(ChatColor.AQUA + "������ ��");
				ArrayList<String> star6Lore = new ArrayList();
				star6Lore.add(ChatColor.WHITE + "������ ���� ���� �� �ִ�.");
				star6Im.setLore(star6Lore);
				star6.setItemMeta(star6Im);
				player.getInventory().setItem(5,star6);
				
				ItemStack star7 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star7Im = star7.getItemMeta();
				star7Im.setDisplayName(ChatColor.AQUA + "������ ��");
				ArrayList<String> star7Lore = new ArrayList();
				star7Lore.add(ChatColor.WHITE + "������ ���� ���� �� �ִ�.");
				star7Im.setLore(star7Lore);
				star7.setItemMeta(star7Im);
				player.getInventory().setItem(6,star7);
				
				ItemStack star8 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star8Im = star8.getItemMeta();
				star8Im.setDisplayName(ChatColor.AQUA + "�������� ��");
				ArrayList<String> star8Lore = new ArrayList();
				star8Lore.add(ChatColor.WHITE + "���� ���� ���� �ο� �� �ִ�.");
				star8Im.setLore(star8Lore);
				star8.setItemMeta(star8Im);
				player.getInventory().setItem(7,star8);
				
				ItemStack star9 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star9Im = star9.getItemMeta();
				star9Im.setDisplayName(ChatColor.LIGHT_PURPLE + "�׸��� ������ ��");
				ArrayList<String> star9Lore = new ArrayList();
				star9Lore.add(ChatColor.WHITE + "���� ���������� ���� ������ �� �ִ�.");
				star9Im.setLore(star9Lore);
				star9.setItemMeta(star9Im);
				player.getInventory().setItem(8,star9);
				
				ItemStack star10 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star10Im = star10.getItemMeta();
				star10Im.setDisplayName(ChatColor.LIGHT_PURPLE + "����Ŀ�� ��");
				ArrayList<String> star10Lore = new ArrayList();
				star10Lore.add(ChatColor.WHITE + "�е����� ������ ���� ������ �� �ִ�.");
				star10Im.setLore(star10Lore);
				star10.setItemMeta(star10Im);
				player.getInventory().setItem(9,star10);
				
				ItemStack star11 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star11Im = star11.getItemMeta();
				star11Im.setDisplayName(ChatColor.LIGHT_PURPLE + "������ ��");
				ArrayList<String> star11Lore = new ArrayList();
				star11Lore.add(ChatColor.WHITE + "�����ְ� ä���� �� �� �ִ� �����̴�.");
				star11Lore.add(ChatColor.WHITE + "(��� �̿��� ��������� ������ �� �� ����.)");
				star11Im.setLore(star11Lore);
				star11.setItemMeta(star11Im);
				player.getInventory().setItem(10,star11);
				
				ItemStack star12 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star12Im = star12.getItemMeta();
				star12Im.setDisplayName(ChatColor.LIGHT_PURPLE + "�׸� ������ ��");
				ArrayList<String> star12Lore = new ArrayList();
				star12Lore.add(ChatColor.WHITE + "���� ��� �ο�� ����� �ļ��� �ȴ�.");
				star12Lore.add(ChatColor.WHITE + "(�ٸ� ���⸦ �̿��� ������ �� �� ����.)");
				star12Im.setLore(star12Lore);
				star12.setItemMeta(star12Im);
				player.getInventory().setItem(11,star12);
				
				ItemStack star13 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star13Im = star13.getItemMeta();
				star13Im.setDisplayName(ChatColor.DARK_RED + "������ ��");
				ArrayList<String> star13Lore = new ArrayList();
				star13Lore.add(ChatColor.WHITE + "������ ������ ����ϴ� ������ ������ �ȴ�.");
				star13Im.setLore(star13Lore);
				star13.setItemMeta(star13Im);
				player.getInventory().setItem(12,star13);
				
				ItemStack star14 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star14Im = star14.getItemMeta();
				star14Im.setDisplayName(ChatColor.DARK_RED + "�ȶ���� ��");
				ArrayList<String> star14Lore = new ArrayList();
				star14Lore.add(ChatColor.WHITE + "���� ������ �ȶ���� �Ǿ� ������ �� �ִ�.");
				star14Im.setLore(star14Lore);
				star14.setItemMeta(star14Im);
				player.getInventory().setItem(13,star14);
				
				ItemStack star15 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star15Im = star15.getItemMeta();
				star15Im.setDisplayName(ChatColor.DARK_RED + "������ ��");
				ArrayList<String> star15Lore = new ArrayList();
				star15Lore.add(ChatColor.WHITE + "���� ���� ����� �� �ִ�.");
				star15Im.setLore(star15Lore);
				star15.setItemMeta(star15Im);
				player.getInventory().setItem(14,star15);
				
				ItemStack star16 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star16Im = star16.getItemMeta();
				star16Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��ó�� ��");
				ArrayList<String> star16Lore = new ArrayList();
				star16Lore.add(ChatColor.WHITE + "Ȱ�� Ưȭ�� �����̴�.");
				star16Im.setLore(star16Lore);
				star16.setItemMeta(star16Im);
				player.getInventory().setItem(15,star16);
			}
			
//			if(player.getDisplayName().equals("WoolRing")) {
//				ItemStack star16 = new ItemStack(Material.NETHER_STAR);
//				ItemMeta star16Im = star16.getItemMeta();
//				star16Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��ó�� ��");
//				ArrayList<String> star16Lore = new ArrayList();
//				star16Lore.add(ChatColor.WHITE + "Ȱ�� Ưȭ�� �����̴�.");
//				star16Im.setLore(star16Lore);
//				star16.setItemMeta(star16Im);
//				player.getInventory().setItem(15,star16);
//			}
		}
	}
}
