package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpecialEffect {
	
	Random rnd = new Random();
	
	public int a1(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "은반지")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a2(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "무지개 반사")) {
				return thorns;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a3(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "무한 반사")) {
				return thorns * 2;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a4(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "미라클 반사")) {
				return thorns * 3;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a5(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "블랙홀 반사")) {
				return thorns * 4;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a6(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "우주 반사")) {
				return thorns * 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a7(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "인피니티")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a8(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "타락한 반지")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a9(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "푸른 기운의 반지")) {
				return 20;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a10(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "녹슨 반지")) {
				return 7;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a11(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "골든 임펙트")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a12(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "왕가의 반지")) {
				return 30;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public double a13(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "빛나는 금빛 반지")) {
				return 1.5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a14(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "양털 반지")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a15(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "마나의 인장")) {
				return 30;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a16(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "와우가 삼킨 반지")) {
				return 12;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a17(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "와우가 삼킨 반지")) {
				return 13;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a18(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "일꾼의 증표")) {
				return 30;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a19(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "일꾼의 증표")) {
				return -1000;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a20(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "얼음별")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a21(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "얼음별")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a22(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "얼음별")) {
				return 8;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a23(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "클러스터 유닛")) {
				return 1;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a24(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "스피디 유닛")) {
				return 1;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a25(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "Wither with Eraser")) {
				return 30;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a26(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "독괴룡의 용옥")) {
				return 30;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a27(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "진액의 코어")) {
				return 60;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}

	
	// 전투 경험치 증가
	public int a10010(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("10")) {
					total += 5;
				} else if(ary[5].equals("11")) {
					total += 10;
				} else if(ary[5].equals("12")) {
					total += 15;
				} else if(ary[5].equals("13")) {
					total += 20;
				} else if(ary[5].equals("14")) {
					total += 25;
				} else if(ary[5].equals("15")) {
					total += 30;
				} else if(ary[5].equals("16")) {
					total += 40;
				} else if(ary[5].equals("17")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("10")) {
					total += 5;
				} else if(ary[6].equals("11")) {
					total += 10;
				} else if(ary[6].equals("12")) {
					total += 15;
				} else if(ary[6].equals("13")) {
					total += 20;
				} else if(ary[6].equals("14")) {
					total += 25;
				} else if(ary[6].equals("15")) {
					total += 30;
				} else if(ary[6].equals("16")) {
					total += 40;
				} else if(ary[6].equals("17")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("10")) {
					total += 5;
				} else if(ary[7].equals("11")) {
					total += 10;
				} else if(ary[7].equals("12")) {
					total += 15;
				} else if(ary[7].equals("13")) {
					total += 20;
				} else if(ary[7].equals("14")) {
					total += 25;
				} else if(ary[7].equals("15")) {
					total += 30;
				} else if(ary[7].equals("16")) {
					total += 40;
				} else if(ary[7].equals("17")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("10")) {
					total += 5;
				} else if(ary[8].equals("11")) {
					total += 10;
				} else if(ary[8].equals("12")) {
					total += 15;
				} else if(ary[8].equals("13")) {
					total += 20;
				} else if(ary[8].equals("14")) {
					total += 25;
				} else if(ary[8].equals("15")) {
					total += 30;
				} else if(ary[8].equals("16")) {
					total += 40;
				} else if(ary[8].equals("17")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("10")) {
					total += 5;
				} else if(ary[9].equals("11")) {
					total += 10;
				} else if(ary[9].equals("12")) {
					total += 15;
				} else if(ary[9].equals("13")) {
					total += 20;
				} else if(ary[9].equals("14")) {
					total += 25;
				} else if(ary[9].equals("15")) {
					total += 30;
				} else if(ary[9].equals("16")) {
					total += 40;
				} else if(ary[9].equals("17")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}
	
	// 회피 확률 증가
	public int a10020(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("20")) {
					total += 5;
				} else if(ary[5].equals("21")) {
					total += 10;
				} else if(ary[5].equals("22")) {
					total += 15;
				} else if(ary[5].equals("23")) {
					total += 20;
				} else if(ary[5].equals("24")) {
					total += 25;
				} else if(ary[5].equals("25")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("20")) {
					total += 5;
				} else if(ary[6].equals("21")) {
					total += 10;
				} else if(ary[6].equals("22")) {
					total += 15;
				} else if(ary[6].equals("23")) {
					total += 20;
				} else if(ary[6].equals("24")) {
					total += 25;
				} else if(ary[6].equals("25")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("20")) {
					total += 5;
				} else if(ary[7].equals("21")) {
					total += 10;
				} else if(ary[7].equals("22")) {
					total += 15;
				} else if(ary[7].equals("23")) {
					total += 20;
				} else if(ary[7].equals("24")) {
					total += 25;
				} else if(ary[7].equals("25")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("20")) {
					total += 5;
				} else if(ary[8].equals("21")) {
					total += 10;
				} else if(ary[8].equals("22")) {
					total += 15;
				} else if(ary[8].equals("23")) {
					total += 20;
				} else if(ary[8].equals("24")) {
					total += 25;
				} else if(ary[8].equals("25")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("20")) {
					total += 5;
				} else if(ary[9].equals("21")) {
					total += 10;
				} else if(ary[9].equals("22")) {
					total += 15;
				} else if(ary[9].equals("23")) {
					total += 20;
				} else if(ary[9].equals("24")) {
					total += 25;
				} else if(ary[9].equals("25")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}
	
	// 반격 데미지
	public int a10030(Player player, int thorns) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int max = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("30")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[5].equals("31")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[5].equals("32")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[5].equals("33")) {
					if(max <= 4) {
						max = 4;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("30")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[6].equals("31")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[6].equals("32")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[6].equals("33")) {
					if(max <= 4) {
						max = 4;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("30")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[7].equals("31")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[7].equals("32")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[7].equals("33")) {
					if(max <= 4) {
						max = 4;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("30")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[8].equals("31")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[8].equals("32")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[8].equals("33")) {
					if(max <= 4) {
						max = 4;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("30")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[9].equals("31")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[9].equals("32")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[9].equals("33")) {
					if(max <= 4) {
						max = 4;
					}
				}
			} catch(Exception e) {
				
			}
			if(max == 1) {
				return thorns;
			} else if(max == 2) {
				return thorns * 2;
			} else if(max == 3) {
				return thorns * 3;
			} else if(max == 4) {
				return thorns * 4;
			}
			return 0;
		}
		return 0;
	}
	
	// 흡혈
	public double a10040(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("40")) {
					total += 0.5;
				} else if(ary[5].equals("41")) {
					total += 1;
				} else if(ary[5].equals("42")) {
					total += 1.5;
				} else if(ary[5].equals("43")) {
					total += 2;
				} else if(ary[5].equals("44")) {
					total += 2.5;
				} else if(ary[5].equals("45")) {
					total += 3;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("40")) {
					total += 0.5;
				} else if(ary[6].equals("41")) {
					total += 1;
				} else if(ary[6].equals("42")) {
					total += 1.5;
				} else if(ary[6].equals("43")) {
					total += 2;
				} else if(ary[6].equals("44")) {
					total += 2.5;
				} else if(ary[6].equals("45")) {
					total += 3;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("40")) {
					total += 0.5;
				} else if(ary[7].equals("41")) {
					total += 1;
				} else if(ary[7].equals("42")) {
					total += 1.5;
				} else if(ary[7].equals("43")) {
					total += 2;
				} else if(ary[7].equals("44")) {
					total += 2.5;
				} else if(ary[7].equals("45")) {
					total += 3;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("40")) {
					total += 0.5;
				} else if(ary[8].equals("41")) {
					total += 1;
				} else if(ary[8].equals("42")) {
					total += 1.5;
				} else if(ary[8].equals("43")) {
					total += 2;
				} else if(ary[8].equals("44")) {
					total += 2.5;
				} else if(ary[8].equals("45")) {
					total += 3;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("40")) {
					total += 0.5;
				} else if(ary[9].equals("41")) {
					total += 1;
				} else if(ary[9].equals("42")) {
					total += 1.5;
				} else if(ary[9].equals("43")) {
					total += 2;
				} else if(ary[9].equals("44")) {
					total += 2.5;
				} else if(ary[9].equals("45")) {
					total += 3;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}
	
	// 근접 공격 시 n% 확률로 마나 획득
	public int a10050(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("50")) {
					total += 10;
				} else if(ary[5].equals("51")) {
					total += 15;
				} else if(ary[5].equals("52")) {
					total += 20;
				} else if(ary[5].equals("53")) {
					total += 25;
				} else if(ary[5].equals("54")) {
					total += 30;
				} else if(ary[5].equals("55")) {
					total += 35;
				} else if(ary[5].equals("56")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("50")) {
					total += 10;
				} else if(ary[6].equals("51")) {
					total += 15;
				} else if(ary[6].equals("52")) {
					total += 20;
				} else if(ary[6].equals("53")) {
					total += 25;
				} else if(ary[6].equals("54")) {
					total += 30;
				} else if(ary[6].equals("55")) {
					total += 35;
				} else if(ary[6].equals("56")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("50")) {
					total += 10;
				} else if(ary[7].equals("51")) {
					total += 15;
				} else if(ary[7].equals("52")) {
					total += 20;
				} else if(ary[7].equals("53")) {
					total += 25;
				} else if(ary[7].equals("54")) {
					total += 30;
				} else if(ary[7].equals("55")) {
					total += 35;
				} else if(ary[7].equals("56")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("50")) {
					total += 10;
				} else if(ary[8].equals("51")) {
					total += 15;
				} else if(ary[8].equals("52")) {
					total += 20;
				} else if(ary[8].equals("53")) {
					total += 25;
				} else if(ary[8].equals("54")) {
					total += 30;
				} else if(ary[8].equals("55")) {
					total += 35;
				} else if(ary[8].equals("56")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("50")) {
					total += 10;
				} else if(ary[9].equals("51")) {
					total += 15;
				} else if(ary[9].equals("52")) {
					total += 20;
				} else if(ary[9].equals("53")) {
					total += 25;
				} else if(ary[9].equals("54")) {
					total += 30;
				} else if(ary[9].equals("55")) {
					total += 35;
				} else if(ary[9].equals("56")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}

	// 원거리 공격 시 n% 확률로 마나 획득
	public int a10060(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("60")) {
					total += 10;
				} else if(ary[5].equals("61")) {
					total += 15;
				} else if(ary[5].equals("62")) {
					total += 20;
				} else if(ary[5].equals("63")) {
					total += 25;
				} else if(ary[5].equals("64")) {
					total += 30;
				} else if(ary[5].equals("65")) {
					total += 35;
				} else if(ary[5].equals("66")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("60")) {
					total += 10;
				} else if(ary[6].equals("61")) {
					total += 15;
				} else if(ary[6].equals("62")) {
					total += 20;
				} else if(ary[6].equals("63")) {
					total += 25;
				} else if(ary[6].equals("64")) {
					total += 30;
				} else if(ary[6].equals("65")) {
					total += 35;
				} else if(ary[6].equals("66")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("60")) {
					total += 10;
				} else if(ary[7].equals("61")) {
					total += 15;
				} else if(ary[7].equals("62")) {
					total += 20;
				} else if(ary[7].equals("63")) {
					total += 25;
				} else if(ary[7].equals("64")) {
					total += 30;
				} else if(ary[7].equals("65")) {
					total += 35;
				} else if(ary[7].equals("66")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("60")) {
					total += 10;
				} else if(ary[8].equals("61")) {
					total += 15;
				} else if(ary[8].equals("62")) {
					total += 20;
				} else if(ary[8].equals("63")) {
					total += 25;
				} else if(ary[8].equals("64")) {
					total += 30;
				} else if(ary[8].equals("65")) {
					total += 35;
				} else if(ary[8].equals("66")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("60")) {
					total += 10;
				} else if(ary[9].equals("61")) {
					total += 15;
				} else if(ary[9].equals("62")) {
					total += 20;
				} else if(ary[9].equals("63")) {
					total += 25;
				} else if(ary[9].equals("64")) {
					total += 30;
				} else if(ary[9].equals("65")) {
					total += 35;
				} else if(ary[9].equals("66")) {
					total += 40;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}
	
	// 근접 공격 시 독 데미지
	public int a10070(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int max = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("70")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[5].equals("71")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[5].equals("72")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[5].equals("73")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[5].equals("74")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[5].equals("75")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("70")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[6].equals("71")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[6].equals("72")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[6].equals("73")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[6].equals("74")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[6].equals("75")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("70")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[7].equals("71")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[7].equals("72")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[7].equals("73")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[7].equals("74")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[7].equals("75")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("70")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[8].equals("71")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[8].equals("72")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[8].equals("73")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[8].equals("74")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[8].equals("75")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("70")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[9].equals("71")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[9].equals("72")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[9].equals("73")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[9].equals("74")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[9].equals("75")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			return max;
		}
		return max;
	}
	
	// 원거리 공격 시 독 데미지
	public int a10080(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int max = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("80")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[5].equals("81")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[5].equals("82")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[5].equals("83")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[5].equals("84")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[5].equals("85")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("80")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[6].equals("81")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[6].equals("82")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[6].equals("83")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[6].equals("84")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[6].equals("85")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("80")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[7].equals("81")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[7].equals("82")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[7].equals("83")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[7].equals("84")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[7].equals("85")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("80")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[8].equals("81")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[8].equals("82")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[8].equals("83")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[8].equals("84")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[8].equals("85")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("80")) {
					if(max <= 8) {
						max = 8;
					}
				} else if(ary[9].equals("81")) {
					if(max <= 9) {
						max = 9;
					}
				} else if(ary[9].equals("82")) {
					if(max <= 10) {
						max = 10;
					}
				} else if(ary[9].equals("83")) {
					if(max <= 11) {
						max = 11;
					}
				} else if(ary[9].equals("84")) {
					if(max <= 12) {
						max = 12;
					}
				} else if(ary[9].equals("85")) {
					if(max <= 13) {
						max = 13;
					}
				}
			} catch(Exception e) {
				
			}
			return max;
		}
		return max;
	}
	
	// 근접 공격 시 n% 확률로 10% 회복
	public int a10090(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("90")) {
					total += 5;
				} else if(ary[5].equals("91")) {
					total += 8;
				} else if(ary[5].equals("92")) {
					total += 10;
				} else if(ary[5].equals("93")) {
					total += 15;
				} else if(ary[5].equals("94")) {
					total += 20;
				} else if(ary[5].equals("95")) {
					total += 25;
				} else if(ary[5].equals("96")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("90")) {
					total += 5;
				} else if(ary[6].equals("91")) {
					total += 8;
				} else if(ary[6].equals("92")) {
					total += 10;
				} else if(ary[6].equals("93")) {
					total += 15;
				} else if(ary[6].equals("94")) {
					total += 20;
				} else if(ary[6].equals("95")) {
					total += 25;
				} else if(ary[6].equals("96")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("90")) {
					total += 5;
				} else if(ary[7].equals("91")) {
					total += 8;
				} else if(ary[7].equals("92")) {
					total += 10;
				} else if(ary[7].equals("93")) {
					total += 15;
				} else if(ary[7].equals("94")) {
					total += 20;
				} else if(ary[7].equals("95")) {
					total += 25;
				} else if(ary[7].equals("96")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("90")) {
					total += 5;
				} else if(ary[8].equals("91")) {
					total += 8;
				} else if(ary[8].equals("92")) {
					total += 10;
				} else if(ary[8].equals("93")) {
					total += 15;
				} else if(ary[8].equals("94")) {
					total += 20;
				} else if(ary[8].equals("95")) {
					total += 25;
				} else if(ary[8].equals("96")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("90")) {
					total += 5;
				} else if(ary[9].equals("91")) {
					total += 8;
				} else if(ary[9].equals("92")) {
					total += 10;
				} else if(ary[9].equals("93")) {
					total += 15;
				} else if(ary[9].equals("94")) {
					total += 20;
				} else if(ary[9].equals("95")) {
					total += 25;
				} else if(ary[9].equals("96")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}
	
	// 원거리 공격 시 n% 확률로 10% 회복
	public int a10100(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("100")) {
					total += 5;
				} else if(ary[5].equals("101")) {
					total += 8;
				} else if(ary[5].equals("102")) {
					total += 10;
				} else if(ary[5].equals("103")) {
					total += 15;
				} else if(ary[5].equals("104")) {
					total += 20;
				} else if(ary[5].equals("105")) {
					total += 25;
				} else if(ary[5].equals("106")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("100")) {
					total += 5;
				} else if(ary[6].equals("101")) {
					total += 8;
				} else if(ary[6].equals("102")) {
					total += 10;
				} else if(ary[6].equals("103")) {
					total += 15;
				} else if(ary[6].equals("104")) {
					total += 20;
				} else if(ary[6].equals("105")) {
					total += 25;
				} else if(ary[6].equals("106")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("100")) {
					total += 5;
				} else if(ary[7].equals("101")) {
					total += 8;
				} else if(ary[7].equals("102")) {
					total += 10;
				} else if(ary[7].equals("103")) {
					total += 15;
				} else if(ary[7].equals("104")) {
					total += 20;
				} else if(ary[7].equals("105")) {
					total += 25;
				} else if(ary[7].equals("106")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("100")) {
					total += 5;
				} else if(ary[8].equals("101")) {
					total += 8;
				} else if(ary[8].equals("102")) {
					total += 10;
				} else if(ary[8].equals("103")) {
					total += 15;
				} else if(ary[8].equals("104")) {
					total += 20;
				} else if(ary[8].equals("105")) {
					total += 25;
				} else if(ary[8].equals("106")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("100")) {
					total += 5;
				} else if(ary[9].equals("101")) {
					total += 8;
				} else if(ary[9].equals("102")) {
					total += 10;
				} else if(ary[9].equals("103")) {
					total += 15;
				} else if(ary[9].equals("104")) {
					total += 20;
				} else if(ary[9].equals("105")) {
					total += 25;
				} else if(ary[9].equals("106")) {
					total += 30;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}
	
	// 의문의 상자 발견 확률
	public int a10110(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("110")) {
					total += 5;
				} else if(ary[5].equals("111")) {
					total += 10;
				} else if(ary[5].equals("112")) {
					total += 15;
				} else if(ary[5].equals("113")) {
					total += 20;
				} else if(ary[5].equals("114")) {
					total += 25;
				} else if(ary[5].equals("115")) {
					total += 30;
				} else if(ary[5].equals("116")) {
					total += 35;
				} else if(ary[5].equals("117")) {
					total += 40;
				} else if(ary[5].equals("118")) {
					total += 45;
				} else if(ary[5].equals("119")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("110")) {
					total += 5;
				} else if(ary[6].equals("111")) {
					total += 10;
				} else if(ary[6].equals("112")) {
					total += 15;
				} else if(ary[6].equals("113")) {
					total += 20;
				} else if(ary[6].equals("114")) {
					total += 25;
				} else if(ary[6].equals("115")) {
					total += 30;
				} else if(ary[6].equals("116")) {
					total += 35;
				} else if(ary[6].equals("117")) {
					total += 40;
				} else if(ary[6].equals("118")) {
					total += 45;
				} else if(ary[6].equals("119")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("110")) {
					total += 5;
				} else if(ary[7].equals("111")) {
					total += 10;
				} else if(ary[7].equals("112")) {
					total += 15;
				} else if(ary[7].equals("113")) {
					total += 20;
				} else if(ary[7].equals("114")) {
					total += 25;
				} else if(ary[7].equals("115")) {
					total += 30;
				} else if(ary[7].equals("116")) {
					total += 35;
				} else if(ary[7].equals("117")) {
					total += 40;
				} else if(ary[7].equals("118")) {
					total += 45;
				} else if(ary[7].equals("119")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("110")) {
					total += 5;
				} else if(ary[8].equals("111")) {
					total += 10;
				} else if(ary[8].equals("112")) {
					total += 15;
				} else if(ary[8].equals("113")) {
					total += 20;
				} else if(ary[8].equals("114")) {
					total += 25;
				} else if(ary[8].equals("115")) {
					total += 30;
				} else if(ary[8].equals("116")) {
					total += 35;
				} else if(ary[8].equals("117")) {
					total += 40;
				} else if(ary[8].equals("118")) {
					total += 45;
				} else if(ary[8].equals("119")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("110")) {
					total += 5;
				} else if(ary[9].equals("111")) {
					total += 10;
				} else if(ary[9].equals("112")) {
					total += 15;
				} else if(ary[9].equals("113")) {
					total += 20;
				} else if(ary[9].equals("114")) {
					total += 25;
				} else if(ary[9].equals("115")) {
					total += 30;
				} else if(ary[9].equals("116")) {
					total += 35;
				} else if(ary[9].equals("117")) {
					total += 40;
				} else if(ary[9].equals("118")) {
					total += 45;
				} else if(ary[9].equals("119")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}
	
	// 죽음에 이르는 피해를 입었을 때 n% 확률로 체력 50% 회복
	public int a10120(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("120")) {
					total += 3;
				} else if(ary[5].equals("121")) {
					total += 5;
				} else if(ary[5].equals("122")) {
					total += 8;
				} else if(ary[5].equals("123")) {
					total += 10;
				} else if(ary[5].equals("124")) {
					total += 15;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("120")) {
					total += 3;
				} else if(ary[6].equals("121")) {
					total += 5;
				} else if(ary[6].equals("122")) {
					total += 8;
				} else if(ary[6].equals("123")) {
					total += 10;
				} else if(ary[6].equals("124")) {
					total += 15;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("120")) {
					total += 3;
				} else if(ary[7].equals("121")) {
					total += 5;
				} else if(ary[7].equals("122")) {
					total += 8;
				} else if(ary[7].equals("123")) {
					total += 10;
				} else if(ary[7].equals("124")) {
					total += 15;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("120")) {
					total += 3;
				} else if(ary[8].equals("121")) {
					total += 5;
				} else if(ary[8].equals("122")) {
					total += 8;
				} else if(ary[8].equals("123")) {
					total += 10;
				} else if(ary[8].equals("124")) {
					total += 15;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("120")) {
					total += 3;
				} else if(ary[9].equals("121")) {
					total += 5;
				} else if(ary[9].equals("122")) {
					total += 8;
				} else if(ary[9].equals("123")) {
					total += 10;
				} else if(ary[9].equals("124")) {
					total += 15;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}
	
	// 화살 장전 속도 감소
	public int a10130(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int max = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("130")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[5].equals("131")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[5].equals("132")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[5].equals("133")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[5].equals("134")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("130")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[6].equals("131")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[6].equals("132")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[6].equals("133")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[6].equals("134")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("130")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[7].equals("131")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[7].equals("132")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[7].equals("133")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[7].equals("134")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("130")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[8].equals("131")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[8].equals("132")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[8].equals("133")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[8].equals("134")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("130")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[9].equals("131")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[9].equals("132")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[9].equals("133")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[9].equals("134")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			return max;
		}
		return max;
	}
	
	// 확산 화살
	public int a10140(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int max = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("140")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[5].equals("141")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[5].equals("142")) {
					if(max <= 3) {
						max = 3;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("140")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[6].equals("141")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[6].equals("142")) {
					if(max <= 3) {
						max = 3;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("140")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[7].equals("141")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[7].equals("142")) {
					if(max <= 3) {
						max = 3;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("140")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[8].equals("141")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[8].equals("142")) {
					if(max <= 3) {
						max = 3;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("140")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[9].equals("141")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[9].equals("142")) {
					if(max <= 3) {
						max = 3;
					}
				}
			} catch(Exception e) {
				
			}
			return max;
		}
		return max;
	}

	// 독 데미지 경감
	public int a10150(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("150")) {
					total += 10;
				} else if(ary[5].equals("151")) {
					total += 20;
				} else if(ary[5].equals("152")) {
					total += 30;
				} else if(ary[5].equals("153")) {
					total += 40;
				} else if(ary[5].equals("154")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("150")) {
					total += 10;
				} else if(ary[6].equals("151")) {
					total += 20;
				} else if(ary[6].equals("152")) {
					total += 30;
				} else if(ary[6].equals("153")) {
					total += 40;
				} else if(ary[6].equals("154")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("150")) {
					total += 10;
				} else if(ary[7].equals("151")) {
					total += 20;
				} else if(ary[7].equals("152")) {
					total += 30;
				} else if(ary[7].equals("153")) {
					total += 40;
				} else if(ary[7].equals("154")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("150")) {
					total += 10;
				} else if(ary[8].equals("151")) {
					total += 20;
				} else if(ary[8].equals("152")) {
					total += 30;
				} else if(ary[8].equals("153")) {
					total += 40;
				} else if(ary[8].equals("154")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("150")) {
					total += 10;
				} else if(ary[9].equals("151")) {
					total += 20;
				} else if(ary[9].equals("152")) {
					total += 30;
				} else if(ary[9].equals("153")) {
					total += 40;
				} else if(ary[9].equals("154")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}

	// 위더 데미지 경감
	public int a10160(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int total = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("160")) {
					total += 10;
				} else if(ary[5].equals("161")) {
					total += 20;
				} else if(ary[5].equals("162")) {
					total += 30;
				} else if(ary[5].equals("163")) {
					total += 40;
				} else if(ary[5].equals("164")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("160")) {
					total += 10;
				} else if(ary[6].equals("161")) {
					total += 20;
				} else if(ary[6].equals("162")) {
					total += 30;
				} else if(ary[6].equals("163")) {
					total += 40;
				} else if(ary[6].equals("164")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("160")) {
					total += 10;
				} else if(ary[7].equals("161")) {
					total += 20;
				} else if(ary[7].equals("162")) {
					total += 30;
				} else if(ary[7].equals("163")) {
					total += 40;
				} else if(ary[7].equals("164")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("160")) {
					total += 10;
				} else if(ary[8].equals("161")) {
					total += 20;
				} else if(ary[8].equals("162")) {
					total += 30;
				} else if(ary[8].equals("163")) {
					total += 40;
				} else if(ary[8].equals("164")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("160")) {
					total += 10;
				} else if(ary[9].equals("161")) {
					total += 20;
				} else if(ary[9].equals("162")) {
					total += 30;
				} else if(ary[9].equals("163")) {
					total += 40;
				} else if(ary[9].equals("164")) {
					total += 50;
				}
			} catch(Exception e) {
				
			}
			return total;
		}
		return total;
	}
	
	// 탄환 장전 속도 감소
	public int a10180(Player player) {
		ItemStack item = player.getInventory().getItemInOffHand();
		int max = 0;
		if(item.getType() == Material.DIAMOND_AXE) {
			String[] ary = item.getItemMeta().getLocalizedName().split(",");
			try {
				if(ary[5].equals("180")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[5].equals("181")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[5].equals("182")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[5].equals("183")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[5].equals("184")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[6].equals("180")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[6].equals("181")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[6].equals("182")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[6].equals("183")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[6].equals("184")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[7].equals("180")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[7].equals("181")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[7].equals("182")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[7].equals("183")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[7].equals("184")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[8].equals("180")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[8].equals("181")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[8].equals("182")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[8].equals("183")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[8].equals("184")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			try {
				if(ary[9].equals("180")) {
					if(max <= 1) {
						max = 1;
					}
				} else if(ary[9].equals("181")) {
					if(max <= 2) {
						max = 2;
					}
				} else if(ary[9].equals("182")) {
					if(max <= 3) {
						max = 3;
					}
				} else if(ary[9].equals("183")) {
					if(max <= 4) {
						max = 4;
					}
				} else if(ary[9].equals("184")) {
					if(max <= 5) {
						max = 5;
					}
				}
			} catch(Exception e) {
				
			}
			return max;
		}
		return max;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public double w1(Player player) {
		try {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "치유의 나무")) {
				return 1.5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int w2(Player player) {
		try {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "검은 태양+")) {
				return 1;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int w3(Player player) {
		try {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "검은 달+")) {
				return 40;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int w4(Player player) {
		try {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "만경창파")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public double w5(Player player) {
		try {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "일루시데이터+")) {
				return 0.8;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int w6(Player player) {
		try {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "일루시데이터+")) {
				return 20;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int w7(Player player) {
		try {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "다크 리펄서+")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int w8(Player player) {
		try {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "다크 리펄서+")) {
				return 30;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int h1(Player player) {
		try {
			if(player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "삼보룡")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int h2(Player player) {
		try {
			if(player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "호크아이")) {
				return 9;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int h3(Player player) {
		try {
			if(player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "백홍원")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int h4(Player player) {
		try {
			if(player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "럭키한 클로에의 헬멧")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int c1(Player player) {
		try {
			if(player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "진월")) {
				return 1;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int c2(Player player) {
		try {
			if(player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "목영축")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int c3(Player player) {
		try {
			if(player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "럭키한 클로에의 갑옷")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int l1(Player player) {
		try {
			if(player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "엑스에어리얼")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int l2(Player player) {
		try {
			if(player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "박영성")) {
				return -50;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int l3(Player player) {
		try {
			if(player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "럭키한 클로에의 각반")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int b1(Player player) {
		try {
			if(player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "질주하는 자극")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int b2(Player player) {
		try {
			if(player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "스쿠트")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int b3(Player player) {
		try {
			if(player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "이천루")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int b4(Player player) {
		try {
			if(player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "럭키한 클로에의 신발")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int s1(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "투기장의 지배자 헬멧")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "투기장의 지배자 갑옷")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "투기장의 지배자 각반")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "투기장의 지배자 신발")) {
							return 100;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int s2(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "제사장의 헬멧")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "제사장의 갑옷")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "제사장의 각반")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "제사장의 신발")) {
							return 10;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int s3(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "춘 <체어리 블로섬>")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "하 <힛 웨이브>")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "추 <메이플>")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "동 <애벌랜치>")) {
							return 6;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int s4(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 헬멧")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 갑옷")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 각반")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 신발")) {
							return -50;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int s5(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 헬멧")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 갑옷")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 각반")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "데이드릭 신발")) {
							return -100;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int s6(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "케찹")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "머스타드")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "마요네즈")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "발사믹")) {
							return 20;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int s7(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "라의 헬멧")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "라의 갑옷")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "라의 각반")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "라의 신발")) {
							return 10;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int s8(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "럭키한 클로에의 헬멧")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "럭키한 클로에의 갑옷")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "럭키한 클로에의 각반")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "럭키한 클로에의 신발")) {
							return 10;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int s9(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 헬멧")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 갑옷")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 각반")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 신발")) {
							return 20;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int s10(Player player) {
		try {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 헬멧")) {
				if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 갑옷")) {
					if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 각반")) {
						if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세계수의 축복이 담긴 신발")) {
							return 20;
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	
}
