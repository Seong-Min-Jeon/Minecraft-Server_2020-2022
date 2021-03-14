package testPack;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;


public class ExtraSkill {

	public boolean ExSkill(Player player, ItemStack item1, ItemStack item2) {
		
		boolean bool = false;
		int i = 0;
		for (ItemStack is : player.getInventory().getContents()) {
			if (is == null)
				continue;
			if (is.getType() == Material.HEART_OF_THE_SEA) {
				i = i + is.getAmount();
			}
		}
		
		try {
			// 소아온
			if(item1.getType() == Material.OAK_PLANKS && item2.getType() == Material.SPRUCE_PLANKS) {
				if(item1.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "일루시데이터") && item2.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "다크 리펄서")) {
					bool = true;
					skill1(player, i, item1, item2);
				}
			}
			
			// 요정셋
			if(item1.getType() == Material.STONE && item2.getType() == Material.CYAN_WOOL) {
				if(item1.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "요정왕의 검") && item2.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "요정여왕의 검")) {
					bool = true;
					skill2(player, i, item1, item2);
				}
			}
		} catch(Exception e) {
			
		}
	
		return bool;
		
	}
	
	public void skill1(Player player, int i, ItemStack item1, ItemStack item2) {
		if (i >= 2) {
			if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
					|| (player.getLocation().add(0,1,0).getBlock().getType() != Material.AIR)) {
				player.getInventory().remove(Material.HEART_OF_THE_SEA);
				ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.BLUE + "마나");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
				Location loc = player.getLocation();
				
				Vector vec = player.getEyeLocation().add(0,2,0).getDirection().multiply(2.0f);
				player.setVelocity(vec);						
				double num1 = player.getLocation().getDirection().getX();
				double num2 = player.getLocation().getDirection().getY() + 1;
				double num3 = player.getLocation().getDirection().getZ();
				Location mobLoc = loc.add(num1, num2, num3);						
				List<Entity> entitylist = player.getNearbyEntities(3, 3, 3);				
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						LivingEntity ent = (LivingEntity) nearEntity;
						ent.setVelocity(vec);
						ent.damage(player.getLevel()*20);
					}
				}
				player.sendMessage(ChatColor.GREEN + "[스킬]더블 서큘러를 발동합니다.");
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_IMPACT, 1.0f, 1.0f);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			}
		} else {
			player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
			player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			return;
		}
	}
	
	public void skill2(Player player, int i, ItemStack item1, ItemStack item2) {
		if (i >= 5) {
			player.getInventory().remove(Material.HEART_OF_THE_SEA);
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
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
			player.sendMessage(ChatColor.GREEN + "[스킬]요정의 속박을 발동합니다.");
			player.sendMessage(ChatColor.GREEN + "5초간 적의 움직임을 멈춥니다.");
			player.getWorld().playSound(loc, Sound.ENTITY_WOLF_SHAKE, 1.0f, 1.0f);
		} else {
			player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
			player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			return;
		}
	}
	
}
