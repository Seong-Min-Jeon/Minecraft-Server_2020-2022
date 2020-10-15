package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InteractVillager {

	Player player;
	Location loc;
	Entity ent;
	
	public boolean interactVillager(Player player, Entity ent) {
		this.player = player;
		this.ent = ent;
		loc = ent.getLocation();
		
		int i = 0;
		Inventory inv = player.getInventory();
		for (int j = 0 ; j < 36 ; j++) {
			if(inv.getItem(j) == null) {
				i++;
			}
		}
		if(i == 0) {
			if(((Villager)ent).getCanPickupItems() == false) {
				return false;
			} 
			player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
			return true;
		}
		
		return vil1() || vil2() || vil3() || vil4() || vil5() || vil6() || vil7() || vil8() || vil9() || vil10() || vil11() || vil12() || vil13() || vil14();
	}
	
	public boolean vil1() {
		//Ƽ�� ��� -680 51 1956  -672 46 1943
		if(loc.getX() <= -672 && loc.getZ() <= 1956 
				&& loc.getX() >= -680 && loc.getZ() >= 1943) {
			player.sendMessage("Ƽ�� ���: �̰��� Ƽ����. ���� ���Ѿ��� ������.");
			return true;
		}
		return false;
	}

	public boolean vil2() {
		//���϶����� ����Ʈ -1875 2690 -1863 2702
		if(loc.getX() <= -1863 && loc.getZ() <= 2702 
				&& loc.getX() >= -1875 && loc.getZ() >= 2690) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ������===")) {
					int qNum = cb.getNum(player);
					cb.mq3(player, qNum+1);		
				} else {
					player.sendMessage("������ ����: ����.. ����ð�.");
				}
			} catch(Exception e) {
				player.sendMessage("������ ����: ����.. ����ð�.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil3() {
		//�õ� ���� ���� -1152 43 1727  -1169 44 1742
		if(loc.getX() <= -1152 && loc.getZ() <= 1742 
				&& loc.getX() >= -1169 && loc.getZ() >= 1727) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�õ� ����===")) {
    				int qNum = cb.getNum(player);
    				cb.mq14(player, qNum + 1);
    			} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����2===")) {
					Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					ItemStack weapon1 = chest.getInventory().getItem(6);
					if(player.getInventory().contains(weapon1)) {
						int qNum = cb.getNum(player);
        				cb.mq15_1(player, qNum + 1);
					} else {
						player.sendMessage("����: ������ ��� �ִ°�?");
					}
    			} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��3===")) {
    				int qNum = cb.getNum(player);
    				cb.mq20(player, qNum + 1);
    			} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��5===")) {
    				int qNum = cb.getNum(player);
    				cb.mq20_2(player, qNum + 1);
    			} else {
    				player.sendMessage("����: �̰����� ���� ������ ���ٸ� �ʿ��ϴٸ� �ѷ����ð�.");
    			}
			} catch(Exception e) {
				player.sendMessage("����: �̰����� ���� ������ ���ٸ� �ʿ��ϴٸ� �ѷ����ð�.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil4() {
		//��ǣ���� �ķ�â�� -862 58 1370  -879 69 1389
		if(loc.getX() <= -862 && loc.getZ() <= 1389 
				&& loc.getX() >= -879 && loc.getZ() >= 1370) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ǣ���� ��===")) {
					int qNum = cb.getNum(player);
					cb.mq16(player, qNum+1);		
				} else {
					player.sendMessage("�Ҿ��� �ֹ�: �� �� �����");
				}
			} catch(Exception e) {
				player.sendMessage("�Ҿ��� �ֹ�: �� �� �����");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil5() {
		//�ܳ�� ���� ��� -1963 50 463  -1978 57 452
		if(loc.getX() <= -1963 && loc.getZ() <= 463  
				&& loc.getX() >= -1978 && loc.getZ() >= 452) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�ƶ����===")) {
					int qNum = cb.getNum(player);
					cb.mq22(player, qNum+1);		
				} else {
					
				}
			} catch(Exception e) {
				
			}
			player.sendMessage("��� ������: ����.. ���پ�!");
			player.teleport(new Location(player.getWorld(),-2417,52,489));
			ItemStack item = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.RED + "��������");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			return true;
		}
		return false;
	}
	
	public boolean vil6() {
		//�ܳ뿡�� ���� ��� -2410 52 488  -2426 56 496
		if(loc.getX() <= -2410 && loc.getZ() <= 496  
				&& loc.getX() >= -2426 && loc.getZ() >= 488) {
			player.sendMessage("��� ������: ����.. ���پ�!");
			player.teleport(new Location(player.getWorld(),-1970,52,455));
			ItemStack item = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.RED + "��������");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			return true;
		}
		return false;
	}
	
	public boolean vil7() {
		//�ܳ� ���� ���� -2481 74 524  -2470 66 536
		if(loc.getX() <= -2470 && loc.getY() <= 74 && loc.getZ() <= 536 
				&& loc.getX() >= -2481 && loc.getY() >= 66 && loc.getZ() >= 524) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����1===")) {
					int qNum = cb.getNum(player);
					cb.eq1(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����3===") && (player.getWorld().getTime() <= 13000 || player.getWorld().getTime() >= 23000)) {
					int qNum = cb.getNum(player);
					cb.eq1_2(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����1===")) {
					int qNum = cb.getNum(player);
					cb.mq25(player, qNum+1);		
				} else {
					player.sendMessage("���� ����: �Ŀ�.. ���� �ʹ� ���鱸��.");
				}
			} catch(Exception e) {
				player.sendMessage("���� ����: �Ŀ�.. ���� �ʹ� ���鱸��.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil8() {
		//�� �ϵ��� ���� ���� 994 -8
		if(loc.getX() <= -993 && loc.getZ() <= -7 
				&& loc.getX() >= -995 && loc.getZ() >= -9) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ſ��� ���2===")) {
					int qNum = cb.getNum(player);
					cb.eq2_1(player, qNum+1);	
					((LivingEntity) ent).addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1200, 0,true,false,false));
				} else {
					player.sendMessage("���� ����: ���� ���ſ� �뺴�̾���.");
				}
			} catch(Exception e) {
				player.sendMessage("���� ����: ���� ���ſ� �뺴�̾���.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil9() {
		//�������� ������ -927 857  -924 860
		if(loc.getX() <= -924 && loc.getZ() <= 860
				&& loc.getX() >= -927 && loc.getZ() >= 857) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ž1===")) {
					int qNum = cb.getNum(player);
					cb.mq29(player, qNum+1);	
					((LivingEntity) ent).addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1200, 0,true,false,false));
				} else {
					player.sendMessage("������: ���� ���� �˰� ����.");
				}
			} catch(Exception e) {
				player.sendMessage("������: ���� ���� �˰� ����.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil10() {
		//�� �ϵ��� ���� ���� 77 -23  74 -21
		if(loc.getX() <= 77 && loc.getZ() <= -21
				&& loc.getX() >= 74 && loc.getZ() >= -23) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ž2===")) {
					int qNum = cb.getNum(player);
					cb.mq29_1(player, qNum+1);	
				} else {
					player.sendMessage("ž�� ������: �̰��� ������ ž�̿�.");
				}
			} catch(Exception e) {
				player.sendMessage("ž�� ������: �̰��� ������ ž�̿�.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil11() {
		//���� 56 -292  58 -290
		if(loc.getX() <= 58 && loc.getZ() <= -290
				&& loc.getX() >= 56 && loc.getZ() >= -292) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ������ �԰� �;�===")) {
					int qNum = cb.getNum(player);
					cb.mq32(player, qNum+1);	
				} else {
					player.sendMessage("����: ����. �Ͼ�.");
				}
			} catch(Exception e) {
				player.sendMessage("����: ����. �Ͼ�.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil12() {
		//����ž 225 724  226 726
		if(loc.getX() <= 226 && loc.getZ() <= 726
				&& loc.getX() >= 224 && loc.getZ() >= 724) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===����ž�� ����===")) {
					int qNum = cb.getNum(player);
					cb.mq35(player, qNum+1);	
				} else {
					player.sendMessage("īŸ����: ����� ����ž�Դϴ�. ������ ��ȣ�� �ֱ⸦.");
				}
			} catch(Exception e) {
				player.sendMessage("īŸ����: ����� ����ž�Դϴ�. ������ ��ȣ�� �ֱ⸦.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil13() {
		//�հ� 929 528  932 530
		if(loc.getX() <= 932 && loc.getZ() <= 530
				&& loc.getX() >= 929 && loc.getZ() >= 528) {
			player.sendMessage("�ֹ�: �̰��� �����ο� ä�����̿�.");
			return true;
		}
		return false;
	}
	
	public boolean vil14() {
		//�հ� ���� 836 523  837 525
		if(loc.getX() <= 838 && loc.getZ() <= 525 
				&& loc.getX() >= 836 && loc.getZ() >= 523) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ��� �Ҹ��� �����°�===")) {
					int qNum = cb.getNum(player);
					cb.mq37(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �޷���===")) {
					int qNum = cb.getNum(player);
					cb.mq37_2(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �� ��� �Ҹ��� �����°�===")) {
					int qNum = cb.getNum(player);
					cb.mq38(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���̿��� ������===")) {
					int qNum = cb.getNum(player);
					cb.mq38_2(player, qNum+1);		
				} else {
					player.sendMessage("����: �Ŀ���.");
				}
			} catch(Exception e) {
				player.sendMessage("����: �Ŀ���.");
			}
			return true;
		}
		return false;
	}
	
}
