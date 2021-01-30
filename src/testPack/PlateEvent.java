package testPack;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlateEvent {

	private int taskID;
	Random rnd = new Random();
	
	public void effect(Player player, Block block) {
		World world = player.getWorld();
		samakBoss(player, block, world);
		hamabeHidden1(player, block, world);
		hamabeHidden2(player, block, world);
		laphanui1(player, block, world);
		laphanui2(player, block, world);
		hamabe1(player, block, world);
	}
	
	// 암석 거인
	public void samakBoss(Player player, Block block, World world) {
		if(block.getType() == Material.STONE_PRESSURE_PLATE) {
			
			if(block.getX() == 3658 && block.getZ() == 2858) {
				int i = 0;
				for (ItemStack is : player.getInventory().getContents()) {
					if(is == null) continue;
				    if (is.getType() == Material.TNT) {
				    	try {
				    		if(is.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "유황 폭탄")) {
				    			 i = i + is.getAmount();
				    			 is.setAmount(is.getAmount() - 1);
				    			 
				    			 // 암석 거인
				    			 BossBar bb = new BossHealth().getBar13();
									if (bb.getProgress() - 0.1 <= 0) {

										try {
											ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
											ItemMeta rewardKeyIm = rewardKey.getItemMeta();
											rewardKeyIm.setDisplayName(ChatColor.YELLOW + "고대의 암석 협곡 보상 열쇠");
											rewardKey.setItemMeta(rewardKeyIm);
											player.getInventory().addItem(rewardKey);
											player.sendMessage(ChatColor.YELLOW + "고대의 암석 협곡 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
											
											List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
											for (Entity nearEntity : entitylist) {
												if (nearEntity instanceof Player) {
													Player nearPlayer = (Player) nearEntity;
													Location loc2 = nearPlayer.getLocation();
													if (loc2.getX() <= 3697 && loc2.getY() <= 95 && loc2.getZ() <= 2900 
															&& loc2.getX() >= 3658 && loc2.getY() >= 41 && loc2.getZ() >= 2820) {
														nearPlayer.getInventory().addItem(rewardKey);
														nearPlayer.sendMessage(ChatColor.YELLOW + "고대의 암석 협곡 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");
													}
												}
											}
										} catch(Exception e) {
											
										}
										
										try {
											for (Player p : new BossHealth().getBar13().getPlayers()) {
												new BossHealth().getBar13().setProgress(0);
												new BossHealth().getBar13().removePlayer(p);
											}
										} catch(Exception e) {
											
										}
										
										try {
											List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
											for (Entity nearEntity : entitylist) {
												if (nearEntity instanceof Player) {
													Player nearPlayer = (Player) nearEntity;
													Location loc2 = nearPlayer.getLocation();
													if (loc2.getX() <= 3697 && loc2.getY() <= 95 && loc2.getZ() <= 2900 
															&& loc2.getX() >= 3658 && loc2.getY() >= 41 && loc2.getZ() >= 2820) {
														nearPlayer.teleport(new Location(player.getWorld(), 3685, 151, 2858.5));
														System.out.println(0);
													}
												}
											}
										} catch(Exception e) {
											
										}
										System.out.println(1);
										try {
											System.out.println(2);
											System.out.println(player.getDisplayName());
											player.teleport(new Location(player.getWorld(), 3685, 151, 2858.5));
											System.out.println(3);
										} catch (Exception e) {

										}
									} else {
										bb.setProgress(bb.getProgress() - 0.1);
										int p = rnd.nextInt(10);
										int q = rnd.nextInt(10);
										world.playSound(new Location(world, 3652, 48 + p, 2848 + 2 * q), Sound.ENTITY_GENERIC_EXPLODE, 2.5f, 1.0f);
										world.spawnParticle(Particle.EXPLOSION_LARGE, new Location(world, 3652, 48 + p, 2848 + 2 * q), 5);
									}
								}
							} catch (Exception e) {

				    	}
				    }
				}
			}
			
		}	
	}

	// 하마베 히든1
	public void hamabeHidden1(Player player, Block block, World world) {
		if(block.getType() == Material.STONE_PRESSURE_PLATE) {
			Location loc = player.getLocation(); 
			if (block.getX() == 945 && block.getZ() == -29) {

				world.getBlockAt(new Location(world, 945, 49, -36)).setType(Material.AIR);
				world.getBlockAt(new Location(world, 945, 49, -35)).setType(Material.AIR);

				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time >= 600) {
							world.getBlockAt(new Location(world, 945, 49, -36)).setType(Material.SANDSTONE);
							world.getBlockAt(new Location(world, 945, 49, -35)).setType(Material.SANDSTONE);
							td.endTask();
							td.removeID();
						}

						time++;
					}

				}, 0, 1);
				player.getWorld().playSound(loc, Sound.BLOCK_STONE_BREAK, 50.0f, 1.0f);

			}
		}
	}
	
	// 하마베 히든2
	public void hamabeHidden2(Player player, Block block, World world) {
		if (block.getType() == Material.STONE_PRESSURE_PLATE) {
			if (block.getX() == 966 && block.getZ() == 47) {

				world.getBlockAt(new Location(world, 945, 42, -18)).setType(Material.AIR);

				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time >= 600) {
							world.getBlockAt(new Location(world, 945, 42, -18)).setType(Material.IRON_BARS);
							td.endTask();
							td.removeID();
						}

						time++;
					}

				}, 0, 1);

			}
		}
	}
	
	// 라파누이1
	public void laphanui1(Player player, Block block, World world) {
		if (block.getType() == Material.STONE_BUTTON) {
			if (block.getX() == 1829 && block.getZ() == 2158) {

				world.getBlockAt(new Location(world, 1836, 56, 2154)).setType(Material.AIR);

				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time >= 150) {
							world.getBlockAt(new Location(world, 1836, 56, 2154)).setType(Material.OAK_PLANKS);
							td.endTask();
							td.removeID();
						}

						time++;
					}

				}, 0, 1);

			}
		}
	}
	
	// 라파누이2
	public void laphanui2(Player player, Block block, World world) {
		if (block.getType() == Material.STONE_PRESSURE_PLATE) {
			if (block.getX() == 1832 && block.getZ() == 2156) {

				world.getBlockAt(new Location(world, 1836, 57, 2154)).setType(Material.AIR);

				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time >= 150) {
							world.getBlockAt(new Location(world, 1836, 57, 2154)).setType(Material.OAK_PLANKS);
							td.endTask();
							td.removeID();
						}

						time++;
					}

				}, 0, 1);

			}
		}
	}
		
	// 하마베 데히트라
	public void hamabe1(Player player, Block block, World world) {
		if (block.getType() == Material.STONE_BUTTON) {
			if (block.getX() == 887 && block.getZ() == -24) {
				QuestBoard cb = new QuestBoard();
				if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===3개의 종===")) {
					player.teleport(new Location(world, 3796, 19, 3799.5));
					int qNum = cb.getNum(player);
					cb.mq47(player, qNum + 1);
				}
			}
		}
	}
	
}
