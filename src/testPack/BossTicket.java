package testPack;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
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
		animalKing(player, itemArg, world);
	}

	public void bossSkelE(Player player, Item itemArg, World world) {
		//보스 스켈이 3686 39 3730  3712 47 3672
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.YELLOW + "보스 스켈이 소환 스크롤")) {
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
			if(player.getLevel() < 400) {
				player.sendMessage(ChatColor.RED + "아직 시련의 힘을 버틸 수 없을 것 같다.");
			} else {
				if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "C급 투기장 스크롤")) {
					
					try {
						QuestBoard cb = new QuestBoard();
						if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===투기장===")) {
							int qNum = cb.getNum(player);
							cb.mq45_23(player, qNum + 1);
						}
					} catch(Exception e) {
						
					}
					
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
										// 4030 91 2548  3853 75 2728
										if (loc2.getX() <= 4030 && loc2.getY() <= 91 && loc2.getZ() <= 2728 
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
										if (nearEntity instanceof Mob || nearEntity instanceof ArmorStand) {
											Location loc2 = nearEntity.getLocation();
											// 4030 91 2548  3853 75 2728
											if (loc2.getX() <= 4030 && loc2.getY() <= 91 && loc2.getZ() <= 2728 
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
	}
	
	public void colosseumB(Player player, Item itemArg, World world) {
		// 콜로세움B
		if (player.getLocation().getX() <= 136 && player.getLocation().getZ() <= 1963 
				&& player.getLocation().getX() >= 121 && player.getLocation().getZ() >= 1948) {
			if(player.getLevel() < 400) {
				player.sendMessage(ChatColor.RED + "아직 시련의 힘을 버틸 수 없을 것 같다.");
			} else {
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
										// 4037 91 2730  4207 75 2547
										if (loc2.getX() <= 4207 && loc2.getY() <= 91 && loc2.getZ() <= 2730 
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
										if (nearEntity instanceof Mob || nearEntity instanceof ArmorStand) {
											Location loc2 = nearEntity.getLocation();
											// 4037 91 2730  4207 75 2547
											if (loc2.getX() <= 4207 && loc2.getY() <= 91 && loc2.getZ() <= 2730 
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
	}
	
	public void colosseumA(Player player, Item itemArg, World world) {
		// 콜로세움A
		if (player.getLocation().getX() <= 136 && player.getLocation().getZ() <= 1963 
				&& player.getLocation().getX() >= 121 && player.getLocation().getZ() >= 1948) {
			if(player.getLevel() < 400) {
				player.sendMessage(ChatColor.RED + "아직 시련의 힘을 버틸 수 없을 것 같다.");
			} else {
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
										// 3846 91 2546  4023 75 2369
										if (loc2.getX() <= 4023 && loc2.getY() <= 91 && loc2.getZ() <= 2546 
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
										if (nearEntity instanceof Mob || nearEntity instanceof ArmorStand) {
											Location loc2 = nearEntity.getLocation();
											// 3846 91 2546  4023 75 2369
											if (loc2.getX() <= 4023 && loc2.getY() <= 91 && loc2.getZ() <= 2546 
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
	}
	
	public void colosseumS(Player player, Item itemArg, World world) {
		// 콜로세움S
		if (player.getLocation().getX() <= 136 && player.getLocation().getZ() <= 1963 
				&& player.getLocation().getX() >= 121 && player.getLocation().getZ() >= 1948) {
			if(player.getLevel() < 400) {
				player.sendMessage(ChatColor.RED + "아직 시련의 힘을 버틸 수 없을 것 같다.");
			} else {
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
										// 4031 91 2543  4210 75 2366
										if (loc2.getX() <= 4210 && loc2.getY() <= 91 && loc2.getZ() <= 2543 
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
										if (nearEntity instanceof Mob || nearEntity instanceof ArmorStand) {
											Location loc2 = nearEntity.getLocation();
											// 4031 91 2543  4210 75 2366
											if (loc2.getX() <= 4210 && loc2.getY() <= 91 && loc2.getZ() <= 2543 
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

	public void animalKing(Player player, Item itemArg, World world) {
		// 피르볼그 제사장
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "긴급 탈출 스크롤")) {
			if(player.getLevel() >= 490) {
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
							player.teleport(new Location(player.getWorld(), 3691.5, 104, 2729.7));
						}

						if (time >= 60) {
							player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "너도 네모구나? 네모는 정말 좋지.");
							player.teleport(new Location(player.getWorld(), 3691.5, 103, 2734));
							int num = 0;
							List<Entity> entitylist = player.getNearbyEntities(30, 20, 30);
							for (Entity nearEntity : entitylist) {
								if (nearEntity.getType() == EntityType.PLAYER) {
									Player nearPlayer = (Player) nearEntity;
									Location loc2 = nearPlayer.getLocation();
									// 3679 118 2732  3703 99 2758
									if (loc2.getX() <= 3703 && loc2.getY() <= 118 && loc2.getZ() <= 2758
											&& loc2.getX() >= 3679 && loc2.getY() >= 99 && loc2.getZ() >= 2732) {
										num++;
										if (new BossHealth().getBar20().getProgress() != 0) {
											new BossHealth().getBar20().addPlayer(player);
										}
										td.endTask();
										td.removeID();
										return;
									}
								}
							}

							if (num == 0) {
								for (Entity nearEntity : entitylist) {
									if (nearEntity instanceof Mob || nearEntity instanceof ArmorStand) {
										Location loc2 = nearEntity.getLocation();
										// 3679 118 2732  3703 99 2758
										if (loc2.getX() <= 3703 && loc2.getY() <= 118 && loc2.getZ() <= 2758
												&& loc2.getX() >= 3679 && loc2.getY() >= 99 && loc2.getZ() >= 2732) {
											nearEntity.remove();
										}
									}
								}
							}
							player.getWorld().spawnEntity(new Location(player.getWorld(), 3691.5, 109, 2745), EntityType.WITHER_SKELETON);
							player.getWorld().spawnEntity(new Location(player.getWorld(), 3689, 109, 2745), EntityType.ZOMBIE);
							player.getWorld().spawnEntity(new Location(player.getWorld(), 3687, 109, 2745), EntityType.ZOMBIE);
							player.getWorld().spawnEntity(new Location(player.getWorld(), 3693, 109, 2745), EntityType.SKELETON);
							player.getWorld().spawnEntity(new Location(player.getWorld(), 3695, 109, 2745), EntityType.SKELETON);

							new BossHealth().getBar20().setProgress(1.0);
							new BossHealth().getBar20().addPlayer(player);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			} else {
				player.sendMessage(ChatColor.RED + "이 아이템을 사용하기에는 레벨이 낮다.");
			}
			 
		}
	}

}
