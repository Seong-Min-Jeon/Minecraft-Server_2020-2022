package testPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MysteryChestOpen {
	
	private static String[] firstName = new String[] {"희미한", "밝은", "염려하는", "근면한", "호감가는", "공손한", "영리한", "건강한"
																, "믿을만한", "기발한", "강한", "침착한", "관대한", "태평한", "고른"
																, "즐기찬", "즐거운", "질긴", "짧은", "푸른", "흐린", "힘찬"
																, "귀여운", "느린", "노란", "높은", "딱한", "더러운", "뛰어난"
																, "뜨거운", "막다른", "매운", "무른", "미끈미끈한", "반가운", "보드라운"
																, "보람찬", "붉은", "빠른", "뿌연", "새로운", "서툰", "섣부른"
																, "성가신", "쉬운", "슬픈", "쓰린", "쓴", "아니꼬운", "아름다운"
																, "아쉬운", "아픈", "안쓰러운", "안타까운", "어린", "알맞은", "얇은"
																, "어려운", "올바른", "익은", "이른", "작은", "잘난", "잘생긴"
																, "재미있는", "적은", "젋은", "좋은", "지혜로운", "지나친", "짧은"
																, "탐스러운", "큰", "흰", "힘겨운", "희망찬", "힘찬", "흐린"};
	private static String[] secondName = new String[] {"자연의", "자작극의", "눈의", "고목의", "고려의", "마찰의", "노래의", "만년의"
																, "만력의", "만인의", "토분의", "콧날의", "크기의", "타결의", "욕망의"
																, "탄식의", "진심의", "탐색의", "코뿔소의", "처단의", "척후의", "천군의"
																, "천륜의", "천마의", "가뭄의", "너울의", "녹지의", "뇌전의", "누명의"
																, "눈치의", "눈안개의", "혁명의", "뇌절의", "다각의", "다습의", "다신의"
																, "단교의", "다단의", "다정의", "단계의", "단선의", "단언의", "담력의"
																, "담벽의", "거인의", "답주의", "당첨의", "대교의", "대결의", "대두의"
																, "대목의", "대본의", "대절의", "대중의", "대풍의", "덕행의", "독립의"
																, "독성의", "독아의", "독염의", "독점의", "독주의", "독파의", "돌격의"
																, "돌변의", "돌발의", "동률의", "동력의", "명지의", "동반의", "동진의"
																, "두골의", "두상의", "둔감의", "돌쇠의", "나노의", "숭어의", "재규어의"
																, "등질의", "마대의", "마비의", "군대의", "복귀의", "피안의", "인연의"
																, "연인의", "홍연의", "만개의", "만능의", "만석의", "말미의", "말년의"
																, "망국의", "망신의", "매력의", "맥도의", "멍추의", "연각의", "면례의"
																, "연분의", "멸퇴의", "명경의", "명목의", "명월의", "모함의", "목각의"
																, "목수의", "목탁의", "묘비의", "묘월의", "묘탑의", "무관의", "무대의"
																, "무명의", "무사의", "무성의", "무릎의", "무학의", "무협의", "무형의"
																, "문외의", "문화의", "미결의", "미아의", "묘탑의", "미적분의", "민권의"
																, "민속의", "민화의", "밀살의", "바다의", "박사의", "박피의", "반감의"
																, "반대의", "반란의", "반룡의", "발모의", "발전의", "방목의", "방사의"
																, "방역의", "방자의", "방화의", "배상의", "백두의", "백묵의", "백색의"
																, "백안의", "백일의", "백주의", "백화의", "법장의", "법전의", "법학의"
																, "변론의", "변성의", "별곡의", "병작의", "보감의", "보법의", "보석의"
																, "보약의", "보옥의", "보충의", "마법의", "보폭의", "복병의", "분투의"
																, "비호의", "빙하의", "사단의", "사상의", "사활의", "살수의", "산호의"
																, "삼수선의", "삼족오의", "삼천의", "상아의", "생명의", "생산의", "서방의"
																, "동방의", "생활의", "서리의", "서막의", "서학의", "석영의", "석조의"
																, "선발의", "소뇌의", "소화의", "수국의", "수비의", "수예의", "수천의"
																, "수행의", "시골의", "시대의", "시식의", "식물의", "신경의", "신통의"
																, "실수의", "쌍수의", "쐐기풀의", "아량의", "악기의", "악몽의", "안전의"
																, "암울의", "암흑의", "압력의", "애국의", "애환의", "야전의", "약조의"
																, "양민의", "양상의", "어뢰의", "어묵의", "엄지의", "엄폐의", "여론의"
																, "여백의", "역모의", "역사의", "연무의", "염마의", "영하의", "오락의"
																, "오염의", "용병의", "용암의", "용서의", "운하의", "원년의", "원자의"
																, "원초의", "위령의", "위용의", "유리의", "의역의", "인격의", "인도의"
																, "인위의", "일년의", "자기의", "자멸의", "자술의", "자전의", "작살의"
																, "잔영의", "잠수의", "재정의", "재학의", "저열의", "적대의", "전광의"
																, "전기의", "전략의", "전류의", "전속의", "전자의", "전통의", "정형의"
																, "제국의", "죽창의", "중장의", "지리의", "진기의", "집착의", "참전의"
																, "처형의", "천기의", "천궁의", "철마의", "철야의", "첩자의", "초년의"
																, "초인의", "최단의", "최대의", "추리의", "치석의", "토룡의", "특허의"
																, "판윤의", "편도의", "평균의", "평지의", "폐허의", "포구의", "피골의"
																, "필살의", "하늘의", "하사의", "학번의", "학사의", "한국의", "행운의"
																, "혈족의", "최단의", "최대의", "추리의", "치석의", "토룡의", "특허의"
																, "초인의", "황무지의", "후퇴의", "흑막의", "흡수의", "희극의", "흰눈의"};
	private static String[] MythicFirstName = new String[] {"날선", "진귀한", "강렬한", "기묘한", "각성한", "불가사의한", "창조한", "기괴한"
																, "특별한", "광활한", "존귀한", "고결한", "관대한", "비범한", "고귀한"
																, "난폭한", "격렬한", "용감한", "무모한", "위험한", "정교한", "냉혹한"
																, "근사한", "완고한", "화려한", "견고한", "위대한", "완벽한", "해박한"};
	private static String[] MythicSecondName = new String[] {"태고의", "태왕의", "황제의", "태양의", "달의", "멸도의", "귀멸의", "멸절의"
																, "최강의", "전퇴의", "짐승의", "명계의", "무한의", "무패의", "백야의"
																, "흑야의", "삼신의", "여신의", "옥새의", "와룡의", "자유의", "태자의"
																, "초월의", "극한의", "오라의", "세계의", "진격의", "차력의", "시조의"};
	private int taskID;
	Random rnd = new Random();
	
	public void make(Player player, Inventory inv) {
		try {
			taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

				int time = 0;
				ThreadMysteryChest td = new ThreadMysteryChest(player.getUniqueId());

				@Override
				public void run() {
					if (!td.hasID()) {
						td.setID(taskID);
					}

					if (time == 0) {
						for(ItemStack item : inv.getContents()) {
							if (item == null) {
								continue;
							}
							if(item.getType() == Material.PLAYER_HEAD) {
								if(item.getAmount() == 1) {
									if(item.getItemMeta().getDisplayName().substring(2).equals("의문의 상자")) {
										item.setType(Material.HEART_OF_THE_SEA);
									}
								}
							}
						}
					}

					if (time >= 60) {
						int idx = 0;
						for(ItemStack item : inv.getContents()) {
							if (item == null) {
								idx++;
								continue;
							}
							if(item.getType() == Material.HEART_OF_THE_SEA) {
								if(item.getAmount() == 1) {
									ItemStack newItem = setAll(item, player);
									inv.setItem(idx, newItem);
								}
							}
							idx++;
						}
						td.endTask();
						td.removeID();
						return;
					}

					time++;
				}

			}, 0, 1);
		} catch(Exception e) {
			
		}
			
	}
	
	public ItemStack setAll(ItemStack item, Player player) {
		ItemMeta im = item.getItemMeta();
		String name = im.getDisplayName();
		double mul = 1;
		String grade = name.substring(0, 2);
		if(grade.equals("§e")) {
			mul = 0.7;
		} else if(grade.equals("§d")) {
			mul = 1;
		} else if(grade.equals("§b")) {
			mul = 1.2;
		} else if(grade.equals("§4")) {
			mul = 1.5;
		} else if(grade.equals("§5")) {
			mul = 3;
		}
		
		String range = im.getLore().get(0);
		String[] ary = range.substring(11).split("-");
		int minLvl = Integer.parseInt(ary[0]);
		int maxLvl = Integer.parseInt(ary[1]);
		
		int lvl = rnd.nextInt(11) + minLvl; 
		if(lvl > maxLvl) {
			lvl = maxLvl;
		}
		int total = (int) (Math.exp(Math.pow((double)lvl, 0.35)) * mul);
		
		int[] stat = {0,0,0,0,0,0,0,0,0,0,0};
		
		int statNum = rnd.nextInt(10);
		
		if(statNum == 0) {
			int tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[3] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
		} else if(statNum == 1) {
			int tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[3] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
		} else if(statNum == 2) {
			int tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[3] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
		} else if(statNum == 3) {
			int tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[3] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
		} else if(statNum == 4) {
			int tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
		} else if(statNum == 5) {
			int tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
		} else if(statNum == 6) {
			int tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[3] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
		} else if(statNum == 7) {
			int tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[3] = tmp;
			total -= tmp;
		} else if(statNum == 8) {
			int tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[3] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
		} else if(statNum == 9) {
			int tmp = rnd.nextInt(total);
			stat[3] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[6] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[5] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[0] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[1] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[2] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[4] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[7] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[8] = tmp;
			total -= tmp;
			tmp = rnd.nextInt(total);
			stat[9] = tmp;
			total -= tmp;
		}
		
		stat[10] = lvl;
		
		if(stat[0] > 1000000) {
			stat[0] = 1000000;
		}
		if(stat[1] > 1000000) {
			stat[1] = 1000000;
		}
		if(stat[2] > 1000000) {
			stat[2] = 1000000;
		}
		if(stat[3] > 1000000) {
			stat[3] = 1000000;
		}
		if(stat[4] > 1000000) {
			stat[4] = 1000000;
		}
		if(stat[5] > 30000) {
			stat[5] = 30000;
		}
		if(stat[6] > 30000) {
			stat[6] = 30000;
		}
		if(stat[7] > 30000) {
			stat[7] = 30000;
		}
		if(stat[8] > 30000) {
			stat[8] = 30000;
		}
		if(stat[9] > 1000000) {
			stat[9] = 1000000;
		}
		if(stat[10] > 1000) {
			stat[10] = 1000;
		}
		
		String localName = Integer.toString(stat[0]) + "," + stat[1] + "," + stat[2] + "," + stat[3] + "," + stat[4] + "," + stat[5] + "," + stat[6] + "," + stat[7] + "," + stat[8] + "," + stat[9] + "," + stat[10];

		int equipType = rnd.nextInt(6);
		
		if(equipType == 0) {
			System.out.println(player.getDisplayName() + "이/가" + grade + " 헬멧" + "(" + localName + ")" + ChatColor.WHITE + "을/를 획득하였다.(상자)");
		} else if(equipType == 1) {
			System.out.println(player.getDisplayName() + "이/가" + grade + " 갑옷" + "(" + localName + ")" + ChatColor.WHITE + "을/를 획득하였다.(상자)");
		} else if(equipType == 2) {
			System.out.println(player.getDisplayName() + "이/가" + grade + " 각반" + "(" + localName + ")" + ChatColor.WHITE + "을/를 획득하였다.(상자)");
		} else if(equipType == 3) {
			System.out.println(player.getDisplayName() + "이/가" + grade + " 신발" + "(" + localName + ")" + ChatColor.WHITE + "을/를 획득하였다.(상자)");
		} else {
			System.out.println(player.getDisplayName() + "이/가" + grade + " 무기" + "(" + localName + ")" + ChatColor.WHITE + "을/를 획득하였다.(상자)");
		}
		
		ItemStack result = makeItem(player, equipType, lvl, localName, grade);
		return result;
	}
	
	public ItemStack makeItem(Player player, int equipType, int lvl, String localName, String grade) {
		String name = name(grade);
		if(equipType == 0 && lvl <= 100) {
			ItemStack equip = new ItemStack(Material.LEATHER_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 헬멧");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && lvl <= 200) {
			ItemStack equip = new ItemStack(Material.CHAINMAIL_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 헬멧");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && lvl <= 400) {
			ItemStack equip = new ItemStack(Material.IRON_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 헬멧");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && lvl <= 700) {
			ItemStack equip = new ItemStack(Material.GOLDEN_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 헬멧");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && lvl <= 900) {
			ItemStack equip = new ItemStack(Material.DIAMOND_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 헬멧");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && lvl <= 1000) {
			ItemStack equip = new ItemStack(Material.NETHERITE_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 헬멧");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && lvl <= 100) {
			ItemStack equip = new ItemStack(Material.LEATHER_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 갑옷");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && lvl <= 200) {
			ItemStack equip = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 갑옷");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && lvl <= 400) {
			ItemStack equip = new ItemStack(Material.IRON_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 갑옷");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && lvl <= 700) {
			ItemStack equip = new ItemStack(Material.GOLDEN_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 갑옷");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && lvl <= 900) {
			ItemStack equip = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 갑옷");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && lvl <= 1000) {
			ItemStack equip = new ItemStack(Material.NETHERITE_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 갑옷");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && lvl <= 100) {
			ItemStack equip = new ItemStack(Material.LEATHER_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 각반");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && lvl <= 200) {
			ItemStack equip = new ItemStack(Material.CHAINMAIL_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 각반");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && lvl <= 400) {
			ItemStack equip = new ItemStack(Material.IRON_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 각반");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && lvl <= 700) {
			ItemStack equip = new ItemStack(Material.GOLDEN_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 각반");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && lvl <= 900) {
			ItemStack equip = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 각반");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && lvl <= 1000) {
			ItemStack equip = new ItemStack(Material.NETHERITE_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 각반");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && lvl <= 100) {
			ItemStack equip = new ItemStack(Material.LEATHER_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 신발");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && lvl <= 200) {
			ItemStack equip = new ItemStack(Material.CHAINMAIL_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 신발");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && lvl <= 400) {
			ItemStack equip = new ItemStack(Material.IRON_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 신발");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && lvl <= 700) {
			ItemStack equip = new ItemStack(Material.GOLDEN_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 신발");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && lvl <= 900) {
			ItemStack equip = new ItemStack(Material.DIAMOND_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 신발");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && lvl <= 1000) {
			ItemStack equip = new ItemStack(Material.NETHERITE_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(grade + name + " 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 신발");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else {
			Random rnd = new Random();
			int weaponType = rnd.nextInt(51);
			
			if(weaponType == 0) {
				ItemStack equip = new ItemStack(Material.OAK_LEAVES);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 1) {
				ItemStack equip = new ItemStack(Material.SPRUCE_LEAVES);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 2) {
				ItemStack equip = new ItemStack(Material.BIRCH_LEAVES);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 3) {
				ItemStack equip = new ItemStack(Material.JUNGLE_LEAVES);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 4) {
				ItemStack equip = new ItemStack(Material.ACACIA_LEAVES);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 5) {
				ItemStack equip = new ItemStack(Material.DARK_OAK_LEAVES);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 6) {
				ItemStack equip = new ItemStack(Material.STONE_STAIRS);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 7) {
				ItemStack equip = new ItemStack(Material.COBBLESTONE_WALL);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 8) {
				ItemStack equip = new ItemStack(Material.BROWN_CARPET);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 9) {
				ItemStack equip = new ItemStack(Material.GREEN_CARPET);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 도끼");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 10) {
				ItemStack equip = new ItemStack(Material.BLACK_CARPET);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 도끼");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 11) {
				ItemStack equip = new ItemStack(Material.STONE);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 12) {
				ItemStack equip = new ItemStack(Material.BIRCH_PLANKS);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 13) {
				ItemStack equip = new ItemStack(Material.JUNGLE_PLANKS);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 14) {
				ItemStack equip = new ItemStack(Material.ACACIA_PLANKS);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 15) {
				ItemStack equip = new ItemStack(Material.DARK_OAK_PLANKS);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 16) {
				ItemStack equip = new ItemStack(Material.BEDROCK);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 17) {
				ItemStack equip = new ItemStack(Material.SPRUCE_LOG);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 18) {
				ItemStack equip = new ItemStack(Material.BIRCH_LOG);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 19) {
				ItemStack equip = new ItemStack(Material.JUNGLE_LOG);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 20) {
				ItemStack equip = new ItemStack(Material.ACACIA_LOG);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 21) {
				ItemStack equip = new ItemStack(Material.DARK_OAK_LOG);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 22) {
				ItemStack equip = new ItemStack(Material.SANDSTONE);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 망치");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 23) {
				ItemStack equip = new ItemStack(Material.CHISELED_SANDSTONE);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 24) {
				ItemStack equip = new ItemStack(Material.CUT_SANDSTONE);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 25) {
				ItemStack equip = new ItemStack(Material.LAPIS_BLOCK);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 26) {
				ItemStack equip = new ItemStack(Material.MAGENTA_WOOL);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 도끼");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 27) {
				ItemStack equip = new ItemStack(Material.LIME_WOOL);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 도끼");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 28) {
				ItemStack equip = new ItemStack(Material.GRAY_WOOL);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 29) {
				ItemStack equip = new ItemStack(Material.LIGHT_GRAY_WOOL);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 30) {
				ItemStack equip = new ItemStack(Material.CYAN_WOOL);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 31) {
				ItemStack equip = new ItemStack(Material.PURPLE_WOOL);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 검");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 32) {
				ItemStack equip = new ItemStack(Material.OAK_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 창");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 33) {
				ItemStack equip = new ItemStack(Material.SPRUCE_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 창");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 34) {
				ItemStack equip = new ItemStack(Material.BIRCH_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 창");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 35) {
				ItemStack equip = new ItemStack(Material.JUNGLE_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 창");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 36) {
				ItemStack equip = new ItemStack(Material.ACACIA_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 창");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 37) {
				ItemStack equip = new ItemStack(Material.DARK_OAK_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 창");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 38) {
				ItemStack equip = new ItemStack(Material.STONE_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 39) {
				ItemStack equip = new ItemStack(Material.COBBLESTONE_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 40) {
				ItemStack equip = new ItemStack(Material.STONE_BRICK_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 41) {
				ItemStack equip = new ItemStack(Material.NETHER_BRICK_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 42) {
				ItemStack equip = new ItemStack(Material.QUARTZ_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 43) {
				ItemStack equip = new ItemStack(Material.RED_SANDSTONE);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 44) {
				ItemStack equip = new ItemStack(Material.RED_SANDSTONE_SLAB);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 45) {
				ItemStack equip = new ItemStack(Material.SMOOTH_RED_SANDSTONE);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 46) {
				ItemStack equip = new ItemStack(Material.OBSIDIAN);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 47) {
				ItemStack equip = new ItemStack(Material.SMOOTH_SANDSTONE);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 48) {
				ItemStack equip = new ItemStack(Material.CHISELED_RED_SANDSTONE);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 49) {
				ItemStack equip = new ItemStack(Material.CUT_RED_SANDSTONE);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			} else if(weaponType == 50) {
				ItemStack equip = new ItemStack(Material.RED_SANDSTONE_STAIRS);
				ItemMeta equipIm = equip.getItemMeta();
				equipIm.setLocalizedName(localName);
				equipIm.setDisplayName(grade + name + " 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + lvl);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + player.getDisplayName() + "가 발견한 무기");
				equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				equipIm.setUnbreakable(true);
				equipIm.setLore(equipLore);
				equip.setItemMeta(equipIm);
				return equip;
			}
		}
		return null;
	}
	
	public String name(String grade) {
		
		String first = "잘못된";
		String second = "버그의";
		
		if(grade.equals("§5")) {
			first = getRandom(MythicFirstName);
			second = getRandom(MythicSecondName);			
		} else {
			first = getRandom(firstName);
			second = getRandom(secondName);
		}
		
		return first + " " + second;
	}
	
	public static String getRandom(String[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
}
