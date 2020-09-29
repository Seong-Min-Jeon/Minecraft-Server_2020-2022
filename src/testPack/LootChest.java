package testPack;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;

public class LootChest {
	
	Random rnd = new Random();

	public void open(Player player, Block block) {
		if(block.getType() == Material.CHEST) {
			if(block.getX()==3619 && block.getY()==44 && block.getZ()==3792) {
				if(removeKey(player, "������ �ٴ� ���� ���� ����")) {
					dungeon1(player);
					
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
						int qNum = cb.getNum(player);
						cb.mq2(player, qNum + 1);
					}
				}				
			}
			if((block.getX()==3469 && block.getY()==35 && block.getZ()==3760) || (block.getX()==3469 && block.getY()==35 && block.getZ()==3739)){
				if(removeKey(player, "���� ���� ���� ����")) {
					dungeon2(player);
					
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��ȭ�ϴ� ��===")) {
						int qNum = cb.getNum(player);
						cb.q7(player, qNum + 1);
					}
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�� ���� ��===")) {
						int qNum = cb.getNum(player);
						cb.q6(player, qNum + 1);
					}
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ź2===")) {
						int qNum = cb.getNum(player);
						cb.mq5(player, qNum + 1);
					}
				}				
			}
			if(block.getX()==3775 && block.getY()==74 && block.getZ()==3561) {
				if(removeKey(player, "Ÿ���� ���� �ձ� ���� ����")) {
					dungeon3(player);
					
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��4===")) {
						int qNum = cb.getNum(player);
						cb.mq20_1(player, qNum + 1);
					}
				}				
			}
			if(block.getX()==3724 && block.getY()==145 && block.getZ()==3194) {
				if(removeKey(player, "ī�� ���� ���� ����")) {
					dungeon4(player);
				}				
			}
			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
				if(removeKey(player, "�뵵�� �𸣴� ����")) {
					dungeon4(player);
				}				
			}
			if(block.getX()==3334 && block.getY()==13 && block.getZ()==3805 || block.getX()==3336 && block.getY()==14 && block.getZ()==3805 
					|| block.getX()==3341 && block.getY()==15 && block.getZ()==3807 || block.getX()==3341 && block.getY()==15 && block.getZ()==3810
					|| block.getX()==3338 && block.getY()==14 && block.getZ()==3802 || block.getX()==3341 && block.getY()==15 && block.getZ()==3800
					|| block.getX()==3339 && block.getY()==16 && block.getZ()==3797 || block.getX()==3337 && block.getY()==14 && block.getZ()==3796
					|| block.getX()==3343 && block.getY()==16 && block.getZ()==3795 || block.getX()==3334 && block.getY()==13 && block.getZ()==3792
					|| block.getX()==3339 && block.getY()==16 && block.getZ()==3792 || block.getX()==3325 && block.getY()==13 && block.getZ()==3788
					|| block.getX()==3324 && block.getY()==14 && block.getZ()==3784 || block.getX()==3318 && block.getY()==16 && block.getZ()==3791
					|| block.getX()==3316 && block.getY()==14 && block.getZ()==3799 || block.getX()==3315 && block.getY()==16 && block.getZ()==3809) {
				int num = rnd.nextInt(10);
				if(num == 0) {
					if(removeKey(player, "�Ƶ��� ���� ���� ����")) {
						dungeon5(player);
					} else if(removeKey(player, "������ �Ƶ��� ���� ���� ����")) {
						dungeon6(player);
					}
				}
			}
			if(block.getX()==75 && block.getY()==240 && block.getZ()==-10) {
				if(removeKey(player, "������ ž 1�� ���� ����")) {
					tower1(player);
				}				
			}
			if(block.getX()==69 && block.getY()==240 && block.getZ()==-10) {
				if(removeKey(player, "������ ž 2�� ���� ����")) {
					tower2(player);
				}				
			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 3�� ���� ����")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 4�� ���� ����")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 5�� ���� ����")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 6�� ���� ����")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 7�� ���� ����")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 8�� ���� ����")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 9�� ���� ����")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 10�� ���� ����")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 11�� ���� ����")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "������ ž 12�� ���� ����")) {
//					tower1(player);
//				}				
//			}
			
		}
	}
	
	public void dungeon1(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(10);
		int num2 = rnd.nextInt(10);
		int num3 = rnd.nextInt(10);
		int num4 = rnd.nextInt(5);
		int num5 = rnd.nextInt(30);	
		int num6 = rnd.nextInt(20);	
		int num7 = rnd.nextInt(30) + 10;
		
		ItemStack var1 = new ItemStack(Material.OAK_LEAVES);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("7,0,0,0,0,0,0,0,0,0,15");
		var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��������");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "���� ����: 15");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "����ϰ� ���� ��");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.COBBLESTONE_WALL);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,7,15");
		var2Im.setDisplayName(ChatColor.LIGHT_PURPLE + "�Ͱ��");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "���� ����: 15");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "���״� ������ ����ϴ� ��");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta var3meta = (LeatherArmorMeta) var3.getItemMeta();
		var3meta.setColor(Color.fromRGB(255, 255, 255));
		var3.setItemMeta(var3meta);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,10,0,0,0,0,20");
		var3Im.setDisplayName(ChatColor.LIGHT_PURPLE + "���");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "���� ����: 20");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "���з� ������� ����");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta var4meta = (LeatherArmorMeta) var4.getItemMeta();
		var4meta.setColor(Color.fromRGB(50, 75, 255));
		var4.setItemMeta(var4meta);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,5");
		var4Im.setDisplayName(ChatColor.YELLOW + "�ĵ�");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "������ Ư���� ������ ������� �Ź�");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.BLACK_CARPET);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("20,0,0,0,5,0,0,0,0,0,25");
		var5Im.setDisplayName(ChatColor.AQUA + "��ǳ��");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "���� ����: 25");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "�ٴ��� �г밡 ��� ����");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "����Ʈ: �������� ����");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'�������� ����' ����Ʈ�� ������ �� �ִ�.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		
		
		ItemStack emerald = new ItemStack(Material.EMERALD, num7);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, scroll);
		}
		
		player.openInventory(inv);		
	}
	
	public void dungeon2(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(50);
		int num2 = rnd.nextInt(5);
		int num3 = rnd.nextInt(20);
		int num4 = rnd.nextInt(10);
		int num5 = rnd.nextInt(30);	
		int num6 = rnd.nextInt(15);	
		int num7 = rnd.nextInt(30) + 34;
		
		ItemStack var1 = new ItemStack(Material.GREEN_CARPET);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("30,0,0,0,10,0,0,0,0,0,50");
		var1Im.setDisplayName(ChatColor.AQUA + "�ָ���ȸ");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "���� ����: 50");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "�Ǹ��� ���� �����ִ� ����");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta var2meta = (LeatherArmorMeta) var2.getItemMeta();
		var2meta.setColor(Color.fromRGB(0, 155, 50));
		var2.setItemMeta(var2meta);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,60");
		var2Im.setDisplayName(ChatColor.GREEN + "���� ��ȣ�� ��� ���");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "���� ����: 60");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "�̱׷��� ������ ���� ���");
		var2Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta var3meta = (LeatherArmorMeta) var3.getItemMeta();
		var3meta.setColor(Color.fromRGB(0, 155, 50));
		var3.setItemMeta(var3meta);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,60");
		var3Im.setDisplayName(ChatColor.GREEN + "���� ��ȣ�� ��� ����");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "���� ����: 60");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "�̱׷��� ������ ���� ����");
		var3Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta var4meta = (LeatherArmorMeta) var4.getItemMeta();
		var4meta.setColor(Color.fromRGB(0, 155, 50));
		var4.setItemMeta(var4meta);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,60");
		var4Im.setDisplayName(ChatColor.GREEN + "���� ��ȣ�� ��� ����");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "���� ����: 60");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "�̱׷��� ������ ���� ����");
		var4Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta var5meta = (LeatherArmorMeta) var5.getItemMeta();
		var5meta.setColor(Color.fromRGB(0, 155, 50));
		var5.setItemMeta(var5meta);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,60");
		var5Im.setDisplayName(ChatColor.GREEN + "���� ��ȣ�� ��� �Ź�");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "���� ����: 60");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "�̱׷��� ������ ���� �Ź�");
		var5Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "����Ʈ: ������ ��ȭ�ϴ� ��");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'������ ��ȭ�ϴ� ��' ����Ʈ�� ������ �� �ִ�.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		
		
		ItemStack emerald = new ItemStack(Material.EMERALD, num7);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, scroll);
		}
		
		player.openInventory(inv);		
	}
	
	public void dungeon3(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(20);
		int num3 = rnd.nextInt(30);
		int num4 = rnd.nextInt(25);
		int num5 = rnd.nextInt(20);	
		int num6 = rnd.nextInt(10);	
		int num7 = rnd.nextInt(1000);	
		int num8 = rnd.nextInt(60);	
		int num9 = rnd.nextInt(20);	
		int num10 = rnd.nextInt(100);	
		int num11 = rnd.nextInt(30) + 20;
		
		ItemStack var1 = new ItemStack(Material.STONE);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("250,100,0,100,10,200,100,100,100,200,200");
		var1Im.setDisplayName(ChatColor.AQUA + "�������� ��");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "���� ����: 200");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "�������� ����ϴ� ���̴�.");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("100,0,0,0,0,0,0,0,0,0,210");
		var2Im.setDisplayName(ChatColor.GREEN + "�糪 �� ���");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "���� ����: 210");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "���� ������ ������ ������� ���");
		var2Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("100,0,0,0,0,0,0,0,0,0,210");
		var3Im.setDisplayName(ChatColor.GREEN + "�糪 �� ����");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "���� ����: 210");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "���� ������ ������ ������� ����");
		var3Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("100,0,0,0,0,0,0,0,0,0,210");
		var4Im.setDisplayName(ChatColor.GREEN + "�糪 �� ����");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "���� ����: 210");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "���� ������ ������ ������� ����");
		var4Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("100,0,0,0,0,0,0,0,0,0,210");
		var5Im.setDisplayName(ChatColor.GREEN + "�糪 �� �Ź�");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "���� ����: 210");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "���� ������ ������ ������� �Ź�");
		var5Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.POTION);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.LIGHT_PURPLE + "����� ����");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "�� �ؿ� �ٸ��� ���̴� ����� ����� ������ �ȴٰ� �Ѵ�.");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		PotionMeta pM = (PotionMeta) var6.getItemMeta();
		pM.setColor(Color.PURPLE);
		var6Im = (ItemMeta) pM;
		var6.setItemMeta(pM);
		
		ItemStack var7 = new ItemStack(Material.OAK_PLANKS);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("500,0,0,300,400,500,0,0,0,0,250");
		var7Im.setDisplayName(ChatColor.DARK_RED + "�Ϸ�õ�����");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "���� ����: 250");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "������ 50�� �������� ����� ����");
		var7Lore.add(ChatColor.GRAY + "����� ������ Ŭ������ �˺��ٵ� ������ ����.");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("200,0,0,0,0,200,0,0,0,200,180");
		var8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��ǻ��");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "���� ����: 180");
		var8Lore.add(ChatColor.GRAY + " ");
		var8Lore.add(ChatColor.GRAY + "���� �������̰� ���� ����");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("0,0,0,0,0,500,0,0,0,0,180");
		var9Im.setDisplayName(ChatColor.YELLOW + "��������");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "���� ����: 180");
		var9Lore.add(ChatColor.GRAY + " ");
		var9Lore.add(ChatColor.GRAY + "��ŷ��� ���󿡼� ������ ���");
		var9Lore.add(ChatColor.GRAY + "�ݰ��ұ��� ���� ���� �� �ִ�.");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack var10 = new ItemStack(Material.CYAN_WOOL);
		ItemMeta var10Im = var10.getItemMeta();
		var10Im.setLocalizedName("250,100,0,100,10,200,100,100,100,200,200");
		var10Im.setDisplayName(ChatColor.AQUA + "���������� ��");
		ArrayList<String> var10Lore = new ArrayList();
		var10Lore.add(ChatColor.GRAY + "���� ����: 200");
		var10Lore.add(ChatColor.GRAY + " ");
		var10Lore.add(ChatColor.GRAY + "���������� ����ϴ� ���̴�.");
		var10Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var10Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var10Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var10Im.setUnbreakable(true);
		var10Im.setLore(var10Lore);
		var10.setItemMeta(var10Im);
		
		ItemStack emerald = new ItemStack(Material.EMERALD_BLOCK, num11);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		if(num10==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var10);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon4(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(20); // ���ȹ�
		int num2 = rnd.nextInt(20); // ��Ʈ
		int num3 = rnd.nextInt(15); // ��Ʈ
		int num4 = rnd.nextInt(8); // ��Ʈ
		int num5 = rnd.nextInt(10);	// ��Ʈ
		int num6 = rnd.nextInt(50);	// ��������
		int num7 = rnd.nextInt(500); //ũ����Ż������ �ֱ�	
		int num8 = rnd.nextInt(50);	// ����ȭ�� ��
		int num9 = rnd.nextInt(40);	// ���� Ȱ
		int num10 = rnd.nextInt(2) + 1;
		
		ItemStack var1 = new ItemStack(Material.CYAN_WOOL);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("0,0,200,0,0,400,400,0,0,0,230");
		var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "���ȹ�");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "���� ����: 230");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "�ñ⸦ �̿��� �����鿡�� ���ظ� �ֱ� ���� ��");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,250");
		var2Im.setDisplayName(ChatColor.GREEN + "��Ȥ�� �̸��� ���");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "���� ����: 250");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "������ ����� �������� ���");
		var2Lore.add(ChatColor.GRAY + "�����ϸ� �߿� �������� ��ƿ �� ���� �� ����.");
		var2Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,250");
		var3Im.setDisplayName(ChatColor.GREEN + "��Ȥ�� �̸��� ����");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "���� ����: 250");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "������ ����� �������� ����");
		var3Lore.add(ChatColor.GRAY + "�����ϸ� �߿� �������� ��ƿ �� ���� �� ����.");
		var3Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,250");
		var4Im.setDisplayName(ChatColor.GREEN + "��Ȥ�� �̸��� ����");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "���� ����: 250");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "������ ����� �������� ����");
		var4Lore.add(ChatColor.GRAY + "�����ϸ� �߿� �������� ��ƿ �� ���� �� ����.");
		var4Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,250");
		var5Im.setDisplayName(ChatColor.GREEN + "��Ȥ�� �̸��� �Ź�");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "���� ����: 250");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "������ ����� �������� �Ź�");
		var5Lore.add(ChatColor.GRAY + "�����ϸ� �߿� �������� ��ƿ �� ���� �� ����.");
		var5Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("1,1,1,1,1,1,1,1,1,1,250");
		var6Im.setDisplayName(ChatColor.AQUA + "��������");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "���� ����: 250");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "�� �� ���� ���� ������� Ư���� �Ź�");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.NETHERITE_INGOT);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setDisplayName(ChatColor.DARK_RED + "ũ����Ż������ �ֱ�");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "����ȭ�� ���� �ʿ� ����");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.BIRCH_LOG);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,0");
		var8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "����ȭ�� ��");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "�ƹ� ���� �������� �ʴ� ��");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("0");
		var9Im.setDisplayName(ChatColor.GOLD + "����콺");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "�ñⰡ �������� Ȱ");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num10);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon5(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(80); // ���ֹ��� ��
		int num2 = rnd.nextInt(30); // ��Ʈ
		int num3 = rnd.nextInt(18); // ��Ʈ
		int num4 = rnd.nextInt(13); // ��Ʈ
		int num5 = rnd.nextInt(24);	// ��Ʈ
		int num6 = rnd.nextInt(13);	// ����
		int num7 = rnd.nextInt(15); // �ͽŸ꿭  
		int num8 = rnd.nextInt(20);	// ��ȸ
		int num9 = rnd.nextInt(10);	// ȸ��
		int num10 = rnd.nextInt(20) + 10;
		
		ItemStack var1 = new ItemStack(Material.SPRUCE_LOG);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("30,100,50,0,0,0,0,0,0,0,100");
		var1Im.setDisplayName(ChatColor.AQUA + "���ֹ��� ��");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "���� ����: 100");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "���������� ������ �ִ� ���ְ� �������� ��");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,100,120");
		var2Im.setDisplayName(ChatColor.GREEN + "��Ȥ�� ��ȭ�� ���");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "���� ����: 120");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "�������� �ҿ��� ��� ���");
		var2Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,0,0,0,0,100,120");
		var3Im.setDisplayName(ChatColor.GREEN + "��Ȥ�� ��ȭ�� ����");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "���� ����: 120");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "�������� �ҿ��� ��� ����");
		var3Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,100,120");
		var4Im.setDisplayName(ChatColor.GREEN + "��Ȥ�� ��ȭ�� ����");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "���� ����: 120");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "�������� �ҿ��� ��� ����");
		var4Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,100,120");
		var5Im.setDisplayName(ChatColor.GREEN + "��Ȥ�� ��ȭ�� �Ź�");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "���� ����: 120");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "�������� �ҿ��� ��� �Ź�");
		var5Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("10,0,0,0,0,80,0,0,0,0,110");
		var6Im.setDisplayName(ChatColor.YELLOW + "����");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "���� ����: 110");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "�������� �������̰� ���� ������ �̿��� ���� ���");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("0,0,0,0,50,0,0,0,0,50,110");
		var7Im.setDisplayName(ChatColor.YELLOW + "�ͽŸ꿭");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "���� ����: 110");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "���� ������ ���� ���� ����");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("0,0,0,0,0,130,0,0,0,0,110");
		var8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "��ȸ");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "���� ����: 110");
		var8Lore.add(ChatColor.GRAY + " ");
		var8Lore.add(ChatColor.GRAY + "������ ���⿡ ��ȸ ���� �����ֽø� �˴ϴ�.");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("0,0,0,0,0,40,40,40,40,0,110");
		var9Im.setDisplayName(ChatColor.YELLOW + "ȸ��");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "���� ����: 110");
		var9Lore.add(ChatColor.GRAY + " ");
		var9Lore.add(ChatColor.GRAY + "���� �귣�带 ����� �Ź�");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack emerald = new ItemStack(Material.EMERALD_BLOCK, num10);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon6(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(100); // ���ֹ��� ��+
		int num2 = rnd.nextInt(40); // ��Ʈ
		int num3 = rnd.nextInt(21); // ��Ʈ
		int num4 = rnd.nextInt(17); // ��Ʈ
		int num5 = rnd.nextInt(28);	// ��Ʈ
		int num6 = rnd.nextInt(20);	// Ÿ���� ����
		int num7 = rnd.nextInt(20); // Ÿ���� �ͽŸ꿭  
		int num8 = rnd.nextInt(20);	// Ÿ���� ��ȸ
		int num9 = rnd.nextInt(20);	// Ÿ���� ȸ��
		int num10 = rnd.nextInt(2) + 3;
		
		ItemStack var1 = new ItemStack(Material.SPRUCE_LOG);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("400,100,50,0,0,0,0,0,0,200,200");
		var1Im.setDisplayName(ChatColor.AQUA + "���ֹ��� ��+");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "���� ����: 200");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "���������� ������ �ִ� ���ְ� �������� ��");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,220");
		var2Im.setDisplayName(ChatColor.GREEN + "����� ������ ���");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "���� ����: 220");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "�������� ���ְ� ��� ���");
		var2Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,220");
		var3Im.setDisplayName(ChatColor.GREEN + "����� ������ ����");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "���� ����: 220");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "�������� ���ְ� ��� ����");
		var3Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,220");
		var4Im.setDisplayName(ChatColor.GREEN + "����� ������ ����");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "���� ����: 220");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "�������� ���ְ� ��� ����");
		var4Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,220");
		var5Im.setDisplayName(ChatColor.GREEN + "����� ������ �Ź�");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "���� ����: 220");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "�������� ���ְ� ��� �Ź�");
		var5Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("310,0,0,0,0,180,0,0,0,0,210");
		var6Im.setDisplayName(ChatColor.LIGHT_PURPLE + "Ÿ���� ����");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "���� ����: 210");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "�������� �������̰� ���� ������ �̿��� ���� ���");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("0,0,0,0,150,0,0,0,0,350,210");
		var7Im.setDisplayName(ChatColor.LIGHT_PURPLE + "Ÿ���� �ͽŸ꿭");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "���� ����: 210");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "���� ������ ���� ���� ����");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("0,0,0,0,0,430,0,0,0,0,210");
		var8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "Ÿ���� ��ȸ");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "���� ����: 210");
		var8Lore.add(ChatColor.GRAY + " ");
		var8Lore.add(ChatColor.GRAY + "������ ���⿡ ��ȸ ���� �����ֽø� �˴ϴ�.");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("0,0,0,0,0,140,140,140,140,0,210");
		var9Im.setDisplayName(ChatColor.LIGHT_PURPLE + "Ÿ���� ȸ��");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "���� ����: 210");
		var9Lore.add(ChatColor.GRAY + " ");
		var9Lore.add(ChatColor.GRAY + "���� �귣�带 ����� �Ź�");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num10);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		player.openInventory(inv);	
	}

	public void tower1(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // ����
		int num2 = rnd.nextInt(44); // ��Ʈ
		int num3 = rnd.nextInt(44); // ��Ʈ
		int num4 = rnd.nextInt(44); // ��Ʈ
		int num5 = rnd.nextInt(44);	// ��Ʈ
		int num6 = 4;
		
		ItemStack var1 = new ItemStack(Material.BIRCH_LOG);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("300,0,0,500,0,0,0,0,0,2000,300");
		var1Im.setDisplayName(ChatColor.AQUA + "ž�� �ʽ��� ��");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "���� ����: 300");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "������ ž 1������ �߰��� ��");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("300,0,0,0,0,300,0,0,0,0,300");
		var2Im.setDisplayName(ChatColor.GREEN + "ž�� �ʽ��� ���");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "���� ����: 300");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "������ ž 1������ �߰��� ���");
		var2Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,300,0,0,0,300,0,0,0,0,300");
		var3Im.setDisplayName(ChatColor.GREEN + "ž�� �ʽ��� ����");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "���� ����: 300");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "������ ž 1������ �߰��� ����");
		var3Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,300,0,0,300,0,0,0,0,300");
		var4Im.setDisplayName(ChatColor.GREEN + "ž�� �ʽ��� ����");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "���� ����: 300");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "������ ž 1������ �߰��� ����");
		var4Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,300,0,300,0,0,0,0,300");
		var5Im.setDisplayName(ChatColor.GREEN + "ž�� �ʽ��� �Ź�");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "���� ����: 300");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "������ ž 1������ �߰��� �Ź�");
		var5Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num6);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		player.openInventory(inv);	
	}
	
	public void tower2(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // ����
		int num2 = rnd.nextInt(44); // ��Ʈ
		int num3 = rnd.nextInt(44); // ��Ʈ
		int num4 = rnd.nextInt(44); // ��Ʈ
		int num5 = rnd.nextInt(44);	// ��Ʈ
		int num6 = 4;
		
		ItemStack var1 = new ItemStack(Material.GREEN_CARPET);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("0,0,0,0,1000,0,0,0,0,0,350");
		var1Im.setDisplayName(ChatColor.AQUA + "ž�� ������ ����");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "���� ����: 350");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "������ ž 2������ �߰��� ����");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("350,100,50,50,0,350,0,0,0,0,350");
		var2Im.setDisplayName(ChatColor.GREEN + "ž�� ������ ���");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "���� ����: 350");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "������ ž 2������ �߰��� ���");
		var2Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,350,100,100,100,0,350");
		var3Im.setDisplayName(ChatColor.GREEN + "ž�� ������ ����");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "���� ����: 350");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "������ ž 2������ �߰��� ����");
		var3Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,100,100,100,0,350,0,0,0,0,350");
		var4Im.setDisplayName(ChatColor.GREEN + "ž�� ������ ����");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "���� ����: 350");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "������ ž 2������ �߰��� ����");
		var4Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,350,0,0,0,1000,350");
		var5Im.setDisplayName(ChatColor.GREEN + "ž�� ������ �Ź�");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "���� ����: 350");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "������ ž 2������ �߰��� �Ź�");
		var5Lore.add(ChatColor.GRAY + "(��Ʈ ������)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num6);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		player.openInventory(inv);	
	}
	
	public boolean removeKey(Player player, String str) {
		try {
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + str)) {
					is.setAmount(is.getAmount()-1);
					return true;
				}
			}
		} catch(Exception e) {
			
		}
		return false;		
	}
	
}
