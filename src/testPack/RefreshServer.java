package testPack;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import net.minecraft.server.v1_16_R1.ChatMessageType;
import net.minecraft.server.v1_16_R1.IChatBaseComponent;
import net.minecraft.server.v1_16_R1.PacketPlayOutChat;
import net.minecraft.server.v1_16_R1.IChatBaseComponent.ChatSerializer;

public class RefreshServer {

	int sleep;
	Random rnd = new Random();
	World world;
	
	private HashMap<String, Integer> map = new HashMap<String, Integer>();

	public RefreshServer() {
		
		world = Bukkit.getWorld("world");
		
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
		
			int time = 0;
			
			@Override
			public void run() {
				
				if(time % 20 == 0) {
					List<Entity> list1 = world.getEntities();
					for(Entity ent : list1) {
						try {
							String str = ent.getCustomName().split("\\.")[1];
							String num = str.split("]")[0];
							if(num.equals("??")) {
								LivingEntity mob = (LivingEntity) ent; 
								if(mob.getHealth() < 0) {
									mob.remove();
								} 
								if(mob.getHealth() + (mob.getMaxHealth() / 200.0) <= mob.getMaxHealth()) {
									mob.setHealth(mob.getHealth() + (mob.getMaxHealth() / 200.0));
								}
								continue;
							}
						} catch(Exception e) {
							
						}
					}
				}
				
				if(time % 600 == 0) {
					List<Entity> list1 = world.getEntities();
					for(Entity ent : list1) {
						
						try {
							String str = ent.getCustomName().split("\\.")[1];
							String num = str.split("]")[0];
							if(num.equals("??")) {
								continue;
							}
						} catch(Exception e) {
							
						}
						
						int cnt = 0;
						List<Entity> list2 = ent.getNearbyEntities(30, 15, 30);
						for(Entity ent2 : list2) {
							if(ent2 instanceof Player) {
								cnt++;
							}
						}
						if(cnt == 0) {
							try {
								if(ent.getType() == EntityType.ZOMBIE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SKELETON) {
									ent.remove();
								}
								if(ent.getType() == EntityType.DROWNED) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HUSK) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOMBIE_VILLAGER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ENDERMAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SILVERFISH) {
									ent.remove();
								}
								if(ent.getType() == EntityType.STRAY) {
									ent.remove();
								}
								if(ent.getType() == EntityType.RAVAGER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITHER_SKELETON) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITCH) {
									ent.remove();
								}
								if(ent.getType() == EntityType.CAVE_SPIDER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SPIDER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.MAGMA_CUBE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SLIME) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HUSK) {
									ent.remove();
								}
								if(ent.getType() == EntityType.EVOKER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ENDERMITE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.GUARDIAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ELDER_GUARDIAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.GHAST) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PHANTOM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.VINDICATOR) {
									ent.remove();
								}
								if(ent.getType() == EntityType.IRON_GOLEM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.BLAZE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITHER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.POLAR_BEAR) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PIGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOMBIFIED_PIGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.DROPPED_ITEM) {
									ent.remove();
								}
							} catch(Exception e) {
								
							}
						}
					}
					
					// 설원 지역 추움
					for(Player allPlayer : Bukkit.getOnlinePlayers()) {
						Location loc = allPlayer.getLocation();
						if(loc.getBlock().getBiome() == Biome.BASALT_DELTAS || loc.getBlock().getBiome() == Biome.SNOWY_TUNDRA) {
							
							if(allPlayer.getDisplayName().equalsIgnoreCase("yumehama") || allPlayer.getDisplayName().equalsIgnoreCase("woolring")) {
								continue;
							}
							
							if(allPlayer.getInventory().contains(Material.ORANGE_DYE)) {
								continue;
							}
							
							boolean wear = false;
							
							if (allPlayer.getInventory().getHelmet() != null) {
								if (allPlayer.getInventory().getChestplate() != null) {
									if (allPlayer.getInventory().getLeggings() != null) {
										if (allPlayer.getInventory().getBoots() != null) {
											
											if (allPlayer.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 헬멧")) {
												if (allPlayer.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 갑옷")) {
													if (allPlayer.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 각반")) {
														if (allPlayer.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 신발")) {
															wear = true;
														}
													}
												}
											}
											if (allPlayer.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 헬멧")) {
												if (allPlayer.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 갑옷")) {
													if (allPlayer.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 각반")) {
														if (allPlayer.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 신발")) {
															wear = true;
														}
													}
												}
											}
											if (allPlayer.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 헬멧")) {
												if (allPlayer.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 갑옷")) {
													if (allPlayer.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 각반")) {
														if (allPlayer.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 신발")) {
															wear = true;
														}
													}
												}
											}
											
										}
									}
								}
							}
							
							if(wear == false) {
								allPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 2,true,false,false));
								allPlayer.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 600, 2,true,false,false));
								allPlayer.sendMessage(ChatColor.RED + "추워서 몸이 얼어붙는 것 같다.");
							}
							
						}
					}
				}
				
				if(time % 6000 == 0) {
					
					for(Player player : Bukkit.getOnlinePlayers()) {
						player.sendMessage(ChatColor.BLUE + "=============================");
						player.sendMessage(ChatColor.GOLD + "서버 홈페이지에서 많은 정보를 얻을 수 있습니다!");
						try {
							IChatBaseComponent comp = ChatSerializer.a("{\"text\":\"" + "\",\"extra\":[{\"text\":\"" + ChatColor.LIGHT_PURPLE + "" + ChatColor.UNDERLINE + "https://aile-server.netlify.app/"
				                    + "\",\"clickEvent\": {\"action\":\"open_url\",\"value\":\"" + "https://aile-server.netlify.app/"
				                    +  "\",\"hoverEvent\": {\"action\":\"show_text\",\"value\":\"" + ""
				                    + "\"}}}]}"); 
							PacketPlayOutChat chat = new PacketPlayOutChat(comp, ChatMessageType.CHAT, player.getUniqueId());
							Object handle = player.getClass().getMethod("getHandle").invoke(player);
					        Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
					        playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, chat);
						} catch(Exception e) {
							
						}
						player.sendMessage("");
						player.sendMessage(ChatColor.GOLD + "링크를 클릭해 홈페이지로 이동!");
						player.sendMessage(ChatColor.BLUE + "=============================");
					}
					
					if(map.size() == 0) {
						for(Player allPlayer : Bukkit.getOnlinePlayers()) {
							map.put(allPlayer.getDisplayName(), (int)(allPlayer.getLocation().getX()*2 + allPlayer.getLocation().getY()*3 + allPlayer.getLocation().getZ()*5));
						}
					} else {
						for(Player allPlayer : Bukkit.getOnlinePlayers()) {
							if(!(allPlayer.getDisplayName().equals("yumehama") || allPlayer.getDisplayName().equals("WoolRing"))) {
								if(map.containsKey(allPlayer.getDisplayName())) {
									int num = map.get(allPlayer.getDisplayName());
									if(num == (int)(allPlayer.getLocation().getX()*2 + allPlayer.getLocation().getY()*3 + allPlayer.getLocation().getZ()*5)) {
										allPlayer.kickPlayer("잠수 플레이어로 추정되어 서버에서 나가졌습니다.");
									}
								}
							}
						}						
						map.clear();
						for(Player allPlayer : Bukkit.getOnlinePlayers()) {
							map.put(allPlayer.getDisplayName(), (int)(allPlayer.getLocation().getX()*2 + allPlayer.getLocation().getY()*3 + allPlayer.getLocation().getZ()*4));
						}
					}
				}
				
				if(time >= 6000) {
					time = 0;
				}
				
//				if(time >= 0) {
//					for(Entity ent : Bukkit.getWorld("world").getEntities()) {
//						if(ent.getType() == EntityType.DROPPED_ITEM) {
//							Item item = (Item) ent;
//							if(item.getPickupDelay() > 1000000) {
//								Vector v = new Vector(0, 0, 0);
//								if(item.getVelocity() == v) {
//									item.remove();
//								}
//							}
//						}
//					}
//				}
			
				time++;
				
			}						
			
		}, 0, 1);
	}
	
	private Class<?> getNMSClass(String name) {
		try {
	        return Class.forName("net.minecraft.server."
	                + Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3] + "." + name);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
}
