package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class PlayerStat {

	public void viewStat(Player player) {
		int lvl = player.getLevel();
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "본 파이터의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*8) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*8)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)"  + " 직업: 본 파이터");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "기사의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*5) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*5)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 기사");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "프리스트의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*8) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*8)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 프리스트");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "광전사의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*2) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*2)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 광전사");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "도박사의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*10) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*10)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 도박사");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "데빌의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*20) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*20)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 데빌");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "엔젤의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*30) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*30)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 엔젤");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "대행자의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*20) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*20)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 대행자");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "그림자 무사의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*8) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*8)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 그림자 무사");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "버서커의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*3) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*3)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 버서커");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "군인의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*15) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*15)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 군인");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "그림 리퍼의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*10) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*10)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 그림 리퍼");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "마인의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*50) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*50)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 마인");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "팔라딘의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*99) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*99)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 팔라딘");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "용기사의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*80) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*80)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 용기사");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "조커의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*40) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*40)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 조커");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "아처의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*10) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*10)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 아처");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "파워레인저의 증표")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*60) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*60)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 파워레인저");
		}
	}
	
}
