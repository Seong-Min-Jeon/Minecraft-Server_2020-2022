package testPack;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class ProgressBar {

	private static BossBar bar1 = Bukkit.createBossBar(ChatColor.BOLD + "" + ChatColor.AQUA + "전투 경험치 2배 [10분]", BarColor.BLUE, BarStyle.SOLID);
	private static BossBar bar2 = Bukkit.createBossBar(ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "강화 확률 증가 [10분]", BarColor.PURPLE, BarStyle.SOLID);
	private static BossBar bar3 = Bukkit.createBossBar(ChatColor.BOLD + "" + ChatColor.DARK_RED + "레이드 [60분]", BarColor.RED, BarStyle.SOLID);
	private static boolean bar1Stat = false;
	private static boolean bar2Stat = false;
	private static boolean bar3Stat = false;
	
	public void bar1AddPlayer(Player player) {
		bar1.addPlayer(player);
	}
	
	public void bar2AddPlayer(Player player) {
		bar2.addPlayer(player);
	}
	
	public void bar3AddPlayer(Player player) {
		bar3.addPlayer(player);
	}
	
	public void bar1ChangeTime(int num) {
		bar1.setTitle(ChatColor.BOLD + "" + ChatColor.AQUA + "전투 경험치 2배 " + "[" + num + "분]");
		bar1.setProgress(num/10.0D);
	}
	
	public void bar2ChangeTime(int num) {
		bar2.setTitle(ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "강화 확률 증가 " + "[" + num + "분]");
		bar2.setProgress(num/10.0D);
	}
	
	public void bar3ChangeTime(int num) {
		bar3.setTitle(ChatColor.BOLD + "" + ChatColor.DARK_RED + "레이드 " + "[" + num + "분]");
		bar3.setProgress(num/10.0D);
	}
	
	public void bar1RemovePlayer() {
		for(Player player : bar1.getPlayers()) {
			bar1.removePlayer(player);
		}
	}
	
	public void bar2RemovePlayer() {
		for(Player player : bar2.getPlayers()) {
			bar2.removePlayer(player);
		}
	}
	
	public void bar3RemovePlayer() {
		for(Player player : bar3.getPlayers()) {
			bar3.removePlayer(player);
		}
	}
	
	public void bar1setStat(boolean bool) {
		bar1Stat = bool;
	}
	
	public void bar2setStat(boolean bool) {
		bar2Stat = bool;
	}
	
	public void bar3setStat(boolean bool) {
		bar3Stat = bool;
	}
	
	public boolean bar1isRun() {
		return bar1Stat;
	}
	
	public boolean bar2isRun() {
		return bar2Stat;
	}
	
	public boolean bar3isRun() {
		return bar3Stat;
	}
	
}
