package testPack;

import java.util.Map;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Reinforcement {
	
	Random rnd = new Random();
	private final int percent = 30; //30  18
	private final int percentDia = 50; //50  33
	private final int percentArmor = 50; //50  28
	private final int percentArrow = 10000; //10000  6000
	private final int percentArrowKami = 100; //100  70

	public ItemMeta coalReinWeapon(Player player, ItemMeta item, ItemMeta itemResource) {
		
		String[] ary = item.getLocalizedName().split(",");
		
		//석탄 1
		if(itemResource.getDisplayName().equals(ChatColor.GRAY + "흠집이 생긴 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+1 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 1만큼 상승하였습니다.");
				} 
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 1 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 1 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 1);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 2);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 9);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		} 
		//석탄 2
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+2 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 2만큼 상승하였습니다.");
				} 		
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 1);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 2);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 9);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 1만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//석탄 3
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "깨끗한 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+4 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 4만큼 상승하였습니다.");
				} 		
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 3만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}
		//석탄 4
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+7 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 7만큼 상승하였습니다.");
				} 			
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 4만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 4만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 4만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}
		//석탄 5
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "절대적인 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+10 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 10만큼 상승하였습니다.");
				} 		
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 6만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 6만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 6만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//석탄 6
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 석탄")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[1]);
				if(lvl==100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if(lvl+40 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 40만큼 상승하였습니다.");
				} 		
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[1]);
					if(lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 10만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f); 						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[2]);
					if(lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 10만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);    						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[9]);
					if(lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 10만큼 감소하였습니다.");                        							
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);       						                   					
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}
		return item;
	}
	
	public ItemMeta ironReinWeapon(Player player, ItemMeta item, ItemMeta itemResource) {
		
		String[] ary = item.getLocalizedName().split(",");
		
		//철 1
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "상태가 좋지 않은 철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=15) {
				int num2 = rnd.nextInt(2);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 0);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 1만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result = makeEnch(ary, Integer.toString(lvl-1), 9);
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 1만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		} 
		//철 2
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//철 3
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "빛이나는 철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=15) {
				int num2 = rnd.nextInt(2);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//철 4
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "순백의 철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=15) {
				int num2 = rnd.nextInt(2);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}                      			
		//철 5
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 철")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=15) {
				int num2 = rnd.nextInt(2);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}
		return item;
	}
	
	public ItemMeta goldReinWeapon(Player player, ItemMeta item, ItemMeta itemResource) {
		
		String[] ary = item.getLocalizedName().split(",");
		
		//금 1
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "가치가 떨어진 금")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(거대 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(거대 객체)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//금 2
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "금")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(거대 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(거대 객체)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//금 3
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "쉽게 녹지 않는 금")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(거대 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(거대 객체)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}   			
		//금 4
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 금")) {
			int num = rnd.nextInt(percent);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(거대 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(거대 객체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=20) {
				int num2 = rnd.nextInt(3);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}
		return item;
	}
	
	public ItemMeta diaReinWeapon(Player player, ItemMeta item, ItemMeta itemResource) {
		
		String[] ary = item.getLocalizedName().split(",");
		
		//다야 1
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(거대 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(거대 객체)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<30) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 4만큼 상승하였습니다.");
				}
			} else if(num<=35) {
				int num2 = rnd.nextInt(6);
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
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-3 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-3), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
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
						player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 5) {
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//다야 2
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "다이아몬드")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(거대 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(거대 객체)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<30) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=35) {
				int num2 = rnd.nextInt(6);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 5) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//다야 3
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "빛나는 다이아몬드")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(거대 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(거대 객체)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<30) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=35) {
				int num2 = rnd.nextInt(6);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 5) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}   			
		//다야 4
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(거대 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(거대 객체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<30) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=35) {
				int num2 = rnd.nextInt(6);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 5) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}
		//다야 5
		if (itemResource.getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "The Item from God")) {
			int num = rnd.nextInt(percentDia);
			if(num<5) {
				int lvl = Integer.parseInt(ary[0]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 100000) {
					String result = makeEnch(ary, "100000", 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(모든 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 0);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(모든 객체)의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[1]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 100000) {
					String result = makeEnch(ary, "100000", 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(인간형)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 1);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(인간형)의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[2]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 100000) {
					String result = makeEnch(ary, "100000", 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(벌레)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 2);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(벌레)의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[3]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 100000) {
					String result = makeEnch(ary, "100000", 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 추가 데미지(거대 객체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 3);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "추가 데미지(거대 객체)의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[4]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "스플레시의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 100000) {
					String result = makeEnch(ary, "100000", 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 스플레시의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 4);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "스플레시의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<30) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=35) {
				int num2 = rnd.nextInt(6);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[0]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 0);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 0);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(모든 객체)의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[1]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 1);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 1);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(인간형)의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[2]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 2);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 2);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(벌레)의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[3]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 3);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 3);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "추가 데미지(거대 객체)의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[4]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 4);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 4);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "스플레시의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 5) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}
		return item;
	}

	public ItemMeta coalReinArmor(Player player, ItemMeta item, ItemMeta itemResource) {
		
		String[] ary = item.getLocalizedName().split(",");
		
		//석탄 1
		if(itemResource.getDisplayName().equals(ChatColor.GRAY + "흠집이 생긴 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 1 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 1 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 1 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 1 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 1 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 1만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 1만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		} 
		//석탄 2
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 1만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//석탄 3
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "깨끗한 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//석탄 4
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "순수도가 높은 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//석탄 5
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "절대적인 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//석탄 6
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 석탄")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		} 
		return item;
	}
	
	public ItemMeta ironReinArmor(Player player, ItemMeta item, ItemMeta itemResource) {
		
		String[] ary = item.getLocalizedName().split(",");
		
		//철 1
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "상태가 좋지 않은 철")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 2 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+2), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 2만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 1만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		} 
		//철 2
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "철")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//철 3
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "빛이나는 철")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//철 4
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "순백의 철")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}                      			
		//철 5
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 철")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		} 
		return item;
	}
	
	public ItemMeta goldReinArmor(Player player, ItemMeta item, ItemMeta itemResource) {
		
		String[] ary = item.getLocalizedName().split(",");
		
		//금 1
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "가치가 떨어진 금")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//금 2
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "금")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//금 3
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "쉽게 녹지 않는 금")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}   			
		//금 4
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 금")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		} 
		return item;
	}
	
	public ItemMeta diaReinArmor(Player player, ItemMeta item, ItemMeta itemResource) {
		
		String[] ary = item.getLocalizedName().split(",");
		
		//다야 1
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 4 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+4), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 4만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
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
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 3만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//다야 2
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "다이아몬드")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 7 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+7), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 7만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-4 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-4), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 4만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}  
		//다야 3
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "빛나는 다이아몬드")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 10 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+10), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 10만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-6 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-6), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 6만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}
		//다야 4
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 다이아몬드")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 40 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+40), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 40만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-10 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-10), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 10만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
			}
		}
		//다야 5
		if (itemResource.getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "The Item from God")) {
			int num = rnd.nextInt(percentArmor);
			if(num<5) {
				int lvl = Integer.parseInt(ary[5]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 30000) {
					String result = makeEnch(ary, "30000", 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(모든 데미지)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 5);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(모든 데미지)의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<10) {
				int lvl = Integer.parseInt(ary[6]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 30000) {
					String result = makeEnch(ary, "30000", 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(화염)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 6);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(화염)의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<15) {
				int lvl = Integer.parseInt(ary[7]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 30000) {
					String result = makeEnch(ary, "30000", 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(폭발)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 7);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(폭발)의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<20) {
				int lvl = Integer.parseInt(ary[8]);
				if (lvl == 30000) {
					player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 30000) {
					String result = makeEnch(ary, "30000", 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 보호(발사체)의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 8);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "보호(발사체)의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<25) {
				int lvl = Integer.parseInt(ary[9]);
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "반격의 강화는 이미 한계입니다.");
				} else if (lvl + 1000 >= 100000) {
					String result = makeEnch(ary, "100000", 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "축하합니다. 반격의 강화 수치가 한계에 도달했습니다.");
				} else {
					String result = makeEnch(ary, Integer.toString(lvl+1000), 9);
					item.setLocalizedName(result);
					player.sendMessage(ChatColor.GREEN + "반격의 강화 수치가 1000만큼 상승하였습니다.");
				}
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
			} else if(num<=30) {
				int num2 = rnd.nextInt(5);
				if(num2 == 0) {
					int lvl = Integer.parseInt(ary[5]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 5);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 5);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(모든 데미지)의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 1) {
					int lvl = Integer.parseInt(ary[6]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 6);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 6);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(화염)의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 2) {
					int lvl = Integer.parseInt(ary[7]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 7);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 7);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(폭발)의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 3) {
					int lvl = Integer.parseInt(ary[8]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 8);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 8);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "보호(발사체)의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				} else if(num2 == 4) {
					int lvl = Integer.parseInt(ary[9]);
					if (lvl != 0) {
						String result;
						if(lvl-100 < 0) {
							result = makeEnch(ary, "0", 9);
						} else {
							result = makeEnch(ary, Integer.toString(lvl-100), 9);
						}
						item.setLocalizedName(result);
						player.sendMessage(ChatColor.WHITE + "강화에 대실패하였습니다.");
						player.sendMessage(ChatColor.WHITE + "반격의 강화 수치가 100만큼 감소하였습니다.");
						player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					} else {
						player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
    					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
					}
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 2.0f);
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
		return data;
	}
	
	public ItemMeta bowRein1(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 1
		if(itemResource.getDisplayName().equals(ChatColor.GRAY + "깨질 듯한 석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<5000) {
				item.setLocalizedName("1");				
				player.sendMessage(ChatColor.GREEN + "첫번째 개방에 성공하였습니다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}			
		} 		
		return item;
	}
	
	public ItemMeta bowRein2(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 2
		if(itemResource.getDisplayName().equals(ChatColor.WHITE + "석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<3333) {
				item.setLocalizedName("5");				
				player.sendMessage(ChatColor.GREEN + "두번째 개방에 성공하였습니다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}  
		return item;
	}
	
	public ItemMeta bowRein3(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 3
		if(itemResource.getDisplayName().equals(ChatColor.YELLOW + "반듯한 석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<1000) {
				item.setLocalizedName("20");
				player.sendMessage(ChatColor.GREEN + "세번째 개방에 성공하였습니다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}  
		return item;
	}
	
	public ItemMeta bowRein4(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 4
		if(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "매혹적인 석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<100) {
				item.setLocalizedName("100");
				player.sendMessage(ChatColor.GREEN + "네번째 개방에 성공하였습니다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}  
		return item;
	}
	
	public ItemMeta bowRein5(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 5
		if(itemResource.getDisplayName().equals(ChatColor.AQUA + "보석같은 석영")) {
			int num = rnd.nextInt(percentArrow);
			if(num<30) {
				item.setLocalizedName("300");
				player.sendMessage(ChatColor.GREEN + "다섯번째 개방에 성공하였습니다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "강화에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		}  
		return item;
	}
	
	public ItemMeta bowRein6(Player player, ItemMeta item, ItemMeta itemResource) {
		//석영 6
		if(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 석영")) {
			int num = rnd.nextInt(percentArrowKami);
			if(num<10) {
				int lvl = Integer.parseInt(item.getLocalizedName());
				if (lvl == 100000) {
					player.sendMessage(ChatColor.WHITE + "이 무기의 개방은 이미 한계입니다.");
				} else if (lvl + 100 >= 100000) {
					item.setLocalizedName("100000");
					player.sendMessage(ChatColor.GREEN + "축하합니다. 개방이 한계에 도달했습니다.");
				} else if (lvl >= 300) {
					item.setLocalizedName(Integer.toString(lvl+100));
					player.sendMessage(ChatColor.GREEN + "개방에 성공 하였습니다.");
				} 
			} else if(num<13) {
				int lvl = Integer.parseInt(item.getLocalizedName());
				if (lvl > 400) {
					item.setLocalizedName(Integer.toString(lvl-100));
					player.sendMessage(ChatColor.WHITE + "개방에 대실패하였습니다.");
					player.sendMessage(ChatColor.WHITE + "개방 수치가 하락하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "개방에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
				}
			} else {
				player.sendMessage(ChatColor.WHITE + "개방에 실패하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			}
		} 
		return item;
	}
	
}
