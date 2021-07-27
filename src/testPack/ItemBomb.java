package testPack;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
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
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class ItemBomb {
	
	private int sleep = 0;

	public ItemBomb(Player player, ItemStack item) {
		World world = player.getWorld();
		
		try {
			if(item.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "OMEGA 765")) {
				item.setAmount(item.getAmount()-1);
				
				Arrow arrow = player.launchProjectile(Arrow.class);
				arrow.setShooter(player);
				arrow.setVelocity(player.getLocation().getDirection().multiply(1.0f));		
				world.spawnParticle(Particle.ASH, arrow.getLocation(), 2);
				world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.5f, 1.0f);
				
				Item dItem = arrow.getWorld().dropItem(arrow.getLocation(), new ItemStack(Material.BLACK_GLAZED_TERRACOTTA));
				dItem.setPickupDelay(10000000);
				arrow.addPassenger(dItem);
				
				Thread t = new Thread(player.getUniqueId());
				sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
					
					@Override
					public void run() {
						if (!t.hasID()) {
							t.setID(sleep);
						}
					
						if(arrow.isDead()) {	
							List<Entity> entitylist = arrow.getNearbyEntities(3, 3, 3);
							for (Entity nearEntity : entitylist) {
								if (nearEntity.getType() != EntityType.PLAYER && nearEntity.getType() != EntityType.VILLAGER) {
									if (nearEntity instanceof LivingEntity) {
										try {
											// 효과 적용
											LivingEntity nearMob = (LivingEntity) nearEntity;
											if(nearMob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE) == null) {
												nearMob.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 600, 0, true, false));
											} else {
												nearMob.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 600, nearMob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier()+1, true, false));
											}
										} catch(Exception e) {
											
										}
									}
								}
							}
							
							//파티클
							Location loc = arrow.getLocation();
							Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(100, 100, 100), 1);
					        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(120, 120, 120), 1);
					        
							new BukkitRunnable() {
								int time = 0;
								int size = 0;
								Location e1;

								@Override
								public void run() {
									
									if(time % 1 == 0) {
										double var = 0;
										
										for(int i = 0 ; i < 32 ; i++) {
											if(size % 2 == 0) {
												e1 = loc.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
											} else {
												e1 = loc.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
											}
											player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
											
											var += Math.PI / 16;
										}
										
										if(size == 2) {
											size = -1;
										}
										size++;
									}
									
									if(time % 3 == 0) {
										double var = 0;
										
										for(int i = 0 ; i < 32 ; i++) {
											e1 = loc.clone().add(Math.cos(var)*3, 0, Math.sin(var)*3);
											player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
											
											var += Math.PI / 16;
										}
									}

									if(time >= 10) {
										this.cancel();
									}
									
									time++;
								}
							}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
							
							t.endTask();
							t.removeID();
						}
					}						
					
				}, 0, 1);
			} 
		} catch(Exception e1) {
			
		}
	}
	
}
