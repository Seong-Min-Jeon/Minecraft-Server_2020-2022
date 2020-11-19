package testPack;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ExpSystemByMob {
	
	Cmd8Party cp = new Cmd8Party();
	private final int multyExp = 1;
	Random rnd = new Random();
	
	public void giveExp(Player player, int exp) {
		int currentLevel = player.getLevel();
		int natExp = exp;
		if(currentLevel != 0) {
			exp -= Math.log10(currentLevel) * Math.log10(currentLevel) * currentLevel * currentLevel;
			exp *= multyExp;
//			Inventory inv = player.getInventory();
//			if(inv.contains(Material.YELLOW_DYE) && currentLevel < 100) {
//				exp *= 2;
//			} else if(inv.contains(Material.LIGHT_BLUE_DYE) && currentLevel < 100) {
//				exp *= 2;
//			} else if(inv.contains(Material.MAGENTA_DYE) && currentLevel < 100) {
//				exp *= 2;
//			} else if(inv.contains(Material.ORANGE_DYE) && currentLevel < 100) {
//				exp *= 2;
//			} else if(inv.contains(Material.CLAY_BALL) && currentLevel < 100) {
//				exp *= 2;
//			} else if(inv.contains(Material.GRAY_DYE) && currentLevel < 400) {
//				exp *= 2;
//			} else if(inv.contains(Material.PINK_DYE) && currentLevel < 400) {
//				exp *= 2;
//			} else if(inv.contains(Material.LIME_DYE) && currentLevel < 400) {
//				exp *= 2;
//			} else if(inv.contains(Material.BLUE_DYE) && currentLevel < 900) {
//				exp *= 2;
//			} else if(inv.contains(Material.BROWN_DYE) && currentLevel < 900) {
//				exp *= 2;
//			} else if(inv.contains(Material.BLACK_DYE) && currentLevel < 900) {
//				exp *= 2;
//			} else if(inv.contains(Material.INK_SAC) && currentLevel < 900) {
//				exp *= 2;
//			} else if(inv.contains(Material.GLOWSTONE_DUST) && currentLevel < 900) {
//				exp *= 2;
//			}
			if(exp < 0) {
				exp = 0;
			}
		}
		
		int percent = 0;
		percent += new SpecialEffect().b1(player);
		percent += new SpecialEffect().a8(player);
		percent += new SpecialEffect().h1(player);
		exp += exp * percent / 100;
		
		double customExpToLevel = (double)((int)((Math.pow(currentLevel, 3)/10) * Math.log10(currentLevel+1) + 10));
		if(currentLevel >= 1000) {
			customExpToLevel = 2100000000; //21억
		} else if(currentLevel >= 900) {
			customExpToLevel = 1500000000; //15억
		} else if(currentLevel >= 800) {
			customExpToLevel = 1000000000; //10억
		} else if(currentLevel >= 700) {
			customExpToLevel = 500000000; //5억
		}
		double customRatio = (double)(exp/customExpToLevel);
		double currentRatio = player.getExp();
		double totalRatio = customRatio + currentRatio;
		player.sendMessage(ChatColor.GRAY + "[Exp] " + exchange(exp));
		if(totalRatio>=1) {
			player.setLevel(player.getLevel()+1);
			player.setExp(0);
		} else { 
			player.setExp((float) totalRatio);
		}
		
		try {
			ArrayList<Player> party = cp.getPlayerParty(player);
			if(party.size() != 0) {
				for(Player partyPlayer : party) {
					if(partyPlayer != player) {
						boolean isOk = false;
						for(Entity ent : partyPlayer.getNearbyEntities(15, 6, 15)) {
							if(ent instanceof Player) {
								Player p = (Player) ent;
								if(p.equals(player)) {
									isOk = true; 
								}
							}
						}
						if(isOk == true) {
							int partyPlayerLvl = partyPlayer.getLevel();
							int differ = Math.abs(currentLevel - partyPlayerLvl);
							partyGiveExp(partyPlayer, (int)(natExp*((100-2*differ)*0.01)));
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		
	}
	
	public void partyGiveExp(Player player, int exp) {
		
		// 마나지급
		int num = rnd.nextInt(5);
		if(num == 0) {
			ItemStack mana = new ItemStack(Material.HEART_OF_THE_SEA);
			ItemMeta manaIm = mana.getItemMeta();
			manaIm.setDisplayName(ChatColor.BLUE + "마나");
			mana.setItemMeta(manaIm);
			if (player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
				int i = 0;
				for (ItemStack is : player.getInventory().getContents()) {
					if (is == null)
						continue;
					if (is.getType() == Material.HEART_OF_THE_SEA) {
						i = i + is.getAmount();
					}
				}
				if (i < 20)
					player.getInventory().addItem(mana);
			} else {
				player.getInventory().setItem(8, mana);
			}
		}
		
		int currentLevel = player.getLevel();
		if(currentLevel != 0) {
			exp -= Math.log10(currentLevel) * Math.log10(currentLevel) * currentLevel * currentLevel;
			exp *= multyExp;
			Inventory inv = player.getInventory();
			if(inv.contains(Material.YELLOW_DYE) && currentLevel < 100) {
				exp *= 2;
			} else if(inv.contains(Material.LIGHT_BLUE_DYE) && currentLevel < 100) {
				exp *= 2;
			} else if(inv.contains(Material.MAGENTA_DYE) && currentLevel < 100) {
				exp *= 2;
			} else if(inv.contains(Material.ORANGE_DYE) && currentLevel < 100) {
				exp *= 2;
			} else if(inv.contains(Material.CLAY_BALL) && currentLevel < 100) {
				exp *= 2;
			} else if(inv.contains(Material.GRAY_DYE) && currentLevel < 400) {
				exp *= 2;
			} else if(inv.contains(Material.PINK_DYE) && currentLevel < 400) {
				exp *= 2;
			} else if(inv.contains(Material.LIME_DYE) && currentLevel < 400) {
				exp *= 2;
			} else if(inv.contains(Material.BLUE_DYE) && currentLevel < 900) {
				exp *= 2;
			} else if(inv.contains(Material.BROWN_DYE) && currentLevel < 900) {
				exp *= 2;
			} else if(inv.contains(Material.BLACK_DYE) && currentLevel < 900) {
				exp *= 2;
			} else if(inv.contains(Material.INK_SAC) && currentLevel < 900) {
				exp *= 2;
			} else if(inv.contains(Material.GLOWSTONE_DUST) && currentLevel < 900) {
				exp *= 2;
			}
			if(exp < 0) {
				exp = 0;
			}
		}
		
		int percent = 0;
		percent += new SpecialEffect().b1(player);
		percent += new SpecialEffect().a8(player);
		percent += new SpecialEffect().h1(player);
		exp += exp * percent / 100;
		
		double customExpToLevel = (double)((int)((Math.pow(currentLevel, 3)/10) * Math.log10(currentLevel+1) + 10));
		if(currentLevel >= 1000) {
			customExpToLevel = 2100000000; //21억
		} else if(currentLevel >= 900) {
			customExpToLevel = 1500000000; //15억
		} else if(currentLevel >= 800) {
			customExpToLevel = 1000000000; //10억
		} else if(currentLevel >= 700) {
			customExpToLevel = 500000000; //5억
		}
		double customRatio = (double)(exp/customExpToLevel);
		double currentRatio = player.getExp();
		double totalRatio = customRatio + currentRatio;
		player.sendMessage(ChatColor.GRAY + "[Exp] " + exchange(exp));
		if(totalRatio>=1) {
			player.setLevel(player.getLevel()+1);
			player.setExp(0);
		} else { 
			player.setExp((float) totalRatio);
		}
		
	}
	
	public String exchange(int exp) {
		String str = "0";
		if(exp > 1000000000) {
			str = Double.toString((exp / 100000000) / 10.0) + "G";
		} else if(exp > 1000000) {
			str = Double.toString((exp / 100000) / 10.0) + "M";
		} else if(exp > 1000) {
			str = Double.toString((exp / 100) / 10.0) + "K";
		} else {
			str = Integer.toString(exp);
		}
		
		return str;
	}

}
