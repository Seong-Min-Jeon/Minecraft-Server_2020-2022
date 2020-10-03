package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ExpSystemByMob {
	
	Cmd8Party cp = new Cmd8Party();
	private final int multyExp = 1;
	
	public void giveExp(Player player, int exp) {
		int currentLevel = player.getLevel();
		int natExp = exp;
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
		float customExpToLevel = (float)((int)((Math.pow(currentLevel, 3)/10) * Math.log10(currentLevel+1) + 10));
		float customRatio = (float)(exp/customExpToLevel);
		float currentRatio = player.getExp();
		float totalRatio = customRatio + currentRatio;
		player.sendMessage(ChatColor.GRAY + "[Exp] " + exchange(exp));
		if(totalRatio>=1) {
			player.setLevel(player.getLevel()+1);
			player.setExp(0);
		} else { 
			player.setExp(totalRatio);
		}
		
		try {
			ArrayList<Player> party = cp.getPlayerParty(player);
			if(party.size() != 0) {
				for(Player partyPlayer : party) {
					if(partyPlayer != player) {
						boolean isOk = false;
						for(Entity ent : partyPlayer.getNearbyEntities(20, 10, 20)) {
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
		int currentLevel = player.getLevel();
		exp -= Math.log10(currentLevel) * Math.log10(currentLevel) * currentLevel * currentLevel;
		if(exp < 0) {
			exp = 0;
		}
		float customExpToLevel = (float)((int)((Math.pow(currentLevel, 3)/10) * Math.log10(currentLevel+1) + 10));
		float customRatio = (float)(exp/customExpToLevel);
		float currentRatio = player.getExp();
		float totalRatio = customRatio + currentRatio;
		player.sendMessage(ChatColor.GRAY + "[Exp] " + exchange(exp));
		if(totalRatio>=1) {
			player.setLevel(player.getLevel()+1);
			player.setExp(0);
		} else { 
			player.setExp(totalRatio);
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
