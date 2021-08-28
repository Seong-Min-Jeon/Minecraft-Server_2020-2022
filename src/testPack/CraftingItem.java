package testPack;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingItem {
	
	public void make(Player player, Inventory inv) {
		try {
			// type, amount, name, rank, localizeName(10)
			// gray = 0; white = 3; yellow = 9; light_purple = 27; aqua = 81; dark_red = 243; dark_purple = 729; green = 15; dark_aqua = 51; gold = 2;
			int[] ary = {0,1,2,3,4,9,10,11,12,13,18,19,20,21,22,27,28,29,30,31,36,37,38,39,40};
			
			String[] type = new String[26];
			int[] amount = new int[26];
			String[] name = new String[26];
			int[] rank = new int[26];
			int[] damAll = new int[26];
			int[] damUndead = new int[26];
			int[] damArth = new int[26];
			int[] impaling = new int[26];
			int[] sweeping = new int[26];
			int[] protAll = new int[26];
			int[] protFire = new int[26];
			int[] protExplosion = new int[26];
			int[] protProject = new int[26];
			int[] thorns = new int[26];
			
			int idx = 0;
			
			double jewel = 1;
			
			for(int i : ary) {
				ItemStack item = inv.getItem(i);
				try {type[idx] = item.getType().toString();} catch(Exception e) {}
				try {amount[idx] = item.getAmount();} catch(Exception e) {}
				try {name[idx] = item.getItemMeta().getDisplayName();} catch(Exception e) {name[idx] = null;}
				try { 
					String tmp = item.getItemMeta().getDisplayName().substring(0, 2);
					if(tmp.equals("§7")) {
						rank[idx] = 0;
					} else if(tmp.equals("§f")) {
						rank[idx] = 1;
					} else if(tmp.equals("§e")) {
						rank[idx] = 2;
					} else if(tmp.equals("§d")) {
						rank[idx] = 3;
					} else if(tmp.equals("§b")) {
						rank[idx] = 4;
					} else if(tmp.equals("§4")) {
						rank[idx] = 5;
					} else if(tmp.equals("§5")) {
						rank[idx] = 6;
					} else if(tmp.equals("§a")) {
						rank[idx] = 2;
					} else if(tmp.equals("§3")) {
						rank[idx] = -3;
					} else if(tmp.equals("§6")) {
						rank[idx] = 2;
					} else {
						rank[idx] = 1;
					}
				} catch(Exception e) {
					
				}
				try {
					String[] tmp = item.getItemMeta().getLocalizedName().split(",");
					damAll[idx] = Integer.parseInt(tmp[0]);
					damUndead[idx] = Integer.parseInt(tmp[1]);
					damArth[idx] = Integer.parseInt(tmp[2]);
					impaling[idx] = Integer.parseInt(tmp[3]);
					sweeping[idx] = Integer.parseInt(tmp[4]);
					protAll[idx] = Integer.parseInt(tmp[5]);
					protFire[idx] = Integer.parseInt(tmp[6]);
					protExplosion[idx] = Integer.parseInt(tmp[7]);
					protProject[idx] = Integer.parseInt(tmp[8]);
					thorns[idx] = Integer.parseInt(tmp[9]);
				} catch(Exception e) {
					
				}
				idx++;
			}
			
			removeItem(inv);
			
			int totalStat = 0;
			int var = 25;
			
			for(int i = 0 ; i < 25 ; i++) {
				if(type[i] == null) {
					var -= 1;
					continue;
				}
				
				if(type[i].equalsIgnoreCase("EMERALD")) {
					totalStat += amount[i]; 
				}
				if(type[i].equalsIgnoreCase("EMERALD_BLOCK")) {
					totalStat += amount[i] * 3; 
				}
				if(type[i].equalsIgnoreCase("SCUTE")) {
					totalStat += amount[i] * 5; 
				}
				if(type[i].equalsIgnoreCase("RABBIT_HIDE")) {
					totalStat += amount[i] * 7; 
				}
				if(type[i].equalsIgnoreCase("FLOWER_BANNER_PATTERN")) {
					totalStat += amount[i] * -1; 
				}
				if(type[i].equalsIgnoreCase("CREEPER_BANNER_PATTERN")) {
					totalStat += amount[i] * -1; 
				}
				if(type[i].equalsIgnoreCase("SKULL_BANNER_PATTERN")) {
					totalStat += amount[i] * -1; 
				}
				if(type[i].equalsIgnoreCase("MOJANG_BANNER_PATTERN")) {
					totalStat += amount[i] * -1; 
				}
				if(type[i].equalsIgnoreCase("GLOBE_BANNER_PATTERN")) {
					totalStat += amount[i] * -1; 
				}
				if(type[i].equalsIgnoreCase("POTION")) {
					totalStat += amount[i] * -1; 
				}
				
			}
			
			for(int i : amount) {
				
			}
			
			
			for(int i = 0 ; i < 25 ; i++) {
				if(name[i] == null) {
					continue;
				}
				
				//광석류
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "흠집이 생긴 석탄 광석")) {
					totalStat += amount[i]; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "석탄 광석")) {
					totalStat += amount[i] * 2; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "깨끗한 석탄 광석")) {
					totalStat += amount[i] * 3; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄 광석")) {
					totalStat += amount[i] * 4; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "절대적인 석탄 광석")) {
					totalStat += amount[i] * 5; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신의 힘이 담긴 석탄 광석")) {
					totalStat += amount[i] * 7; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "상태가 좋지 않은 철 광석")) {
					totalStat += amount[i] * 4; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "철 광석")) {
					totalStat += amount[i] * 5; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "빛이나는 철 광석")) {
					totalStat += amount[i] * 6; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "순백의 철 광석")) {
					totalStat += amount[i] * 7; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신의 힘이 담긴 철 광석")) {
					totalStat += amount[i] * 9; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "가치가 떨어진 금 광석")) {
					totalStat += amount[i] * 7; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "금 광석")) {
					totalStat += amount[i] * 8; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "쉽게 녹지 않는 금 광석")) {
					totalStat += amount[i] * 9; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신의 힘이 담긴 금 광석")) {
					totalStat += amount[i] * 11; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석")) {
					totalStat += amount[i] * 10; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "다이아몬드 원석")) {
					totalStat += amount[i] * 11; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "빛나는 다이아몬드 원석")) {
					totalStat += amount[i] * 12; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드 원석")) {
					totalStat += amount[i] * 15; 
				}
				
				//광물류
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "흠집이 생긴 석탄")) {
					totalStat += amount[i] * 2; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "석탄")) {
					totalStat += amount[i] * 3; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "깨끗한 석탄")) {
					totalStat += amount[i] * 4; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄")) {
					totalStat += amount[i] * 6; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "절대적인 석탄")) {
					totalStat += amount[i] * 7; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신의 힘이 담긴 석탄")) {
					totalStat += amount[i] * 9; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "상태가 좋지 않은 철")) {
					totalStat += amount[i] * 5; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "철")) {
					totalStat += amount[i] * 6; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "빛이나는 철")) {
					totalStat += amount[i] * 8; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "순백의 철")) {
					totalStat += amount[i] * 9; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신의 힘이 담긴 철")) {
					totalStat += amount[i] * 11; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "가치가 떨어진 금")) {
					totalStat += amount[i] * 9; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "금")) {
					totalStat += amount[i] * 10; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "쉽게 녹지 않는 금")) {
					totalStat += amount[i] * 11; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신의 힘이 담긴 금")) {
					totalStat += amount[i] * 13; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드")) {
					totalStat += amount[i] * 12; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "다이아몬드")) {
					totalStat += amount[i] * 13; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "빛나는 다이아몬드")) {
					totalStat += amount[i] * 14; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드")) {
					totalStat += amount[i] * 18; 
				}
				
				//밀류
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "상처가 많은 밀")) {
					totalStat += amount[i]; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "밀")) {
					totalStat += amount[i] * 2; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "좋은 식재료가 될 밀")) {
					totalStat += amount[i] * 3; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "정교한 힘으로 잘린 밀")) {
					totalStat += amount[i] * 4; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "윤기가 나는 밀")) {
					totalStat += amount[i] * 5; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "신이 먹는다고 알려진 밀")) {
					totalStat += amount[i] * 7; 
				}
				
				//제작 전용 아이템
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 피")) {
					totalStat += amount[i] * 3; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 쓸개")) {
					totalStat += amount[i] * 4; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 살점")) {
					totalStat += amount[i] * 5; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 간")) {
					totalStat += amount[i] * 6; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "하급 포보르의 심장")) {
					totalStat += amount[i] * 8;
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 피")) {
					totalStat += amount[i] * 7; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 쓸개")) {
					totalStat += amount[i] * 8; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 살점")) {
					totalStat += amount[i] * 9; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 간")) {
					totalStat += amount[i] * 10; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 심장")) {
					totalStat += amount[i] * 12;
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "중급 포보르의 뿔")) {
					totalStat += amount[i] * 15;
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 피")) {
					totalStat += amount[i] * 11; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 쓸개")) {
					totalStat += amount[i] * 12; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 살점")) {
					totalStat += amount[i] * 13; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 간")) {
					totalStat += amount[i] * 14; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 심장")) {
					totalStat += amount[i] * 16;
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "상급 포보르의 뿔")) {
					totalStat += amount[i] * 19;
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 피")) {
					totalStat += amount[i] * 15; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 쓸개")) {
					totalStat += amount[i] * 16; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 살점")) {
					totalStat += amount[i] * 17; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 간")) {
					totalStat += amount[i] * 18; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 심장")) {
					totalStat += amount[i] * 20;
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔")) {
					totalStat += amount[i] * 23;
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 뿔")) {
					totalStat += amount[i] * 19; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 쓸개")) {
					totalStat += amount[i] * 20; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 살점")) {
					totalStat += amount[i] * 21; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 간")) {
					totalStat += amount[i] * 22; 
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 심장")) {
					totalStat += amount[i] * 24;
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "심연의 포보르의 뿔")) {
					totalStat += amount[i] * 27;
				}
				
				// 보석 보너스
				if(name[i].equalsIgnoreCase(ChatColor.GRAY + "빛바랜 보석")) {
					if(jewel < 1.05) {
						totalStat += 50;
						jewel = 1.05;
					}
				}
				if(name[i].equalsIgnoreCase(ChatColor.WHITE + "부서진 수호자의 보석")) {
					if(jewel < 1.1) {
						totalStat += 100;
						jewel = 1.1;
					}
				}
				if(name[i].equalsIgnoreCase(ChatColor.YELLOW + "고대의 자수정 보석")) {
					if(jewel < 1.15) {
						totalStat += 200;
						jewel = 1.15;
					}
				}
				if(name[i].equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "불길한 운명의 보석")) {
					if(jewel < 1.25) {
						totalStat += 350;
						jewel = 1.25;
					}
				}
				if(name[i].equalsIgnoreCase(ChatColor.AQUA + "망가진 마법사의 보석")) {
					if(jewel < 1.4) {
						totalStat += 550;
						jewel = 1.4;
					}
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_RED + "영롱한 여명의 보석")) {
					if(jewel < 1.9) {
						totalStat += 800;
						jewel = 1.9;
					}
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_PURPLE + "태양석")) {
					if(jewel < 3.5) {
						totalStat += 2000;
						jewel = 3.5;
					}
				}
				if(name[i].equalsIgnoreCase(ChatColor.DARK_PURPLE + "만월석")) {
					if(jewel < 3.5) {
						totalStat += 2000;
						jewel = 3.5;
					}
				}
			}
			
			for(int i : damAll) {
				totalStat += i / 2;
			}
			
			for(int i : damUndead) {
				totalStat += i / 2;
			}
			
			for(int i : damArth) {
				totalStat += i / 2;
			}

			for(int i : impaling) {
				totalStat += i / 2;
			}
			
			for(int i : sweeping) {
				totalStat += i / 2;
			}
			
			for(int i : protAll) {
				totalStat += i / 2;
			}
			
			for(int i : protFire) {
				totalStat += i / 2;
			}
			
			for(int i : protExplosion) {
				totalStat += i / 2;
			}
			
			for(int i : protProject) {
				totalStat += i / 2;
			}
			
			for(int i : thorns) {
				totalStat += i / 2;
			}
			
			int avg = 0;
			for(int i : rank) {
				avg += i;
			}
			avg /= var;
			if(avg < 1) {
				avg = 1;
			}
			totalStat *= (avg/3.0);
			
			Random rnd = new Random();
			
			double mul = (700 + rnd.nextInt(500)) / 1000.0;
			
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
			double lvl = Double.parseDouble(im.getLore().get(0).split(": ")[1]);
			resultStat = resultStat + (int)(resultStat*lvl/50);
			
			//생활 레벨 상승
			double exp = ((int)(Math.pow((Math.log(resultStat)),3)) / 100.0) / lvl;
			ArrayList<String> lore = (ArrayList<String>) im.getLore(); 
			double newLevel = Double.parseDouble(String.format("%.2f", lvl+exp));
			if(newLevel >= 200.0) {
				lore.set(0, ChatColor.GRAY + "장비 제작 레벨: " + "200.0");
			} else {
				lore.set(0, ChatColor.GRAY + "장비 제작 레벨: " + newLevel);
			}
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().setItem(7, item);

			// 장비 부위와 레벨
			// 0: helmet, 1: chest, 2: leggings, 3: boots, ...: weapon
			int[] stat = {0,0,0,0,0,0,0,0,0,0,0};
			
			stat[10] = (int)(Math.pow((Math.log(resultStat)),3));
			
			// 보석 보너스
			resultStat *= jewel;
			
			int equipType = rnd.nextInt(6);
			
			int statNum = rnd.nextInt(2);
			
			if(statNum == 0) {
				int tmp = rnd.nextInt(resultStat);
				stat[5] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[6] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[7] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[8] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[9] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[0] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[1] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[2] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[3] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[4] = tmp;
				resultStat -= tmp;
			} else {
				int tmp = rnd.nextInt(resultStat);
				stat[0] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[1] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[2] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[3] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[4] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[9] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[5] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[6] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[7] = tmp;
				resultStat -= tmp;
				tmp = rnd.nextInt(resultStat);
				stat[8] = tmp;
				resultStat -= tmp;
			}
			
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
				resultStat += stat[5] - 30000;
				stat[5] = 30000;
			}
			if(stat[6] > 30000) {
				resultStat += stat[6] - 30000;
				stat[6] = 30000;
			}
			if(stat[7] > 30000) {
				resultStat += stat[7] - 30000;
				stat[7] = 30000;
			}
			if(stat[8] > 30000) {
				resultStat += stat[8] - 30000;
				stat[8] = 30000;
			}
			if(stat[9] > 1000000) {
				stat[9] = 1000000;
			}
			if(stat[10] >= 700) {
				if(stat[10] >= 800) {
					if(stat[10] >= 900) {
						if(stat[10] >= 1000) {
							stat[10] = 1000;
						} else {
							stat[10] = 900;
						}
					} else {
						stat[10] = 800;
					}
				} else {
					stat[10] = 700;
				}
			}
			
			stat[9] += resultStat;
			
			String localName = Integer.toString(stat[0]) + "," + stat[1] + "," + stat[2] + "," + stat[3] + "," + stat[4] + "," + stat[5] + "," + stat[6] + "," + stat[7] + "," + stat[8] + "," + stat[9] + "," + stat[10];
			
			if(inv.getItem(25) != null) {
				player.getInventory().addItem(inv.getItem(25));
			}
			
			if(equipType == 0) {
				System.out.println(player.getDisplayName() + "이/가 헬멧" + "(" + localName + ")" + ChatColor.WHITE + "을/를 제작하였다.");
			} else if(equipType == 1) {
				System.out.println(player.getDisplayName() + "이/가 갑옷" + "(" + localName + ")" + ChatColor.WHITE + "을/를 제작하였다.");
			} else if(equipType == 2) {
				System.out.println(player.getDisplayName() + "이/가 각반" + "(" + localName + ")" + ChatColor.WHITE + "을/를 제작하였다.");
			} else if(equipType == 3) {
				System.out.println(player.getDisplayName() + "이/가 신발" + "(" + localName + ")" + ChatColor.WHITE + "을/를 제작하였다.");
			} else {
				System.out.println(player.getDisplayName() + "이/가 무기" + "(" + localName + ")" + ChatColor.WHITE + "을/를 제작하였다.");
			}
			
			inv.setItem(25, makeItem(player, equipType, stat, localName, ((int)(lvl)) ));
			
		} catch(Exception e) {
			player.sendMessage("제작 결과 아무것도 얻지 못했습니다.");
		}
	}
	
	public void removeItem(Inventory inv) {
		inv.remove(inv.getItem(0));
		inv.remove(inv.getItem(1));
		inv.remove(inv.getItem(2));
		inv.remove(inv.getItem(3));
		inv.remove(inv.getItem(4));
		inv.remove(inv.getItem(9));
		inv.remove(inv.getItem(10));
		inv.remove(inv.getItem(11));
		inv.remove(inv.getItem(12));
		inv.remove(inv.getItem(13));
		inv.remove(inv.getItem(18));
		inv.remove(inv.getItem(19));
		inv.remove(inv.getItem(20));
		inv.remove(inv.getItem(21));
		inv.remove(inv.getItem(22));
		inv.remove(inv.getItem(27));
		inv.remove(inv.getItem(28));
		inv.remove(inv.getItem(29));
		inv.remove(inv.getItem(30));
		inv.remove(inv.getItem(31));
		inv.remove(inv.getItem(36));
		inv.remove(inv.getItem(37));
		inv.remove(inv.getItem(38));
		inv.remove(inv.getItem(39));
		inv.remove(inv.getItem(40));
	}
	
	public ItemStack makeItem(Player player, int equipType, int[] stat, String localName, int lvl) {
		if(equipType == 0 && stat[10] < 100) {
			ItemStack equip = new ItemStack(Material.LEATHER_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && stat[10] < 200) {
			ItemStack equip = new ItemStack(Material.CHAINMAIL_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && stat[10] < 400) {
			ItemStack equip = new ItemStack(Material.IRON_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && stat[10] < 700) {
			ItemStack equip = new ItemStack(Material.GOLDEN_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && stat[10] < 900) {
			ItemStack equip = new ItemStack(Material.DIAMOND_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 0 && stat[10] <= 1000) {
			ItemStack equip = new ItemStack(Material.NETHERITE_HELMET);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 헬멧");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && stat[10] < 100) {
			ItemStack equip = new ItemStack(Material.LEATHER_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && stat[10] < 200) {
			ItemStack equip = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && stat[10] < 400) {
			ItemStack equip = new ItemStack(Material.IRON_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && stat[10] < 700) {
			ItemStack equip = new ItemStack(Material.GOLDEN_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && stat[10] < 900) {
			ItemStack equip = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 1 && stat[10] <= 1000) {
			ItemStack equip = new ItemStack(Material.NETHERITE_CHESTPLATE);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 갑옷");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && stat[10] < 100) {
			ItemStack equip = new ItemStack(Material.LEATHER_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && stat[10] < 200) {
			ItemStack equip = new ItemStack(Material.CHAINMAIL_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && stat[10] < 400) {
			ItemStack equip = new ItemStack(Material.IRON_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && stat[10] < 700) {
			ItemStack equip = new ItemStack(Material.GOLDEN_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && stat[10] < 900) {
			ItemStack equip = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 2 && stat[10] <= 1000) {
			ItemStack equip = new ItemStack(Material.NETHERITE_LEGGINGS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 각반");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && stat[10] < 100) {
			ItemStack equip = new ItemStack(Material.LEATHER_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && stat[10] < 200) {
			ItemStack equip = new ItemStack(Material.CHAINMAIL_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && stat[10] < 400) {
			ItemStack equip = new ItemStack(Material.IRON_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && stat[10] < 700) {
			ItemStack equip = new ItemStack(Material.GOLDEN_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && stat[10] < 900) {
			ItemStack equip = new ItemStack(Material.DIAMOND_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
			equipIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			equipIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			equipIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			equipIm.setUnbreakable(true);
			equipIm.setLore(equipLore);
			equip.setItemMeta(equipIm);
			return equip;
		} else if(equipType == 3 && stat[10] <= 1000) {
			ItemStack equip = new ItemStack(Material.NETHERITE_BOOTS);
			ItemMeta equipIm = equip.getItemMeta();
			equipIm.setLocalizedName(localName);
			equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 신발");
			ArrayList<String> equipLore = new ArrayList();
			equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
			equipLore.add(ChatColor.GRAY + " ");
			equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
				equipIm.setDisplayName(ChatColor.DARK_AQUA + player.getDisplayName() + "님이 제작한 무기");
				ArrayList<String> equipLore = new ArrayList();
				equipLore.add(ChatColor.GRAY + "레벨 제한: " + stat[10]);
				equipLore.add(ChatColor.GRAY + " ");
				equipLore.add(ChatColor.GRAY + "" + lvl + "레벨 대장장이 " + player.getDisplayName() + "의 작품");
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
	
}
