package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class ShootArrow {

	Random rnd = new Random();

	public ShootArrow(Entity ent) {
		Arrow arrow = (Arrow) ent;
		Location loc = arrow.getLocation();
		if(arrow.getShooter() instanceof Player) {
			return;
		}
		Entity mob = (Entity) arrow.getShooter();
		if(arrow1(arrow, mob, loc) && arrow2(arrow, mob, loc) && arrow3(arrow, mob, loc) && arrow4(arrow, mob, loc) 
				&& arrow5(arrow, mob, loc) && arrow6(arrow, mob, loc) && arrow7(arrow, mob, loc) && arrow8(arrow, mob, loc)
				&& arrow9(arrow, mob, loc) && arrow10(arrow, mob, loc) && arrow11(arrow, mob, loc) && arrow12(arrow, mob, loc)
				&& arrow13(arrow, mob, loc) && arrow14(arrow, mob, loc) && arrow15(arrow, mob, loc) && arrow16(arrow, mob, loc)
				&& arrow17(arrow, mob, loc) && arrow18(arrow, mob, loc) && arrow19(arrow, mob, loc)) {
			SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(loc, EntityType.SPECTRAL_ARROW);
			sarrow.setVelocity(arrow.getVelocity());
		}
		return;
	}

	public boolean arrow1(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("설원 정찰자" + ChatColor.YELLOW + " [Lv.224]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.BLUE_ICE));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow2(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("코낭그" + ChatColor.YELLOW + " [Lv.??]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.END_CRYSTAL));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow3(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("초마도용기사" + ChatColor.YELLOW + " [Lv.342]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.ENDER_PEARL));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow4(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("떠도는 망령 마법사" + ChatColor.YELLOW + " [Lv.349]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.MAGMA_CREAM));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow5(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("네오아쿠아 마돌" + ChatColor.YELLOW + " [Lv.365]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.HEART_OF_THE_SEA));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow6(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("방황하는 요정" + ChatColor.YELLOW + " [Lv.372]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.ENDER_EYE));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow7(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("류" + ChatColor.YELLOW + " [Lv.394]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.HEART_OF_THE_SEA));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow8(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("켄" + ChatColor.YELLOW + " [Lv.390]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.MAGMA_CREAM));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow9(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("클레어흐의 광신도" + ChatColor.YELLOW + " [Lv.419]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.IRON_SWORD));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow10(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("Death Gun" + ChatColor.YELLOW + " [Lv.444]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.FIRE_CHARGE));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow11(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("길을 잃은 검은 수염단" + ChatColor.YELLOW + " [Lv.459]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.FIRE_CHARGE));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow12(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("길을 잃은 검은 수염단" + ChatColor.YELLOW + " [Lv.463]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.FIRE_CHARGE));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow13(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("프라에그나리" + ChatColor.YELLOW + " [Lv.??]")) {
			Location e0 = ((Skeleton) mob).getEyeLocation();
			Location e1, e2, e3, e4, e5, e6, e7, e8, e9, e10;
			Vector dir = e0.getDirection();
			e1 = loc.clone().add(dir.getX(), dir.getY(), dir.getZ());
			e2 = loc.clone().add(dir.getX() * 3, dir.getY() * 3, dir.getZ() * 3);
			e3 = loc.clone().add(dir.getX() * 5, dir.getY() * 5, dir.getZ() * 5);
			e4 = loc.clone().add(dir.getX() * 7, dir.getY() * 7, dir.getZ() * 7);
			e5 = loc.clone().add(dir.getX() * 9, dir.getY() * 9, dir.getZ() * 9);
			e6 = loc.clone().add(dir.getX() * 11, dir.getY() * 11, dir.getZ() * 11);
			e7 = loc.clone().add(dir.getX() * 13, dir.getY() * 13, dir.getZ() * 13);
			e8 = loc.clone().add(dir.getX() * 15, dir.getY() * 15, dir.getZ() * 15);
			e9 = loc.clone().add(dir.getX() * 17, dir.getY() * 17, dir.getZ() * 17);
			e10 = loc.clone().add(dir.getX() * 19, dir.getY() * 19, dir.getZ() * 19);

			mob.getWorld().spawnParticle(Particle.NOTE, e1, 0);
			mob.getWorld().spawnParticle(Particle.NOTE, e2, 0);
			mob.getWorld().spawnParticle(Particle.NOTE, e3, 0);
			mob.getWorld().spawnParticle(Particle.NOTE, e4, 0);
			mob.getWorld().spawnParticle(Particle.NOTE, e5, 0);
			mob.getWorld().spawnParticle(Particle.NOTE, e6, 0);
			mob.getWorld().spawnParticle(Particle.NOTE, e7, 0);
			mob.getWorld().spawnParticle(Particle.NOTE, e8, 0);
			mob.getWorld().spawnParticle(Particle.NOTE, e9, 0);
			mob.getWorld().spawnParticle(Particle.NOTE, e10, 0);
			return false;
		}
		return true;
	}

	public boolean arrow14(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("석상 파수꾼" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				if (((LivingEntity) mob).getHealth() >= (((LivingEntity) mob).getMaxHealth() / 5)) {
					if (arrow.getPassenger() != null) {
						arrow.removePassenger(arrow.getPassenger());
					}
					Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.MAGMA_CREAM));
					item.setPickupDelay(10000000);
					arrow.addPassenger(item);
					return false;
				}
			}
			return true;
		}
		return true;
	}
	
	public boolean arrow15(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("5층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.HEART_OF_THE_SEA));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow16(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("포보르 사제" + ChatColor.YELLOW + " [Lv.510]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.HEART_OF_THE_SEA));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow17(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("점액에 녹은 스켈레톤" + ChatColor.YELLOW + " [Lv.570]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.SLIME_BLOCK));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow18(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("검은 수염단 엘리트" + ChatColor.YELLOW + " [Lv.605]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.FIRE_CHARGE));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow19(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("떠도는 포보르" + ChatColor.YELLOW + " [Lv.570]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.HEART_OF_THE_SEA));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
}
