package testPack;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Wither;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.minecraft.server.v1_16_R3.WorldServer;

public class TPMobSpawn {

	public TPMobSpawn(Player player, Location loc) {

//		System.out.println(loc.toString());

		fairy(player, loc);
		snow(player, loc);
		senmag(player, loc);
		tower(player, loc);
		maze(player, loc);
		aracune(player, loc);
		forest(player, loc);
		samak(player, loc);
	}

	public void fairy(Player player, Location loc) {
		// 타락한 요정 왕국 입구
		if (loc.getX() == 3745.57 && loc.getY() == 77 && loc.getZ() == 3430.3) {
			player.teleport(new Location(player.getWorld(), 3745.56, 77, 3430.3));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3755 84 3430 3736 74 3461
					if (loc2.getX() <= 3755 && loc2.getY() <= 84 && loc2.getZ() <= 3461 && loc2.getX() >= 3736
							&& loc2.getY() >= 74 && loc2.getZ() >= 3430) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Wither) {
						nearEntity.remove();
					}
					if (nearEntity instanceof Blaze) {
						nearEntity.remove();
					}
					if (nearEntity instanceof Phantom) {
						nearEntity.remove();
					}
				}
			}
			CustomWither cw = new CustomWither(new Location(player.getWorld(), 3745, 77, 3444));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cw);
			for (int i = 0; i < 5; i++) {
				loc.getWorld().spawnEntity(new Location(player.getWorld(), 3740, 80, 3438), EntityType.PHANTOM);
			}
			for (int i = 0; i < 5; i++) {
				loc.getWorld().spawnEntity(new Location(player.getWorld(), 3750, 77, 3453), EntityType.BLAZE);
			}
			return;
		}
		

		// 타락한 요정 왕국 보스
		if (loc.getX() == 3775.61 && loc.getY() == 90.2 && loc.getZ() == 3461.38) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "니 녀석도 내 보물을 훔치러 온 것이냐. 죽어라.");

			player.teleport(new Location(player.getWorld(), 3775.6, 90.2, 3461.38));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3754 90 3497 3797 75 3456
					if (loc2.getX() <= 3797 && loc2.getY() <= 91 && loc2.getZ() <= 3497 && loc2.getX() >= 3754
							&& loc2.getY() >= 75 && loc2.getZ() >= 3456) {
						num++;
						if(new BossHealth().getBar9().getProgress() != 0) {
							new BossHealth().getBar9().addPlayer(player);
						}
						if(new BossHealth().getBar10().getProgress() != 0) {
							new BossHealth().getBar10().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3754 90 3497 3797 75 3456
						if (loc2.getX() <= 3797 && loc2.getY() <= 90 && loc2.getZ() <= 3497 && loc2.getX() >= 3754
								&& loc2.getY() >= 75 && loc2.getZ() >= 3456) {
							nearEntity.remove();
						}
					}
				}
			}

			Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();

			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3776, 77, 3477),
					EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(17);
			head.setHelmet(headItem);

			Skeleton mob2 = (Skeleton) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3774, 77, 3477),
					EntityType.SKELETON);
			EntityEquipment head2 = mob2.getEquipment();
			ItemStack headItem2 = chest.getInventory().getItem(16);
			head2.setHelmet(headItem2);
			
			new BossHealth().getBar9().setProgress(1.0);
			new BossHealth().getBar9().addPlayer(player);
			new BossHealth().getBar10().setProgress(1.0);
			new BossHealth().getBar10().addPlayer(player);
			return;
		}
	}
	
	public void snow(Player player, Location loc) {
		// 카루 던전 입구
		if (loc.getX() == 3826.7 && loc.getY() == 16 && loc.getZ() == 3211.44) {
			player.teleport(new Location(player.getWorld(), 3826.71, 16, 3211.43));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3832 42 3179  3769 9 3242
					if (loc2.getX() <= 3832 && loc2.getY() <= 42 && loc2.getZ() <= 3242 && 
							loc2.getX() >= 3769 && loc2.getY() >= 8 && loc2.getZ() >= 3179) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3832 42 3179  3769 9 3242
						if (loc2.getX() <= 3832 && loc2.getY() <= 42 && loc2.getZ() <= 3242 && 
								loc2.getX() >= 3769 && loc2.getY() >= 8 && loc2.getZ() >= 3179) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3815, 14, 3211), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3812, 14, 3218), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3221), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3798, 14, 3218), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3795, 14, 3211), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3798, 14, 3204), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3201), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3812, 14, 3204), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3211), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3211), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3211), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.SKELETON);
			return;
		}
		
		
		// 카루 던전 중간보스
		if (loc.getX() == 3808.5 && loc.getY() == 69.5 && loc.getZ() == 3215.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "네 놈에게 나락을 보여주도록 하지.");

			player.teleport(new Location(player.getWorld(), 3808, 69, 3215));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3809 93 3201  3783 63 3227
					if (loc2.getX() <= 3809 && loc2.getY() <= 93 && loc2.getZ() <= 3227 && loc2.getX() >= 3783
							&& loc2.getY() >= 63 && loc2.getZ() >= 3201) {
						num++;
						if(new BossHealth().getBar7().getProgress() != 0) {
							new BossHealth().getBar7().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3809 93 3201  3783 63 3227
						if (loc2.getX() <= 3809 && loc2.getY() <= 93 && loc2.getZ() <= 3227 && loc2.getX() >= 3783
								&& loc2.getY() >= 63 && loc2.getZ() >= 3201) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3791, 69, 3215),EntityType.WITHER_SKELETON);
			
			new BossHealth().getBar7().setProgress(1.0);
			new BossHealth().getBar7().addPlayer(player);
			return;
		}
		

		// 카루 던전 보스
		if (loc.getX() == 3730 && loc.getY() == 179 && loc.getZ() == 3236) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "나의 제물이 되어라. 애송이.");

			player.teleport(new Location(player.getWorld(), 3730.1, 179, 3236));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3711 163 3254  3769 133 3217
					if (loc2.getX() <= 3769 && loc2.getY() <= 163 && loc2.getZ() <= 3254 && loc2.getX() >= 3711
							&& loc2.getY() >= 133 && loc2.getZ() >= 3217) {
						num++;
						if(new BossHealth().getBar8().getProgress() != 0) {
							new BossHealth().getBar8().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3711 163 3254  3769 133 3217
						if (loc2.getX() <= 3769 && loc2.getY() <= 163 && loc2.getZ() <= 3254 && loc2.getX() >= 3711
								&& loc2.getY() >= 133 && loc2.getZ() >= 3217) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3740, 140, 3236), EntityType.ZOMBIE);
			
			new BossHealth().getBar8().setProgress(1.0);
			new BossHealth().getBar8().addPlayer(player);
			return;
		}
	}
	
	public void senmag(Player player, Location loc) {
		// 센 마그 던전 입구
		if (loc.getX() == 3407.63 && loc.getY() == 16 && loc.getZ() == 3823.35) {
			player.teleport(new Location(player.getWorld(), 3407.62, 16, 3823.34));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3390 40 3826  3424 11 3783
					if (loc2.getX() <= 3424 && loc2.getY() <= 40 && loc2.getZ() <= 3826 && 
							loc2.getX() >= 3390 && loc2.getY() >= 11 && loc2.getZ() >= 3783) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3390 40 3826  3424 11 3783
						if (loc2.getX() <= 3424 && loc2.getY() <= 40 && loc2.getZ() <= 3826 && 
								loc2.getX() >= 3390 && loc2.getY() >= 11 && loc2.getZ() >= 3783) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomSkeleton cs1 = new CustomSkeleton(new Location(player.getWorld(), 3394, 16, 3823));
			CustomSkeleton cs2 = new CustomSkeleton(new Location(player.getWorld(), 3394, 16, 3819));
			CustomSkeleton cs3 = new CustomSkeleton(new Location(player.getWorld(), 3394, 16, 3815));
			CustomSkeleton cs4 = new CustomSkeleton(new Location(player.getWorld(), 3420, 16, 3823));
			CustomSkeleton cs5 = new CustomSkeleton(new Location(player.getWorld(), 3420, 16, 3819));
			CustomSkeleton cs6 = new CustomSkeleton(new Location(player.getWorld(), 3420, 16, 3815));
			CustomZombie cz1 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			CustomZombie cz2 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			CustomZombie cz3 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			CustomZombie cz4 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			CustomZombie cz5 = new CustomZombie(new Location(player.getWorld(), 3407, 13, 3807));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs1);
			world.addEntity(cs2);
			world.addEntity(cs3);
			world.addEntity(cs4);
			world.addEntity(cs5);
			world.addEntity(cs6);
			world.addEntity(cz1);
			world.addEntity(cz2);
			world.addEntity(cz3);
			world.addEntity(cz4);
			world.addEntity(cz5);
			return;
		}
		
		// 복도방
		if (loc.getX() == 3405.5 && loc.getY() == 13 && loc.getZ() == 3766.5) {
			player.teleport(new Location(player.getWorld(), 3405.6, 13, 3766.4));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3415 25 3769  3395 9 3712
					if (loc2.getX() <= 3415 && loc2.getY() <= 25 && loc2.getZ() <= 3769 && loc2.getX() >= 3395
							&& loc2.getY() >= 9 && loc2.getZ() >= 3712) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3415 25 3769  3395 9 3712
						if (loc2.getX() <= 3415 && loc2.getY() <= 25 && loc2.getZ() <= 3769 && loc2.getX() >= 3395
								&& loc2.getY() >= 9 && loc2.getZ() >= 3712) {
							nearEntity.remove();
						}
					}
				}
			}
			CustomWitherSkeleton cw1 = new CustomWitherSkeleton(new Location(player.getWorld(), 3405, 13, 3753));
			CustomSkeleton cs1 = new CustomSkeleton(new Location(player.getWorld(), 3400, 13, 3741));
			CustomZombie cz1 = new CustomZombie(new Location(player.getWorld(), 3410, 13, 3741));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs1);
			world.addEntity(cz1);
			world.addEntity(cw1);
			return;
		}
		
		
		// 보스
		if (loc.getX() == 3317.46 && loc.getY() == 13 && loc.getZ() == 3725.51) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "내 손 끝 하나도 못 건드릴걸.");

			player.teleport(new Location(player.getWorld(), 3317.45, 13, 3725.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3336 10 3725  3299 45 3762
					if (loc2.getX() <= 3336 && loc2.getY() <= 45 && loc2.getZ() <= 3762 && loc2.getX() >= 3299
							&& loc2.getY() >= 10 && loc2.getZ() >= 3725) {
						num++;
						if(new BossHealth().getBar5().getProgress() != 0) {
							new BossHealth().getBar5().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3336 10 3725  3299 45 3762
						if (loc2.getX() <= 3336 && loc2.getY() <= 45 && loc2.getZ() <= 3762 && loc2.getX() >= 3299
								&& loc2.getY() >= 10 && loc2.getZ() >= 3725) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3317, 15, 3744),EntityType.WITHER_SKELETON);
			
			new BossHealth().getBar5().setProgress(1.0);
			new BossHealth().getBar5().addPlayer(player);
			return;
		}
		

		// 히든 보스
		if (loc.getX() == 3369.59 && loc.getY() == 14 && loc.getZ() == 3803.7) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "좋은 식재료가 제 발로 찾아왔군.");

			player.teleport(new Location(player.getWorld(), 3369.6, 14, 3803.71));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3355 32 3803  3383 11 3766
					if (loc2.getX() <= 3383 && loc2.getY() <= 32 && loc2.getZ() <= 3803 && loc2.getX() >= 3355
							&& loc2.getY() >= 11 && loc2.getZ() >= 3766) {
						num++;
						new BossHealth().getBar6().addPlayer(player);
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3355 32 3803  3383 11 3766
						if (loc2.getX() <= 3383 && loc2.getY() <= 32 && loc2.getZ() <= 3803 && loc2.getX() >= 3355
								&& loc2.getY() >= 11 && loc2.getZ() >= 3766) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3369, 14, 3783), EntityType.ZOMBIE);
			
			new BossHealth().getBar6().setProgress(1.0);
			new BossHealth().getBar6().addPlayer(player);
			return;
		}
	}
	
	public void tower(Player player, Location loc) {
		// 죽음의 탑 1층
		if (loc.getX() == 72.5 && loc.getY() == 75 && loc.getZ() == -3.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 75, -3.51));
			
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 54 75 -5  90 86 -41
					if (loc2.getX() <= 90 && loc2.getY() <= 87 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 75 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar2().getProgress() != 0) {
							new BossHealth().getBar2().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 54 75 -5  90 86 -41
						if (loc2.getX() <= 90 && loc2.getY() <= 87 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 75 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 75, -22), EntityType.SKELETON);
			
			new BossHealth().getBar2().setProgress(1.0);
			new BossHealth().getBar2().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 2층
		if (loc.getX() == 72.5 && loc.getY() == 88 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 88, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 100 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 88 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar3().getProgress() != 0) {
							new BossHealth().getBar3().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 100 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 88 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 88, -22), EntityType.SKELETON);
			
			new BossHealth().getBar3().setProgress(1.0);
			new BossHealth().getBar3().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 3층
		if (loc.getX() == 72.5 && loc.getY() == 101 && loc.getZ() == -8.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 101, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 115 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 101 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar4().getProgress() != 0) {
							new BossHealth().getBar4().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 115 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 101 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 101, -22), EntityType.SKELETON);
			
			new BossHealth().getBar4().setProgress(1.0);
			new BossHealth().getBar4().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 4층
		if (loc.getX() == 72.5 && loc.getY() == 116 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 116, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 116, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 5층
		if (loc.getX() == 72.5 && loc.getY() == 129 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 129, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 141 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 129 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 141 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 129 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 129, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 6층
		if (loc.getX() == 72.5 && loc.getY() == 142 && loc.getZ() == -8.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 142, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 156 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 142 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 156 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 142 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 142, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 7층
		if (loc.getX() == 72.5 && loc.getY() == 157 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 157, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 157, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 8층
		if (loc.getX() == 72.5 && loc.getY() == 170 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 170, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 182 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 170 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 182 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 170 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 170, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 9층
		if (loc.getX() == 72.5 && loc.getY() == 183 && loc.getZ() == -8.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 183, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 197 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 183 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 197 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 183 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 183, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 10층
		if (loc.getX() == 72.5 && loc.getY() == 198 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 198, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 210 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 198 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 210 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 198 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 198, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 11층
		if (loc.getX() == 72.5 && loc.getY() == 211 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 211, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 223 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 211 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 223 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 211 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 211, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 12층
		if (loc.getX() == 72.5 && loc.getY() == 224 && loc.getZ() == -7.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 224, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 238 && loc2.getZ() <= -5 && 
							loc2.getX() >= 54 && loc2.getY() >= 224 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 238 && loc2.getZ() <= -5 && 
								loc2.getX() >= 54 && loc2.getY() >= 224 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 224, -22), EntityType.SKELETON);
			return;
		}
		
		
	}
	
	public void maze(Player player, Location loc) {
		// 코낭그
		if (loc.getX() == 48.5 && loc.getY() == 53 && loc.getZ() == 676.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "먹잇감이 제발로 왔군.");

			player.teleport(new Location(player.getWorld(), 48.13, 53.14, 676.13));
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,40,1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,40,1,true,false,false));
			player.getWorld().playSound(player.getLocation(), Sound.AMBIENT_CAVE, 3.0f, 1.0f);
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 49 && loc2.getY() <= 61 && loc2.getZ() <= 696 && 
							loc2.getX() >= 16 && loc2.getY() >= 51 && loc2.getZ() >= 654) {
						num++;
						if(new BossHealth().getBar1().getProgress() != 0) {
							new BossHealth().getBar1().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 49 && loc2.getY() <= 61 && loc2.getZ() <= 696 && 
								loc2.getX() >= 16 && loc2.getY() >= 51 && loc2.getZ() >= 654) {
							nearEntity.remove();
						}
					}
				}
			}
			
			CustomSkeleton2 cs = new CustomSkeleton2(new Location(player.getWorld(), 25, 54, 675));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);

			new BossHealth().getBar1().setProgress(1.0);
			new BossHealth().getBar1().addPlayer(player);
			return;
		}
	}
	
	public void aracune(Player player, Location loc) {
		// 아라크네
		if (loc.getX() == 750.44 && loc.getY() == 28.44 && loc.getZ() == 591.93) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "씌잇씌익씌이");

			player.teleport(new Location(player.getWorld(), 750.43, 28.44, 591.93));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 776 && loc2.getY() <= 31 && loc2.getZ() <= 605 
							&& loc2.getX() >= 727 && loc2.getY() >= 0 && loc2.getZ() >= 555) {
						num++;
						if(new BossHealth().getBar11().getProgress() != 0) {
							new BossHealth().getBar11().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 776 && loc2.getY() <= 31 && loc2.getZ() <= 605 
								&& loc2.getX() >= 727 && loc2.getY() >= 0 && loc2.getZ() >= 555) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 750, 17, 579), EntityType.CAVE_SPIDER);
			
			new BossHealth().getBar11().setProgress(1.0);
			new BossHealth().getBar11().addPlayer(player);
			return;
		}
	}
	
	public void forest(Player player, Location loc) {
		// 유적의 주인
		if (loc.getX() == 3562.5 && loc.getY() == 25 && loc.getZ() == 3736.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "이곳에 모험가가 오다니 오랜만이군.");

			player.teleport(new Location(player.getWorld(), 3562.6, 25, 3736.6));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3587 && loc2.getY() <= 57 && loc2.getZ() <= 3737 
							&& loc2.getX() >= 3537 && loc2.getY() >= 0 && loc2.getZ() >= 3685) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3587 && loc2.getY() <= 57 && loc2.getZ() <= 3737 
								&& loc2.getX() >= 3537 && loc2.getY() >= 0 && loc2.getZ() >= 3685) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3562, 30, 3712), EntityType.GHAST);
			
			return;
		}
	}
	
	public void samak(Player player, Location loc) {
		// 고대의 암석 협곡 던전
		if (loc.getX() == 3759.01 && loc.getY() == 28 && loc.getZ() == 3078.26) {
			player.teleport(new Location(player.getWorld(), 3759, 28, 3078.25));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3832 && loc2.getY() <= 122 && loc2.getZ() <= 3086 
							&& loc2.getX() >= 3648 && loc2.getY() >= 11 && loc2.getZ() >= 2981) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3832 && loc2.getY() <= 122 && loc2.getZ() <= 3086 
								&& loc2.getX() >= 3648 && loc2.getY() >= 11 && loc2.getZ() >= 2981) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			return;
		}
		
		// 고대의 암석 협곡 중간보스
		if (loc.getX() == 3824.39 && loc.getY() == 34 && loc.getZ() == 2857.79) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "이 앞은 지나갈 수 없다.");

			player.teleport(new Location(player.getWorld(), 3824.3, 34, 2857.8));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(120, 20, 30);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3824 && loc2.getY() <= 52 && loc2.getZ() <= 2896 
							&& loc2.getX() >= 3707 && loc2.getY() >= 16 && loc2.getZ() >= 2834) {
						num++;
						if(new BossHealth().getBar12().getProgress() != 0) {
							new BossHealth().getBar12().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3824 && loc2.getY() <= 52 && loc2.getZ() <= 2896 
								&& loc2.getX() >= 3707 && loc2.getY() >= 16 && loc2.getZ() >= 2834) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3800, 33, 2855), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3800, 33, 2861), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3772, 34, 2858), EntityType.SKELETON);
			
			new BossHealth().getBar12().setProgress(1.0);
			new BossHealth().getBar12().addPlayer(player);
			return;
		}
		
		// 고대의 암석 협곡 보스
		if (loc.getX() == 3697.5 && loc.getY() == 52 && loc.getZ() == 2858.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "여기가 너의 무덤이 될 것이다.");

			player.teleport(new Location(player.getWorld(), 3697.4, 52, 2858.8));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(30, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3697 && loc2.getY() <= 58 && loc2.getZ() <= 2898 
							&& loc2.getX() >= 3658 && loc2.getY() >= 41 && loc2.getZ() >= 2823) {
						num++;
						if (new BossHealth().getBar13().getProgress() != 0) {
							new BossHealth().getBar13().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3697 && loc2.getY() <= 58 && loc2.getZ() <= 2898 
								&& loc2.getX() >= 3658 && loc2.getY() >= 41 && loc2.getZ() >= 2823) {
							nearEntity.remove();
						}
					}
				}
			}

			new BossHealth().getBar13().setProgress(1.0);
			new BossHealth().getBar13().addPlayer(player);
			return;
		}

	}
	
}
