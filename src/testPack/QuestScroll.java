package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class QuestScroll {
	
	private Message msg = new Message();

	public void quest(Player player, Item itemArg) {
		World world = player.getWorld();
		QuestBoard qb = new QuestBoard();
		if(itemArg.getItemStack().getType() == Material.GLOBE_BANNER_PATTERN) {
			if(qb.getQuestName(player)==null) {
				itemArg.remove();
				q1(player, itemArg, world);
				q2(player, itemArg, world);
				q3(player, itemArg, world);
				q4(player, itemArg, world);
				q5(player, itemArg, world);
				q6(player, itemArg, world);
				q7(player, itemArg, world);
				q8(player, itemArg, world);
				q9(player, itemArg, world);
				q10(player, itemArg, world);
				q11(player, itemArg, world);
				q12(player, itemArg, world);
				q13(player, itemArg, world);
				q14(player, itemArg, world);
				q15(player, itemArg, world);
				q16(player, itemArg, world);
				q17(player, itemArg, world);
				q18(player, itemArg, world);
				eq1(player, itemArg, world);
				eq2(player, itemArg, world);
				mq1(player, itemArg, world);
				mq2(player, itemArg, world);
				mq3(player, itemArg, world);
				mq4(player, itemArg, world);
				mq5(player, itemArg, world);
				mq6(player, itemArg, world);
				mq7(player, itemArg, world);
				mq8(player, itemArg, world);
				mq9(player, itemArg, world);
				mq10(player, itemArg, world);
				mq11(player, itemArg, world);
				mq12(player, itemArg, world);
				mq13(player, itemArg, world);
				mq14(player, itemArg, world);
				mq15(player, itemArg, world);
				mq16(player, itemArg, world);
				mq17(player, itemArg, world);
				mq18(player, itemArg, world);
				mq19(player, itemArg, world);
				mq20(player, itemArg, world);
				mq21(player, itemArg, world);
				mq22(player, itemArg, world);
				mq23(player, itemArg, world);
				mq24(player, itemArg, world);
				mq25(player, itemArg, world);
				mq26(player, itemArg, world);
				mq27(player, itemArg, world);
				mq28(player, itemArg, world);
				mq29(player, itemArg, world);
				mq30(player, itemArg, world);
				mq31(player, itemArg, world);
				mq32(player, itemArg, world);
				mq33(player, itemArg, world);
				mq34(player, itemArg, world);
				mq35(player, itemArg, world);
				mq36(player, itemArg, world);
				mq37(player, itemArg, world);
				mq38(player, itemArg, world);
				mq39(player, itemArg, world);
				mq40(player, itemArg, world);
			} else {
				itemArg.remove();
				player.getInventory().addItem(itemArg.getItemStack());
				player.sendMessage(ChatColor.RED + "�̹� ����Ʈ�� ����ǰ� �ֽ��ϴ�.");
				player.sendMessage(ChatColor.RED + "���� ����Ʈ�� �Ϸ��ϰ� ������ּ���.");				
			}
		}
		
	}
	
	public void q1(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "����Ʈ: �ؾ��� ����")) {
			msg.msg(player, "��7��e�ؾȰ� �����7�� ������ �踦 ��Ű��.");
			QuestBoard qb = new QuestBoard();
			qb.q1(player, 0);
		}	
	}
	
	public void q2(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "����Ʈ: �������� ����")) {
			msg.msg(player, "��7���״� �չٴٿ� ��e��������7�� ����Ѵٴ� ������ ���Դ�.%��7�������� ���� ��e�������ڡ�7�� ã�ƺ���.");
			QuestBoard qb = new QuestBoard();
			qb.q2(player, 0);
		}	
	}
	
	public void q3(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "����Ʈ: �������� ����")) {
			msg.msg(player, "��7���������� ������ �����ϰ� �̲� �� �ֵ��� ���� ������ �׾ƺ���.%��7��ħ �� �ٹ濡 ������ �� ���� ���� ��eũ����Ż �������7�� �����Ѵٰ� �Ѵ�.");
			QuestBoard qb = new QuestBoard();
			qb.q3(player, 0);
		}	
	}
	
	public void q4(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "����Ʈ: �� ��ɲ�")) {
			msg.msg(player, "��7�������� �� ���� ��ġ�� �ֹ��� �߰��ߴ�.%��7�׵��� �ż��� ó������.");
			QuestBoard qb = new QuestBoard();
			qb.q4(player, 0);
		}	
	}
	
	public void q5(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "����Ʈ: ħ����")) {
			msg.msg(player, "��7�� �� ���Ͱ� ���� �޾Ҵٰ� �Ѵ�.%��7�׵��� ó���� �ֹε��� �Ҿ����� ��������.");
			QuestBoard qb = new QuestBoard();
			qb.q5(player, 0);
		}	
	}
	
	public void q6(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "����Ʈ: �� ���� ��")) {
			msg.msg(player, "��7��e���� ������7���� ������ ã�ƺ���.");
			QuestBoard qb = new QuestBoard();
			qb.q6(player, 0);
		}	
	}

	public void q7(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "����Ʈ: ������ ��ȭ�ϴ� ��")) {
			msg.msg(player, "��7��e���� ������7�� ���͵��� ���������ٴ� �ҹ��� �ִ�.%��7������ Ŭ�����ؼ� ��ȭ�ϵ��� ����.");
			QuestBoard qb = new QuestBoard();
			qb.q7(player, 0);
		}	
	}
	
	public void q8(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "����Ʈ: ���ƺ������� �ٸ�")) {
			msg.msg(player, "��7��e�����7�� ��e��ũ��7�� ��ƺ�������%��7�Ѹ����� �ٸ� �����̴�.%��7���� ��ũ�� �� ���ϴ�.");
			QuestBoard qb = new QuestBoard();
			qb.q8(player, 0);
		}	
	}
	
	public void q9(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "����Ʈ: �������� ����")) {
			msg.msg(player, "��7�������� �����븦 �����.");
			QuestBoard qb = new QuestBoard();
			qb.q9(player, 0);
		}	
	}
	
	public void q10(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "����Ʈ: Żȯ")) {
			msg.msg(player, "��7��e��ǣ���� ����7�� Żȯ�ϱ� ���� ��������.");
			QuestBoard qb = new QuestBoard();
			qb.q10(player, 0);
		}	
	}
	
	public void q11(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "����Ʈ: ��ũ�κ���")) {
			msg.msg(player, "��7�ֱ� ��e�������7���� ��e����� �������� �ա�7�� ��Ȱ��Ű���� �Ѵٴ� �ҹ��� �ִ�.%��7���� �׵��� ������ ���� ��ü�� ã�� ���� ������ �����ȴ�.%��7������ �׵��� ó������.");
			QuestBoard qb = new QuestBoard();
			qb.q11(player, 0);
		}	
	}
	
	public void q12(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "����Ʈ: ���� ����")) {
			msg.msg(player, "��7��¾��� �����ϱ� ���� ���� ���ϴ� �������%��7���κ��� ���� �����ߴ�.%��7�׷��� ���ĵ��� Ž���� ����� ��κ� �Ҹ��Ͽ�����,%��7�������� �����ִ� ������ �ִ�.%��7������� �׵��� ��e������7�̶�� �θ���,%��7�׵��� �������� ����� ���� �ٿ��� ��e���� ���ڡ�7��� �θ���.%"
					+ "��7�׵��� ���� ���� ���� ��� ���� ��ӵ� �ΰ� ����� �ϰ� �ִ�.%��7�׵鿡�� �ΰ��� ������ �����ֵ��� ����.");
			QuestBoard qb = new QuestBoard();
			qb.q12(player, 0);
		}	
	}
	
	public void q13(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "����Ʈ: ���ο� ���")) {
			msg.msg(player, "��7Ǫ�� ����� �����ϴ� ���ο� ������ ������� �� �� �־���.%��7...%��7��ũ���� ���� ����� ó�� ���±�!");
			QuestBoard qb = new QuestBoard();
			qb.q13(player, 0);
		}	
	}
	
	public void q14(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "����Ʈ: ���� �Ǹ�")) {
			msg.msg(player, "��7���� �����̴� ���� ���� �Ǹ��� ��� �־��ٰ� �Ѵ�.%��7������� ����� �� ���� ������ �԰� �������� �� �Ǹ���%��7�Ŀ� �п��Ͽ� ������ ����� �ϰ� �Ǿ���.");
			QuestBoard qb = new QuestBoard();
			qb.q14(player, 0);
		}	
	}
	
	public void q15(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "����Ʈ: ���ع��� �ı����� ��I")) {
			msg.msg(player, "��7�ı����� ���κ��� �ֹ� ������ �ı��ϴ� ����ü����.%��7�׵鿡�� �÷��̾��� ���� ��������.");
			QuestBoard qb = new QuestBoard();
			qb.q15(player, 0);
		}	
	}
	
	public void q16(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "����Ʈ: ������ ��Ű�� ��")) {
			msg.msg(player, "��7������ ���͵��� ������ ��Ű�� ������ �ִ�.%��7������ �׵��� �ڽŵ��� ������ �̿��� ���谡���� ȥ���� ���߸��� �ִ�.");
			QuestBoard qb = new QuestBoard();
			qb.q16(player, 0);
		}	
	}
	
	public void q17(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "����Ʈ: ��ź��")) {
			msg.msg(player, "TNTZ ������.%���ۼj�ۤä�������������%��7...�̶�� ���ִ�.");
			QuestBoard qb = new QuestBoard();
			qb.q17(player, 0);
		}	
	}
	
	public void q18(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "����Ʈ: ������ ����")) {
			msg.msg(player, "��7������ ���� ������ �ҳ��̾���.%��7������ ���������� ��Ÿ�� ����, ������ ������ ���� ��Ű�� ����%��7�������� �ο����� �Ǿ���.%��7ȥ�ڼ��� �������̶� �ڱ⸦ �����Ͽ� �پ��� ���·� �ڽ��� ������ �÷ȴ�.%"
					+ "��7�׷��� �� ���ķ� ����� �����ǰų� ������� ���� ������������ �ذ� �Ǿ���.");
			QuestBoard qb = new QuestBoard();
			qb.q18(player, 0);
		}	
	}
	
	public void eq1(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "����Ʈ�� ����Ʈ: ������ ����")) {
			QuestBoard qb = new QuestBoard();
			qb.eq1(player, 0);
		}	
	}
	
	public void eq2(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "����Ʈ�� ����Ʈ: ���ſ��� ���")) {
			QuestBoard qb = new QuestBoard();
			qb.eq2(player, 0);
		}	
	}
	
	public void mq1(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 1��")) {
			msg.msg(player, "��7��e���״ҡ�7�� ��e���� ����7�� �������ִ� ��� �������� ������ ��e��������7�鿡�� ������ ���� ������.%��7���� ���ϰ� �ֱ⿡�� ���ذ� �Ǳ� ������ �ų� ���������� ���� �׵鿡�� �ΰ� ������ ���ĿԴ�.%��7������ ������ �ڵ��� �������� ���� ��eŸ����7�ϰ� �Ǿ���.");
			QuestBoard qb = new QuestBoard();
			qb.mq1(player, 0);
		}	
	}
	
	public void mq2(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 2��")) {
			msg.msg(player, "��7�������� ����ϴ� ���� �⸣���� ����ε��� ��e������7�� �������.%��7���� ���� ���͵��� �������ʹ� �޸� ������ ������ �ο��� ������, ħ���ڿ��Դ� �������̴�.");
			QuestBoard qb = new QuestBoard();
			qb.mq2(player, 0);
		}	
	}
	
	public void mq3(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 3��")) {
			msg.msg(player, "��7��e���������� �ա�7�� ó���ϴ� ���� �������� ����� ������ ���۵� ���̴�.");
			QuestBoard qb = new QuestBoard();
			qb.mq3(player, 0);
		}	
	}
	
	public void mq4(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 4��")) {
			msg.msg(player, "������ ����: ���� Ȳ�Ҹ� ������ ���� ���� û����� ���� ���ƿ��� �ʰ� �ִٳ�.%������ ����: �� �߿��� �츮 �Ƶ鵵 �ּ�.%������ ����: �ε� �׵��� ã���ְԳ�.");
			QuestBoard qb = new QuestBoard();
			qb.mq4(player, 0);
		}	
	}
	
	public void mq5(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 5��")) {
			msg.msg(player, "������ ����: ��� �Ƶ鿡�Լ� ������ �Գ׸�%������ ����: ��e���� ������f�� ���� ��Ȳ�̶�� �ϴ±�.%������ ����: �̹����� ���� �����ֱ� �ٶ��.%������ ����: �� �̹� ���� �ذ����ָ� ��e���� ���� ������f�� �ֵ��� ����%������ ����: ����ϰڳ�.");
			QuestBoard qb = new QuestBoard();
			qb.mq5(player, 0);
		}	
	}

	public void mq6(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 6��")) {
			msg.msg(player, "������ ����: �׷�. ���� ���� ������ �˷��ֵ��� ����.%������ ����: �츮 ���� ���ʿ� ���� ���� ������ �����Ծ�.%������ ����: �ű� ��e�� ���� �����f�̶��� �θ���.%������ ����: �̸��� ������ ���� �� ������%������ ����: �ƴ� �װ� �߿��Ѱ� �ƴ���.%"
					+ "������ ����: �׷��� �ణ�� ����ֱ� �ٶ��.%������ ����: �� ���� ������ �ΰ��� �絵�ϰ� ���� �� 300�� ���ΰ�.%������ ����: ���ο� ������ ��Ÿ���ٳ�.%"
					+ "������ ����: �װ��� �ٷ� ��e�ĸ�Ȧ�С�f����.%������ ����: �׵��� ������ �밨�� ���谡�� �η��� ���Ӿ��� �¼��� ����� �����ٰ� ������ �����ߴٰ� �ϳ�.%������ ����: ���к��� ���ش޶��?%"
					+ "������ ����: ����.. �˰ڳ�.%������ ����: �׵��� ������ ��e���� ���� ����f�� �����ϸ鼭 ��e���� �š�f���� ����� �ξ���.%������ ����: �״� ���� ���� ���� ������ ���������.%"
					+ "������ ����: �� �� �߿��� ����� �ŵ� �־����� �翬�� ����� �³�.%������ ����: ������ �ᱹ �ĸ�Ȧ�е� �������� ���� �ĸ���ϰ� ����.%������ ����: ���ڱ� �װ� ���� �ǳİ�?%"
					+ "������ ����: ��¿ �� ����. ��� �������� ������ ��eŰ���� �⸮���㽺��f��� �Ҹ��� �ι��̿��µ� ���̾�.%������ ����: �״� �Ű� �¸Դ� ���� �����ٰ� �ϴ±�.%"
					+ "������ ����: ���� ������ �� �߿��� ���� �������� �پ�� ���� ������ �˷����ֳ�.%������ ����: ��·�� �ĸ�Ȧ���� ������ ���� ���� ������ ���� ��e�ˡ�f�� �ֳ�.%"
					+ "������ ����: �� ���� ���� ���� ���� �ƴ�����.. ���� �پ ���ϼ�.%������ ����: �׸��� �� ���� �ĸ�Ȧ���� ������ �ٷ� ��e�� ���� �����f ��򰡿� ���� �ִٴ���.%"
					+ "������ ����: ���ݱ��� �� �ƹ��� �� ���� ã�� �ʾҳİ�?%������ ����: ����.. �� �����̵� �� ���� �̾ƺ��� �ߴٸ�..%������ ����: �����ߴٳ�.%"
					+ "������ ����: �츮 ���� û��鵵 ��� ����Ŀ� �� ���� �������ϳ� ���� ������ �ڰ� ����.%������ ����: ���� �������� �츮���� ��e�÷��̾��f�� �ƴ϶�鼭%������ ����: ����� ���� �÷��̾��� ���簡 ���� ���� ���� �� �ִٰ� �ߴٳ�."
					+ "������ ����: ��, �װ� ���� ������ ���� ������ ���� ������.%������ ����: �ڳ׿��� ���� �ðܺ���.%������ ����: ��, ������ �ֳ׸�.%"
					+ "������ ����: �÷��̾ ���������� ������ ����� ���ؾ� ���� �� �ִ���.%������ ����: �� ���� ������� ��e�����f�� ��� �ڳ��� ������ �����ϰԳ�.");
			QuestBoard qb = new QuestBoard();
			qb.mq6(player, 0);
		}	
	}
	
	public void mq7(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 7��")) {
			msg.msg(player, "������ ����: ����. ��e������ �ˡ�f�� ��� �ִ��� �˷�����.%������ ����: �ٷ�..%������ ����: ��� ��򰡿� ��e���� ���f�� �ִٳ�.%������ ����: �˾Ƽ� �� ã�ƺ���. ����.");
			QuestBoard qb = new QuestBoard();
			qb.mq7(player, 0);
		}	
	}
	
	public void mq8(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 8��")) {
			msg.msg(player, "������ ����: ������.. ���� ������� ���� �� ���� ����� �����Ȱ� �ƴ� �� �������׷�.%������ ����: �� ���� ������� ��e�ĸ�Ȧ�п� ���� ��ϡ�f�� ���� �����ִٳ�.%������ ����: �ð��� ���ٸ�.. �ѹ� ã�ƺ��Գ�.");
			QuestBoard qb = new QuestBoard();
			qb.mq8(player, 0);
			if(player.getLevel() >= 70) {
				qb.mq8(player, 1);
			}
		}	
	}
	
	public void mq9(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 9��")) {
			msg.msg(player, "��7���� ������Ű�� ���� ���� �� �� ���� �� ����.%��7�ϴ� �� �� ����������.");
			QuestBoard qb = new QuestBoard();
			qb.mq9(player, 0);
		}	
	}
	
	public void mq10(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 10��")) {
			msg.msg(player, "Ƽ���� ������: ��뿡 ���� ��e�� ���迡 ������ �ִ� ���ǡ�f�� �˰� �� ���� �־�.%Ƽ���� ������: ���� ��뿡 ������ �Ͱ�����%Ƽ���� ������: ���� �ʸ� ���� �� ���ڱ�.%Ƽ���� ������: �ۿ� �ִ� ��e�ܴ��� ���� ��������f���� ó���ϰ� ��!");
			QuestBoard qb = new QuestBoard();
			qb.mq10(player, 0);
		}	
	}
	
	public void mq11(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 11��")) {
			msg.msg(player, "Ƽ���� ������: ��뿡 ���� ��e������ ������f�� �����ž�.%Ƽ���� ������: �ű�� ����.");
			QuestBoard qb = new QuestBoard();
			qb.mq11(player, 0);
		}	
	}
	
	public void mq12(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 12��")) {
			msg.msg(player, "Ƽ���� ������: ��뿡 ���ٿԾ�?%Ƽ���� ������: ��e������ �� �ٳ� �ô��f�� ������ ��e��ο��� ����� �����ִ� ����f���� ��������..%"
					+ "Ƽ���� ������: �� ���� �츮���Ը��� ����� �����ִ� ����.%Ƽ���� ������: ��e�¾��� ����f�� ���� �����ϰ�, ��e���� ����f�� �㿡 ������ �� ���� ������ ��� ���߾�����.%"
					+ "Ƽ���� ������: ����� ��뿡�� ���� ����� ã�Ҵ����� �𸣰ڴµ� ���� ���̳� �¾��� ���� ã���� �ƴ� �� ����%Ƽ���� ������: ���� ���� ����!");
			QuestBoard qb = new QuestBoard();
			qb.mq12(player, 0);
		}	
	}
	
	public void mq13(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 13��")) {
			msg.msg(player, "Ƽ���� ������: ��ȭ..�˰� ����?%Ƽ���� ������: ��e�õ� �����f���� ä���� �� �� ��������.%Ƽ���� ������: �������鿡 ���� ������ ���ε��� ���� ���°ɷ� �˱��ϴµ�%"
					+ "Ƽ���� ������: �������� �����ְ��� ��.%Ƽ���� ������: ��� ������ ���� ������ �������� ���� �濡 �ִ� �ǵ��� �͵��� ó���ϰ� ����.");
			QuestBoard qb = new QuestBoard();
			qb.mq13(player, 0);
		}	
	}
	
	public void mq14(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 14��")) {
			msg.msg(player, "��7�õ� �������� ������.");
			QuestBoard qb = new QuestBoard();
			qb.mq14(player, 0);
		}	
	}
	
	public void mq15(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 15��")) {
			msg.msg(player, "����: �׳����� ��ŵ� ���谡��?%����: ���� �ʿ��� ������ �ִµ� ������ �� �ְڳ�?%����: ��e��������f�̶�� ���� �ֺ��� ��e����f�� �ֳ�.%����: �װ��� ��e�������� ������f�� �����ִ� ��Ұ� �ֳ�.%����: �ٳ���ֱ� �ٶ��.");
			QuestBoard qb = new QuestBoard();
			qb.mq15(player, 0);
		}	
	}
	
	public void mq16(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 16��")) {
			msg.msg(player, "����: �� �ϰ� �������� �𸣰����� �̰��� ���� ���谡���� ���� ��e��ǣ���� ����f���� ������ �� �ϴ���%����: �ڳ׵� ������ ���� ��ڳ�?");
			QuestBoard qb = new QuestBoard();
			qb.mq16(player, 0);
		}	
	}
	
	public void mq17(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 17��")) {
			msg.msg(player, "�Ҿ��� �ֹ�: �� ���� ��� ����ε� �������� ������ ���Ծ�.%�Ҿ��� �ֹ�: �� �� �����.");
			QuestBoard qb = new QuestBoard();
			qb.mq17(player, 0);
		}	
	}
	
	public void mq18(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 18��")) {
			msg.msg(player, "��7�ֹ��� ���� ��e���ǡ�7�� �˾Ƴ��� ���� ��e���簡��7�� ã�ƺ���.");
			QuestBoard qb = new QuestBoard();
			qb.mq18(player, 0);
		}	
	}
	
	public void mq19(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 19��")) {
			msg.msg(player, "��7���簡�� ã������ �ǹ̰� ������%��7���簡�� ã�ƴٳ�ٴ� ��e���谡��7�� ���� �����غ���.%��7���� ���� ���� ���� ��e������7�� ��Ʈ�� ���� �� ����.");
			QuestBoard qb = new QuestBoard();
			qb.mq19(player, 0);
		}	
	}
	
	public void mq20(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 20��")) {
			msg.msg(player, "��7���谡�� ������ �Ѿ� ��e�õ� �����7���� ������.");
			QuestBoard qb = new QuestBoard();
			qb.mq20(player, 0);
		}	
	}
	
	public void mq21(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 21��")) {
			msg.msg(player, "��7��eƼ�� ����7 ��ó�� ������ �ڰ� ��Ÿ���ٰ� �Ѵ�.%��7Ƽ�� ��븦 ���� ������.");
			QuestBoard qb = new QuestBoard();
			qb.mq21(player, 0);
		}	
	}
	
	public void mq22(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 22��")) {
			msg.msg(player, "��7���谡�� ���� ������ �ʰ� ����ξ��ٴ� ����%��7���� ���� �־��� �� ����.%��7���谡�� ���� ���� ������ ��e�ƶ�����7�� ������.");
			QuestBoard qb = new QuestBoard();
			qb.mq22(player, 0);
		}	
	}
	
	public void mq23(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 23��")) {
			msg.msg(player, "��7���� �ƶ������� ������%��7��e���� ������7�� ��� �ִ����� �� �� ������.%��7�ֺ��� ���͸� ��ư��鼭 ������ �������� ������ ã�ƺ���.");
			QuestBoard qb = new QuestBoard();
			qb.mq23(player, 0);
		}	
	}
	
	public void mq24(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 24��")) {
			msg.msg(player, "��a���谡��d>>��a" + player.getDisplayName() + " ��b����. ���� �ֳ�.%��a���谡��d>>��a" + player.getDisplayName() + " ��bmsg Ŀ�ǵ带 �ѹ� ��ô�.%���谡: �� �̰͵� �� �Ѱ踦 ���� ���̸� ���� ����� �ʿ䵵 ���µ� ������.%"
					+ "���谡: ���� ī�� ������ �ִ�.%���谡: ���⼭ ��ٸ����� ����.");
			QuestBoard qb = new QuestBoard();
			qb.mq24(player, 0);
		}	
	}
	
	public void mq25(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 25��")) {
			msg.msg(player, "���� ����: �ű� �ڳ�.%���� ����: �̰��� �� ������ ���� �ʾҰ���?%���� ����: ������ �� �״� ������ ���ð�.");
			QuestBoard qb = new QuestBoard();
			qb.mq25(player, 0);
		}	
	}
	
	public void mq26(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 26��")) {
			ItemStack rewardKey = new ItemStack(Material.PAPER);
			ItemMeta rewardKeyIm = rewardKey.getItemMeta();
			rewardKeyIm.setDisplayName(ChatColor.YELLOW + "�������� ������");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "���а� �̵��� �� �ִ� ������");
			rewardLore.add(ChatColor.GRAY + "�ƶ���� ���� ���� ��. ���� ���� �տ��� ����غ���.");
			rewardKeyIm.setLore(rewardLore);
			rewardKey.setItemMeta(rewardKeyIm);
			player.getInventory().addItem(rewardKey);
			msg.msg(player, "���� ����: �������� �ϼ��Ǿ��ٳ�.%���� ����: ������� ���°� ������ �� ���Ƽ�..%���� ����: ����Ʈ ��ũ�ѿ� �־���ٳ�.%���� ����: �̹� �κ��丮�� �������� ���� ���̾�.%���� ����: �������� ��e�ƶ����� ���� ���� ����f.%���� ����: �װ��� �ִ� ��e���� ���� �ա�f���� ����ϸ� �ȴٳ�.");
			QuestBoard qb = new QuestBoard();
			qb.mq26(player, 0);
		}	
	}
	
	public void mq27(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 27��")) {
			msg.msg(player, "bl120%��7�Ӹ��� ���������.%��7�������� ����� ������ ���� ����� ���.%tp-2223 64 -2435%����Ʈ��: " + player.getDisplayName() + " �༮�� ���� �����ϰ� �ֽ��ϴ�.%����Ʈ��: ��� ���� ��ȹ����Դϴ�.%�ǹ��� ����: �׷�.%"
					+ "�ǹ��� ����: �� �༮�� �� �߷� ã�ƿ´ٸ�, ���� --�� �ݺ����� �ʾƵ� �ǰڱ�.%����Ʈ��: ���� �� ���� ���� �̷�� �Ǵ� ���Դϱ�.%�ǹ��� ����: ������.. �׾ ���� �ʴ� ��ü�� ���� ��e�÷��̾��f��..%�ǹ��� ����: ���� ���� ������ �� �� ������.%"
					+ "�ǹ��� ����: ���� ���� �̵��� ���ڰ�.%�ǹ��� ����: ���ݺ��� --���� ����.%����Ʈ��: " + player.getDisplayName() + " �༮�� ���� ���� ��ٸ��� �ʴ� ���Դϱ�?%�ǹ��� ����: ���ݱ��� �׷��� ��ó�� �� �༮�� --�� ���� �츮������ ���� �ɰŴ�.%"
					+ "�ǹ��� ����: �ƹ��͵� �𸣰� ������.%tp-491 55 1312%???: ��..�ƾ�.%???: �鸮�ʴϱ�?%???: ���� ����Ʈ�� ���� ��e�׺��f�Դϴ�.%�׺�: �Ʊ���� ���� ������ �׷��� �Ͻʴϱ�?%�׺�: ũ��. ŭ. ����Ʈ �ٽ� ����帳�ϴ�!%"
					+ "�׺�: �̹� ����Ʈ�� ī�̸��� ��ô� ��� �в��� �Ƿ��Ͻ� �����Դϴ�.%�׺�: ��eī�̸� ���ʿ� �ˡ�f�� �ϳ� �ִٰ� �ϴµ���. �ű⿡ �Ź̵��� �뷮 �߻��ߴٰ� �մϴ�!%�׺�: ��.. �츮�� ó���� �ص� �ٽ� ��Ÿ�� ���������..%"
					+ "�׺�: �Ƿ��ں��� ���� ����ġ�� �����ϼ����� �ѹ� ��������?%�׺�: �׷� ���õ� �����Ͻʼ�~!");
			QuestBoard qb = new QuestBoard();
			qb.mq27(player, 0);
		}	
	}

	public void mq28(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 28��")) {
			msg.msg(player, "�׺�: �ϴ� �츮�� 1������ ��ǥ�� ���� �޼� ������ �صѱ��?%�׺�: ���� ������ �������Ͱ� ��������.%�׺�: �׷� �����δ� ���� ����Ʈ, ����� ����Ʈ �������%�׺�: ����ġ �����ϰ� �ִ� �ɷ� ���� �����ص帱����!%"
					+ "�׺�: ������ ���� ������ ������ ����Ʈ��.. �̰ų׿�!%�׺�: �Ź̵��� ������ �� ����Ͻ���?%�׺�: �ű⼭ �������� ���� ���� ��e�������̰� ���� �Ǵٸ� �ˡ�f�� ���´ٰ� �ؿ�.%�׺�: �ű⿡ ��e������ ���ſա�f�̶�� ��e�ʵ庸�� ���͡�f�� �����µ�..%"
					+ "�׺�: �׷��� ���� ���ݱ��� �ʵ庸������ ���͸� �� ���� �־�����?%�׺�: ���� ó������ �� ���ƿ�.%�׺�: ��밡 �󸶳� ������ �𸣸� �׸�ŭ ��� �ϴ°� ������.%�׺�: ��·�� �� �༮ 1������ ��� ���� ����Ʈ ��ǥ�׿�.");
			QuestBoard qb = new QuestBoard();
			qb.mq28(player, 0);
		}	
	}
	
	public void mq29(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 29��")) {
			msg.msg(player, "�׺�: �̹����� ������ �𸣰�����..%�׺�: �������� �ʹ޶�� �Ͻó׿�?%�׺�: �ϴ� �����ô�!");
			QuestBoard qb = new QuestBoard();
			qb.mq29(player, 0);
		}	
	}
	
	public void mq30(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 30��")) {
			msg.msg(player, "ž�� ������: �̰����� ���� �ڵ��� ���� �������� ��ȥ�� ������%ž�� ������: ��e�ǻ�Ƴ� �ذ��f�� �ȴٳ�..%ž�� ������: �� ž�� ������ �ʹٸ�..%ž�� ������: �� �༮����� ó���ϰ� ����.");
			QuestBoard qb = new QuestBoard();
			qb.mq30(player, 0);
		}	
	}
	
	public void mq31(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 31��")) {
			msg.msg(player, "ž�� ������: �Ƿڰ� �ϳ� �ֳ�.%ž�� ������: ���� �ִ� ž ��ó�� ��e�ϱ� �ı�����f�� �༮���� �ִµ� ���̾�.%ž�� ������: �� �༮���� ��ٺ��� ��e� �����f�� ���� �� �ֳ�.%ž�� ������: ���ؼ� ������ �ְԳ�.");
			QuestBoard qb = new QuestBoard();
			qb.mq31(player, 0);
		}	
	}
	
	public void mq32(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 32��")) {
			msg.msg(player, "�׺�: ������ ž�� �������� ���� ������ �ѹ� �����°� ����?%�׺�: ���� �����غ��� �� ���� �̸��� ��e���Ʊס�f��� �ϳ׿�!");
			QuestBoard qb = new QuestBoard();
			qb.mq32(player, 0);
		}	
	}
	
	public void mq33(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 33��")) {
			msg.msg(player, "�׺�: ũ�����Ʈ �ֺ� �й翡�� ����Ʈ �Ƿڰ� ���Ծ��!%�׺�: �̹����� � ����Ʈ�ϱ� �αٵα��ϳ׿�~!");
			QuestBoard qb = new QuestBoard();
			qb.mq33(player, 0);
		}	
	}

	public void mq34(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 34��")) {
			msg.msg(player, "�����ҳ�: ����!%�����ҳ�: ���� ���� �ʾҰ�����?%��������: �� �Ƿ��Ҳ� ������ ������ ���࿩.");
			QuestBoard qb = new QuestBoard();
			qb.mq34(player, 0);
		}	
	}
	
	public void mq35(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 35��")) {
			msg.msg(player, "???: ������ ������ �����̽ÿ�.%???: ������ ž�� �����Ѵٴ� �ҹ��� ������.%???: ���� ��e����ž��f�� īŸ������� �մϴ�.%īŸ����: �켱.. ����ž���� ���ֽðھ��?");
			QuestBoard qb = new QuestBoard();
			qb.mq35(player, 0);
		}	
	}
	
	public void mq36(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 36��")) {
			msg.msg(player, "īŸ����: ���ƿ�.%īŸ����: ���� ��e������ ���� ���� �̱á�f���� �� �غ� �� �� ������.%īŸ����: ����ž���� ��������� ���޶���� �������� ������ ���� ��ũ���� �� �� ���� ���ϴ�.");
			QuestBoard qb = new QuestBoard();
			qb.mq36(player, 0);
		}	
	}
	
	public void mq37(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 37��")) {
			msg.msg(player, "�׺�: ������!%�׺�: �̹����� ���� ����Ʈ�� ã���� ����.%�׺�: ����ž���� ��e���ʡ�f���� �� ���� ��e�հԡ�f��� ������ �ִ°� �ƴ�?%�׺�: ã�Ⱑ �� ����� �����̶� �� ã���� �𸣰ڳ�..%"
					+ "�׺�: �� �𸣰����� ����ž���� �������� �� ���ٰ� �ѹ� �׾��!%�׺�: Ȥ�ö� �հԿ��� ��Ȱ���� ���� �˾�?");
			QuestBoard qb = new QuestBoard();
			qb.mq37(player, 0);
		}	
	}
	
	public void mq38(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 38��")) {
			msg.msg(player, "����: �Ŀ���.%����: �Ŀ���.%����: ���谡�� ���� �ѹ� �� �����ּ���.");
			QuestBoard qb = new QuestBoard();
			qb.mq38(player, 0);
		}	
	}
	
	public void mq39(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 39��")) {
			msg.msg(player, "�׺�: �� ��ó���� ���� ����� ���� �������µ�..?%�׺�: �̰� ������ ���ߵ�.%�׺�: ���� ��ǥ�� ��e'694 67 618'��f�� �� ����.");
			QuestBoard qb = new QuestBoard();
			qb.mq39(player, 0);
		}	
	}
	
	public void mq40(Player player, Item itemArg, World world) {	
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��������Ʈ 40��")) {
			msg.msg(player, "�׺�: ��e�� ���ϡ�f���� ��e������f�� ã�Ҿ�.%�׺�: ���� �Ա����� ��ٸ��״ϱ� ���� ����.");
			QuestBoard qb = new QuestBoard();
			qb.mq40(player, 0);
		}	
	}
	
	
}
