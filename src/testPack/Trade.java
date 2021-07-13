package testPack;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class Trade {

	public boolean clickTradeInv(Player player, Inventory inv, int slot, ItemStack item) {
		try {
			if(inv.getSize() == 45) {
				if(inv.getItem(17).getType() == Material.RED_CONCRETE || inv.getItem(17).getType() == Material.GREEN_CONCRETE) { 
					if(inv.getItem(18).getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
						if(inv.getItem(19).getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
							if(inv.getItem(20).getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
								HashMap<Player, Player> map = new Cmd21Trade().getMap();
								
								try {
									if(map.containsKey(player)) {
										if(slot >= 0 && slot < 17) {
											inv.clear(slot);
											player.getInventory().addItem(item);
											player.playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
											map.get(player).playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
											
											// 거래 완료 -> 거래 수락
											try {
												inv.getItem(17).setType(Material.RED_CONCRETE);
											} catch(Exception e) {
												
											}
											try {
												inv.getItem(44).setType(Material.RED_CONCRETE);
											} catch(Exception e) {
												
											}
											
											player.updateInventory();
											map.get(player).updateInventory();
										}
									} else {
										if(map.containsValue(player)) {
											if(slot >= 27 && slot < 44) {
												inv.clear(slot);
												player.getInventory().addItem(item);
												player.playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
												for(Player p : map.keySet()) {
													if(map.get(p) == player) {
														p.playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
													}
												}
												
												// 거래 완료 -> 거래 수락
												try {
													inv.getItem(17).setType(Material.RED_CONCRETE);
												} catch(Exception e) {
													
												}
												try {
													inv.getItem(44).setType(Material.RED_CONCRETE);
												} catch(Exception e) {
													
												}
												
												player.updateInventory();
												for(Player p : map.keySet()) {
													if(map.get(p) == player) {
														p.updateInventory();
														break;
													}
												}
											}
										}
									}
								} catch(Exception e1) {
									
								}
								
								try {
									if(map.containsKey(player)) {
										if(slot == 17 && item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거래 수락") && item.getType() == Material.RED_CONCRETE) {
											item.setType(Material.GREEN_CONCRETE);
											player.playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
											map.get(player).playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
											player.updateInventory();
											map.get(player).updateInventory();
										}
									}
									if(map.containsValue(player)) {
										if(slot == 44 && item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거래 수락") && item.getType() == Material.RED_CONCRETE) {
											item.setType(Material.GREEN_CONCRETE);
											player.playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
											for(Player p : map.keySet()) {
												if(map.get(p) == player) {
													p.playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
													p.updateInventory();
													break;
												}
											}
											player.updateInventory();
										}
									}
									
									if(map.containsKey(player)) {
										if(slot == 17 && item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거래 수락") && item.getType() == Material.GREEN_CONCRETE) {
											if(inv.getItem(44).getType() == Material.GREEN_CONCRETE) {
												// 거래 완료
												Player player2 = map.get(player);
												
												if(true) {
													int i = 0;
													Inventory p2Inv = player2.getInventory();
													for (int j = 0 ; j < 36 ; j++) {
														if(p2Inv.getItem(j) == null) {
															i++;
														}
													}
													
													int k = 17;
													for (int l = 0 ; l < 17 ; l++) {
														if(inv.getItem(l) == null) {
															k--;
														}
													}
													
													if(i >= k) {
														for(int cnt = 0 ; cnt < 17 ; cnt++) {
															if(inv.getItem(cnt) != null) {
																p2Inv.addItem(inv.getItem(cnt));
															}
															inv.setItem(cnt, inv.getItem(18));
														}
													} else {
														player.sendMessage("인벤토리의 빈자리가 부족합니다.");
														return true;
													}
												}
												
												if(true) {
													int i = 0;
													Inventory pInv = player.getInventory();
													for (int j = 0 ; j < 36 ; j++) {
														if(pInv.getItem(j) == null) {
															i++;
														}
													}
													
													int k = 17;
													for (int l = 27 ; l < 44 ; l++) {
														if(inv.getItem(l) == null) {
															k--;
														}
													}
													
													if(i >= k) {
														for(int cnt = 27 ; cnt < 44 ; cnt++) {
															if(inv.getItem(cnt) != null) {
																pInv.addItem(inv.getItem(cnt));
															}
															inv.setItem(cnt, inv.getItem(18));
														}
													} else {
														player.sendMessage("인벤토리의 빈자리가 부족합니다.");
														return true;
													}
												}
												
												Player p = map.get(player);
												player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
												p.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
												player.updateInventory();
												p.updateInventory();
												player.closeInventory();
												
												new BukkitRunnable() {
													@Override
													public void run() {
														p.closeInventory();
														this.cancel();
													}
												}.runTaskLater(Main.getPlugin(Main.class), 1);
												
												map.remove(player);
											}
										}
									}
									if(map.containsValue(player)) {
										if(slot == 44 && item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거래 수락") && item.getType() == Material.GREEN_CONCRETE) {
											if(inv.getItem(17).getType() == Material.GREEN_CONCRETE) {
												// 거래 완료
												Player player2 = null;
												for(Player p : map.keySet()) {
													if(map.get(p) == player) {
														player2 = p;
														break;
													}
												}
												
												if(player2 != null) {
													int i = 0;
													Inventory p2Inv = player2.getInventory();
													for (int j = 0 ; j < 36 ; j++) {
														if(p2Inv.getItem(j) == null) {
															i++;
														}
													}
													
													int k = 17;
													for (int l = 27 ; l < 44 ; l++) {
														if(inv.getItem(l) == null) {
															k--;
														}
													}
													
													if(i >= k) {
														for(int cnt = 27 ; cnt < 44 ; cnt++) {
															if(inv.getItem(cnt) != null) {
																p2Inv.addItem(inv.getItem(cnt));
															}
															inv.setItem(cnt, inv.getItem(18));
														}
													} else {
														player.sendMessage("인벤토리의 빈자리가 부족합니다.");
														return true;
													}
												}
												
												if(player2 != null) {
													int i = 0;
													Inventory pInv = player.getInventory();
													for (int j = 0 ; j < 36 ; j++) {
														if(pInv.getItem(j) == null) {
															i++;
														}
													}
													
													int k = 17;
													for (int l = 0 ; l < 17 ; l++) {
														if(inv.getItem(l) == null) {
															k--;
														}
													}
													
													if(i >= k) {
														for(int cnt = 0 ; cnt < 17 ; cnt++) {
															if(inv.getItem(cnt) != null) {
																pInv.addItem(inv.getItem(cnt));
															}
															inv.setItem(cnt, inv.getItem(18));
														}
													} else {
														player.sendMessage("인벤토리의 빈자리가 부족합니다.");
														return true;
													}
												}
												
												player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
												for(Player p : map.keySet()) {
													if(map.get(p) == player) {
														p.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
														p.updateInventory();
														new BukkitRunnable() {
															@Override
															public void run() {
																p.closeInventory();
																this.cancel();
															}
														}.runTaskLater(Main.getPlugin(Main.class), 1);
														map.remove(p);
														break;
													}
												}
												player.updateInventory();
												player.closeInventory();
											}
										}
									}
								} catch(Exception e1) {
									
								}
								return true;
							}
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return false;
	}
	
	public boolean clickPlayerInv(Player player, Inventory inv, Inventory pInv, int slot, ItemStack item) {
		ArrayList<Integer> ary = new ArrayList<>();
		
		try {
			if(inv != pInv) {
				if(inv.getSize() == 45) {
					if(inv.getItem(17).getType() == Material.RED_CONCRETE || inv.getItem(17).getType() == Material.GREEN_CONCRETE) { 
						if(inv.getItem(18).getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
							if(inv.getItem(19).getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
								if(inv.getItem(20).getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
									
									if(item.getType() == Material.AIR || item.getType() == Material.GLOBE_BANNER_PATTERN || item.getType() == Material.MOSSY_COBBLESTONE_WALL
											|| item.getType() == Material.WOODEN_HOE || item.getType() == Material.STONE_HOE || item.getType() == Material.IRON_HOE
											|| item.getType() == Material.GOLDEN_HOE || item.getType() == Material.DIAMOND_HOE || item.getType() == Material.NETHERITE_HOE
											|| item.getType() == Material.WOODEN_PICKAXE || item.getType() == Material.STONE_PICKAXE || item.getType() == Material.IRON_PICKAXE
											|| item.getType() == Material.GOLDEN_PICKAXE || item.getType() == Material.DIAMOND_PICKAXE || item.getType() == Material.NETHERITE_PICKAXE
											|| item.getType() == Material.WOODEN_SHOVEL || item.getType() == Material.STONE_SHOVEL || item.getType() == Material.IRON_SHOVEL
											|| item.getType() == Material.GOLDEN_SHOVEL || item.getType() == Material.DIAMOND_SHOVEL || item.getType() == Material.NETHERITE_SHOVEL
											|| item.getType() == Material.NETHER_STAR || item.getType() == Material.POLISHED_GRANITE_STAIRS || item.getType() == Material.SMOOTH_RED_SANDSTONE_STAIRS
											|| item.getType() == Material.MOSSY_STONE_BRICK_STAIRS || item.getType() == Material.POLISHED_DIORITE_STAIRS || item.getType() == Material.MOSSY_COBBLESTONE_STAIRS
											|| item.getType() == Material.END_STONE_BRICK_STAIRS || item.getType() == Material.SMOOTH_SANDSTONE_STAIRS || item.getType() == Material.SMOOTH_QUARTZ_STAIRS
											|| item.getType() == Material.GRANITE_STAIRS || item.getType() == Material.SADDLE || item.getType() == Material.DEAD_BRAIN_CORAL_BLOCK
											|| item.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK || item.getType() == Material.DEAD_FIRE_CORAL_BLOCK || item.getType() == Material.DEAD_HORN_CORAL_BLOCK
											|| item.getType() == Material.DEAD_TUBE_CORAL_BLOCK || item.getType() == Material.BRAIN_CORAL_BLOCK || item.getType() == Material.HORN_CORAL_BLOCK
											|| item.getType() == Material.TUBE_CORAL_BLOCK || item.getType() == Material.BUBBLE_CORAL_BLOCK || item.getType() == Material.FIRE_CORAL_BLOCK
											|| item.getType() == Material.ENDER_EYE || item.getType() == Material.HEART_OF_THE_SEA 
											
											|| item.getType() == Material.RED_DYE || item.getType() == Material.GREEN_DYE || item.getType() == Material.LAPIS_LAZULI
											|| item.getType() == Material.CYAN_DYE || item.getType() == Material.LIGHT_GRAY_DYE || item.getType() == Material.GRAY_DYE
											|| item.getType() == Material.PINK_DYE || item.getType() == Material.LIME_DYE || item.getType() == Material.YELLOW_DYE
											|| item.getType() == Material.LIGHT_BLUE_DYE || item.getType() == Material.MAGENTA_DYE || item.getType() == Material.ORANGE_DYE
											|| item.getType() == Material.BLUE_DYE || item.getType() == Material.BROWN_DYE || item.getType() == Material.BLACK_DYE
											|| item.getType() == Material.INK_SAC || item.getType() == Material.CLAY_BALL || item.getType() == Material.GLOWSTONE_DUST) {
										return true;
									} else {
										
										boolean rein = true;
										try {
											for(String str : item.getItemMeta().getLore()) {
												try {
													if(str.substring(0, 5).equals("§8내구도")) {
														rein = false;
													}
												} catch(Exception e1) {
													
												}
											}
										} catch(Exception e) {
											
										}
										
										if(!rein) {
											return true;
										}
										
										HashMap<Player, Player> map = new Cmd21Trade().getMap();
										if(map.containsKey(player)) {
											int idx = 0;
											for(ItemStack i : inv.getContents()) {
												if(i == null) {
													ary.add(idx);
												}
												idx++;
											}
											
											if(ary.size() == 0) {
												// 거래창 꽉참
												return true;
											} else {
												for(int cnt : ary) {
													if(cnt >= 0 && cnt < 17) {
														if(item != null) {
															pInv.clear(slot);
															
															// 거래창에 올려둠
															inv.setItem(cnt, item);
															
															player.playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
															map.get(player).playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
															
															// 거래 완료 -> 거래 수락
															try {
																inv.getItem(17).setType(Material.RED_CONCRETE);
															} catch(Exception e) {
																
															}
															try {
																inv.getItem(44).setType(Material.RED_CONCRETE);
															} catch(Exception e) {
																
															}

															player.updateInventory();
															map.get(player).updateInventory();
															break;
														}
													}
												}
											}
										} else {
											if(map.containsValue(player)) {
												int idx = 0;
												for(ItemStack i : inv.getContents()) {
													if(i == null) {
														ary.add(idx);
													}
													idx++;
												}
												
												if(ary.size() == 0) {
													// 거래창 꽉참
													return true;
												} else {
													for(int cnt : ary) {
														if(cnt >= 27 && cnt < 44) {
															if(item != null) {
																pInv.clear(slot);
																
																// 거래창에 올려둠
																inv.setItem(cnt, item);
																
																player.playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
																for(Player p : map.keySet()) {
																	if(map.get(p) == player) {
																		p.playSound(player.getLocation(), Sound.BLOCK_IRON_TRAPDOOR_OPEN, 3.0f, 0.5f);
																	}
																}
																
																// 거래 완료 -> 거래 수락
																try {
																	inv.getItem(17).setType(Material.RED_CONCRETE);
																} catch(Exception e) {
																	
																}
																try {
																	inv.getItem(44).setType(Material.RED_CONCRETE);
																} catch(Exception e) {
																	
																}
																
																player.updateInventory();
																for(Player p : map.keySet()) {
																	if(map.get(p) == player) {
																		p.updateInventory();
																	}
																}
																break;
															}
														}
													}
												}
											}
										}
									}
									return true;
								}
							}
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return false;
	}
	
	public void closeTradeInv(Player player, Inventory inv) {
		if(inv.getSize() == 45) {
			if(inv.getItem(17).getType() == Material.RED_CONCRETE || inv.getItem(17).getType() == Material.GREEN_CONCRETE) { 
				if(inv.getItem(18).getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
					if(inv.getItem(19).getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
						if(inv.getItem(20).getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
							HashMap<Player, Player> map = new Cmd21Trade().getMap();
							
							try {
								if(map.containsKey(player)) {
									Inventory pInv = player.getInventory();
									for(int cnt = 0 ; cnt < 17 ; cnt++) {
										if(inv.getItem(cnt) != null && inv.getItem(cnt).getType() != Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
											pInv.addItem(inv.getItem(cnt));
											inv.remove(inv.getItem(cnt));
										}
									}
									
									for (int l = 0 ; l < 17 ; l++) {
										inv.setItem(l, inv.getItem(20));
									}
									
									player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.8f, 2.0f);
									map.get(player).playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.8f, 2.0f);
									player.updateInventory();
									map.get(player).updateInventory();

									map.remove(player);
								} else {
									if(map.containsValue(player)) {
										Inventory pInv = player.getInventory();
										for(int cnt = 27 ; cnt < 44 ; cnt++) {
											if(inv.getItem(cnt) != null && inv.getItem(cnt).getType() != Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
												pInv.addItem(inv.getItem(cnt));
											}
										}
										
										for (int l = 27 ; l < 44 ; l++) {
											inv.setItem(l, inv.getItem(20));
										}
										
										player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.8f, 2.0f);
										for(Player p : map.keySet()) {
											if(map.get(p) == player) {
												p.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.8f, 2.0f);
												p.updateInventory();
												map.remove(p);
												break;
											}
										}
										player.updateInventory();
										
									} else {
										// 한쪽이 끊은 경우
										Inventory pInv = player.getInventory();
										for(int cnt = 27 ; cnt < 44 ; cnt++) {
											if(inv.getItem(cnt) != null && inv.getItem(cnt).getType() != Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
												pInv.addItem(inv.getItem(cnt));
												inv.remove(inv.getItem(cnt));
											}
										}
										for(int cnt = 0 ; cnt < 17 ; cnt++) {
											if(inv.getItem(cnt) != null && inv.getItem(cnt).getType() != Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
												pInv.addItem(inv.getItem(cnt));
												inv.remove(inv.getItem(cnt));
											}
										}
										
										player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.8f, 2.0f);
										map.get(player).playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.8f, 2.0f);
									}
								}
							} catch(Exception e1) {
								
							}
							
						}
					}
				}
			}
		}
	}

}
