package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class PlayerStat {

	public void viewStat(Player player) {
		int lvl = player.getLevel();
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "�� �������� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*8) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*8)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)"  + " ����: �� ������");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "����� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*5) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*5)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: ���");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "������Ʈ�� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*8) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*8)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: ������Ʈ");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "�������� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*2) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*2)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: ������");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "���ڻ��� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*10) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*10)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: ���ڻ�");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "������ ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*20) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*20)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " Ư��: ����");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "������ ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*30) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*30)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " Ư��: ����");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "�������� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*20) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*20)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: ������");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "�׸��� ������ ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*8) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*8)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: �׸��� ����");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "����Ŀ�� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*3) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*3)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: ����Ŀ");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "������ ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*15) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*15)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: ����");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "�׸� ������ ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*10) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*10)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " Ư��: �׸� ����");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "������ ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*50) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*50)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " Ư��: ����");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "�ȶ���� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*99) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*99)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: �ȶ��");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "������ ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*80) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*80)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: ����");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "������� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*40) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*40)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ��å: �����");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "��ó�� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*10) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*10)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: ��ó");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "�Ŀ��������� ��ǥ")) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "�ִ� ü��: " + (20 + lvl*60) + " ���� ü��: " + (int)(player.getHealth()*((20 + lvl*60)/20.0)) + 
					" ����: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " ����: �Ŀ�������");
		}
	}
	
}
