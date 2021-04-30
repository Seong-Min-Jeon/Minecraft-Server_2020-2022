package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class ParticleEffect {

	private int taskID;
	private final Player player;
	private Entity ent;

	public ParticleEffect(Player player) {
		this.player = player;
	}
	
	public ParticleEffect(Player player, Entity ent) {
		this.player = player;
		this.ent = ent;
	}
	
	public void newEffect1() {
		Location normal = player.getEyeLocation();
		World world = player.getWorld(); 
		
		double arrowAngle1 = 73;
        double totalAngle1 = normal.getYaw() + arrowAngle1;
        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
        
        double arrowAngle2 = 90;
        double totalAngle2 = normal.getYaw() + arrowAngle2;
        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
        
        double arrowAngle3 = 107;
        double totalAngle3 = normal.getYaw() + arrowAngle3;
        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
		
		Particle.DustOptions dustOptions = new Particle.DustOptions(Color.YELLOW, 1);
		
		world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 3.0f, 0.5f);
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				Location e1, e2, e3;
				
				if(time % 1 == 0 && time <= 13) {
					e1 = normal.clone().add(dirX1*4, 1.5-(time*0.15), dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 10, dustOptions);
					
					e2 = normal.clone().add(dirX2*4, 1.5-(time*0.15), dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e2, 10, dustOptions);
					
					e3 = normal.clone().add(dirX3*4, 1.5-(time*0.15), dirZ3*4);
					world.spawnParticle(Particle.REDSTONE, e3, 10, dustOptions);
				}
				
				if(time == 13) {
					e1 = normal.clone().add(dirX1*4, 1-(time*0.15), dirZ1*4);
					e2 = normal.clone().add(dirX2*4, 1-(time*0.15), dirZ2*4);
					e3 = normal.clone().add(dirX3*4, 1-(time*0.15), dirZ3*4);
					world.playSound(normal, Sound.ENTITY_GENERIC_EXPLODE, 1f, 1.0f);
					world.spawnParticle(Particle.EXPLOSION_LARGE, e1, 0);
					world.spawnParticle(Particle.EXPLOSION_LARGE, e2, 0);
					world.spawnParticle(Particle.EXPLOSION_LARGE, e3, 0);
				}
				
				if(time >= 23) {
					e1 = normal.clone().add(dirX1*4, -1.5, dirZ1*4);
					e2 = normal.clone().add(dirX2*4, -1.5, dirZ2*4);
					e3 = normal.clone().add(dirX3*4, -1.5, dirZ3*4);
					Material mat = player.getLocation().add(0,-1,0).getBlock().getType();
					try {
						player.getWorld().playEffect(e1, Effect.STEP_SOUND, mat);
						player.getWorld().playEffect(e2, Effect.STEP_SOUND, mat);
						player.getWorld().playEffect(e3, Effect.STEP_SOUND, mat);
					} catch(Exception e) {
						player.getWorld().playEffect(e1, Effect.STEP_SOUND, Material.GRASS_BLOCK);
						player.getWorld().playEffect(e2, Effect.STEP_SOUND, Material.GRASS_BLOCK);
						player.getWorld().playEffect(e3, Effect.STEP_SOUND, Material.GRASS_BLOCK);
					}
					
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

		//1.12는 아래 코드가 옳다고 함
//		player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0,255,255,255,1);
//		player.getWorld().spawnParticle(Particle.REDSTONE, e2, 0,255,255,255,1);
		
	}
	
	public void newEffect2() {
		World world = player.getWorld(); 
		Location loc = player.getLocation();
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time < 3) {
					double r = time + 0.5;
					for (double pi = 0; pi <= Math.PI; pi += Math.PI / 15) {
						double y = r * Math.cos(pi) + 1.5;
						for (double theta = 0; theta <= 2 * Math.PI; theta += Math.PI / 30) {
							double x = r * Math.cos(theta) * Math.sin(pi);
							double z = r * Math.sin(theta) * Math.sin(pi);

							loc.add(x, y, z);
							world.spawnParticle(Particle.CRIT, loc, 0);
							loc.subtract(x, y, z);
						}
					}
				}
				
				if(time >= 13) {
					world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1f, 1.0f);
					world.spawnParticle(Particle.EXPLOSION_LARGE, loc.add(0,1,0), 0);
					
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}

	// 원시의 질주
	public void newEffect3() {
		
		new BukkitRunnable() {
			int time = 0;
			
			World world = player.getWorld(); 
			Location e1, e3;
	        
			@Override
			public void run() {
				
				Location normal = player.getEyeLocation();
				
				double arrowAngle1 = 0;
		        double totalAngle1 = normal.getYaw() + arrowAngle1;
		        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		        
		        double arrowAngle3 = 180;
		        double totalAngle3 = normal.getYaw() + arrowAngle3;
		        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
		        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
				
				e1 = normal.clone().add(dirX1, 0, dirZ1);
				world.spawnParticle(Particle.END_ROD, e1, 0);

				e3 = normal.clone().add(dirX3, 0, dirZ3);
				world.spawnParticle(Particle.END_ROD, e3, 0);

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 본 체스트
	public void newEffect4() {
		
		
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(160, 160, 160), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(120, 120, 120), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
			Location e1, e3;
			
			@Override
			public void run() {
				
				Location normal = player.getEyeLocation();
				
				if(time == 0) {
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 40+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, 0.3-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, 0.1-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 40+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.2-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.4-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 40+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.6-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.8-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 115+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, 0.05+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.025+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 120+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.45+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.525+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 125+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.85+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.925+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
				}
				
				if(time == 20) {
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 50+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, 0.3-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, 0.1-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 50+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.2-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.4-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 50+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.6-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.8-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 105+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, 0.05+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.025+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 110+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.45+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.525+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 115+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.85+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.925+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
				}
				
				if(time == 40) {
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 60+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, 0.3-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, 0.1-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 60+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.2-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.4-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 60+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.6-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.8-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 95+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, 0.05+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.025+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 100+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.45+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.525+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 105+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.85+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.925+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
				}

				if(time >= 60) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 뼈감옥
	public void newEffect5() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
		//디버프 컬러
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(150, 20, 150), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(200, 100, 200), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(50, 0, 50), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2, e3;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e2 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e2 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
						
						var += Math.PI / 16;
					}
					
					if(size == 4) {
						size = -1;
					}
					size++;
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0, Math.sin(var)*5);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						if(i % 4 == 0) {
							e3 = e1.clone().add(0,5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,4.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,4,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,3.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,3,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,2.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,2,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,1.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,1,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,0.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
						}
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 차지 어택
	public void newEffect6() {
		
		World world = player.getWorld(); 
        
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time == 0) {
					ArmorStand tmpEnt = (ArmorStand) world.spawnEntity(normal, EntityType.ARMOR_STAND);
					tmpEnt.setVisible(false);
					tmpEnt.setSmall(true);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							tmpEnt.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					List<Entity> entitylist = tmpEnt.getNearbyEntities(3, 3, 3);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*8);
						}
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.5f, 0.5f);
					player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, normal, 1);
					player.getWorld().spawnParticle(Particle.FLAME, normal, 2);
				}
				
				if(time % 10 == 0) {
					ArmorStand tmpEnt = (ArmorStand) world.spawnEntity(normal, EntityType.ARMOR_STAND);
					tmpEnt.setVisible(false);
					tmpEnt.setSmall(true);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							tmpEnt.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					List<Entity> entitylist = tmpEnt.getNearbyEntities(3, 3, 3);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*8);
						}
					}		
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.5f, 0.5f);
					player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, normal, 1);
					player.getWorld().spawnParticle(Particle.FLAME, normal, 2);
				}

				if(time >= 20) {
					ArmorStand tmpEnt = (ArmorStand) world.spawnEntity(normal, EntityType.ARMOR_STAND);
					tmpEnt.setVisible(false);
					tmpEnt.setSmall(true);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							tmpEnt.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					List<Entity> entitylist = tmpEnt.getNearbyEntities(3, 3, 3);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*8);
						}
					}		
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.5f, 0.5f);
					player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, normal, 1);
					player.getWorld().spawnParticle(Particle.FLAME, normal, 2);
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 전투의 의지
	public void newEffect7() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(200, 150, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(250, 100, 100), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(250, 230, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2, e3, e4;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e4 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e4 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e4, 2, dustOptions3);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 4 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int j = 0 ; j < 50 ; j++) {
						e1 = normal.clone().add(dirX1*0, 8-(j*0.1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 10, dustOptions2);
					}
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int j = 0 ; j < 15 ; j++) {
						e2 = normal.clone().add(dirX2*0.2, 8-(j*0.3), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e2 = normal.clone().add(dirX2*0.4, 7-(j*0.3), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e2 = normal.clone().add(dirX2*0.6, 7-(j*0.3), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e2 = normal.clone().add(dirX2*0.8, 7-(j*0.3), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int j = 0 ; j < 15 ; j++) {
						e3 = normal.clone().add(dirX3*0.2, 8-(j*0.3), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e3 = normal.clone().add(dirX3*0.4, 7-(j*0.3), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e3 = normal.clone().add(dirX3*0.6, 7-(j*0.3), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e3 = normal.clone().add(dirX3*0.8, 7-(j*0.3), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 텔레포트
	public void newEffect8() {
		
		new BukkitRunnable() {
			int time = 0;
			
			World world = player.getWorld(); 
			Location e1;
	        
			@Override
			public void run() {
				
				Location normal = player.getEyeLocation();
				
				double arrowAngle1 = 90;
		        double totalAngle1 = normal.getYaw() + arrowAngle1;
		        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
				
				e1 = normal.clone().add(dirX1*1.5, 0, dirZ1*1.5);
				world.spawnParticle(Particle.DRAGON_BREATH, e1, 0);

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 넬의 사랑
	public void newEffect9() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(50, 230, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(100, 255, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2, e3, e4;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e4 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e4 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e4, 2, dustOptions2);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 4 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int j = 0 ; j < 20 ; j++) {
						e1 = normal.clone().add(dirX1*0, 8-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
					}
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int j = 0 ; j < 20 ; j++) {
						e2 = normal.clone().add(dirX2*0.2, 8-(j*0.2), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 20 ; j++) {
						e2 = normal.clone().add(dirX2*0.4, 8-(j*0.2), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e2 = normal.clone().add(dirX2*0.6, 7.1-(j*0.23), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e2 = normal.clone().add(dirX2*0.8, 7.1-(j*0.23), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e2 = normal.clone().add(dirX2*1, 7.1-(j*0.23), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e2 = normal.clone().add(dirX2*1.2, 7.1-(j*0.23), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int j = 0 ; j < 20 ; j++) {
						e3 = normal.clone().add(dirX3*0.2, 8-(j*0.2), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 20 ; j++) {
						e3 = normal.clone().add(dirX3*0.4, 8-(j*0.2), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e3 = normal.clone().add(dirX3*0.6, 7.1-(j*0.23), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e3 = normal.clone().add(dirX3*0.8, 7.1-(j*0.23), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e3 = normal.clone().add(dirX3*1, 7.1-(j*0.23), dirZ3*1);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e3 = normal.clone().add(dirX3*1.2, 7.1-(j*0.23), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 딘의 화염
	public void newEffect10() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(200, 150, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(255, 0, 0), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(250, 230, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e4;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e4 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e4 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e4, 2, dustOptions3);
						
						var += Math.PI / 16;
					}
					
					if(size == 7) {
						size = -1;
					}
					size++;
				}
				
				if(time == 1) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
				}
				
				if(time == 2) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
				}
				
				if(time == 3) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
				}
				
				if(time == 4) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
				}
				
				if(time == 5) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 6) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 7) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 8) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 9) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 10) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 11) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 12) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 13) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle117 = 75;
					double totalAngle117 = normal.getYaw() + arrowAngle117;
					double dirX117 = Math.cos(Math.toRadians(totalAngle117));
					double dirZ117 = Math.sin(Math.toRadians(totalAngle117));
					
					e1 = normal.clone().add(dirX117*(-1.5), 0, dirZ117*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1111 = 72;
					double totalAngle1111 = normal.getYaw() + arrowAngle1111;
					double dirX1111 = Math.cos(Math.toRadians(totalAngle1111));
					double dirZ1111 = Math.sin(Math.toRadians(totalAngle1111));
					
					e1 = normal.clone().add(dirX1111*(-2), 0, dirZ1111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1121 = 69;
					double totalAngle1121 = normal.getYaw() + arrowAngle1121;
					double dirX1121 = Math.cos(Math.toRadians(totalAngle1121));
					double dirZ1121 = Math.sin(Math.toRadians(totalAngle1121));
					
					e1 = normal.clone().add(dirX1121*(-2.3), 0, dirZ1121*(-2.3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 14) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle117 = 75;
					double totalAngle117 = normal.getYaw() + arrowAngle117;
					double dirX117 = Math.cos(Math.toRadians(totalAngle117));
					double dirZ117 = Math.sin(Math.toRadians(totalAngle117));
					
					e1 = normal.clone().add(dirX117*(-1.5), 0, dirZ117*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1111 = 72;
					double totalAngle1111 = normal.getYaw() + arrowAngle1111;
					double dirX1111 = Math.cos(Math.toRadians(totalAngle1111));
					double dirZ1111 = Math.sin(Math.toRadians(totalAngle1111));
					
					e1 = normal.clone().add(dirX1111*(-2), 0, dirZ1111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1121 = 69;
					double totalAngle1121 = normal.getYaw() + arrowAngle1121;
					double dirX1121 = Math.cos(Math.toRadians(totalAngle1121));
					double dirZ1121 = Math.sin(Math.toRadians(totalAngle1121));
					
					e1 = normal.clone().add(dirX1121*(-2.3), 0, dirZ1121*(-2.3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle126 = 64;
					double totalAngle126 = normal.getYaw() + arrowAngle126;
					double dirX126 = Math.cos(Math.toRadians(totalAngle126));
					double dirZ126 = Math.sin(Math.toRadians(totalAngle126));
					
					e1 = normal.clone().add(dirX126*(-2.6), 0, dirZ126*(-2.6));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1216 = 59;
					double totalAngle1216 = normal.getYaw() + arrowAngle1216;
					double dirX1216 = Math.cos(Math.toRadians(totalAngle1216));
					double dirZ1216 = Math.sin(Math.toRadians(totalAngle1216));
					
					e1 = normal.clone().add(dirX1216*(-2.8), 0, dirZ1216*(-2.8));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1226 = 54;
					double totalAngle1226 = normal.getYaw() + arrowAngle1226;
					double dirX1226 = Math.cos(Math.toRadians(totalAngle1226));
					double dirZ1226 = Math.sin(Math.toRadians(totalAngle1226));
					
					e1 = normal.clone().add(dirX1226*(-3), 0, dirZ1226*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 15) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle117 = 75;
					double totalAngle117 = normal.getYaw() + arrowAngle117;
					double dirX117 = Math.cos(Math.toRadians(totalAngle117));
					double dirZ117 = Math.sin(Math.toRadians(totalAngle117));
					
					e1 = normal.clone().add(dirX117*(-1.5), 0, dirZ117*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1111 = 72;
					double totalAngle1111 = normal.getYaw() + arrowAngle1111;
					double dirX1111 = Math.cos(Math.toRadians(totalAngle1111));
					double dirZ1111 = Math.sin(Math.toRadians(totalAngle1111));
					
					e1 = normal.clone().add(dirX1111*(-2), 0, dirZ1111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1121 = 69;
					double totalAngle1121 = normal.getYaw() + arrowAngle1121;
					double dirX1121 = Math.cos(Math.toRadians(totalAngle1121));
					double dirZ1121 = Math.sin(Math.toRadians(totalAngle1121));
					
					e1 = normal.clone().add(dirX1121*(-2.3), 0, dirZ1121*(-2.3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle126 = 64;
					double totalAngle126 = normal.getYaw() + arrowAngle126;
					double dirX126 = Math.cos(Math.toRadians(totalAngle126));
					double dirZ126 = Math.sin(Math.toRadians(totalAngle126));
					
					e1 = normal.clone().add(dirX126*(-2.6), 0, dirZ126*(-2.6));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1216 = 59;
					double totalAngle1216 = normal.getYaw() + arrowAngle1216;
					double dirX1216 = Math.cos(Math.toRadians(totalAngle1216));
					double dirZ1216 = Math.sin(Math.toRadians(totalAngle1216));
					
					e1 = normal.clone().add(dirX1216*(-2.8), 0, dirZ1216*(-2.8));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1226 = 54;
					double totalAngle1226 = normal.getYaw() + arrowAngle1226;
					double dirX1226 = Math.cos(Math.toRadians(totalAngle1226));
					double dirZ1226 = Math.sin(Math.toRadians(totalAngle1226));
					
					e1 = normal.clone().add(dirX1226*(-3), 0, dirZ1226*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12161 = 49;
					double totalAngle12161 = normal.getYaw() + arrowAngle12161;
					double dirX12161 = Math.cos(Math.toRadians(totalAngle12161));
					double dirZ12161 = Math.sin(Math.toRadians(totalAngle12161));
					
					e1 = normal.clone().add(dirX12161*(-3.2), 0, dirZ12161*(-3.2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12261 = 45;
					double totalAngle12261 = normal.getYaw() + arrowAngle12261;
					double dirX12261 = Math.cos(Math.toRadians(totalAngle12261));
					double dirZ12261 = Math.sin(Math.toRadians(totalAngle12261));
					
					e1 = normal.clone().add(dirX12261*(-3.4), 0, dirZ12261*(-3.4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 16) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle117 = 75;
					double totalAngle117 = normal.getYaw() + arrowAngle117;
					double dirX117 = Math.cos(Math.toRadians(totalAngle117));
					double dirZ117 = Math.sin(Math.toRadians(totalAngle117));
					
					e1 = normal.clone().add(dirX117*(-1.5), 0, dirZ117*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1111 = 72;
					double totalAngle1111 = normal.getYaw() + arrowAngle1111;
					double dirX1111 = Math.cos(Math.toRadians(totalAngle1111));
					double dirZ1111 = Math.sin(Math.toRadians(totalAngle1111));
					
					e1 = normal.clone().add(dirX1111*(-2), 0, dirZ1111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1121 = 69;
					double totalAngle1121 = normal.getYaw() + arrowAngle1121;
					double dirX1121 = Math.cos(Math.toRadians(totalAngle1121));
					double dirZ1121 = Math.sin(Math.toRadians(totalAngle1121));
					
					e1 = normal.clone().add(dirX1121*(-2.3), 0, dirZ1121*(-2.3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle126 = 64;
					double totalAngle126 = normal.getYaw() + arrowAngle126;
					double dirX126 = Math.cos(Math.toRadians(totalAngle126));
					double dirZ126 = Math.sin(Math.toRadians(totalAngle126));
					
					e1 = normal.clone().add(dirX126*(-2.6), 0, dirZ126*(-2.6));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1216 = 59;
					double totalAngle1216 = normal.getYaw() + arrowAngle1216;
					double dirX1216 = Math.cos(Math.toRadians(totalAngle1216));
					double dirZ1216 = Math.sin(Math.toRadians(totalAngle1216));
					
					e1 = normal.clone().add(dirX1216*(-2.8), 0, dirZ1216*(-2.8));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1226 = 54;
					double totalAngle1226 = normal.getYaw() + arrowAngle1226;
					double dirX1226 = Math.cos(Math.toRadians(totalAngle1226));
					double dirZ1226 = Math.sin(Math.toRadians(totalAngle1226));
					
					e1 = normal.clone().add(dirX1226*(-3), 0, dirZ1226*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12161 = 49;
					double totalAngle12161 = normal.getYaw() + arrowAngle12161;
					double dirX12161 = Math.cos(Math.toRadians(totalAngle12161));
					double dirZ12161 = Math.sin(Math.toRadians(totalAngle12161));
					
					e1 = normal.clone().add(dirX12161*(-3.2), 0, dirZ12161*(-3.2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12261 = 45;
					double totalAngle12261 = normal.getYaw() + arrowAngle12261;
					double dirX12261 = Math.cos(Math.toRadians(totalAngle12261));
					double dirZ12261 = Math.sin(Math.toRadians(totalAngle12261));
					
					e1 = normal.clone().add(dirX12261*(-3.4), 0, dirZ12261*(-3.4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121611 = 41;
					double totalAngle121611 = normal.getYaw() + arrowAngle121611;
					double dirX121611 = Math.cos(Math.toRadians(totalAngle121611));
					double dirZ121611 = Math.sin(Math.toRadians(totalAngle121611));
					
					e1 = normal.clone().add(dirX121611*(-3.6), 0, dirZ121611*(-3.6));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122611 = 37;
					double totalAngle122611 = normal.getYaw() + arrowAngle122611;
					double dirX122611 = Math.cos(Math.toRadians(totalAngle122611));
					double dirZ122611 = Math.sin(Math.toRadians(totalAngle122611));
					
					e1 = normal.clone().add(dirX122611*(-3.8), 0, dirZ122611*(-3.8));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*8, 0, Math.sin(var)*8);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 펠의 바람
	public void newEffect11() {
		
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(50, 230, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(100, 255, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			double var = 0;
			Location loc, first, second;

			@Override
			public void run() {
				
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				world.spawnParticle(Particle.REDSTONE, first, 3, dustOptions1);
				world.spawnParticle(Particle.REDSTONE, second, 3, dustOptions2);

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 열귀각
	public void newEffect12() {
		
		World world = player.getWorld(); 
		
		Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(120, 0, 120), 1);
		
		world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 3.0f, 0.5f);
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				Location normal = player.getEyeLocation();
				
				double arrowAngle1 = 73;
		        double totalAngle1 = normal.getYaw() + arrowAngle1;
		        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		        
		        double arrowAngle2 = 90;
		        double totalAngle2 = normal.getYaw() + arrowAngle2;
		        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
		        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
		        
		        double arrowAngle3 = 107;
		        double totalAngle3 = normal.getYaw() + arrowAngle3;
		        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
		        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
				
				Location e1, e2, e3;

				e1 = normal.clone().add(dirX1 * 4, 1.5 - (time * 0.15), dirZ1 * 4);
				world.spawnParticle(Particle.REDSTONE, e1, 10, dustOptions);

				e2 = normal.clone().add(dirX2 * 4, 1.5 - (time * 0.15), dirZ2 * 4);
				world.spawnParticle(Particle.REDSTONE, e2, 10, dustOptions);

				e3 = normal.clone().add(dirX3 * 4, 1.5 - (time * 0.15), dirZ3 * 4);
				world.spawnParticle(Particle.REDSTONE, e3, 10, dustOptions);

				if (time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

	}
	
	// 마인권
	public void newEffect13() {
		
		World world = player.getWorld(); 
		
		Location normal = ent.getLocation();
		
		double arrowAngle1 = -70;
        double totalAngle1 = normal.getYaw() + arrowAngle1;
        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
        
        double arrowAngle2 = -40;
        double totalAngle2 = normal.getYaw() + arrowAngle2;
        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
        
        double arrowAngle3 = 10;
        double totalAngle3 = normal.getYaw() + arrowAngle3;
        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
        
        double arrowAngle4 = 70;
        double totalAngle4 = normal.getYaw() + arrowAngle4;
        double dirX4 = Math.cos(Math.toRadians(totalAngle4));
        double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
        
        double arrowAngle5 = 100;
        double totalAngle5 = normal.getYaw() + arrowAngle5;
        double dirX5 = Math.cos(Math.toRadians(totalAngle5));
        double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
        
        double arrowAngle6 = 140;
        double totalAngle6 = normal.getYaw() + arrowAngle6;
        double dirX6 = Math.cos(Math.toRadians(totalAngle6));
        double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
        
        double arrowAngle7 = 190;
        double totalAngle7 = normal.getYaw() + arrowAngle7;
        double dirX7 = Math.cos(Math.toRadians(totalAngle7));
        double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
        
        double arrowAngle8 = 250;
        double totalAngle8 = normal.getYaw() + arrowAngle8;
        double dirX8 = Math.cos(Math.toRadians(totalAngle8));
        double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
        
        double arrowAngle9 = 320;
        double totalAngle9 = normal.getYaw() + arrowAngle9;
        double dirX9 = Math.cos(Math.toRadians(totalAngle9));
        double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
		
		Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(120, 0, 120), 1);
		
		world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 2.0f, 0.5f);
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				Location e1, e2, e3, e4, e5, e6, e7, e8, e9;
				
				if(time == 1 || time == 11 || time == 21) {
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1 * (2-(0.2*i)), 1.5, dirZ1 * (2-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions);

						e2 = normal.clone().add(dirX2 * (2-(0.2*i)), 1.4, dirZ2 * (2-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions);

						e3 = normal.clone().add(dirX3 * (2-(0.2*i)), 0.5, dirZ3 * (2-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions);
						
						e4 = normal.clone().add(dirX4 * (2-(0.2*i)), 0.3, dirZ4 * (2-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e4, 2, dustOptions);
						
						e5 = normal.clone().add(dirX5 * (2-(0.2*i)), 1.1, dirZ5 * (2-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e5, 2, dustOptions);
						
						e6 = normal.clone().add(dirX6 * (2-(0.2*i)), 1.4, dirZ6 * (2-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e6, 2, dustOptions);
						
						e7 = normal.clone().add(dirX7 * (2-(0.2*i)), 1.3, dirZ7 * (2-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e7, 2, dustOptions);
						
						e8 = normal.clone().add(dirX8 * (2-(0.2*i)), 0.9, dirZ8 * (2-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e8, 2, dustOptions);
						
						e9 = normal.clone().add(dirX9 * (2-(0.2*i)), 1, dirZ9 * (2-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e9, 2, dustOptions);
					}
				}
				
				if(time >= 25) {
					world.playSound(normal, Sound.ENTITY_GENERIC_EXPLODE, 1f, 1.0f);
					world.spawnParticle(Particle.EXPLOSION_LARGE, normal, 0);
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

	}
	
	// 염옥악
	public void newEffect14() {
		
		World world = player.getWorld(); 
		
		Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(120, 0, 120), 1);
		
		world.playSound(player.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 1.0f, 1.0f);
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				double arrowAngle1 = -70;
		        double totalAngle1 = normal.getYaw() + arrowAngle1;
		        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		        
		        double arrowAngle21 = -55;
		        double totalAngle21 = normal.getYaw() + arrowAngle21;
		        double dirX21 = Math.cos(Math.toRadians(totalAngle21));
		        double dirZ21 = Math.sin(Math.toRadians(totalAngle21));
		        
		        double arrowAngle2 = -40;
		        double totalAngle2 = normal.getYaw() + arrowAngle2;
		        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
		        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
		        
		        double arrowAngle3 = 10;
		        double totalAngle3 = normal.getYaw() + arrowAngle3;
		        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
		        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
		        
		        double arrowAngle31 = 30;
		        double totalAngle31 = normal.getYaw() + arrowAngle31;
		        double dirX31 = Math.cos(Math.toRadians(totalAngle31));
		        double dirZ31 = Math.sin(Math.toRadians(totalAngle31));
		        
		        double arrowAngle4 = 70;
		        double totalAngle4 = normal.getYaw() + arrowAngle4;
		        double dirX4 = Math.cos(Math.toRadians(totalAngle4));
		        double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
		        
		        double arrowAngle5 = 100;
		        double totalAngle5 = normal.getYaw() + arrowAngle5;
		        double dirX5 = Math.cos(Math.toRadians(totalAngle5));
		        double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
		        
		        double arrowAngle6 = 140;
		        double totalAngle6 = normal.getYaw() + arrowAngle6;
		        double dirX6 = Math.cos(Math.toRadians(totalAngle6));
		        double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
		        
		        double arrowAngle7 = 190;
		        double totalAngle7 = normal.getYaw() + arrowAngle7;
		        double dirX7 = Math.cos(Math.toRadians(totalAngle7));
		        double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
		        
		        double arrowAngle8 = 250;
		        double totalAngle8 = normal.getYaw() + arrowAngle8;
		        double dirX8 = Math.cos(Math.toRadians(totalAngle8));
		        double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
		        
		        double arrowAngle9 = 320;
		        double totalAngle9 = normal.getYaw() + arrowAngle9;
		        double dirX9 = Math.cos(Math.toRadians(totalAngle9));
		        double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
		        
		        double arrowAngle10 = 350;
		        double totalAngle10 = normal.getYaw() + arrowAngle10;
		        double dirX10 = Math.cos(Math.toRadians(totalAngle10));
		        double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
				
				Location e1, e2, e21, e3, e31, e4, e5, e6, e7, e8, e9, e10;
				
				if(time % 8 == 0) {
					int i = time / 8;
					
					e1 = normal.clone().add(dirX1 * (3 - (0.6 * i)), 1.4, dirZ1 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions);

					e2 = normal.clone().add(dirX2 * (3 - (0.6 * i)), 0.2, dirZ2 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions);

					e21 = normal.clone().add(dirX21 * (3 - (0.6 * i)), 0.8, dirZ21 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e21, 2, dustOptions);

					e3 = normal.clone().add(dirX3 * (3 - (0.6 * i)), 0.3, dirZ3 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions);

					e31 = normal.clone().add(dirX31 * (3 - (0.6 * i)), 1, dirZ31 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e31, 2, dustOptions);

					e4 = normal.clone().add(dirX4 * (3 - (0.6 * i)), 0.5, dirZ4 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e4, 2, dustOptions);

					e5 = normal.clone().add(dirX5 * (3 - (0.6 * i)), 1.2, dirZ5 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e5, 2, dustOptions);

					e6 = normal.clone().add(dirX6 * (3 - (0.6 * i)), 0.2, dirZ6 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e6, 2, dustOptions);

					e7 = normal.clone().add(dirX7 * (3 - (0.6 * i)), 1, dirZ7 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e7, 2, dustOptions);

					e8 = normal.clone().add(dirX8 * (3 - (0.6 * i)), 0.6, dirZ8 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e8, 2, dustOptions);

					e9 = normal.clone().add(dirX9 * (3 - (0.6 * i)), 0.4, dirZ9 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e9, 2, dustOptions);

					e10 = normal.clone().add(dirX10 * (3 - (0.6 * i)), 0.8, dirZ10 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e10, 2, dustOptions);
				}
				
				if(time >= 60) {
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

	}
	
	// 뇌신장
	public void newEffect15() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(120, 0, 120), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
		
		world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1.0f, 1.0f);
        
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1, e2, e3;

			@Override
			public void run() {
				
				if(time % 4 == 0 && time < 20) {
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int j = 0 ; j < 10 ; j++) {
						e2 = normal.clone().add(dirX2*j*0.05, 3-(j*0.3), dirZ2*j*0.05);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					}
					
					for(int j = 0 ; j < 8 ; j++) {
						e2 = normal.clone().add(dirX2*j*0.15, 3-(j*0.2), dirZ2*j*0.15);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					}
					
//					for(int j = 0 ; j < 15 ; j++) {
//						e2 = normal.clone().add(dirX2*j*0.15, 3-(j*0.2), dirZ2*j*0.15);
//						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
//					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					double var = 0;

					for (int i = 0; i < 32; i++) {
						Location flag = normal.clone().add(dirX3 * 2, 15.5, dirZ3 * 2);
						e1 = flag.clone().add(Math.cos(var) * 1.5, 0, Math.sin(var) * 1.5);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1.4, 0, Math.sin(var) * 1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1.3, 0, Math.sin(var) * 1.3);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1.2, 0, Math.sin(var) * 1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1.1, 0, Math.sin(var) * 1.1);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1, 0, Math.sin(var) * 1);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.9, 0, Math.sin(var) * 0.9);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.8, 0, Math.sin(var) * 0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.7, 0, Math.sin(var) * 0.7);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.6, 0, Math.sin(var) * 0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.5, 0, Math.sin(var) * 0.5);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.4, 0, Math.sin(var) * 0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.3, 0, Math.sin(var) * 0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.2, 0, Math.sin(var) * 0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);

						var += Math.PI / 16;
					}

					for(int j = 0 ; j < 40 ; j++) {
						e3 = normal.clone().add(dirX3*(2-(j*0.05)), 15-(j*0.3), dirZ3*(2-(j*0.05)));
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int j = 0 ; j < 7 ; j++) {
						e3 = normal.clone().add(dirX3*(0.4+(j*0.1)), 4-(j*0.3), dirZ3*(0.4+(j*0.1)));
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int j = 0 ; j < 15 ; j++) {
						e3 = normal.clone().add(dirX3*(0.8+(j*0.15)), 7-(j*0.3), dirZ3*(0.8+(j*0.15)));
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
				}
				
				if(time % 5 == 0 && time > 20) {
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 0.5f);
					
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0, Math.sin(var)*5);
						player.getWorld().spawnParticle(Particle.EXPLOSION_LARGE, e1, 0);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}

	// 도박사의 판 1
	public void newEffect16() {
		
		Location normal = player.getEyeLocation();
		World world = player.getWorld(); 
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(100, 180, 250), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(70, 150, 220), 1);
		Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1, e2, e3;

			@Override
			public void run() {
				
				if(time % 4 == 0 && time < 20) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e2 = normal.clone().add(dirX1*0, 1, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX1*0, 2.2, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e2 = normal.clone().add(dirX2*0.4, 1, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*0.8, 1, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*1.2, 1, dirZ2*1.2);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*1.6, 1.2, dirZ2*1.6);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*1.8, 1.4, dirZ2*1.8);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*1.8, 1.5, dirZ2*1.8);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					e2 = normal.clone().add(dirX2*1.6, 1.6, dirZ2*1.6);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					e2 = normal.clone().add(dirX2*1.2, 1.7, dirZ2*1.2);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					e2 = normal.clone().add(dirX2*0.8, 1.84, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					e2 = normal.clone().add(dirX2*0.4, 2, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e3 = normal.clone().add(dirX3*0.4, 1, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					
					e3 = normal.clone().add(dirX3*0.4, 2.2, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					
					e3 = normal.clone().add(dirX3*0.4, 2.6, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);

					e3 = normal.clone().add(dirX3*0.8, 1, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					
					e3 = normal.clone().add(dirX3*0.8, 2.6, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					
					e3 = normal.clone().add(dirX3*0.8, 2.2, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*0.8, 2.4, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);

					e3 = normal.clone().add(dirX3*1.2, 1, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					
					e3 = normal.clone().add(dirX3*1.2, 1.9, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*1.2, 2.6, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*1.2, 2.6, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);

					e3 = normal.clone().add(dirX3*1.6, 1, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					
					e3 = normal.clone().add(dirX3*1.6, 1.5, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					
					e3 = normal.clone().add(dirX3*1.6, 1.6, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					
					e3 = normal.clone().add(dirX3*1.6, 1.8, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*1.6, 2.8, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*1.8, 2.9, dirZ3*1.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2, 1.9, dirZ3*2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.1, 3.1, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.25, 3.2, dirZ3*2.25);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.4, 2.9, dirZ3*2.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.3, 2.6, dirZ3*2.3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.2, 2.2, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.9, 3.6, dirZ3*2.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.8, 3.5, dirZ3*2.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.7, 3.3, dirZ3*2.7);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.6, 3.1, dirZ3*2.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*3.2, 3.2, dirZ3*3.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*3, 3, dirZ3*3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.8, 2.9, dirZ3*2.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.6, 2.8, dirZ3*2.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);

					e3 = normal.clone().add(dirX3*3, 3, dirZ3*3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.9, 2.7, dirZ3*2.9);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.7, 2.5, dirZ3*2.7);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.4, 2.4, dirZ3*2.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.2, 2.3, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
				}

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	
	// 보스 기믹1
	public void newEffect100() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(150, 20, 150), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(200, 80, 200), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e2 = normal.clone().add(Math.cos(var)*size, size*0.1, Math.sin(var)*size);
						player.getWorld().spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
					size++;
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0, Math.sin(var)*5);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	
	
	
	
	
	
	
	// 본 체스트
	public void startE1() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (player.getNoDamageTicks() == 0) {
					pd.endTask();
					pd.removeID();
				}

				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 30);
				player.getWorld().spawnParticle(Particle.DRIP_LAVA, second, 30);
			}

		}, 0, 1);
	}

	// 뼈감옥
	public void startE2() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 30) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var), Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var), Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.PORTAL, first, 10);
				player.getWorld().spawnParticle(Particle.PORTAL, second, 10);
			}

		}, 0, 1);
	}

	// 디바인 링크
	public void startE3() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(0, Math.sin(var) + 1, 0);
				second = loc.clone().add(0, Math.sin(var) + 1, 0);

				player.getWorld().spawnParticle(Particle.SNEEZE, first, 0);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 0);
			}

		}, 0, 1);
	}

	// 증원
	public void startE4() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(0, Math.sin(var) + 1, 0);
				second = loc.clone().add(0, Math.sin(var) + 1, 0);

				player.getWorld().spawnParticle(Particle.SNEEZE, first, 0);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 0);
			}

		}, 0, 1);
	}

	// 성스러운 힘
	public void startE5() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.CRIT, first, 10);
					player.getWorld().spawnParticle(Particle.CRIT, second, 10);
				}
			}

		}, 0, 1);
	}

	// 버티기
	public void startE6() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SNEEZE, first, 10);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 10);

			}

		}, 0, 1);
	}

	// 도박사의 판
	public void startE7() {
		ArrayList<Particle> list = new ArrayList<>();

		list.add(Particle.VILLAGER_ANGRY);
		list.add(Particle.VILLAGER_HAPPY);

		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 2, Math.sin(var));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);

			}

		}, 0, 1);
	}

	// 무조건 이기는 판
	public void startE8() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 2, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 2, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 10);

			}

		}, 0, 1);
	}

	// 카사르의 복수
	public void startE9() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), var / 2, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), var / 2, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.WATER_SPLASH, first, 10);
				player.getWorld().spawnParticle(Particle.WATER_SPLASH, second, 10);

			}

		}, 0, 1);
	}

	// 신의 권능
	public void startE10() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2, first3, second3, first4, second4;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 40) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				while (true) {
					if (loc.getBlock().getType() != Material.AIR || loc.getY() <= 1) {
						loc.add(0, 1, 0);
						break;
					}
					loc = loc.add(0, -1, 0);
				}

				for (int i = 1; i < 10; i++) {
					first = loc.clone().add(Math.cos(var) + i, 0, Math.sin(var) + i);
					second = loc.clone().add(Math.cos(var + Math.PI) + i, 0, Math.sin(var + Math.PI) + i);
					first2 = loc.clone().add(Math.cos(var) - i, 0, Math.sin(var) + i);
					second2 = loc.clone().add(Math.cos(var - Math.PI) + i, 0, Math.sin(var + Math.PI) + i);
					first3 = loc.clone().add(Math.cos(var) - i, 0, Math.sin(var) - i);
					second3 = loc.clone().add(Math.cos(var + Math.PI) - i, 0, Math.sin(var + Math.PI) - i);
					first4 = loc.clone().add(Math.cos(var) + i, 0, Math.sin(var) - i);
					second4 = loc.clone().add(Math.cos(var + Math.PI) + i, 0, Math.sin(var + Math.PI) - i);

					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first2, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second2, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first3, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second3, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first4, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second4, 10);
				}
			}

		}, 0, 1);
	}

	// 기사단 창립
	public void startE11() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var) * 2, 0, Math.sin(var) * 2);
				second = loc.clone().add(Math.cos(var + Math.PI) * 2, 0, Math.sin(var + Math.PI) * 2);

				player.getWorld().spawnParticle(Particle.CLOUD, first, 10);
				player.getWorld().spawnParticle(Particle.CLOUD, second, 10);

			}
		}, 0, 1);
	}

	// 사기 진작
	public void startE12() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.SPELL_WITCH, first, 10);
					player.getWorld().spawnParticle(Particle.SPELL_WITCH, second, 10);
				}
			}
		}, 0, 1);
	}

	// 신의 주사위
	public void startE13() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 10);

			}
		}, 0, 1);
	}

	// 발도
	public void startE14() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, first, 10);
				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, second, 10);
				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, first2, 10);
				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, second2, 10);

			}
		}, 0, 1);
	}

	// 나이트메어
	public void startE15() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SMOKE_LARGE, first, 10);
				player.getWorld().spawnParticle(Particle.SMOKE_LARGE, second, 10);
				player.getWorld().spawnParticle(Particle.FALLING_LAVA, first, 10);
				player.getWorld().spawnParticle(Particle.FALLING_LAVA, second, 10);

			}
		}, 0, 1);
	}

	// 포션의 부작용
	public void startE16() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, first, 10);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, second, 10);

			}
		}, 0, 1);
	}

	// 포션 중독
	public void startE17() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.LAVA, first, 10);
				player.getWorld().spawnParticle(Particle.LAVA, second, 10);

			}
		}, 0, 1);
	}

	// 마편
	public void startE18() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.NOTE, first, 10);
					player.getWorld().spawnParticle(Particle.NOTE, second, 10);
				}

			}
		}, 0, 1);
	}

	// 선임의 명령
	public void startE19() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, second, 10);

			}
		}, 0, 1);
	}

	// 죽음의 숫자
	public void startE20() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, i, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, i, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.SQUID_INK, first, 10);
					player.getWorld().spawnParticle(Particle.SQUID_INK, second, 10);
				}

			}
		}, 0, 1);
	}

	// 지옥불
	public void startE21() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 10; i++) {
					first = loc.clone().add(i, i, i);
					second = loc.clone().add(-i, i, i);
					first2 = loc.clone().add(-i, i, -i);
					second2 = loc.clone().add(i, i, -i);

					player.getWorld().spawnParticle(Particle.LAVA, first, 0);
					player.getWorld().spawnParticle(Particle.LAVA, second, 0);
					player.getWorld().spawnParticle(Particle.LAVA, first2, 0);
					player.getWorld().spawnParticle(Particle.LAVA, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 에로우 실드
	public void startE22() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 300) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.TOTEM, first, 0);
				player.getWorld().spawnParticle(Particle.TOTEM, second, 0);

			}
		}, 0, 1);
	}

	// 루인 오브 노바
	public void startE23() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;
				loc = player.getLocation();

				while (true) {
					if (loc.getBlock().getType() != Material.AIR || loc.getY() <= 1) {
						loc.add(0, 1, 0);
						break;
					}
					loc = loc.add(0, -1, 0);
				}

				for (int i = 1; i < 8; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);
					first2 = loc.clone().add(Math.cos(var + Math.PI / 2) * i, 0, Math.sin(var + Math.PI / 2) * i);
					second2 = loc.clone().add(Math.cos(var + Math.PI * 3 / 2) * i, 0,
							Math.sin(var + Math.PI * 3 / 2) * i);

					player.getWorld().spawnParticle(Particle.SQUID_INK, first, 0);
					player.getWorld().spawnParticle(Particle.SQUID_INK, second, 0);
					player.getWorld().spawnParticle(Particle.SQUID_INK, first2, 0);
					player.getWorld().spawnParticle(Particle.SQUID_INK, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 니 위로 내 밑으로
	public void startE24() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 4; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);
					first2 = loc.clone().add(Math.cos(var + Math.PI / 2) * i, 0, Math.sin(var + Math.PI / 2) * i);
					second2 = loc.clone().add(Math.cos(var + Math.PI * 3 / 2) * i, 0,
							Math.sin(var + Math.PI * 3 / 2) * i);

					player.getWorld().spawnParticle(Particle.END_ROD, first, 0);
					player.getWorld().spawnParticle(Particle.END_ROD, second, 0);
					player.getWorld().spawnParticle(Particle.END_ROD, first2, 0);
					player.getWorld().spawnParticle(Particle.END_ROD, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 라떼는 말이야
	public void startE25() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			int time;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 30) {
					pd.endTask();
					pd.removeID();
				}

				time++;

				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.NOTE, first, 30);
				player.getWorld().spawnParticle(Particle.NOTE, second, 30);
			}

		}, 0, 1);
	}

	// 헬파이어
	public void startE26() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;
				loc = player.getLocation();

				for (int i = 1; i < 8; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);
					first2 = loc.clone().add(Math.cos(var + Math.PI / 2) * i, 0, Math.sin(var + Math.PI / 2) * i);
					second2 = loc.clone().add(Math.cos(var + Math.PI * 3 / 2) * i, 0,
							Math.sin(var + Math.PI * 3 / 2) * i);

					player.getWorld().spawnParticle(Particle.FLAME, first, 0);
					player.getWorld().spawnParticle(Particle.FLAME, second, 0);
					player.getWorld().spawnParticle(Particle.FLAME, first2, 0);
					player.getWorld().spawnParticle(Particle.FLAME, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 본 체스트
	public void startE27() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (player.getNoDamageTicks() == 0) {
					pd.endTask();
					pd.removeID();
				}

				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.END_ROD, first, 0);
				player.getWorld().spawnParticle(Particle.END_ROD, second, 0);
			}

		}, 0, 1);
	}

	// 그림 리퍼 폼1
	public void startE0_1() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				var += Math.PI / 8;
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 0.3, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 0.3, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 0);
				player.getWorld().spawnParticle(Particle.DRIP_LAVA, second, 0);

			}
		}, 0, 1);
	}

	// 그림 리퍼 폼2
	public void startE0_2() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				var += Math.PI / 8;
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 0.3, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 0.3, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SOUL, first, 0);
				player.getWorld().spawnParticle(Particle.SOUL, second, 0);

			}
		}, 0, 1);
	}

	// 데빌 레이저
	public void startE0_3() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			Location loc, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
			Vector dir;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}
				
				if(time >= 40) {
					pd.endTask();
					pd.removeID();
				}

				loc = player.getEyeLocation();
				dir = loc.getDirection();
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
				e11 = loc.clone().add(dir.getX() * 11, dir.getY() * 11, dir.getZ() * 11);
				e12 = loc.clone().add(dir.getX() * 12, dir.getY() * 12, dir.getZ() * 12);
				e13 = loc.clone().add(dir.getX() * 13, dir.getY() * 13, dir.getZ() * 13);
				e14 = loc.clone().add(dir.getX() * 14, dir.getY() * 14, dir.getZ() * 14);
				e15 = loc.clone().add(dir.getX() * 15, dir.getY() * 15, dir.getZ() * 15);
				e16 = loc.clone().add(dir.getX() * 16, dir.getY() * 16, dir.getZ() * 16);
				e17 = loc.clone().add(dir.getX() * 17, dir.getY() * 17, dir.getZ() * 17);
				e18 = loc.clone().add(dir.getX() * 18, dir.getY() * 18, dir.getZ() * 18);
				e19 = loc.clone().add(dir.getX() * 19, dir.getY() * 19, dir.getZ() * 19);
				e20 = loc.clone().add(dir.getX() * 20, dir.getY() * 20, dir.getZ() * 20);

				player.getWorld().spawnParticle(Particle.CRIT, e1, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e2, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e3, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e4, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e5, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e6, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e7, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e8, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e9, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e10, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e11, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e12, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e13, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e14, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e15, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e16, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e17, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e18, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e19, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e20, 0);
				
				time++;

			}
		}, 0, 1);
	}
	
	// 마인 레이저
	public void startE0_4() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			Location loc, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
			Vector dir;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 40) {
					pd.endTask();
					pd.removeID();
				}

				loc = player.getEyeLocation();
				dir = loc.getDirection();
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
				e11 = loc.clone().add(dir.getX() * 11, dir.getY() * 11, dir.getZ() * 11);
				e12 = loc.clone().add(dir.getX() * 12, dir.getY() * 12, dir.getZ() * 12);
				e13 = loc.clone().add(dir.getX() * 13, dir.getY() * 13, dir.getZ() * 13);
				e14 = loc.clone().add(dir.getX() * 14, dir.getY() * 14, dir.getZ() * 14);
				e15 = loc.clone().add(dir.getX() * 15, dir.getY() * 15, dir.getZ() * 15);
				e16 = loc.clone().add(dir.getX() * 16, dir.getY() * 16, dir.getZ() * 16);
				e17 = loc.clone().add(dir.getX() * 17, dir.getY() * 17, dir.getZ() * 17);
				e18 = loc.clone().add(dir.getX() * 18, dir.getY() * 18, dir.getZ() * 18);
				e19 = loc.clone().add(dir.getX() * 19, dir.getY() * 19, dir.getZ() * 19);
				e20 = loc.clone().add(dir.getX() * 20, dir.getY() * 20, dir.getZ() * 20);

				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e1, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e2, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e3, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e4, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e5, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e6, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e7, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e8, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e9, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e10, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e11, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e12, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e13, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e14, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e15, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e16, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e17, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e18, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e19, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e20, 0);

				time++;

			}
		}, 0, 1);
	}

	// 아이 오브 오더
	public void startE0_5() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.CRIT, first, 10);
					player.getWorld().spawnParticle(Particle.CRIT, second, 10);
				}
			}
		}, 0, 1);
	}
	
	// 터렛 레이저
	public void startE0_6() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			Location loc, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
			Vector dir;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 200) {
					pd.endTask();
					pd.removeID();
				}

				loc = ent.getLocation().add(0,1.4,0);
				dir = loc.getDirection();
				e1 = loc.clone().add(dir.getX(), dir.getY(), dir.getZ());
				e2 = loc.clone().add(dir.getX() * 2, dir.getY(), dir.getZ() * 2);
				e3 = loc.clone().add(dir.getX() * 3, dir.getY(), dir.getZ() * 3);
				e4 = loc.clone().add(dir.getX() * 4, dir.getY(), dir.getZ() * 4);
				e5 = loc.clone().add(dir.getX() * 5, dir.getY(), dir.getZ() * 5);
				e6 = loc.clone().add(dir.getX() * 6, dir.getY(), dir.getZ() * 6);
				e7 = loc.clone().add(dir.getX() * 7, dir.getY(), dir.getZ() * 7);
				e8 = loc.clone().add(dir.getX() * 8, dir.getY(), dir.getZ() * 8);
				e9 = loc.clone().add(dir.getX() * 9, dir.getY(), dir.getZ() * 9);
				e10 = loc.clone().add(dir.getX() * 10, dir.getY(), dir.getZ() * 10);
				e11 = loc.clone().add(dir.getX() * 11, dir.getY(), dir.getZ() * 11);
				e12 = loc.clone().add(dir.getX() * 12, dir.getY(), dir.getZ() * 12);
				e13 = loc.clone().add(dir.getX() * 13, dir.getY(), dir.getZ() * 13);
				e14 = loc.clone().add(dir.getX() * 14, dir.getY(), dir.getZ() * 14);
				e15 = loc.clone().add(dir.getX() * 15, dir.getY(), dir.getZ() * 15);
				e16 = loc.clone().add(dir.getX() * 16, dir.getY(), dir.getZ() * 16);
				e17 = loc.clone().add(dir.getX() * 17, dir.getY(), dir.getZ() * 17);
				e18 = loc.clone().add(dir.getX() * 18, dir.getY(), dir.getZ() * 18);
				e19 = loc.clone().add(dir.getX() * 19, dir.getY(), dir.getZ() * 19);
				e20 = loc.clone().add(dir.getX() * 20, dir.getY(), dir.getZ() * 20);

				player.getWorld().spawnParticle(Particle.CRIT, e1, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e2, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e3, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e4, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e5, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e6, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e7, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e8, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e9, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e10, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e11, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e12, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e13, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e14, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e15, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e16, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e17, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e18, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e19, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e20, 0);

				time++;

			}
		}, 0, 1);
	}
	

///스태프 기술///
	
	public void startES1() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.CLOUD, first, 10);
					player.getWorld().spawnParticle(Particle.CLOUD, second, 10);
				}
			}
		}, 0, 1);
	}
	
	
////몬스터 기술////	
	
	
	// 시련의 형상
	public void startE28() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first, 0);
					player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second, 0);
				}
			}

		}, 0, 1);
	}

	// 요정왕
	public void startE29() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 30) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var), Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var), Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SLIME, first, 10);
				player.getWorld().spawnParticle(Particle.SLIME, second, 10);
			}

		}, 0, 1);
	}

	// 발로르
	public void startE30() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.FLAME, first, 10);
				player.getWorld().spawnParticle(Particle.FLAME, second, 10);
				player.getWorld().spawnParticle(Particle.FLAME, first2, 10);
				player.getWorld().spawnParticle(Particle.FLAME, second2, 10);

			}
		}, 0, 1);
	}
	
	// 아덴
	public void startE31() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.END_ROD, first, 10);
				player.getWorld().spawnParticle(Particle.END_ROD, second, 10);

			}
		}, 0, 1);
	}
	
	// 죽음의 탑 공통
	public void startE32() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var), 2, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 2, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 10);

			}
			
		}, 0, 1);
	}
	
	// 죽음의 탑 심판
	public void startE33() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.CRIT, first, 10);
				player.getWorld().spawnParticle(Particle.CRIT, second, 10);
				player.getWorld().spawnParticle(Particle.CRIT, first2, 10);
				player.getWorld().spawnParticle(Particle.CRIT, second2, 10);

			}

		}, 0, 1);
	}

	// 코낭그
	public void startE34() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first, 10);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second, 10);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first2, 10);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second2, 10);

			}
		}, 0, 1);
	}
	
	// 프라에그나리
	public void startE35() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.NOTE, first, 10);
				player.getWorld().spawnParticle(Particle.NOTE, second, 10);
				player.getWorld().spawnParticle(Particle.NOTE, first2, 10);
				player.getWorld().spawnParticle(Particle.NOTE, second2, 10);

			}
		}, 0, 1);
	}

	// 아빠 상어
	public void startE36() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.BUBBLE_POP, first, 10);
				player.getWorld().spawnParticle(Particle.BUBBLE_POP, second, 10);
				player.getWorld().spawnParticle(Particle.BUBBLE_POP, first2, 10);
				player.getWorld().spawnParticle(Particle.BUBBLE_POP, second2, 10);

			}
		}, 0, 1);
	}
}
