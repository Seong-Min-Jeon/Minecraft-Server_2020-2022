package testPack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
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
							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1.0f, 8.0f);
							player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1, true, false, false));
							player.sendMessage(ChatColor.GREEN + "신속이 부여됩니다.");
							removeMana(player, 1);
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "고목나무 지팡이")) {
					if(player.getLevel() >= 300) {
						if(checkMana(player, 2)) {
							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1.0f, 8.0f);
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
							if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
									|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {		
								player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1.0f, 8.0f);
								player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1, true, false, false));
								Vector vec = player.getEyeLocation().getDirection().multiply(2.5f);
								player.setVelocity(vec);
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 1.8f);
								player.sendMessage(ChatColor.GREEN + "신속이 부여됩니다.");
								removeMana(player, 3);
							}
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
				} else if(im.getDisplayName().equals(ChatColor.AQUA + "길잡이 지팡이")) {
					if(player.getLevel() >= 500) {
						if(checkMana(player, 3)) {
							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1.0f, 8.0f);
							if(player.getHealth() >= 16) {
								player.setHealth(20);
							} else {
								player.setHealth(player.getHealth() + 4);
							}
							player.sendMessage(ChatColor.GREEN + "체력이 회복되었습니다.");
							removeMana(player, 3);
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "슬라임볼 스태프")) {
					if(player.getLevel() >= 560) {
						if(checkMana(player, 4)) {
							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1.0f, 8.0f);
							player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 2, true, false, false));
							removeMana(player, 4);
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "얼음꽃")) {
					if(player.getLevel() >= 700) {
						if(checkMana(player, 10)) {
							bool = reload(player, 2000);
							if(bool) {
								removeMana(player, 10);
							}
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "세컨드 윙")) {
					if(player.getLevel() >= 450) {
						if(checkMana(player, 4)) {
							if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
									|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {		
								player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1.0f, 8.0f);
								Vector vec = player.getEyeLocation().getDirection().multiply(1.5f);
								player.setVelocity(vec);
								removeMana(player, 4);
							}
						}
					} 
				} else if(im.getDisplayName().equals(ChatColor.AQUA + "문 스태프")) {
					if(player.getLevel() >= 560) {
						if(player.getHealth() - 10 < 0) {
							player.setHealth(0);
						} else {
							player.setHealth(player.getHealth() - 10);
						}
						
						for(int tmp = 0 ; tmp < 5 ; tmp++) {
							ItemStack mana = new ItemStack(Material.HEART_OF_THE_SEA);
							ItemMeta manaIm = mana.getItemMeta();
							manaIm.setDisplayName(ChatColor.BLUE + "마나");
							mana.setItemMeta(manaIm);
							if (player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
								int i = 0;
								for (ItemStack is : player.getInventory().getContents()) {
									if (is == null)
										continue;
									if (is.getType() == Material.HEART_OF_THE_SEA) {
										i = i + is.getAmount();
									}
								}
								if (i < 20)
									player.getInventory().addItem(mana);
							} else {
								player.getInventory().setItem(8, mana);
							}
						}
						
						player.sendMessage(ChatColor.GREEN + "체력을 소모해 마나가 회복되었습니다.");
					} 
				} else if(im.getDisplayName().equals(ChatColor.AQUA + "옵시디언의 눈물")) {
					if(player.getLevel() >= 700) {
						if(checkMana(player, 4)) {
							bool = reload(player, 1000);
							if(bool) {
								removeMana(player, 4);
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
					world.playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1.0f, 8.0f);
					
					if(im.getDisplayName().equals(ChatColor.AQUA + "죽음의 서약")) {
						staffE1(arrow);
					} else if(im.getDisplayName().equals(ChatColor.YELLOW + "암석 스태프")) {
						staffE2(arrow);
					} else if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "대지의 스태프")) {
						staffE3(arrow);
					} else if(im.getDisplayName().equals(ChatColor.DARK_RED + "트리니티 스태프")) {
						staffE4(arrow);
					} else if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "얼음꽃")) {
						staffE5(arrow);
					} else if(im.getDisplayName().equals(ChatColor.AQUA + "옵시디언의 눈물")) {
						staffE6(arrow);
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
			
			//===========================================================================
			// 빠른 발사
			int speedStat = 0;
			ArrayList<Integer> ary = new ArrayList<>(); 
			ary.add(new SpecialEffect().a10130(player));
			ary.add(new SpecialEffect().a24(player));
			Collections.sort(ary);
			Collections.reverse(ary);
			speedStat = ary.get(0);
			
			int speed1 = 0;
			int speed2 = 0;
			int speed3 = 0;
			int speed4 = 0;
			int speed5 = 0;
			if(speedStat == 1) {
				speed1 += 120;
				speed2 += 60;
				speed3 += 40;
				speed4 += 10;
				speed5 += 250;
			} else if(speedStat == 2) {
				speed1 += 180;
				speed2 += 100;
				speed3 += 70;
				speed4 += 25;
				speed5 += 400;
			} else if(speedStat == 3) {
				speed1 += 300;
				speed2 += 150;
				speed3 += 100;
				speed4 += 40;
				speed5 += 550;
			} else if(speedStat == 4) {
				speed1 += 400;
				speed2 += 200;
				speed3 += 125;
				speed4 += 55;
				speed5 += 700;
			} else if(speedStat == 5) {
				speed1 += 600;
				speed2 += 300;
				speed3 += 150;
				speed4 += 70;
				speed5 += 1000;
			}
			//===========================================================================
			
			boolean bool = false;
			if(mat == Material.DEAD_BRAIN_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 1000-speed1);
				}
			}
			if(mat == Material.DEAD_BUBBLE_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 500-speed2);
				}
			}
			if(mat == Material.DEAD_FIRE_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 200-speed3);
				}
			}
			if(mat == Material.DEAD_HORN_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 80-speed4);
				}
			}
			if(mat == Material.DEAD_TUBE_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 2000-speed5);
				}
			}
			if(bool) {
				Location loc = player.getLocation();
				world = player.getWorld();
				
				//===========================================================================
				// 확산 화살
				int numStat = 0;
				ArrayList<Integer> ary2 = new ArrayList<>(); 
				ary2.add(new SpecialEffect().a10140(player));
				ary2.add(new SpecialEffect().a23(player));
				Collections.sort(ary2);
				Collections.reverse(ary2);
				numStat = ary2.get(0);
				
				if(numStat == 0) {
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setVelocity(player.getEyeLocation().getDirection().multiply(3.0f));
					player.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, loc.add(0,1,0), 0);			
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
					
					SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(player.getEyeLocation(), EntityType.SPECTRAL_ARROW);
					sarrow.setVelocity(arrow.getVelocity());
				} else if(numStat == 1) {
					
					Location normal = player.getEyeLocation();
					
					double arrowAngle1 = 75;
			        double totalAngle1 = normal.getYaw() + arrowAngle1;
			        double arrowDirX1 = Math.cos(Math.toRadians(totalAngle1));
			        double arrowDirZ1 = Math.sin(Math.toRadians(totalAngle1));
			        Vector arrowDir1 = new Vector(arrowDirX1, normal.getDirection().getY(), arrowDirZ1).multiply(3.0f);
					Arrow arrow1 = player.launchProjectile(Arrow.class, arrowDir1);
					arrow1.setShooter(player);
					SpectralArrow sarrow1 = (SpectralArrow) arrow1.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow1.setVelocity(arrowDir1);
					
					Arrow arrow2 = player.launchProjectile(Arrow.class);
					arrow2.setShooter(player);
					arrow2.setVelocity(normal.getDirection().multiply(3.0f));
					SpectralArrow sarrow2 = (SpectralArrow) arrow2.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow2.setVelocity(arrow2.getVelocity());
					
					double arrowAngle3 = 105;
			        double totalAngle3 = normal.getYaw() + arrowAngle3;
			        double arrowDirX3 = Math.cos(Math.toRadians(totalAngle3));
			        double arrowDirZ3 = Math.sin(Math.toRadians(totalAngle3));
			        Vector arrowDir3 = new Vector(arrowDirX3, normal.getDirection().getY(), arrowDirZ3).multiply(3.0f);
					Arrow arrow3 = player.launchProjectile(Arrow.class, arrowDir3);
					arrow3.setShooter(player);
					SpectralArrow sarrow3 = (SpectralArrow) arrow3.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow3.setVelocity(arrowDir3);
					
					player.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, loc.add(0,1,0), 0);			
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
				} else if(numStat == 2) {
					
					Location normal = player.getEyeLocation();
					
					double arrowAngle1 = 75;
			        double totalAngle1 = normal.getYaw() + arrowAngle1;
			        double arrowDirX1 = Math.cos(Math.toRadians(totalAngle1));
			        double arrowDirZ1 = Math.sin(Math.toRadians(totalAngle1));
			        Vector arrowDir1 = new Vector(arrowDirX1, normal.getDirection().getY(), arrowDirZ1).multiply(3.0f);
					Arrow arrow1 = player.launchProjectile(Arrow.class, arrowDir1);
					arrow1.setShooter(player);
					SpectralArrow sarrow1 = (SpectralArrow) arrow1.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow1.setVelocity(arrowDir1);
					
					Arrow arrow2 = player.launchProjectile(Arrow.class);
					arrow2.setShooter(player);
					arrow2.setVelocity(normal.getDirection().multiply(3.0f));
					SpectralArrow sarrow2 = (SpectralArrow) arrow2.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow2.setVelocity(arrow2.getVelocity());
					
					double arrowAngle3 = 105;
			        double totalAngle3 = normal.getYaw() + arrowAngle3;
			        double arrowDirX3 = Math.cos(Math.toRadians(totalAngle3));
			        double arrowDirZ3 = Math.sin(Math.toRadians(totalAngle3));
			        Vector arrowDir3 = new Vector(arrowDirX3, normal.getDirection().getY(), arrowDirZ3).multiply(3.0f);
					Arrow arrow3 = player.launchProjectile(Arrow.class, arrowDir3);
					arrow3.setShooter(player);
					SpectralArrow sarrow3 = (SpectralArrow) arrow3.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow3.setVelocity(arrowDir3);
					
					double arrowAngle4 = 82.5;
			        double totalAngle4 = normal.getYaw() + arrowAngle4;
			        double arrowDirX4 = Math.cos(Math.toRadians(totalAngle4));
			        double arrowDirZ4 = Math.sin(Math.toRadians(totalAngle4));
			        Vector arrowDir4 = new Vector(arrowDirX4, normal.getDirection().getY(), arrowDirZ4).multiply(3.0f);
					Arrow arrow4 = player.launchProjectile(Arrow.class, arrowDir4);
					arrow4.setShooter(player);
					SpectralArrow sarrow4 = (SpectralArrow) arrow4.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow4.setVelocity(arrowDir4);
					
					double arrowAngle5 = 97.5;
			        double totalAngle5 = normal.getYaw() + arrowAngle5;
			        double arrowDirX5 = Math.cos(Math.toRadians(totalAngle5));
			        double arrowDirZ5 = Math.sin(Math.toRadians(totalAngle5));
			        Vector arrowDir5 = new Vector(arrowDirX5, normal.getDirection().getY(), arrowDirZ5).multiply(3.0f);
					Arrow arrow5 = player.launchProjectile(Arrow.class, arrowDir5);
					arrow5.setShooter(player);
					SpectralArrow sarrow5 = (SpectralArrow) arrow5.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow5.setVelocity(arrowDir5);
					
					player.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, loc.add(0,1,0), 0);			
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
				} else if(numStat == 3) {
					
					Location normal = player.getEyeLocation();
					
					double arrowAngle1 = 72;
			        double totalAngle1 = normal.getYaw() + arrowAngle1;
			        double arrowDirX1 = Math.cos(Math.toRadians(totalAngle1));
			        double arrowDirZ1 = Math.sin(Math.toRadians(totalAngle1));
			        Vector arrowDir1 = new Vector(arrowDirX1, normal.getDirection().getY(), arrowDirZ1).multiply(3.0f);
					Arrow arrow1 = player.launchProjectile(Arrow.class, arrowDir1);
					arrow1.setShooter(player);
					SpectralArrow sarrow1 = (SpectralArrow) arrow1.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow1.setVelocity(arrowDir1);
					
					Arrow arrow2 = player.launchProjectile(Arrow.class);
					arrow2.setShooter(player);
					arrow2.setVelocity(normal.getDirection().multiply(3.0f));
					SpectralArrow sarrow2 = (SpectralArrow) arrow2.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow2.setVelocity(arrow2.getVelocity());
					
					double arrowAngle3 = 108;
			        double totalAngle3 = normal.getYaw() + arrowAngle3;
			        double arrowDirX3 = Math.cos(Math.toRadians(totalAngle3));
			        double arrowDirZ3 = Math.sin(Math.toRadians(totalAngle3));
			        Vector arrowDir3 = new Vector(arrowDirX3, normal.getDirection().getY(), arrowDirZ3).multiply(3.0f);
					Arrow arrow3 = player.launchProjectile(Arrow.class, arrowDir3);
					arrow3.setShooter(player);
					SpectralArrow sarrow3 = (SpectralArrow) arrow3.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow3.setVelocity(arrowDir3);
					
					double arrowAngle4 = 78;
			        double totalAngle4 = normal.getYaw() + arrowAngle4;
			        double arrowDirX4 = Math.cos(Math.toRadians(totalAngle4));
			        double arrowDirZ4 = Math.sin(Math.toRadians(totalAngle4));
			        Vector arrowDir4 = new Vector(arrowDirX4, normal.getDirection().getY(), arrowDirZ4).multiply(3.0f);
					Arrow arrow4 = player.launchProjectile(Arrow.class, arrowDir4);
					arrow4.setShooter(player);
					SpectralArrow sarrow4 = (SpectralArrow) arrow4.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow4.setVelocity(arrowDir4);
					
					double arrowAngle5 = 102;
			        double totalAngle5 = normal.getYaw() + arrowAngle5;
			        double arrowDirX5 = Math.cos(Math.toRadians(totalAngle5));
			        double arrowDirZ5 = Math.sin(Math.toRadians(totalAngle5));
			        Vector arrowDir5 = new Vector(arrowDirX5, normal.getDirection().getY(), arrowDirZ5).multiply(3.0f);
					Arrow arrow5 = player.launchProjectile(Arrow.class, arrowDir5);
					arrow5.setShooter(player);
					SpectralArrow sarrow5 = (SpectralArrow) arrow5.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow5.setVelocity(arrowDir5);
					
					player.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, loc.add(0,1,0), 0);			
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
					
					double arrowAngle6 = 84;
			        double totalAngle6 = normal.getYaw() + arrowAngle6;
			        double arrowDirX6 = Math.cos(Math.toRadians(totalAngle6));
			        double arrowDirZ6 = Math.sin(Math.toRadians(totalAngle6));
			        Vector arrowDir6 = new Vector(arrowDirX6, normal.getDirection().getY(), arrowDirZ6).multiply(3.0f);
					Arrow arrow6 = player.launchProjectile(Arrow.class, arrowDir6);
					arrow6.setShooter(player);
					SpectralArrow sarrow6 = (SpectralArrow) arrow6.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow6.setVelocity(arrowDir6);
					
					double arrowAngle7 = 96;
			        double totalAngle7 = normal.getYaw() + arrowAngle7;
			        double arrowDirX7 = Math.cos(Math.toRadians(totalAngle7));
			        double arrowDirZ7 = Math.sin(Math.toRadians(totalAngle7));
			        Vector arrowDir7 = new Vector(arrowDirX7, normal.getDirection().getY(), arrowDirZ7).multiply(3.0f);
					Arrow arrow7 = player.launchProjectile(Arrow.class, arrowDir7);
					arrow7.setShooter(player);
					SpectralArrow sarrow7 = (SpectralArrow) arrow7.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
					sarrow7.setVelocity(arrowDir7);
					
					player.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, loc.add(0,1,0), 0);			
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
				} else {
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setVelocity(player.getEyeLocation().getDirection().multiply(3.0f));
					player.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, loc.add(0,1,0), 0);			
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
					
					SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(player.getEyeLocation(), EntityType.SPECTRAL_ARROW);
					sarrow.setVelocity(arrow.getVelocity());
				}
				//===========================================================================
			}			
		}
	}
	
	public void useGun(Player playerArg) {
		player = playerArg;
		Material mat = player.getInventory().getItemInMainHand().getType();
		if(mat == Material.BRAIN_CORAL_BLOCK || mat == Material.HORN_CORAL_BLOCK || mat == Material.TUBE_CORAL_BLOCK 
				|| mat == Material.BUBBLE_CORAL_BLOCK || mat == Material.FIRE_CORAL_BLOCK) {
			
			//===========================================================================
			// 빠른 발사
			int speedStat = 0;
			ArrayList<Integer> ary = new ArrayList<>(); 
			ary.add(new SpecialEffect().a10180(player));
			Collections.sort(ary);
			Collections.reverse(ary);
			speedStat = ary.get(0);
			
			int speed1 = 0;
			int speed2 = 0;
			int speed3 = 0;
			int speed4 = 0;
			int speed5 = 0;
			if(speedStat == 1) {
				speed1 += 10;
				speed2 += 250;
				speed3 += 10;
				speed4 += 150;
				speed5 += 100;
			} else if(speedStat == 2) {
				speed1 += 25;
				speed2 += 400;
				speed3 += 15;
				speed4 += 250;
				speed5 += 150;
			} else if(speedStat == 3) {
				speed1 += 40;
				speed2 += 550;
				speed3 += 20;
				speed4 += 350;
				speed5 += 200;
			} else if(speedStat == 4) {
				speed1 += 55;
				speed2 += 700;
				speed3 += 20;
				speed4 += 450;
				speed5 += 250;
			} else if(speedStat == 5) {
				speed1 += 70;
				speed2 += 1000;
				speed3 += 20;
				speed4 += 550;
				speed5 += 300;
			}
			//===========================================================================
			
			boolean bool = false;
			if(mat == Material.BRAIN_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 80-speed1);
				}
			}
			if(mat == Material.BUBBLE_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 2500-speed2);
				}
			}
			if(mat == Material.FIRE_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 30-speed3);
				}
			}
			if(mat == Material.HORN_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 1000-speed4);
				}
			}
			if(mat == Material.TUBE_CORAL_BLOCK) {
				if((new Colosseum()).colosseum(player)) {
					bool = reload(player, 3000);
				} else {
					bool = reload(player, 700-speed5);
				}
			}
			if(bool) {
				if(player.getLevel() < 900 && !player.getInventory().contains(Material.INK_SAC)) {
					bool = false;
					player.sendMessage(ChatColor.RED + "총을 다루기에는 내 힘이 부족하다.");
				}
			}
			if(bool) {
				Location loc = player.getEyeLocation();
				world = player.getWorld();
				SmallFireball arrow = player.launchProjectile(SmallFireball.class);
				arrow.setShooter(player);
				arrow.setIsIncendiary(false);
				arrow.setVelocity(player.getEyeLocation().getDirection().multiply(4.0f));
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
								nearMob.damage(player.getLevel()*150);
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
								nearMob.damage(player.getLevel()*150);
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
								nearMob.damage(player.getLevel()*150);
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
	
	public void staffE5(Arrow arrow) {
		
		List<Entity> entitylist = arrow.getNearbyEntities(8, 6, 8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() != EntityType.PLAYER) {
				if (nearEntity instanceof LivingEntity) {
					LivingEntity nearMob = (LivingEntity) nearEntity;
					nearMob.damage(player.getLevel()*400);
					nearMob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 200, true, false, false));
				}
			}
		}
		world.playEffect(player.getLocation(), Effect.STEP_SOUND, Material.BLUE_ICE);
		
	}
	
	public void staffE6(Arrow arrow) {
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
					List<Entity> entitylist = arrow.getNearbyEntities(4, 4, 4);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 200, true, false, false));
								nearMob.damage(player.getLevel()*150);
								world.playEffect(nearMob.getLocation(), Effect.STEP_SOUND, Material.CRYING_OBSIDIAN);
							}
						}
					}
					world.playSound(arrow.getLocation(), Sound.BLOCK_STONE_BREAK, 2.0f, 0.4f);
					
					td.endTask();
					td.removeID();
				}
				
				time++;
				
			}

		}, 0, 1);
	}
	
}
