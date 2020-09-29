package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FantasyLife {

	Random rnd = new Random();
	ExpSystem es = new ExpSystem();
	
	public boolean fantasyLift(Player player, Block block, Location loc) {
		if(wheat(player, block, loc) && coal(player, block, loc) && iron(player, block, loc) && gold(player, block, loc) &&
				dia(player, block, loc) && eme(player, block, loc) && quartz(player, block, loc)) {
			return true;
		} 
		return false;
	}

	public boolean wheat(Player player, Block block, Location loc) {
		// �� �̺�Ʈ
		if (block.getType() == Material.WHEAT) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "���� ��")) {
					int num1 = rnd.nextInt(10);
					if (num1 == 0) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "��ó�� ���� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "��ó�� ���� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ��")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "��ó�� ���� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "��ó�� ���� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "���� ���� ��")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "���� ����ᰡ �� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "���� ����ᰡ �� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "����� ��")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "���� ����ᰡ �� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "���� ����ᰡ �� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "������ ������ �߸� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "������ ������ �߸� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "������ ����� ��")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "������ ������ �߸� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "������ ������ �߸� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���Ⱑ ���� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���Ⱑ ���� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "���� ��")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���Ⱑ ���� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���Ⱑ ���� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� �Դ´ٰ� �˷��� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 2000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� �Դ´ٰ� �˷��� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "�������� ��")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���Ⱑ ���� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���Ⱑ ���� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.WHEAT);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� �Դ´ٰ� �˷��� ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 2000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� �Դ´ٰ� �˷��� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("���� �̿��� ä���� �� ���� �� ����.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_GRASS_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("�Ǽ����� ä���� �Ͻôٴ� �������̽ʴϱ�? ���� ��� �Ͻʼ�.");
				return false;
			}
		}
		return true;
	}

	public boolean coal(Player player, Block block, Location loc) {
		// ��ź�̺�Ʈ
		if (block.getType() == Material.COAL_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "���� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "������ ���� ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "������ ���� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "������ ���� ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 1);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "������ ���� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "���� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "������ ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "������ ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "������ ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "������ ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "�������� ���� ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "�������� ���� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "�������� ���� ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "�������� ���� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "�������� ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "�������� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "���� ���")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "�������� ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "�������� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "�Ժ���� ���")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "�������� ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "�������� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.COAL_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� ��ź ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("��̷� Ķ �� ���� �� ����.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("�Ǽ����� ������ ĳ�ٴ� �������̽ʴϱ�? ��̸� ��� �Ͻʼ�.");
				return false;
			}
		}
		return true;
	}

	public boolean iron(Player player, Block block, Location loc) {
		// ö�̺�Ʈ
		if (block.getType() == Material.IRON_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "���� ���")) {
					player.sendMessage(ChatColor.GRAY + "���� ���" + ChatColor.WHITE + "�δ� �� ������ Ķ �� ���� �� ����.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "���°� ���� ���� ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "���°� ���� ���� ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "���� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "���°� ���� ���� ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "���°� ���� ���� ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "���̳��� ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "���̳��� ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "���̳��� ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "���̳��� ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "������ ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "������ ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "���� ���")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "������ ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "������ ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "�Ժ���� ���")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "������ ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "������ ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.IRON_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� ö����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� ö����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("��̷� Ķ �� ���� �� ����.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("�Ǽ����� ������ ĳ�ٴ� �������̽ʴϱ�? ��̸� ��� �Ͻʼ�.");
				return false;
			}
		}
		return true;
	}

	public boolean gold(Player player, Block block, Location loc) {
		// ���̺�Ʈ
		if (block.getType() == Material.GOLD_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "���� ���")) {
					player.sendMessage(ChatColor.GRAY + "���� ���" + ChatColor.WHITE + "�δ� �� ������ Ķ �� ���� �� ����.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ���")) {
					player.sendMessage("����� ��̷δ� �� ������ Ķ �� ���� �� ����.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "���� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "��ġ�� ������ �ݱ���");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "��ġ�� ������ �ݱ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "��ġ�� ������ �ݱ���");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "��ġ�� ������ �ݱ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "�ݱ���");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "�ݱ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "�ݱ���");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "�ݱ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���� ���� �ʴ� �ݱ���");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���� ���� �ʴ� �ݱ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "���� ���")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���� ���� �ʴ� �ݱ���");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���� ���� �ʴ� �ݱ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� �ݱ���");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� �ݱ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "�Ժ���� ���")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���� ���� �ʴ� �ݱ���");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���� ���� �ʴ� �ݱ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 21) {
						ItemStack var1 = new ItemStack(Material.GOLD_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� �ݱ���");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� �ݱ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("��̷� Ķ �� ���� �� ����.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("�Ǽ����� ������ ĳ�ٴ� �������̽ʴϱ�? ��̸� ��� �Ͻʼ�.");
				return false;
			}
		}
		return true;
	}

	public boolean dia(Player player, Block block, Location loc) {
		// ���̾��̺�Ʈ
		if (block.getType() == Material.DIAMOND_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "���� ���")) {
					player.sendMessage(ChatColor.GRAY + "���� ���" + ChatColor.WHITE + "�δ� �� ������ Ķ �� ���� �� ����.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ���")) {
					player.sendMessage("����� ��̷δ� �� ������ Ķ �� ���� �� ����.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "���� ���")) {
					player.sendMessage(ChatColor.YELLOW + "���� ���" + ChatColor.WHITE + "�δ� �� ������ Ķ �� ���� �� ����.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "������ �� ���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "������ �� ���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "������ �� ���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "������ �� ���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "���� ���")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 4) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "������ �� ���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "������ �� ���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 <= 19) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 <= 24) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "������ ���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.giveExp(160);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "������ ���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 25) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� ���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� ���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "�Ժ���� ���")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 4) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "������ �� ���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "������ �� ���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 <= 19) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 <= 24) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "������ ���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						player.giveExp(160);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "������ ���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 25) {
						ItemStack var1 = new ItemStack(Material.DIAMOND_ORE);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� ���̾Ƹ�� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� ���̾Ƹ�� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("��̷� Ķ �� ���� �� ����.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("�Ǽ����� ������ ĳ�ٴ� �������̽ʴϱ�? ��̸� ��� �Ͻʼ�.");
				return false;
			}
		}
		return true;
	}

	public boolean eme(Player player, Block block, Location loc) {
		// ���޶����̺�Ʈ
		if (block.getType() == Material.EMERALD_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "���� ���")) {
					player.sendMessage(ChatColor.GRAY + "���� ���" + ChatColor.WHITE + "�δ� �� ������ Ķ �� ���� �� ����.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ���")) {
					player.sendMessage("����� ��̷δ� �� ������ Ķ �� ���� �� ����.");
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "���� ���")) {
					int num1 = rnd.nextInt(3) + 1;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("���޶��� " + num1 + "���� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "������ ���������� ���")) {
					int num1 = rnd.nextInt(11) + 5;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("���޶��� " + num1 + "���� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "������ ���������� ���")) {
					int num1 = rnd.nextInt(21) + 10;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("���޶��� " + num1 + "���� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "���� ���")) {
					int num1 = rnd.nextInt(31) + 30;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("���޶��� " + num1 + "���� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "�Ժ���� ���")) {
					int num1 = rnd.nextInt(11) + 50;
					if (num1 < 64) {
						player.getInventory().addItem(new ItemStack(Material.EMERALD, num1));
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage("���޶��� " + num1 + "���� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("��̷� Ķ �� ���� �� ����.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("�Ǽ����� ������ ĳ�ٴ� �������̽ʴϱ�? ��̸� ��� �Ͻʼ�.");
				return false;
			}
		}
		return true;
	}
	
	public boolean quartz(Player player, Block block, Location loc) {
		// �����̺�Ʈ
		if (block.getType() == Material.NETHER_QUARTZ_ORE) {
			if (!(player.getInventory().getItemInMainHand().getType() == Material.AIR)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.GRAY + "���� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 1) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "���� ���� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "���� ���� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.YELLOW + "���� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 30000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "�ݵ��� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "�ݵ��� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.LIGHT_PURPLE + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "�ݵ��� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 150000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "�ݵ��� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��Ȥ���� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "��Ȥ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.AQUA + "������ ���������� ���")) {
					int num1 = rnd.nextInt(10);
					if (num1 <= 2) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��Ȥ���� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 5000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "��Ȥ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 == 3) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "�������� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "�������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_RED + "���� ���")) {
					int num1 = rnd.nextInt(100);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "�������� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "�������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 <= 23) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.equals(ChatColor.DARK_PURPLE + "�Ժ���� ���")) {
					int num1 = rnd.nextInt(70);
					if (num1 <= 20) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "�������� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 8000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "�������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if (num1 <= 23) {
						ItemStack var1 = new ItemStack(Material.QUARTZ);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ��� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 14000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ���� ��� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("��̷� Ķ �� ���� �� ����.");
				}
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 1.0f, 1.0f);
				return false;
			} else {
				player.sendMessage("�Ǽ����� ������ ĳ�ٴ� �������̽ʴϱ�? ��̸� ��� �Ͻʼ�.");
				return false;
			}
		}
		return true;
	}
	
}
