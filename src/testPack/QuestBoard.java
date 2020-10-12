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
		//상점
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
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GRAY + "C급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===해안의 위협===");
		score.setScore(2);
		Score score2 = obj.getScore("해안가 좀비 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q2(Player player, int num) {
		//잊혀진 해안 던전 보상
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(1);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "검은 해적단의 보물" + ChatColor.WHITE + "을 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===해적선의 보물===");
		score.setScore(3);
		Score score2 = obj.getScore("워그닐 바다의 해적선에서");
		score2.setScore(2);
		Score score3 = obj.getScore("보물 상자를 찾아보자");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q3(Player player, int num) {
		//상점
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
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GRAY + "C급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 말단===");
		score.setScore(2);
		Score score2 = obj.getScore("크리스탈 워리어 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q4(Player player, int num) {
		//포레스트 고스트 드랍
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var1 = new ItemStack(Material.WHEAT, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.GRAY + "상처가 많은 밀");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "상처가 많은 밀" + ChatColor.WHITE + "을 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===밀 사냥꾼===");
		score.setScore(2);
		Score score2 = obj.getScore("포레스트 고스트 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q5(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var1 = new ItemStack(Material.COAL_ORE, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.GRAY + "흠집이 생긴 석탄 광석");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "흠집이 생긴 석탄 광석" + ChatColor.WHITE + "을 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===침략자===");
		score.setScore(2);
		Score score2 = obj.getScore("침략자 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q6(Player player, int num) {
		//숲의 황소 드랍
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(2);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.YELLOW + "숲의 정기가 느껴지는 보물" + ChatColor.WHITE + "을 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===숲 깊은 곳===");
		score.setScore(2);
		Score score2 = obj.getScore("숲의 유적 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q7(Player player, int num) {
		//파르홀론의 유령 드랍
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(3);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "깊은 숲의 정기가 느껴지는 보물" + ChatColor.WHITE + "을 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===유적을 정화하는 자===");
		score.setScore(2);
		Score score2 = obj.getScore("숲의 유적 10번 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q8(Player player, int num) {
		//고블린 드랍
		if(num>=5) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD_BLOCK);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			es.giveExp(player, 30000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===같아보이지만 다른===");
		score.setScore(2);
		Score score2 = obj.getScore("오크 5마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/5)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q9(Player player, int num) {
		//상점
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD_BLOCK, 3);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			es.giveExp(player, 50000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 위협===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르 정찰병 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q10(Player player, int num) {
		//상점
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());			
			es.giveExp(player, 700000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===탈환===");
		score.setScore(2);
		Score score2 = obj.getScore("성 안의 몬스터 100마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/100)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q11(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());		
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(8);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.WHITE + "왕가의 제물" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 1600000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===네크로벨리===");
		score.setScore(2);
		Score score2 = obj.getScore("묘지기 몬스터 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q12(Player player, int num) {
		//상점
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(9);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.YELLOW + "데빌 인자" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 2000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===데빌 인자===");
		score.setScore(2);
		Score score2 = obj.getScore("데빌 몬스터 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q13(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			es.giveExp(player, 2300000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===새로운 고블린===");
		score.setScore(2);
		Score score2 = obj.getScore("푸르 고블린 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q14(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			es.giveExp(player, 2550000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===불의 악마===");
		score.setScore(2);
		Score score2 = obj.getScore("캘시퍼 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q15(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(11);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "하급 파괴수의 원천" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 2700000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===방해받은 파괴수의 잠I===");
		score.setScore(2);
		Score score2 = obj.getScore("하급 파괴수 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q16(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			es.giveExp(player, 3600000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===");
		score.setScore(2);
		Score score2 = obj.getScore("네크로벨리 몬스터 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q17(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var1 = new ItemStack(Material.GOLD_ORE, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.YELLOW + "가치가 떨어진 금광석");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			es.giveExp(player, 4000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===폭탄병===");
		score.setScore(2);
		Score score2 = obj.getScore("TNTZ 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q18(Player player, int num) {
		//상점
		if(num>=1000) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(13);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.AQUA + "에밀의 헤드" + ChatColor.WHITE + "를 획득했다.");
			es.giveExp(player, 9999999);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.AQUA + "SS급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===에밀의 결의===");
		score.setScore(2);
		Score score2 = obj.getScore("에밀 1000마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1000)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq1(Player player, int num) {
		// mq23 보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "얼음 장인: 그래.%얼음 장인: 네가 다른 곳에서 온 모험가구나.%얼음 장인: 이곳에 적응은 하였는가?%얼음 장인: 여기선 따뜻하게 입고 다니는게 안전하다네.%얼음 장인: 크흠. 그건 자네가 알아서 할것이고..%얼음 장인: 본론을 말하도록 하지.%"
					+ "얼음 장인: 얼마전부터 밤만 되면 우리 마을에서 소녀가 흐느끼는 소리가 들리지 뭔가.%얼음 장인: 사람들은 그녀가 귀신이라고 생각하고 있다네.%얼음 장인: 나는 귀신이 너무 무서워..%얼음 장인: 자네가 그 진위를 알아네주길 바라네.%"
					+ "얼음 장인: 소리는 §e은행 뒤의 큰 나무§f에서 들린다네.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희1===");
		score.setScore(2);
		Score score2 = obj.getScore("콘노 마을의 얼음 장인과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq1_1(Player player, int num) {
		// eq1 보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7푸른 달빛이 연상되는 소녀가 있다.%의문의 소녀: ...%의문의 소녀: 당신은 누구..?%§7귀신이냐고 물었다.%의문의 소녀: 귀신..?%의문의 소녀: 나는 내 이름도, 어디 사는지도 모두 기억이 나지 않아..%"
					+ "§7아무래도 소녀는 기억을 잃은 것 같다.%§7일단 얼음 장인에게 보고를 하는 것이 좋을 것 같다.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희2===");
		score.setScore(2);
		Score score2 = obj.getScore("밤 중에 소녀와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_2(Player player, int num) {
		// eq1_1보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "얼음 장인: 뭐?%얼음 장인: 귀신의 정체가 §e기억을 잃은 여자 아이§f라고?%얼음 장인: ...%얼음 장인: 이 마을엔 10년 전부터 여자가 존재하지 않았단다..%얼음 장인: 이거 정말 큰 일이군.%"
					+ "얼음 장인: 내 생각에는 원로원에 이 상황을 알리는게 좋을 것 같구나.%얼음 장인: 의장께서는 지금 어디에 계신지 모르겠고..%얼음 장인: 그의 직속 기사가 §e아란모어 정찰 캠프§f에 있다는구나.%얼음 장인: 거기로 한번 가보게나.%"
					+ "얼음 장인: 정찰캠프는 마을의 길을 따라 언덕을 올라가면 보이는 계단 위에 있단다.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희3===");
		score.setScore(2);
		Score score2 = obj.getScore("다시 얼음 장인과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq1_3(Player player, int num) {
		// eq1_2보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "기사: 의장님을 만나뵙고 싶다고?%기사: 이유를 먼저 듣도록 하지.%§7의문의 소녀에 대해 설명하였다.%기사: 마을에선 그런 일이 있었군.%기사: 다만. 이쪽도 지금 한가하지만은 않다.%"
					+ "기사: 의장께서는 조금 특이하신 분이라..%기사: 지금 §e카루 던전§f에 가서 오질 않고 계시다네.%기사: 무언가를 꼭 찾아야한다는 말과 함께 가셨지.%기사: 그리고 누군가 올 지 모르니 나는 이곳에서 대기하라 명하셨네.%"
					+ "기사: 의장께서도 아마 혼자 던전에 들어가지는 않으셨을 것 같다.%기사: 의장님을 만나뵙고 싶다면 던전으로 가보게.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희4===");
		score.setScore(2);
		Score score2 = obj.getScore("아란모어 정찰캠프에서 기사와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_4(Player player, int num) {
		// eq1_3보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "tp-2465 52 543%의장: 호오옹??%의장: 자네.%의장: 그 옷은 매우 따뜻해보이는구만!%의장: 아주 고맙네!");
			QuestBoard qb = new QuestBoard();
			qb.eq1_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희5===");
		score.setScore(2);
		Score score2 = obj.getScore("카루 던전 입구에서 의장과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_5(Player player, int num) {
		// eq1_4보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "의장: 크흐흠.%의장: 자네 옷은 내가 잘 입겠네.%의장: 대신 그 소녀의 §e비밀§f을 풀 단서를 주지.%의장: 나는 자네가 말하지 않아도 다 알고 있다네.%"
					+ "의장: 이 던전에 들어가시게.%의장: 그럼 도움이 될게야.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_6(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희6===");
		score.setScore(2);
		Score score2 = obj.getScore("의장과 다시 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_6(Player player, int num) {
		// eq1_5보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "의문의 소녀?: 결국... 오셨군요%의문의 소녀?: 당신이어서. 특별한 당신만이 할 수 있었어요.%의문의 소녀?: 아무도 볼 수 없었던 저의 모습을..%의문의 소녀?: 당신이 저를 보고 말을 걸어준 순간..%"
					+ "의문의 소녀?: 저는 잠에서 깨어났고..%의문의 소녀?: 다시 한번 현신할 수 있었어요.%의문의 소녀?: 참, 제 소개가 늦었군요.%스카디: 저는 겨울의 여신 스카디입니다.%스카디: 아란모어에 사시사철 눈이 오는 것도 제 영향이죠.%"
					+ "스카디: 저는 §e신의 공간인 팔리아스§f가 무너지던 그 날.%스카디: §e그 녀석§f을 막기 위해 지나친 힘을 써버려서%스카디: 그 후로 실체를 잃고 기나긴 잠에 빠지게 되었습니다.%스카디: 당신은 그런 저를 깨워준 은인이니 이것을 드리겠습니다.%"
					+ "스카디: §e크리스탈라이트 주괴§f입니다.%스카디: 이것으로 §e부조화의 검§f의 힘을 각성시킬 수 있을 겁니다.%스카디: 부조화의 검은 이 카루 던전에서 얻을 수 있을 것입니다.%스카디: 그럼 감사했습니다..%tp-2465 52 543");
			ItemStack var7 = new ItemStack(Material.NETHERITE_INGOT);
			ItemMeta var7Im = var7.getItemMeta();
			var7Im.setDisplayName(ChatColor.DARK_RED + "크리스탈라이즈 주괴");
			ArrayList<String> var7Lore = new ArrayList();
			var7Lore.add(ChatColor.GRAY + "부조화의 검의 초월 소재");
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
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희7===");
		score.setScore(2);
		Score score2 = obj.getScore("카루 던전 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}

	public void eq2(Player player, int num) {
		// 늪지의 마신왕 보상
		if (num >= 10) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마신왕: 훗훗훗. 잘하였다. 모험가여.%마신왕: 두번째 명령을 내려주도록 하지.%마신왕: 날 처음 본 늪에서 §e북동쪽§f으로 가면 언덕에 민가가 있을 것이다.%마신왕: 그곳 산장의 주인과 만나야겠구나.");
			QuestBoard qb = new QuestBoard();
			qb.eq2_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===마신왕의 계약1===");
		score.setScore(2);
		Score score2 = obj.getScore("늪에서 거미 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq2_1(Player player, int num) {
		// 늪지의 마신왕 보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마신왕: 크하하하하하. 놀랐느냐.%마신왕: 그 녀석은 날 봉인하려한 인간이다.%마신왕: 너의 힘을 빌리니 나의 힘이 더욱 강해지는 것 같구나.%마신왕: 이제 회복도 어느정도 되었으니 니 몸에서 나가야겠구나.%마신왕: 날 위해 죽어라.");
			QuestBoard qb = new QuestBoard();
			qb.eq2_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===마신왕의 계약2===");
		score.setScore(2);
		Score score2 = obj.getScore("산장의 주인과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq2_2(Player player, int num) {
		// 늪지의 마신왕 보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마신왕: 난 이제 떠나가겠다.%마신왕: 언젠가 다시 만나게 된다면 또 한번 겨루어주지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===마신왕의 계약3===");
		score.setScore(2);
		Score score2 = obj.getScore("사망하기");
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
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 1장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===워그닐 섬의 비밀===");
		score.setScore(2);
		Score score2 = obj.getScore("워그닐에 배신당한 자 5마리 사냥");
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
			im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			es.giveExp(player, 1000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 2장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===수련의 시작===");
		score.setScore(2);
		Score score2 = obj.getScore("잊혀진 바다 신전 클리어");
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
			msg.msg(player, "포르간 촌장: 허허 어서오시게..%포르간 촌장: 길을 따라 §e오른쪽§f으로 가면 우리 마을이 나올껄세.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 3장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===에일 땅으로===");
		score.setScore(3);
		Score score2 = obj.getScore("워그닐에서 배를 타고 에일 땅으로 이동해");
		score2.setScore(2);
		Score score3 = obj.getScore("선착장 주변의 포르간 촌장과 대화");
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
			msg.msg(player, "포르간 촌장: 마녀들은 청년들이 어디에 있는지 모른다고 했다라..%포르간 촌장: 알겠네. 내가 정보를 더 모아보지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 4장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===촌장의 부탁1===");
		score.setScore(2);
		Score score2 = obj.getScore("숲의 마녀 10마리 사냥");
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
			msg.msg(player, "포르간 촌장: 수고했네.%포르간 촌장: 내 마을 일이 정리되면 바로 연락을 주겠네.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 5장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===촌장의 부탁2===");
		score.setScore(2);
		Score score2 = obj.getScore("숲의 유적 클리어");
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
			msg.msg(player, "포르간 촌장: 허허허.. 역시 성공했구만%포르간 촌장: 하지만 아직 모자른 듯하네.%포르간 촌장: 자네가 더욱 강해지면 연락하도록 하지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 6장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===촌장의 부탁3===");
		score.setScore(2);
		Score score2 = obj.getScore("고블린 5마리 사냥");
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
			item5Im.setDisplayName(ChatColor.LIGHT_PURPLE + "용사의 검");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "레벨 제한: 50");
			item5Lore.add(ChatColor.GRAY + " ");
			item5Lore.add(ChatColor.GRAY + "파르홀론의 수장이 신에게서 받았다고 알려진 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getWorld().dropItem(player.getLocation(), item5);
			es.giveExp(player, 40000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "포르간 촌장: 축하하네. 더 넓은 세상으로 떠나 이 세게를 구해주길 바라네.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 7장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===전설의 시작===");
		score.setScore(2);
		Score score2 = obj.getScore("센 마그 평원에서 전설의 검을 찾기");
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
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 8장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===파르홀론의 역사===");
		score.setScore(2);
		Score score2 = obj.getScore("센 마그 평원 어딘가의 탑에서 파르홀론의 흔적 찾기");
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
			msg.msg(player, "포르간 촌장: §e티르§f에 가본적이 있는가?%포르간 촌장: 티르에서 등대지기를 뽑는다는 소식을 들었네.%포르간 촌장: 등대에는 수많은 지식과 비밀이 남아있으니 참고하시게.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 9장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===앞으로 나아가기 위한 여정===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르 정찰병 10마리 사냥");
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
			msg.msg(player, "티르의 생존자: 그래.%티르의 생존자: 당신을 믿어보겠다.%티르의 생존자: 마을 사람들과 상의를 해서 연락을 주도록 하지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 10장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===등대지기 시험===");
		score.setScore(2);
		Score score2 = obj.getScore("외눈의 포보르 10마리 사냥");
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
			msg.msg(player, "§7과연 여기는 어디일까.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 11장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===등대에 숨겨진 비밀===");
		score.setScore(2);
		Score score2 = obj.getScore("등대에서 비밀 찾기");
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
				player.sendMessage(ChatColor.LIGHT_PURPLE + "달의 힘" + ChatColor.WHITE + "을 획득했다.");
			} else {
				player.getInventory().addItem(weapon2);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "태양의 힘" + ChatColor.WHITE + "을 획득했다.");
			}
			es.giveExp(player, 200000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7이것으로 §e용사의 검§7을 초월해보자.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 12장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===등대를 밝히는 힘===");
		score.setScore(2);
		Score score2 = obj.getScore("등대에서 달의 힘 또는 태양의 힘 얻기");
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
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 13장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===시드 광산으로 가는 길===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르 세력 플레이어 [Lv.96] 10명 사냥");
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
			msg.msg(player, "광부: 시드 광산은 값비싼 광물은 나오지 않았지만 꽤나 붐비던 광산이었네.%광부: 하지만 포보르들이 광산을 점령하고 인간들을 노예로 삼아 일을 시키는 바람에%광부: 이곳 사람들은 거의 도망가버렸다네.%광부: 때문에 이 광산은 텅 비게 되었지..%광부: 이곳을 둘러보고 싶다고?%광부: 마음대로 하시게나.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 14장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===시드 광산===");
		score.setScore(2);
		Score score2 = obj.getScore("시드 광산에 남아있는 광부와 대화");
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
			player.sendMessage(ChatColor.WHITE + "알 수 없는 광석" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq15_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 15장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 무기1===");
		score.setScore(2);
		Score score2 = obj.getScore("이계의 운석에서 특이한 광물을 얻기");
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
				        if (is.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "알 수 없는 광석")) {
				        	 is.setAmount(0);
				        }
				    }
				}
			}
			es.giveExp(player, 800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "광부: 고맙네.%광부: 그런데 혹시 그걸 아는가?%광부: 몬스터들을 사냥하다보면 그들의 피나 심장을 얻거나 하였을걸세.%광부: 나중에 장비를 제작할 때 그것들을 재료로 삼으면%광부: 더욱 질 좋은 장비가 만들어질껄세.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 15장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 무기2===");
		score.setScore(2);
		Score score2 = obj.getScore("광부에게 광물을 가져다주기");
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
			msg.msg(player, "불안한 주민: 으아악 날 내보내 주거라.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 16장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미푀르유 성===");
		score.setScore(3);
		Score score2 = obj.getScore("미푀르유 성 동문 밖에 있는");
		score2.setScore(2);
		Score score3 = obj.getScore("식량창고에 가보기");
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
			msg.msg(player, "불안한 주민: §e성 안쪽§f에는 아직 사람들이 있어.%불안한 주민: 그리고 몇 달 전에..%불안한 주민: 어느 모험가가 왔어..%불안한 주민: 그는 이 에일땅의 역사를 파해치는 이상한 놈이였어..%불안한 주민: 고서적을 연구하던 사람을 찾아 여기까지 왔다는데..%"
					+ "불안한 주민: 결국 §e진실§f을 깨닫고는 미쳐 날뛰게 되었지..%불안한 주민: 케케케케케켘..");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 17장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===은빛의 영역===");
		score.setScore(2);
		Score score2 = obj.getScore("성 안의 몬스터 30마리 사냥");
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
			bm.setAuthor("히포넨시스");
			bm.setTitle(ChatColor.DARK_RED + "신이 되는 포션");
			ArrayList<String> pages = new ArrayList<String>();
			pages.add("신이 되는 방법은 간단하다.\n그것은 모든 인간들이 나를 믿게하면 되는 일이다.\n따라서 나는 인간의 감정을 조종하는 약을 만들고 있다.");
			pages.add("레시피(1인분 기준)\n\n용의 눈물 50ml\n검은 장미 2잎\n정령의 심장 1개\n불꽃 민들레 씨앗 2개\n키어컬의 발걸음 1개");
			pages.add("기록1\n\n상급 포션을 만들 때 사용되는 용의 눈물은 필수이다.");
			pages.add("기록2\n\n일종의 최면제이기 때문에 검은 장미를 넣었더니 효과적이였다.");
			pages.add("기록3\n\n예로부터 인간들을 홀리는 종족에는 몽마와 정령이 있었다.\n우선 정령의 심장을 사용해보았다.");
			pages.add("기록4\n\n인간들을 무언가에 빠졌을 때 불탄다는 표현을 쓴다.\n나는 안다. 그것은 실제로 불타는 것이다.\n그래서 불꽃 민들레 씨앗도 넣어보았다.");
			pages.add("기록5\n\n키어컬의 발걸음이 이 포션의 핵심이다.\n키어컬은 포보르의 수장이었다.\n그의 특기는 인간들의 정기를 빨아먹는 것이며, 그의 힘도 거기에서 비롯된 것이다.");
			pages.add(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "이 부분은 읽을 수가 없어.. 이 부분은 읽을 수가 없어.. 이 부분은 읽을 수가 없어.. 이 부분은 읽을 수가 없어.. 이 부분은 읽을 수가 없어..");
			bm.setPages(pages);			
			book.setItemMeta(bm);
			player.getInventory().addItem(book);
			
			es.giveExp(player, 1100000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7이미 사망한 듯하다.%§7소지품을 수색해보니 §e책§7이 한권있다.%§7가져가야 할 것 같다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 18장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자1===");
		score.setScore(2);
		Score score2 = obj.getScore("미푀르유 성에서 역사가 찾기");
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
			rewardKeyIm.setDisplayName(ChatColor.YELLOW + "용도를 모르는 열쇠");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "모험가가 흘리고 간 것으로 추정되는 열쇠");
			rewardLore.add(ChatColor.GRAY + "모험가는 시드 광산을 향한 것으로 추측된다.");
			rewardKeyIm.setLore(rewardLore);
			rewardKey.setItemMeta(rewardKeyIm);
			player.getInventory().addItem(rewardKey);
			es.giveExp(player, 1200000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7모험가는 §e시드 광산§7으로 간 것 같다.%§7§e용도를 모르는 열쇠§7를 찾았다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 19장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자2===");
		score.setScore(2);
		Score score2 = obj.getScore("역사가를 살해한 모험가의 흔적 찾기");
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
			msg.msg(player, "광부: 뭐?%광부: 누가 왔다간 적 없냐고?%광부: 너 같은 모험가는 많이 왔다갔지.%광부: 계속 여기서 채광하는 놈들도 있었다고.%광부: ...%광부: 사실 어떤 놈이 §e봉인된 문§f을 열어버렸지 뭔가.%광부: 위험할 것 같아서 말하지 않으려 했는데 말이지.%"
					+ "광부: 거기에 §e신의 보물§f이 숨겨져있다는 소문이 있어.%광부: 아마 너가 찾는 사람은 그걸 가지러 간거겠지.");
			QuestBoard qb = new QuestBoard();
			qb.mq20_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 20장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자3===");
		score.setScore(2);
		Score score2 = obj.getScore("시드 광산의 광부와 대화");
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
			msg.msg(player, "§7모험가는 여러 던전들을 돌아다니며%§7신의 보물을 찾으려하는 것 같다.%§7신의 보물에 대해 알아보러 가야할 것 같다.");
			QuestBoard qb = new QuestBoard();
			qb.mq20_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 20장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자4===");
		score.setScore(2);
		Score score2 = obj.getScore("타락한 요정 왕국 클리어");
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
			msg.msg(player, "광부: 신의 보물?%광부: 이 땅에 몇개나 존재하는지는 모르겠군.%광부: 내가 아는 정보도 거의 없고 말이야.%광부: 하나 확실히 아는 건 §e서쪽 섬인 아란모어§f에%광부: 신의 보물이 있다는거지.%광부: 거기는 내 고향이라 잘 알고 있지.%광부: 마을의 전설이긴 했다만..%"
					+ "광부: 마을 사람중에 한 사람이 우연히 토끼를 따라가다 던전을 발견했고%광부: 거기에 전설 속의 신의 물건인 것 같은 물건을 발견했다지.%광부: 어찌되었건 거긴 위험한 지역이야.%광부: 내 크고 아름다운 근육을 보면 알겠지만%광부: 이게 어릴 적 그 설원에 살면서 커진 근육이거든.%"
					+ "광부: 여기 주변과는 비교가 안될만큼 강한 몬스터가 출몰한다.%광부: 조심해라.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 20장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자5===");
		score.setScore(2);
		Score score2 = obj.getScore("시드 광산의 광부와 대화");
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
			msg.msg(player, "모험가: 넌 누구냐?%모험가: 누군데 날 계속 쫓아다니는거지?%모험가: 내가 모른다고 생각했다면 오산이다.%모험가: 흠..%모험가: 너에게선 나와 비슷한 향기가 나는군.%모험가: 그래. 네 녀석도 다른 차원에서 온 §e플레이어§f구나.%"
					+ "모험가: 넌 뭘 위해 싸우지?%모험가: 역시.. 알리가 없지.%모험가: 싸움의 이유도 모르는 잔챙이는 관심없다.%모험가: 나는 이제부터 설원 지대에 갈꺼다.%모험가: 날 만나고 싶다면%더 강해져서 돌아와라.%tp-1143 181 1461");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 21장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자6===");
		score.setScore(2);
		Score score2 = obj.getScore("티르 등대의 숨겨진 장소로 가기");
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
			msg.msg(player, "§7날씨가 너무 추운 것 같다.%§7마을에 가서 따뜻하게 할 수 있는 무언가를 찾아보자.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 22장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===아란모어===");
		score.setScore(2);
		Score score2 = obj.getScore("아란모어 지역에 도착해 콘노 마을로 가는 썰매타기");
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
			rewardIm.setDisplayName(ChatColor.GOLD + "엑스트라 퀘스트: 설원의 가희");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "'설원의 가희' 퀘스트를 진행할 수 있다.");
			rewardIm.setLore(rewardLore);
			rewardIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			rewardIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			rewardIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			rewardIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			rewardIm.setUnbreakable(true);
			reward.setItemMeta(rewardIm);
			player.getInventory().addItem(reward);	
			player.sendMessage(ChatColor.GOLD + "엑스트라 퀘스트: 설원의 가희" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 1800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7정찰자들에게 §e카루 던전§7에 대한 정보를 듣게 되었다.%§7모험가를 찾아 떠나도록 하자.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 23장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===던전 탐색===");
		score.setScore(2);
		Score score2 = obj.getScore("설원 정찰자 30마리 사냥");
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
			msg.msg(player, "모험가: 여기까지 오느라 수고했다.%모험가: 이곳을 지키는 보스는 §e발로르§f더군.%모험가: 물론 진짜 발로르일리가 없지.%모험가: 그저 포보르들이 연성해낸 불안정한 가짜 일 뿐.%모험가: 아.. 네 녀석이 뭘 생각하는진 모르겠지만%모험가: 나는 몬스터들과 싸우는 §e플레이어§f라고?%"
					+ "모험가: 그렇게 이상하게 쳐다보지마.%모험가: 나 또한 너와같은 플레이어. 이름은 §e데히테라§f다.%데히테라: 몬스터를 죽이며 강해지는건 당연한 일 아닌가?%데히테라: 우린 앞으로도 많이 만나게 될 운명이야.%데히테라: 그러니 친하게 지내는게 좋지.%데히테라: 나는 이만 퀘스트를 달성했기 때문에 가보겠어.%"
					+ "데히테라: 그럼...%데히테라: 씨 유 넥스트 타임 바~이!%tp-2465 52 543");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 24장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===카루 던전===");
		score.setScore(2);
		Score score2 = obj.getScore("카루 던전 클리어");
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
			msg.msg(player, "얼음 장인: 기다렸다네.%얼음 장인: 사실 나의 아들이 당신이 광산에서 만난 광부라네.%얼음 장인: 우리 아들에게 당신에 대한 많은 이야기를 들었다네.%얼음 장인: §e신의 보물§f을 찾고 있다지?%얼음 장인: 아란모어에 있는 신의 보물은 카루 던전에 있는 것이 전부네.%"
					+ "얼음 장인: 하지만 실망하지 말게나.%얼음 장인: 신급 아이템은 아니지만..%얼음 장인: §e과거 영웅이 쓰던 무구§f가 있는 장소가 있다네.%얼음 장인: 지금 그곳으로 가기 위한 통행증을 만들고 있으니%얼음 장인: 조금만 나중에 와주시게나.%얼음 장인: 이곳 서점에 §e흥미로운 내용의 책§f을 판매하니%"
					+ "얼음 장인: 관심이 있다면 한번 가보시게.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 25장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 보물1===");
		score.setScore(2);
		Score score2 = obj.getScore("콘노 마을의 얼음 장인과 대화");
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
			msg.msg(player, "노인: 허허.. 또다른 모험가가 오셨구만..%노인: 나는 이곳의 관리자라우.%노인: 안타깝지만 이곳에서 관리하던 무구들은 전부 도둑맞았다네. 허허허허.%노인: 검은 옷을 입은 사내가 아주 실력이 뛰어났지. 허허허허.%"
					+ "노인: 아주 싹 쓸어가버렸다네. 허허허허.%노인: 그래도 그 녀석이 보는 눈은 없는 것 같소. 허허허허.%노인: 막대기 하나는 놓고 갔지 뭔가. 허허허허.%노인: 저 아래에 상자가 있을걸세. 허허허허.");
			QuestBoard qb = new QuestBoard();
			qb.mq26_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 26장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 보물2===");
		score.setScore(2);
		Score score2 = obj.getScore("마법 수정 앞에서 성스러운 통행증을 사용");
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
			rewardKeyIm.setDisplayName(ChatColor.LIGHT_PURPLE + "검의 손잡이");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "영웅 루 라바다가 사용했다는 검의 손잡이");
			rewardLore.add(ChatColor.GRAY + "이것으로 용사의 검을 강화할 수 있다고 한다.");
			rewardKeyIm.setLore(rewardLore);
			rewardKey.setItemMeta(rewardKeyIm);
			player.getInventory().addItem(rewardKey);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "검의 손잡이" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "노인: 허허허허.%노인: 그 막대기는 그냥 막대기가 아니라우.%노인: 무려 고대의 영웅 §e루 라바다§f님이 사용하시던 검의 손잡이지.%노인: 자네가 가지고 있는 용사의 검의 힘을 더욱 강하게 해줄걸세. 허허허허.%"
					+ "노인: 그럼 이만 떠나게나.%노인: 나는 더 이상 존재의 이유가 없구먼. 허허허허.%tp-2465 52 543");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 26장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 보물3===");
		score.setScore(2);
		Score score2 = obj.getScore("상자를 열기");
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
			msg.msg(player, "네비: 아까는 저 때문에 깜짝 놀라셨나요?%네비: 앞으로는 우리의 목표를 위해 " + player.getDisplayName() + "님이 더욱 강해지실 수 있도록 제가 옆에서 도와드릴꺼에요!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 27장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===새로운 만남===");
		score.setScore(2);
		Score score2 = obj.getScore("늪에서 거미 30마리 사냥");
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
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 28장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===늪지의 마신왕===");
		score.setScore(2);
		Score score2 = obj.getScore("늪지의 마신왕 사냥");
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
			msg.msg(player, "마법사: 네메드 왕국의 보물인 §e화염의 돌§f이 어디에 있는지 알려주지.%마법사: §e죽음의 탑§f으로 가보시게.");
			QuestBoard qb = new QuestBoard();
			qb.mq29_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 29장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽음의 탑1===");
		score.setScore(3);
		Score score2 = obj.getScore("유적에서 마법사와 대화");
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
			msg.msg(player, "탑의 관리인: 이 탑은 §e네메드의 무덤§f이라는 이름을 가지고 있었다네.%탑의 관리인: 이 탑에 화염의 돌이 있다는 사실이 알려지자%탑의 관리인: 많은 모험가들이 찾아왔지.%"
					+ "탑의 관리인: 그런 자들이 계속 죽어나갔기 때문에%탑의 관리인: 죽음의 탑이라는 별명을 얻게 되었지.%탑의 관리인: 자네가 이 탑을 오를 자격이 있는지는 차후에 보도록 하지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 29장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽음의 탑2===");
		score.setScore(3);
		Score score2 = obj.getScore("죽음의 탑에서 관리인과 대화");
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
			msg.msg(player, "탑의 관리인: 그래.%탑의 관리인: 그 정도의 힘이라면 이 탑에 도전해볼만은 하군.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 30장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===되살아난 해골===");
		score.setScore(2);
		Score score2 = obj.getScore("되살아난 해골 20마리 사냥");
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
			msg.msg(player, "탑의 관리인: 고맙네.%탑의 관리인: 이곳에서 §e북쪽§f으로 쭉 가면 언덕에 마을이 하나 있을꺼다.%탑의 관리인: 참고하게.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 31장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===영혼 요정 가루===");
		score.setScore(2);
		Score score2 = obj.getScore("영혼 요정 가루 수집");
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
			msg.msg(player, "관장: 헛헛.%관장: 너도 너의 힘을 알고 싶은거냐?%관장: 이곳에 들어가면 너의 힘을 알게 될거다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 32장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===너의 근육을 먹고 싶어===");
		score.setScore(2);
		Score score2 = obj.getScore("베아그 마을의 관장과 대화");
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
			msg.msg(player, "빨간모자: 안녕하세야. 저는 빨간모자 소녀에여.%빨간모자: 지금부터 제 얘기를 듣는 거시에여.%빨간모자: §e밀 가디언§f이 있었던 거시에여.%빨간모자: 그거슨 너무 무서운 거시에여..%"
					+ "빨간모자: 밀 가디언을 부숴버리다 보면 §e늑대§f가 나타날 거시에여.%빨간모자: 그 늑대의 목을 가져와주는 거시야요.");
			QuestBoard qb = new QuestBoard();
			qb.mq33_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 33장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===그대는 빨간모자===");
		score.setScore(2);
		Score score2 = obj.getScore("밀밭 풍차에서 빨간모자와 대화");
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
			msg.msg(player, "빨간모자: 그 늑대는 저희 할머니였답니다.%빨간모자: 후훗..");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 33장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기1===");
		score.setScore(2);
		Score score2 = obj.getScore("변장한 늑대 사냥");
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
			msg.msg(player, "빨간모자: 안녕하세양. 저는 빨간모자 소녀에여.%빨간모자: 지금부터 제 얘기를 듣는 거시에여.%빨간모자: 오래전부터 기분이 좋아지고 몸이 뜨거워지는 약이 있었던 거기에여.%"
					+ "§7빨간모자: 그 약이 정말 최고였는데..%빨간모자: ..!%빨간모자: §e약쟁이§f놈들을 학살하다보면 그 약을 만든 §e마녀§f가 나타날 것만 가타여.%빨간모자: 부디 마녀를 없애주시는 거시야요.");
			QuestBoard qb = new QuestBoard();
			qb.mq34_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 34장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===또다시 빨간모자===");
		score.setScore(2);
		Score score2 = obj.getScore("밀밭 풍차에서 빨간모자와 대화");
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
			msg.msg(player, "빨간모자: 고마워여.%빨간모자: 이제 저도 그 약을 만들 수 있을것 같아양!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 34장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기2===");
		score.setScore(2);
		Score score2 = obj.getScore("과자 마녀 사냥");
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
			msg.msg(player, "카타리나: 죽음의 탑 위에는 §e빛의 성물§f이라는 것이 있다고 합니다.%카타리나: 그 성물을 얻게 된다면 포보르들을 멸하고 개벽이 도래한다고 합니다.%카타리나: 당신이라면 분명히 가능할 겁니다.%"
					+ "카타리나: 이제 본론으로 넘어가죠.%카타리나: 마법탑의 연구로 과거의 포보르 왕을 재림시킬 수 있는 방법을 알아냈습니다.%카타리나: 다만 저희는 포보르의 마나를 사용할 수 없었기 때문에%카타리나: 연성 과정에서 불완전한 마나를 사용해야했고%"
					+ "카타리나: 그 결과로 포보르 왕이 완전한 힘을 얻지는 못했습니다.%카타리나: 그래도 포보르 왕의 데이터를 충분히 축적할 수는 있을 겁니다.%카타리나: 그의 패턴이라던지, 습성이라던지, 부하들이라던지..%카타리나: 이번 퀘스트는 그를 재림시키기 위한 재료는 모으는 것.%"
					+ "카타리나: 거기까지만 하죠.%카타리나: §e마법에 타락한 자§f를 사냥하십시오.%카라리나: 그들을 사냥하다보면 §e포보르의 마나§f를 얻을 수 있을 겁니다.%카타리나: 재료로는 딱 1개의 마나만 필요하니, 우선 1개만 얻어주십쇼.");
			QuestBoard qb = new QuestBoard();
			qb.mq35_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 35장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===마법탑을 향해===");
		score.setScore(3);
		Score score2 = obj.getScore("마법탑에서 카타리나와 대화");
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
			msg.msg(player, "카타리나: 얻으셨군요.%카타리나: 잘 보관해두시면 제가 연락을 드리겠습니다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 35장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 마나===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르의 마나 획득");
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
			msg.msg(player, "카타리나: 괜찮으세요?%카타리나: 아무리 불완전한 힘을 가지고 있어도 왕은 왕이군요..%카타리나: 그래도 좋은 전투 데이터를 얻었어요.%카타리나: 감사합니다.%카라티나: 아! 참고로 미궁 끝에는 저희가 준비한 선물이 있어요.%카타리나: 기회가 된다면 끝까지 가봅시다!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 36장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===이것이 포보르 왕?===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르 왕에게 승리");
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
