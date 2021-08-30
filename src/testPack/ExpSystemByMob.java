package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.Particle.DustOptions;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

public class ExpSystemByMob {

	Cmd17ExpToggle et = new Cmd17ExpToggle();
	Cmd8Party cp = new Cmd8Party();
	private static int multyExp = 1;
	Random rnd = new Random();
	private int taskID;
	
	public void giveExp(Player player, int exp) {
		int currentLevel = player.getLevel();
		int natExp = exp;
		if(currentLevel != 0) {
			exp -= Math.log10(currentLevel) * Math.log10(currentLevel) * currentLevel * currentLevel;
			exp *= multyExp;
		}
		
		if(exp < 0) {
			exp = 0;
		}
		
		int percent = 0;
		percent += new SpecialEffect().a10010(player);
		percent += new SpecialEffect().b1(player);
		percent += new SpecialEffect().a8(player);
		percent += new SpecialEffect().h1(player);
		percent += new SpecialEffect().s1(player);
		percent += new SpecialEffect().a12(player);
		percent += new SpecialEffect().c2(player);
		percent += new SpecialEffect().l2(player);
		percent += new SpecialEffect().a19(player);
		percent += new SpecialEffect().a20(player);
		percent += new SpecialEffect().w7(player);
		
		Inheritance inheritance = new Inheritance();
		if(inheritance.getInheritance(player) == 11) {
			percent += 5;
		} else if(inheritance.getInheritance(player) == 12) {
			percent += 10;
		} else if(inheritance.getInheritance(player) == 13) {
			percent += 15;
		} else if(inheritance.getInheritance(player) == 14) {
			percent += 20;
		}
		
		exp += exp * percent / 100;
		
		if(exp <= 0) {
			exp = 0;
		}
		
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
		if(et.isOn(player)) {
			player.sendMessage(ChatColor.GRAY + "[Exp] " + exchange(exp));
		}
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
		int currentLevel = player.getLevel();
		if(currentLevel != 0) {
			exp -= Math.log10(currentLevel) * Math.log10(currentLevel) * currentLevel * currentLevel;
			exp *= multyExp;
		}
		
		if(exp < 0) {
			exp = 0;
		}
		
		int percent = 0;
		percent += new SpecialEffect().a10010(player);
		percent += new SpecialEffect().b1(player);
		percent += new SpecialEffect().a8(player);
		percent += new SpecialEffect().h1(player);
		percent += new SpecialEffect().s1(player);
		percent += new SpecialEffect().a12(player);
		percent += new SpecialEffect().c2(player);
		percent += new SpecialEffect().l2(player);
		percent += new SpecialEffect().a19(player);
		percent += new SpecialEffect().a20(player);
		percent += new SpecialEffect().w7(player);
		
		Inheritance inheritance = new Inheritance();
		if(inheritance.getInheritance(player) == 11) {
			percent += 5;
		} else if(inheritance.getInheritance(player) == 12) {
			percent += 10;
		} else if(inheritance.getInheritance(player) == 13) {
			percent += 15;
		} else if(inheritance.getInheritance(player) == 14) {
			percent += 20;
		}
		
		exp += exp * percent / 100;
		
		if(exp <= 0) {
			exp = 0;
		}
		
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
		if(et.isOn(player)) {
			player.sendMessage(ChatColor.GRAY + "[Exp] " + exchange(exp));
		}
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

	public void goldenTime(Player player) {
		multyExp = 2;
		new ProgressBar().bar1setStat(true);
		for(Player p : Bukkit.getOnlinePlayers()) {
			p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + player.getDisplayName() + "님의 핫타임이 시작되었습니다. (전투 경험치 2배)");
			new ProgressBar().bar1AddPlayer(p);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 2.0f, 1.1f);
		}
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			ThreadExpHotTime th = new ThreadExpHotTime(player.getUniqueId());

			@Override
			public void run() {
				
				if (!th.hasID()) {
					th.setID(taskID);
				}
				
				if (time % 1200 == 0) {
					new ProgressBar().bar1ChangeTime(10 - time/1200);
				}
				
				if (time >= 12000) {
					multyExp = 1;
					new ProgressBar().bar1setStat(false);
					for(Player p : Bukkit.getOnlinePlayers()) {
						p.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + player.getDisplayName() + "님의 핫타임이 종료되었습니다. (전투 경험치 2배)");
					}
					new ProgressBar().bar1RemovePlayer();
					th.endTask();
					th.removeID();
				}
				
				time++;

			}

		}, 0, 1);
	}
	
}
