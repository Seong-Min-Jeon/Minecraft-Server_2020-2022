package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ExpSystem {
	
	Cmd8Party cp = new Cmd8Party();
	
	public void giveExp(Player player, int exp) {
		int currentLevel = player.getLevel();
		if(currentLevel != 0) {
			exp -= Math.log10(currentLevel) * Math.log10(currentLevel) * currentLevel * currentLevel;
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
