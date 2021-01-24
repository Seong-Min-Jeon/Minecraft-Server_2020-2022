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
	
	
	
	
	
}
