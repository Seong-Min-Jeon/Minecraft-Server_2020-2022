package testPack;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

public class BossTicket {
	
	private int taskID;
	
	public void summon(Player player, Item itemArg) {
		World world = player.getWorld();
		bossSkelE(player, itemArg, world);
		colosseumC(player, itemArg, world);
		colosseumB(player, itemArg, world);
		colosseumA(player, itemArg, world);
		colosseumS(player, itemArg, world);
	}

	public void bossSkelE(Player player, Item itemArg, World world) {
		//보스 스켈이 3686 39 3730  3712 47 3672
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.YELLOW + "보스 스켈이 소환 티켓")) {
			if (player.getLocation().getX() <= 3712 && player.getLocation().getY() <= 47
					&& player.getLocation().getZ() <= 3730 && player.getLocation().getX() >= 3686
					&& player.getLocation().getY() >= 39 && player.getLocation().getZ() >= 3672) {
				Location loc = new Location(world, 3707, 44, 3712);
				world.spawnEntity(loc, EntityType.SKELETON);
				itemArg.remove();
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 5);
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 100);
				itemArg.getLocation().getWorld().playEffect(loc, Effect.SMOKE, 5);
				player.getWorld().playSound(player.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1.0f, 1.0f);
			} else {
				itemArg.remove();
			}
		}
	}
	
	public void colosseumC(Player player, Item itemArg, World world) {
		// 콜로세움C 
		if (player.getLocation().getX() <= 136 && player.getLocation().getZ() <= 1963 
				&& player.getLocation().getX() >= 121 && player.getLocation().getZ() >= 1948) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "C급 투기장 스크롤")) {
				player.sendMessage(ChatColor.WHITE + "[System] 투기장에서는 모든 데미지가 고정됩니다. 또한 투기장의 보스 몬스터는 특정 방법으로 입는 데미지가 0입니다.");
				itemArg.remove();
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time == 0) {
							player.teleport(new Location(player.getWorld(), 3938, 93, 2641, 270, 0));
						}

						if (time >= 60) {
							player.teleport(new Location(player.getWorld(), 3887, 84, 2641, 270, 0));
							int num = 0;
							List<Entity> entitylist = player.getNearbyEntities(120, 20, 120);
							for (Entity nearEntity : entitylist) {
								if (nearEntity.getType() == EntityType.PLAYER) {
									Player nearPlayer = (Player) nearEntity;
									Location loc2 = nearPlayer.getLocation();
									// 4030 120 2548  3853 75 2728
									if (loc2.getX() <= 4030 && loc2.getY() <= 120 && loc2.getZ() <= 2728 
											&& loc2.getX() >= 3853 && loc2.getY() >= 75 && loc2.getZ() >= 2548) {
										num++;
										if(new BossHealth().getBar14().getProgress() != 0) {
											new BossHealth().getBar14().addPlayer(player);
										}
										td.endTask();
										td.removeID();
										return;
									}
								}
							}

							if (num == 0) {
								for (Entity nearEntity : entitylist) {
									if (nearEntity instanceof Mob) {
										Location loc2 = nearEntity.getLocation();
										// 4030 120 2548  3853 75 2728
										if (loc2.getX() <= 4030 && loc2.getY() <= 120 && loc2.getZ() <= 2728 
												&& loc2.getX() >= 3853 && loc2.getY() >= 75 && loc2.getZ() >= 2548) {
											nearEntity.remove();
										}
									}
								}
							}
							player.getWorld().spawnEntity(new Location(player.getWorld(), 3938, 84, 2641), EntityType.SKELETON);
							
							new BossHealth().getBar14().setProgress(1.0);
							new BossHealth().getBar14().addPlayer(player);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void colosseumB(Player player, Item itemArg, World world) {
		// 콜로세움B
		if (player.getLocation().getX() <= 136 && player.getLocation().getZ() <= 1963 
				&& player.getLocation().getX() >= 121 && player.getLocation().getZ() >= 1948) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "B급 투기장 스크롤")) {
				player.sendMessage(ChatColor.WHITE + "[System] 투기장에서는 모든 데미지가 고정됩니다. 또한 투기장의 보스 몬스터는 특정 방법으로 입는 데미지가 0입니다.");
				itemArg.remove();
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time == 0) {
							player.teleport(new Location(player.getWorld(), 4120, 93, 2641, 270, 0));
						}

						if (time >= 60) {
							player.teleport(new Location(player.getWorld(), 4070, 84, 2641, 270, 0));
							int num = 0;
							List<Entity> entitylist = player.getNearbyEntities(120, 20, 120);
							for (Entity nearEntity : entitylist) {
								if (nearEntity.getType() == EntityType.PLAYER) {
									Player nearPlayer = (Player) nearEntity;
									Location loc2 = nearPlayer.getLocation();
									// 4037 120 2730  4207 75 2547
									if (loc2.getX() <= 4207 && loc2.getY() <= 120 && loc2.getZ() <= 2730 
											&& loc2.getX() >= 4037 && loc2.getY() >= 75 && loc2.getZ() >= 2547) {
										num++;
										if(new BossHealth().getBar15().getProgress() != 0) {
											new BossHealth().getBar15().addPlayer(player);
										}
										td.endTask();
										td.removeID();
										return;
									}
								}
							}

							if (num == 0) {
								for (Entity nearEntity : entitylist) {
									if (nearEntity instanceof Mob) {
										Location loc2 = nearEntity.getLocation();
										// 4037 120 2730  4207 75 2547
										if (loc2.getX() <= 4207 && loc2.getY() <= 120 && loc2.getZ() <= 2730 
												&& loc2.getX() >= 4037 && loc2.getY() >= 75 && loc2.getZ() >= 2547) {
											nearEntity.remove();
										}
									}
								}
							}
							player.getWorld().spawnEntity(new Location(player.getWorld(), 4120, 84, 2641), EntityType.SKELETON);
							
							new BossHealth().getBar15().setProgress(1.0);
							new BossHealth().getBar15().addPlayer(player);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void colosseumA(Player player, Item itemArg, World world) {
		// 콜로세움A
		if (player.getLocation().getX() <= 136 && player.getLocation().getZ() <= 1963 
				&& player.getLocation().getX() >= 121 && player.getLocation().getZ() >= 1948) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "A급 투기장 스크롤")) {
				player.sendMessage(ChatColor.WHITE + "[System] 투기장에서는 모든 데미지가 고정됩니다. 또한 투기장의 보스 몬스터는 특정 방법으로 입는 데미지가 0입니다.");
				itemArg.remove();
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time == 0) {
							player.teleport(new Location(player.getWorld(), 3937, 93, 2456, 270, 0));
						}

						if (time >= 60) {
							player.teleport(new Location(player.getWorld(), 3887, 84, 2456, 270, 0));
							int num = 0;
							List<Entity> entitylist = player.getNearbyEntities(120, 20, 120);
							for (Entity nearEntity : entitylist) {
								if (nearEntity.getType() == EntityType.PLAYER) {
									Player nearPlayer = (Player) nearEntity;
									Location loc2 = nearPlayer.getLocation();
									// 3846 120 2546  4023 75 2369
									if (loc2.getX() <= 4023 && loc2.getY() <= 120 && loc2.getZ() <= 2546 
											&& loc2.getX() >= 3846 && loc2.getY() >= 75 && loc2.getZ() >= 2369) {
										num++;
										if(new BossHealth().getBar16().getProgress() != 0) {
											new BossHealth().getBar16().addPlayer(player);
										}
										td.endTask();
										td.removeID();
										return;
									}
								}
							}

							if (num == 0) {
								for (Entity nearEntity : entitylist) {
									if (nearEntity instanceof Mob) {
										Location loc2 = nearEntity.getLocation();
										// 3846 120 2546  4023 75 2369
										if (loc2.getX() <= 4023 && loc2.getY() <= 120 && loc2.getZ() <= 2546 
												&& loc2.getX() >= 3846 && loc2.getY() >= 75 && loc2.getZ() >= 2369) {
											nearEntity.remove();
										}
									}
								}
							}
							player.getWorld().spawnEntity(new Location(player.getWorld(), 3937, 84, 2456), EntityType.SKELETON);
							
							new BossHealth().getBar16().setProgress(1.0);
							new BossHealth().getBar16().addPlayer(player);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void colosseumS(Player player, Item itemArg, World world) {
		// 콜로세움S
		if (player.getLocation().getX() <= 136 && player.getLocation().getZ() <= 1963 
				&& player.getLocation().getX() >= 121 && player.getLocation().getZ() >= 1948) {
			if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤")) {
				player.sendMessage(ChatColor.WHITE + "[System] 투기장에서는 모든 데미지가 고정됩니다. 또한 투기장의 보스 몬스터는 특정 방법으로 입는 데미지가 0입니다.");
				itemArg.remove();
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time == 0) {
							player.teleport(new Location(player.getWorld(), 4118, 93, 2456, 270, 0));
						}

						if (time >= 60) {
							player.teleport(new Location(player.getWorld(), 4068, 84, 2456, 270, 0));
							int num = 0;
							List<Entity> entitylist = player.getNearbyEntities(120, 20, 120);
							for (Entity nearEntity : entitylist) {
								if (nearEntity.getType() == EntityType.PLAYER) {
									Player nearPlayer = (Player) nearEntity;
									Location loc2 = nearPlayer.getLocation();
									// 4031 120 2543  4210 75 2366
									if (loc2.getX() <= 4210 && loc2.getY() <= 120 && loc2.getZ() <= 2543 
											&& loc2.getX() >= 4031 && loc2.getY() >= 75 && loc2.getZ() >= 2366) {
										num++;
										if(new BossHealth().getBar17().getProgress() != 0) {
											new BossHealth().getBar17().addPlayer(player);
										}
										td.endTask();
										td.removeID();
										return;
									}
								}
							}

							if (num == 0) {
								for (Entity nearEntity : entitylist) {
									if (nearEntity instanceof Mob) {
										Location loc2 = nearEntity.getLocation();
										// 4031 120 2543  4210 75 2366
										if (loc2.getX() <= 4210 && loc2.getY() <= 120 && loc2.getZ() <= 2543 
												&& loc2.getX() >= 4031 && loc2.getY() >= 75 && loc2.getZ() >= 236) {
											nearEntity.remove();
										}
									}
								}
							}
							player.getWorld().spawnEntity(new Location(player.getWorld(), 4118, 84, 2456), EntityType.SKELETON);
							
							new BossHealth().getBar17().setProgress(1.0);
							new BossHealth().getBar17().addPlayer(player);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}

}
