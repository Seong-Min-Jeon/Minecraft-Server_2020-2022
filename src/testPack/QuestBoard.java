package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Stray;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class QuestBoard {
	
	private Message msg = new Message();
	ExpSystem es = new ExpSystem();

	public void q1(Player player, int num) {
		//����
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,20);
			player.getInventory().addItem(item);
			es.giveExp(player, 50);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GRAY + "C�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�ؾ��� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("�ؾȰ� ���� 10���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q2(Player player, int num) {
		//������ �ؾ� ���� ����
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(1);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "���� �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�������� ����===");
		score.setScore(3);
		Score score2 = obj.getScore("���״� �ٴ��� ����������");
		score2.setScore(2);
		Score score3 = obj.getScore("���� ���ڸ� ã�ƺ���");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q3(Player player, int num) {
		//����
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,50);
			player.getInventory().addItem(item);
			es.giveExp(player, 300);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GRAY + "C�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�������� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("ũ����Ż ������ 10���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q4(Player player, int num) {
		//������Ʈ ��Ʈ ���
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var1 = new ItemStack(Material.WHEAT, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.GRAY + "��ó�� ���� ��");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "��ó�� ���� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�� ��ɲ�===");
		score.setScore(2);
		Score score2 = obj.getScore("������Ʈ ��Ʈ 10���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q5(Player player, int num) {
		//����
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var1 = new ItemStack(Material.COAL_ORE, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.GRAY + "������ ���� ��ź ����");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "������ ���� ��ź ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===ħ����===");
		score.setScore(2);
		Score score2 = obj.getScore("ħ���� 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q6(Player player, int num) {
		//���� Ȳ�� ���
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(2);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.YELLOW + "���� ���Ⱑ �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�� ���� ��===");
		score.setScore(2);
		Score score2 = obj.getScore("���� ���� Ŭ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q7(Player player, int num) {
		//�ĸ�Ȧ���� ���� ���
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(3);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "���� ���� ���Ⱑ �������� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ��ȭ�ϴ� ��===");
		score.setScore(2);
		Score score2 = obj.getScore("���� ���� 10�� Ŭ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q8(Player player, int num) {
		//��� ���
		if(num>=5) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD_BLOCK);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			es.giveExp(player, 30000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���ƺ������� �ٸ�===");
		score.setScore(2);
		Score score2 = obj.getScore("��ũ 5���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/5)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q9(Player player, int num) {
		//����
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD_BLOCK, 3);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			es.giveExp(player, 50000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�������� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("������ ������ 10���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q10(Player player, int num) {
		//����
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());			
			es.giveExp(player, 700000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===Żȯ===");
		score.setScore(2);
		Score score2 = obj.getScore("�� ���� ���� 100���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/100)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q11(Player player, int num) {
		//����
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());		
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(8);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.WHITE + "�հ��� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			es.giveExp(player, 1600000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===��ũ�κ���===");
		score.setScore(2);
		Score score2 = obj.getScore("������ ���� 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q12(Player player, int num) {
		//����
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(9);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.YELLOW + "���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			es.giveExp(player, 2000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("���� ���� 50���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q13(Player player, int num) {
		//����
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			es.giveExp(player, 2300000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���ο� ���===");
		score.setScore(2);
		Score score2 = obj.getScore("Ǫ�� ��� 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q14(Player player, int num) {
		//����
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			es.giveExp(player, 2550000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���� �Ǹ�===");
		score.setScore(2);
		Score score2 = obj.getScore("Ķ���� 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q15(Player player, int num) {
		//����
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(11);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "�ϱ� �ı����� ��õ" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			es.giveExp(player, 2700000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���ع��� �ı����� ��I===");
		score.setScore(2);
		Score score2 = obj.getScore("�ϱ� �ı��� 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q16(Player player, int num) {
		//����
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			es.giveExp(player, 3600000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ��Ű�� ��===");
		score.setScore(2);
		Score score2 = obj.getScore("��ũ�κ��� ���� 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q17(Player player, int num) {
		//����
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var1 = new ItemStack(Material.GOLD_ORE, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.YELLOW + "��ġ�� ������ �ݱ���");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			es.giveExp(player, 4000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===��ź��===");
		score.setScore(2);
		Score score2 = obj.getScore("TNTZ 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q18(Player player, int num) {
		//����
		if(num>=1000) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(13);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.AQUA + "������ ���" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			es.giveExp(player, 9999999);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.AQUA + "SS�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����===");
		score.setScore(2);
		Score score2 = obj.getScore("���� 1000���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1000)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq1(Player player, int num) {
		// mq23 ����
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "���� ����: �׷�.%���� ����: �װ� �ٸ� ������ �� ���谡����.%���� ����: �̰��� ������ �Ͽ��°�?%���� ����: ���⼱ �����ϰ� �԰� �ٴϴ°� �����ϴٳ�.%���� ����: ũ��. �װ� �ڳװ� �˾Ƽ� �Ұ��̰�..%���� ����: ������ ���ϵ��� ����.%"
					+ "���� ����: �������� �㸸 �Ǹ� �츮 �������� �ҳడ ������� �Ҹ��� �鸮�� ����.%���� ����: ������� �׳డ �ͽ��̶�� �����ϰ� �ִٳ�.%���� ����: ���� �ͽ��� �ʹ� ������..%���� ����: �ڳװ� �� ������ �˾Ƴ��ֱ� �ٶ��.%"
					+ "���� ����: �Ҹ��� ��e���� ���� ū ������f���� �鸰�ٳ�.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����1===");
		score.setScore(2);
		Score score2 = obj.getScore("�ܳ� ������ ���� ���ΰ� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq1_1(Player player, int num) {
		// eq1 ����
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��7Ǫ�� �޺��� ����Ǵ� �ҳడ �ִ�.%�ǹ��� �ҳ�: ...%�ǹ��� �ҳ�: ����� ����..?%��7�ͽ��̳İ� ������.%�ǹ��� �ҳ�: �ͽ�..?%�ǹ��� �ҳ�: ���� �� �̸���, ��� ������� ��� ����� ���� �ʾ�..%"
					+ "��7�ƹ����� �ҳ�� ����� ���� �� ����.%��7�ϴ� ���� ���ο��� ���� �ϴ� ���� ���� �� ����.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����2===");
		score.setScore(2);
		Score score2 = obj.getScore("�� �߿� �ҳ�� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_2(Player player, int num) {
		// eq1_1����
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "���� ����: ��?%���� ����: �ͽ��� ��ü�� ��e����� ���� ���� ���̡�f���?%���� ����: ...%���� ����: �� ������ 10�� ������ ���ڰ� �������� �ʾҴܴ�..%���� ����: �̰� ���� ū ���̱�.%"
					+ "���� ����: �� �������� ���ο��� �� ��Ȳ�� �˸��°� ���� �� ������.%���� ����: ���岲���� ���� ��� ����� �𸣰ڰ�..%���� ����: ���� ���� ��簡 ��e�ƶ���� ���� ķ����f�� �ִٴ±���.%���� ����: �ű�� �ѹ� �����Գ�.%"
					+ "���� ����: ����ķ���� ������ ���� ���� ����� �ö󰡸� ���̴� ��� ���� �ִܴ�.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����3===");
		score.setScore(2);
		Score score2 = obj.getScore("�ٽ� ���� ���ΰ� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq1_3(Player player, int num) {
		// eq1_2����
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "���: ������� �����˰� �ʹٰ�?%���: ������ ���� �赵�� ����.%��7�ǹ��� �ҳ࿡ ���� �����Ͽ���.%���: �������� �׷� ���� �־���.%���: �ٸ�. ���ʵ� ���� �Ѱ��������� �ʴ�.%"
					+ "���: ���岲���� ���� Ư���Ͻ� ���̶�..%���: ���� ��eī�� ������f�� ���� ���� �ʰ� ��ôٳ�.%���: ���𰡸� �� ã�ƾ��Ѵٴ� ���� �Բ� ������.%���: �׸��� ������ �� �� �𸣴� ���� �̰����� ����϶� ���ϼ̳�.%"
					+ "���: ���岲���� �Ƹ� ȥ�� ������ ������ �������� �� ����.%���: ������� �����˰� �ʹٸ� �������� ������.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����4===");
		score.setScore(2);
		Score score2 = obj.getScore("�ƶ���� ����ķ������ ���� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_4(Player player, int num) {
		// eq1_3����
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "tp-2465 52 543%����: ȣ����??%����: �ڳ�.%����: �� ���� �ſ� �����غ��̴±���!%����: ���� ����!");
			QuestBoard qb = new QuestBoard();
			qb.eq1_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����5===");
		score.setScore(2);
		Score score2 = obj.getScore("ī�� ���� �Ա����� ����� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_5(Player player, int num) {
		// eq1_4����
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "����: ũ����.%����: �ڳ� ���� ���� �� �԰ڳ�.%����: ��� �� �ҳ��� ��e��С�f�� Ǯ �ܼ��� ����.%����: ���� �ڳװ� ������ �ʾƵ� �� �˰� �ִٳ�.%"
					+ "����: �� ������ ���ð�.%����: �׷� ������ �ɰԾ�.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_6(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����6===");
		score.setScore(2);
		Score score2 = obj.getScore("����� �ٽ� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_6(Player player, int num) {
		// eq1_5����
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "�ǹ��� �ҳ�?: �ᱹ... ���̱���%�ǹ��� �ҳ�?: ����̾. Ư���� ��Ÿ��� �� �� �־����.%�ǹ��� �ҳ�?: �ƹ��� �� �� ������ ���� �����..%�ǹ��� �ҳ�?: ����� ���� ���� ���� �ɾ��� ����..%"
					+ "�ǹ��� �ҳ�?: ���� �ῡ�� �����..%�ǹ��� �ҳ�?: �ٽ� �ѹ� ������ �� �־����.%�ǹ��� �ҳ�?: ��, �� �Ұ��� �ʾ�����.%��ī��: ���� �ܿ��� ���� ��ī���Դϴ�.%��ī��: �ƶ��� ��û�ö ���� ���� �͵� �� ��������.%"
					+ "��ī��: ���� ��e���� ������ �ȸ��ƽ���f�� �������� �� ��.%��ī��: ��e�� �༮��f�� ���� ���� ����ģ ���� �������%��ī��: �� �ķ� ��ü�� �Ұ� �⳪�� �ῡ ������ �Ǿ����ϴ�.%��ī��: ����� �׷� ���� ������ �����̴� �̰��� �帮�ڽ��ϴ�.%"
					+ "��ī��: ��eũ����Ż����Ʈ �ֱ���f�Դϴ�.%��ī��: �̰����� ��e����ȭ�� �ˡ�f�� ���� ������ų �� ���� �̴ϴ�.%��ī��: ����ȭ�� ���� �� ī�� �������� ���� �� ���� ���Դϴ�.%��ī��: �׷� �����߽��ϴ�..%tp-2465 52 543");
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
			player.getInventory().addItem(var7);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����7===");
		score.setScore(2);
		Score score2 = obj.getScore("ī�� ���� Ŭ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}

	public void eq2(Player player, int num) {
		// ������ ���ſ� ����
		if (num >= 10) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "���ſ�: ������. ���Ͽ���. ���谡��.%���ſ�: �ι�° ����� �����ֵ��� ����.%���ſ�: �� ó�� �� �˿��� ��e�ϵ��ʡ�f���� ���� ����� �ΰ��� ���� ���̴�.%���ſ�: �װ� ������ ���ΰ� �����߰ڱ���.");
			QuestBoard qb = new QuestBoard();
			qb.eq2_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���ſ��� ���1===");
		score.setScore(2);
		Score score2 = obj.getScore("�˿��� �Ź� 10���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq2_1(Player player, int num) {
		// ������ ���ſ� ����
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "���ſ�: ũ����������. �������.%���ſ�: �� �༮�� �� �����Ϸ��� �ΰ��̴�.%���ſ�: ���� ���� ������ ���� ���� ���� �������� �� ������.%���ſ�: ���� ȸ���� ������� �Ǿ����� �� ������ �����߰ڱ���.%���ſ�: �� ���� �׾��.");
			QuestBoard qb = new QuestBoard();
			qb.eq2_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���ſ��� ���2===");
		score.setScore(2);
		Score score2 = obj.getScore("������ ���ΰ� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq2_2(Player player, int num) {
		// ������ ���ſ� ����
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "���ſ�: �� ���� �������ڴ�.%���ſ�: ������ �ٽ� ������ �ȴٸ� �� �ѹ� �ܷ������.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "����Ʈ�� ����Ʈ");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���ſ��� ���3===");
		score.setScore(2);
		Score score2 = obj.getScore("����ϱ�");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}

	public void mq1(Player player, int num) {
		if(num>=5) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,10);
			player.getInventory().addItem(item);
			es.giveExp(player, 300);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 1��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���״� ���� ���===");
		score.setScore(2);
		Score score2 = obj.getScore("���״ҿ� ��Ŵ��� �� 5���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/5)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	 
	public void mq2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD_BLOCK);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			es.giveExp(player, 1000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 2��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����===");
		score.setScore(2);
		Score score2 = obj.getScore("������ �ٴ� ���� Ŭ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq3(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,10);
			player.getInventory().addItem(item);
			es.giveExp(player, 3000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "������ ����: ���� ����ð�..%������ ����: ���� ���� ��e�����ʡ�f���� ���� �츮 ������ ���ò���.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 3��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���� ������===");
		score.setScore(3);
		Score score2 = obj.getScore("���״ҿ��� �踦 Ÿ�� ���� ������ �̵���");
		score2.setScore(2);
		Score score3 = obj.getScore("������ �ֺ��� ������ ����� ��ȭ");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq4(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,10);
			player.getInventory().addItem(item);
			es.giveExp(player, 5000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "������ ����: ������� û����� ��� �ִ��� �𸥴ٰ� �ߴٶ�..%������ ����: �˰ڳ�. ���� ������ �� ��ƺ���.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 4��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ��Ź1===");
		score.setScore(2);
		Score score2 = obj.getScore("���� ���� 10���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq5(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,10);
			player.getInventory().addItem(item);
			es.giveExp(player, 10000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "������ ����: �����߳�.%������ ����: �� ���� ���� �����Ǹ� �ٷ� ������ �ְڳ�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 5��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ��Ź2===");
		score.setScore(2);
		Score score2 = obj.getScore("���� ���� Ŭ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq6(Player player, int num) {
		if(num>=5) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			es.giveExp(player, 20000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "������ ����: ������.. ���� �����߱���%������ ����: ������ ���� ���ڸ� ���ϳ�.%������ ����: �ڳװ� ���� �������� �����ϵ��� ����.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 6��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ��Ź3===");
		score.setScore(2);
		Score score2 = obj.getScore("��� 5���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/5)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq7(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item5 = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("30,10,0,0,0,10,0,0,0,10,50");
			item5Im.setDisplayName(ChatColor.LIGHT_PURPLE + "����� ��");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� ����: 50");
			item5Lore.add(ChatColor.GRAY + " ");
			item5Lore.add(ChatColor.GRAY + "�ĸ�Ȧ���� ������ �ſ��Լ� �޾Ҵٰ� �˷��� ��");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getWorld().dropItem(player.getLocation(), item5);
			es.giveExp(player, 40000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "������ ����: �����ϳ�. �� ���� �������� ���� �� ���Ը� �����ֱ� �ٶ��.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 7��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����===");
		score.setScore(2);
		Score score2 = obj.getScore("�� ���� ������� ������ ���� ã��");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq8(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			es.giveExp(player, 50000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 8��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�ĸ�Ȧ���� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("�� ���� ��� ����� ž���� �ĸ�Ȧ���� ���� ã��");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq9(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			es.giveExp(player, 80000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "������ ����: ��eƼ����f�� �������� �ִ°�?%������ ����: Ƽ������ ������⸦ �̴´ٴ� �ҽ��� �����.%������ ����: ��뿡�� ������ ���İ� ����� ���������� �����Ͻð�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 9��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ���ư��� ���� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("������ ������ 10���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}

	public void mq10(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			es.giveExp(player, 100000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "Ƽ���� ������: �׷�.%Ƽ���� ������: ����� �Ͼ�ڴ�.%Ƽ���� ������: ���� ������ ���Ǹ� �ؼ� ������ �ֵ��� ����.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 10��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("�ܴ��� ������ 10���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq11(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 150000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��7���� ����� ����ϱ�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 11��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===��뿡 ������ ���===");
		score.setScore(2);
		Score score2 = obj.getScore("��뿡�� ��� ã��");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq12(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(4);
			ItemStack weapon2 = chest.getInventory().getItem(5);
			if(player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				player.getInventory().addItem(weapon1);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "���� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			} else {
				player.getInventory().addItem(weapon2);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "�¾��� ��" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			}
			es.giveExp(player, 200000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��7�̰����� ��e����� �ˡ�7�� �ʿ��غ���.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 12��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===��븦 ������ ��===");
		score.setScore(2);
		Score score2 = obj.getScore("��뿡�� ���� �� �Ǵ� �¾��� �� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq13(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 300000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 13��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�õ� �������� ���� ��===");
		score.setScore(2);
		Score score2 = obj.getScore("������ ���� �÷��̾� [Lv.96] 10�� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq14(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "����: �õ� ������ ����� ������ ������ �ʾ����� �ϳ� �պ�� �����̾���.%����: ������ ���������� ������ �����ϰ� �ΰ����� �뿹�� ��� ���� ��Ű�� �ٶ���%����: �̰� ������� ���� ���������ȴٳ�.%����: ������ �� ������ �� ��� �Ǿ���..%����: �̰��� �ѷ����� �ʹٰ�?%����: ������� �ϽðԳ�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 14��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�õ� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("�õ� ���꿡 �����ִ� ���ο� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq15(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(6);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.WHITE + "�� �� ���� ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			es.giveExp(player, 800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq15_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 15��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�������� ����1===");
		score.setScore(2);
		Score score2 = obj.getScore("�̰��� ����� Ư���� ������ ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}

	public void mq15_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			if(player.getInventory().contains(Material.PLAYER_HEAD)) {
				for (ItemStack is : player.getInventory().getContents()) {
					if(is == null) continue;
				    if (is.getType() == Material.PLAYER_HEAD) {			
				        if (is.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "�� �� ���� ����")) {
				        	 is.setAmount(0);
				        }
				    }
				}
			}
			es.giveExp(player, 800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "����: ����.%����: �׷��� Ȥ�� �װ� �ƴ°�?%����: ���͵��� ����ϴٺ��� �׵��� �ǳ� ������ ��ų� �Ͽ����ɼ�.%����: ���߿� ��� ������ �� �װ͵��� ���� ������%����: ���� �� ���� ��� �����������.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 15��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�������� ����2===");
		score.setScore(2);
		Score score2 = obj.getScore("���ο��� ������ �������ֱ�");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq16(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "�Ҿ��� �ֹ�: ���ƾ� �� ������ �ְŶ�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 16��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===��ǣ���� ��===");
		score.setScore(3);
		Score score2 = obj.getScore("��ǣ���� �� ���� �ۿ� �ִ�");
		score2.setScore(2);
		Score score3 = obj.getScore("�ķ�â�� ������");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq17(Player player, int num) {
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "�Ҿ��� �ֹ�: ��e�� ���ʡ�f���� ���� ������� �־�.%�Ҿ��� �ֹ�: �׸��� �� �� ����..%�Ҿ��� �ֹ�: ��� ���谡�� �Ծ�..%�Ҿ��� �ֹ�: �״� �� ���϶��� ���縦 ����ġ�� �̻��� ���̿���..%�Ҿ��� �ֹ�: ������ �����ϴ� ����� ã�� ������� �Դٴµ�..%"
					+ "�Ҿ��� �ֹ�: �ᱹ ��e���ǡ�f�� ���ݰ�� ���� ���ٰ� �Ǿ���..%�Ҿ��� �ֹ�: ���������ɱQ..");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 17��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����===");
		score.setScore(2);
		Score score2 = obj.getScore("�� ���� ���� 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq18(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			
			ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
			BookMeta bm = (BookMeta)book.getItemMeta();
			bm.setAuthor("�����ٽý�");
			bm.setTitle(ChatColor.DARK_RED + "���� �Ǵ� ����");
			ArrayList<String> pages = new ArrayList<String>();
			pages.add("���� �Ǵ� ����� �����ϴ�.\n�װ��� ��� �ΰ����� ���� �ϰ��ϸ� �Ǵ� ���̴�.\n���� ���� �ΰ��� ������ �����ϴ� ���� ����� �ִ�.");
			pages.add("������(1�κ� ����)\n\n���� ���� 50ml\n���� ��� 2��\n������ ���� 1��\n�Ҳ� �ε鷹 ���� 2��\nŰ������ �߰��� 1��");
			pages.add("���1\n\n��� ������ ���� �� ���Ǵ� ���� ������ �ʼ��̴�.");
			pages.add("���2\n\n������ �ָ����̱� ������ ���� ��̸� �־����� ȿ�����̿���.");
			pages.add("���3\n\n���κ��� �ΰ����� Ȧ���� �������� ������ ������ �־���.\n�켱 ������ ������ ����غ��Ҵ�.");
			pages.add("���4\n\n�ΰ����� ���𰡿� ������ �� ��ź�ٴ� ǥ���� ����.\n���� �ȴ�. �װ��� ������ ��Ÿ�� ���̴�.\n�׷��� �Ҳ� �ε鷹 ���ѵ� �־�Ҵ�.");
			pages.add("���5\n\nŰ������ �߰����� �� ������ �ٽ��̴�.\nŰ������ �������� �����̾���.\n���� Ư��� �ΰ����� ���⸦ ���ƸԴ� ���̸�, ���� ���� �ű⿡�� ��Ե� ���̴�.");
			pages.add(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "�� �κ��� ���� ���� ����.. �� �κ��� ���� ���� ����.. �� �κ��� ���� ���� ����.. �� �κ��� ���� ���� ����.. �� �κ��� ���� ���� ����..");
			bm.setPages(pages);			
			book.setItemMeta(bm);
			player.getInventory().addItem(book);
			
			es.giveExp(player, 1100000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��7�̹� ����� ���ϴ�.%��7����ǰ�� �����غ��� ��eå��7�� �ѱ��ִ�.%��7�������� �� �� ����.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 18��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��1===");
		score.setScore(2);
		Score score2 = obj.getScore("��ǣ���� ������ ���簡 ã��");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq19(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
			ItemMeta rewardKeyIm = rewardKey.getItemMeta();
			rewardKeyIm.setDisplayName(ChatColor.YELLOW + "�뵵�� �𸣴� ����");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "���谡�� �긮�� �� ������ �����Ǵ� ����");
			rewardLore.add(ChatColor.GRAY + "���谡�� �õ� ������ ���� ������ �����ȴ�.");
			rewardKeyIm.setLore(rewardLore);
			rewardKey.setItemMeta(rewardKeyIm);
			player.getInventory().addItem(rewardKey);
			es.giveExp(player, 1200000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��7���谡�� ��e�õ� �����7���� �� �� ����.%��7��e�뵵�� �𸣴� �����7�� ã�Ҵ�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 19��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��2===");
		score.setScore(2);
		Score score2 = obj.getScore("���簡�� ������ ���谡�� ���� ã��");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq20(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1300000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "����: ��?%����: ���� �Դٰ� �� ���İ�?%����: �� ���� ���谡�� ���� �Դٰ���.%����: ��� ���⼭ ä���ϴ� ��鵵 �־��ٰ�.%����: ...%����: ��� � ���� ��e���ε� ����f�� ��������� ����.%����: ������ �� ���Ƽ� ������ ������ �ߴµ� ������.%"
					+ "����: �ű⿡ ��e���� ������f�� �������ִٴ� �ҹ��� �־�.%����: �Ƹ� �ʰ� ã�� ����� �װ� ������ ���Ű���.");
			QuestBoard qb = new QuestBoard();
			qb.mq20_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 20��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��3===");
		score.setScore(2);
		Score score2 = obj.getScore("�õ� ������ ���ο� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq20_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1400000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��7���谡�� ���� �������� ���ƴٴϸ�%��7���� ������ ã�����ϴ� �� ����.%��7���� ������ ���� �˾ƺ��� ������ �� ����.");
			QuestBoard qb = new QuestBoard();
			qb.mq20_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 20��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��4===");
		score.setScore(2);
		Score score2 = obj.getScore("Ÿ���� ���� �ձ� Ŭ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq20_2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "����: ���� ����?%����: �� ���� ��� �����ϴ����� �𸣰ڱ�.%����: ���� �ƴ� ������ ���� ���� ���̾�.%����: �ϳ� Ȯ���� �ƴ� �� ��e���� ���� �ƶ�����f��%����: ���� ������ �ִٴ°���.%����: �ű�� �� �����̶� �� �˰� ����.%����: ������ �����̱� �ߴٸ�..%"
					+ "����: ���� ����߿� �� ����� �쿬�� �䳢�� ���󰡴� ������ �߰��߰�%����: �ű⿡ ���� ���� ���� ������ �� ���� ������ �߰��ߴ���.%����: ����Ǿ��� �ű� ������ �����̾�.%����: �� ũ�� �Ƹ��ٿ� ������ ���� �˰�����%����: �̰� � �� �� ������ ��鼭 Ŀ�� �����̰ŵ�.%"
					+ "����: ���� �ֺ����� �񱳰� �ȵɸ�ŭ ���� ���Ͱ� ����Ѵ�.%����: �����ض�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 20��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��5===");
		score.setScore(2);
		Score score2 = obj.getScore("�õ� ������ ���ο� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq21(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1600000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "���谡: �� ������?%���谡: ������ �� ��� �Ѿƴٴϴ°���?%���谡: ���� �𸥴ٰ� �����ߴٸ� �����̴�.%���谡: ��..%���谡: �ʿ��Լ� ���� ����� ��Ⱑ ���±�.%���谡: �׷�. �� �༮�� �ٸ� �������� �� ��e�÷��̾��f����.%"
					+ "���谡: �� �� ���� �ο���?%���谡: ����.. �˸��� ����.%���谡: �ο��� ������ �𸣴� ��ì�̴� ���ɾ���.%���谡: ���� �������� ���� ���뿡 ������.%���谡: �� ������ �ʹٸ�%�� �������� ���ƿͶ�.%tp-1143 181 1461");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 21��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��6===");
		score.setScore(2);
		Score score2 = obj.getScore("Ƽ�� ����� ������ ��ҷ� ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq22(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1700000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��7������ �ʹ� �߿� �� ����.%��7������ ���� �����ϰ� �� �� �ִ� ���𰡸� ã�ƺ���.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 22��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�ƶ����===");
		score.setScore(2);
		Score score2 = obj.getScore("�ƶ���� ������ ������ �ܳ� ������ ���� ���Ÿ��");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq23(Player player, int num) {
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack reward = new ItemStack(Material.GLOBE_BANNER_PATTERN);
			ItemMeta rewardIm = reward.getItemMeta();
			rewardIm.setDisplayName(ChatColor.GOLD + "����Ʈ�� ����Ʈ: ������ ����");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "'������ ����' ����Ʈ�� ������ �� �ִ�.");
			rewardIm.setLore(rewardLore);
			rewardIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			rewardIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			rewardIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			rewardIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			rewardIm.setUnbreakable(true);
			reward.setItemMeta(rewardIm);
			player.getInventory().addItem(reward);	
			player.sendMessage(ChatColor.GOLD + "����Ʈ�� ����Ʈ: ������ ����" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			es.giveExp(player, 1800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��7�����ڵ鿡�� ��eī�� ������7�� ���� ������ ��� �Ǿ���.%��7���谡�� ã�� �������� ����.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 23��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���� Ž��===");
		score.setScore(2);
		Score score2 = obj.getScore("���� ������ 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq24(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1900000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "���谡: ������� ������ �����ߴ�.%���谡: �̰��� ��Ű�� ������ ��e�߷θ���f����.%���谡: ���� ��¥ �߷θ��ϸ��� ����.%���谡: ���� ���������� �����س� �Ҿ����� ��¥ �� ��.%���谡: ��.. �� �༮�� �� �����ϴ��� �𸣰�����%���谡: ���� ���͵�� �ο�� ��e�÷��̾��f���?%"
					+ "���谡: �׷��� �̻��ϰ� �Ĵٺ�����.%���谡: �� ���� �ʿͰ��� �÷��̾�. �̸��� ��e�����׶��f��.%�����׶�: ���͸� ���̸� �������°� �翬�� �� �ƴѰ�?%�����׶�: �츰 �����ε� ���� ������ �� ����̾�.%�����׶�: �׷��� ģ�ϰ� �����°� ����.%�����׶�: ���� �̸� ����Ʈ�� �޼��߱� ������ �����ھ�.%"
					+ "�����׶�: �׷�...%�����׶�: �� �� �ؽ�Ʈ Ÿ�� ��~��!%tp-2465 52 543");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 24��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===ī�� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("ī�� ���� Ŭ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq25(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 2000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "���� ����: ��ٷȴٳ�.%���� ����: ��� ���� �Ƶ��� ����� ���꿡�� ���� ���ζ��.%���� ����: �츮 �Ƶ鿡�� ��ſ� ���� ���� �̾߱⸦ ����ٳ�.%���� ����: ��e���� ������f�� ã�� �ִ���?%���� ����: �ƶ��� �ִ� ���� ������ ī�� ������ �ִ� ���� ���γ�.%"
					+ "���� ����: ������ �Ǹ����� ���Գ�.%���� ����: �ű� �������� �ƴ�����..%���� ����: ��e���� ������ ���� ������f�� �ִ� ��Ұ� �ִٳ�.%���� ����: ���� �װ����� ���� ���� �������� ����� ������%���� ����: ���ݸ� ���߿� ���ֽðԳ�.%���� ����: �̰� ������ ��e��̷ο� ������ å��f�� �Ǹ��ϴ�%"
					+ "���� ����: ������ �ִٸ� �ѹ� �����ð�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 25��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����1===");
		score.setScore(2);
		Score score2 = obj.getScore("�ܳ� ������ ���� ���ΰ� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq26(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "����: ����.. �Ǵٸ� ���谡�� ���̱���..%����: ���� �̰��� �����ڶ��.%����: ��Ÿ������ �̰����� �����ϴ� �������� ���� ���ϸ¾Ҵٳ�. ��������.%����: ���� ���� ���� �系�� ���� �Ƿ��� �پ��. ��������.%"
					+ "����: ���� �� ������ȴٳ�. ��������.%����: �׷��� �� �༮�� ���� ���� ���� �� ����. ��������.%����: ����� �ϳ��� ���� ���� ����. ��������.%����: �� �Ʒ��� ���ڰ� �����ɼ�. ��������.");
			QuestBoard qb = new QuestBoard();
			qb.mq26_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 26��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����2===");
		score.setScore(2);
		Score score2 = obj.getScore("���� ���� �տ��� �������� �������� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq26_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack rewardKey = new ItemStack(Material.STICK);
			ItemMeta rewardKeyIm = rewardKey.getItemMeta();
			rewardKeyIm.setDisplayName(ChatColor.LIGHT_PURPLE + "���� ������");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "���� �� ��ٴٰ� ����ߴٴ� ���� ������");
			rewardLore.add(ChatColor.GRAY + "�̰����� ����� ���� ��ȭ�� �� �ִٰ� �Ѵ�.");
			rewardKeyIm.setLore(rewardLore);
			rewardKey.setItemMeta(rewardKeyIm);
			player.getInventory().addItem(rewardKey);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "���� ������" + ChatColor.WHITE + "�� ȹ���ߴ�.");
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "����: ��������.%����: �� ������ �׳� ����Ⱑ �ƴ϶��.%����: ���� ����� ���� ��e�� ��ٴ١�f���� ����Ͻô� ���� ��������.%����: �ڳװ� ������ �ִ� ����� ���� ���� ���� ���ϰ� ���ٰɼ�. ��������.%"
					+ "����: �׷� �̸� �����Գ�.%����: ���� �� �̻� ������ ������ ������. ��������.%tp-2465 52 543");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 26��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ����3===");
		score.setScore(2);
		Score score2 = obj.getScore("���ڸ� ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq27(Player player, int num) {
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 3000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "�׺�: �Ʊ�� �� ������ ��¦ ���̳���?%�׺�: �����δ� �츮�� ��ǥ�� ���� " + player.getDisplayName() + "���� ���� �������� �� �ֵ��� ���� ������ ���͵帱������!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 27��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���ο� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("�˿��� �Ź� 30���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq28(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 3500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 28��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ���ſ�===");
		score.setScore(2);
		Score score2 = obj.getScore("������ ���ſ� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq29(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 3500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "������: �׸޵� �ձ��� ������ ��eȭ���� ����f�� ��� �ִ��� �˷�����.%������: ��e������ ž��f���� �����ð�.");
			QuestBoard qb = new QuestBoard();
			qb.mq29_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 29��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ž1===");
		score.setScore(3);
		Score score2 = obj.getScore("�������� ������� ��ȭ");
		score2.setScore(2);
		Score score3 = obj.getScore("(-926,51,858)");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq29_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 3500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "ž�� ������: �� ž�� ��e�׸޵��� ������f�̶�� �̸��� ������ �־��ٳ�.%ž�� ������: �� ž�� ȭ���� ���� �ִٴ� ����� �˷�����%ž�� ������: ���� ���谡���� ã�ƿ���.%"
					+ "ž�� ������: �׷� �ڵ��� ��� �׾���� ������%ž�� ������: ������ ž�̶�� ������ ��� �Ǿ���.%ž�� ������: �ڳװ� �� ž�� ���� �ڰ��� �ִ����� ���Ŀ� ������ ����.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 29��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===������ ž2===");
		score.setScore(3);
		Score score2 = obj.getScore("������ ž���� �����ΰ� ��ȭ");
		score2.setScore(2);
		Score score3 = obj.getScore("(76,63,-22)");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq30(Player player, int num) {
		if(num>=20) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 4500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "ž�� ������: �׷�.%ž�� ������: �� ������ ���̶�� �� ž�� �����غ����� �ϱ�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 30��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�ǻ�Ƴ� �ذ�===");
		score.setScore(2);
		Score score2 = obj.getScore("�ǻ�Ƴ� �ذ� 20���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/20)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq31(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "ž�� ������: ����.%ž�� ������: �̰����� ��e���ʡ�f���� �� ���� ����� ������ �ϳ� ��������.%ž�� ������: �����ϰ�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 31��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===��ȥ ���� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("��ȥ ���� ���� ����");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq32(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "����: ����.%����: �ʵ� ���� ���� �˰� �����ų�?%����: �̰��� ���� ���� ���� �˰� �ɰŴ�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 32��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===���� ������ �԰� �;�===");
		score.setScore(2);
		Score score2 = obj.getScore("���Ʊ� ������ ����� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq33(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��������: �ȳ��ϼ���. ���� �������� �ҳ࿡��.%��������: ���ݺ��� �� ��⸦ ��� �Žÿ���.%��������: ��e�� ������f�� �־��� �Žÿ���.%��������: �װŽ� �ʹ� ������ �Žÿ���..%"
					+ "��������: �� ������� �ν������� ���� ��e�����f�� ��Ÿ�� �Žÿ���.%��������: �� ������ ���� �������ִ� �Žþ߿�.");
			QuestBoard qb = new QuestBoard();
			qb.mq33_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 33��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�״�� ��������===");
		score.setScore(2);
		Score score2 = obj.getScore("�й� ǳ������ �������ڿ� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq33_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��������: �� ����� ���� �ҸӴϿ���ϴ�.%��������: ����..");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 33��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�������� �̾߱�1===");
		score.setScore(2);
		Score score2 = obj.getScore("������ ���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq34(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��������: �ȳ��ϼ���. ���� �������� �ҳ࿡��.%��������: ���ݺ��� �� ��⸦ ��� �Žÿ���.%��������: ���������� ����� �������� ���� �߰ſ����� ���� �־��� �ű⿡��.%"
					+ "��7��������: �� ���� ���� �ְ��µ�..%��������: ..!%��������: ��e�����̡�f����� �л��ϴٺ��� �� ���� ���� ��e�����f�� ��Ÿ�� �͸� ��Ÿ��.%��������: �ε� ���ฦ �����ֽô� �Žþ߿�.");
			QuestBoard qb = new QuestBoard();
			qb.mq34_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 34��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�Ǵٽ� ��������===");
		score.setScore(2);
		Score score2 = obj.getScore("�й� ǳ������ �������ڿ� ��ȭ");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq34_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "��������: ������.%��������: ���� ���� �� ���� ���� �� ������ ���ƾ�!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 34��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�������� �̾߱�2===");
		score.setScore(2);
		Score score2 = obj.getScore("���� ���� ���");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq35(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 6000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "īŸ����: ������ ž ������ ��e���� ������f�̶�� ���� �ִٰ� �մϴ�.%īŸ����: �� ������ ��� �ȴٸ� ���������� ���ϰ� ������ �����Ѵٰ� �մϴ�.%īŸ����: ����̶�� �и��� ������ �̴ϴ�.%"
					+ "īŸ����: ���� �������� �Ѿ��.%īŸ����: ����ž�� ������ ������ ������ ���� �縲��ų �� �ִ� ����� �˾Ƴ½��ϴ�.%īŸ����: �ٸ� ����� �������� ������ ����� �� ������ ������%īŸ����: ���� �������� �ҿ����� ������ ����ؾ��߰�%"
					+ "īŸ����: �� ����� ������ ���� ������ ���� ������ ���߽��ϴ�.%īŸ����: �׷��� ������ ���� �����͸� ����� ������ ���� ���� �̴ϴ�.%īŸ����: ���� �����̶����, �����̶����, ���ϵ��̶����..%īŸ����: �̹� ����Ʈ�� �׸� �縲��Ű�� ���� ���� ������ ��.%"
					+ "īŸ����: �ű������ ����.%īŸ����: ��e������ Ÿ���� �ڡ�f�� ����Ͻʽÿ�.%ī�󸮳�: �׵��� ����ϴٺ��� ��e�������� ������f�� ���� �� ���� �̴ϴ�.%īŸ����: ���δ� �� 1���� ������ �ʿ��ϴ�, �켱 1���� ����ֽʼ�.");
			QuestBoard qb = new QuestBoard();
			qb.mq35_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 35��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===����ž�� ����===");
		score.setScore(3);
		Score score2 = obj.getScore("����ž���� īŸ������ ��ȭ");
		score2.setScore(2);
		Score score3 = obj.getScore("(221,80,725)");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq35_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 6000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "īŸ����: �����̱���.%īŸ����: �� �����صνø� ���� ������ �帮�ڽ��ϴ�.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 35��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�������� ����===");
		score.setScore(2);
		Score score2 = obj.getScore("�������� ���� ȹ��");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq36(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 7000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "īŸ����: ����������?%īŸ����: �ƹ��� �ҿ����� ���� ������ �־ ���� ���̱���..%īŸ����: �׷��� ���� ���� �����͸� ������.%īŸ����: �����մϴ�.%ī��Ƽ��: ��! ����� �̱� ������ ���� �غ��� ������ �־��.%īŸ����: ��ȸ�� �ȴٸ� ������ �����ô�!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "��������Ʈ 36��");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===�̰��� ������ ��?===");
		score.setScore(2);
		Score score2 = obj.getScore("������ �տ��� �¸�");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public int getNum(Player player) {
		try {
			ArrayList<String> list = new ArrayList<String>(player.getScoreboard().getEntries());
			String strNum = null;				
			for(String line : list) {
				if(line.charAt(0) == '(') {
					strNum= line;
					break;
				}
			}			
			int num = Integer.parseInt(strNum.split("\\(")[1].split("\\/")[0]);	
			return num;
		} catch(Exception e) {
			return 0;
		}
	}
	
	public String getQuestName(Player player) {
		try {
			ArrayList<String> list = new ArrayList<String>(player.getScoreboard().getEntries());
			String name = null;
			for(String line : list) {
				if(line.charAt(2) == '=') {
					name = line;
					break;
				}
			}			
			return name;
		} catch(Exception e) {
			return null;
		}
	}
	
}
