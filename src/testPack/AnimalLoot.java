package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AnimalLoot {

	Random rnd = new Random();
	ExpSystem es = new ExpSystem();
	
	public boolean Loot(Player player, Entity animal, Location loc) {
		if(!(animal.getCustomName()==null)) {
			if(animal.getCustomName().equals(ChatColor.GREEN + "����")) {
				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1==0) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "�̼��ϰ� ä���� �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "�̼��ϰ� ä���� �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "�̼��ϰ� ä���� �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "�̼��ϰ� ä���� �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "������ ũ���� �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "������ ũ���� �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "������ ũ���� �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "������ ũ���� �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "���־� ���̴� �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "���־� ���̴� �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "�ݺ� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "���־� ���̴� �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "���־� ���̴� �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "���� ������ �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "���� ������ �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "������ ���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "���� ������ �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "���� ������ �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "�ż����� �پ �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "�ż����� �پ �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "���� ä������")) {
					int num1 = rnd.nextInt(100);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "�ż����� �پ �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "�ż����� �پ �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� Ž�ϴ� �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� Ž�ϴ� �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "ũ������� ä������")) {
					int num1 = rnd.nextInt(70);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "�ż����� �پ �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "�ż����� �پ �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� Ž�ϴ� �������");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� Ž�ϴ� �������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("ä�������� �̿��� ��⸦ ���� �� ���� �� �ϴ�.");
				}
				player.getWorld().playSound(loc, Sound.ENTITY_PIG_HURT, 1.0f, 1.0f);
				return true;
			}
			if(animal.getCustomName().equals(ChatColor.GREEN + "��")) {
				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1==0) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "ĳ�� ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "ĳ�� ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "ĳ�� ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "ĳ�� ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "��ƿ��Ƽ ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "��ƿ��Ƽ ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "��ƿ��Ƽ ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "��ƿ��Ƽ ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "���ٴٵ� ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "���ٴٵ� ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "�ݺ� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "���ٴٵ� ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "���ٴٵ� ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "����Ʈ ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "����Ʈ ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "������ ���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "����Ʈ ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "����Ʈ ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "������ ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "������ ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "���� ä������")) {
					int num1 = rnd.nextInt(100);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "������ ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "������ ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ��ܸԴ� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ��ܸԴ� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "ũ������� ä������")) {
					int num1 = rnd.nextInt(70);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "������ ����� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "������ ����� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ��ܸԴ� �Ұ��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ��ܸԴ� �Ұ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("ä�������� �̿��� ��⸦ ���� �� ���� �� �ϴ�.");
				}
				player.getWorld().playSound(loc, Sound.ENTITY_COW_HURT, 1.0f, 1.0f);
				return true;
			}
			if(animal.getCustomName().equals(ChatColor.GREEN + "��")) {				
				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1==0) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "2��� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "2��� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "2��� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "2��� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "1��� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "1��� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "1��� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "1��� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "1+��� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "1+��� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "�ݺ� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "1+��� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "1+��� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "���� ǰ���� �Ѿ �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "���� ǰ���� �Ѿ �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "������ ���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "���� ǰ���� �Ѿ �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "���� ǰ���� �Ѿ �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���� ǰ���� �ʿ��� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���� ǰ���� �ʿ��� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "���� ä������")) {
					int num1 = rnd.nextInt(100);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���� ǰ���� �ʿ��� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���� ǰ���� �ʿ��� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� Ƣ�ܸԴ� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� Ƣ�ܸԴ� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "ũ������� ä������")) {
					int num1 = rnd.nextInt(70);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "���� ǰ���� �ʿ��� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "���� ǰ���� �ʿ��� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� Ƣ�ܸԴ� �߰��");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� Ƣ�ܸԴ� �߰��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("ä�������� �̿��� ��⸦ ���� �� ���� �� �ϴ�.");
				}
				player.getWorld().playSound(loc, Sound.ENTITY_CHICKEN_HURT, 1.0f, 1.0f);
				return true;
			}
			if(animal.getCustomName().equals(ChatColor.GREEN + "��")) {					
				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1==0) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "��Ÿ�� ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "��Ÿ�� ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "����� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "��Ÿ�� ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "��Ÿ�� ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "��(Lamb) ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "��(Lamb) ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "��(Lamb) ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "��(Lamb) ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "ȣ�� ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "ȣ�� ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "�ݺ� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "ȣ�� ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "ȣ�� ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��ư ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "��ư ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "������ ���� ä������")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��ư ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "��ư ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "��(Ram) ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "��(Ram) ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "���� ä������")) {
					int num1 = rnd.nextInt(100);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "��(Ram) ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "��(Ram) ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ������ ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ������ ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "ũ������� ä������")) {
					int num1 = rnd.nextInt(70);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "��(Ram) ����� ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "��(Ram) ����� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "���� ������ ����");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "���� ������ ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					}
				} else {
					player.sendMessage("ä�������� �̿��� ��⸦ ���� �� ���� �� �ϴ�.");
				}
				player.getWorld().playSound(loc, Sound.ENTITY_SHEEP_HURT, 1.0f, 1.0f);
				return true;
			}
		}
		return false;
	}
	
}
