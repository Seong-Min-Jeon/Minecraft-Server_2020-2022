package testPack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerJobBuff {

	public void playerBuff(Player player) {
		// �� ������
		if (player.getInventory().contains(Material.RED_DYE)) {
			
		}
		// ���
		if (player.getInventory().contains(Material.GREEN_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 0,true,false,false));
		}
		// ������Ʈ
		if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
			
		}
		// ������
		if (player.getInventory().contains(Material.CYAN_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 60, 0,true,false,false));
		}
		// ����
		if (player.getInventory().contains(Material.GRAY_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 0,true,false,false));
		}
		// ����
		if (player.getInventory().contains(Material.PINK_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2,true,false,false));
		}
		// ������
		if (player.getInventory().contains(Material.LIME_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
		}
		// �׸��� ����
		if (player.getInventory().contains(Material.YELLOW_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1,true,false,false));
		}
		// ����Ŀ
		if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
		}
		// ����
		if (player.getInventory().contains(Material.MAGENTA_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Integer.MAX_VALUE, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 80, 3,true,false,false));
		}
		// �׸� ����		
		if (player.getInventory().contains(Material.ORANGE_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 60, 1,true,false,false));
		}
		// ����
		if (player.getInventory().contains(Material.BLUE_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 1,true,false,false));
		}
		// �ȶ��		
		if (player.getInventory().contains(Material.BROWN_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 2,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 3,true,false,false));
		}
		// ����
		if (player.getInventory().contains(Material.BLACK_DYE)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2,true,false,false));
		}
		// �����
		if (player.getInventory().contains(Material.INK_SAC)) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 2,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Integer.MAX_VALUE, 1,true,false,false));
		}
	}
	
}
