package testPack;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpawnAnimal {

	public boolean spawn(Entity animal) {
		LivingEntity entity = (LivingEntity) animal;				
		if(animal1(entity) && animal2(entity) && animal3(entity) && animal4(entity) && animal5(entity) && animal6(entity) && animal7(entity)) {
			return true;
		} 
		return false;
	}
	
	public boolean animal1(LivingEntity entity) {
		//튜토 돼지 3736 35 3688  3730 42 3675
		if(entity.getLocation().getX()<=3736 && entity.getLocation().getY()<=42 && entity.getLocation().getZ()<=3688
				&& entity.getLocation().getX()>=3730 && entity.getLocation().getY()>=35 && entity.getLocation().getZ()>=3675) {
			if (entity.getType() == (EntityType) EntityType.PIG) {
				entity.setCustomName(ChatColor.GREEN + "돼지");
				entity.setCustomNameVisible(true);
				((LivingEntity) entity).setMaxHealth(99999);
				((LivingEntity) entity).setHealth(99999);
				entity.setNoDamageTicks(Integer.MAX_VALUE);
				entity.setCollidable(false);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 32700));
				return true;
			} else if(entity.getType() == (EntityType) EntityType.IRON_GOLEM || entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean animal2(LivingEntity entity) {
		//포르간 돼지 -1591 55 2491  -1635 57 2533 
		if(entity.getLocation().getX()<=-1591 && entity.getLocation().getY()<=58 && entity.getLocation().getZ()<=2533
				&& entity.getLocation().getX()>=-1635 && entity.getLocation().getY()>=40 && entity.getLocation().getZ()>=2491) { 
			if (entity.getType() == (EntityType) EntityType.PIG) {
				entity.setCustomName(ChatColor.GREEN + "돼지");
				entity.setCustomNameVisible(true);
				((LivingEntity) entity).setMaxHealth(99999);
				((LivingEntity) entity).setHealth(99999);
				entity.setNoDamageTicks(Integer.MAX_VALUE);
				entity.setCollidable(false);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 32700));
				return true;
			} else if(entity.getType() == (EntityType) EntityType.IRON_GOLEM || entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean animal3(LivingEntity entity) {
		//미유 닭 -1084 184 1493  -1114 178 1527
		if(entity.getLocation().getX()<=-1084 && entity.getLocation().getY()<=184 && entity.getLocation().getZ()<=1527
				&& entity.getLocation().getX()>=-1114 && entity.getLocation().getY()>=178 && entity.getLocation().getZ()>=1493) { 
			if (entity.getType() == (EntityType) EntityType.CHICKEN) {
				entity.setCustomName(ChatColor.GREEN + "닭");
				entity.setCustomNameVisible(true);
				((LivingEntity) entity).setMaxHealth(99999);
				((LivingEntity) entity).setHealth(99999);
				entity.setNoDamageTicks(Integer.MAX_VALUE);
				entity.setCollidable(false);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 32700));
				return true;
			} else if(entity.getType() == (EntityType) EntityType.IRON_GOLEM || entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean animal4(LivingEntity entity) {
		//카이만 양 -509 53 1297  -521 55 1287
		if(entity.getLocation().getX()<=-509 && entity.getLocation().getY()<=55 && entity.getLocation().getZ()<=1297
				&& entity.getLocation().getX()>=-521 && entity.getLocation().getY()>=53 && entity.getLocation().getZ()>=1287) { 
			if (entity.getType() == (EntityType) EntityType.SHEEP) {
				entity.setCustomName(ChatColor.GREEN + "양");
				entity.setCustomNameVisible(true);
				((LivingEntity) entity).setMaxHealth(99999);
				((LivingEntity) entity).setHealth(99999);
				entity.setNoDamageTicks(Integer.MAX_VALUE);
				entity.setCollidable(false);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 32700));
				return true;
			} else if(entity.getType() == (EntityType) EntityType.IRON_GOLEM || entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean animal5(LivingEntity entity) {
		//베아그 돼지 55 118 -264  27 100 -303
		if(entity.getLocation().getX()<=55 && entity.getLocation().getY()<=118 && entity.getLocation().getZ()<=-264
				&& entity.getLocation().getX()>=27 && entity.getLocation().getY()>=100 && entity.getLocation().getZ()>=-303) { 
			if (entity.getType() == (EntityType) EntityType.PIG) {
				entity.setCustomName(ChatColor.GREEN + "돼지");
				entity.setCustomNameVisible(true);
				((LivingEntity) entity).setMaxHealth(99999);
				((LivingEntity) entity).setHealth(99999);
				entity.setNoDamageTicks(Integer.MAX_VALUE);
				entity.setCollidable(false);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 32700));
				return true;
			} else if(entity.getType() == (EntityType) EntityType.IRON_GOLEM || entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean animal6(LivingEntity entity) {
		//롱게 소 868 58 479  914 65 562  
		if(entity.getLocation().getX()<=914 && entity.getLocation().getY()<=65 && entity.getLocation().getZ()<=562
				&& entity.getLocation().getX()>=868 && entity.getLocation().getY()>=58 && entity.getLocation().getZ()>=479) { 
			if (entity.getType() == (EntityType) EntityType.COW) {
				entity.setCustomName(ChatColor.GREEN + "소");
				entity.setCustomNameVisible(true);
				((LivingEntity) entity).setMaxHealth(99999);
				((LivingEntity) entity).setHealth(99999);
				entity.setNoDamageTicks(Integer.MAX_VALUE);
				entity.setCollidable(false);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 32700));
				return true;
			} else if(entity.getType() == (EntityType) EntityType.IRON_GOLEM || entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean animal7(LivingEntity entity) {
		//롱게 소2 984 72 543  904 59 605
		if(entity.getLocation().getX()<=984 && entity.getLocation().getY()<=72 && entity.getLocation().getZ()<=605
				&& entity.getLocation().getX()>=904 && entity.getLocation().getY()>=59 && entity.getLocation().getZ()>=543) { 
			if (entity.getType() == (EntityType) EntityType.COW) {
				entity.setCustomName(ChatColor.GREEN + "소");
				entity.setCustomNameVisible(true);
				((LivingEntity) entity).setMaxHealth(99999);
				((LivingEntity) entity).setHealth(99999);
				entity.setNoDamageTicks(Integer.MAX_VALUE);
				entity.setCollidable(false);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 32700));
				return true;
			} else if(entity.getType() == (EntityType) EntityType.IRON_GOLEM || entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
}
