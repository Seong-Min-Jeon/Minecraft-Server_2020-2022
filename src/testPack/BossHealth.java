package testPack;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class BossHealth {

	private static BossBar bar1 = Bukkit.createBossBar(ChatColor.DARK_RED + "코낭그", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar2 = Bukkit.createBossBar(ChatColor.DARK_RED + "1층의 지배자", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar3 = Bukkit.createBossBar(ChatColor.DARK_RED + "2층의 지배자", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar4 = Bukkit.createBossBar(ChatColor.DARK_RED + "3층의 지배자", BarColor.RED, BarStyle.SOLID);
	
	public BossBar getBar1() {
		return bar1;
	}
	
	public BossBar getBar2() {
		return bar2;
	}
	
	public BossBar getBar3() {
		return bar3;
	}
	
	public BossBar getBar4() {
		return bar4;
	}
	
	public void removePlayer(Player player) {
		if(bar1.getPlayers().contains(player)) { 
			bar1.removePlayer(player);
		} else if(bar2.getPlayers().contains(player)) { 
			bar2.removePlayer(player);
		} else if(bar3.getPlayers().contains(player)) { 
			bar3.removePlayer(player);
		} else if(bar4.getPlayers().contains(player)) { 
			bar4.removePlayer(player);
		}
	}
	
	
}
