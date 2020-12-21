package testPack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
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
	private int taskID;
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
						if(checkMana(player, 5)) {
							bool = reload(player, 1000);
							if(bool) {
								removeMana(player, 5);
							}
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.YELLOW + "질풍의 지팡이")) {
					if(player.getLevel() >= 300) {
						if(checkMana(player, 1)) {
							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 6.0f, 8.0f);
							player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1, true, false, false));
							player.sendMessage(ChatColor.GREEN + "신속이 부여됩니다.");
							removeMana(player, 1);
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "고목나무 지팡이")) {
					if(player.getLevel() >= 300) {
						if(checkMana(player, 2)) {
							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 6.0f, 8.0f);
							if(player.getHealth() >= 18) {
								player.setHealth(20);
							} else {
								player.setHealth(player.getHealth() + 2);
							}
							player.sendMessage(ChatColor.GREEN + "체력이 회복되었습니다.");
							removeMana(player, 2);
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.YELLOW + "암석 스태프")) {
					if(player.getLevel() >= 450) {
						if(checkMana(player, 2)) {
							bool = reload(player, 3000);
							if(bool) {
								removeMana(player, 2);
							}
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "대지의 스태프")) {
					if(player.getLevel() >= 470) {
						if(checkMana(player, 3)) {
							bool = reload(player, 2000);
							if(bool) {
								removeMana(player, 3);
							}
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.AQUA + "에이션트 윙")) {
					if(player.getLevel() >= 480) {
						if(checkMana(player, 3)) {
							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 6.0f, 8.0f);
							player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1, true, false, false));
							Vector vec = player.getEyeLocation().getDirection().multiply(2.5f);
							player.setVelocity(vec);
							player.getWorld().playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 1.8f);
							player.sendMessage(ChatColor.GREEN + "신속이 부여됩니다.");
							removeMana(player, 3);
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.DARK_RED + "트리니티 스태프")) {
					if(player.getLevel() >= 500) {
						if(checkMana(player, 10)) {
							bool = reload(player, 3000);
							if(bool) {
								removeMana(player, 10);
							}
						}
					} 
				}
				if(bool) {
					
					world = player.getWorld();
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.teleport(arrow.getLocation().add(0,-0.2,0));
					arrow.setVelocity(player.getLocation().getDirection().multiply(5.0f));
					world.playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 6.0f, 8.0f);
					
					if(im.getDisplayName().equals(ChatColor.AQUA + "죽음의 서약")) {
						staffE1(arrow);
					} else if(im.getDisplayName().equals(ChatColor.YELLOW + "암석 스태프")) {
						staffE2(arrow);
					} else if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "대지의 스태프")) {
						staffE3(arrow);
					} else if(im.getDisplayName().equals(ChatColor.DARK_RED + "트리니티 스태프")) {
						staffE4(arrow);
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
				Location loc = player.getEyeLocation();
				world = player.getWorld();
				SmallFireball arrow = player.launchProjectile(SmallFireball.class);
				arrow.setShooter(player);
				arrow.setIsIncendiary(false);
				arrow.setVelocity(player.getLocation().getDirection().multiply(4.0f));
				Vector dir = loc.getDirection();
				Location e1, e2, e3, e4, e5, e6, e7, e8, e9, e10;
				e1 = loc.clone().add(dir.getX(), dir.getY(), dir.getZ());
				e2 = loc.clone().add(dir.getX() * 2, dir.getY() * 2, dir.getZ() * 2);
				e3 = loc.clone().add(dir.getX() * 3, dir.getY() * 3, dir.getZ() * 3);
				e4 = loc.clone().add(dir.getX() * 4, dir.getY() * 4, dir.getZ() * 4);
				e5 = loc.clone().add(dir.getX() * 5, dir.getY() * 5, dir.getZ() * 5);
				e6 = loc.clone().add(dir.getX() * 6, dir.getY() * 6, dir.getZ() * 6);
				e7 = loc.clone().add(dir.getX() * 7, dir.getY() * 7, dir.getZ() * 7);
				e8 = loc.clone().add(dir.getX() * 8, dir.getY() * 8, dir.getZ() * 8);
				e9 = loc.clone().add(dir.getX() * 9, dir.getY() * 9, dir.getZ() * 9);
				e10 = loc.clone().add(dir.getX() * 10, dir.getY() * 10, dir.getZ() * 10);

				player.getWorld().spawnParticle(Particle.ASH, e1, 0);
				player.getWorld().spawnParticle(Particle.ASH, e2, 0);
				player.getWorld().spawnParticle(Particle.ASH, e3, 0);
				player.getWorld().spawnParticle(Particle.ASH, e4, 0);
				player.getWorld().spawnParticle(Particle.ASH, e5, 0);
				player.getWorld().spawnParticle(Particle.ASH, e6, 0);
				player.getWorld().spawnParticle(Particle.ASH, e7, 0);
				player.getWorld().spawnParticle(Particle.ASH, e8, 0);
				player.getWorld().spawnParticle(Particle.ASH, e9, 0);
				player.getWorld().spawnParticle(Particle.ASH, e10, 0);
				world.playSound(player.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 1.0f, 1.0f);
			}
		}
	}
	
	public void removeMana(Player player, int num) {
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
		} else if(i > num) {
			player.getInventory().remove(Material.HEART_OF_THE_SEA);
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - num);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
		}
	}
	
	public boolean checkMana(Player player, int num) {
		int i = 0;
		for (ItemStack is : player.getInventory().getContents()) {
			if (is == null)
				continue;
			if (is.getType() == Material.HEART_OF_THE_SEA) {
				i = i + is.getAmount();
			}
		}
		if(i == num) {
			return true;
		} else if(i > num) {
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
	 		if(Math.abs(time-lastTime) > reload) {
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

	public void staffE1(Arrow arrow) {
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
	
	public void staffE2(Arrow arrow) {
		Item passenger = arrow.getWorld().dropItem(arrow.getLocation(), new ItemStack(Material.SAND));
		passenger.setPickupDelay(10000000);
		arrow.addPassenger(passenger);
		Location origin = player.getEyeLocation().add(0,-0.2,0);
		Vector direction = origin.getDirection();
		direction.multiply(10);
		direction.normalize();
		for (int i = 0; i < 10; i++) {
		    Location loc = origin.add(direction);
		    loc.getWorld().spawnParticle(Particle.CRIT, loc, 0);
		}
	}
	
	public void staffE3(Arrow arrow) {
		Item passenger = arrow.getWorld().dropItem(arrow.getLocation(), new ItemStack(Material.CHARCOAL));
		passenger.setPickupDelay(10000000);
		arrow.addPassenger(passenger);
		Location origin = player.getEyeLocation().add(0,-0.2,0);
		Vector direction = origin.getDirection();
		direction.multiply(10);
		direction.normalize();
		for (int i = 0; i < 10; i++) {
		    Location loc = origin.add(direction);
		    loc.getWorld().spawnParticle(Particle.LAVA, loc, 0);
		}
	}
	
	public void staffE4(Arrow arrow) {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			
			int time;
			ThreadData td = new ThreadData(player.getUniqueId());

			@Override
			public void run() {
				
				if(!td.hasID()) {
					td.setID(taskID);
				}
				
				if(time == 4) {
					arrow.setVelocity(new Vector(0, 0, 0));
					arrow.setGravity(false);
					List<Entity> entitylist = arrow.getNearbyEntities(6, 6, 6);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.damage(player.getLevel()*300);
							}
						}
					}
					world.playSound(arrow.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 3.0f, 1.0f);
					world.spawnParticle(Particle.EXPLOSION_LARGE, arrow.getLocation(), 0);
					world.spawnParticle(Particle.FLAME, arrow.getLocation(), 10);
				}
				
				if(time == 24) {
					List<Entity> entitylist = arrow.getNearbyEntities(6, 6, 6);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.damage(player.getLevel()*300);
							}
						}
					}
					world.playSound(arrow.getLocation(), Sound.ENTITY_PLAYER_SPLASH, 10.0f, 2.0f);
					world.spawnParticle(Particle.WATER_SPLASH, arrow.getLocation().add(0, 1, 0), 10);
					world.spawnParticle(Particle.WATER_SPLASH, arrow.getLocation().add(1, 1, 0), 10);
					world.spawnParticle(Particle.WATER_SPLASH, arrow.getLocation().add(1, 1, 1), 10);
					world.spawnParticle(Particle.WATER_SPLASH, arrow.getLocation().add(1, 1, -1), 10);
					world.spawnParticle(Particle.WATER_SPLASH, arrow.getLocation().add(0, 1, 1), 10);
					world.spawnParticle(Particle.WATER_SPLASH, arrow.getLocation().add(0, 1, -1), 10);
					world.spawnParticle(Particle.WATER_SPLASH, arrow.getLocation().add(-1, 1, 0), 10);
					world.spawnParticle(Particle.WATER_SPLASH, arrow.getLocation().add(-1, 1, 1), 10);
					world.spawnParticle(Particle.WATER_SPLASH, arrow.getLocation().add(-1, 1, -1), 10);
				}
				
				if(time == 44) {
					arrow.setGravity(true);
					List<Entity> entitylist = arrow.getNearbyEntities(6, 6, 6);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.damage(player.getLevel()*300);
							}
						}
					}
					world.spawnParticle(Particle.FLASH, arrow.getLocation(), 10);
					world.playSound(arrow.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 3.0f, 1.0f);
					
					td.endTask();
					td.removeID();
				}
				
				time++;
				
			}

		}, 0, 1);
	}
	
}
