package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class QuestScroll {
	
	private Message msg = new Message();

	public void quest(Player player, Item itemArg) {
		World world = player.getWorld();
		QuestBoard qb = new QuestBoard();
		if(itemArg.getItemStack().getType() == Material.GLOBE_BANNER_PATTERN) {
			if(qb.getQuestName(player)==null) {
				itemArg.remove();
				q1(player, itemArg, world);
				q2(player, itemArg, world);
				q3(player, itemArg, world);
				q4(player, itemArg, world);
				q5(player, itemArg, world);
				q6(player, itemArg, world);
				q7(player, itemArg, world);
				q8(player, itemArg, world);
				q9(player, itemArg, world);
				q10(player, itemArg, world);
				q11(player, itemArg, world);
				q12(player, itemArg, world);
				q13(player, itemArg, world);
				q14(player, itemArg, world);
				q15(player, itemArg, world);
				q16(player, itemArg, world);
				q17(player, itemArg, world);
				q18(player, itemArg, world);
				eq1(player, itemArg, world);
				eq2(player, itemArg, world);
				mq1(player, itemArg, world);
				mq2(player, itemArg, world);
				mq3(player, itemArg, world);
				mq4(player, itemArg, world);
				mq5(player, itemArg, world);
				mq6(player, itemArg, world);
				mq7(player, itemArg, world);
				mq8(player, itemArg, world);
				mq9(player, itemArg, world);
				mq10(player, itemArg, world);
				mq11(player, itemArg, world);
				mq12(player, itemArg, world);
				mq13(player, itemArg, world);
				mq14(player, itemArg, world);
				mq15(player, itemArg, world);
				mq16(player, itemArg, world);
				mq17(player, itemArg, world);
				mq18(player, itemArg, world);
				mq19(player, itemArg, world);
				mq20(player, itemArg, world);
				mq21(player, itemArg, world);
				mq22(player, itemArg, world);
				mq23(player, itemArg, world);
				mq24(player, itemArg, world);
				mq25(player, itemArg, world);
				mq26(player, itemArg, world);
				mq27(player, itemArg, world);
				mq28(player, itemArg, world);
				mq29(player, itemArg, world);
				mq30(player, itemArg, world);
				mq31(player, itemArg, world);
				mq32(player, itemArg, world);
				mq33(player, itemArg, world);
				mq34(player, itemArg, world);
				mq35(player, itemArg, world);
				mq36(player, itemArg, world);
				mq37(player, itemArg, world);
				mq38(player, itemArg, world);
				mq39(player, itemArg, world);
				mq40(player, itemArg, world);
			} else {
				itemArg.remove();
				player.getInventory().addItem(itemArg.getItemStack());
				player.sendMessage(ChatColor.RED + "이미 퀘스트가 진행되고 있습니다.");
				player.sendMessage(ChatColor.RED + "기존 퀘스트를 완료하고 사용해주세요.");				
			}
		}
		
	}
	
	public void q1(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "퀘스트: 해안의 위협")) {
			msg.msg(player, "§7§e해안가 좀비§7를 소탕해 배를 지키자.");
			QuestBoard qb = new QuestBoard();
			qb.q1(player, 0);
		}	
	}
	
	public void q2(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 해적선의 보물")) {
			msg.msg(player, "§7워그닐 앞바다에 §e해적선§7이 출몰한다는 정보다 들어왔다.%§7해적들을 피해 §e보물상자§7를 찾아보자.");
			QuestBoard qb = new QuestBoard();
			qb.q2(player, 0);
		}	
	}
	
	public void q3(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "퀘스트: 포보르의 말단")) {
			msg.msg(player, "§7포보르와의 전투를 유리하게 이끌 수 있도록 실전 경험을 쌓아보자.%§7마침 이 근방에 포보르 중 가장 약한 §e크리스탈 워리어§7가 존재한다고 한다.");
			QuestBoard qb = new QuestBoard();
			qb.q3(player, 0);
		}	
	}
	
	public void q4(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 밀 사냥꾼")) {
			msg.msg(player, "§7포르간의 밀 밭을 망치는 주범을 발견했다.%§7그들을 신속히 처리하자.");
			QuestBoard qb = new QuestBoard();
			qb.q4(player, 0);
		}	
	}
	
	public void q5(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 침략자")) {
			msg.msg(player, "§7숲 속 쉼터가 습격 받았다고 한다.%§7그들을 처리해 주민들의 불안함을 없애주자.");
			QuestBoard qb = new QuestBoard();
			qb.q5(player, 0);
		}	
	}
	
	public void q6(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 숲 깊은 곳")) {
			msg.msg(player, "§7§e숲의 유적§7에서 보물을 찾아보자.");
			QuestBoard qb = new QuestBoard();
			qb.q6(player, 0);
		}	
	}

	public void q7(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 유적을 정화하는 자")) {
			msg.msg(player, "§7§e숲의 유적§7의 몬스터들이 난폭해졌다는 소문이 있다.%§7유적을 클리어해서 정화하도록 하자.");
			QuestBoard qb = new QuestBoard();
			qb.q7(player, 0);
		}	
	}
	
	public void q8(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 같아보이지만 다른")) {
			msg.msg(player, "§7§e고블린§7과 §e오크§7는 닮아보이지만%§7뿌리부터 다른 몬스터이다.%§7보통 오크가 더 강하다.");
			QuestBoard qb = new QuestBoard();
			qb.q8(player, 0);
		}	
	}
	
	public void q9(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 포보르의 위협")) {
			msg.msg(player, "§7포보르의 정찰대를 무찌르자.");
			QuestBoard qb = new QuestBoard();
			qb.q9(player, 0);
		}	
	}
	
	public void q10(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 탈환")) {
			msg.msg(player, "§7§e미푀르유 성§7을 탈환하기 위해 전투하자.");
			QuestBoard qb = new QuestBoard();
			qb.q10(player, 0);
		}	
	}
	
	public void q11(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 네크로벨리")) {
			msg.msg(player, "§7최근 §e묘지기§7들이 §e사라진 포보르의 왕§7을 부활시키려고 한다는 소문이 있다.%§7아직 그들은 포보르 왕의 시체를 찾지 못한 것으로 추정된다.%§7빠르게 그들을 처단하자.");
			QuestBoard qb = new QuestBoard();
			qb.q11(player, 0);
		}	
	}
	
	public void q12(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 데빌 인자")) {
			msg.msg(player, "§7노력없이 성장하기 위해 악을 택하는 사람들은%§7예로부터 많이 존재했다.%§7그러한 분파들은 탐욕의 결과로 대부분 소멸하였지만,%§7아직까지 남아있는 집단이 있다.%§7사람들은 그들을 §e데빌§7이라고 부르며,%§7그들을 강해지게 만드는 힘의 근원을 §e데빌 인자§7라고 부른다.%"
					+ "§7그들은 더욱 강한 힘을 얻기 위해 계속된 인간 사냥을 하고 있다.%§7그들에게 인간의 강함을 보여주도록 하자.");
			QuestBoard qb = new QuestBoard();
			qb.q12(player, 0);
		}	
	}
	
	public void q13(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 새로운 고블린")) {
			msg.msg(player, "§7푸르 평원에 도달하니 새로운 종류의 고블린들을 볼 수 있었다.%§7...%§7오크보다 강한 고블린은 처음 보는군!");
			QuestBoard qb = new QuestBoard();
			qb.q13(player, 0);
		}	
	}
	
	public void q14(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 불의 악마")) {
			msg.msg(player, "§7과거 움직이는 성에 불의 악마가 살고 있었다고 한다.%§7마법사와 계약을 해 그의 심장을 먹고 강력해진 이 악마는%§7후에 분열하여 지금의 모습을 하게 되었다.");
			QuestBoard qb = new QuestBoard();
			qb.q14(player, 0);
		}	
	}
	
	public void q15(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 방해받은 파괴수의 잠I")) {
			msg.msg(player, "§7파괴수는 예로부터 주민 마을을 파괴하는 생명체였다.%§7그들에게 플레이어의 힘을 보여주자.");
			QuestBoard qb = new QuestBoard();
			qb.q15(player, 0);
		}	
	}
	
	public void q16(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 묘지를 지키는 자")) {
			msg.msg(player, "§7묘지기 몬스터들은 묘지를 지키는 습성이 있다.%§7하지만 그들은 자신들의 무덤을 이용해 모험가들을 혼란에 빠뜨리고 있다.");
			QuestBoard qb = new QuestBoard();
			qb.q16(player, 0);
		}	
	}
	
	public void q17(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 폭탄병")) {
			msg.msg(player, "TNTZ 터진다.%퍼퍼펖퍼ㅓㅍ퍼퍼퍼퍼퍼펑%§7...이라고 써있다.");
			QuestBoard qb = new QuestBoard();
			qb.q17(player, 0);
		}	
	}
	
	public void q18(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "퀘스트: 에밀의 결의")) {
			msg.msg(player, "§7에밀은 원래 순수한 소년이었다.%§7하지만 포보르들이 나타난 이후, 에밀은 소중한 것을 지키기 위해%§7포보르와 싸워오게 되었다.%§7혼자서는 역부족이라 자기를 분할하여 다양한 형태로 자신을 수없이 늘렸다.%"
					+ "§7그러나 그 여파로 기억이 누락되거나 희미해져 누가 오리지널인지 잊게 되었다.");
			QuestBoard qb = new QuestBoard();
			qb.q18(player, 0);
		}	
	}
	
	public void eq1(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "엑스트라 퀘스트: 설원의 가희")) {
			QuestBoard qb = new QuestBoard();
			qb.eq1(player, 0);
		}	
	}
	
	public void eq2(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "엑스트라 퀘스트: 마신왕의 계약")) {
			QuestBoard qb = new QuestBoard();
			qb.eq2(player, 0);
		}	
	}
	
	public void mq1(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 1장")) {
			msg.msg(player, "§7§e워그닐§7은 §e에일 땅§7과 떨어져있는 약소 국가였기 때문에 §e포보르§7들에게 대응할 힘이 없었다.%§7마냥 당하고 있기에는 피해가 컸기 때문에 매년 포보르들을 위해 그들에게 인간 제물을 바쳐왔다.%§7제물로 바쳐진 자들은 포보르에 의해 §e타락§7하게 되었다.");
			QuestBoard qb = new QuestBoard();
			qb.mq1(player, 0);
		}	
	}
	
	public void mq2(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 2장")) {
			msg.msg(player, "§7포보르를 상대하는 법을 기르고자 고대인들은 §e신전§7을 만들었다.%§7신전 내의 몬스터들은 포보르와는 달리 영역을 넓히며 싸우진 않지만, 침입자에게는 공격적이다.");
			QuestBoard qb = new QuestBoard();
			qb.mq2(player, 0);
		}	
	}
	
	public void mq3(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 3장")) {
			msg.msg(player, "§7§e포보르들의 왕§7을 처단하는 것을 목적으로 당신의 모험은 시작될 것이다.");
			QuestBoard qb = new QuestBoard();
			qb.mq3(player, 0);
		}	
	}
	
	public void mq4(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 4장")) {
			msg.msg(player, "포르간 촌장: 숲의 황소를 잡으러 떠난 마을 청년들이 아직 돌아오지 않고 있다네.%포르간 촌장: 그 중에는 우리 아들도 있소.%포르간 촌장: 부디 그들을 찾아주게나.");
			QuestBoard qb = new QuestBoard();
			qb.mq4(player, 0);
		}	
	}
	
	public void mq5(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 5장")) {
			msg.msg(player, "포르간 촌장: 방금 아들에게서 연락이 왔네만%포르간 촌장: §e숲의 유적§f에 고립된 상황이라고 하는군.%포르간 촌장: 이번에도 힘을 빌려주길 바라네.%포르간 촌장: 내 이번 일을 해결해주면 §e아주 좋은 정보§f를 주도록 하지%포르간 촌장: 약속하겠네.");
			QuestBoard qb = new QuestBoard();
			qb.mq5(player, 0);
		}	
	}

	public void mq6(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 6장")) {
			msg.msg(player, "포르간 촌장: 그래. 내가 좋은 정보를 알려주도록 하지.%포르간 촌장: 우리 마을 동쪽에 아주 넓은 들판이 있을게야.%포르간 촌장: 거길 §e센 마그 평원§f이라고들 부르지.%포르간 촌장: 이름의 유래로 말할 것 같으면%포르간 촌장: 아니 그게 중요한게 아니지.%"
					+ "포르간 촌장: 그래도 약간만 들어주길 바라네.%포르간 촌장: 이 땅에 태초의 인간이 당도하고 나고 한 300년 쯤인가.%포르간 촌장: 새로운 민족이 나타났다네.%"
					+ "포르간 촌장: 그것이 바로 §e파르홀론§f이지.%포르간 촌장: 그들의 수장은 용감한 모험가로 두려움에 끊임없이 맞서는 운명을 가졌다고 스스로 생각했다고 하네.%포르간 촌장: 본론부터 말해달라고?%"
					+ "포르간 촌장: 허허.. 알겠네.%포르간 촌장: 그들의 수장은 §e여섯 개의 섬§f을 모험하면서 §e여섯 신§f과의 계약을 맺었어.%포르간 촌장: 그는 신의 힘을 빌려 국가를 성장시켰지.%"
					+ "포르간 촌장: 뭐 그 중에는 농경의 신도 있었으니 당연한 결과는 맞네.%포르간 촌장: 하지만 결국 파르홀론도 포보르에 의해 파멸당하고 말지.%포르간 촌장: 갑자기 그게 말이 되냐고?%"
					+ "포르간 촌장: 어쩔 수 없네. 당시 포보르의 수장은 §e키어컬 기리켄허스§f라고 불리는 인물이였는데 말이야.%포르간 촌장: 그는 신과 맞먹는 힘을 가졌다고 하는군.%"
					+ "포르간 촌장: 역대 포보르 왕 중에서 가장 지도력이 뛰어나고 강한 왕으로 알려져있네.%포르간 촌장: 어쨌든 파르홀론의 수장이 여섯 신을 만나며 얻은 §e검§f이 있네.%"
					+ "포르간 촌장: 뭐 신의 힘을 담은 검은 아니지만.. 아주 뛰어난 검일세.%포르간 촌장: 그리고 그 검이 파르홀론의 무덤인 바로 §e센 마그 평원§f 어딘가에 남아 있다더군.%"
					+ "포르간 촌장: 지금까지 왜 아무도 그 검을 찾지 않았냐고?%포르간 촌장: 허허.. 이 늙은이도 그 검을 뽑아보려 했다만..%포르간 촌장: 실패했다네.%"
					+ "포르간 촌장: 우리 마을 청년들도 모두 성년식에 그 검을 뽑으려하나 아직 성공한 자가 없어.%포르간 촌장: 마을 무속인은 우리들은 §e플레이어§f가 아니라면서%포르간 촌장: 충분히 강한 플레이어라는 존재가 오면 검을 뽑을 수 있다고 했다네."
					+ "포르간 촌장: 흠, 그게 무슨 말인질 도통 이해할 수가 없었네.%포르간 촌장: 자네에게 검을 맡겨보지.%포르간 촌장: 단, 조건이 있네만.%"
					+ "포르간 촌장: 플레이어가 무엇인지는 모르지만 충분이 강해야 뽑을 수 있다지.%포르간 촌장: 센 마그 평원에서 §e고블린§f을 잡아 자네의 강함을 증명하게나.");
			QuestBoard qb = new QuestBoard();
			qb.mq6(player, 0);
		}	
	}
	
	public void mq7(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 7장")) {
			msg.msg(player, "포르간 촌장: 좋아. §e전설의 검§f이 어디에 있는지 알려주지.%포르간 촌장: 바로..%포르간 촌장: 평원 어딘가에 §e빛의 길§f이 있다네.%포르간 촌장: 알아서 잘 찾아보게. 허허.");
			QuestBoard qb = new QuestBoard();
			qb.mq7(player, 0);
		}	
	}
	
	public void mq8(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 8장")) {
			msg.msg(player, "포르간 촌장: 허허허.. 검을 얻었지만 아직 그 힘이 제대로 발현된건 아닌 것 같구만그래.%포르간 촌장: 센 마그 평원에는 §e파르홀론에 대한 기록§f이 아직 남아있다네.%포르간 촌장: 시간이 난다면.. 한번 찾아보게나.");
			QuestBoard qb = new QuestBoard();
			qb.mq8(player, 0);
			if(player.getLevel() >= 70) {
				qb.mq8(player, 1);
			}
		}	
	}
	
	public void mq9(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 9장")) {
			msg.msg(player, "§7검을 각성시키는 법은 아직 알 수 없을 것 같다.%§7일단 좀 더 강해져보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq9(player, 0);
		}	
	}
	
	public void mq10(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 10장")) {
			msg.msg(player, "티르의 생존자: 등대에 가면 §e이 세계에 숨겨져 있는 진실§f을 알게 될 수도 있어.%티르의 생존자: 당장 등대에 가보고 싶겠지만%티르의 생존자: 아직 너를 믿을 순 없겠군.%티르의 생존자: 밖에 있는 §e외눈을 가진 포보르§f들을 처리하고 와!");
			QuestBoard qb = new QuestBoard();
			qb.mq10(player, 0);
		}	
	}
	
	public void mq11(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 11장")) {
			msg.msg(player, "티르의 생존자: 등대에 가면 §e숨겨진 공간§f이 있을거야.%티르의 생존자: 거기로 가봐.");
			QuestBoard qb = new QuestBoard();
			qb.mq11(player, 0);
		}	
	}
	
	public void mq12(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 12장")) {
			msg.msg(player, "티르의 생존자: 등대에 갔다왔어?%티르의 생존자: §e투어허 데 다넌 시대§f에 지어진 §e모두에게 희망을 빛춰주는 등대§f보단 못하지만..%"
					+ "티르의 생존자: 이 등대는 우리에게만은 희망을 빛춰주는 등대다.%티르의 생존자: §e태양의 힘§f을 낮에 충전하고, §e달의 힘§f을 밤에 충전해 이 등대는 세상을 밝게 비추어주지.%"
					+ "티르의 생존자: 당신이 등대에서 무슨 비밀을 찾았는지는 모르겠는데 달의 힘이나 태양의 힘을 찾은건 아닌 것 같군%티르의 생존자: 가서 힘을 얻어라!");
			QuestBoard qb = new QuestBoard();
			qb.mq12(player, 0);
		}	
	}
	
	public void mq13(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 13장")) {
			msg.msg(player, "티르의 생존자: 강화..알고 있지?%티르의 생존자: §e시드 광산§f에서 채광을 할 수 있을꺼야.%티르의 생존자: 포보르들에 의해 지금은 광부들이 거의 없는걸로 알긴하는데%"
					+ "티르의 생존자: 광석들은 남아있겠지 뭐.%티르의 생존자: 대신 위험할 수도 있으니 광산으로 가는 길에 있는 악독한 것들을 처리하고 가라.");
			QuestBoard qb = new QuestBoard();
			qb.mq13(player, 0);
		}	
	}
	
	public void mq14(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 14장")) {
			msg.msg(player, "§7시드 광산으로 가보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq14(player, 0);
		}	
	}
	
	public void mq15(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 15장")) {
			msg.msg(player, "광부: 그나저나 당신도 모험가지?%광부: 지금 필요한 광물이 있는데 구해줄 수 있겠나?%광부: §e포르간§f이라는 마을 주변에 §e숲§f이 있네.%광부: 그곳에 §e포보르의 흔적§f이 남아있는 장소가 있네.%광부: 다녀와주길 바라네.");
			QuestBoard qb = new QuestBoard();
			qb.mq15(player, 0);
		}	
	}
	
	public void mq16(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 16장")) {
			msg.msg(player, "광부: 뭘 하고 싶은지는 모르겠지만 이곳에 오는 모험가들은 보통 §e미푀르유 성§f으로 떠나는 듯 하더군%광부: 자네도 가보는 것이 어떻겠나?");
			QuestBoard qb = new QuestBoard();
			qb.mq16(player, 0);
		}	
	}
	
	public void mq17(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 17장")) {
			msg.msg(player, "불안한 주민: 난 성에 살던 사람인데 무서워서 도망쳐 나왔어.%불안한 주민: 날 좀 살려줘.");
			QuestBoard qb = new QuestBoard();
			qb.mq17(player, 0);
		}	
	}
	
	public void mq18(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 18장")) {
			msg.msg(player, "§7주민이 말한 §e진실§7을 알아내기 위해 §e역사가§7를 찾아보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq18(player, 0);
		}	
	}
	
	public void mq19(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 19장")) {
			msg.msg(player, "§7역사가를 찾았지만 의미가 없으니%§7역사가를 찾아다녔다던 §e모험가§7에 대해 조사해보자.%§7뼈를 남긴 것을 보아 §e묘지§7에 힌트가 있을 것 같다.");
			QuestBoard qb = new QuestBoard();
			qb.mq19(player, 0);
		}	
	}
	
	public void mq20(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 20장")) {
			msg.msg(player, "§7모험가의 흔적을 쫓아 §e시드 광산§7으로 가보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq20(player, 0);
		}	
	}
	
	public void mq21(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 21장")) {
			msg.msg(player, "§7§e티르 등대§7 근처에 수상한 자가 나타났다고 한다.%§7티르 등대를 향해 가보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq21(player, 0);
		}	
	}
	
	public void mq22(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 22장")) {
			msg.msg(player, "§7모험가가 나를 죽이지 않고 살려두었다는 것은%§7무언가 뜻이 있었던 것 같다.%§7모험가를 따라 설원 지대인 §e아란모어§7로 가보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq22(player, 0);
		}	
	}
	
	public void mq23(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 23장")) {
			msg.msg(player, "§7막상 아란모어까지 왔지만%§7§e신의 보물§7이 어디에 있는지는 알 수 없었다.%§7주변의 몬스터를 잡아가면서 보물이 있을만한 던전을 찾아보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq23(player, 0);
		}	
	}
	
	public void mq24(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 24장")) {
			msg.msg(player, "§a모험가§d>>§a" + player.getDisplayName() + " §b여어. 보고 있나.%§a모험가§d>>§a" + player.getDisplayName() + " §bmsg 커맨드를 한번 써봤다.%모험가: 뭐 이것도 내 한계를 넘은 힘이면 굳이 사용할 필요도 없는데 말이지.%"
					+ "모험가: 나는 카루 던전에 있다.%모험가: 여기서 기다리도록 하지.");
			QuestBoard qb = new QuestBoard();
			qb.mq24(player, 0);
		}	
	}
	
	public void mq25(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 25장")) {
			msg.msg(player, "얼음 장인: 거기 자네.%얼음 장인: 이곳에 온 이유는 잊지 않았겠지?%얼음 장인: 도움을 줄 테니 나에게 오시게.");
			QuestBoard qb = new QuestBoard();
			qb.mq25(player, 0);
		}	
	}
	
	public void mq26(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 26장")) {
			ItemStack rewardKey = new ItemStack(Material.PAPER);
			ItemMeta rewardKeyIm = rewardKey.getItemMeta();
			rewardKeyIm.setDisplayName(ChatColor.YELLOW + "성스러운 통행증");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "어디론가 이동할 수 있는 통행증");
			rewardLore.add(ChatColor.GRAY + "아란모어 가장 높은 곳. 마법 수정 앞에서 사용해보자.");
			rewardKeyIm.setLore(rewardLore);
			rewardKey.setItemMeta(rewardKeyIm);
			player.getInventory().addItem(rewardKey);
			msg.msg(player, "얼음 장인: 통행증이 완성되었다네.%얼음 장인: 여기까지 오는건 귀찮을 것 같아서..%얼음 장인: 퀘스트 스크롤에 넣어놨다네.%얼음 장인: 이미 인벤토리에 통행증이 있을 것이야.%얼음 장인: 통행증은 §e아란모어에서 가장 높은 곳§f.%얼음 장인: 그곳에 있는 §e마법 수정 앞§f에서 사용하면 된다네.");
			QuestBoard qb = new QuestBoard();
			qb.mq26(player, 0);
		}	
	}
	
	public void mq27(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 27장")) {
			msg.msg(player, "bl120%§7머리가 희미해진다.%§7누군가의 기억을 엿보는 듯한 기분이 든다.%tp-2223 64 -2435%데히트라: " + player.getDisplayName() + " 녀석이 더욱 성장하고 있습니다.%데히트라: 모든 것은 계획대로입니다.%의문의 남성: 그래.%"
					+ "의문의 남성: 그 녀석이 제 발로 찾아온다면, 굳이 --를 반복하지 않아도 되겠군.%데히트라: 드디어 그 분의 뜻을 이루게 되는 것입니까.%의문의 남성: 끌끌끌.. 죽어도 죽지 않는 육체를 가진 §e플레이어§f라..%의문의 남성: 아주 좋은 연구가 될 것 같구나.%"
					+ "의문의 남성: 이제 슬슬 이동해 보자고.%의문의 남성: 지금부터 --으로 간다.%데히트라: " + player.getDisplayName() + " 녀석이 오는 것을 기다리지 않는 것입니까?%의문의 남성: 지금까지 그랬던 것처럼 그 녀석은 --를 보고 우리쪽으로 오게 될거다.%"
					+ "의문의 남성: 아무것도 모르고 말이지.%tp-491 55 1312%???: 아..아아.%???: 들리십니까?%???: 저는 퀘스트의 요정 §e네비§f입니다.%네비: 아까부터 무슨 생각을 그렇게 하십니까?%네비: 크흠. 큼. 퀘스트 다시 설명드립니다!%"
					+ "네비: 이번 퀘스트는 카이만에 사시는 어느 분께서 의뢰하신 사항입니다.%네비: §e카이만 북쪽에 늪§f이 하나 있다고 하는데요. 거기에 거미들이 대량 발생했다고 합니다!%네비: 뭐.. 우리가 처리를 해도 다시 나타날 놈들이지만..%"
					+ "네비: 의뢰자분이 많은 경험치를 제시하셨으니 한번 가봐야죠?%네비: 그럼 오늘도 수고하십쇼~!");
			QuestBoard qb = new QuestBoard();
			qb.mq27(player, 0);
		}	
	}

	public void mq28(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 28장")) {
			msg.msg(player, "네비: 일단 우리의 1차적인 목표는 만렙 달성 쯤으로 해둘까요?%네비: 역시 게임은 만렙부터가 시작이죠.%네비: 그럼 앞으로는 힘든 퀘스트, 어려운 퀘스트 상관없이%네비: 경험치 빠방하게 주는 걸로 몽땅 수주해드릴께요!%"
					+ "네비: 그으럼 지금 레벨에 적당한 퀘스트가.. 이거네요!%네비: 거미들이 나오던 늪 기억하시죠?%네비: 거기서 서쪽으로 조금 가면 §e물웅덩이가 많은 또다른 늪§f이 나온다고 해요.%네비: 거기에 §e늪지의 마신왕§f이라는 §e필드보스 몬스터§f가 나오는데..%"
					+ "네비: 그러고 보니 지금까지 필드보스같은 몬스터를 본 적이 있었나요?%네비: 저는 처음보는 것 같아요.%네비: 상대가 얼마나 강한지 모르면 그만큼 대비를 하는게 좋겠죠.%네비: 어쨌든 그 녀석 1마리를 잡는 것이 퀘스트 목표네요.");
			QuestBoard qb = new QuestBoard();
			qb.mq28(player, 0);
		}	
	}
	
	public void mq29(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 29장")) {
			msg.msg(player, "네비: 이번에는 누군진 모르겠지만..%네비: 본인한테 와달라고 하시네요?%네비: 일단 가봅시다!");
			QuestBoard qb = new QuestBoard();
			qb.mq29(player, 0);
		}	
	}
	
	public void mq30(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 30장")) {
			msg.msg(player, "탑의 관리인: 이곳에서 죽은 자들의 몸은 포보르의 영혼이 차지해%탑의 관리인: §e되살아난 해골§f이 된다네..%탑의 관리인: 이 탑에 오르고 싶다면..%탑의 관리인: 그 녀석들부터 처리하고 오게.");
			QuestBoard qb = new QuestBoard();
			qb.mq30(player, 0);
		}	
	}
	
	public void mq31(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 31장")) {
			msg.msg(player, "탑의 관리인: 의뢰가 하나 있네.%탑의 관리인: 내가 있는 탑 근처에 §e하급 파괴수§f란 녀석들이 있는데 말이야.%탑의 관리인: 그 녀석들을 잡다보면 §e어떤 가루§f를 얻을 수 있네.%탑의 관리인: 구해서 가져다 주게나.");
			QuestBoard qb = new QuestBoard();
			qb.mq31(player, 0);
		}	
	}
	
	public void mq32(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 32장")) {
			msg.msg(player, "네비: 저번에 탑의 관리인이 말한 마을에 한번 가보는건 어떨까요?%네비: 제가 조사해보니 그 마을 이름은 §e베아그§f라고 하네요!");
			QuestBoard qb = new QuestBoard();
			qb.mq32(player, 0);
		}	
	}
	
	public void mq33(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 33장")) {
			msg.msg(player, "네비: 크레드라트 주변 밀밭에서 퀘스트 의뢰가 들어왔어요!%네비: 이번에는 어떤 퀘스트일까 두근두근하네요~!");
			QuestBoard qb = new QuestBoard();
			qb.mq33(player, 0);
		}	
	}

	public void mq34(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 34장")) {
			msg.msg(player, "빨간소녀: 하위!%빨간소녀: 나를 잊지 않았겠지영?%빨간모자: 또 의뢰할께 있으니 나한테 와줘여.");
			QuestBoard qb = new QuestBoard();
			qb.mq34(player, 0);
		}	
	}
	
	public void mq35(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 35장")) {
			msg.msg(player, "???: 에일을 구원할 영웅이시여.%???: 죽음의 탑을 조사한다는 소문을 들었어요.%???: 저는 §e마법탑§f의 카타리나라고 합니다.%카타리나: 우선.. 마법탑으로 와주시겠어요?");
			QuestBoard qb = new QuestBoard();
			qb.mq35(player, 0);
		}	
	}
	
	public void mq36(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 36장")) {
			msg.msg(player, "카타리나: 좋아요.%카타리나: 이제 §e포보르 왕을 가둔 미궁§f으로 들어갈 준비가 된 것 같군요.%카타리나: 마법탑에서 어느정도의 에메랄드와 포보르의 마나로 워프 스크롤을 살 수 있을 껍니다.");
			QuestBoard qb = new QuestBoard();
			qb.mq36(player, 0);
		}	
	}
	
	public void mq37(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 37장")) {
			msg.msg(player, "네비: 오랜만!%네비: 이번에도 좋은 퀘스트를 찾았지 뭐야.%네비: 마법탑에서 §e동쪽§f으로 쭉 가면 §e롱게§f라는 마을이 있는건 아니?%네비: 찾기가 좀 어려운 마을이라 잘 찾을지 모르겠넹..%"
					+ "네비: 정 모르겠으면 마법탑에서 동쪽으로 쭉 가다가 한번 죽어봐!%네비: 혹시라도 롱게에서 부활할지 누가 알아?");
			QuestBoard qb = new QuestBoard();
			qb.mq37(player, 0);
		}	
	}
	
	public void mq38(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 38장")) {
			msg.msg(player, "꼬마: 후에엥.%꼬마: 후에엥.%꼬마: 모험가님 저를 한번 더 도와주세요.");
			QuestBoard qb = new QuestBoard();
			qb.mq38(player, 0);
		}	
	}
	
	public void mq39(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 39장")) {
			msg.msg(player, "네비: 이 근처에서 나와 비슷한 힘이 느껴지는데..?%네비: 이건 무조건 가야돼.%네비: 힘의 좌표는 §e'694 67 618'§f인 것 같아.");
			QuestBoard qb = new QuestBoard();
			qb.mq39(player, 0);
		}	
	}
	
	public void mq40(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 40장")) {
			msg.msg(player, "네비: §e고성 지하§f에서 §e던전§f을 찾았어.%네비: 던전 입구에서 기다릴테니까 같이 가자.");
			QuestBoard qb = new QuestBoard();
			qb.mq40(player, 0);
		}	
	}
	
	
}
