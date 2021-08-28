package testPack;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Reinforcement {
	
	Random rnd = new Random();
	private static int percent = 30; //30  18
	private static int percentDia = 50; //50  33
	private static int percentArmor = 50; //50  42
	private static int percentArrow = 10000; //10000  6000
	private static int percentArrowKami = 100; //100  70
	private int taskID;

	public ItemMeta coalReinWeapon(Player player, ItemMeta item, ItemMeta itemResource) {
		
		if(!durability(item)) {
			player.sendMessage("내구도가 0인 장비에는 강화의 효력이 나타나지 않습니다.");
			return item;
		} 
		
		String[] ary = item.getLocalizedName().split(",");
		
		//석탄 1
		if(itemResource.getDisplayName().equals(ChatColor.GRAY + "흠집이 생긴 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+1 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 1만큼 상승하였습니다.");
				} 
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+1 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+1 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 1);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 2);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 9);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		//석탄 2
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+3 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 3만큼 상승하였습니다.");
				} 		
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 1);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 2);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 9);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//석탄 3
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "깨끗한 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 5만큼 상승하였습니다.");
				} 		
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 3만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 3만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 3만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}
		//석탄 4
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 9만큼 상승하였습니다.");
				} 			
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 5만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 5만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 5만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}
		//석탄 5
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "절대적인 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 40만큼 상승하였습니다.");
				} 		
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 30만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 30만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 30만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//석탄 6
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 80만큼 상승하였습니다.");
				} 		
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 40만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 40만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 40만큼 감소하였습니다.");                        							
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}
		return item;
	}
	
	public ItemMeta ironReinWeapon(Player player, ItemMeta item, ItemMeta itemResource) {
		
		if(!durability(item)) {
			player.sendMessage("내구도가 0인 장비에는 강화의 효력이 나타나지 않습니다.");
			return item;
		} 
		
		String[] ary = item.getLocalizedName().split(",");
		
		//철 1
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "상태가 좋지 않은 철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=15) {
				int num2 = rnd.nextInt(2);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 0);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 9);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		//철 2
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=15) {
				int num2 = rnd.nextInt(2);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//철 3
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "빛이나는 철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=15) {
				int num2 = rnd.nextInt(2);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//철 4
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "순백의 철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=15) {
				int num2 = rnd.nextInt(2);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}                      			
		//철 5
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=15) {
				int num2 = rnd.nextInt(2);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}
		return item;
	}
	
	public ItemMeta goldReinWeapon(Player player, ItemMeta item, ItemMeta itemResource) {
		
		if(!durability(item)) {
			player.sendMessage("내구도가 0인 장비에는 강화의 효력이 나타나지 않습니다.");
			return item;
		} 
		
		String[] ary = item.getLocalizedName().split(",");
		
		//금 1
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "가치가 떨어진 금")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(기타)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(기타)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//금 2
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "금")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(기타)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(기타)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//금 3
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "쉽게 녹지 않는 금")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(기타)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(기타)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}   			
		//금 4
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 금")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(기타)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(기타)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}
		return item;
	}
	
	public ItemMeta diaReinWeapon(Player player, ItemMeta item, ItemMeta itemResource) {
		
		if(!durability(item)) {
			player.sendMessage("내구도가 0인 장비에는 강화의 효력이 나타나지 않습니다.");
			return item;
		} 
		
		String[] ary = item.getLocalizedName().split(",");
		
		//다야 1
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(기타)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(기타)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<28) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 9만큼 상승하였습니다.");
				}
			} else if(num<=32) {
				int num2 = rnd.nextInt(6);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 5) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//다야 2
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "다이아몬드")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(기타)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(기타)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<28) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=32) {
				int num2 = rnd.nextInt(6);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 5) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//다야 3
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "빛나는 다이아몬드")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(기타)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(기타)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<28) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=32) {
				int num2 = rnd.nextInt(6);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 5) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}   			
		//다야 4
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 1000000) {
					String result = makeEnch(ary, "1000000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(기타)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(기타)의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 1000000) {
					String result = makeEnch(ary, "1000000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<28) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=32) {
				int num2 = rnd.nextInt(6);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 5) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}
		//다야 5
		if (itemResource.getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "The Item from God")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "공격력의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 1000000) {
					String result = makeEnch(ary, "1000000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 공격력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "공격력의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 1000000) {
					String result = makeEnch(ary, "1000000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 1000000) {
					String result = makeEnch(ary, "1000000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(동물형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(동물형)의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 1000000) {
					String result = makeEnch(ary, "1000000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(기타)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(기타)의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 1000000) {
					String result = makeEnch(ary, "1000000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<28) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=32) {
				int num2 = rnd.nextInt(6);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "공격력의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(동물형)의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(기타)의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 5) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}
		return item;
	}

	public ItemMeta coalReinArmor(Player player, ItemMeta item, ItemMeta itemResource) {
		
		if(!durability(item)) {
			player.sendMessage("내구도가 0인 장비에는 강화의 효력이 나타나지 않습니다.");
			return item;
		} 
		
		String[] ary = item.getLocalizedName().split(",");
		
		//석탄 1
		if(itemResource.getDisplayName().equals(ChatColor.GRAY + "흠집이 생긴 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+1 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+1 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+1 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+1 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+1 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		//석탄 2
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//석탄 3
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "깨끗한 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//석탄 4
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//석탄 5
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "절대적인 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//석탄 6
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		return item;
	}
	
	public ItemMeta ironReinArmor(Player player, ItemMeta item, ItemMeta itemResource) {
		
		if(!durability(item)) {
			player.sendMessage("내구도가 0인 장비에는 강화의 효력이 나타나지 않습니다.");
			return item;
		} 
		
		String[] ary = item.getLocalizedName().split(",");
		
		//철 1
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "상태가 좋지 않은 철")) {
			int num = rnd.nextInt(percentArmor - 5);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+3 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+3), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 3만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-1 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-1), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 1만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		//철 2
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "철")) {
			int num = rnd.nextInt(percentArmor - 5);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//철 3
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "빛이나는 철")) {
			int num = rnd.nextInt(percentArmor - 5);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//철 4
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "순백의 철")) {
			int num = rnd.nextInt(percentArmor - 5);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}                      			
		//철 5
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 철")) {
			int num = rnd.nextInt(percentArmor - 5);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		return item;
	}
	
	public ItemMeta goldReinArmor(Player player, ItemMeta item, ItemMeta itemResource) {
		
		if(!durability(item)) {
			player.sendMessage("내구도가 0인 장비에는 강화의 효력이 나타나지 않습니다.");
			return item;
		} 
		
		String[] ary = item.getLocalizedName().split(",");
		
		//금 1
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "가치가 떨어진 금")) {
			int num = rnd.nextInt(percentArmor - 10);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+5 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+5), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 5만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 3만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//금 2
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "금")) {
			int num = rnd.nextInt(percentArmor - 10);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//금 3
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "쉽게 녹지 않는 금")) {
			int num = rnd.nextInt(percentArmor - 10);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}   			
		//금 4
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 금")) {
			int num = rnd.nextInt(percentArmor - 10);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		return item;
	}
	
	public ItemMeta diaReinArmor(Player player, ItemMeta item, ItemMeta itemResource) {
		
		if(!durability(item)) {
			player.sendMessage("내구도가 0인 장비에는 강화의 효력이 나타나지 않습니다.");
			return item;
		} 
		
		String[] ary = item.getLocalizedName().split(",");
		
		//다야 1
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드")) {
			int num = rnd.nextInt(percentArmor - 15);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+9 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+9), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 9만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-5 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-5), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 5만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//다야 2
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "다이아몬드")) {
			int num = rnd.nextInt(percentArmor - 15);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+40 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-30 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-30), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 30만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		//다야 3
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "빛나는 다이아몬드")) {
			int num = rnd.nextInt(percentArmor - 15);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+80 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+80), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 80만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-40 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-40), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 40만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}
		//다야 4
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드")) {
			int num = rnd.nextInt(percentArmor - 15);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+300 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+300), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 300만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-200 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-200), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 200만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}
		//다야 5
		if (itemResource.getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "The Item from God")) {
			int num = rnd.nextInt(percentArmor - 15);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "방어력의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 방어력의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "방어력의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl+777 >= 1000000) {
					String result = makeEnch(ary, "1000000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+777), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 777만큼 상승하였습니다.");
				}
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "방어력의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-7 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-7), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 7만큼 감소하였습니다.");
						player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		return item;
	}
	
	public String makeEnch(String[] ary, String str, int num) {
		String result = "";
		for(int i = 0 ; i < 10 ; i++) {
			if(i == num) {
				result = result + "," + str;
				continue;
			}
			result = result + "," + ary[i];
		}
		String data = result.substring(1);
		try {
			data = data.concat("," + ary[10]);
		} catch(Exception e) {
			
		}
		return data;
	}
	
	public boolean durability(ItemMeta item) {
		try {
			ArrayList<String> lores = (ArrayList<String>) item.getLore();
			int lineNum = -1;
			for(int i = 0 ; i < lores.size() ; i++) {
				if(lores.get(i).split(": ")[0].equals(ChatColor.DARK_GRAY + "내구도")) {
					lineNum = i;
					break;
				}
			}
			if(lineNum != -1) {
				int dura = Integer.parseInt(lores.get(lineNum).split(": ")[1].split("/")[0]);
				if(dura == 0) {
					return false;
				} else {
					dura--;
				}
				lores.set(lineNum, ChatColor.DARK_GRAY + "내구도: " + Integer.toString(dura) + "/3000");
				item.setLore(lores);
				return true;
			} else {
				for(int i = 0 ; i < lores.size() ; i++) {
					if(lores.get(i).equals("=====인챈트=====")) {
						lineNum = i;
						break;
					}
				}
				if(lineNum != -1) {
					lores.add(lineNum, " ");
					lores.add(lineNum, ChatColor.DARK_GRAY + "내구도: 2999/3000");
					item.setLore(lores);
					return true;
				} else {
					lores.add(" ");
					lores.add(ChatColor.DARK_GRAY + "내구도: 2999/3000");
					item.setLore(lores);
					return true;
				}
			}
		} catch(Exception e) {
			
		}
		return true;
	}
	
	public ItemMeta bowRein1(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 1
		if(itemResource.getDisplayName().equals(ChatColor.GRAY + "깨질 듯한 석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<5000) {
				item.setLocalizedName("2");				
				player.sendMessage(ChatColor.GREEN + "첫번째 개방에 성공하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else {
				player.sendMessage(ChatColor.WHITE + "개방에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}			
		} 		
		return item;
	}
	
	public ItemMeta bowRein2(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 2
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<3333) {
				item.setLocalizedName("10");				
				player.sendMessage(ChatColor.GREEN + "두번째 개방에 성공하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else {
				player.sendMessage(ChatColor.WHITE + "개방에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		return item;
	}
	
	public ItemMeta bowRein3(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 3
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "반듯한 석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<1000) {
				item.setLocalizedName("50");
				player.sendMessage(ChatColor.GREEN + "세번째 개방에 성공하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else {
				player.sendMessage(ChatColor.WHITE + "개방에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		return item;
	}
	
	public ItemMeta bowRein4(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 4
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "매혹적인 석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<100) {
				item.setLocalizedName("300");
				player.sendMessage(ChatColor.GREEN + "네번째 개방에 성공하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else {
				player.sendMessage(ChatColor.WHITE + "개방에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		return item;
	}
	
	public ItemMeta bowRein5(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 5
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "보석같은 석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<30) {
				item.setLocalizedName("1000");
				player.sendMessage(ChatColor.GREEN + "다섯번째 개방에 성공하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else {
				player.sendMessage(ChatColor.WHITE + "개방에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		}  
		return item;
	}
	
	public ItemMeta bowRein6(Player player, ItemMeta item, ItemMeta itemResource) {
		
		if(!durability(item)) {
			player.sendMessage("내구도가 0인 장비에는 강화의 효력이 나타나지 않습니다.");
			return item;
		}
		
		//석영 6
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 석영")) {
			int num = rnd.nextInt(percentArrowKami);
			if(num<10) {
				int lvl = Integer.parseInt(item.getLocalizedName());
				if (lvl == 1000000) {
					player.sendMessage(ChatColor.WHITE + "이 무기의 개방은 이미 한계입니다.");
				} else if (lvl+100 >= 1000000) {
					item.setLocalizedName("1000000");
					player.sendMessage(ChatColor.GREEN + "축하합니다. 개방이 한계에 도달했습니다.");
					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
				} else if (lvl >= 1000) {
					item.setLocalizedName(Integer.toString(lvl+100));
					player.sendMessage(ChatColor.GREEN + "개방에 성공 하였습니다.");
					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
				} 
			} else if(num<13) {
				int lvl = Integer.parseInt(item.getLocalizedName());
				if (lvl >= 1050) {
					item.setLocalizedName(Integer.toString(lvl-50));
					player.sendMessage(ChatColor.WHITE + "개방에 대실패하였습니다.");
					player.sendMessage(ChatColor.WHITE + "개방 수치가 하락하였습니다.");
					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "개방에 실패하였습니다.");
					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "개방에 실패하였습니다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			}
		} 
		return item;
	}
	
	public void goldenTime(Player player) {
		percent = 18;
		percentDia = 33;
		percentArmor = 42;
		percentArrow = 6000;
		percentArrowKami = 70;
		new ProgressBar().bar2setStat(true);
		for(Player p : Bukkit.getOnlinePlayers()) {
			p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + player.getDisplayName() + "님의 핫타임이 시작되었습니다. (강화 확률 증가)");
			new ProgressBar().bar2AddPlayer(p);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 2.0f, 1.1f);
		}
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			ThreadReinHotTime th = new ThreadReinHotTime(player.getUniqueId());

			@Override
			public void run() {
				
				if (!th.hasID()) {
					th.setID(taskID);
				}
				
				if (time % 1200 == 0) {
					new ProgressBar().bar2ChangeTime(10 - time/1200);
				}
				
				if (time >= 12000) {
					percent = 30;
					percentDia = 50;
					percentArmor = 50;
					percentArrow = 10000;
					percentArrowKami = 100;
					new ProgressBar().bar2setStat(false);
					for(Player p : Bukkit.getOnlinePlayers()) {
						p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + player.getDisplayName() + "님의 핫타임이 종료되었습니다. (강화 확률 증가)");
					}
					new ProgressBar().bar2RemovePlayer();
					th.endTask();
					th.removeID();
				}
				
				time++;

			}

		}, 0, 1);
	}
	
}
