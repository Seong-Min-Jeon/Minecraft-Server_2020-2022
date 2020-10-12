package testPack;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MobDeath {

	Player player = null;

	public MobDeath(Player playerArg, Entity mobArg, double damageArg) {
		Entity mob = mobArg;
		double damage = damageArg;
		this.player = playerArg;
		death(mob, damage);
	}

	public MobDeath(Entity mobArg, double damageArg) {
		Entity mob = mobArg;
		double damage = damageArg;
		death(mob, damage);
	}

	public void death(Entity mob, double damage) {
		MobLoot mobloot = new MobLoot();
		Player lootPlayer;
		if (this.player == null) {
			if(((Mob) mob).getTarget() instanceof Player) {
				lootPlayer = (Player) (((Mob) mob).getTarget());				
			} else if(((Mob) mob).getTarget().getType() == EntityType.IRON_GOLEM) {
				IronGolem ir =(IronGolem) ((Mob) mob).getTarget();
				GolemOwner go = new GolemOwner();
				lootPlayer = go.returnPlayer(ir.getUniqueId());
			} else {
				lootPlayer = (Player) (((Mob) mob).getTarget());	
			}
		} else {
			lootPlayer = this.player;
		}
		if (((LivingEntity) mob).getHealth() - damage <= 0) {
			// ��������
			ItemStack mana = new ItemStack(Material.HEART_OF_THE_SEA);
			ItemMeta manaIm = mana.getItemMeta();
			manaIm.setDisplayName(ChatColor.BLUE + "����");
			mana.setItemMeta(manaIm);
			if (lootPlayer.getInventory().contains(Material.HEART_OF_THE_SEA)) {
				int i = 0;
				for (ItemStack is : lootPlayer.getInventory().getContents()) {
					if (is == null)
						continue;
					if (is.getType() == Material.HEART_OF_THE_SEA) {
						i = i + is.getAmount();
					}
				}
				if (i < 20)
					lootPlayer.getInventory().addItem(mana);
			} else {
				lootPlayer.getInventory().setItem(8, mana);
			}
			// ���� �ȸ����� ĵ��
			String str = mob.getCustomName().split("\\.")[1];
			String num = str.split("]")[0];
			try {
				int mobLvl = Integer.parseInt(num);
				int dist = lootPlayer.getLevel() - mobLvl;
				if (dist < -20) {
					lootPlayer.sendMessage(ChatColor.RED + "���Ϳ��� ���� ���̷� �ƹ��͵� ���� �� �����ϴ�.");
					return;
				}
			} catch (Exception e) {

			}
			
			String name = mob.getCustomName().substring(2);

			// ������ �𸣴� ������
			if (name.equalsIgnoreCase("������ �𸣴� ������" + ChatColor.YELLOW + " [Lv.0]")) {
				mobloot.mob1(lootPlayer);
			}
			// ���� ������
			if (name.equalsIgnoreCase("���� ������" + ChatColor.YELLOW + " [Lv.0]")) {
				mobloot.mob2(lootPlayer);
			}
			// �ʷ� ������
			if (name.equalsIgnoreCase("�ʷ� ������" + ChatColor.YELLOW + " [Lv.1]")) {
				mobloot.mob3(lootPlayer);
			}
			// �ؾȰ� ����
			if (name.equalsIgnoreCase("�ؾȰ� ����" + ChatColor.YELLOW + " [Lv.6]")) {
				mobloot.mob4(lootPlayer);
			}
			// ���״ҿ� ��Ŵ��� ��
			if (name.equalsIgnoreCase("���״ҿ� ��Ŵ��� ��" + ChatColor.YELLOW + " [Lv.13]")) {
				mobloot.mob5(lootPlayer);
			}
			// ���� ���� �ϼ���
			if (name.equalsIgnoreCase("���� ���� �ϼ���" + ChatColor.YELLOW + " [Lv.32]")) {
				mobloot.mob6(lootPlayer);
			}
			// ���� ���� ����
			if (name.equalsIgnoreCase("���� ���� ����" + ChatColor.YELLOW + " [Lv.40]")) {
				mobloot.mob7(lootPlayer);
			}
			// ������Ʈ ��Ʈ
			if (name.equalsIgnoreCase("������Ʈ ��Ʈ" + ChatColor.YELLOW + " [Lv.15]")) {
				mobloot.mob8(lootPlayer);
			}
			// ũ����Ż ������
			if (name.equalsIgnoreCase("ũ����Ż ������" + ChatColor.YELLOW + " [Lv.18]")) {
				mobloot.mob9(lootPlayer);
			}
			// ���ֹ��� ���� ����
			if (name.equalsIgnoreCase("���ֹ��� ���� ����" + ChatColor.YELLOW + " [Lv.20]")) {
				mobloot.mob10(lootPlayer);
			}
			// ��ȣ ����
			if (name.equalsIgnoreCase("��ȣ ����" + ChatColor.YELLOW + " [Lv.12]")) {
				mobloot.mob11(lootPlayer);
			}
			// ��ȣ ��Ʈ����
			if (name.equalsIgnoreCase("��ȣ ��Ʈ����" + ChatColor.YELLOW + " [Lv.16]")) {
				mobloot.mob12(lootPlayer);
			}
			// �ź� ����
			if (name.equalsIgnoreCase("�ź� ����" + ChatColor.YELLOW + " [Lv.15]")) {
				mobloot.mob13(lootPlayer);
			}
			// ���� �����
			if (name.equalsIgnoreCase("���� �����" + ChatColor.YELLOW + " [Lv.19]")) {
				mobloot.mob14(lootPlayer);
			}
			// ���
			if (name.equalsIgnoreCase("���" + ChatColor.YELLOW + " [Lv.47]")) {
				mobloot.mob15(lootPlayer);
			}
			// �ĸ�Ȧ���� ����
			if (name.equalsIgnoreCase("�ĸ�Ȧ���� ����" + ChatColor.YELLOW + " [Lv.50]")) {
				mobloot.mob16(lootPlayer);
			}
			// �ĸ�Ȧ���� ����
			if (name.equalsIgnoreCase("�ĸ�Ȧ���� ����" + ChatColor.YELLOW + " [Lv.58]")) {
				mobloot.mob17(lootPlayer);
			}
			// ���̵� ��
			if (name.equalsIgnoreCase("���̵� ��" + ChatColor.YELLOW + " [Lv.62]")) {
				mobloot.mob18(lootPlayer);
			}
			// ħ����
			if (name.equalsIgnoreCase("ħ����" + ChatColor.YELLOW + " [Lv.24]")) {
				mobloot.mob19(lootPlayer);
			}
			// ���� Ȳ��
			if (name.equalsIgnoreCase("���� Ȳ��" + ChatColor.YELLOW + " [Lv.34]")) {
				mobloot.mob20(lootPlayer);
			}
			// ���� ����
			if (name.equalsIgnoreCase("���� ����" + ChatColor.YELLOW + " [Lv.31]")) {
				mobloot.mob21(lootPlayer);
			}
			// ����
			if (name.equalsIgnoreCase("����" + ChatColor.YELLOW + " [Lv.27]")) {
				mobloot.mob22(lootPlayer);
			}
			// ���̵� ������
			if (name.equalsIgnoreCase("���̵� ������" + ChatColor.YELLOW + " [Lv.35]")) {
				mobloot.mob23(lootPlayer);
			}
			// �ǻ�Ƴ� ���谡
			if (name.equalsIgnoreCase("�ǻ�Ƴ� ���谡" + ChatColor.YELLOW + " [Lv.38]")) {
				mobloot.mob24(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.43]")) {
				mobloot.mob25(lootPlayer);
			}
			// ��ũ
			if (name.equalsIgnoreCase("��ũ" + ChatColor.YELLOW + " [Lv.60]")) {
				mobloot.mob26(lootPlayer);
			}
			// �̷��� �����ϴ� ��
			if (name.equalsIgnoreCase("�̷��� �����ϴ� ��" + ChatColor.YELLOW + " [Lv.66]")) {
				mobloot.mob27(lootPlayer);
			}
			// ���� �ΰ�
			if (name.equalsIgnoreCase("���� �ΰ�" + ChatColor.YELLOW + " [Lv.72]")) {
				mobloot.mob28(lootPlayer);
			}
			// ������ ������
			if (name.equalsIgnoreCase("������ ������" + ChatColor.YELLOW + " [Lv.80]")) {
				mobloot.mob29(lootPlayer);
			}
			// ������ ��Ű�� �Ź�
			if (name.equalsIgnoreCase("������ ��Ű�� �Ź�" + ChatColor.YELLOW + " [Lv.100]")) {
				mobloot.mob30(lootPlayer);
			}
			// �ĸ�Ȧ���� ��ȣ��
			if (name.equalsIgnoreCase("�ĸ�Ȧ���� ��ȣ��" + ChatColor.YELLOW + " [Lv.113]")) {
				mobloot.mob31(lootPlayer);
			}
			// �ܴ��� ������
			if (name.equalsIgnoreCase("�ܴ��� ������" + ChatColor.YELLOW + " [Lv.83]")) {
				mobloot.mob32(lootPlayer);
			}
			// ������ ���� �÷��̾�
			if (name.equalsIgnoreCase("������ ���� �÷��̾�" + ChatColor.YELLOW + " [Lv.96]")) {
				mobloot.mob33(lootPlayer);
			}
			// ���� �Ź�
			if (name.equalsIgnoreCase("���� �Ź�" + ChatColor.YELLOW + " [Lv.134]")) {
				mobloot.mob34(lootPlayer);
			}
			// ���� ����
			if (name.equalsIgnoreCase("���� ����" + ChatColor.YELLOW + " [Lv.140]")) {
				mobloot.mob35(lootPlayer);
			}
			// �ƶ�
			if (name.equalsIgnoreCase("�ƶ�" + ChatColor.YELLOW + " [Lv.127]")) {
				mobloot.mob36(lootPlayer);
			}
			// �Ӷ���
			if (name.equalsIgnoreCase("�Ӷ���" + ChatColor.YELLOW + " [Lv.135]")) {
				mobloot.mob37(lootPlayer);
			}
			// �ĸ�Ȧ���� ������
			if (name.equalsIgnoreCase("�ĸ�Ȧ���� ������" + ChatColor.YELLOW + " [Lv.253]")) {
				mobloot.mob38(lootPlayer);
			}
			// ������ ���� �÷��̾�
			if (name.equalsIgnoreCase("������ ���� �÷��̾�" + ChatColor.YELLOW + " [Lv.150]")) {
				mobloot.mob39(lootPlayer);
			}
			// �г��� ����
			if (name.equalsIgnoreCase("�г��� ����" + ChatColor.YELLOW + " [Lv.158]")) {
				mobloot.mob40(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.160]")) {
				mobloot.mob41(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.163]")) {
				mobloot.mob42(lootPlayer);
			}
			// ħ���� ����
			if (name.equalsIgnoreCase("ħ���� ����" + ChatColor.YELLOW + " [Lv.165]")) {
				mobloot.mob43(lootPlayer);
			}
			// ����� ����
			if (name.equalsIgnoreCase("����� ����" + ChatColor.YELLOW + " [Lv.168]")) {
				mobloot.mob44(lootPlayer);
			}
			// ����� ����
			if (name.equalsIgnoreCase("����� ����" + ChatColor.YELLOW + " [Lv.171]")) {
				mobloot.mob45(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.178]")) {
				mobloot.mob46(lootPlayer);
			}
			// ����� ����
			if (name.equalsIgnoreCase("����� ����" + ChatColor.YELLOW + " [Lv.174]")) {
				mobloot.mob47(lootPlayer);
			}
			// �÷��� ����
			if (name.equalsIgnoreCase("�÷��� ����" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob48(lootPlayer);
			}
			// �Ϳ�
			if (name.equalsIgnoreCase("�Ϳ�" + ChatColor.YELLOW + " [Lv.148]")) {
				mobloot.mob49(lootPlayer);
			}
			// ���
			if (name.equalsIgnoreCase("���" + ChatColor.YELLOW + " [Lv.157]")) {
				mobloot.mob50(lootPlayer);
			}
			// ��ȥ�� Ž�ϴ� ����
			if (name.equalsIgnoreCase("��ȥ�� Ž�ϴ� ����" + ChatColor.YELLOW + " [Lv.200]")) {
				mobloot.mob51(lootPlayer);
			}
			// ��������
			if (name.equalsIgnoreCase("��������" + ChatColor.YELLOW + " [Lv.194]")) {
				mobloot.mob52(lootPlayer);
			}
			// ������
			if (name.equalsIgnoreCase("������" + ChatColor.YELLOW + " [Lv.184]")) {
				mobloot.mob53(lootPlayer);
			}
			// ���������
			if (name.equalsIgnoreCase("���������" + ChatColor.YELLOW + " [Lv.190]")) {
				mobloot.mob54(lootPlayer);
			}
			// ���ų�Ʈ
			if (name.equalsIgnoreCase("���ų�Ʈ" + ChatColor.YELLOW + " [Lv.198]")) {
				mobloot.mob55(lootPlayer);
			}
			// ������
			if (name.equalsIgnoreCase("������" + ChatColor.YELLOW + " [Lv.203]")) {
				mobloot.mob56(lootPlayer);
			}
			// ��Ʋ�� ������ ����
			if (name.equalsIgnoreCase("��Ʋ�� ������ ����" + ChatColor.YELLOW + " [Lv.211]")) {
				mobloot.mob57(lootPlayer);
			}
			// �ư��� �ļ���
			if (name.equalsIgnoreCase("�ư��� �ļ���" + ChatColor.YELLOW + " [Lv.218]")) {
				mobloot.mob58(lootPlayer);
			}
			// �������� ��ȥ
			if (name.equalsIgnoreCase("�������� ��ȥ" + ChatColor.YELLOW + " [Lv.201]")) {
				mobloot.mob59(lootPlayer);
			}
			// �ͻ���� ����
			if (name.equalsIgnoreCase("�ͻ���� ����" + ChatColor.YELLOW + " [Lv.205]")) {
				mobloot.mob60(lootPlayer);
			}
			// ����
			if (name.equalsIgnoreCase("����" + ChatColor.YELLOW + " [Lv.212]")) {
				mobloot.mob61(lootPlayer);
			}
			// ����
			if (name.equalsIgnoreCase("����" + ChatColor.YELLOW + " [Lv.216]")) {
				mobloot.mob62(lootPlayer);
			}
			// ��ȣ
			if (name.equalsIgnoreCase("��ȣ" + ChatColor.YELLOW + " [Lv.222]")) {
				mobloot.mob63(lootPlayer);
			}
			// ����
			if (name.equalsIgnoreCase("����" + ChatColor.YELLOW + " [Lv.230]")) {
				mobloot.mob64(lootPlayer);
			}
			// ���� ���ʺ�
			if (name.equalsIgnoreCase("���� ���ʺ�" + ChatColor.YELLOW + " [Lv.243]")) {
				mobloot.mob65(lootPlayer);
			}
			// ���� ����
			if (name.equalsIgnoreCase("���� ����" + ChatColor.YELLOW + " [Lv.250]")) {
				mobloot.mob66(lootPlayer);
			}
			// ���� �д���
			if (name.equalsIgnoreCase("���� �д���" + ChatColor.YELLOW + " [Lv.260]")) {
				mobloot.mob67(lootPlayer);
			}
			// �������� ����
			if (name.equalsIgnoreCase("�������� ����" + ChatColor.YELLOW + " [Lv.226]")) {
				mobloot.mob68(lootPlayer);
			}
			// �������� ��ɰ�
			if (name.equalsIgnoreCase("�������� ��ɰ�" + ChatColor.YELLOW + " [Lv.231]")) {
				mobloot.mob69(lootPlayer);
			}
			// �������� ������
			if (name.equalsIgnoreCase("�������� ������" + ChatColor.YELLOW + " [Lv.236]")) {
				mobloot.mob70(lootPlayer);
			}
			// �������� �̴���
			if (name.equalsIgnoreCase("�������� �̴���" + ChatColor.YELLOW + " [Lv.245]")) {
				mobloot.mob71(lootPlayer);
			}
			// ���ʸ� ���� ����
			if (name.equalsIgnoreCase("���ʸ� ���� ����" + ChatColor.YELLOW + " [Lv.183]")) {
				mobloot.mob72(lootPlayer);
			}
			// ���ݴ� ����
			if (name.equalsIgnoreCase("���ݴ� ����" + ChatColor.YELLOW + " [Lv.187]")) {
				mobloot.mob73(lootPlayer);
			}
			// ���� ����
			if (name.equalsIgnoreCase("���� ����" + ChatColor.YELLOW + " [Lv.192]")) {
				mobloot.mob74(lootPlayer);
			}
			// ������ ��ȯ��
			if (name.equalsIgnoreCase("������ ��ȯ��" + ChatColor.YELLOW + " [Lv.194]")) {
				mobloot.mob75(lootPlayer);
			}
			// �Ŵ� ����
			if (name.equalsIgnoreCase("�Ŵ� ����" + ChatColor.YELLOW + " [Lv.200]")) {
				mobloot.mob76(lootPlayer);
			}
			// ������ ������
			if (name.equalsIgnoreCase("������ ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob77(lootPlayer);
			}
			// �������� ƼŸ�Ͼ�
			if (name.equalsIgnoreCase("�������� ƼŸ�Ͼ�" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob78(lootPlayer);
			}
			// ����
			if (name.equalsIgnoreCase("����" + ChatColor.YELLOW + " [Lv.253]")) {
				mobloot.mob79(lootPlayer);
			}
			// ���� ������
			if (name.equalsIgnoreCase("���� ������" + ChatColor.YELLOW + " [Lv.217]")) {
				mobloot.mob80(lootPlayer);
			}
			// ���� ������
			if (name.equalsIgnoreCase("���� ������" + ChatColor.YELLOW + " [Lv.224]")) {
				mobloot.mob81(lootPlayer);
			}
			// ���� ������
			if (name.equalsIgnoreCase("���� ������" + ChatColor.YELLOW + " [Lv.230]")) {
				mobloot.mob82(lootPlayer);
			}
			// �߷θ��� ����
			if (name.equalsIgnoreCase("�߷θ��� ����" + ChatColor.YELLOW + " [Lv.230]")) {
				mobloot.mob83(lootPlayer);
			}
			// �߷θ��� �ú�
			if (name.equalsIgnoreCase("�߷θ��� �ú�" + ChatColor.YELLOW + " [Lv.230]")) {
				mobloot.mob83(lootPlayer);
			}
			// �߷θ��� ����
			if (name.equalsIgnoreCase("�߷θ��� ����" + ChatColor.YELLOW + " [Lv.232]")) {
				mobloot.mob84(lootPlayer);
			}
			// �߷θ��� �ú�
			if (name.equalsIgnoreCase("�߷θ��� �ú�" + ChatColor.YELLOW + " [Lv.232]")) {
				mobloot.mob84(lootPlayer);
			}
			// �߷θ��� ����
			if (name.equalsIgnoreCase("�߷θ��� ����" + ChatColor.YELLOW + " [Lv.238]")) {
				mobloot.mob85(lootPlayer);
			}
			// �߷θ��� �ú�
			if (name.equalsIgnoreCase("�߷θ��� �ú�" + ChatColor.YELLOW + " [Lv.238]")) {
				mobloot.mob85(lootPlayer);
			}
			// ���귻
			if (name.equalsIgnoreCase("���귻" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob86(lootPlayer);
			}
			// �߷θ�
			if (name.equalsIgnoreCase("�߷θ�" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob87(lootPlayer);
			}
			// �Ŵ� ������
			if (name.equalsIgnoreCase("�Ŵ� ������" + ChatColor.YELLOW + " [Lv.253]")) {
				mobloot.mob88(lootPlayer);
			}
			// ���� �Ź�
			if (name.equalsIgnoreCase("���� �Ź�" + ChatColor.YELLOW + " [Lv.258]")) {
				mobloot.mob89(lootPlayer);
			}
			// ���Ź�
			if (name.equalsIgnoreCase("���Ź�" + ChatColor.YELLOW + " [Lv.264]")) {
				mobloot.mob90(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.265]")) {
				mobloot.mob91(lootPlayer);
			}
			// ������ ���ſ�
			if (name.equalsIgnoreCase("������ ���ſ�" + ChatColor.YELLOW + " [Lv.270]")) {
				mobloot.mob92(lootPlayer);
			}
			// ����
			if (name.equalsIgnoreCase("����" + ChatColor.YELLOW + " [Lv.268]")) {
				mobloot.mob93(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.100]")) {
				mobloot.mob94(lootPlayer);
			}
			// ������ ���̵�
			if (name.equalsIgnoreCase("������ ���̵�" + ChatColor.YELLOW + " [Lv.105]")) {
				mobloot.mob95(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.110]")) {
				mobloot.mob96(lootPlayer);
			}
			// �屳��� ���̵�
			if (name.equalsIgnoreCase("�屳��� ���̵�" + ChatColor.YELLOW + " [Lv.110]")) {
				mobloot.mob96(lootPlayer);
			}
			// ��������
			if (name.equalsIgnoreCase("��������" + ChatColor.YELLOW + " [Lv.115]")) {
				mobloot.mob96(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.105]")) {
				mobloot.mob97(lootPlayer);
			}
			// ������ ���̵�
			if (name.equalsIgnoreCase("������ ���̵�" + ChatColor.YELLOW + " [Lv.108]")) {
				mobloot.mob98(lootPlayer);
			}
			// �Ƶ�
			if (name.equalsIgnoreCase("�Ƶ�" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob99(lootPlayer);
			}
			// Ư�� �丮��
			if (name.equalsIgnoreCase("Ư�� �丮��" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob100(lootPlayer);
			}
			// �ټ���
			if (name.equalsIgnoreCase("�ټ���" + ChatColor.YELLOW + " [Lv.180]")) {
				mobloot.mob101(lootPlayer);
			}
			// Ǫ�� ���
			if (name.equalsIgnoreCase("Ǫ�� ���" + ChatColor.YELLOW + " [Lv.271]")) {
				mobloot.mob102(lootPlayer);
			}
			// �ǻ�Ƴ� ����
			if (name.equalsIgnoreCase("�ǻ�Ƴ� ����" + ChatColor.YELLOW + " [Lv.274]")) {
				mobloot.mob103(lootPlayer);
			}
			// ������ ���� �÷��̾�
			if (name.equalsIgnoreCase("������ ���� �÷��̾�" + ChatColor.YELLOW + " [Lv.279]")) {
				mobloot.mob104(lootPlayer);
			}
			// Ķ����
			if (name.equalsIgnoreCase("Ķ����" + ChatColor.YELLOW + " [Lv.283]")) {
				mobloot.mob105(lootPlayer);
			}
			// �ϱ� �ı���
			if (name.equalsIgnoreCase("�ϱ� �ı���" + ChatColor.YELLOW + " [Lv.290]")) {
				mobloot.mob106(lootPlayer);
			}
			// �ǻ�Ƴ� �ذ�
			if (name.equalsIgnoreCase("�ǻ�Ƴ� �ذ�" + ChatColor.YELLOW + " [Lv.286]")) {
				mobloot.mob107(lootPlayer);
			}
			// �� �����
			if (name.equalsIgnoreCase("�� �����" + ChatColor.YELLOW + " [Lv.294]")) {
				mobloot.mob108(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.300]")) {
				mobloot.mob109(lootPlayer);
			}
			// ������
			if (name.equalsIgnoreCase("������" + ChatColor.YELLOW + " [Lv.299]")) {
				mobloot.mob110(lootPlayer);
			}
			// ���� ����
			if (name.equalsIgnoreCase("���� ����" + ChatColor.YELLOW + " [Lv.306]")) {
				mobloot.mob111(lootPlayer);
			}
			// 1���� ������
			if (name.equalsIgnoreCase("1���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob112(lootPlayer);
			}
			// 2���� ������
			if (name.equalsIgnoreCase("2���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob113(lootPlayer);
			}
			// 3���� ������
			if (name.equalsIgnoreCase("3���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob114(lootPlayer);
			}
			// 4���� ������
			if (name.equalsIgnoreCase("4���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob115(lootPlayer);
			}
			// 5���� ������
			if (name.equalsIgnoreCase("5���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob116(lootPlayer);
			}
			// 6���� ������
			if (name.equalsIgnoreCase("6���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob117(lootPlayer);
			}
			// 7���� ������
			if (name.equalsIgnoreCase("7���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob118(lootPlayer);
			}
			// 8���� ������
			if (name.equalsIgnoreCase("8���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob119(lootPlayer);
			}
			// 9���� ������
			if (name.equalsIgnoreCase("9���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob120(lootPlayer);
			}
			// 10���� ������
			if (name.equalsIgnoreCase("10���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob121(lootPlayer);
			}
			// 11���� ������
			if (name.equalsIgnoreCase("11���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob122(lootPlayer);
			}
			// ž�� ����
			if (name.equalsIgnoreCase("ž�� ����" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob123(lootPlayer);
			}
			// ������ �ļ���
			if (name.equalsIgnoreCase("������ �ļ���" + ChatColor.YELLOW + " [Lv.320]")) {
				mobloot.mob124(lootPlayer);
			}
			// ������ �ļ���
			if (name.equalsIgnoreCase("������ �ļ���" + ChatColor.YELLOW + " [Lv.324]")) {
				mobloot.mob125(lootPlayer);
			}
			// �� ������
			if (name.equalsIgnoreCase("�� ������" + ChatColor.YELLOW + " [Lv.310]")) {
				mobloot.mob126(lootPlayer);
			}
			// ����� �ζ��� ����
			if (name.equalsIgnoreCase("����� �ζ��� ����" + ChatColor.YELLOW + " [Lv.306]")) {
				mobloot.mob127(lootPlayer);
			}
			// ��ũ�κ����� �ϻ���
			if (name.equalsIgnoreCase("��ũ�κ����� �ϻ���" + ChatColor.YELLOW + " [Lv.308]")) {
				mobloot.mob128(lootPlayer);
			}
			// ��ũ�κ����� ������
			if (name.equalsIgnoreCase("��ũ�κ����� ������" + ChatColor.YELLOW + " [Lv.314]")) {
				mobloot.mob129(lootPlayer);
			}
			// ��ũ�κ����� ����
			if (name.equalsIgnoreCase("��ũ�κ����� ����" + ChatColor.YELLOW + " [Lv.318]")) {
				mobloot.mob130(lootPlayer);
			}
			// Ǫ�� ������
			if (name.equalsIgnoreCase("Ǫ�� ������" + ChatColor.YELLOW + " [Lv.312]")) {
				mobloot.mob131(lootPlayer);
			}
			// Ǫ�� ������
			if (name.equalsIgnoreCase("Ǫ�� ������" + ChatColor.YELLOW + " [Lv.317]")) {
				mobloot.mob132(lootPlayer);
			}
			// ���ϰ����� ����
			if (name.equalsIgnoreCase("���ϰ����� ����" + ChatColor.YELLOW + " [Lv.329]")) {
				mobloot.mob133(lootPlayer);
			}
			// ���ϰ����� �˼�
			if (name.equalsIgnoreCase("���ϰ����� �˼�" + ChatColor.YELLOW + " [Lv.325]")) {
				mobloot.mob134(lootPlayer);
			}
			// ������ �λ깰
			if (name.equalsIgnoreCase("������ �λ깰" + ChatColor.YELLOW + " [Lv.325]")) {
				mobloot.mob135(lootPlayer);
			}
			// ��ȭ ���� �ΰ�
			if (name.equalsIgnoreCase("��ȭ ���� �ΰ�" + ChatColor.YELLOW + " [Lv.330]")) {
				mobloot.mob136(lootPlayer);
			}
			// ������ Ÿ���� ��
			if (name.equalsIgnoreCase("������ Ÿ���� ��" + ChatColor.YELLOW + " [Lv.332]")) {
				mobloot.mob137(lootPlayer);
			}
			// ������ ������
			if (name.equalsIgnoreCase("������ ������" + ChatColor.YELLOW + " [Lv.336]")) {
				mobloot.mob138(lootPlayer);
			}
			// ���
			if (name.equalsIgnoreCase("���" + ChatColor.YELLOW + " [Lv.343]")) {
				mobloot.mob139(lootPlayer);
			}
			// Ÿ���� ���谡
			if (name.equalsIgnoreCase("Ÿ���� ���谡" + ChatColor.YELLOW + " [Lv.347]")) {
				mobloot.mob140(lootPlayer);
			}
			// �ڳ���
			if (name.equalsIgnoreCase("�ڳ���" + ChatColor.YELLOW + " [Lv.??]")) {
				mobloot.mob141(lootPlayer);
			}
			// ������ ����
			if (name.equalsIgnoreCase("������ ����" + ChatColor.YELLOW + " [Lv.338]")) {
				mobloot.mob142(lootPlayer);
			}
			// �ʸ�������
			if (name.equalsIgnoreCase("�ʸ�������" + ChatColor.YELLOW + " [Lv.342]")) {
				mobloot.mob143(lootPlayer);
			}
			// ������ ���� ����
			if (name.equalsIgnoreCase("������ ���� ����" + ChatColor.YELLOW + " [Lv.344]")) {
				mobloot.mob144(lootPlayer);
			}
			// ������ ���� ������
			if (name.equalsIgnoreCase("������ ���� ������" + ChatColor.YELLOW + " [Lv.349]")) {
				mobloot.mob145(lootPlayer);
			}
			// �׸��� ����
			if (name.equalsIgnoreCase("�׸��� ����" + ChatColor.YELLOW + " [Lv.347]")) {
				mobloot.mob146(lootPlayer);
			}
			// TNTZ
			if (name.equalsIgnoreCase("TNTZ" + ChatColor.YELLOW + " [Lv.351]")) {
				mobloot.mob147(lootPlayer);
				mob.getWorld().createExplosion(mob.getLocation(), 5, false, false);
			}
			// �Ľ�Į
			if (name.equalsIgnoreCase("�Ľ�Į" + ChatColor.YELLOW + " [Lv.354]")) {
				mobloot.mob148(lootPlayer);
			}
			// ����
			if (name.equalsIgnoreCase("����" + ChatColor.YELLOW + " [Lv.357]")) {
				mobloot.mob149(lootPlayer);
			}
			
//================================================================================================================================
			int cnt = 0;
        	for(ItemStack item : lootPlayer.getInventory().getContents()) {
        		if(item == null) continue;
        		if(item.getType() == Material.EMERALD) {
        			cnt += item.getAmount();
        		}
        	}
        	lootPlayer.getInventory().remove(Material.EMERALD);
        	if(cnt/64 != 0) {
        		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, cnt/64);
        		ItemMeta im = item.getItemMeta();
        		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
        		item.setItemMeta(im);
        		lootPlayer.getInventory().addItem(item);
        	}
        	lootPlayer.getInventory().addItem(new ItemStack(Material.EMERALD, cnt%64));
        	
        	
        	int cnt2 = 0;
        	for(ItemStack item : lootPlayer.getInventory().getContents()) {
        		if(item == null) continue;
        		if(item.getType() == Material.EMERALD_BLOCK) {
        			cnt2 += item.getAmount();
        		}
        	}
        	lootPlayer.getInventory().remove(Material.EMERALD_BLOCK);
        	if(cnt2/64 != 0) {
        		ItemStack item = new ItemStack(Material.SCUTE, cnt2/64);
        		ItemMeta im = item.getItemMeta();
        		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
        		item.setItemMeta(im);
        		lootPlayer.getInventory().addItem(item);
        	}
        	ItemStack eme2 = new ItemStack(Material.EMERALD_BLOCK, cnt2%64);
    		ItemMeta emeIm2 = eme2.getItemMeta();
    		emeIm2.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
    		eme2.setItemMeta(emeIm2);
        	lootPlayer.getInventory().addItem(eme2);
        	
        	
        	int cnt3 = 0;
        	for(ItemStack item : lootPlayer.getInventory().getContents()) {
        		if(item == null) continue;
        		if(item.getType() == Material.SCUTE) {
        			cnt3 += item.getAmount();
        		}
        	}
        	lootPlayer.getInventory().remove(Material.SCUTE);
        	if(cnt3/64 != 0) {
        		ItemStack item = new ItemStack(Material.RABBIT_HIDE, cnt3/64);
        		ItemMeta im = item.getItemMeta();
        		im.setDisplayName(ChatColor.AQUA + "���޶��� ����");
        		item.setItemMeta(im);
        		lootPlayer.getInventory().addItem(item);
        	}
        	ItemStack eme3 = new ItemStack(Material.SCUTE, cnt3%64);
    		ItemMeta emeIm3 = eme3.getItemMeta();
    		emeIm3.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
    		eme3.setItemMeta(emeIm3);
        	lootPlayer.getInventory().addItem(eme3);
			
		}
	}

}
