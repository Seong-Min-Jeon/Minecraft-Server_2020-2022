package testPack;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.SkeletonHorse;

public class NPCHitBox {

	public NPCHitBox() {
		npc1();
		npc2();
		npc3();
		npc4();
	}
	
	public void npc1() {
		Location loc = new Location(Bukkit.getWorld("world"), -2503, 53, 531, 0, 0);
		SkeletonHorse ent = (SkeletonHorse) loc.getWorld().spawnEntity(loc, EntityType.SKELETON_HORSE);
		ent.setNoDamageTicks(Integer.MAX_VALUE);
		ent.setInvulnerable(true);
		ent.setAI(false);
	}
	
	public void npc2() {
		Location loc = new Location(Bukkit.getWorld("world"), -2453, 84, 751, 0, 0);
		SkeletonHorse ent = (SkeletonHorse) loc.getWorld().spawnEntity(loc, EntityType.SKELETON_HORSE);
		ent.setNoDamageTicks(Integer.MAX_VALUE);
		ent.setInvulnerable(true);
		ent.setAI(false);
	}
	
	public void npc3() {
		Location loc = new Location(Bukkit.getWorld("world"), -2433, 28, 796, 180, 0);
		SkeletonHorse ent = (SkeletonHorse) loc.getWorld().spawnEntity(loc, EntityType.SKELETON_HORSE);
		ent.setNoDamageTicks(Integer.MAX_VALUE);
		ent.setInvulnerable(true);
		ent.setAI(false);
	}
	
	public void npc4() {
		Location loc = new Location(Bukkit.getWorld("world"), 291, 55, 153, 90, 0);
		SkeletonHorse ent = (SkeletonHorse) loc.getWorld().spawnEntity(loc, EntityType.SKELETON_HORSE);
		ent.setNoDamageTicks(Integer.MAX_VALUE);
		ent.setInvulnerable(true);
		ent.setAI(false);
	}
}
