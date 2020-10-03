package testPack;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class BossHealth {

	private static BossBar bar1 = Bukkit.createBossBar(ChatColor.DARK_RED + "ÄÚ³¶±×", BarColor.RED, BarStyle.SOLID);
	
	public BossBar getBar1() {
		return bar1;
	}
	
	public void removePlayer(Player player) {
		if(bar1.getPlayers().contains(player)) { 
			bar1.removePlayer(player);
		}
	}
	
	
}
