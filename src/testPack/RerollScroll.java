package testPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RerollScroll {

	public void openInv(Player player, Item itemArg) {
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "스탯 재분배 스크롤")) {
			
			ItemStack item = player.getInventory().getItemInMainHand();
			
			if(item.getType()!=Material.AIR) {
				if(item.getType()==Material.WOODEN_SWORD || item.getType()==Material.STONE_SWORD || item.getType()==Material.IRON_SWORD || item.getType()==Material.GOLDEN_SWORD ||
            			item.getType()==Material.DIAMOND_SWORD || item.getType()==Material.LEATHER_HELMET || item.getType()==Material.LEATHER_CHESTPLATE ||
            			item.getType()==Material.LEATHER_LEGGINGS || item.getType()==Material.LEATHER_BOOTS || item.getType()==Material.CHAINMAIL_HELMET ||
            			item.getType()==Material.CHAINMAIL_CHESTPLATE || item.getType()==Material.CHAINMAIL_LEGGINGS || item.getType()==Material.CHAINMAIL_BOOTS ||
            			item.getType()==Material.IRON_HELMET || item.getType()==Material.IRON_CHESTPLATE || item.getType()==Material.IRON_LEGGINGS ||
            			item.getType()==Material.IRON_BOOTS || item.getType()==Material.GOLDEN_HELMET || item.getType()==Material.GOLDEN_CHESTPLATE ||
            			item.getType()==Material.GOLDEN_LEGGINGS || item.getType()==Material.GOLDEN_BOOTS || item.getType()==Material.DIAMOND_HELMET ||
            			item.getType()==Material.DIAMOND_CHESTPLATE || item.getType()==Material.DIAMOND_LEGGINGS || item.getType()==Material.DIAMOND_BOOTS ||
            			item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES ||
            			item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES ||
						item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET ||
						item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE ||
						item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS ||
						item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS ||
						item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG ||
						item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG ||
						item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE ||
						item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL ||
						item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL ||
						item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB ||
						item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB ||
						item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB ||
						item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB ||
						item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE ||
						item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE ||
						item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS ||
						item.getType()==Material.NETHERITE_HELMET || item.getType()==Material.NETHERITE_CHESTPLATE || item.getType()==Material.NETHERITE_LEGGINGS || 
						item.getType()==Material.NETHERITE_BOOTS) {
					
					if(!durability(item)) {
						player.sendMessage(ChatColor.RED + "내구도가 부족합니다.");
						return;
					} 
					
					itemArg.remove();
					
					if(item.getItemMeta().getLore()!=null) {
						ItemMeta im = item.getItemMeta();
						String[] ench = im.getLocalizedName().split(",");

						if(ench.length == 10) {
							ench = append(ench, "0");
						}
						int total = 0;
						total += Integer.parseInt(ench[0]);
						total += Integer.parseInt(ench[1]);
						total += Integer.parseInt(ench[2]);
						total += Integer.parseInt(ench[3]);
						total += Integer.parseInt(ench[4]);
						total += Integer.parseInt(ench[5]);
						total += Integer.parseInt(ench[6]);
						total += Integer.parseInt(ench[7]);
						total += Integer.parseInt(ench[8]);
						total += Integer.parseInt(ench[9]);

						int[] stat = {0,0,0,0,0,0,0,0,0,0,0};

						Random rnd = new Random();
						
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
						
						stat[10] = Integer.parseInt(ench[10]);
						
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
						
						im.setLocalizedName(localName);
						item.setItemMeta(im);

						if(item.getItemMeta().getLore()!=null) {
							ItemMeta newItemMeta = item.getItemMeta();
							String[] newEnch = newItemMeta.getLocalizedName().split(",");
							List<String> preList;
							preList = newItemMeta.getLore();
							int cnt = 0;
							for(int i = 0 ; i < preList.size() ; i++) {			
								if(preList.get(i).equals("=====인챈트=====")) {
									break;
								}
								cnt++;
							}
							List<String> list = new ArrayList<String>();
							for(int i = 0 ; i < cnt ; i++) {
								list.add(preList.get(i));
							}
							if(!(list.get(list.size()-1).equals(" "))) {
								list.add(" ");
							}
							list.add("=====인챈트=====");
							if(Integer.parseInt(newEnch[0]) != 0) {
								int lvl = Integer.parseInt(newEnch[0]);
								list.add(ChatColor.BLUE + "공격력: " + lvl);
							}
							if(Integer.parseInt(newEnch[1]) != 0) {
								int lvl = Integer.parseInt(newEnch[1]);
								list.add(ChatColor.BLUE + "추가 데미지(인간형): " + lvl);
							}
							if(Integer.parseInt(newEnch[2]) != 0) {
								int lvl = Integer.parseInt(newEnch[2]);
								list.add(ChatColor.BLUE + "추가 데미지(동물형): " + lvl);
							}
							if(Integer.parseInt(newEnch[3]) != 0) {
								int lvl = Integer.parseInt(newEnch[3]);
								list.add(ChatColor.BLUE + "추가 데미지(기타): " + lvl);
							}					
							if(Integer.parseInt(newEnch[4]) != 0) {
								int lvl = Integer.parseInt(newEnch[4]);
								list.add(ChatColor.BLUE + "스플레시: " + lvl);
							}
							if(Integer.parseInt(newEnch[5]) != 0) {
								int lvl = Integer.parseInt(newEnch[5]);
								list.add(ChatColor.BLUE + "방어력: " + lvl);
							}
							if(Integer.parseInt(newEnch[6]) != 0) {
								int lvl = Integer.parseInt(newEnch[6]);
								list.add(ChatColor.BLUE + "보호(화염): " + lvl);
							}
							if(Integer.parseInt(newEnch[7]) != 0) {
								int lvl = Integer.parseInt(newEnch[7]);
								list.add(ChatColor.BLUE + "보호(폭발): " + lvl);
							}
							if(Integer.parseInt(newEnch[8]) != 0) {
								int lvl = Integer.parseInt(newEnch[8]);
								list.add(ChatColor.BLUE + "보호(발사체): " + lvl);
							}
							if(Integer.parseInt(newEnch[9]) != 0) {
								int lvl = Integer.parseInt(newEnch[9]);
								list.add(ChatColor.BLUE + "반격: " + lvl);
							}
							newItemMeta.setLore(list);
							item.setItemMeta(newItemMeta);		
							
							try {
								System.out.println(player.getDisplayName() + "이/가 재분배를 통해" + newItemMeta.getDisplayName() + "(" + localName + ")" + ChatColor.WHITE + "을/를 획득하였다.");
							} catch(Exception e) {
								
							}
							
						} 
						
					}
				} else {
					player.sendMessage(ChatColor.RED + "효과가 적용되지 않는 아이템입니다.");
					return;
				}
			}
		}
	}
	
	public boolean durability(ItemStack is) {
		try {
			ItemMeta item = is.getItemMeta();
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
				if(dura < 1000) {
					return false;
				} else {
					dura -= 1000;
				}
				lores.set(lineNum, ChatColor.DARK_GRAY + "내구도: " + Integer.toString(dura) + "/3000");
				item.setLore(lores);
				is.setItemMeta(item);
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
					lores.add(lineNum, ChatColor.DARK_GRAY + "내구도: 2000/3000");
					item.setLore(lores);
					is.setItemMeta(item);
					return true;
				} else {
					lores.add(" ");
					lores.add(ChatColor.DARK_GRAY + "내구도: 2000/3000");
					item.setLore(lores);
					is.setItemMeta(item);
					return true;
				}
			}
		} catch(Exception e) {
			
		}
		return true;
	}
	
	static <T> T[] append(T[] arr, T element) {
	    final int N = arr.length;
	    arr = Arrays.copyOf(arr, N + 1);
	    arr[N] = element;
	    return arr;
	}
	
}
