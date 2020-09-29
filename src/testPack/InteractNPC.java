package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InteractNPC {

	QuestBoard qb = new QuestBoard();
	Player player;
	Location loc;
	
	public boolean interactNPC(Player player, Entity ent) {
		this.player = player;
		loc = ent.getLocation();
		
		int i = 0;
		Inventory inv = player.getInventory();
		for (int j = 0 ; j < 36 ; j++) {
			if(inv.getItem(j) == null) {
				i++;
			}
		}
		if(i == 0) {
			player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
			return true;
		}
		
		return npc1() || npc2() || npc3() || npc4();
	}
	
	public boolean npc1() {
		//�ǹ��� �ҳ� -2503 53 531
		if(loc.getX() == -2503 && loc.getY() == 53 && loc.getZ() == 531) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����3===")) {
					player.sendMessage("�ǹ��� �ҳ�: ...");
				}
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����2===")) {
					if(player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
						int qNum = cb.getNum(player);
						cb.eq1_1(player, qNum+1);	
					} else {
						player.sendMessage("�ǹ��� �ҳ�: ...");
					}
				}
			} catch(Exception e) {

			}
			return true;
		}
		return false;
	}
	
	public boolean npc2() {
		//��� -2453 84 751
		if(loc.getX() == -2453 && loc.getY() == 84 && loc.getZ() == 751) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����5===")) {
					player.sendMessage("���: ���岲���� ��eī�� ������f�� ��� ���̴�.");
				}
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����4===")) {
					int qNum = cb.getNum(player);
					cb.eq1_3(player, qNum+1);	
				}
			} catch(Exception e) {

			}
			return true;
		}
		return false;
	}
	
	public boolean npc3() {
		//���� -2433 28 796
		if(loc.getX() == -2433 && loc.getY() == 28 && loc.getZ() == 796) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����6===")) {
					int qNum = cb.getNum(player);
					cb.eq1_5(player, qNum+1);
				}
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����5===")) {
					
					boolean wear = false;
					
					if (player.getInventory().getHelmet() != null) {
						if (player.getInventory().getChestplate() != null) {
							if (player.getInventory().getLeggings() != null) {
								if (player.getInventory().getBoots() != null) {
									
									if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� ���")) {
										if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� ����")) {
											if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� ����")) {
												if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "���� �Ź�")) {
													wear = true;
												}
											}
										}
									}
									if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�������� ���� ���")) {
										if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�������� ���� ����")) {
											if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�������� ���� ����")) {
												if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�������� ���� �Ź�")) {
													wear = true;
												}
											}
										}
									}
									
								}
							}
						}
					}
					
					if(player.getInventory().contains(Material.ORANGE_DYE)) {
						wear = true;
					}
					
					if(wear == true) {
						player.getInventory().setHelmet(null);
						player.getInventory().setChestplate(null);
						player.getInventory().setLeggings(null);
						player.getInventory().setBoots(null);
						
						int qNum = cb.getNum(player);
						cb.eq1_4(player, qNum+1);
					} else {
						player.sendMessage("��7���岲���� �ٺ����δ�. ���߿� �ٽ� ����.");
					}
					
				}
			} catch(Exception e) {

			}
			return true;
		}
		return false;
	}
	
	public boolean npc4() {
		//�������� 
		if(loc.getX() == 291 && loc.getY() == 55 && loc.getZ() == 153) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�״�� ��������===")) {
					int qNum = cb.getNum(player);
					cb.mq33(player, qNum+1);	
				}
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�Ǵٽ� ��������===")) {
					int qNum = cb.getNum(player);
					cb.mq34(player, qNum+1);	
				}
			} catch(Exception e) {

			}
			return true;
		}
		return false;
	}

	
}
