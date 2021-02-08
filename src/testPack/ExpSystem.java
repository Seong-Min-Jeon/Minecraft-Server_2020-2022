package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ExpSystem {
	
	Cmd17ExpToggle et = new Cmd17ExpToggle();
	Cmd8Party cp = new Cmd8Party();
	
	public void giveExp(Player player, int exp) {
		int currentLevel = player.getLevel();
		if(currentLevel != 0) {
			exp -= Math.log10(currentLevel) * Math.log10(currentLevel) * currentLevel * currentLevel;
			if(exp < 0) {
				exp = 0;
			}
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
		if(!et.isOn(player.getDisplayName())) {
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

}
