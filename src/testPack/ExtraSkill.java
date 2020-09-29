package testPack;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class ExtraSkill {

	public ExtraSkill(Player player, ItemStack item1, ItemStack item2) {
		
		int i = 0;
		for (ItemStack is : player.getInventory().getContents()) {
			if (is == null)
				continue;
			if (is.getType() == Material.HEART_OF_THE_SEA) {
				i = i + is.getAmount();
			}
		}
		
		try {
			// �Ҿƿ�
			if(item1.getType() == Material.OAK_PLANKS && item2.getType() == Material.SPRUCE_PLANKS) {
				if(item1.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "�Ϸ�õ�����") && item2.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "��ũ ���޼�")) {
					skill1(player, i, item1, item2);
				}
			}
			
			// ������
			if(item1.getType() == Material.STONE && item2.getType() == Material.CYAN_WOOL) {
				if(item1.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "�������� ��") && item2.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "���������� ��")) {
					skill2(player, i, item1, item2);
				}
			}
		} catch(Exception e) {
			
		}
		
	}
	
	public void skill1(Player player, int i, ItemStack item1, ItemStack item2) {
		
	}
	
	public void skill2(Player player, int i, ItemStack item1, ItemStack item2) {
		if (i >= 5) {
			player.getInventory().remove(Material.HEART_OF_THE_SEA);
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			Location loc = player.getLocation();
			List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() != EntityType.PLAYER) {
					if (nearEntity instanceof LivingEntity) {
						LivingEntity nearMob = (LivingEntity) nearEntity;
						nearMob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 32700));
					}
				}
			}
			// ===============================================================
			ParticleData pd = new ParticleData(player.getUniqueId());
			if (pd.hasID()) {
				pd.endTask();
				pd.removeID();
			}
			ParticleEffect pe = new ParticleEffect(player);
			pe.startE29();
			// ================================================================
			player.sendMessage(ChatColor.GREEN + "[��ų]������ �ӹ��� �ߵ��մϴ�.");
			player.sendMessage(ChatColor.GREEN + "5�ʰ� ���� �������� ����ϴ�.");
			player.getWorld().playSound(loc, Sound.ENTITY_WOLF_SHAKE, 1.0f, 1.0f);
		} else {
			player.sendMessage(ChatColor.RED + "������ �����մϴ�.");
			player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			return;
		}
	}
	
}
