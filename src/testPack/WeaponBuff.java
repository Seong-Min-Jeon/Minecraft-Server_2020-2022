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
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("��6Operator Sword")) {
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
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "���� ��")) {
					mob.remove();				
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "���� ��[���� �����]")) {
					mob.remove();				
				}
				if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "���ֹ��� ��+")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 0,true,false,false));				
				}
				
				//set
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getChestplate() != null) {
						if (player.getInventory().getLeggings() != null) {
							if (player.getInventory().getBoots() != null) {
								
								if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Ȳȥ�� ��� ��")) {
									if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Ȳȥ�� ��� ���")) {
										if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Ȳȥ�� ��� ����")) {
											if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Ȳȥ�� ��� ����")) {
												if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Ȳȥ�� ��� �Ź�")) {
													player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 3,true,false,false));
													player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 1,true,false,false));
													player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 300,true,false,false));
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
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "Ž���� ����")) {
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
				if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "�ƶ�ũ���� �Ź�")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1));
				}
				if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "Ŭ������")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 1));
				}
				if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "��������")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1,true,false,false));
				}
			}
		} catch(Exception e) {
			
		}
		
		//set
		if (player.getInventory().getHelmet() != null) {
			if (player.getInventory().getChestplate() != null) {
				if (player.getInventory().getLeggings() != null) {
					if (player.getInventory().getBoots() != null) {
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� ��ȣ�� ��� ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� ��ȣ�� ��� ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� ��ȣ�� ��� ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� ��ȣ�� ��� �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 600, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 600, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "����")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "û��")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��ȣ")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "����")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 4,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�̵����Ʈ ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�̵����Ʈ ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�̵����Ʈ ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�̵����Ʈ �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 20,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�ƴٸ��� ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�ƴٸ��� ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�ƴٸ��� ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�ƴٸ��� �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 2,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�糪 �� ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�糪 �� ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�糪 �� ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�糪 �� �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 300, 3,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ī�̸� ���� ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ī�̸� ���� ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ī�̸� ���� ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ī�̸� ���� �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 600, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ȥ�� �̸��� ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ȥ�� �̸��� ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ȥ�� �̸��� ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ȥ�� �̸��� �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 0,true,false,false));
										mob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ȥ�� ��ȭ�� ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ȥ�� ��ȭ�� ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ȥ�� ��ȭ�� ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ȥ�� ��ȭ�� �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "����� ������ ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "����� ������ ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "����� ������ ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "����� ������ �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 2,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 20,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�ϱ� ����� ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�ϱ� ����� ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�ϱ� ����� ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�ϱ� ����� �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 1,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 30,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Ȳȥ�� ��� ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Ȳȥ�� ��� ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Ȳȥ�� ��� ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Ȳȥ�� ��� �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 2,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 1,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ž�� �ʽ��� ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ž�� �ʽ��� ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ž�� �ʽ��� ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ž�� �ʽ��� �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 2,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 60,true,false,false));
										mob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ž�� ������ ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ž�� ������ ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ž�� ������ ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "ž�� ������ �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 3,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 80,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 0,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "������ ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "������ ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "������ ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "������ �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 140,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 2,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� -������")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� -���ޡ�")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� -���ϡ�")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� -������")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 5,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ÿ�� ������ ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ÿ�� ������ ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ÿ�� ������ ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ÿ�� ������ �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 300,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 3,true,false,false));
									}
								}
							}
						}
						
						if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ÿ�� ������ ���")) {
							if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ÿ�� ������ ����")) {
								if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ÿ�� ������ ����")) {
									if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��Ÿ�� ������ �Ź�")) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 200, 0,true,false,false));
										player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 3,true,false,false));
									}
								}
							}
						}
						
					}
				}
			}
		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("��4Weapon1")) {
//			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 1));
//		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("��4Weapon2")) {
//			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 600, 1));
//		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("��4Weapon3")) {
//			player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 600, 1));
//		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("��4Weapon4")) {
//			mob.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 9));
//		}
//		if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("��4Weapon5")) {
//			mob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1));
//		}
	}
	
	public void hitBuff(Player player) {
		if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "�ƶ�ũ���� �Ź�")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 1));
		}
	}
}
