package testPack;

import java.util.Map;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;

public class DamageCal {
	
	private int damAll = 0;
	private int damAr = 0;
	private int damUn = 0;
	private int damIm = 0;
	private int protect = 0;

	public int Edamage(Player player, Entity entity) {

		try {
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				try {
					String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName()
							.split(",");
					damAll += Integer.parseInt(ench[0]);
					damUn += Integer.parseInt(ench[1]);
					damAr += Integer.parseInt(ench[2]);
					damIm += Integer.parseInt(ench[3]);
				} catch (Exception e) {

				}
			}
		} catch (Exception e) {

		}
		try {
			if (player.getInventory().getHelmet() != null) {
				String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
				damAll += Integer.parseInt(ench[0]);
				damUn += Integer.parseInt(ench[1]);
				damAr += Integer.parseInt(ench[2]);
				damIm += Integer.parseInt(ench[3]);
			}
		} catch (Exception e) {

		}
		try {
			if (player.getInventory().getChestplate() != null) {
				String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
				damAll += Integer.parseInt(ench[0]);
				damUn += Integer.parseInt(ench[1]);
				damAr += Integer.parseInt(ench[2]);
				damIm += Integer.parseInt(ench[3]);
			}
		} catch (Exception e) {

		}
		try {
			if (player.getInventory().getLeggings() != null) {
				String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
				damAll += Integer.parseInt(ench[0]);
				damUn += Integer.parseInt(ench[1]);
				damAr += Integer.parseInt(ench[2]);
				damIm += Integer.parseInt(ench[3]);
			}
		} catch (Exception e) {

		}
		try {
			if (player.getInventory().getBoots() != null) {
				String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
				damAll += Integer.parseInt(ench[0]);
				damUn += Integer.parseInt(ench[1]);
				damAr += Integer.parseInt(ench[2]);
				damIm += Integer.parseInt(ench[3]);
			}
		} catch (Exception e) {

		}

		if(entity.getType() == EntityType.ZOMBIE || entity.getType() == EntityType.PIGLIN || entity.getType() == EntityType.SKELETON
				|| entity.getType() == EntityType.DROWNED || entity.getType() == EntityType.VEX || entity.getType() == EntityType.STRAY
				|| entity.getType() == EntityType.ZOMBIFIED_PIGLIN || entity.getType() == EntityType.HUSK || entity.getType() == EntityType.ZOMBIE_VILLAGER
				|| entity.getType() == EntityType.ENDERMAN) {
			return (int)(damAll*3 + damUn*3.5);
		} else if(entity.getType() == EntityType.SPIDER || entity.getType() == EntityType.CAVE_SPIDER || entity.getType() == EntityType.BEE || entity.getType() == EntityType.SILVERFISH 
				||entity.getType() == EntityType.ENDERMITE) {
			return (int)(damAll*3 + damAr*3.5);
		} else if(entity.getType() == EntityType.ELDER_GUARDIAN || entity.getType() == EntityType.GUARDIAN || entity.getType() == EntityType.GHAST
				|| entity.getType() == EntityType.RAVAGER || entity.getType() == EntityType.PHANTOM || entity.getType() == EntityType.HOGLIN
				|| entity.getType() == EntityType.ZOGLIN || entity.getType() == EntityType.WITHER || entity.getType() == EntityType.POLAR_BEAR
				|| entity.getType() == EntityType.IRON_GOLEM) {
			return (int)(damAll*3 + damIm*3.5);
		} else {
			return damAll*4;
		}
	}

	public double Pdamage(Player player, double damage, Entity entity) {

		try {
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				try {
					String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
					protect += Integer.parseInt(ench[5]);
				} catch (Exception e) {

				}
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getHelmet() != null) {
				String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
				protect += Integer.parseInt(ench[5]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getChestplate() != null) {
				String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
				protect += Integer.parseInt(ench[5]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getLeggings() != null) {
				String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
				protect += Integer.parseInt(ench[5]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getBoots() != null) {
				String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
				protect += Integer.parseInt(ench[5]);
			}
		} catch(Exception e) {
			
		}

		damage = damage - (damage * ((42.6/Math.sqrt(2)) * Math.log10((protect*0.18+14.15) / (10*Math.sqrt(2)))) / 100.0);
		return damage;
		
	}
	
}
