package testPack;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class BossHealth {

	private static BossBar bar1 = Bukkit.createBossBar(ChatColor.DARK_RED + "�ڳ���", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar2 = Bukkit.createBossBar(ChatColor.DARK_RED + "1���� ������", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar3 = Bukkit.createBossBar(ChatColor.DARK_RED + "2���� ������", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar4 = Bukkit.createBossBar(ChatColor.DARK_RED + "3���� ������", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar5 = Bukkit.createBossBar(ChatColor.DARK_RED + "�Ƶ�", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar6 = Bukkit.createBossBar(ChatColor.DARK_RED + "Ư�� �丮��", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar7 = Bukkit.createBossBar(ChatColor.DARK_RED + "���귻", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar8 = Bukkit.createBossBar(ChatColor.DARK_RED + "�߷θ�", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar9 = Bukkit.createBossBar(ChatColor.DARK_RED + "�������� ƼŸ�Ͼ�", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar10 = Bukkit.createBossBar(ChatColor.DARK_RED + "������ ������", BarColor.RED, BarStyle.SOLID);
	private static BossBar bar11 = Bukkit.createBossBar(ChatColor.DARK_RED + "�ƶ�ũ��", BarColor.RED, BarStyle.SOLID);
	
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
	
	public BossBar getBar5() {
		return bar5;
	}
	
	public BossBar getBar6() {
		return bar6;
	}
	
	public BossBar getBar7() {
		return bar7;
	}
	
	public BossBar getBar8() {
		return bar8;
	}
	
	public BossBar getBar9() {
		return bar9;
	}
	
	public BossBar getBar10() {
		return bar10;
	}
	
	public BossBar getBar11() {
		return bar11;
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
		} else if(bar5.getPlayers().contains(player)) { 
			bar5.removePlayer(player);
		} else if(bar6.getPlayers().contains(player)) { 
			bar6.removePlayer(player);
		} else if(bar7.getPlayers().contains(player)) { 
			bar7.removePlayer(player);
		} else if(bar8.getPlayers().contains(player)) { 
			bar8.removePlayer(player);
		} else if(bar9.getPlayers().contains(player)) { 
			bar9.removePlayer(player);
		} else if(bar11.getPlayers().contains(player)) { 
			bar11.removePlayer(player);
		}
		if(bar10.getPlayers().contains(player)) { 
			bar10.removePlayer(player);
		}
	}
	
	
}
