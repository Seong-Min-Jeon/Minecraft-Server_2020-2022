package testPack;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

public class CraftingPotion {
	
	public void make(Player player, Inventory inv) {
		try {
			int[] ary = {1,2,3,10,11,12,19,20,21};
			
			String[] type = new String[10];
			int[] amount = new int[10];
			String[] name = new String[10];
			int red = 0;
			int green = 0;
			int blue = 0;
			
			int blessednessPotion = 0;
			
			int idx = 0;
			
			for(int i : ary) {
				ItemStack item = inv.getItem(i);
				try {type[idx] = item.getType().toString();} catch(Exception e) {}
				try {amount[idx] = item.getAmount();} catch(Exception e) {}
				try {name[idx] = item.getItemMeta().getDisplayName();} catch(Exception e) {name[idx] = null;}
				try { 
					if(item.getType() == Material.POTION) {
						try {
							PotionMeta p = (PotionMeta) item.getItemMeta();
							red += p.getColor().getRed();
							green += p.getColor().getGreen();
							blue += p.getColor().getBlue();
						} catch(Exception e) {
							red += 255;
							green += 50;
							blue += 50;
						}
					} else {
						red -= 30;
						green -= 30;
						blue -= 30;
					}
				} catch(Exception e) {
					
				}
				idx++;
			}
			
			removeItem(inv);
			
			int totalStat = 0;
			int var = 9;
			
			for(int i = 0 ; i < 9 ; i++) {
				if(type[i] == null) {
					var -= 1;
					continue;
				}
				if(type[i].equalsIgnoreCase("POTION")) {
					totalStat += amount[i] * 20; 
				}
			}
			
			for(int i = 0 ; i < 9 ; i++) {
				if(name[i] == null) {
					continue;
				}
				if(name[i].substring(0, 2).equals("§3")) {
					totalStat -= 1000;
				}
				//제작 전용 아이템
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 피")) {
					totalStat += amount[i] * 30; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 쓸개")) {
					totalStat += amount[i] * 40; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 살점")) {
					totalStat += amount[i] * 50; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 간")) {
					totalStat += amount[i] * 60; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 심장")) {
					totalStat += amount[i] * 80;
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 피")) {
					totalStat += amount[i] * 70; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 쓸개")) {
					totalStat += amount[i] * 80; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 살점")) {
					totalStat += amount[i] * 90; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 간")) {
					totalStat += amount[i] * 100; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 심장")) {
					totalStat += amount[i] * 120;
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 뿔")) {
					totalStat += amount[i] * 150;
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 피")) {
					totalStat += amount[i] * 110; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 쓸개")) {
					totalStat += amount[i] * 120; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 살점")) {
					totalStat += amount[i] * 130; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 간")) {
					totalStat += amount[i] * 140; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 심장")) {
					totalStat += amount[i] * 160;
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 뿔")) {
					totalStat += amount[i] * 190;
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 피")) {
					totalStat += amount[i] * 150; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 쓸개")) {
					totalStat += amount[i] * 160; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 살점")) {
					totalStat += amount[i] * 170; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 간")) {
					totalStat += amount[i] * 180; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 심장")) {
					totalStat += amount[i] * 200;
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔")) {
					totalStat += amount[i] * 230;
				}
				//축복의 포션 제작
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "성수")) {
					if(blessednessPotion == 0) {
						blessednessPotion = 1;
					} else if(blessednessPotion == 10) {
						blessednessPotion = 11;
					}
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "달콤한 열매")) {
					if(blessednessPotion == 0) {
						blessednessPotion = 10;
					} else if(blessednessPotion == 1) {
						blessednessPotion = 11;
					}
				}
			}
			
			Random rnd = new Random();
			
			double mul = (700 + rnd.nextInt(500)) / 500.0;
			
			int resultStat = (int)((totalStat / Math.pow(var, 0.5)) * mul);
			
			/* 
			 * 위까지 아이템 특성별로 스텟의 한계치를 정하는 코드
			 * 
			 * 아래부터 그 수치를 이용한 코드
			 * */
			
			//==================================================================특수 제작
			if(blessednessPotion == 11) {
				ItemStack potion = new ItemStack(Material.POTION);
				ItemMeta potionIm = potion.getItemMeta();
				potionIm.setDisplayName(ChatColor.LIGHT_PURPLE + "축복의 포션");
				ArrayList<String> potionLore = new ArrayList();
				potionLore.add(ChatColor.GRAY + "주민들의 축복을 담은 포션");
				potionLore.add(ChatColor.GRAY + "사막의 더위를 버틸 수 있게 해준다.");
				potionIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				potionIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				potionIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				potionIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
				potionIm.setUnbreakable(true);
				potionIm.setLore(potionLore);
				PotionMeta pm = (PotionMeta) potionIm;
				pm.setColor(Color.fromRGB(255, 255, 255));
				potionIm = pm;
				potion.setItemMeta(potionIm);
				inv.setItem(15, potion);
				player.sendMessage("제작 성공!");
				
				try {
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===축복의 포션3===")) {
						int qNum = cb.getNum(player);
						cb.mq45_4(player, qNum + 1);
					}
				} catch(Exception e) {
					
				}
				return;
			}
			
			//==================================================================일반 제작
			if(resultStat <= 0) {
				player.sendMessage("제작 결과 아무것도 얻지 못했습니다.");
				return;
			}
			
			//대성공
			int doubleUpChance = rnd.nextInt(10);
			
			if(doubleUpChance == 0) {
				player.sendMessage("제작 대성공!");
			} else {
				player.sendMessage("제작 성공!");
				resultStat /= 2;
			}
			
			//성공 시 절반이 되는 것에 의해 0이하가 되는 오류가 발생시 교정
			if(resultStat <= 0) {
				resultStat = 1;
			}
			
			//생활 레벨 보너스
			ItemStack item = player.getInventory().getItem(7);
			ItemMeta im = item.getItemMeta();
			double lvl = Double.parseDouble(im.getLore().get(1).split(": ")[1]);
			resultStat = resultStat + (int)(resultStat*lvl/50);
			
			//생활 레벨 상승
			double exp = ((int)(Math.pow((Math.log(resultStat)),3)) / 100.0) / lvl;
			ArrayList<String> lore = (ArrayList<String>) im.getLore(); 
			double newLevel = Double.parseDouble(String.format("%.2f", lvl+exp));
			if(newLevel >= 200.0) {
				lore.set(1, ChatColor.GRAY + "포션 제작 레벨: " + "200.0");
			} else {
				lore.set(1, ChatColor.GRAY + "포션 제작 레벨: " + newLevel);
			}
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().setItem(7, item);

			// 포션 색, 성능 결정
			// 회복, 흡수, 힘, 속도 증가, 점프 증가, 저항, 속도 감소, 독, 위더, 멀미, 기간
			int[] stat = {0,0,0,0,0,0,0,0,0,0,0};
			String[] buff = {"즉시 회복: ","추가 체력: ","힘: ","속도 증가: ","점프 증가: ","저항: ","속도 감소: ","독: ","위더: ","멀미: "};
			
			stat[10] = (int)(Math.pow((Math.log(resultStat)),3));
			
			if(stat[10] > 6000) {
				stat[10] = 6000;
			}
			
			red /= var;
			green /= var;
			blue /= var;
			
			if(red > 255) {
				red = 255;
			} else if(red < 0) {
				red = 0;
			}
			
			if(green > 255) {
				green = 255;
			} else if(green < 0) {
				green = 0;
			}
			
			if(blue > 255) {
				blue = 255;
			} else if(blue < 0) {
				blue = 0;
			}
			
			if(red >= green) {
				if(red >= blue) {
					if(red > 200) {
						int tmp = rnd.nextInt(resultStat);
						stat[0] = tmp;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 500;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 1000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
					} else if(red > 100) {
						int tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 1000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
					} else if(red > 50) {
						int tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 4;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 1000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
					} else {
						int tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 4;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 1000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
					}
				} else {
					if(blue > 200) {
						int tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 1000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
					} else if(blue > 100) {
						int tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 1000;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 1000;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 4;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 1000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
					} else if(blue > 50) {
						int tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 1500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 1500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 5;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 1000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
					} else {
						int tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 1000;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 1000;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 4;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 1000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
					}
				}
			} else {
				if(green >= blue) {
					if(green > 200) {
						int tmp = rnd.nextInt(resultStat);
						stat[0] = tmp;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 1000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 500;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
					} else if(green > 100) {
						int tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 2000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
					} else if(green > 50) {
						int tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 4;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 3000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
					} else {
						int tmp = rnd.nextInt(resultStat);
						stat[6] = tmp / 300;
						if(stat[6] > 5) {
							stat[6] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[7] = tmp / 500;
						if(stat[7] > 50) {
							stat[7] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[8] = tmp / 500;
						if(stat[8] > 50) {
							stat[8] = 50;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[9] = tmp / 700;
						if(stat[9] > 1) {
							stat[9] = 1;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[0] = tmp / 4;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[5] = tmp / 3000;
						if(stat[5] > 4) {
							stat[5] = 4;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[1] = tmp / 1000;
						if(stat[1] > 5) {
							stat[1] = 5;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[2] = tmp / 2;
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[4] = tmp / 500;
						if(stat[4] > 3) {
							stat[4] = 3;
						}
						resultStat -= tmp;
						tmp = rnd.nextInt(resultStat);
						stat[3] = tmp / 500;
						if(stat[3] > 5) {
							stat[3] = 5;
						}
						resultStat -= tmp;
					}
				}
			}
			
			for(int i = 0 ; i < 10 ; i++) {
				stat[i]--;
			}
			
			String localName = Integer.toString(stat[0]) + "," + stat[1] + "," + stat[2] + "," + stat[3] + "," + stat[4] + "," + stat[5] + "," + stat[6] + "," + stat[7] + "," + stat[8] + "," + stat[9] + "," + stat[10];
			
			int limit = (int) (Math.pow(stat[10]/20, 2) / 10);
			if(limit > 1000) {
				limit = 1000;
			}
			
			ItemStack potion = new ItemStack(Material.POTION, 3);
			ItemMeta potionIm = potion.getItemMeta();
			potionIm.setLocalizedName(localName);
			potionIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 포션");
			ArrayList<String> potionLore = new ArrayList();
			potionLore.add(ChatColor.GRAY + "레벨 제한: " + limit);
			potionLore.add(ChatColor.GRAY + " ");
			potionLore.add(ChatColor.GRAY + "지속 시간: " + stat[10]/20 + "초");
			potionLore.add(ChatColor.GRAY + " ");
			potionLore.add(ChatColor.GRAY + "제작자: " + player.getDisplayName());
			potionLore.add(ChatColor.GRAY + " ");
			for(int i = 0 ; i < 10 ; i++) {
				if(stat[i] < 0) {
					continue;
				}
				potionLore.add(ChatColor.GRAY + buff[i] + (stat[i] + 1));
			}
			potionIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			potionIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			potionIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			potionIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			potionIm.setUnbreakable(true);
			potionIm.setLore(potionLore);
			PotionMeta pm = (PotionMeta) potionIm;
			pm.setColor(Color.fromRGB(red, green, blue));
			potionIm = pm;
			potion.setItemMeta(potionIm);
			
			if(inv.getItem(15) != null) {
				player.getInventory().addItem(inv.getItem(15));
			}
			
			inv.setItem(15, potion);
			
		} catch(Exception e) {
			player.sendMessage("제작 결과 아무것도 얻지 못했습니다.");
		}
	}
	
	public void removeItem(Inventory inv) {
		inv.remove(inv.getItem(1));
		inv.remove(inv.getItem(2));
		inv.remove(inv.getItem(3));
		inv.remove(inv.getItem(10));
		inv.remove(inv.getItem(11));
		inv.remove(inv.getItem(12));
		inv.remove(inv.getItem(19));
		inv.remove(inv.getItem(20));
		inv.remove(inv.getItem(21));
	}
	
}
