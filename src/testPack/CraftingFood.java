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

public class CraftingFood {
	
	public void make(Player player, Inventory inv) {
		try {
			int[] ary = {1,2,3,10,11,12,19,20,21};
			
			String[] type = new String[10];
			int[] amount = new int[10];
			String[] name = new String[10];
			int meat = 0;
			int fish = 0;
			int salad = 0;
			int potion = 0;
			int trash = 0;
			
			int idx = 0;
			
			for(int i : ary) {
				ItemStack item = inv.getItem(i);
				try {type[idx] = item.getType().toString();} catch(Exception e) {}
				try {amount[idx] = item.getAmount();} catch(Exception e) {}
				try {name[idx] = item.getItemMeta().getDisplayName();} catch(Exception e) {name[idx] = null;}
				try { 
					if(item.getType() == Material.PORKCHOP) {
						meat++;
					} else if(item.getType() == Material.COOKED_PORKCHOP) {
						meat++;
					} else if(item.getType() == Material.BEEF) {
						meat++;
					} else if(item.getType() == Material.COOKED_BEEF) {
						meat++;
					} else if(item.getType() == Material.CHICKEN) {
						meat++;
					} else if(item.getType() == Material.COOKED_CHICKEN) {
						meat++;
					} else if(item.getType() == Material.MUTTON) {
						meat++;
					} else if(item.getType() == Material.COOKED_MUTTON) {
						meat++;
					} else if(item.getType() == Material.RABBIT) {
						meat++;
					} else if(item.getType() == Material.COOKED_RABBIT) {
						meat++;
					} else if(item.getType() == Material.COD) {
						fish++;
					} else if(item.getType() == Material.COOKED_COD) {
						fish++;
					} else if(item.getType() == Material.SALMON) {
						fish++;
					} else if(item.getType() == Material.COOKED_SALMON) {
						fish++;
					} else if(item.getType() == Material.TROPICAL_FISH) {
						fish++;
					} else if(item.getType() == Material.PUFFERFISH) {
						fish++;
					} else if(item.getType() == Material.DRIED_KELP) {
						fish++;
						salad++;
					} else if(item.getType() == Material.POTATO) {
						salad++;
					} else if(item.getType() == Material.BAKED_POTATO) {
						salad++;
					} else if(item.getType() == Material.POISONOUS_POTATO) {
						salad++;
					} else if(item.getType() == Material.CARROT) {
						salad++;
					} else if(item.getType() == Material.BEETROOT) {
						salad++;
					} else if(item.getType() == Material.MELON_SLICE) {
						salad++;
					} else if(item.getType() == Material.APPLE) {
						salad++;
					} else if(item.getType() == Material.SWEET_BERRIES) {
						salad++;
					} else if(item.getType() == Material.BREAD) {
						potion++;
					} else if(item.getType() == Material.PUMPKIN_PIE) {
						potion++;
					} else if(item.getType() == Material.COOKIE) {
						potion++;
					} else if(item.getType() == Material.GOLDEN_APPLE) {
						salad++;
					} else if(item.getType() == Material.GOLDEN_CARROT) {
						salad++;
					} else if(item.getType() == Material.WHEAT) {
						salad++;
					} else if(item.getType() == Material.MUSHROOM_STEW) {
						meat++;
					} else if(item.getType() == Material.RABBIT_STEW) {
						fish++;
					} else if(item.getType() == Material.BEETROOT_SOUP) {
						salad++;
					} else if(item.getType() == Material.SUSPICIOUS_STEW) {
						trash++;
					} else if(item.getType() == Material.POTION) {
						potion++;
					} else {
						trash++;
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
				if(type[i].equalsIgnoreCase("PORKCHOP")) {
					totalStat += amount[i] * 1; 
				} else if(type[i].equalsIgnoreCase("COOKED_PORKCHOP")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("BEEF")) {
					totalStat += amount[i] * 1; 
				} else if(type[i].equalsIgnoreCase("COOKED_BEEF")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("CHICKEN")) {
					totalStat += amount[i] * 1; 
				} else if(type[i].equalsIgnoreCase("COOKED_CHICKEN")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("MUTTON")) {
					totalStat += amount[i] * 1; 
				} else if(type[i].equalsIgnoreCase("COOKED_MUTTON")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("RABBIT")) {
					totalStat += amount[i] * 1; 
				} else if(type[i].equalsIgnoreCase("COOKED_RABBIT")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("COD")) {
					totalStat += amount[i] * 1; 
				} else if(type[i].equalsIgnoreCase("COOKED_COD")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("SALMON")) {
					totalStat += amount[i] * 1; 
				} else if(type[i].equalsIgnoreCase("COOKED_SALMON")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("TROPICAL_FISH")) {
					totalStat += amount[i] * 1; 
				} else if(type[i].equalsIgnoreCase("PUFFERFISH")) {
					totalStat += amount[i] * 1; 
				} else if(type[i].equalsIgnoreCase("DRIED_KELP")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("POTATO")) {
					totalStat += amount[i] * 3; 
				} else if(type[i].equalsIgnoreCase("BAKED_POTATO")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("POISONOUS_POTATO")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("CARROT")) {
					totalStat += amount[i] * 3; 
				} else if(type[i].equalsIgnoreCase("BEETROOT")) {
					totalStat += amount[i] * 3; 
				} else if(type[i].equalsIgnoreCase("MELON_SLICE")) {
					totalStat += amount[i] * 3; 
				} else if(type[i].equalsIgnoreCase("APPLE")) {
					totalStat += amount[i] * 3; 
				} else if(type[i].equalsIgnoreCase("SWEET_BERRIES")) {
					totalStat += amount[i] * 3; 
				} else if(type[i].equalsIgnoreCase("BREAD")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("PUMPKIN_PIE")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("COOKIE")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("GOLDEN_APPLE")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("GOLDEN_CARROT")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("WHEAT")) {
					totalStat += amount[i] * 3; 
				} else if(type[i].equalsIgnoreCase("MUSHROOM_STEW")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("RABBIT_STEW")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("BEETROOT_SOUP")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("SUSPICIOUS_STEW")) {
					totalStat += amount[i] * 5; 
				} else if(type[i].equalsIgnoreCase("POTION")) {
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
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 피")) {
					totalStat += amount[i] * 190; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 쓸개")) {
					totalStat += amount[i] * 200; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 살점")) {
					totalStat += amount[i] * 210; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 간")) {
					totalStat += amount[i] * 220; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 심장")) {
					totalStat += amount[i] * 240;
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 뿔")) {
					totalStat += amount[i] * 270;
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "미숙하게 채집된 돼지고기")) {
					totalStat += amount[i] * 10;
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "적당한 크기의 돼지고기")) {
					totalStat += amount[i] * 20;
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "맛있어 보이는 돼지고기")) {
					totalStat += amount[i] * 40;
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "좋은 육질의 돼지고기")) {
					totalStat += amount[i] * 70;
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "신선도가 뛰어난 돼지고기")) {
					totalStat += amount[i] * 110;
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신이 탐하는 돼지고기")) {
					totalStat += amount[i] * 160;
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "캐넌 등급의 소고기")) {
					totalStat += amount[i] * 10;
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "유틸리티 등급의 소고기")) {
					totalStat += amount[i] * 20;
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "스텐다드 등급의 소고기")) {
					totalStat += amount[i] * 40;
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "셀렉트 등급의 소고기")) {
					totalStat += amount[i] * 70;
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "프라임 등급의 소고기")) {
					totalStat += amount[i] * 110;
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신이 즐겨먹는 소고기")) {
					totalStat += amount[i] * 160;
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "2등급 닭고기")) {
					totalStat += amount[i] * 10;
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "1등급 닭고기")) {
					totalStat += amount[i] * 20;
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "1+등급 닭고기")) {
					totalStat += amount[i] * 40;
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "닭의 품질을 넘어선 닭고기")) {
					totalStat += amount[i] * 70;
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "닭의 품질을 초월한 닭고기")) {
					totalStat += amount[i] * 110;
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신이 튀겨먹는 닭고기")) {
					totalStat += amount[i] * 160;
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "베타램 등급의 양고기")) {
					totalStat += amount[i] * 10;
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "램(Lamb) 등급의 양고기")) {
					totalStat += amount[i] * 20;
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "호겟 등급의 양고기")) {
					totalStat += amount[i] * 40;
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "머튼 등급의 양고기")) {
					totalStat += amount[i] * 70;
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "램(Ram) 등급의 양고기")) {
					totalStat += amount[i] * 110;
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신이 인정한 양고기")) {
					totalStat += amount[i] * 160;
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "상처가 많은 밀")) {
					totalStat += amount[i] * 10;
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "밀")) {
					totalStat += amount[i] * 20;
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "좋은 식재료가 될 밀")) {
					totalStat += amount[i] * 40;
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀")) {
					totalStat += amount[i] * 70;
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "윤기가 나는 밀")) {
					totalStat += amount[i] * 110;
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신이 먹는다고 알려진 밀")) {
					totalStat += amount[i] * 160;
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
			
			if(resultStat <= 0) {
				player.sendMessage("제작 결과 아무것도 얻지 못했습니다.");
				return;
			}
			
			//대성공
			int doubleUpChance = rnd.nextInt(10);
			
			if(doubleUpChance == 0) {
				player.sendMessage("제작 대성공!");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
				player.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 0.3f, 1.5f);
			} else {
				player.sendMessage("제작 성공!");
				resultStat /= 2;
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
			
			//성공 시 절반이 되는 것에 의해 0이하가 되는 오류가 발생시 교정
			if(resultStat <= 0) {
				resultStat = 1;
			}
			
			//생활 레벨 보너스
			ItemStack item = player.getInventory().getItem(7);
			ItemMeta im = item.getItemMeta();
			double lvl = Double.parseDouble(im.getLore().get(2).split(": ")[1]);
			resultStat = resultStat + (int)(resultStat*lvl/50);
			
			//생활 레벨 상승
			double exp = ((int)(Math.pow((Math.log(resultStat)),3)) / 100.0) / lvl;
			ArrayList<String> lore = (ArrayList<String>) im.getLore(); 
			double newLevel = Double.parseDouble(String.format("%.2f", lvl+exp));
			if(newLevel >= 200.0) {
				lore.set(2, ChatColor.GRAY + "음식 제작 레벨: " + "200[Max]");
			} else {
				lore.set(2, ChatColor.GRAY + "음식 제작 레벨: " + newLevel);
			}
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().setItem(7, item);
			
			// 계승자 보너스
			Inheritance inheritance = new Inheritance();
			if (inheritance.getInheritance(player) == 89) {
				resultStat *= 1.2;
			} else if (inheritance.getInheritance(player) == 90) {
				resultStat *= 1.4;
			} else if (inheritance.getInheritance(player) == 91) {
				resultStat *= 1.6;
			}

			// 음식 텍스처, 성능 결정
			// 회복, 흡수, 힘, 속도 증가, 점프 증가, 저항, 속도 감소, 독, 위더, 멀미, 기간
			String mat = "SUSPICIOUS_STEW";
			int[] stat = {0,0,0,0,0,0,0,0,0,0,0};
			String[] buff = {"즉시 회복: ","추가 체력: ","힘: ","속도 증가: ","점프 증가: ","저항: ","속도 감소: ","독: ","위더: ","멀미: "};
			
			stat[10] = (int)(Math.pow((Math.log(resultStat)),3));
			
			if(stat[10] > 6000) {
				stat[10] = 6000;
			}
			
			if(meat >= fish && meat >= salad && meat >= potion && meat >= trash) {
				mat = "MUSHROOM_STEW";
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
				stat[3] = tmp / 500;
				if(stat[3] > 5) {
					stat[3] = 5;
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
			} else if(fish >= meat && fish >= salad && fish >= potion && fish >= trash) {
				mat = "RABBIT_STEW";
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
			} else if(salad >= meat && salad >= fish && salad >= potion && salad >= trash) {
				mat = "BEETROOT_SOUP";
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
			} else if(potion >= meat && potion >= fish && potion >= salad && potion >= trash) {
				mat = "HONEY_BOTTLE";
				int tmp = rnd.nextInt(resultStat);
				stat[0] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[6] = tmp / 300;
				if(stat[6] > 5) {
					stat[6] = 5;
				}
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[7] = tmp / 500;
				if(stat[7] > 10) {
					stat[7] = 10;
				}
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[5] = tmp / 1000;
				if(stat[5] > 4) {
					stat[5] = 4;
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
				mat = "SUSPICIOUS_STEW";
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
			}
			
			for(int i = 0 ; i < 10 ; i++) {
				stat[i]--;
			}
			
			String localName = Integer.toString(stat[0]) + "," + stat[1] + "," + stat[2] + "," + stat[3] + "," + stat[4] + "," + stat[5] + "," + stat[6] + "," + stat[7] + "," + stat[8] + "," + stat[9] + "," + stat[10];
			
			int limit = (int) (Math.pow(stat[10]/20, 2) / 10);
			if(limit >= 700) {
				if(limit >= 800) {
					if(limit >= 900) {
						if(limit >= 1000) {
							limit = 1000;
						} else {
							limit = 900;
						}
					} else {
						limit = 800;
					}
				} else {
					limit = 700;
				}
			}
			
			ItemStack food = new ItemStack(Material.valueOf(mat));
			ItemMeta foodIm = food.getItemMeta();
			foodIm.setLocalizedName(localName);
			foodIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 음식");
			ArrayList<String> foodLore = new ArrayList();
			foodLore.add(ChatColor.GRAY + "레벨 제한: " + limit);
			foodLore.add(ChatColor.GRAY + " ");
			foodLore.add(ChatColor.GRAY + "지속 시간: " + stat[10]/20 + "초");
			foodLore.add(ChatColor.GRAY + " ");
			foodLore.add(ChatColor.GRAY + "제작자: " + player.getDisplayName());
			foodLore.add(ChatColor.GRAY + " ");
			for(int i = 0 ; i < 10 ; i++) {
				if(stat[i] < 0) {
					continue;
				}
				foodLore.add(ChatColor.GRAY + buff[i] + (stat[i] + 1));
			}
			foodIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			foodIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			foodIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			foodIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			foodIm.setUnbreakable(true);
			foodIm.setLore(foodLore);
			food.setItemMeta(foodIm);
			
			if(inv.getItem(15) != null) {
				player.getInventory().addItem(inv.getItem(15));
			}
			
			inv.setItem(15, food);
			
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
