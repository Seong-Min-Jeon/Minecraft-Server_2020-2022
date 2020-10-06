package testPack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class ArrowEffect {
	
	Player player = null;
	World world = null;
	private static Map<Player, Integer> timer = new HashMap<>();
	
	public void useStaff(Player playerArg) {
		player = playerArg;	
		Material mat = player.getInventory().getItemInMainHand().getType();
		if(mat == Material.MUSIC_DISC_11 || mat == Material.MUSIC_DISC_13 || mat == Material.MUSIC_DISC_BLOCKS || mat == Material.MUSIC_DISC_CAT || mat == Material.MUSIC_DISC_CHIRP || 
				mat == Material.MUSIC_DISC_FAR || mat == Material.MUSIC_DISC_MALL || mat == Material.MUSIC_DISC_MELLOHI || mat == Material.MUSIC_DISC_PIGSTEP || mat == Material.MUSIC_DISC_STAL || 
				mat == Material.MUSIC_DISC_STRAD || mat == Material.MUSIC_DISC_WAIT || mat == Material.MUSIC_DISC_WARD) {
			try {
				ItemStack item = player.getInventory().getItemInMainHand();
				ItemMeta im = item.getItemMeta();
				boolean bool = false;
				if(im.getDisplayName().equals(ChatColor.AQUA + "죽음의 서약")) {
					if(player.getLevel() >= 350) {
						if(removeMana(player, 1)) {
							bool = reload(player, 1000);
						}
					} 
				}
				if(im.getDisplayName().equals(ChatColor.AQUA + "테스트용")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1, true, false, false));
				}
				if(bool) {
					
					world = player.getWorld();
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.teleport(arrow.getLocation().add(0,-0.2,0));
					arrow.setVelocity(player.getLocation().getDirection().multiply(5.0f));
					world.playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 6.0f, 8.0f);
					
					if(im.getDisplayName().equals(ChatColor.AQUA + "죽음의 서약")) {
						Item passenger = arrow.getWorld().dropItem(arrow.getLocation(), new ItemStack(Material.END_CRYSTAL));
						passenger.setPickupDelay(10000000);
						arrow.addPassenger(passenger);
						Location origin = player.getEyeLocation().add(0,-0.2,0);
						Vector direction = origin.getDirection();
						direction.multiply(10);
						direction.normalize();
						for (int i = 0; i < 10; i++) {
						    Location loc = origin.add(direction);
						    loc.getWorld().spawnParticle(Particle.SMOKE_NORMAL, loc, 0);
						}
					}
					
				}
			} catch(Exception e) {
				
			}
		}
	}
	
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
	
	public boolean removeMana(Player player, int num) {
		int i = 0;
		for (ItemStack is : player.getInventory().getContents()) {
			if (is == null)
				continue;
			if (is.getType() == Material.HEART_OF_THE_SEA) {
				i = i + is.getAmount();
			}
		}
		if(i == num) {
			player.getInventory().remove(Material.HEART_OF_THE_SEA);
			ItemStack item = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.RED + "마나없음");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			return true;
		} else if(i > num) {
			player.getInventory().remove(Material.HEART_OF_THE_SEA);
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - num);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			return true;
		} else {
			player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
			player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
			return false;
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
