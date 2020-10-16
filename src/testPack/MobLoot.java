package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MobLoot {

	Random rnd = new Random();

	private final int multyEme = 1;
	ExpSystemByMob es = new ExpSystemByMob();

	// 1:10 10:100 20:1000 30:4000 40:10000 50:21000 100:200000 200:1840000
	// 400:16660000 700:97600000 1000:300000000

	// ������ �𸣴� ������
	public void mob1(Player player) {
		ItemStack ticket = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta ticketIm = ticket.getItemMeta();
		ticketIm.setDisplayName(ChatColor.YELLOW + "���� ������ ��ȯ Ƽ��");
		ArrayList<String> ticketLore = new ArrayList();
		ticketLore.add(ChatColor.GRAY + "���� �����̸� ��ȯ�� �� �ִ� Ƽ��");
		ticketLore.add(ChatColor.GRAY + "Q�� �̿��� ����غ���");
		ticketIm.setLore(ticketLore);
		ticket.setItemMeta(ticketIm);
		player.getInventory().addItem(ticket);
		player.sendMessage(ChatColor.YELLOW + "���� ������ ��ȯ Ƽ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		es.giveExp(player, 1);
	}

	// ���� ������
	public void mob2(Player player) {
		ItemStack ticket = new ItemStack(Material.PAPER);
		ItemMeta ticketIm = ticket.getItemMeta();
		ticketIm.setDisplayName(ChatColor.YELLOW + "�� ��ȯ��");
		ArrayList<String> ticketLore = new ArrayList();
		ticketLore.add(ChatColor.GRAY + "���� ��ȯ�� �� ���� �� ����.");
		ticketLore.add(ChatColor.GRAY + "�ֹΰ� ��ȭ�� ����غ���");
		ticketIm.setLore(ticketLore);
		ticket.setItemMeta(ticketIm);
		player.getInventory().addItem(ticket);
		player.sendMessage(ChatColor.YELLOW + "�� ��ȯ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		es.giveExp(player, 1);
	}

	// �ʷ� ������
	public void mob3(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 10);
	}

	// �ؾȰ� ����
	public void mob4(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 80);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�ؾ��� ����===")) {
			int qNum = cb.getNum(player);
			cb.q1(player, qNum + 1);
		}
	}

	// ���״ҿ� ��Ŵ��� ��
	public void mob5(Player player) {
		int num = rnd.nextInt(5) + 2;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 260);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���״� ���� ���===")) {
			int qNum = cb.getNum(player);
			cb.mq1(player, qNum + 1);
		}
	}

	// ���� ���� �ϼ���
	public void mob6(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 2734);
	}

	// ���� ���� ����
	public void mob7(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(100);
		if (num2 <= 0) {
			ItemStack rein = new ItemStack(Material.CHARCOAL);
			ItemMeta reinIm = rein.getItemMeta();
			reinIm.setDisplayName(ChatColor.AQUA + "���� ������ ��ǥ");
			ArrayList<String> reinLore = new ArrayList();
			reinLore.add(ChatColor.GRAY + "���� �������� ���� �ʿ� ����");
			reinIm.setLore(reinLore);
			rein.setItemMeta(reinIm);
			player.getInventory().addItem(rein);
			player.sendMessage(ChatColor.AQUA + "���� ������ ��ǥ" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		es.giveExp(player, 3168);
	}

	// ������Ʈ ��Ʈ
	public void mob8(Player player) {
		int num = rnd.nextInt(10) + 3;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(30);
		if (num2 <= 0) {
			ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.WHITE + "����Ʈ: �� ��ɲ�");
			ArrayList<String> scrollLore = new ArrayList();
			scrollLore.add(ChatColor.GRAY + "'�� ��ɲ�' ����Ʈ�� ������ �� �ִ�.");
			scrollIm.setLore(scrollLore);
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);
			player.getInventory().addItem(scroll);
			player.sendMessage(ChatColor.WHITE + "����Ʈ: �� ��ɲ�" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		es.giveExp(player, 524);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�� ��ɲ�===")) {
			int qNum = cb.getNum(player);
			cb.q4(player, qNum + 1);
		}
	}

	// ũ����Ż ������
	public void mob9(Player player) {
		int num = rnd.nextInt(2) + 5;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 571);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����===")) {
			int qNum = cb.getNum(player);
			cb.q3(player, qNum + 1);
		}
	}

	// ���ֹ��� ���� ����
	public void mob10(Player player) {
		int num = rnd.nextInt(6) + 4;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 652);
	}

	// ��ȣ ����
	public void mob11(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 233);
	}

	// ��ȣ ��Ʈ����
	public void mob12(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 355);
	}

	// �ź� ����
	public void mob13(Player player) {
		int num = rnd.nextInt(6);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 202);
	}

	// ���� �����
	public void mob14(Player player) {
		int num = rnd.nextInt(20) + 10;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 732);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ �ٴ� ���� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ �ٴ� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		List<Entity> entitylist = player.getNearbyEntities(10, 3, 10);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearplayer = (Player) nearEntity;
				nearplayer.getInventory().addItem(rewardKey);
				nearplayer.sendMessage(ChatColor.YELLOW + "������ �ٴ� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			}
		}
	}

	// ���
	public void mob15(Player player) {
		int num = rnd.nextInt(10) + 16;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 8226);

		int num2 = rnd.nextInt(20);
		if (num2 == 0) {
			ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.WHITE + "����Ʈ: ���ƺ������� �ٸ�");
			ArrayList<String> scrollLore = new ArrayList();
			scrollLore.add(ChatColor.GRAY + "'���ƺ������� �ٸ�' ����Ʈ�� ������ �� �ִ�.");
			scrollIm.setLore(scrollLore);
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);
			player.getInventory().addItem(scroll);
			player.sendMessage(ChatColor.WHITE + "����Ʈ: ���ƺ������� �ٸ�" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ź3===")) {
			int qNum = cb.getNum(player);
			cb.mq6(player, qNum + 1);
		}
	}

	// �ĸ�Ȧ���� ����
	public void mob16(Player player) {
		int num = rnd.nextInt(10) + 18;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 9527);
	}

	// �ĸ�Ȧ���� ����
	public void mob17(Player player) {
		int num = rnd.nextInt(4) + 20;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(50);
		if (num2 == 0) {
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
			player.getInventory().addItem(scroll);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "����Ʈ: ������ ��ȭ�ϴ� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		es.giveExp(player, 10374);
	}

	// ���̵� ��
	public void mob18(Player player) {
		int num = rnd.nextInt(10) + 30;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(30);
		if (num2 <= 0) {
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(0);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "������ ���� ��� ��ü" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		es.giveExp(player, 15554);
	}

	// ħ����
	public void mob19(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 2217);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===ħ����===")) {
			int qNum = cb.getNum(player);
			cb.q5(player, qNum + 1);
		}
	}

	// ���� Ȳ��
	public void mob20(Player player) {
		int num = rnd.nextInt(30);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(10);
		if (num2 <= 0) {
			ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.YELLOW + "����Ʈ: �� ���� ��");
			ArrayList<String> scrollLore = new ArrayList();
			scrollLore.add(ChatColor.GRAY + "'�� ���� ��' ����Ʈ�� ������ �� �ִ�.");
			scrollIm.setLore(scrollLore);
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);
			player.getInventory().addItem(scroll);
			player.sendMessage(ChatColor.YELLOW + "����Ʈ: �� ���� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		es.giveExp(player, 3572);
	}

	// ���� ����
	public void mob21(Player player) {
		int num = rnd.nextInt(18);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 3152);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ź1===")) {
			int qNum = cb.getNum(player);
			cb.mq4(player, qNum + 1);
		}
	}

	// ����
	public void mob22(Player player) {
		int num = rnd.nextInt(10) + 6;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 2811);
	}

	// ���̵� ������
	public void mob23(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 3852);
		World world = player.getWorld();
		int num2 = rnd.nextInt(15);
		if (num2 == 0) {
			player.teleport(new Location(world, 3464.5, 18, 3740));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
		} else if (num2 == 1) {
			player.teleport(new Location(world, 3464.5, 18, 3697));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
		} else if (num2 == 2) {
			player.teleport(new Location(world, 3503.5, 18, 3698));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
		} else if (num2 == 3) {
			player.teleport(new Location(world, 3514.5, 18, 3745));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
		} else if (num2 == 4) {
			player.teleport(new Location(world, 3539.5, 18, 3698));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
			int cnt = 0;
			List<Entity> list = player.getNearbyEntities(30, 10, 30);
			for (Entity ent : list) {
				if (ent.getType() == EntityType.GHAST) {
					cnt++;
				}
			}
			if (cnt == 0) {
				Ghast mob = (Ghast) world.spawnEntity(new Location(world, 3539.5, 25, 3708.5), EntityType.GHAST);
			}
		}
	}

	// �ǻ�Ƴ� ���谡
	public void mob24(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 4220);
		World world = player.getWorld();
		int num2 = rnd.nextInt(10);
		if (num2 == 0) {
			player.teleport(new Location(world, 3464.5, 18, 3740));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
		} else if (num2 == 1) {
			player.teleport(new Location(world, 3464.5, 18, 3697));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
		} else if (num2 == 2) {
			player.teleport(new Location(world, 3503.5, 18, 3698));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
		} else if (num2 == 3) {
			player.teleport(new Location(world, 3514.5, 18, 3745));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
		} else if (num2 == 4) {
			player.teleport(new Location(world, 3539.5, 18, 3698));
			player.sendMessage("���� ��򰡷� �̵��ߴ�.");
			int cnt = 0;
			List<Entity> list = player.getNearbyEntities(30, 10, 30);
			for (Entity ent : list) {
				if (ent.getType() == EntityType.GHAST) {
					cnt++;
				}
			}
			if (cnt == 0) {
				Ghast mob = (Ghast) world.spawnEntity(new Location(world, 3539.5, 25, 3708.5), EntityType.GHAST);
			}
		}
	}

	// ������ ����
	public void mob25(Player player) {
		int num = rnd.nextInt(20);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 20000);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "���� ���� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "���� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		World world = player.getWorld();

		List<Entity> entitylist = player.getNearbyEntities(40, 20, 40);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearplayer = (Player) nearEntity;
				if (nearplayer.getLocation().getX() <= 3556 && nearplayer.getLocation().getY() <= 35
						&& nearplayer.getLocation().getZ() <= 3726 && nearplayer.getLocation().getX() >= 3522
						&& nearplayer.getLocation().getY() >= 15 && nearplayer.getLocation().getZ() >= 3691) {
					nearplayer.getInventory().addItem(rewardKey);
					nearplayer.sendMessage(ChatColor.YELLOW + "���� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					nearplayer.teleport(new Location(world, 3465, 37, 3749.5, -90f, 1.4f));
					nearplayer.sendMessage("���� ��򰡷� �̵��ߴ�.");
				}
			}
		}

		player.teleport(new Location(world, 3465, 37, 3749.5, -90f, -1.4f));
		player.sendMessage("���� ��򰡷� �̵��ߴ�.");

	}

	// ��ũ
	public void mob26(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 17312);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ƺ������� �ٸ�===")) {
			int qNum = cb.getNum(player);
			cb.q8(player, qNum + 1);
		}
	}

	// �̷��� �����ϴ� ��
	public void mob27(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 19843);
		
		int num2 = rnd.nextInt(20);
		if(num2 == 0) {
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(10);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.YELLOW + "�̷��� �����ϴ� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
	}

	// ���� �ΰ�
	public void mob28(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 22532);
	}

	// ������ ������
	public void mob29(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 28653);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����===")) {
			int qNum = cb.getNum(player);
			cb.q9(player, qNum + 1);
		}

		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ���ư��� ���� ����===")) {
			int qNum = cb.getNum(player);
			cb.mq9(player, qNum + 1);
		}
	}

	// ������ ��Ű�� �Ź�
	public void mob30(Player player) {
		es.giveExp(player, 50000);
	}

	// �ĸ�Ȧ���� ��ȣ��
	public void mob31(Player player) {
		es.giveExp(player, 60000);
	}

	// �ܴ��� ������
	public void mob32(Player player) {
		int num = rnd.nextInt(3);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 30800);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������� ����===")) {
			int qNum = cb.getNum(player);
			cb.mq10(player, qNum + 1);
		}
	}

	// ������ ���� �÷��̾�
	public void mob33(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 45412);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�õ� �������� ���� ��===")) {
			int qNum = cb.getNum(player);
			cb.mq13(player, qNum + 1);
		}
	}

	// ���� �Ź�
	public void mob34(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 90621);
	}

	// ���� ����
	public void mob35(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 95134);
	}

	// �ƶ�
	public void mob36(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 84134);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}

	// �Ӷ���
	public void mob37(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 90134);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}

	// �ĸ�Ȧ���� ������
	public void mob38(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 399999);
	}

	// ������ ���� �÷��̾�
	public void mob39(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 108134);
	}

	// �г��� ����
	public void mob40(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 130134);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Żȯ===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}	
	}

	// ������ ����
	public void mob41(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 144160);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Żȯ===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// ������ ����
	public void mob42(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 151532);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Żȯ===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// ħ���� ����
	public void mob43(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 166256);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Żȯ===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// ����� ����
	public void mob44(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 178490);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Żȯ===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// ����� ����
	public void mob45(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 183613);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Żȯ===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// ������ ����
	public void mob46(Player player) {
		int num = rnd.nextInt(8) + 2;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 198236);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Żȯ===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// ����� ����
	public void mob47(Player player) {
		int num = rnd.nextInt(8) + 2;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 193572);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Żȯ===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// �÷��� ����
	public void mob48(Player player) {
		player.sendMessage("Ŭ����!");
		player.teleport(new Location(player.getWorld(), -1106, 186, 1453.5, -90.0f, 0.0f));
		
		Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		ItemStack item = chest.getInventory().getItem(7);
		player.getInventory().addItem(item);
		player.sendMessage(ChatColor.DARK_RED + "������ �ް� 1" + ChatColor.WHITE + "�� ȹ���ߴ�.");
	}

	// �Ϳ�
	public void mob49(Player player) {
		int num = rnd.nextInt(8) + 3;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 121257);
	}

	// ���
	public void mob50(Player player) {
		int num = rnd.nextInt(8) + 3;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 131257);
	}

	// ��ȥ�� Ž�ϴ� ����
	public void mob51(Player player) {
		es.giveExp(player, 251256);
	}

	// ��������
	public void mob52(Player player) {
		es.giveExp(player, 258193);
	}

	// ������
	public void mob53(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 220000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}

	// ���������
	public void mob54(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 232516);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}

	// ���ų�Ʈ
	public void mob55(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 247236);
	}

	// ������
	public void mob56(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 261684);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var4.setItemMeta(var4im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}

	// ��Ʋ�� ������ ����
	public void mob57(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 271134);
	}
	
	// �ư��� �ļ���
	public void mob58(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 294284);
	}

	// �������� ��ȥ
	public void mob59(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 251652);
	}

	// �ͻ���� ����
	public void mob60(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 261684);
	}
	
	// ����
	public void mob61(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 281256);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}

	// ����
	public void mob62(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 303261);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}

	// ��ȣ
	public void mob63(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 331534);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}

	// ����
	public void mob64(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 361654);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}

	// ���� ���ʺ�
	public void mob65(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 405631);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ����===")) {
			int qNum = cb.getNum(player);
			cb.q12(player, qNum + 1);
		}
	}

	// ���� ����
	public void mob66(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 427134);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ����===")) {
			int qNum = cb.getNum(player);
			cb.q12(player, qNum + 1);
		}
	}

	// ���� �д���
	public void mob67(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 461124);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ����===")) {
			int qNum = cb.getNum(player);
			cb.q12(player, qNum + 1);
		}
	}
	
	// �������� ����
	public void mob68(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 331134);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ũ�κ���===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// �������� ��ɰ�
	public void mob69(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 358417);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ũ�κ���===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// �������� ������
	public void mob70(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 378571);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ũ�κ���===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// �������� �̴���
	public void mob71(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 418760);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ũ�κ���===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// ���ʸ� ���� ����
	public void mob72(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 204251);
	}
	
	// ���ݴ� ����
	public void mob73(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 222167);
	}
	
	// ���� ����
	public void mob74(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 273712);
	}

	// ������ ��ȯ��
	public void mob75(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 283712);
	}
	
	// �Ŵ� ����
	public void mob76(Player player) {
		int num = rnd.nextInt(20) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 450000);
	}
	
	// ������ ������
	public void mob77(Player player) {
		int num = rnd.nextInt(30) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 777777);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "Ÿ���� ���� �ձ� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "Ÿ���� ���� �ձ� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				//3754 90 3497  3797 75 3456
				if (loc.getX() <= 3797 && loc.getY() <= 90 && loc.getZ() <= 3497 
						&& loc.getX() >= 3754 && loc.getY() >= 75 && loc.getZ() >= 3456) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "Ÿ���� ���� �ձ� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// �������� ƼŸ�Ͼ�
	public void mob78(Player player) {
		int num = rnd.nextInt(30) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 777777);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "Ÿ���� ���� �ձ� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "Ÿ���� ���� �ձ� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				//3754 90 3497  3797 75 3456
				if (loc.getX() <= 3797 && loc.getY() <= 90 && loc.getZ() <= 3497 
						&& loc.getX() >= 3754 && loc.getY() >= 75 && loc.getZ() >= 3456) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "Ÿ���� ���� �ձ� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// ����
	public void mob79(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 465760);
	}

	// ���� ������
	public void mob80(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 315156);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� Ž��===")) {
			int qNum = cb.getNum(player);
			cb.mq23(player, qNum + 1);
		}
	}
	
	// ���� ������
	public void mob81(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 338573);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� Ž��===")) {
			int qNum = cb.getNum(player);
			cb.mq23(player, qNum + 1);
		}
	}
	
	// ���� ������
	public void mob82(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 380265);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� Ž��===")) {
			int qNum = cb.getNum(player);
			cb.mq23(player, qNum + 1);
		}
	}
	
	// �߷θ��� ����, �߷θ��� �ú�
	public void mob83(Player player) {
		int num = rnd.nextInt(20);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 401245);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(18);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// �߷θ��� ����, �߷θ��� �ú�
	public void mob84(Player player) {
		int num = rnd.nextInt(20);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 413415);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(18);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// �߷θ��� ����, �߷θ��� �ú�
	public void mob85(Player player) {
		es.giveExp(player, 444623);
	}
	
	// ���귻
	public void mob86(Player player) {
		int num = rnd.nextInt(10)+40;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1100000);
		
		ItemStack var1 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3810 93 3201  3783 63 3227
				if (loc.getX() <= 3810 && loc.getY() <= 93 && loc.getZ() <= 3227 && loc.getX() >= 3783
						&& loc.getY() >= 63 && loc.getZ() >= 3201) {
					
					try {
						QuestBoard cb = new QuestBoard();
						if (cb.getQuestName(nearPlayer).equals(ChatColor.LIGHT_PURPLE + "===������ ����7===")) {
							int qNum = cb.getNum(nearPlayer);
							cb.eq1_6(nearPlayer, qNum + 1);
							nearPlayer.teleport(new Location(nearPlayer.getWorld(), 3734, 140, 3146, 90, 0));
						} else if (cb.getQuestName(nearPlayer).equals(ChatColor.LIGHT_PURPLE + "===ī�� ����===")) {
							int qNum = cb.getNum(nearPlayer);
							cb.mq24(nearPlayer, qNum + 1);
							nearPlayer.teleport(new Location(nearPlayer.getWorld(), 3734, 140, 3146, 90, 0));
						} else {
							nearPlayer.teleport(new Location(nearPlayer.getWorld(), 3730, 179, 3236, 270, 0));
						}
					} catch(Exception e) {
						nearPlayer.teleport(new Location(nearPlayer.getWorld(), 3730, 179, 3236, 270, 0));
					}
					
				}
			}
		}
		
		try {
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����7===")) {
				int qNum = cb.getNum(player);
				cb.eq1_6(player, qNum + 1);
				player.teleport(new Location(player.getWorld(), 3734, 140, 3146, 90, 0));
			} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===ī�� ����===")) {
				int qNum = cb.getNum(player);
				cb.mq24(player, qNum + 1);
				player.teleport(new Location(player.getWorld(), 3734, 140, 3146, 90, 0));
			} else {
				player.teleport(new Location(player.getWorld(), 3730, 179, 3236, 270, 0));
			}
		} catch(Exception e) {
			player.teleport(new Location(player.getWorld(), 3730, 179, 3236, 270, 0));
		}

	}
	
	// �߷θ�
	public void mob87(Player player) {
		int num = rnd.nextInt(4) + 44;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1300000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "ī�� ���� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "ī�� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3711 163 3254  3769 133 3217
				if (loc.getX() <= 3769 && loc.getY() <= 163 && loc.getZ() <= 3254 && loc.getX() >= 3711
						&& loc.getY() >= 133 && loc.getZ() >= 3217) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "ī�� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// �Ŵ� ������
	public void mob88(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 471760);
	}
	
	// ���� �Ź�
	public void mob89(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 486124);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ο� ����===")) {
			int qNum = cb.getNum(player);
			cb.mq27(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ſ��� ���1===")) {
			int qNum = cb.getNum(player);
			cb.eq2(player, qNum + 1);
		}
	}
	
	// ���Ź�
	public void mob90(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 494250);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ο� ����===")) {
			int qNum = cb.getNum(player);
			cb.mq27(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ſ��� ���1===")) {
			int qNum = cb.getNum(player);
			cb.eq2(player, qNum + 1);
		}
	}
	
	// ������ ����
	public void mob91(Player player) {
		int num = rnd.nextInt(20) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 498760);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	// ������ ���ſ�
	public void mob92(Player player) {
		int num = 64;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 555555);
		
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "����Ʈ�� ����Ʈ: ���ſ��� ���");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'���ſ��� ���' ����Ʈ�� ������ �� �ִ�.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ���ſ�===")) {
			int qNum = cb.getNum(player);
			cb.mq28(player, qNum + 1);
		}
	}

	// ����
	public void mob93(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 512523);
	}
	
	// ������ ����
	public void mob94(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 44742);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
	}
	
	// ������ ���̵�
	public void mob95(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 49825);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
	}
	
	// ������ ����, �屳��� ���̵�, ��������
	public void mob96(Player player) {
		int num = rnd.nextInt(5) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 64235);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// ������ ����
	public void mob97(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 49125);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// ������ ���̵�
	public void mob98(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 52763);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// �Ƶ�
	public void mob99(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 160000);
		
		ItemStack var1 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "�ϱ� �������� ����");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		player.sendMessage(ChatColor.WHITE + "�ϱ� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "�Ƶ��� ���� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "�Ƶ��� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3336 10 3725  3299 45 3762
				if (loc.getX() <= 3336 && loc.getY() <= 45 && loc.getZ() <= 3762 && loc.getX() >= 3299
						&& loc.getY() >= 10 && loc.getZ() >= 3725) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "�Ƶ��� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}

	// Ư�� �丮��
	public void mob100(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 900000);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ �Ƶ��� ���� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ �Ƶ��� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3355 32 3803  3383 11 3766
				if (loc.getX() <= 3383 && loc.getY() <= 32 && loc.getZ() <= 3803 && loc.getX() >= 3355
						&& loc.getY() >= 11 && loc.getZ() >= 3766) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ �Ƶ��� ���� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// �ټ���
	public void mob101(Player player) {
		es.giveExp(player, 180000);
	}
	
	// Ǫ�� ���
	public void mob102(Player player) {
		int num = rnd.nextInt(8) + 15;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 521250);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ο� ���===")) {
			int qNum = cb.getNum(player);
			cb.q13(player, qNum + 1);
		}
	}

	// �ǻ�Ƴ� ����
	public void mob103(Player player) {
		int num = rnd.nextInt(10) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 539125);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// ������ ���� �÷��̾�
	public void mob104(Player player) {
		int num = rnd.nextInt(10) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 553419);
	}
	
	// Ķ����
	public void mob105(Player player) {
		int num = rnd.nextInt(15) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 570012);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �Ǹ�===")) {
			int qNum = cb.getNum(player);
			cb.q14(player, qNum + 1);
		}
	}
	
	// �ϱ� �ı���
	public void mob106(Player player) {
		int num = rnd.nextInt(10) + 30;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 612405);
		
		QuestBoard cb = new QuestBoard();
		if(num > 34) {
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ȥ ���� ����===")) {
				int qNum = cb.getNum(player);
				cb.mq31(player, qNum + 1);
			}
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ع��� �ı����� ��I===")) {
			int qNum = cb.getNum(player);
			cb.q15(player, qNum + 1);
		}
	}
	
	// �ǻ�Ƴ� �ذ�
	public void mob107(Player player) {
		int num = rnd.nextInt(10) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 587125);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.WHITE + "�߱� �������� ��");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.WHITE + "�߱� �������� ����");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.WHITE + "�߱� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�ǻ�Ƴ� �ذ�===")) {
			int qNum = cb.getNum(player);
			cb.mq30(player, qNum + 1);
		}
	}
	
	// �� �����
	public void mob108(Player player) {
		int num = rnd.nextInt(20) + 25;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 635241);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	// ������ ����
	public void mob109(Player player) {
		int num = rnd.nextInt(40) + 24;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 752156);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� �̾߱�1===")) {
			int qNum = cb.getNum(player);
			cb.mq33_1(player, qNum + 1);
		}
	}
	
	// ������
	public void mob110(Player player) {
		int num = rnd.nextInt(20) + 25;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 671552);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
		int tmp2 = rnd.nextInt(20);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITCH);
		}
	}
	
	// ���� ����
	public void mob111(Player player) {
		int num = rnd.nextInt(40) + 24;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 811249);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� �̾߱�2===")) {
			int qNum = cb.getNum(player);
			cb.mq34_1(player, qNum + 1);
		}
	}
	
	// 1���� ������
	public void mob112(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 1�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 1�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 1�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 2���� ������
	public void mob113(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 2�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 2�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 2�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 3���� ������
	public void mob114(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 3�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 3�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 3�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 4���� ������
	public void mob115(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 4�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 4�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 4�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 5���� ������
	public void mob116(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 5�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 5�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 5�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 6���� ������
	public void mob117(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 6�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 6�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 6�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 7���� ������
	public void mob118(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 7�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 7�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 7�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 8���� ������
	public void mob119(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 8�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 8�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 8�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 9���� ������
	public void mob120(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 9�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 9�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 9�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 10���� ������
	public void mob121(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 10�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 10�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 10�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// 11���� ������
	public void mob122(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 11�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 11�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 11�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// ž�� ����
	public void mob123(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "������ ž 12�� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "������ ž 12�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "������ ž 12�� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
				}
			}
		}
	}
	
	// ������ �ļ���
	public void mob124(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 783712);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// ������ �ļ���
	public void mob125(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 802712);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// �� ������
	public void mob126(Player player) {
		int num = rnd.nextInt(1);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 731012);
	}
	
	// ����� �ζ��� ����
	public void mob127(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 710412);
	}
	
	// ��ũ�κ��� �ϻ���
	public void mob128(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 690412);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ű�� ��===")) {
			int qNum = cb.getNum(player);
			cb.q16(player, qNum + 1);
		}
	}
	
	// ��ũ�κ��� ������
	public void mob129(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 723432);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ű�� ��===")) {
			int qNum = cb.getNum(player);
			cb.q16(player, qNum + 1);
		}
	}
	
	// ��ũ�κ��� ����
	public void mob130(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 752145);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ű�� ��===")) {
			int qNum = cb.getNum(player);
			cb.q16(player, qNum + 1);
		}
	}
	
	// Ǫ�� ������
	public void mob131(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 736213);
	}
	
	// Ǫ�� ������
	public void mob132(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 760145);
	}

	// ���ϰ����� ����
	public void mob133(Player player) {
		int num = rnd.nextInt(3) + 1;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 812512);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// ���ϰ����� �˼�
	public void mob134(Player player) {
		int num = rnd.nextInt(3) + 1;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 797012);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
	}
	
	// ������ �λ깰
	public void mob135(Player player) {
		int num = rnd.nextInt(2) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 799151);
	}
	
	// ��ȭ ���� �ΰ�
	public void mob136(Player player) {
		int num = rnd.nextInt(2) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 828282);
	}

	// ������ Ÿ���� ��
	public void mob137(Player player) {
		int num = rnd.nextInt(3) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 832501);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
		}
		
		int num2 = rnd.nextInt(30);
		if (num2 <= 0) {
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(12);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "�������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����===")) {
				int qNum = cb.getNum(player);
				cb.mq35_1(player, qNum + 1);
			}
		}
	}
	
	// ������ ������
	public void mob138(Player player) {
		int num = rnd.nextInt(3) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 849012);
	}
	
	// ���
	public void mob139(Player player) {
		int num = rnd.nextInt(3) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 900000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		}
	}
	
	// Ÿ���� ���谡
	public void mob140(Player player) {
		int num = rnd.nextInt(4) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 950000);
	}
	
	// �ڳ���
	public void mob141(Player player) {
		int num = 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 5000000);
		
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "�̱� ���� ����");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "�̱� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 49 61 654  16 51 696 
				if (loc.getX() <= 49 && loc.getY() <= 61 && loc.getZ() <= 696 
						&& loc.getX() >= 16 && loc.getY() >= 51 && loc.getZ() >= 654) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "�̱� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
					nearPlayer.teleport(new Location(nearPlayer.getWorld(), 28.5, 63, 681));
				}
			}
		}
		player.teleport(new Location(player.getWorld(), 28.5, 63, 681));
		
	}
	
	// ������ ����
	public void mob142(Player player) {
		int num = rnd.nextInt(4) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 861234);
	}
	
	// �ʸ�������
	public void mob143(Player player) {
		int num = rnd.nextInt(4) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 888888);
	}
	
	// ������ ���� ����
	public void mob144(Player player) {
		int num = rnd.nextInt(3) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 895000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq37_1(player, qNum + 1);
		}
	}
	
	// ������ ���� ������
	public void mob145(Player player) {
		int num = rnd.nextInt(3) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 916000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq37_1(player, qNum + 1);
		}
	}
	
	// �׸��� ����
	public void mob146(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 925200);
	}
	
	// TNTZ
	public void mob147(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 935500);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ź��===")) {
			int qNum = cb.getNum(player);
			cb.q17(player, qNum + 1);
		}
	}
	
	// �Ľ�Į
	public void mob148(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 980000);
	}
	
	// ����
	public void mob149(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1444444);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.q18(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
			int qNum = cb.getNum(player);
			cb.mq38_1(player, qNum + 1);
		}
	}
	
	// ������ ���� �÷��̾�
	public void mob150(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 950000);
	}
	
	// �����ҳ�
	public void mob151(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 965000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "��� �������� ��");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "��� �������� ����");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(7);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ��" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.YELLOW + "��� �������� ����" + ChatColor.YELLOW + "�� ȹ���ߴ�.");
		}
	}
	
	// ���� ����
	public void mob152(Player player) {
		es.giveExp(player, 1100000);
	}
	
	public void mob153(Player player) {

	}
	
	public void mob154(Player player) {

	}
	
	public void mob155(Player player) {

	}
	
	public void mob156(Player player) {

	}
	
	public void mob157(Player player) {

	}
}
