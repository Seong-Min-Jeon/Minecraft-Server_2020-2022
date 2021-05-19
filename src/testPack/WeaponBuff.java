package testPack;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class WeaponBuff {

	public void attackBuff(Player player, LivingEntity mob) {
		//main
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§6Operator Sword")) {
					mob.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 9));
					mob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 9));
					player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 600, 9));
					player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 9));
					player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 600, 9));	
					player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 9));
					player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 9)); //input 1 please
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 9));
					player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 9)); //input 1 please
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 9));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 600, 9));
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "신의 검")) {
					mob.remove();				
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "신의 검[범위 축소형]")) {
					mob.remove();				
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "저주받은 검+")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 0,true,false,false));				
				}
				
				//set
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getChestplate() != null) {
						if (player.getInventory().getLeggings() != null) {
							if (player.getInventory().getBoots() != null) {
								
								if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "황혼의 용사 검")) {
									if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "황혼의 용사 헬멧")) {
										if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "황혼의 용사 갑옷")) {
											if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "황혼의 용사 각반")) {
												if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "황혼의 용사 신발")) {
													player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 2,true,false,false));
													player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 1,true,false,false));
													player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 400,true,false,false));
												}
											}
										}
									}
								}
								
								if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거미 여왕의 검")) {
									if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거미 여왕의 헬멧")) {
										if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거미 여왕의 갑옷")) {
											if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거미 여왕의 각반")) {
												if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거미 여왕의 신발")) {
													player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 3,true,false,false));
													player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 2,true,false,false));
													player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
													player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 1000,true,false,false));
												}
											}
										}
									}
								}
								
								if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "슬라임 망치")) {
									if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "슬라임 헬멧")) {
										if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "슬라임 갑옷")) {
											if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "슬라임 각반")) {
												if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "슬라임 신발")) {
													player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 8000,true,false,false));
													player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 5,true,false,false));
													player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
												}
											}
										}
									}
								}
								
							}
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		
		try {
			//helmet
			if (player.getInventory().getHelmet() != null) {
				
			}
		} catch(Exception e) {
			
		}
		
		try {
			//chestplate
			if (player.getInventory().getChestplate() != null) {					
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "탐욕의 갑옷")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 4));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 600, 140));
				}
			}
		} catch(Exception e) {
			
		}
		
		try {
			//leggings
			if (player.getInventory().getLeggings() != null) {
				
			}
		} catch(Exception e) {
			
		}
		
		try {
			//boots
			if (player.getInventory().getBoots() != null) {
				if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "아라크네의 신발")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1));
				}
				if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "클리어윙")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 1));
				}
				if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "무간뇌신")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1,true,false,false));
				}
			}
		} catch(Exception e) {
			
		}
		
		try {
			//left hand
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "미라클 반사")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 100000,true,false,false));
				}
			}
		} catch(Exception e) {
			
		}
		
		//set
		if (player.getInventory().getHelmet() != null) {
			if (player.getInventory().getChestplate() != null) {
				if (player.getInventory().getLeggings() != null) {
					if (player.getInventory().getBoots() != null) {
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "숲의 가호가 담긴 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "숲의 가호가 담긴 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "숲의 가호가 담긴 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "숲의 가호가 담긴 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 600, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "주작")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "청룡")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "백호")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "현무")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 15,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "미들시프트 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "미들시프트 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "미들시프트 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "미들시프트 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 100,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "아다마스 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "아다마스 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "아다마스 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "아다마스 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "루나 페어리 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "루나 페어리 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "루나 페어리 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "루나 페어리 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 50,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "카이만 전통 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "카이만 전통 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "카이만 전통 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "카이만 전통 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 0,true,false,false));
										mob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "잔혹한 동화의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "잔혹한 동화의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "잔혹한 동화의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "잔혹한 동화의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "우울한 절망의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "우울한 절망의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "우울한 절망의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "우울한 절망의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 150,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "하급 기사의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "하급 기사의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "하급 기사의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "하급 기사의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 50,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "황혼의 용사 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "황혼의 용사 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "황혼의 용사 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "황혼의 용사 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 2,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 초심자 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 초심자 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 초심자 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 초심자 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 2,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 100,true,false,false));
										mob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 도전자 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 도전자 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 도전자 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 도전자 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 3,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 200,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "에보니 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "에보니 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "에보니 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "에보니 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 150,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 2,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "법술 -「유」")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "법술 -「메」")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "법술 -「하」")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "법술 -「마」")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 3,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "불타는 여명의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "불타는 여명의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "불타는 여명의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "불타는 여명의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 400,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 3,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "불타는 의지의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "불타는 의지의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "불타는 의지의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "불타는 의지의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 3,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거미 여왕의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거미 여왕의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거미 여왕의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거미 여왕의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 4,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "F-Killer 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "F-Killer 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "F-Killer 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "F-Killer 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 3,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "끓어오르는 대지의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "끓어오르는 대지의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "끓어오르는 대지의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "끓어오르는 대지의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 3,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 3000,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "천옥개 염봉")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "천옥개 창룡")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "천옥개 노호")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "천옥개 진무")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 3,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 다크 리벨리온")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 스타브 베놈")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 오드아이즈")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 클리어윙")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 4,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 200,true,false,false));
									}
								}
							}
						}
						
						if (!player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 다크 리벨리온")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 스타브 베놈")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 오드아이즈")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 클리어윙")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 100000,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 다크 리벨리온")) {
							if (!player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 스타브 베놈")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 오드아이즈")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 클리어윙")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 100000,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 다크 리벨리온")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 스타브 베놈")) {
								if (!player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 오드아이즈")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 클리어윙")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 100000,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 다크 리벨리온")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 스타브 베놈")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 오드아이즈")) {
									if (!player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "패왕권룡 클리어윙")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 100000,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 조율자 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 조율자 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 조율자 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 조율자 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 4,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 5000,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 강탈자 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 강탈자 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 강탈자 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 강탈자 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 4000,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "에골디드 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "에골디드 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "에골디드 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "에골디드 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 10000,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "제사장의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "제사장의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "제사장의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "제사장의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 120, 100000,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 15000,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 4,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "슬라임 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "슬라임 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "슬라임 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "슬라임 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 5,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "푸른 소용돌이의 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "푸른 소용돌이의 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "푸른 소용돌이의 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "푸른 소용돌이의 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 35000,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 5,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "운명을 따르는 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "운명을 따르는 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "운명을 따르는 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "운명을 따르는 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 12000,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "운명을 바꾸는 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "운명을 바꾸는 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "운명을 바꾸는 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "운명을 바꾸는 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 5000,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 3,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 헬멧")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 갑옷")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 각반")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 신발")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 8000,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
									}
								}
							}
						}
						
					}
				}
			}
		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§4Weapon1")) {
//			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 1));
//		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§4Weapon2")) {
//			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 600, 1));
//		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§4Weapon3")) {
//			player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 600, 1));
//		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§4Weapon4")) {
//			mob.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 9));
//		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§4Weapon5")) {
//			mob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1));
//		}
	}
	
	public void hitBuff(Player player) {
		if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "아라크네의 신발")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1));
		}
	}
}
