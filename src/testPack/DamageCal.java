package testPack;

import java.util.Map;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
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
			ItemStack item = player.getInventory().getItemInOffHand();
			if (item.getItemMeta() != null) {
				if(item.getType() == Material.POLISHED_GRANITE_STAIRS || item.getType() == Material.SMOOTH_RED_SANDSTONE_STAIRS || item.getType() == Material.MOSSY_STONE_BRICK_STAIRS 
						|| item.getType() == Material.POLISHED_DIORITE_STAIRS || item.getType() == Material.MOSSY_COBBLESTONE_STAIRS || item.getType() == Material.END_STONE_BRICK_STAIRS 
						|| item.getType() == Material.SMOOTH_SANDSTONE_STAIRS || item.getType() == Material.SMOOTH_QUARTZ_STAIRS || item.getType() == Material.GRANITE_STAIRS) {
					try {
						String[] ench = item.getItemMeta().getLocalizedName().split(",");
						damAll += Integer.parseInt(ench[0]);
						damUn += Integer.parseInt(ench[1]);
						damAr += Integer.parseInt(ench[2]);
						damIm += Integer.parseInt(ench[3]);
					} catch (Exception e) {

					}
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

		if(entity.getType() == EntityType.ZOMBIE || entity.getType() == EntityType.SKELETON || entity.getType() == EntityType.WITHER_SKELETON
				|| entity.getType() == EntityType.DROWNED || entity.getType() == EntityType.VEX || entity.getType() == EntityType.STRAY
				|| entity.getType() == EntityType.HUSK || entity.getType() == EntityType.ZOMBIE_VILLAGER || entity.getType() == EntityType.ENDERMAN
				|| entity.getType() == EntityType.EVOKER || entity.getType() == EntityType.VINDICATOR || entity.getType() == EntityType.WITCH) {
			return (int)(damAll*2 + damUn*4);
		} else if(entity.getType() == EntityType.SPIDER || entity.getType() == EntityType.CAVE_SPIDER || entity.getType() == EntityType.SILVERFISH 
				|| entity.getType() == EntityType.ENDERMITE || entity.getType() == EntityType.LLAMA || entity.getType() == EntityType.POLAR_BEAR
				 || entity.getType() == EntityType.GUARDIAN || entity.getType() == EntityType.ELDER_GUARDIAN || entity.getType() == EntityType.RAVAGER
				 || entity.getType() == EntityType.PHANTOM || entity.getType() == EntityType.OCELOT || entity.getType() == EntityType.RABBIT
				 || entity.getType() == EntityType.PANDA) {
			return (int)(damAll*2 + damAr*5);
		} else if(entity.getType() == EntityType.SLIME || entity.getType() == EntityType.MAGMA_CUBE || entity.getType() == EntityType.GHAST
				|| entity.getType() == EntityType.WITHER || entity.getType() == EntityType.CREEPER || entity.getType() == EntityType.IRON_GOLEM) {
			return (int)(damAll*2 + damIm*6);
		} else {
			return damAll*2;
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
