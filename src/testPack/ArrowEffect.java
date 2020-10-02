package testPack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.SpectralArrow;

public class ArrowEffect {
	
	Player player = null;
	World world = null;
	private static Map<Player, Integer> timer = new HashMap<>();
	
	public void useBow(Player playerArg) {
		player = playerArg;	
		Material mat = player.getInventory().getItemInMainHand().getType();
		if(mat == Material.DEAD_BRAIN_CORAL_BLOCK || mat == Material.DEAD_BUBBLE_CORAL_BLOCK || mat == Material.DEAD_FIRE_CORAL_BLOCK
				|| mat == Material.DEAD_HORN_CORAL_BLOCK || mat == Material.DEAD_TUBE_CORAL_BLOCK) {
			boolean bool = false;
			if(mat == Material.DEAD_BRAIN_CORAL_BLOCK) {
				bool = reload(player, 1000);
			}
			if(mat == Material.DEAD_BUBBLE_CORAL_BLOCK) {
				bool = reload(player, 500);
			}
			if(mat == Material.DEAD_FIRE_CORAL_BLOCK) {
				bool = reload(player, 200);
			}
			if(mat == Material.DEAD_HORN_CORAL_BLOCK) {
				bool = reload(player, 80);
			}
			if(mat == Material.DEAD_TUBE_CORAL_BLOCK) {
				bool = reload(player, 2000);
			}
			if(bool) {
				Location loc = player.getLocation();
				world = player.getWorld();
				Arrow arrow = player.launchProjectile(Arrow.class);
				arrow.setShooter(player);
				arrow.setVelocity(player.getLocation().getDirection().multiply(3.0f));
				player.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, loc.add(0,1,0), 0);			
				world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
				
				SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(loc, EntityType.SPECTRAL_ARROW);
				sarrow.setVelocity(arrow.getVelocity());
			}			
		}
	}
	
	public void useGun(Player playerArg) {
		player = playerArg;
		Material mat = player.getInventory().getItemInMainHand().getType();
		if(mat == Material.BRAIN_CORAL_BLOCK || mat == Material.HORN_CORAL_BLOCK || mat == Material.TUBE_CORAL_BLOCK 
				|| mat == Material.BUBBLE_CORAL_BLOCK || mat == Material.FIRE_CORAL_BLOCK) {
			boolean bool = false;
			if(mat == Material.BRAIN_CORAL_BLOCK) {
				bool = reload(player, 80);
			}
			if(mat == Material.BUBBLE_CORAL_BLOCK) {
				bool = reload(player, 2500);
			}
			if(mat == Material.FIRE_CORAL_BLOCK) {
				bool = reload(player, 30);
			}
			if(mat == Material.HORN_CORAL_BLOCK) {
				bool = reload(player, 1000);
			}
			if(mat == Material.TUBE_CORAL_BLOCK) {
				bool = reload(player, 700);
			}
			if(bool) {
				Location loc = player.getLocation();
				world = player.getWorld();
				SmallFireball arrow = player.launchProjectile(SmallFireball.class);
				arrow.setShooter(player);
				arrow.setIsIncendiary(false);
				arrow.setVelocity(player.getLocation().getDirection().multiply(4.0f));
				player.getWorld().spawnParticle(Particle.FLAME, loc.add(0, 1, 0), 0);
				world.playSound(player.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 1.0f, 1.0f);
			}
		}
	}
	
	public boolean reload(Player playerArg, int reload) {
		player = playerArg;
		if(timer.containsKey(player)) {
			Integer lastTime = timer.get(player);
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		if(time-lastTime > reload) {
	 			timer.remove(player);
		 		timer.put(player, time);
		 		return true;
	 		}			
		} else {
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		timer.put(player, time);
	 		return true;
		}
		return false;
	}

}
