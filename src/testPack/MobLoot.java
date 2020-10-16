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

	// 공격을 모르는 스켈이
	public void mob1(Player player) {
		ItemStack ticket = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta ticketIm = ticket.getItemMeta();
		ticketIm.setDisplayName(ChatColor.YELLOW + "보스 스켈이 소환 티켓");
		ArrayList<String> ticketLore = new ArrayList();
		ticketLore.add(ChatColor.GRAY + "보스 스켈이를 소환할 수 있는 티켓");
		ticketLore.add(ChatColor.GRAY + "Q를 이용해 사용해보자");
		ticketIm.setLore(ticketLore);
		ticket.setItemMeta(ticketIm);
		player.getInventory().addItem(ticket);
		player.sendMessage(ChatColor.YELLOW + "보스 스켈이 소환 티켓" + ChatColor.WHITE + "을 획득했다.");
		es.giveExp(player, 1);
	}

	// 보스 스켈이
	public void mob2(Player player) {
		ItemStack ticket = new ItemStack(Material.PAPER);
		ItemMeta ticketIm = ticket.getItemMeta();
		ticketIm.setDisplayName(ChatColor.YELLOW + "낫 교환권");
		ArrayList<String> ticketLore = new ArrayList();
		ticketLore.add(ChatColor.GRAY + "낫과 교환할 수 있을 것 같다.");
		ticketLore.add(ChatColor.GRAY + "주민과 대화해 사용해보자");
		ticketIm.setLore(ticketLore);
		ticket.setItemMeta(ticketIm);
		player.getInventory().addItem(ticket);
		player.sendMessage(ChatColor.YELLOW + "낫 교환권" + ChatColor.WHITE + "을 획득했다.");
		es.giveExp(player, 1);
	}

	// 초록 슬라임
	public void mob3(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 10);
	}

	// 해안가 좀비
	public void mob4(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 80);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===해안의 위협===")) {
			int qNum = cb.getNum(player);
			cb.q1(player, qNum + 1);
		}
	}

	// 워그닐에 배신당한 자
	public void mob5(Player player) {
		int num = rnd.nextInt(5) + 2;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 260);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===워그닐 섬의 비밀===")) {
			int qNum = cb.getNum(player);
			cb.mq1(player, qNum + 1);
		}
	}

	// 검은 수염 하수인
	public void mob6(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 2734);
	}

	// 검은 수염 간부
	public void mob7(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(100);
		if (num2 <= 0) {
			ItemStack rein = new ItemStack(Material.CHARCOAL);
			ItemMeta reinIm = rein.getItemMeta();
			reinIm.setDisplayName(ChatColor.AQUA + "검은 수염의 증표");
			ArrayList<String> reinLore = new ArrayList();
			reinLore.add(ChatColor.GRAY + "검은 수염단의 검의 초월 소재");
			reinIm.setLore(reinLore);
			rein.setItemMeta(reinIm);
			player.getInventory().addItem(rein);
			player.sendMessage(ChatColor.AQUA + "검은 수염의 증표" + ChatColor.WHITE + "을 획득했다.");
		}
		es.giveExp(player, 3168);
	}

	// 포레스트 고스트
	public void mob8(Player player) {
		int num = rnd.nextInt(10) + 3;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(30);
		if (num2 <= 0) {
			ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.WHITE + "퀘스트: 밀 사냥꾼");
			ArrayList<String> scrollLore = new ArrayList();
			scrollLore.add(ChatColor.GRAY + "'밀 사냥꾼' 퀘스트를 진행할 수 있다.");
			scrollIm.setLore(scrollLore);
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);
			player.getInventory().addItem(scroll);
			player.sendMessage(ChatColor.WHITE + "퀘스트: 밀 사냥꾼" + ChatColor.WHITE + "을 획득했다.");
		}
		es.giveExp(player, 524);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===밀 사냥꾼===")) {
			int qNum = cb.getNum(player);
			cb.q4(player, qNum + 1);
		}
	}

	// 크리스탈 워리어
	public void mob9(Player player) {
		int num = rnd.nextInt(2) + 5;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 571);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 말단===")) {
			int qNum = cb.getNum(player);
			cb.q3(player, qNum + 1);
		}
	}

	// 저주받은 나무 요정
	public void mob10(Player player) {
		int num = rnd.nextInt(6) + 4;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 652);
	}

	// 산호 정령
	public void mob11(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 233);
	}

	// 산호 스트레이
	public void mob12(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 355);
	}

	// 거북 병사
	public void mob13(Player player) {
		int num = rnd.nextInt(6);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 202);
	}

	// 엘더 가디언
	public void mob14(Player player) {
		int num = rnd.nextInt(20) + 10;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 732);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "잊혀진 바다 신전 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "잊혀진 바다 신전 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(10, 3, 10);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearplayer = (Player) nearEntity;
				nearplayer.getInventory().addItem(rewardKey);
				nearplayer.sendMessage(ChatColor.YELLOW + "잊혀진 바다 신전 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
			}
		}
	}

	// 고블린
	public void mob15(Player player) {
		int num = rnd.nextInt(10) + 16;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 8226);

		int num2 = rnd.nextInt(20);
		if (num2 == 0) {
			ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.WHITE + "퀘스트: 같아보이지만 다른");
			ArrayList<String> scrollLore = new ArrayList();
			scrollLore.add(ChatColor.GRAY + "'같아보이지만 다른' 퀘스트를 진행할 수 있다.");
			scrollIm.setLore(scrollLore);
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);
			player.getInventory().addItem(scroll);
			player.sendMessage(ChatColor.WHITE + "퀘스트: 같아보이지만 다른" + ChatColor.WHITE + "을 획득했다.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁3===")) {
			int qNum = cb.getNum(player);
			cb.mq6(player, qNum + 1);
		}
	}

	// 파르홀론의 망자
	public void mob16(Player player) {
		int num = rnd.nextInt(10) + 18;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 9527);
	}

	// 파르홀론의 유령
	public void mob17(Player player) {
		int num = rnd.nextInt(4) + 20;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(50);
		if (num2 == 0) {
			ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "퀘스트: 유적을 정화하는 자");
			ArrayList<String> scrollLore = new ArrayList();
			scrollLore.add(ChatColor.GRAY + "'유적을 정화하는 자' 퀘스트를 진행할 수 있다.");
			scrollIm.setLore(scrollLore);
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);
			player.getInventory().addItem(scroll);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "퀘스트: 유적을 정화하는 자" + ChatColor.WHITE + "을 획득했다.");
		}
		es.giveExp(player, 10374);
	}

	// 변이된 곰
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
			player.sendMessage(ChatColor.LIGHT_PURPLE + "변이의 힘이 담긴 물체" + ChatColor.WHITE + "을 획득했다.");
		}
		es.giveExp(player, 15554);
	}

	// 침략자
	public void mob19(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 2217);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===침략자===")) {
			int qNum = cb.getNum(player);
			cb.q5(player, qNum + 1);
		}
	}

	// 숲의 황소
	public void mob20(Player player) {
		int num = rnd.nextInt(30);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(10);
		if (num2 <= 0) {
			ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.YELLOW + "퀘스트: 숲 깊은 곳");
			ArrayList<String> scrollLore = new ArrayList();
			scrollLore.add(ChatColor.GRAY + "'숲 깊은 곳' 퀘스트를 진행할 수 있다.");
			scrollIm.setLore(scrollLore);
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);
			player.getInventory().addItem(scroll);
			player.sendMessage(ChatColor.YELLOW + "퀘스트: 숲 깊은 곳" + ChatColor.WHITE + "을 획득했다.");
		}
		es.giveExp(player, 3572);
	}

	// 숲의 마녀
	public void mob21(Player player) {
		int num = rnd.nextInt(18);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 3152);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁1===")) {
			int qNum = cb.getNum(player);
			cb.mq4(player, qNum + 1);
		}
	}

	// 산적
	public void mob22(Player player) {
		int num = rnd.nextInt(10) + 6;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 2811);
	}

	// 변이된 나뭇잎
	public void mob23(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 3852);
		World world = player.getWorld();
		int num2 = rnd.nextInt(15);
		if (num2 == 0) {
			player.teleport(new Location(world, 3464.5, 18, 3740));
			player.sendMessage("유적 어딘가로 이동했다.");
		} else if (num2 == 1) {
			player.teleport(new Location(world, 3464.5, 18, 3697));
			player.sendMessage("유적 어딘가로 이동했다.");
		} else if (num2 == 2) {
			player.teleport(new Location(world, 3503.5, 18, 3698));
			player.sendMessage("유적 어딘가로 이동했다.");
		} else if (num2 == 3) {
			player.teleport(new Location(world, 3514.5, 18, 3745));
			player.sendMessage("유적 어딘가로 이동했다.");
		} else if (num2 == 4) {
			player.teleport(new Location(world, 3539.5, 18, 3698));
			player.sendMessage("유적 어딘가로 이동했다.");
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

	// 되살아난 모험가
	public void mob24(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 4220);
		World world = player.getWorld();
		int num2 = rnd.nextInt(10);
		if (num2 == 0) {
			player.teleport(new Location(world, 3464.5, 18, 3740));
			player.sendMessage("유적 어딘가로 이동했다.");
		} else if (num2 == 1) {
			player.teleport(new Location(world, 3464.5, 18, 3697));
			player.sendMessage("유적 어딘가로 이동했다.");
		} else if (num2 == 2) {
			player.teleport(new Location(world, 3503.5, 18, 3698));
			player.sendMessage("유적 어딘가로 이동했다.");
		} else if (num2 == 3) {
			player.teleport(new Location(world, 3514.5, 18, 3745));
			player.sendMessage("유적 어딘가로 이동했다.");
		} else if (num2 == 4) {
			player.teleport(new Location(world, 3539.5, 18, 3698));
			player.sendMessage("유적 어딘가로 이동했다.");
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

	// 유적의 주인
	public void mob25(Player player) {
		int num = rnd.nextInt(20);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 20000);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "숲의 유적 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "숲의 유적 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");

		World world = player.getWorld();

		List<Entity> entitylist = player.getNearbyEntities(40, 20, 40);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearplayer = (Player) nearEntity;
				if (nearplayer.getLocation().getX() <= 3556 && nearplayer.getLocation().getY() <= 35
						&& nearplayer.getLocation().getZ() <= 3726 && nearplayer.getLocation().getX() >= 3522
						&& nearplayer.getLocation().getY() >= 15 && nearplayer.getLocation().getZ() >= 3691) {
					nearplayer.getInventory().addItem(rewardKey);
					nearplayer.sendMessage(ChatColor.YELLOW + "숲의 유적 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
					nearplayer.teleport(new Location(world, 3465, 37, 3749.5, -90f, 1.4f));
					nearplayer.sendMessage("유적 어딘가로 이동했다.");
				}
			}
		}

		player.teleport(new Location(world, 3465, 37, 3749.5, -90f, -1.4f));
		player.sendMessage("유적 어딘가로 이동했다.");

	}

	// 오크
	public void mob26(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 17312);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===같아보이지만 다른===")) {
			int qNum = cb.getNum(player);
			cb.q8(player, qNum + 1);
		}
	}

	// 미래를 예지하는 눈
	public void mob27(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
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
			player.sendMessage(ChatColor.YELLOW + "미래를 예지하는 눈" + ChatColor.WHITE + "을 획득했다.");
		}
		
	}

	// 검은 인간
	public void mob28(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 22532);
	}

	// 포보르 정찰병
	public void mob29(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 28653);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 위협===")) {
			int qNum = cb.getNum(player);
			cb.q9(player, qNum + 1);
		}

		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===앞으로 나아가기 위한 여정===")) {
			int qNum = cb.getNum(player);
			cb.mq9(player, qNum + 1);
		}
	}

	// 유적을 지키는 거미
	public void mob30(Player player) {
		es.giveExp(player, 50000);
	}

	// 파르홀론의 수호자
	public void mob31(Player player) {
		es.giveExp(player, 60000);
	}

	// 외눈의 포보르
	public void mob32(Player player) {
		int num = rnd.nextInt(3);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 30800);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대지기 시험===")) {
			int qNum = cb.getNum(player);
			cb.mq10(player, qNum + 1);
		}
	}

	// 포보르 세력 플레이어
	public void mob33(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 45412);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시드 광산으로 가는 길===")) {
			int qNum = cb.getNum(player);
			cb.mq13(player, qNum + 1);
		}
	}

	// 동굴 거미
	public void mob34(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 90621);
	}

	// 동굴 벌레
	public void mob35(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 95134);
	}

	// 아랑
	public void mob36(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 84134);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 머라우더
	public void mob37(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 90134);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 파르홀론의 전투병
	public void mob38(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 399999);
	}

	// 포보르 세력 플레이어
	public void mob39(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 108134);
	}

	// 분노의 형상
	public void mob40(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 130134);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}	
	}

	// 공허의 형상
	public void mob41(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 144160);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 고통의 형상
	public void mob42(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 151532);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 침묵의 형상
	public void mob43(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 166256);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 우울의 형상
	public void mob44(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 178490);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 허몽의 형상
	public void mob45(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 183613);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 오만의 형상
	public void mob46(Player player) {
		int num = rnd.nextInt(8) + 2;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 198236);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 배신의 형상
	public void mob47(Player player) {
		int num = rnd.nextInt(8) + 2;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 193572);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 시련의 형상
	public void mob48(Player player) {
		player.sendMessage("클리어!");
		player.teleport(new Location(player.getWorld(), -1106, 186, 1453.5, -90.0f, 0.0f));
		
		Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		ItemStack item = chest.getInventory().getItem(7);
		player.getInventory().addItem(item);
		player.sendMessage(ChatColor.DARK_RED + "숨겨진 달걀 1" + ChatColor.WHITE + "을 획득했다.");
	}

	// 귀웅
	public void mob49(Player player) {
		int num = rnd.nextInt(8) + 3;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 121257);
	}

	// 대사
	public void mob50(Player player) {
		int num = rnd.nextInt(8) + 3;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 131257);
	}

	// 영혼을 탐하는 요정
	public void mob51(Player player) {
		es.giveExp(player, 251256);
	}

	// 딥슬라임
	public void mob52(Player player) {
		es.giveExp(player, 258193);
	}

	// 워리어
	public void mob53(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 220000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 빈디케이터
	public void mob54(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 232516);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 저거너트
	public void mob55(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 247236);
	}

	// 유서퍼
	public void mob56(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 261684);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 뒤틀린 역사의 흔적
	public void mob57(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 271134);
	}
	
	// 아공간 파수꾼
	public void mob58(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 294284);
	}

	// 조난당한 영혼
	public void mob59(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 251652);
	}

	// 익사당한 선원
	public void mob60(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 261684);
	}
	
	// 수라
	public void mob61(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 281256);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 나찰
	public void mob62(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 303261);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 나호
	public void mob63(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 331534);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 나섬
	public void mob64(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 361654);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 데빌 보초병
	public void mob65(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 405631);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===데빌 인자===")) {
			int qNum = cb.getNum(player);
			cb.q12(player, qNum + 1);
		}
	}

	// 데빌 병사
	public void mob66(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 427134);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===데빌 인자===")) {
			int qNum = cb.getNum(player);
			cb.q12(player, qNum + 1);
		}
	}

	// 데빌 분대장
	public void mob67(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 461124);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===데빌 인자===")) {
			int qNum = cb.getNum(player);
			cb.q12(player, qNum + 1);
		}
	}
	
	// 묘지기의 신직
	public void mob68(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 331134);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// 묘지기의 사령관
	public void mob69(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 358417);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// 묘지기의 영술사
	public void mob70(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 378571);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// 묘지기의 이능자
	public void mob71(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 418760);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// 보초를 서는 요정
	public void mob72(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 204251);
	}
	
	// 공격대 요정
	public void mob73(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 222167);
	}
	
	// 불의 요정
	public void mob74(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 273712);
	}

	// 요정의 소환수
	public void mob75(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 283712);
	}
	
	// 거대 요정
	public void mob76(Player player) {
		int num = rnd.nextInt(20) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 450000);
	}
	
	// 요정왕 오베론
	public void mob77(Player player) {
		int num = rnd.nextInt(30) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 777777);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				//3754 90 3497  3797 75 3456
				if (loc.getX() <= 3797 && loc.getY() <= 90 && loc.getZ() <= 3497 
						&& loc.getX() >= 3754 && loc.getY() >= 75 && loc.getZ() >= 3456) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 요정여왕 티타니아
	public void mob78(Player player) {
		int num = rnd.nextInt(30) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 777777);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				//3754 90 3497  3797 75 3456
				if (loc.getX() <= 3797 && loc.getY() <= 90 && loc.getZ() <= 3497 
						&& loc.getX() >= 3754 && loc.getY() >= 75 && loc.getZ() >= 3456) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 나비
	public void mob79(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 465760);
	}

	// 설원 정찰자
	public void mob80(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 315156);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===던전 탐색===")) {
			int qNum = cb.getNum(player);
			cb.mq23(player, qNum + 1);
		}
	}
	
	// 설원 정찰자
	public void mob81(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 338573);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===던전 탐색===")) {
			int qNum = cb.getNum(player);
			cb.mq23(player, qNum + 1);
		}
	}
	
	// 설원 정찰자
	public void mob82(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 380265);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===던전 탐색===")) {
			int qNum = cb.getNum(player);
			cb.mq23(player, qNum + 1);
		}
	}
	
	// 발로르의 보병, 발로르의 궁병
	public void mob83(Player player) {
		int num = rnd.nextInt(20);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 401245);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(18);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 발로르의 보병, 발로르의 궁병
	public void mob84(Player player) {
		int num = rnd.nextInt(20);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 413415);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(18);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 발로르의 보병, 발로르의 궁병
	public void mob85(Player player) {
		es.giveExp(player, 444623);
	}
	
	// 케흘렌
	public void mob86(Player player) {
		int num = rnd.nextInt(10)+40;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1100000);
		
		ItemStack var1 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 심장");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		player.sendMessage(ChatColor.WHITE + "중급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		
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
						if (cb.getQuestName(nearPlayer).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희7===")) {
							int qNum = cb.getNum(nearPlayer);
							cb.eq1_6(nearPlayer, qNum + 1);
							nearPlayer.teleport(new Location(nearPlayer.getWorld(), 3734, 140, 3146, 90, 0));
						} else if (cb.getQuestName(nearPlayer).equals(ChatColor.LIGHT_PURPLE + "===카루 던전===")) {
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
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희7===")) {
				int qNum = cb.getNum(player);
				cb.eq1_6(player, qNum + 1);
				player.teleport(new Location(player.getWorld(), 3734, 140, 3146, 90, 0));
			} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===카루 던전===")) {
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
	
	// 발로르
	public void mob87(Player player) {
		int num = rnd.nextInt(4) + 44;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1300000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 뿔");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		player.sendMessage(ChatColor.WHITE + "중급 포보르의 뿔" + ChatColor.WHITE + "을 획득했다.");

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "카루 던전 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "카루 던전 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3711 163 3254  3769 133 3217
				if (loc.getX() <= 3769 && loc.getY() <= 163 && loc.getZ() <= 3254 && loc.getX() >= 3711
						&& loc.getY() >= 133 && loc.getZ() >= 3217) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "카루 던전 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 거대 슬라임
	public void mob88(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 471760);
	}
	
	// 늑대 거미
	public void mob89(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 486124);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 만남===")) {
			int qNum = cb.getNum(player);
			cb.mq27(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약1===")) {
			int qNum = cb.getNum(player);
			cb.eq2(player, qNum + 1);
		}
	}
	
	// 독거미
	public void mob90(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 494250);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 만남===")) {
			int qNum = cb.getNum(player);
			cb.mq27(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약1===")) {
			int qNum = cb.getNum(player);
			cb.eq2(player, qNum + 1);
		}
	}
	
	// 늪지의 마수
	public void mob91(Player player) {
		int num = rnd.nextInt(20) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 498760);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	// 늪지의 마신왕
	public void mob92(Player player) {
		int num = 64;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 555555);
		
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "엑스트라 퀘스트: 마신왕의 계약");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'마신왕의 계약' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===늪지의 마신왕===")) {
			int qNum = cb.getNum(player);
			cb.mq28(player, qNum + 1);
		}
	}

	// 산적
	public void mob93(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 512523);
	}
	
	// 전투형 집사
	public void mob94(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 44742);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
	}
	
	// 전투형 메이드
	public void mob95(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 49825);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
	}
	
	// 기사출신 집사, 장교출신 메이드, 보안팀장
	public void mob96(Player player) {
		int num = rnd.nextInt(5) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 64235);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 전투형 집사
	public void mob97(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 49125);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 전투형 메이드
	public void mob98(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 52763);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 아덴
	public void mob99(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 160000);
		
		ItemStack var1 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		player.sendMessage(ChatColor.WHITE + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "아덴의 저택 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "아덴의 저택 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3336 10 3725  3299 45 3762
				if (loc.getX() <= 3336 && loc.getY() <= 45 && loc.getZ() <= 3762 && loc.getX() >= 3299
						&& loc.getY() >= 10 && loc.getZ() >= 3725) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "아덴의 저택 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}

	// 특급 요리사
	public void mob100(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 900000);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "숨겨진 아덴의 저택 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "숨겨진 아덴의 저택 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3355 32 3803  3383 11 3766
				if (loc.getX() <= 3383 && loc.getY() <= 32 && loc.getZ() <= 3803 && loc.getX() >= 3355
						&& loc.getY() >= 11 && loc.getZ() >= 3766) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "숨겨진 아덴의 저택 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 바선생
	public void mob101(Player player) {
		es.giveExp(player, 180000);
	}
	
	// 푸르 고블린
	public void mob102(Player player) {
		int num = rnd.nextInt(8) + 15;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 521250);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 고블린===")) {
			int qNum = cb.getNum(player);
			cb.q13(player, qNum + 1);
		}
	}

	// 되살아난 전사
	public void mob103(Player player) {
		int num = rnd.nextInt(10) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 539125);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.WHITE + "중급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.WHITE + "중급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 포보르 세력 플레이어
	public void mob104(Player player) {
		int num = rnd.nextInt(10) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 553419);
	}
	
	// 캘시퍼
	public void mob105(Player player) {
		int num = rnd.nextInt(15) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 570012);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.WHITE + "중급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.WHITE + "중급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===불의 악마===")) {
			int qNum = cb.getNum(player);
			cb.q14(player, qNum + 1);
		}
	}
	
	// 하급 파괴수
	public void mob106(Player player) {
		int num = rnd.nextInt(10) + 30;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 612405);
		
		QuestBoard cb = new QuestBoard();
		if(num > 34) {
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===영혼 요정 가루===")) {
				int qNum = cb.getNum(player);
				cb.mq31(player, qNum + 1);
			}
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===방해받은 파괴수의 잠I===")) {
			int qNum = cb.getNum(player);
			cb.q15(player, qNum + 1);
		}
	}
	
	// 되살아난 해골
	public void mob107(Player player) {
		int num = rnd.nextInt(10) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 587125);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.WHITE + "중급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.WHITE + "중급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.WHITE + "중급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===되살아난 해골===")) {
			int qNum = cb.getNum(player);
			cb.mq30(player, qNum + 1);
		}
	}
	
	// 밀 가디언
	public void mob108(Player player) {
		int num = rnd.nextInt(20) + 25;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 635241);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	// 변장한 늑대
	public void mob109(Player player) {
		int num = rnd.nextInt(40) + 24;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 752156);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기1===")) {
			int qNum = cb.getNum(player);
			cb.mq33_1(player, qNum + 1);
		}
	}
	
	// 약쟁이
	public void mob110(Player player) {
		int num = rnd.nextInt(20) + 25;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 671552);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		int tmp2 = rnd.nextInt(20);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITCH);
		}
	}
	
	// 과자 마녀
	public void mob111(Player player) {
		int num = rnd.nextInt(40) + 24;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 811249);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기2===")) {
			int qNum = cb.getNum(player);
			cb.mq34_1(player, qNum + 1);
		}
	}
	
	// 1층의 지배자
	public void mob112(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 1층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 1층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 1층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 2층의 지배자
	public void mob113(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 2층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 2층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 2층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 3층의 지배자
	public void mob114(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 3층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 3층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 3층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 4층의 지배자
	public void mob115(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 4층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 4층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 4층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 5층의 지배자
	public void mob116(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 5층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 5층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 5층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 6층의 지배자
	public void mob117(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 6층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 6층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 6층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 7층의 지배자
	public void mob118(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 7층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 7층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 7층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 8층의 지배자
	public void mob119(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 8층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 8층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 8층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 9층의 지배자
	public void mob120(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 9층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 9층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 9층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 10층의 지배자
	public void mob121(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 10층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 10층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 10층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 11층의 지배자
	public void mob122(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 11층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 11층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 11층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 탑의 주인
	public void mob123(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 12층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "죽음의 탑 12층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "죽음의 탑 12층 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}
	
	// 지하의 파수꾼
	public void mob124(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 783712);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 지하의 파수꾼
	public void mob125(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 802712);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 갓 슬라임
	public void mob126(Player player) {
		int num = rnd.nextInt(1);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 731012);
	}
	
	// 사라진 부락의 전사
	public void mob127(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 710412);
	}
	
	// 네크로벨리 암살자
	public void mob128(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 690412);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q16(player, qNum + 1);
		}
	}
	
	// 네크로벨리 감시자
	public void mob129(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 723432);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q16(player, qNum + 1);
		}
	}
	
	// 네크로벨리 복병
	public void mob130(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 752145);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q16(player, qNum + 1);
		}
	}
	
	// 푸르 날벌레
	public void mob131(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 736213);
	}
	
	// 푸르 날벌레
	public void mob132(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 760145);
	}

	// 지하감옥의 간부
	public void mob133(Player player) {
		int num = rnd.nextInt(3) + 1;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 812512);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 지하감옥의 죄수
	public void mob134(Player player) {
		int num = rnd.nextInt(3) + 1;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 797012);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 마력의 부산물
	public void mob135(Player player) {
		int num = rnd.nextInt(2) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 799151);
	}
	
	// 강화 개조 인간
	public void mob136(Player player) {
		int num = rnd.nextInt(2) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 828282);
	}

	// 마법에 타락한 자
	public void mob137(Player player) {
		int num = rnd.nextInt(3) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 832501);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		int num2 = rnd.nextInt(30);
		if (num2 <= 0) {
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(12);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "포보르의 마나" + ChatColor.WHITE + "를 획득했다.");
			
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 마나===")) {
				int qNum = cb.getNum(player);
				cb.mq35_1(player, qNum + 1);
			}
		}
	}
	
	// 전생한 슬라임
	public void mob138(Player player) {
		int num = rnd.nextInt(3) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 849012);
	}
	
	// 재앙
	public void mob139(Player player) {
		int num = rnd.nextInt(3) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 900000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.YELLOW + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.YELLOW + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.YELLOW + "을 획득했다.");
		}
	}
	
	// 타락한 모험가
	public void mob140(Player player) {
		int num = rnd.nextInt(4) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 950000);
	}
	
	// 코낭그
	public void mob141(Player player) {
		int num = 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 5000000);
		
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "미궁 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		player.sendMessage(ChatColor.YELLOW + "미궁 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 49 61 654  16 51 696 
				if (loc.getX() <= 49 && loc.getY() <= 61 && loc.getZ() <= 696 
						&& loc.getX() >= 16 && loc.getY() >= 51 && loc.getZ() >= 654) {
					nearPlayer.getInventory().addItem(rewardKey);
					nearPlayer.sendMessage(ChatColor.YELLOW + "미궁 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
					nearPlayer.teleport(new Location(nearPlayer.getWorld(), 28.5, 63, 681));
				}
			}
		}
		player.teleport(new Location(player.getWorld(), 28.5, 63, 681));
		
	}
	
	// 요정의 파편
	public void mob142(Player player) {
		int num = rnd.nextInt(4) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 861234);
	}
	
	// 초마도용기사
	public void mob143(Player player) {
		int num = rnd.nextInt(4) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 888888);
	}
	
	// 떠도는 망령 전사
	public void mob144(Player player) {
		int num = rnd.nextInt(3) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 895000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.YELLOW + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.YELLOW + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.YELLOW + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===떠도는 망령===")) {
			int qNum = cb.getNum(player);
			cb.mq37_1(player, qNum + 1);
		}
	}
	
	// 떠도는 망령 마법사
	public void mob145(Player player) {
		int num = rnd.nextInt(3) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 916000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.YELLOW + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.YELLOW + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.YELLOW + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===떠도는 망령===")) {
			int qNum = cb.getNum(player);
			cb.mq37_1(player, qNum + 1);
		}
	}
	
	// 그리즐리 베어
	public void mob146(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 925200);
	}
	
	// TNTZ
	public void mob147(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 935500);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===폭탄병===")) {
			int qNum = cb.getNum(player);
			cb.q17(player, qNum + 1);
		}
	}
	
	// 파스칼
	public void mob148(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 980000);
	}
	
	// 에밀
	public void mob149(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1444444);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===에밀의 결의===")) {
			int qNum = cb.getNum(player);
			cb.q18(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===수상한 몬스터===")) {
			int qNum = cb.getNum(player);
			cb.mq38_1(player, qNum + 1);
		}
	}
	
	// 포보르 세력 플레이어
	public void mob150(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 950000);
	}
	
	// 마법소녀
	public void mob151(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 965000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(7);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.YELLOW + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.YELLOW + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			player.sendMessage(ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.YELLOW + "을 획득했다.");
		}
	}
	
	// 진흙 요정
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
