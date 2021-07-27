package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.NumberFormat.Style;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftItemFrame;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPainting;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Boat;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.Egg;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.EvokerFangs;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.Horse;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Item;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Llama;
import org.bukkit.entity.LlamaSpit;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Player;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zoglin;
import org.bukkit.entity.Zombie;
import org.bukkit.event.Event.Result;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockCookEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockIgniteEvent.IgniteCause;
import org.bukkit.event.block.BlockMultiPlaceEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.EntityBlockFormEvent;
import org.bukkit.event.block.FluidLevelChangeEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.block.MoistureChangeEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.EntityBreedEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntityTransformEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.LingeringPotionSplashEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingBreakEvent.RemoveCause;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerAnimationType;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupArrowEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.vehicle.VehicleCollisionEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.WorldEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.map.MapView;
import org.bukkit.map.MapView.Scale;
import org.bukkit.material.MaterialData;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;
import org.bukkit.util.Vector;

import net.minecraft.server.v1_16_R3.ChatHexColor;
import net.minecraft.server.v1_16_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_16_R3.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_16_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_16_R3.WorldGenDecoratorNetherGlowstone;
import net.minecraft.server.v1_16_R3.PacketPlayOutTitle.EnumTitleAction;

import java.util.Random;

public class Main extends JavaPlugin implements Listener{
	
	// gamerule doMobLoot false
	// gamerule doMobSpawning false
	// gamerule keepInventory trues
	// gamerule doImmediateRespawn true
	// gamerule doLimitedCrafting true
	// gamerule mobGriefing false
	// gamerule doWeatherCycle false
	// Damage_ALL, Damage_Undead, Damage_Arthropods, Impaling, Sweeping, Protection_Environment, Protection_Fire, Protection_Explosion, Protection_Projectile, Thorns, Level
	
	Random rnd = new Random();
	World world;
	
	Cmd12EmeraldToggle et = new Cmd12EmeraldToggle();
 
	private int taskID;
	Scoreboard board;
	Team red;
	Team blue;
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		//custom command
		getCommand("killMe").setExecutor(new Cmd1killme());
		getCommand("ChangeAir").setExecutor(new Cmd2ChangeAir());
		getCommand("WallPaint").setExecutor(new Cmd3WallPaint());
		getCommand("Where").setExecutor(new Cmd4Where());
		getCommand("ServerChat").setExecutor(new Cmd5ServerChat());
		getCommand("msg").setExecutor(new Cmd6msg());
		getCommand("c").setExecutor(new Cmd7c());
		getCommand("party").setExecutor(new Cmd8Party());
		getCommand("setBiome").setExecutor(new Cmd9SetBiome());
		getCommand("VilTP").setExecutor(new Cmd10VilTp());
		getCommand("SpawnVil").setExecutor(new Cmd11SpawnVil());
		getCommand("EmeraldToggle").setExecutor(new Cmd12EmeraldToggle());
		getCommand("chest").setExecutor(new Cmd13Chest());
		getCommand("ItemLock").setExecutor(new Cmd14ItemLock());
		getCommand("skiptutorial").setExecutor(new Cmd15skiptutorial());
		getCommand("class").setExecutor(new Cmd16class());
		getCommand("exptoggle").setExecutor(new Cmd17ExpToggle());
		getCommand("itemtoggle").setExecutor(new Cmd18ItemToggle());
		getCommand("k").setExecutor(new Cmd19Kick());
		getCommand("LoveWood").setExecutor(new Cmd20LoveWood());
		getCommand("trade").setExecutor(new Cmd21Trade());
		getCommand("mysterychest").setExecutor(new Cmd22MysteryChest());
		getCommand("craftname").setExecutor(new Cmd23CraftName());
		
		new Cmd16class().setFolder(getDataFolder());
		
		new RefreshServer();
//		new NPCHitBox();
		
		
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		board = manager.getNewScoreboard();
		
		red = board.registerNewTeam("red");
		blue = board.registerNewTeam("blue");
		
		red.setColor(ChatColor.DARK_RED);
		blue.setColor(ChatColor.DARK_AQUA);
		
		red.setPrefix(ChatColor.DARK_RED + "");
		blue.setPrefix(ChatColor.DARK_AQUA + "");
		red.setSuffix(ChatColor.DARK_RED + "");
		blue.setSuffix(ChatColor.DARK_AQUA + "");
		
		
		//chest
		try {
			File dataFolder = getDataFolder();
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File file = new File(getDataFolder(), "___ChestOwner.dat");
                if(!file.exists()) {
                    try {
                    	file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                	FileReader filereader = new FileReader(file);
                    BufferedReader bufReader = new BufferedReader(filereader);
                    String data;
                    Cmd13Chest cc = new Cmd13Chest();
                    while((data = bufReader.readLine()) != null) {
                    	String uuid = data.split(",")[0];
                    	int num = Integer.parseInt(data.split(",")[1]);
                    	cc.putData(uuid, num);
                    }
                    bufReader.close();
                }
            }
		} catch(Exception e) {
			
		}
		
		try {
			Iterator<Recipe> it = getServer().recipeIterator();
			Recipe recipe;
			while (it.hasNext()) {
				recipe = it.next();
				if (recipe != null) {
					it.remove();
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	@Override
	public void onDisable() {
		getLogger().info("==Disable==");
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer(); 
		
		// 접속가능한 플레이어
		try {
//			if (!(player.getDisplayName().equalsIgnoreCase("yumehama"))) {
//				player.kickPlayer("서버 점검 중 입니다.");
//				return;
//			}
			if ((player.getUniqueId().toString().equalsIgnoreCase("5d5f3cf5-bbec-4dba-b97c-fe2ddf900191"))) {
				player.kickPlayer("You are Banned");
				return;
			}
		} catch (Exception e) {
			System.err.println(player.getDisplayName() + "이 접속을 시도하였습니다.");
		}
		
		//리소스팩 적용
		if(player.getDisplayName().equalsIgnoreCase("woolring")) { 
			
		} else {
			player.setResourcePack("https://cdn.discordapp.com/attachments/557875773617340416/865553225713188894/aile_texture_pack_33.zip");
		}
		
		//Message
		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {
			event.setJoinMessage("그가 돌아왔다. " + ChatColor.DARK_RED + "'더 게임 종결자' 유메하마.");
		} else if(player.getDisplayName().equalsIgnoreCase("WoolRing")) {
			event.setJoinMessage("그가 돌아왔다. " + ChatColor.GREEN + "'도트랑 도트가 제일 좋아' 울링.");
		} else if(player.getDisplayName().equalsIgnoreCase("_nanoboost_")) {
			event.setJoinMessage("그가 돌아왔다. " + ChatColor.RED + "'대행자 버프를 받은 (하지만 감마가 준제인)' 나노부스트.");
		} else if(player.getDisplayName().equalsIgnoreCase("why9196")) {
			event.setJoinMessage("확률이 뭐죠? " + ChatColor.BLUE + "'0.0068% 돌파한' 와이.");
		} else if(player.getDisplayName().equalsIgnoreCase("Akilae3102")) {
			event.setJoinMessage("그가 돌아왔다. " + ChatColor.AQUA + "'금제가 뭐죠?' 아킬레.");
		} else if(player.getDisplayName().equalsIgnoreCase("Espina_ID")) {
			event.setJoinMessage("그가 돌아왔다. " + ChatColor.BOLD + "'그저 군인' 에스피나.");
		} else if(player.getDisplayName().equalsIgnoreCase("KangOSung")) {
			event.setJoinMessage("그가 돌아왔다. " + ChatColor.YELLOW + "캉캉캉캉캉!");
		} else if(player.getDisplayName().equalsIgnoreCase("Illusion__")) {
			event.setJoinMessage("그가 돌아왔다. " + ChatColor.GOLD + "일류 건축가 릴륨.");
		} else if(player.getDisplayName().equalsIgnoreCase("JunletTridner")) {
			event.setJoinMessage("그가 돌아왔다. " + ChatColor.GOLD + "데빌의 힘을 보여드립니다. Jun");
		} else if(player.getDisplayName().equalsIgnoreCase("SARASHINA_RUKA")) {
			event.setJoinMessage("그가 돌아왔다. " + ChatColor.YELLOW + "보석.. 보석은 어디에 있는가?");
		} else {
			event.setJoinMessage("야생의 누군가가 등장했다.");
		}
		
		//경고
//		if(player.getDisplayName().equalsIgnoreCase("Ryu_CY")) {
//			player.sendMessage("매크로 사용으로 현재 1회 경고를 받은 상황입니다.");
//			player.sendMessage("경고 2회 때에는 무통보 영구정지 및 캐릭터 삭제가 있을 수 있습니다.");
//		}
		
		//set 
		player.setGameMode(GameMode.ADVENTURE);
		player.setOp(false);
		if(player.getDisplayName().equalsIgnoreCase("yumehama") || player.getDisplayName().equalsIgnoreCase("WoolRing") 
				|| player.getDisplayName().equalsIgnoreCase("Illusion__")) {
			player.setOp(true);
		}		
		
		//처음 온 플레이어 상자 배정
		try {
			File dataFolder = getDataFolder();
	        if(!dataFolder.exists()) {
	            dataFolder.mkdir();
	        } else {
	        	File file = new File(getDataFolder(), "playerInv.dat");
	            if(!file.exists()) {
	                try {
	                	file.createNewFile();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            } else {
	            	FileReader filereader = new FileReader(file);
                    BufferedReader bufReader = new BufferedReader(filereader);
                    int x = 0;
                    String line = bufReader.readLine();
                    while(line != null) {
                    	x++;
                    	if(line.equals(player.getUniqueId().toString())) {
                    		break;
                    	}
                    	line = bufReader.readLine();
                    }
                    if(line == null) {
                        BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true), "UTF-8"));
                        fw.write(player.getUniqueId().toString());
                        fw.write("\n");
                        fw.write(Integer.toString(10000+x) + "/1/0");
                        fw.write("\n");
                        fw.close();
                        
                        world = Bukkit.getWorld("world");
                        Location loc;
                        loc = new Location(world, 10000+x, 1, 0);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 1);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 2);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 3);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 4);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 5);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 6);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 7);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 8);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 9);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 10);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 11);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 12);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 13);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 14);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 15);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 16);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 1, 17);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 0);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 1);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 2);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 3);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 4);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 5);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 6);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 7);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 8);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 9);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 10);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 11);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 12);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 13);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 14);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 15);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 16);
                        loc.getBlock().setType(Material.CHEST);
                        loc = new Location(world, 10000+x, 2, 17);
                        loc.getBlock().setType(Material.CHEST);
                    }
                    bufReader.close();
	            }
	        }
		} catch(Exception e) {
			
		}
		
		// 생성 가능 캐릭터 파일
		try {
			File dataFolder = getDataFolder();
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e) {
            		    e.getStackTrace();
            		}
				}
				File file = new File(dir, "available_character.dat");
				if (!file.exists()) {
					try {
						file.createNewFile();
						BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
		                fw.write("1 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0");
		                fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			
		}
		
		// 생활 레벨 파일
		try {
			File dataFolder = getDataFolder();
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
				if (!dir.exists()) {
					try {
						dir.mkdir();
					} catch (Exception e) {
						e.getStackTrace();
					}
				}
				File file = new File(dir, "fantasy_life_level.dat");
				if (!file.exists()) {
					try {
						file.createNewFile();
						BufferedWriter fw = new BufferedWriter(
								new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
						fw.write("1.00 1.00 1.00 1 1 1");
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {

		}
		
		//플레이어 접속 시 로비로 이동 & 캐릭터 선택창 활성화
		world = player.getWorld();
		player.teleport(new Location(world,3665,41,3675.5,180,0));
		for(PotionEffect effect : player.getActivePotionEffects()){
	        player.removePotionEffect(effect.getType());
	    }
		player.setFireTicks(0);
		player.getInventory().clear();
		player.setLevel(0);
		player.setExp(0);
		player.setHealth(20);
		player.setFoodLevel(20);
		
		//progress bar
		ProgressBar pb = new ProgressBar();
		if(pb.bar1isRun()) {
			pb.bar1AddPlayer(player);
		}
		if(pb.bar2isRun()) {
			pb.bar2AddPlayer(player);
		}
		if(pb.bar3isRun()) {
			pb.bar3AddPlayer(player);
		}
		if(pb.bar4isRun()) {
			pb.bar4AddPlayer(player);
		}
		
		//Mob Spawning Field	
		this.getServer().getPluginManager().registerEvents(new MobThread(player), this);
		
		// npc 생성
		new NPCManager(player, 0);
			
		ItemStack master = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta masterIm = master.getItemMeta();
		masterIm.setLocalizedName("1000000,1000000,1000000,1000000,0,30000,30000,30000,30000,1000000,0");
		masterIm.addEnchant(Enchantment.DAMAGE_ALL, 0, true);
		masterIm.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "신의 검[범위 축소형]");
		ArrayList<String> masterLore = new ArrayList();
		masterIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		masterIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		masterIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		masterIm.setUnbreakable(true);
		masterIm.setLore(masterLore);
		master.setItemMeta(masterIm);
		if(player.getDisplayName().equalsIgnoreCase("yumehama") && !player.getInventory().contains(master)) {player.getInventory().addItem(master);}
//		if(player.getDisplayName().equalsIgnoreCase("WoolRing") && !player.getInventory().contains(master)) {player.getInventory().addItem(master);}

		
//		ItemStack var2 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
//		ItemMeta var2Im = var2.getItemMeta();
//		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,560");
//		var2Im.setDisplayName(ChatColor.AQUA + "진액의 코어");
//		ArrayList<String> var2Lore = new ArrayList();
//		var2Lore.add(ChatColor.GRAY + "레벨 제한: 560");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.GRAY + "와우를 구성하고 있는 진액의 코어");
//		var2Lore.add(ChatColor.GRAY + "악취가 심해서 독에 걸린지도 모를 것 같다.");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.BLUE + "-독 데미지 60% 경감");
//		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var2Im.setUnbreakable(true);
//		var2Im.setLore(var2Lore);
//		var2.setItemMeta(var2Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var2);}
//		
//		ItemStack var3 = new ItemStack(Material.DIAMOND_AXE);
//		ItemMeta var3Im = var3.getItemMeta();
//		var3Im.setCustomModelData(10007);
//		var3Im.setLocalizedName("5000,0,0,0,0,0,0,0,0,0,600");
//		var3Im.setDisplayName(ChatColor.LIGHT_PURPLE + "끈적한 공격의 보주");
//		ArrayList<String> var3Lore = new ArrayList();
//		var3Lore.add(ChatColor.GRAY + "레벨 제한: 600");
//		var3Lore.add(ChatColor.GRAY + " ");
//		var3Lore.add(ChatColor.GRAY + "슬라임의 위장에서 오랜 시간 숙성된 보주");
//		var3Lore.add(ChatColor.GRAY + " ");
//		var3Lore.add(ChatColor.BLUE + "-공격력: 5000");
//		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var3Im.setUnbreakable(true);
//		var3Im.setLore(var3Lore);
//		var3.setItemMeta(var3Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var3);}
//		
//		ItemStack var4 = new ItemStack(Material.DIAMOND_AXE);
//		ItemMeta var4Im = var4.getItemMeta();
//		var4Im.setCustomModelData(10008);
//		var4Im.setLocalizedName("0,4000,0,0,0,0,0,0,0,0,600");
//		var4Im.setDisplayName(ChatColor.LIGHT_PURPLE + "끈적한 공격의 보주");
//		ArrayList<String> var4Lore = new ArrayList();
//		var4Lore.add(ChatColor.GRAY + "레벨 제한: 600");
//		var4Lore.add(ChatColor.GRAY + " ");
//		var4Lore.add(ChatColor.GRAY + "슬라임의 위장에서 오랜 시간 숙성된 보주");
//		var4Lore.add(ChatColor.GRAY + " ");
//		var4Lore.add(ChatColor.BLUE + "-추가 데미지(인간형): 4000");
//		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var4Im.setUnbreakable(true);
//		var4Im.setLore(var4Lore);
//		var4.setItemMeta(var4Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var4);}
//		
//		ItemStack var5 = new ItemStack(Material.DIAMOND_AXE);
//		ItemMeta var5Im = var5.getItemMeta();
//		var5Im.setCustomModelData(10009);
//		var5Im.setLocalizedName("0,0,4000,0,0,0,0,0,0,0,600");
//		var5Im.setDisplayName(ChatColor.LIGHT_PURPLE + "끈적한 공격의 보주");
//		ArrayList<String> var5Lore = new ArrayList();
//		var5Lore.add(ChatColor.GRAY + "레벨 제한: 600");
//		var5Lore.add(ChatColor.GRAY + " ");
//		var5Lore.add(ChatColor.GRAY + "슬라임의 위장에서 오랜 시간 숙성된 보주");
//		var5Lore.add(ChatColor.GRAY + " ");
//		var5Lore.add(ChatColor.BLUE + "-추가 데미지(동물형): 4000");
//		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var5Im.setUnbreakable(true);
//		var5Im.setLore(var5Lore);
//		var5.setItemMeta(var5Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var5);}
//		
//		ItemStack var6 = new ItemStack(Material.DIAMOND_AXE);
//		ItemMeta var6Im = var6.getItemMeta();
//		var6Im.setCustomModelData(10010);
//		var6Im.setLocalizedName("0,0,0,4000,0,0,0,0,0,0,600");
//		var6Im.setDisplayName(ChatColor.LIGHT_PURPLE + "끈적한 공격의 보주");
//		ArrayList<String> var6Lore = new ArrayList();
//		var6Lore.add(ChatColor.GRAY + "레벨 제한: 600");
//		var6Lore.add(ChatColor.GRAY + " ");
//		var6Lore.add(ChatColor.GRAY + "슬라임의 위장에서 오랜 시간 숙성된 보주");
//		var6Lore.add(ChatColor.GRAY + " ");
//		var6Lore.add(ChatColor.BLUE + "-추가 데미지(기타): 4000");
//		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var6Im.setUnbreakable(true);
//		var6Im.setLore(var6Lore);
//		var6.setItemMeta(var6Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var6);}
//		
//		ItemStack var8 = new ItemStack(Material.MUSIC_DISC_BLOCKS);
//		ItemMeta var8Im = var8.getItemMeta();
//		var8Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,450");
//		var8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "세컨드 윙");
//		ArrayList<String> var8Lore = new ArrayList();
//		var8Lore.add(ChatColor.GRAY + "레벨 제한: 450");
//		var8Lore.add(ChatColor.GRAY + " ");
//		var8Lore.add(ChatColor.GRAY + "마법의 힘으로 하늘을 날 수 있는 스태프");
//		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var8Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
//		var8Im.setUnbreakable(true);
//		var8Im.setLore(var8Lore);
//		var8.setItemMeta(var8Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var8);}
//		
//		ItemStack var9 = new ItemStack(Material.MUSIC_DISC_MALL);
//		ItemMeta var9Im = var9.getItemMeta();
//		var9Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,560");
//		var9Im.setDisplayName(ChatColor.AQUA + "문 스태프");
//		ArrayList<String> var9Lore = new ArrayList();
//		var9Lore.add(ChatColor.GRAY + "레벨 제한: 560");
//		var9Lore.add(ChatColor.GRAY + " ");
//		var9Lore.add(ChatColor.GRAY + "달의 파편을 이용해 만든 스태프");
//		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var9Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
//		var9Im.setUnbreakable(true);
//		var9Im.setLore(var9Lore);
//		var9.setItemMeta(var9Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var9);}
//		
//		ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("6000,2500,2500,2500,2000,4500,0,0,0,0,700");
//		helmetIm.setDisplayName(ChatColor.GREEN + "세계수의 축복이 담긴 헬멧");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "레벨 제한: 700");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "세계의 문에 자란 나뭇잎을 소재로 만든 헬멧");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.BLUE + "-독 데미지 20% 경감(세트 효과)");
//		helmetLore.add(ChatColor.BLUE + "-위더 데미지 20% 경감(세트 효과)");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_DYE);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("6000,2500,2500,2500,2000,4500,0,0,0,0,700");
//		chestplateIm.setDisplayName(ChatColor.GREEN + "세계수의 축복이 담긴 갑옷");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "레벨 제한: 700");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "세계의 문에 자란 나뭇잎을 소재로 만든 갑옷");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.BLUE + "-독 데미지 20% 경감(세트 효과)");
//		chestplateLore.add(ChatColor.BLUE + "-위더 데미지 20% 경감(세트 효과)");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_DYE);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("6000,2500,2500,2500,2000,4500,0,0,0,0,700");
//		leggingsIm.setDisplayName(ChatColor.GREEN + "세계수의 축복이 담긴 각반");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "레벨 제한: 700");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "세계의 문에 자란 나뭇잎을 소재로 만든 각반");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.BLUE + "-독 데미지 20% 경감(세트 효과)");
//		leggingsLore.add(ChatColor.BLUE + "-위더 데미지 20% 경감(세트 효과)");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_DYE);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("6000,2500,2500,2500,2000,4500,0,0,0,0,700");
//		bootsIm.setDisplayName(ChatColor.GREEN + "세계수의 축복이 담긴 신발");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "레벨 제한: 700");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "세계의 문에 자란 나뭇잎을 소재로 만든 신발");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.BLUE + "-독 데미지 20% 경감(세트 효과)");
//		bootsLore.add(ChatColor.BLUE + "-위더 데미지 20% 경감(세트 효과)");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_DYE);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
//		
//		ItemStack var1 = new ItemStack(Material.POLISHED_DIORITE_STAIRS);
//		ItemMeta var1Im = var1.getItemMeta();
//		var1Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,550");
//		var1Im.setDisplayName(ChatColor.AQUA + "Wither with Eraser");
//		ArrayList<String> var1Lore = new ArrayList();
//		var1Lore.add(ChatColor.GRAY + "레벨 제한: 550");
//		var1Lore.add(ChatColor.GRAY + " ");
//		var1Lore.add(ChatColor.GRAY + "위더의 힘은 의외로 고무 재질인");
//		var1Lore.add(ChatColor.GRAY + "지우개를 파괴하지 못한다고 한다.");
//		var1Lore.add(ChatColor.GRAY + " ");
//		var1Lore.add(ChatColor.BLUE + "-위더 데미지 30% 경감");
//		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var1Im.setUnbreakable(true);
//		var1Im.setLore(var1Lore);
//		var1.setItemMeta(var1Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var1);}
//		
//		ItemStack var2 = new ItemStack(Material.SMOOTH_QUARTZ_STAIRS);
//		ItemMeta var2Im = var2.getItemMeta();
//		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,550");
//		var2Im.setDisplayName(ChatColor.AQUA + "독괴룡의 용옥");
//		ArrayList<String> var2Lore = new ArrayList();
//		var2Lore.add(ChatColor.GRAY + "레벨 제한: 550");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.GRAY + "독을 사용하던 용의 용옥");
//		var2Lore.add(ChatColor.GRAY + "매우 귀한 소재라고 한다.");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.BLUE + "-독 데미지 30% 경감");
//		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var2Im.setUnbreakable(true);
//		var2Im.setLore(var2Lore);
//		var2.setItemMeta(var2Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var2);}
//		
//		ItemStack var1 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
//		ItemMeta var1Im = var1.getItemMeta();
//		var1Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,400");
//		var1Im.setDisplayName(ChatColor.AQUA + "클러스터 유닛");
//		ArrayList<String> var1Lore = new ArrayList();
//		var1Lore.add(ChatColor.GRAY + "레벨 제한: 400");
//		var1Lore.add(ChatColor.GRAY + " ");
//		var1Lore.add(ChatColor.GRAY + "활 쏘기에 능통한 전사들은 한번에");
//		var1Lore.add(ChatColor.GRAY + "세 마리의 사냥감을 잡았다고 한다.");
//		var1Lore.add(ChatColor.GRAY + " ");
//		var1Lore.add(ChatColor.BLUE + "-확산 화살 I");
//		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var1Im.setUnbreakable(true);
//		var1Im.setLore(var1Lore);
//		var1.setItemMeta(var1Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var1);}
//		
//		ItemStack var2 = new ItemStack(Material.SMOOTH_SANDSTONE_STAIRS);
//		ItemMeta var2Im = var2.getItemMeta();
//		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,450");
//		var2Im.setDisplayName(ChatColor.AQUA + "스피디 유닛");
//		ArrayList<String> var2Lore = new ArrayList();
//		var2Lore.add(ChatColor.GRAY + "레벨 제한: 450");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.GRAY + "활 쏘기에 능통한 전사들은 빠르게");
//		var2Lore.add(ChatColor.GRAY + "화살을 쏘는 것을 가장 중요하게 여겼다.");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.BLUE + "-화살 장전 속도 감소 I");
//		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var2Im.setUnbreakable(true);
//		var2Im.setLore(var2Lore);
//		var2.setItemMeta(var2Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var2);}
//		
//		ItemStack var3 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
//		ItemMeta var3Im = var3.getItemMeta();
//		var3Im.setLocalizedName("3000,0,0,0,0,0,0,0,0,0,600");
//		var3Im.setDisplayName(ChatColor.LIGHT_PURPLE + "공격의 보주");
//		ArrayList<String> var3Lore = new ArrayList();
//		var3Lore.add(ChatColor.GRAY + "레벨 제한: 600");
//		var3Lore.add(ChatColor.GRAY + " ");
//		var3Lore.add(ChatColor.GRAY + "미약하지만 무기의 힘을 가지고 있는 보주");
//		var3Lore.add(ChatColor.GRAY + " ");
//		var3Lore.add(ChatColor.BLUE + "-공격력: 3000");
//		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var3Im.setUnbreakable(true);
//		var3Im.setLore(var3Lore);
//		var3.setItemMeta(var3Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var3);}
//		
//		ItemStack var4 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
//		ItemMeta var4Im = var4.getItemMeta();
//		var4Im.setLocalizedName("0,2500,0,0,0,0,0,0,0,0,600");
//		var4Im.setDisplayName(ChatColor.LIGHT_PURPLE + "공격의 보주");
//		ArrayList<String> var4Lore = new ArrayList();
//		var4Lore.add(ChatColor.GRAY + "레벨 제한: 600");
//		var4Lore.add(ChatColor.GRAY + " ");
//		var4Lore.add(ChatColor.GRAY + "미약하지만 무기의 힘을 가지고 있는 보주");
//		var4Lore.add(ChatColor.GRAY + " ");
//		var4Lore.add(ChatColor.BLUE + "-추가 데미지(인간형): 2500");
//		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var4Im.setUnbreakable(true);
//		var4Im.setLore(var4Lore);
//		var4.setItemMeta(var4Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var4);}
//		
//		ItemStack var5 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
//		ItemMeta var5Im = var5.getItemMeta();
//		var5Im.setLocalizedName("0,0,2500,0,0,0,0,0,0,0,600");
//		var5Im.setDisplayName(ChatColor.LIGHT_PURPLE + "공격의 보주");
//		ArrayList<String> var5Lore = new ArrayList();
//		var5Lore.add(ChatColor.GRAY + "레벨 제한: 600");
//		var5Lore.add(ChatColor.GRAY + " ");
//		var5Lore.add(ChatColor.GRAY + "미약하지만 무기의 힘을 가지고 있는 보주");
//		var5Lore.add(ChatColor.GRAY + " ");
//		var5Lore.add(ChatColor.BLUE + "-추가 데미지(동물형): 2500");
//		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var5Im.setUnbreakable(true);
//		var5Im.setLore(var5Lore);
//		var5.setItemMeta(var5Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var5);}
//		
//		ItemStack var6 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
//		ItemMeta var6Im = var6.getItemMeta();
//		var6Im.setLocalizedName("0,0,0,2500,0,0,0,0,0,0,600");
//		var6Im.setDisplayName(ChatColor.LIGHT_PURPLE + "공격의 보주");
//		ArrayList<String> var6Lore = new ArrayList();
//		var6Lore.add(ChatColor.GRAY + "레벨 제한: 600");
//		var6Lore.add(ChatColor.GRAY + " ");
//		var6Lore.add(ChatColor.GRAY + "미약하지만 무기의 힘을 가지고 있는 보주");
//		var6Lore.add(ChatColor.GRAY + " ");
//		var6Lore.add(ChatColor.BLUE + "-추가 데미지(기타): 2500");
//		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var6Im.setUnbreakable(true);
//		var6Im.setLore(var6Lore);
//		var6.setItemMeta(var6Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var6);}
//		
//		ItemStack var2 = new ItemStack(Material.GRANITE_STAIRS);
//		ItemMeta var2Im = var2.getItemMeta();
//		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,10");
//		var2Im.setDisplayName(ChatColor.AQUA + "일꾼의 증표");
//		ArrayList<String> var2Lore = new ArrayList();
//		var2Lore.add(ChatColor.GRAY + "레벨 제한: 10");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.GRAY + "열심히 일한 대가를 다른 식으로");
//		var2Lore.add(ChatColor.GRAY + "받고 싶은 사람을 위한 반지");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.BLUE + "-의문의 상자 발견 확률 30% 증가");
//		var2Lore.add(ChatColor.BLUE + "-전투 경험치 1000% 감소");
//		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var2Im.setUnbreakable(true);
//		var2Im.setLore(var2Lore);
//		var2.setItemMeta(var2Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var2);}
//		
//		ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("777,0,0,0,0,777,0,0,0,0,610");
//		helmetIm.setDisplayName(ChatColor.GREEN + "럭키한 클로에의 헬멧");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "레벨 제한: 610");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "엄청한 행운이 느껴지는 헬멧");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.BLUE + "-의문의 상자 발견 확률 10% 증가");
//		helmetLore.add(ChatColor.BLUE + "-회피 확률 10% 증가(세트 효과)");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_DYE);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("777,0,0,0,0,777,0,0,0,0,610");
//		chestplateIm.setDisplayName(ChatColor.GREEN + "럭키한 클로에의 갑옷");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "레벨 제한: 610");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "엄청한 행운이 느껴지는 갑옷");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.BLUE + "-의문의 상자 발견 확률 10% 증가");
//		chestplateLore.add(ChatColor.BLUE + "-회피 확률 10% 증가(세트 효과)");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_DYE);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("777,0,0,0,0,777,0,0,0,0,610");
//		leggingsIm.setDisplayName(ChatColor.GREEN + "럭키한 클로에의 각반");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "레벨 제한: 610");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "엄청한 행운이 느껴지는 각반");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.BLUE + "-의문의 상자 발견 확률 10% 증가");
//		leggingsLore.add(ChatColor.BLUE + "-회피 확률 10% 증가(세트 효과)");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_DYE);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("777,0,0,0,0,777,0,0,0,0,610");
//		bootsIm.setDisplayName(ChatColor.GREEN + "럭키한 클로에의 신발");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "레벨 제한: 610");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "엄청한 행운이 느껴지는 신발");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.BLUE + "-의문의 상자 발견 확률 10% 증가");
//		bootsLore.add(ChatColor.BLUE + "-회피 확률 10% 증가(세트 효과)");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_DYE);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
//		
//		ItemStack helmet = new ItemStack(Material.GOLDEN_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("4000,1000,1000,1000,1500,4000,4000,1000,1000,4000,630");
//		helmetIm.setDisplayName(ChatColor.GREEN + "라의 헬멧");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "레벨 제한: 630");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "태양신 라가 현세에 머무르기 위해 내려왔을 때");
//		helmetLore.add(ChatColor.GRAY + "착용하고 있었다고 알려진 헬멧");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.BLUE + "-죽음에 이르는 피해를 입었을 때 10% 확률로 체력 50% 회복(세트 효과)");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("4000,1000,1000,1000,1500,4000,4000,1000,1000,4000,630");
//		chestplateIm.setDisplayName(ChatColor.GREEN + "라의 갑옷");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "레벨 제한: 630");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "태양신 라가 현세에 머무르기 위해 내려왔을 때");
//		chestplateLore.add(ChatColor.GRAY + "착용하고 있었다고 알려진 갑옷");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.BLUE + "-죽음에 이르는 피해를 입었을 때 10% 확률로 체력 50% 회복(세트 효과)");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.GOLDEN_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("4000,1000,1000,1000,1500,4000,4000,1000,1000,4000,630");
//		leggingsIm.setDisplayName(ChatColor.GREEN + "라의 각반");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "레벨 제한: 630");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "태양신 라가 현세에 머무르기 위해 내려왔을 때");
//		leggingsLore.add(ChatColor.GRAY + "착용하고 있었다고 알려진 각반");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.BLUE + "-죽음에 이르는 피해를 입었을 때 10% 확률로 체력 50% 회복(세트 효과)");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.GOLDEN_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("4000,1000,1000,1000,1500,4000,4000,1000,1000,4000,630");
//		bootsIm.setDisplayName(ChatColor.GREEN + "라의 신발");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "레벨 제한: 630");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "태양신 라가 현세에 머무르기 위해 내려왔을 때");
//		bootsLore.add(ChatColor.GRAY + "착용하고 있었다고 알려진 신발");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.BLUE + "-죽음에 이르는 피해를 입었을 때 10% 확률로 체력 50% 회복(세트 효과)");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
//		
//		ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("2000,0,0,0,0,1000,1000,1000,1000,3000,570");
//		helmetIm.setDisplayName(ChatColor.GREEN + "케찹");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "레벨 제한: 570");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "붉은 기운이 느껴지는 헬멧");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.BLUE + "-회피 확률 20% 증가(세트 효과)");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("0,0,0,0,2500,1000,0,0,0,10000,570");
//		chestplateIm.setDisplayName(ChatColor.GREEN + "머스타드");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "레벨 제한: 570");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "노란 기운이 느껴지는 갑옷");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.BLUE + "-회피 확률 20% 증가(세트 효과)");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("0,0,0,0,0,3000,5000,3000,3000,1000,570");
//		leggingsIm.setDisplayName(ChatColor.GREEN + "마요네즈");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "레벨 제한: 570");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "하얀 기운이 느껴지는 각반");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.BLUE + "-회피 확률 20% 증가(세트 효과)");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("3000,2000,2000,2000,0,1000,0,0,0,1000,570");
//		bootsIm.setDisplayName(ChatColor.GREEN + "발사믹");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "레벨 제한: 570");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "검붉은 기운이 느껴지는 신발");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.BLUE + "-회피 확률 20% 증가(세트 효과)");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
//		
//		ItemStack weapon = new ItemStack(Material.JUNGLE_LOG);
//		ItemMeta weaponIm = weapon.getItemMeta();
//		weaponIm.setLocalizedName("1000,3000,1000,1000,1000,0,0,0,0,0,530");
//		weaponIm.setDisplayName(ChatColor.AQUA + "악마의 뿔");
//		ArrayList<String> weaponLore = new ArrayList();
//		weaponLore.add(ChatColor.GRAY + "레벨 제한: 530");
//		weaponLore.add(ChatColor.GRAY + " ");
//		weaponLore.add(ChatColor.GRAY + "팔라딘이 악마라고 불리는 포보르에게서");
//		weaponLore.add(ChatColor.GRAY + "얻어낸 오른쪽 뿔");
//		weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		weaponIm.setUnbreakable(true);
//		weaponIm.setLore(weaponLore);
//		weapon.setItemMeta(weaponIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(weapon);}
//		
//		ItemStack helmet = new ItemStack(Material.GOLDEN_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("1500,1000,1000,2000,0,500,500,500,500,500,530");
//		helmetIm.setDisplayName(ChatColor.LIGHT_PURPLE + "케마니");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "레벨 제한: 530");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "하마베 북서쪽의 광산에서 채취한");
//		helmetLore.add(ChatColor.GRAY + "금으로 만들어진 헬멧");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("300,300,0,0,1000,1500,1000,1000,1000,1500,530");
//		chestplateIm.setDisplayName(ChatColor.LIGHT_PURPLE + "보이그");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "레벨 제한: 530");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "하마베 북서쪽의 광산에서 채취한");
//		chestplateLore.add(ChatColor.GRAY + "금으로 만들어진 갑옷");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.GOLDEN_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("0,2000,2000,2000,200,2000,1000,1000,1000,0,530");
//		leggingsIm.setDisplayName(ChatColor.LIGHT_PURPLE + "에피리튼");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "레벨 제한: 530");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "하마베 북서쪽의 광산에서 채취한");
//		leggingsLore.add(ChatColor.GRAY + "금으로 만들어진 각반");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.GOLDEN_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("0,4000,0,0,0,0,0,0,0,4000,530");
//		bootsIm.setDisplayName(ChatColor.LIGHT_PURPLE + "할리퍼");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "레벨 제한: 530");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "하마베 북서쪽의 광산에서 채취한");
//		bootsLore.add(ChatColor.GRAY + "금으로 만들어진 신발");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
		
//		ItemStack helmet = new ItemStack(Material.GOLDEN_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("0,0,0,0,0,1000,500,500,500,1000,530");
//		helmetIm.setDisplayName(ChatColor.GREEN + "데이드릭 헬멧");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "레벨 제한: 530");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "상급 데이드라들이 제식 무구로 사용하는 헬멧");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.BLUE + "-회피 확률 50% 감소(세트 효과)");
//		helmetLore.add(ChatColor.BLUE + "-흡혈 불가(세트 효과)");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("0,0,0,0,0,1000,500,500,500,1000,530");
//		chestplateIm.setDisplayName(ChatColor.GREEN + "데이드릭 갑옷");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "레벨 제한: 530");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "상급 데이드라들이 제식 무구로 사용하는 갑옷");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.BLUE + "-회피 확률 50% 감소(세트 효과)");
//		chestplateLore.add(ChatColor.BLUE + "-흡혈 불가(세트 효과)");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.GOLDEN_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("0,0,0,0,0,1000,500,500,500,1000,530");
//		leggingsIm.setDisplayName(ChatColor.GREEN + "데이드릭 각반");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "레벨 제한: 530");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "상급 데이드라들이 제식 무구로 사용하는 각반");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.BLUE + "-회피 확률 50% 감소(세트 효과)");
//		leggingsLore.add(ChatColor.BLUE + "-흡혈 불가(세트 효과)");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.GOLDEN_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("0,0,0,0,0,1000,500,500,500,1000,530");
//		bootsIm.setDisplayName(ChatColor.GREEN + "데이드릭 신발");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "레벨 제한: 530");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "상급 데이드라들이 제식 무구로 사용하는 신발");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.BLUE + "-회피 확률 50% 감소(세트 효과)");
//		bootsLore.add(ChatColor.BLUE + "-흡혈 불가(세트 효과)");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
//		
//		ItemStack var1 = new ItemStack(Material.IRON_HELMET);
//		ItemMeta var1Im = var1.getItemMeta();
//		var1Im.setLocalizedName("300,200,200,300,100,500,800,800,800,500,400");
//		var1Im.setDisplayName(ChatColor.AQUA + "호크아이");
//		ArrayList<String> var1Lore = new ArrayList();
//		var1Lore.add(ChatColor.GRAY + "레벨 제한: 400");
//		var1Lore.add(ChatColor.GRAY + " ");
//		var1Lore.add(ChatColor.GRAY + "과거 활에 특화된 전사가 사용하던 헬멧");
//		var1Lore.add(ChatColor.GRAY + " ");
//		var1Lore.add(ChatColor.BLUE + "-원거리 공격 시 독 데미지 192");
//		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var1Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
//		var1Im.setUnbreakable(true);
//		var1Im.setLore(var1Lore);
//		var1.setItemMeta(var1Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var1);}
//		
//		ItemStack var2 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
//		ItemMeta var2Im = var2.getItemMeta();
//		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,400");
//		var2Im.setDisplayName(ChatColor.AQUA + "녹슨 반지");
//		ArrayList<String> var2Lore = new ArrayList();
//		var2Lore.add(ChatColor.GRAY + "레벨 제한: 400");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.GRAY + "아라크네의 독에 잠식되어 녹슬게 된 반지");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.BLUE + "-근접 공격 시 독 데미지 192");
//		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var2Im.setUnbreakable(true);
//		var2Im.setLore(var2Lore);
//		var2.setItemMeta(var2Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var2);}
		
		
//		ItemStack helmet = new ItemStack(Material.GOLDEN_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("500,500,500,500,500,500,500,500,500,500,500");
//		helmetIm.setDisplayName(ChatColor.GREEN + "투기장의 지배자 헬멧");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "레벨 제한: 500");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "투기장을 평정한 사람만이 착용할 수 있다는 헬멧");
//		helmetLore.add(ChatColor.GRAY + "(세트 아이템)");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.BLUE + "-전투 경험치 100% 증가(세트 효과)");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("500,500,500,500,500,500,500,500,500,500,500");
//		chestplateIm.setDisplayName(ChatColor.GREEN + "투기장의 지배자 갑옷");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "레벨 제한: 500");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "투기장을 평정한 사람만이 착용할 수 있다는 갑옷");
//		chestplateLore.add(ChatColor.GRAY + "(세트 아이템)");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.BLUE + "-전투 경험치 100% 증가(세트 효과)");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.GOLDEN_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("500,500,500,500,500,500,500,500,500,500,500");
//		leggingsIm.setDisplayName(ChatColor.GREEN + "투기장의 지배자 각반");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "레벨 제한: 500");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "투기장을 평정한 사람만이 착용할 수 있다는 각반");
//		leggingsLore.add(ChatColor.GRAY + "(세트 아이템)");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.BLUE + "-전투 경험치 100% 증가(세트 효과)");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.GOLDEN_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("500,500,500,500,500,500,500,500,500,500,500");
//		bootsIm.setDisplayName(ChatColor.GREEN + "투기장의 지배자 신발");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "레벨 제한: 500");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "투기장을 평정한 사람만이 착용할 수 있다는 신발");
//		bootsLore.add(ChatColor.GRAY + "(세트 아이템)");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.BLUE + "-전투 경험치 100% 증가(세트 효과)");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
		
//		ItemStack weapon = new ItemStack(Material.MUSIC_DISC_CHIRP);
//		ItemMeta weaponIm = weapon.getItemMeta();
//		weaponIm.setLocalizedName("0,0,0,0,0,0,0,0,0,0,500");
//		weaponIm.setDisplayName(ChatColor.AQUA + "길잡이 지팡이");
//		ArrayList<String> weaponLore = new ArrayList();
//		weaponLore.add(ChatColor.GRAY + "레벨 제한: 500");
//		weaponLore.add(ChatColor.GRAY + " ");
//		weaponLore.add(ChatColor.GRAY + "하얀 빛이 매력적인 지팡이");
//		weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		weaponIm.setUnbreakable(true);
//		weaponIm.setLore(weaponLore);
//		weapon.setItemMeta(weaponIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(weapon);}
//
//		ItemStack helmet = new ItemStack(Material.GOLDEN_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("1000,0,0,0,0,1200,800,800,800,800,500");
//		helmetIm.setDisplayName(ChatColor.AQUA + "백홍원");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "레벨 제한: 500");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "웅진권의 마스터가 사용하던 헬멧");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.BLUE + "-회피 확률 5% 증가");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("0,0,0,0,0,800,0,0,0,1000,500");
//		chestplateIm.setDisplayName(ChatColor.AQUA + "목영축");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "레벨 제한: 500");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "웅진권의 마스터가 사용하던 갑옷");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.BLUE + "-전투 경험치 10% 증가");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.GOLDEN_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("3000,500,500,500,300,2000,1000,1000,1000,3000,500");
//		leggingsIm.setDisplayName(ChatColor.AQUA + "박영성");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "레벨 제한: 500");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "웅진권의 마스터가 사용하던 각반");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.BLUE + "-전투 경험치 50% 감소");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.GOLDEN_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("1000,1000,300,300,300,0,0,0,0,0,500");
//		bootsIm.setDisplayName(ChatColor.AQUA + "이천루");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "레벨 제한: 500");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "웅진권의 마스터가 사용하던 신발");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.BLUE + "-근접 공격 시 10% 확률로 10% 회복");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
		
//		ItemStack weapon = new ItemStack(Material.BIRCH_LEAVES);
//		ItemMeta weaponIm = weapon.getItemMeta();
//		weaponIm.setLocalizedName("1000,500,300,200,100,1000,0,0,500,0,550");
//		weaponIm.setDisplayName(ChatColor.AQUA + "치유의 나무");
//		ArrayList<String> weaponLore = new ArrayList();
//		weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
//		weaponLore.add(ChatColor.GRAY + " ");
//		weaponLore.add(ChatColor.GRAY + "피톤치드 향이 느껴지는 나뭇가지");
//		weaponLore.add(ChatColor.GRAY + " ");
//		weaponLore.add(ChatColor.GRAY + "-흡혈 1.5%");
//		weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		weaponIm.setUnbreakable(true);
//		weaponIm.setLore(weaponLore);
//		weapon.setItemMeta(weaponIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(weapon);}
//		
//		ItemStack helmet = new ItemStack(Material.GOLDEN_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("0,0,0,0,0,1000,1000,1000,1000,0,550");
//		helmetIm.setDisplayName(ChatColor.GREEN + "춘 <체어리 블로섬>");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "레벨 제한: 550");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "유구한 시간을 사는 뱀파이어의 헬멧");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.BLUE + "-흡혈 6%(세트 효과)");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("0,0,0,0,0,1000,1000,1000,1000,0,550");
//		chestplateIm.setDisplayName(ChatColor.GREEN + "하 <힛 웨이브>");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "레벨 제한: 550");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "유구한 시간을 사는 뱀파이어의 갑옷");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.BLUE + "-흡혈 6%(세트 효과)");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.GOLDEN_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("0,0,0,0,0,1000,1000,1000,1000,0,550");
//		leggingsIm.setDisplayName(ChatColor.GREEN + "추 <메이플>");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "레벨 제한: 550");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "유구한 시간을 사는 뱀파이어의 각반");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.BLUE + "-흡혈 6%(세트 효과)");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.GOLDEN_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("0,0,0,0,0,1000,1000,1000,1000,0,550");
//		bootsIm.setDisplayName(ChatColor.GREEN + "동 <애벌랜치>");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "레벨 제한: 550");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "유구한 시간을 사는 뱀파이어의 신발");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.BLUE + "-흡혈 6%(세트 효과)");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
		
	}
	
	@EventHandler
	public void levelUp(PlayerLevelChangeEvent event) {
		Player player = (Player) event.getPlayer();	
		player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 0.5f);
		
		// 레벨 초과
		if(player.getLevel() > 700 && player.getLevel() < 800) {
			player.setLevel(700);
			player.setExp(0);
			ItemStack bonus = new ItemStack(Material.ENDER_EYE);
			ItemMeta bonusIm = bonus.getItemMeta();
			bonusIm.addEnchant(Enchantment.LUCK, 32700, true);
			bonusIm.setDisplayName(ChatColor.DARK_RED + "에일의 인장");
			ArrayList<String> bonusLore = new ArrayList();
			bonusLore.add(ChatColor.GRAY + "에일을 구원한 자를 위한 증표");
			bonusLore.add(ChatColor.GRAY + "여러개를 모아 어딘가에서 아이템을 살 수 있을 것 같다.");
			bonusIm.setLore(bonusLore);
			bonusIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			bonusIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			bonus.setItemMeta(bonusIm);
			player.getInventory().addItem(bonus);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			player.sendMessage(ChatColor.GREEN + "[한계 레벨] 700을 돌파하였습니다.");
			player.sendMessage(ChatColor.GREEN + "경험치가 초기화되는 대신 " + ChatColor.DARK_RED + "에일의 인장" + ChatColor.GREEN + "이 주어집니다.");
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			return;
		} else if(player.getLevel() > 800 && player.getLevel() < 900) {
			player.setLevel(800);
			player.setExp(0);
			ItemStack bonus = new ItemStack(Material.ENDER_EYE);
			ItemMeta bonusIm = bonus.getItemMeta();
			bonusIm.addEnchant(Enchantment.LUCK, 32700, true);
			bonusIm.setDisplayName(ChatColor.DARK_RED + "영웅의 인장");
			ArrayList<String> bonusLore = new ArrayList();
			bonusLore.add(ChatColor.GRAY + "영웅으로서 이제 할 만큼 했다는 증표");
			bonusLore.add(ChatColor.GRAY + "여러개를 모아 어딘가에서 아이템을 살 수 있을 것 같다.");
			bonusIm.setLore(bonusLore);
			bonusIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			bonusIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			bonus.setItemMeta(bonusIm);
			player.getInventory().addItem(bonus);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			player.sendMessage(ChatColor.GREEN + "[한계 레벨] 800을 돌파하였습니다.");
			player.sendMessage(ChatColor.GREEN + "경험치가 초기화되는 대신 " + ChatColor.DARK_RED + "영웅의 인장" + ChatColor.GREEN + "이 주어집니다.");
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			return;
		} else if(player.getLevel() > 900 && player.getLevel() < 1000) {
			player.setLevel(900);
			player.setExp(0);
			ItemStack bonus = new ItemStack(Material.ENDER_EYE);
			ItemMeta bonusIm = bonus.getItemMeta();
			bonusIm.addEnchant(Enchantment.LUCK, 32700, true);
			bonusIm.setDisplayName(ChatColor.DARK_RED + "전설의 인장");
			ArrayList<String> bonusLore = new ArrayList();
			bonusLore.add(ChatColor.GRAY + "역사를 넘어 기록될 전설을 위한 증표");
			bonusLore.add(ChatColor.GRAY + "여러개를 모아 어딘가에서 아이템을 살 수 있을 것 같다.");
			bonusIm.setLore(bonusLore);
			bonusIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			bonusIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			bonus.setItemMeta(bonusIm);
			player.getInventory().addItem(bonus);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			player.sendMessage(ChatColor.GREEN + "[한계 레벨] 900을 돌파하였습니다.");
			player.sendMessage(ChatColor.GREEN + "경험치가 초기화되는 대신 " + ChatColor.DARK_RED + "전설의 인장" + ChatColor.GREEN + "이 주어집니다.");
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			return;
		} else if (player.getLevel() > 1000) {
			player.setLevel(1000);
			player.setExp(0);
			ItemStack bonus = new ItemStack(Material.ENDER_EYE);
			ItemMeta bonusIm = bonus.getItemMeta();
			bonusIm.addEnchant(Enchantment.LUCK, 32700, true);
			bonusIm.setDisplayName(ChatColor.DARK_PURPLE + "투신의 인장");
			ArrayList<String> bonusLore = new ArrayList();
			bonusLore.add(ChatColor.GRAY + "전투의 신이 수여한 증표");
			bonusLore.add(ChatColor.GRAY + "여러개를 모아 어딘가에서 아이템을 살 수 있을 것 같다.");
			bonusIm.setLore(bonusLore);
			bonusIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			bonusIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			bonus.setItemMeta(bonusIm);
			player.getInventory().addItem(bonus);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			player.sendMessage(ChatColor.GREEN + "[한계 레벨] 1000을 돌파하였습니다.");
			player.sendMessage(ChatColor.GREEN + "경험치가 초기화되는 대신 " + ChatColor.DARK_PURPLE + "투신의 인장" + ChatColor.GREEN + "이 주어집니다.");
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			return;
		}
		
		// 메인퀘스트
		if (event.getOldLevel() != 0) {
			new MainQuest(player);
		}
		
		if(event.getOldLevel() != 0) {
			if(player.getLevel() > 1) {
				//본 파이터
				if(player.getInventory().contains(Material.RED_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (본 파이터 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +8");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*8));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 본 파이터 1000레벨을 달성했습니다!");
						}	
					} 		
				}
				//기사
				if(player.getInventory().contains(Material.GREEN_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (기사 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +5");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*5));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 기사 1000레벨을 달성했습니다!");
						}	
					} 
				}
				//프리스트
				if(player.getInventory().contains(Material.LAPIS_LAZULI)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (프리스트 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +8");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*8));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 프리스트 1000레벨을 달성했습니다!");
						}	
					}
				}
				//광전사
				if(player.getInventory().contains(Material.CYAN_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (광전사 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +2");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*2));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 광전사 1000레벨을 달성했습니다!");
						}	
					}
				}
				//도박사
				if(player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (도박사 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +10");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*10));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 도박사 1000레벨을 달성했습니다!");
						}	
					}
					if(player.getLevel()==900 && event.getOldLevel() == 800) {
						if(player.getInventory().contains(Material.MAGENTA_DYE)) {
							// 생성 가능 캐릭터 파일
	    					try {
	    						File dataFolder = getDataFolder();
	    			            if(!dataFolder.exists()) {
	    			                dataFolder.mkdir();
	    			            } else {
	    			            	File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
	    			            	if(!dir.exists()) {
	    			            		try{
	    			            		    dir.mkdir(); 
	    			            		} catch(Exception e2) {
	    			            		    e2.getStackTrace();
	    			            		}
	    							}
	    							File file = new File(dir, "available_character.dat");
	    							try {
	    								FileReader filereader = new FileReader(file);
	    			    				BufferedReader bufReader = new BufferedReader(filereader);
	    			    				String[] num = bufReader.readLine().split(" ");
	    			    				num[16] = "1";
	    			    				String str = "";
	    			    				for(int j = 0 ; j < 17 ; j++) {
	    			    					str += num[j] + " ";
	    			    				}
	    			    				str += num[17];
										BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
						                fw.write(str);
						                fw.close();
						                bufReader.close();
									} catch (IOException e2) {
										e2.printStackTrace();
									}
	    						}
	    					} catch (Exception e2) {
	    						
	    					}
	    					player.sendMessage("[System] 조커 캐릭터를 생성할 수 있게 되었습니다.");
						}
					}
				}
				//데빌
				if(player.getInventory().contains(Material.GRAY_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (데빌 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +20");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*20));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 데빌 특성으로 1000레벨을 달성했습니다!");
						}	
					}
				}
				//엔젤
				if(player.getInventory().contains(Material.PINK_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (엔젤 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +30");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*30));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 엔젤 특성으로 1000레벨을 달성했습니다!");
						}	
					}
				}
				//대행자
				if(player.getInventory().contains(Material.LIME_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (대행자 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +20");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*20));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 대행자 1000레벨을 달성했습니다!");
						}	
					}
				}
				//그림자 무사
				if(player.getInventory().contains(Material.YELLOW_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (그림자 무사 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +8");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*8));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림자 무사 1000레벨을 달성했습니다!");
						}	
					}
				}
				//버서커
				if(player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (버서커 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +3");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*3));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 버서커 1000레벨을 달성했습니다!");
						}	
					}
				}
				//군인
				if(player.getInventory().contains(Material.MAGENTA_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (군인 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +15");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*15));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 군인 1000레벨을 달성했습니다!");
						}	
					}
				}
				//그림 리퍼
				if(player.getInventory().contains(Material.ORANGE_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (그림 리퍼 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +10");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*10));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 그림 리퍼 특성으로 1000레벨을 달성했습니다!");
						}	
					}
				}
				//마인
				if(player.getInventory().contains(Material.BLUE_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (마인 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +50");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*50));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 마인 특성으로 1000레벨을 달성했습니다!");
						}	
					}
				}
				//팔라딘
				if(player.getInventory().contains(Material.BROWN_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (팔라딘 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +99");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*99));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 팔라딘 특성으로 1000레벨을 달성했습니다!");
						}	
					}
				}
				//용기사
				if(player.getInventory().contains(Material.BLACK_DYE)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (용기사 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +80");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*80));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 용기사 1000레벨을 달성했습니다!");
						}	
					}
				}
				//조커
				if(player.getInventory().contains(Material.INK_SAC)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (조커 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +40");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*40));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 조커 직책으로 1000레벨을 달성했습니다!");
						}	
					}
				}
				//아처
				if(player.getInventory().contains(Material.CLAY_BALL)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (아처 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +10");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*10));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 아처 1000레벨을 달성했습니다!");
						}	
					}
					if(player.getLevel()==900 && event.getOldLevel() == 800) {
						if(player.getInventory().contains(Material.CLAY_BALL)) {
							// 생성 가능 캐릭터 파일
	    					try {
	    						File dataFolder = getDataFolder();
	    			            if(!dataFolder.exists()) {
	    			                dataFolder.mkdir();
	    			            } else {
	    			            	File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
	    			            	if(!dir.exists()) {
	    			            		try{
	    			            		    dir.mkdir(); 
	    			            		} catch(Exception e2) {
	    			            		    e2.getStackTrace();
	    			            		}
	    							}
	    							File file = new File(dir, "available_character.dat");
	    							try {
	    								FileReader filereader = new FileReader(file);
	    			    				BufferedReader bufReader = new BufferedReader(filereader);
	    			    				String[] num = bufReader.readLine().split(" ");
	    			    				num[17] = "1";
	    			    				String str = "";
	    			    				for(int j = 0 ; j < 17 ; j++) {
	    			    					str += num[j] + " ";
	    			    				}
	    			    				str += num[17];
										BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
						                fw.write(str);
						                fw.close();
						                bufReader.close();
									} catch (IOException e2) {
										e2.printStackTrace();
									}
	    						}
	    					} catch (Exception e2) {
	    						
	    					}
	    					player.sendMessage("[System] 파워레인저 캐릭터를 생성할 수 있게 되었습니다.");
						}
					}
				}
				//파워레인저
				if(player.getInventory().contains(Material.GLOWSTONE_DUST)) {
					int lvl = player.getLevel();
					player.setHealth(20);
					player.sendMessage(ChatColor.GREEN + "레벨 업 (파워레인저 Lv" + player.getLevel() + ")");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					player.sendMessage(ChatColor.WHITE + "최대체력 +60");
					player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*60));
					player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
					if(player.getLevel()==100) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "100레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==200) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "200레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==300) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "300레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==400) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "400레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==500) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "500레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==600) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "600레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==700 && event.getOldLevel() == 699) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "700레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==800 && event.getOldLevel() == 700) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "800레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==900 && event.getOldLevel() == 800) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "900레벨을 달성했습니다!");
						}	
					} else if(player.getLevel()==1000 && event.getOldLevel() == 900) {
						for (Player allPlayer : Bukkit.getOnlinePlayers()) {
						    allPlayer.sendMessage(player.getDisplayName() + "님이 " + ChatColor.RED + "파" + ChatColor.BLUE + "워" + 
						    		ChatColor.BLACK + "레" + ChatColor.YELLOW + "인" + ChatColor.GREEN +"저 " + ChatColor.WHITE + "1000레벨을 달성했습니다!");
						}	
					}
				}
			}
		}
		
		if(player.getLevel() == 1) {
			//본 파이터
			if(player.getInventory().contains(Material.RED_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (본 파이터 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +8");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*8));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//기사
			if(player.getInventory().contains(Material.GREEN_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (기사 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +5");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*5));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//프리스트
			if(player.getInventory().contains(Material.LAPIS_LAZULI)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (프리스트 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +8");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*8));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//광전사
			if(player.getInventory().contains(Material.CYAN_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (광전사 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +2");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*2));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//도박사
			if(player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (도박사 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +10");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*10));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//데빌
			if(player.getInventory().contains(Material.GRAY_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (데빌 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +20");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*20));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//엔젤
			if(player.getInventory().contains(Material.PINK_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (엔젤 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +30");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*30));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//대행자
			if(player.getInventory().contains(Material.LIME_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (대행자 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +20");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*20));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//그림자 무사
			if(player.getInventory().contains(Material.YELLOW_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (그림자 무사 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +8");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*8));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//버서커
			if(player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (버서커 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +3");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*3));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//군인
			if(player.getInventory().contains(Material.MAGENTA_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (군인 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +15");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*15));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//그림 리퍼
			if(player.getInventory().contains(Material.ORANGE_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (그림 리퍼 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +10");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*10));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//마인
			if(player.getInventory().contains(Material.BLUE_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (마인 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +50");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*50));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//팔라딘
			if(player.getInventory().contains(Material.BROWN_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (팔라딘 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +99");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*99));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//용기사
			if(player.getInventory().contains(Material.BLACK_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (용기사 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +80");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*80));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//조커
			if(player.getInventory().contains(Material.INK_SAC)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (조커 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +40");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*40));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//아처
			if(player.getInventory().contains(Material.CLAY_BALL)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (아처 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +10");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*10));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
			//파워레인저
			if(player.getInventory().contains(Material.GLOWSTONE_DUST)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "레벨 업 (파워레인저 Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "최대체력 +60");
				player.sendMessage(ChatColor.WHITE + "총 체력: " + (20 + lvl*60));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			}
		}
		
		// 키어컬 발걸음
		if(event.getNewLevel() == 100 && event.getOldLevel() == 99) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 1);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		} else if(event.getNewLevel() == 200 && event.getOldLevel() == 199) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 2);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		} else if(event.getNewLevel() == 300 && event.getOldLevel() == 299) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 3);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		} else if(event.getNewLevel() == 400 && event.getOldLevel() == 399) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 4);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		} else if(event.getNewLevel() == 500 && event.getOldLevel() == 499) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 5);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		} else if(event.getNewLevel() == 600 && event.getOldLevel() == 599) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 6);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		} else if(event.getNewLevel() == 700 && event.getOldLevel() == 699) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 7);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		} else if(event.getNewLevel() == 800 && event.getOldLevel() == 700) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 8);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		} else if(event.getNewLevel() == 900 && event.getOldLevel() == 800) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 9);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		} else if(event.getNewLevel() == 1000 && event.getOldLevel() == 900) {
			ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 10);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.GOLD + "키어컬의 발걸음");
			ArrayList<String> lore = new ArrayList();
			lore.add(ChatColor.GRAY + "섭취하면 5분간 평소보다 빠르게 몬스터가 나타난다.");
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.RED + "※주의 사항※");
			lore.add(ChatColor.RED + "1. 효과가 남아있는 동안에 섭취해도 효과는 중첩되지 않는다.");
			lore.add(ChatColor.RED + "2. 효과가 남아있는 동안에 섭취하면 다시 5분간 효과가 적용된다.");
			lore.add(ChatColor.RED + "3. 서버에서 로그아웃을 하면 효과가 바로 사라진다.");
			im.setLore(lore);
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage("레벨업 보상으로 " + ChatColor.GOLD + "키어컬의 발걸음" + ChatColor.WHITE + "을 획득하였다.");
		}
		
	}
	
	@EventHandler
	public void reSpawn(PlayerRespawnEvent event) {
		try {
			Player player = (Player) event.getPlayer();
			Location loc = player.getLocation();
			
			try {				
				if(!(new Colosseum().colosseum(player)) && !(loc.getX() <= 138 && loc.getY() <= 100 && loc.getZ() <= 1965 
						&& loc.getX() >= 118 && loc.getY() >= 50 && loc.getZ() >= 1945)) {
					if(player.getLevel() >= 700) {
						player.setExp(player.getExp() / 2);
					} else {
						player.setExp(0);
					}
				}
			} catch(Exception e10) {

			}
			
			Location wargunil = new Location(world,-1844,70,3012);
			Location forgan = new Location(world,-1573,53,2458);
			Location tiru = new Location(world, -672, 46, 1942);
			Location tutoZone = new Location(world,3886,165,3826);
			Location seedMine = new Location(world,-1159,42,1729);
			Location miyu = new Location(world,-1143,181,1461);
			Location kaiman = new Location(world,-478,55,1302);
			Location osu = new Location(world,-1370,51,976);
			Location konno = new Location(world,-2465,52,543);
			Location fuhidmeh = new Location(world,-429,98,721);
			Location sitasaidi = new Location(world,-1132,55,656);
			Location karce = new Location(world,-199,67,541);
			Location kuredrat = new Location(world,-62,55,80);
			Location beiag = new Location(world,141,87,-329);
			Location magicTower = new Location(world,221,81,725,90,0);
			Location longue = new Location(world,822,71,511,270,0);
			Location hamabe = new Location(world,973,62,40,180,0);
			Location samak = new Location(world,228,85,945);
			Location samakVil = new Location(world,-100,29,1462);
			Location kekktas = new Location(world,-741,56,-894);
			Location hardLobby = new Location(world,3686,190,3861);
			Location tiperari = new Location(world,738,107,-982,270,0);
			Location lidia = new Location(world,1031,52,-1351,270,0);
			
			
			//캐릭터 선택창 3668 47 3671 3660 39 3680
			if(loc.getX() <= 3668 && loc.getZ() <= 3680 &&
					loc.getX() >= 3660 && loc.getZ() >= 3671) {
				event.setRespawnLocation(new Location(world,3665,41,3675.5,180,0));
				return;
			}
			//포르간 항구 주변 -2000 101 2856  -1817 93 2546
			if(loc.getX() <= -1817 && loc.getZ() <= 2856 &&
					loc.getX() >= -2000 && loc.getZ() >= 2546) {
				event.setRespawnLocation(forgan);
				return;
			}
			//잊혀진 바다 신전 3815 62 3747  3599 0 3812
			if(loc.getX() <= 3815 && loc.getY() <= 62 && loc.getZ() <= 3812 &&
					loc.getX() >= 3599 && loc.getY() >= 0 && loc.getZ() >= 3747) {
				event.setRespawnLocation(wargunil);
				return;
			}
			//숲의 유적 3563 69 3787  3439 8 3681
			if(loc.getX() <= 3590 && loc.getY() <= 109 && loc.getZ() <= 3787 &&
					loc.getX() >= 3439 && loc.getY() >= 8 && loc.getZ() >= 3681) {
				event.setRespawnLocation(forgan);
				return;
			}
			//광산 3481 31 3837 3603 5 3976
			if(loc.getX() <= 3603 && loc.getY() <= 31 && loc.getZ() <= 3976 
					&& loc.getX() >= 3481 && loc.getY() >= 5 && loc.getZ() >= 3837) {
				event.setRespawnLocation(seedMine);
				return;
			}
			//타락한 요정 왕국 3658 255 3591  3823 0 3287
			if(loc.getX() <= 3823 && loc.getY() <= 255 && loc.getZ() <= 3591 
					&& loc.getX() >= 3658 && loc.getY() >= 0 && loc.getZ() >= 3287) {
				event.setRespawnLocation(seedMine);
				return;
			}
			//카루 던전 3844 223 3276  3628 2 3105
			if(loc.getX() <= 3844 && loc.getY() <= 223 && loc.getZ() <= 3276 
					&& loc.getX() >= 3628 && loc.getY() >= 2 && loc.getZ() >= 3105) {
				event.setRespawnLocation(konno);
				return;
			}
			//아덴의 저택 3300 65 3706  3431 2 3835
			if(loc.getX() <= 3431 && loc.getY() <= 65 && loc.getZ() <= 3835 
					&& loc.getX() >= 3300 && loc.getY() >= 2 && loc.getZ() >= 3706) {
				event.setRespawnLocation(tiru);
				return;
			}
			//고대의 암석 협곡 3839 255 3096  3626 0 2810 
			if(loc.getX() <= 3839 && loc.getY() <= 255 && loc.getZ() <= 3096 
					&& loc.getX() >= 3626 && loc.getY() >= 0 && loc.getZ() >= 2810) {
				event.setRespawnLocation(samak);
				return;
			}
			//콜로세움 3841 70 2736  4204 120 2178
			if(loc.getX() <= 4204 && loc.getY() <= 120 && loc.getZ() <= 2736 
					&& loc.getX() >= 3841 && loc.getY() >= 70 && loc.getZ() >= 2178) {
				event.setRespawnLocation(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
				return;
			}
			//콜로세움(원본) 118 50 1945  138 100 1965
			if(loc.getX() <= 138 && loc.getY() <= 100 && loc.getZ() <= 1965 
					&& loc.getX() >= 118 && loc.getY() >= 50 && loc.getZ() >= 1945) {
				event.setRespawnLocation(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
				return;
			}
			// 하마베 배 1792 95 2997  1768 40 2942
			if (loc.getX() <= 1792 && loc.getY() <= 95 && loc.getZ() <= 2997 
					&& loc.getX() >= 1768 && loc.getY() >= 40 && loc.getZ() >= 2942) {
				event.setRespawnLocation(hamabe);
				return;
			}
			// 라파누이 1600 255 1930  2149 0 2398
			if (loc.getX() <= 2149 && loc.getY() <= 255 && loc.getZ() <= 2398 
					&& loc.getX() >= 1600 && loc.getY() >= 0 && loc.getZ() >= 1930) {
				event.setRespawnLocation(hamabe);
				return;
			}
			// 라히무호나 -2037 40 1289  -1817 255 1525
			if (loc.getX() <= -1817 && loc.getY() <= 255 && loc.getZ() <= 1525 
					&& loc.getX() >= -2037 && loc.getY() >= 40 && loc.getZ() >= 1289) {
				event.setRespawnLocation(hamabe);
				return;
			}
			// 슬라임 던전 3829 87 2797  3632 10 2468
			if (loc.getX() <= 3829 && loc.getY() <= 160 && loc.getZ() <= 2797 
					&& loc.getX() >= 3632 && loc.getY() >= 10 && loc.getZ() >= 2468) {
				event.setRespawnLocation(new Location(player.getWorld(), -1465, 10, 1980));
				return;
			}
			// 슬라임 던전2 -1479 0 1972  -1440 35 2005
			if (loc.getX() <= -1440 && loc.getY() <= 35 && loc.getZ() <= 2005 
					&& loc.getX() >= -1479 && loc.getY() >= 0 && loc.getZ() >= 1972) {
				event.setRespawnLocation(new Location(player.getWorld(), -1465, 10, 1980));
				return;
			}
			// 피르볼그 제사장
			if (loc.getX() <= 3703 && loc.getY() <= 120 && loc.getZ() <= 2758 
					&& loc.getX() >= 3679 && loc.getY() >= 99 && loc.getZ() >= 2732) {
				event.setRespawnLocation(samak);
				return;
			}
			// 시오카나 385 255 -669  648 0 -438
			if (loc.getX() <= 648 && loc.getY() <= 255 && loc.getZ() <= -438 
					&& loc.getX() >= 385 && loc.getY() >= 0 && loc.getZ() >= -669) {
				event.setRespawnLocation(hamabe);
				return;
			}
			// 스켈리그 -200 255 -515  -1200 0 -1617
			if (loc.getX() <= -200 && loc.getY() <= 255 && loc.getZ() <= -515 
					&& loc.getX() >= -1200 && loc.getY() >= 0 && loc.getZ() >= -1617) {
				event.setRespawnLocation(kekktas);
				return;
			}
			// 유산 신전 3747 150 2433  3678 80 2308 
			if (loc.getX() <= 3747 && loc.getY() <= 150 && loc.getZ() <= 2433 
					&& loc.getX() >= 3678 && loc.getY() >= 80 && loc.getZ() >= 2308) {
				event.setRespawnLocation(kekktas);
				return;
			}
			// 하드던전 3841 255 3836  3500 0 4263
			if (loc.getX() <= 3841 && loc.getY() <= 255 && loc.getZ() <= 4263 
					&& loc.getX() >= 3500 && loc.getY() >= 0 && loc.getZ() >= 3836) {
				event.setRespawnLocation(hardLobby);
				return;
			}

			int length1 = (int)(Math.pow(loc.getX()-wargunil.getX(), 2) + Math.pow(loc.getY()-wargunil.getY(), 2) + Math.pow(loc.getZ()-wargunil.getZ(), 2));
			int length2 = (int)(Math.pow(loc.getX()-forgan.getX(), 2) + Math.pow(loc.getY()-forgan.getY(), 2) + Math.pow(loc.getZ()-forgan.getZ(), 2));
			int length3 = (int)(Math.pow(loc.getX()-tiru.getX(), 2) + Math.pow(loc.getY()-tiru.getY(), 2) + Math.pow(loc.getZ()-tiru.getZ(), 2));
			int length4 = (int)(Math.pow(loc.getX()-tutoZone.getX(), 2) + Math.pow(loc.getY()-tutoZone.getY(), 2) + Math.pow(loc.getZ()-tutoZone.getZ(), 2));
			int length5 = (int)(Math.pow(loc.getX()-seedMine.getX(), 2) + Math.pow(loc.getY()-seedMine.getY(), 2) + Math.pow(loc.getZ()-seedMine.getZ(), 2));
			int length6 = (int)(Math.pow(loc.getX()-miyu.getX(), 2) + Math.pow(loc.getY()-miyu.getY(), 2) + Math.pow(loc.getZ()-miyu.getZ(), 2));
			int length7 = (int)(Math.pow(loc.getX()-kaiman.getX(), 2) + Math.pow(loc.getY()-kaiman.getY(), 2) + Math.pow(loc.getZ()-kaiman.getZ(), 2));
			int length8 = (int)(Math.pow(loc.getX()-osu.getX(), 2) + Math.pow(loc.getY()-osu.getY(), 2) + Math.pow(loc.getZ()-osu.getZ(), 2));
			int length9 = (int)(Math.pow(loc.getX()-konno.getX(), 2) + Math.pow(loc.getY()-konno.getY(), 2) + Math.pow(loc.getZ()-konno.getZ(), 2));
			int length10 = (int)(Math.pow(loc.getX()-fuhidmeh.getX(), 2) + Math.pow(loc.getY()-fuhidmeh.getY(), 2) + Math.pow(loc.getZ()-fuhidmeh.getZ(), 2));
			int length11 = (int)(Math.pow(loc.getX()-sitasaidi.getX(), 2) + Math.pow(loc.getY()-sitasaidi.getY(), 2) + Math.pow(loc.getZ()-sitasaidi.getZ(), 2));
			int length12 = (int)(Math.pow(loc.getX()-karce.getX(), 2) + Math.pow(loc.getY()-karce.getY(), 2) + Math.pow(loc.getZ()-karce.getZ(), 2));
			int length13 = (int)(Math.pow(loc.getX()-kuredrat.getX(), 2) + Math.pow(loc.getY()-kuredrat.getY(), 2) + Math.pow(loc.getZ()-kuredrat.getZ(), 2));
			int length14 = (int)(Math.pow(loc.getX()-beiag.getX(), 2) + Math.pow(loc.getY()-beiag.getY(), 2) + Math.pow(loc.getZ()-beiag.getZ(), 2));
			int length15 = (int)(Math.pow(loc.getX()-magicTower.getX(), 2) + Math.pow(loc.getY()-magicTower.getY(), 2) + Math.pow(loc.getZ()-magicTower.getZ(), 2));
			int length16 = (int)(Math.pow(loc.getX()-longue.getX(), 2) + Math.pow(loc.getY()-longue.getY(), 2) + Math.pow(loc.getZ()-longue.getZ(), 2));
			int length17 = (int)(Math.pow(loc.getX()-hamabe.getX(), 2) + Math.pow(loc.getY()-hamabe.getY(), 2) + Math.pow(loc.getZ()-hamabe.getZ(), 2));
			int length18 = (int)(Math.pow(loc.getX()-samak.getX(), 2) + Math.pow(loc.getY()-samak.getY(), 2) + Math.pow(loc.getZ()-samak.getZ(), 2));
			int length19 = (int)(Math.pow(loc.getX()-samakVil.getX(), 2) + Math.pow(loc.getY()-samakVil.getY(), 2) + Math.pow(loc.getZ()-samakVil.getZ(), 2));
			int length20 = (int)(Math.pow(loc.getX()-tiperari.getX(), 2) + Math.pow(loc.getY()-tiperari.getY(), 2) + Math.pow(loc.getZ()-tiperari.getZ(), 2));
			int length21 = (int)(Math.pow(loc.getX()-lidia.getX(), 2) + Math.pow(loc.getY()-lidia.getY(), 2) + Math.pow(loc.getZ()-lidia.getZ(), 2));
			ArrayList<Integer> ary = new ArrayList<>();
			ary.add(length1);
			ary.add(length2);
			ary.add(length3);
			ary.add(length4);
			ary.add(length5);
			ary.add(length6);
			ary.add(length7);
			ary.add(length8);	
			ary.add(length9);
			ary.add(length10);
			ary.add(length11);
			ary.add(length12);
			ary.add(length13);
			ary.add(length14);
			ary.add(length15);
			ary.add(length16);
			ary.add(length17);
			ary.add(length18);
			ary.add(length19);
			ary.add(length20);
			ary.add(length21);
			Collections.sort(ary);
			if(ary.get(0) == length1) {
				event.setRespawnLocation(wargunil);
			} else if(ary.get(0) == length2) {
				event.setRespawnLocation(forgan);
			} else if(ary.get(0) == length3) {
				event.setRespawnLocation(tiru);
			} else if(ary.get(0) == length4) {
				event.setRespawnLocation(tutoZone);
			} else if(ary.get(0) == length5) {
				event.setRespawnLocation(seedMine);
			} else if(ary.get(0) == length6) {
				event.setRespawnLocation(miyu);
			} else if(ary.get(0) == length7) {
				event.setRespawnLocation(kaiman);
			} else if(ary.get(0) == length8) {
				event.setRespawnLocation(osu);
			} else if(ary.get(0) == length9) {
				if(player.getLevel() > 200) {
					event.setRespawnLocation(konno);
				} else {
					event.setRespawnLocation(osu);
				}
			} else if(ary.get(0) == length10) {
				event.setRespawnLocation(fuhidmeh);
			} else if(ary.get(0) == length11) {
				event.setRespawnLocation(sitasaidi);
			} else if(ary.get(0) == length12) {
				event.setRespawnLocation(karce);
			} else if(ary.get(0) == length13) {
				event.setRespawnLocation(kuredrat);
			} else if(ary.get(0) == length14) {
				event.setRespawnLocation(beiag);
			} else if(ary.get(0) == length15) {
				event.setRespawnLocation(magicTower);
			} else if(ary.get(0) == length16) {
				event.setRespawnLocation(longue);
			} else if(ary.get(0) == length17) {
				event.setRespawnLocation(hamabe);
			} else if(ary.get(0) == length18) {
				event.setRespawnLocation(samak);
			} else if(ary.get(0) == length19) {
				if(player.getLevel() > 440) {
					event.setRespawnLocation(samakVil);
				} else {
					event.setRespawnLocation(kaiman);
				}
			} else if(ary.get(0) == length20) {
				if(player.getLevel() > 620) {
					event.setRespawnLocation(tiperari);
				} else {
					event.setRespawnLocation(hamabe);
				}
			} else if(ary.get(0) == length21) {
				if(player.getLevel() > 660) {
					event.setRespawnLocation(lidia);
				} else if(player.getLevel() > 620) {
					event.setRespawnLocation(tiperari);
				} else {
					event.setRespawnLocation(hamabe);
				}
			}		
			player.setNoDamageTicks(200);
		} catch(Exception e11) {

		}
	}
	
	@EventHandler
	public void die(PlayerDeathEvent event) {
		event.setDeathMessage(null);
		// 퀘스트 관련
		try {
			Player player = (Player) event.getEntity();
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약3===")) {
				int qNum = cb.getNum(player);
				cb.eq2_2(player, qNum + 1);
			} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===이것이 포보르 왕?===")) {
				Location loc = player.getLocation();
				if (loc.getX() <= 49 && loc.getY() <= 61 && loc.getZ() <= 696 
						&& loc.getX() >= 16 && loc.getY() >= 51 && loc.getZ() >= 654) {
					int qNum = cb.getNum(player);
					cb.mq36(player, qNum + 1);
				}
			}
		} catch(Exception e) {
			
		}
		// 보스바 관련
		try {
			Player player = (Player) event.getEntity();
			new BossHealth().removePlayer(player);
		} catch(Exception e) {
			
		}
		// 안건드려도 됨
		try {
			Player player = (Player) event.getEntity();
			Cmd8Party cp = new Cmd8Party();
			ArrayList<Player> party = cp.getPlayerParty(player);
			if(party.size() != 0) {
				for(Player p : party) {
					if(p != player) {
						p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "" + player.getDisplayName() + " is dead");
					}
				}
			}
		} catch(Exception e) {
			
		}
		try {
			Player player = (Player)event.getEntity();
			PacketPlayOutTitle title = new PacketPlayOutTitle(EnumTitleAction.TITLE, 
					ChatSerializer.a("{\"text\":\"§CYOU DIED\"}"));
			Object handle = player.getClass().getMethod("getHandle").invoke(player);
	        Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
	        playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, title);
		} catch(Exception e) {
			
		}
		// 패널티
		try { 
			Player player = (Player)event.getEntity();
			if(!(new Colosseum().colosseum(player))) {
				if(player.getInventory().contains(Material.EMERALD)) {
					for (ItemStack is : player.getInventory().getContents()) {
						if(is == null) continue;
					    if (is.getType() == Material.EMERALD) {			
					         is.setAmount(is.getAmount()/3 + 1);
					    }
					}
				}
				if(player.getInventory().contains(Material.EMERALD_BLOCK)) {
					for (ItemStack is : player.getInventory().getContents()) {
						if(is == null) continue;
					    if (is.getType() == Material.EMERALD_BLOCK) {			
					         is.setAmount(is.getAmount()/3 + 1);
					    }
					}
				}
				if(player.getInventory().contains(Material.SCUTE)) {
					for (ItemStack is : player.getInventory().getContents()) {
						if(is == null) continue;
					    if (is.getType() == Material.SCUTE) {			
					         is.setAmount(is.getAmount()/3 + 1);
					    }
					}
				}
				if(player.getInventory().contains(Material.RABBIT_HIDE)) {
					for (ItemStack is : player.getInventory().getContents()) {
						if(is == null) continue;
					    if (is.getType() == Material.RABBIT_HIDE) {			
					         is.setAmount(is.getAmount()/3 + 1);
					    }
					}
				}
				if(player.getInventory().contains(Material.RABBIT_FOOT)) {
					for (ItemStack is : player.getInventory().getContents()) {
						if(is == null) continue;
					    if (is.getType() == Material.RABBIT_FOOT) {			
					         is.setAmount(is.getAmount()/3 + 1);
					    }
					}
				}

				if(player.getInventory().contains(Material.COAL_ORE)) {
					for (ItemStack is : player.getInventory().getContents()) {
						if(is == null) continue;
					    if (is.getType() == Material.COAL_ORE) {			
					         is.setAmount(is.getAmount()/3);
					    }
					}
				}
				if(player.getInventory().contains(Material.IRON_ORE)) {
					for (ItemStack is : player.getInventory().getContents()) {
						if(is == null) continue;
					    if (is.getType() == Material.IRON_ORE) {			
					         is.setAmount(is.getAmount()/3);
					    }
					}
				}
				if(player.getInventory().contains(Material.GOLD_ORE)) {
					for (ItemStack is : player.getInventory().getContents()) {
						if(is == null) continue;
					    if (is.getType() == Material.GOLD_ORE) {			
					         is.setAmount(is.getAmount()/3);
					    }
					}
				}
				if(player.getInventory().contains(Material.DIAMOND_ORE)) {
					for (ItemStack is : player.getInventory().getContents()) {
						if(is == null) continue;
					    if (is.getType() == Material.DIAMOND_ORE) {			
					         is.setAmount(is.getAmount()/3);
					    }
					}
				}
			}
		} catch(Exception e7) {
			System.err.println(e7);
		}
		
	}
	
	@EventHandler
	public void consumeItem(PlayerItemConsumeEvent event) {
		Player player = (Player)event.getPlayer();
		try {
			System.out.println(player.getDisplayName() + "이/가 " + player.getInventory().getItemInMainHand().getItemMeta().getDisplayName() 
					+ ChatColor.WHITE + "을/를 섭취하였다.");
		} catch(Exception e) {
			
		}
		try {
			//HP포션
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 I")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 10.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 II")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 30.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 III")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 100.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 IV")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 200.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 V")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 300.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 VI")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 500.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 VII")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 800.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 VIII")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 1100.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 IX")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 1300.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 X")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 1600.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 XI")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 2000.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 XII")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 2500.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 XIII")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 3000.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 XIV")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 3500.0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 XV")) {
				PotionRatio pr = new PotionRatio();
				pr.calculation(player, 4000.0);
			}
			//특이 포션
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "엘릭서")) {
				for(PotionEffect effect : player.getActivePotionEffects ()){
			        player.removePotionEffect(effect.getType());
			    }
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "냉기의 포션")) {
				player.setFireTicks(0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "바람의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,2400,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "바람의 포션 II")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,2400,1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "강화된 바람의 포션 II")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,6000,1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "바위의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,1800,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "바위의 포션 II")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,1800,1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,1800,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "바위의 포션 III")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,1800,1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "강화된 바위의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,3600,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "강화된 바위의 포션 II")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,3600,1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,3600,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "강화된 바위의 포션 III")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,3600,1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "근육의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,1800,10,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "근육의 포션 III")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,1800,2000,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "근육의 포션 IV")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,1800,8000,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "강화된 근육의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,3600,10,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "강화된 근육의 포션 II")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,3600,500,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "강화된 근육의 포션 IV")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,3600,8000,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "도약의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,1200,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "코코넛 음료")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 6, 0,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "워그닐 특제 와인")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,1800,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,1800,2,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "해골물")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,1200,2,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,1200,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,1200,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "검은 인간의 피")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER,600,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "약재 우린 물")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 600, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "거북이 우린 물")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "눈에 좋은 포션")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1200, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "사랑의 묘약")) {
				try {
					Cmd8Party cp = new Cmd8Party();
					ArrayList<Player> party = cp.getPlayerParty(player);
					if(party.size() != 0) {
						Player p = party.get(rnd.nextInt(party.size()));
						if(p.getLevel() <= player.getLevel()) {
							player.teleport(p.getLocation());
							try {
								player.getInventory().remove(Material.TNT);
							} catch(Exception e) {
								
							}
						}
					}
				} catch(Exception e) {
					
				}
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "축복의 포션")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 6000, 0,true,true));
			}
			//음식
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "대구구이")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 2, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "맛있는 치킨")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 50, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "구운 치킨")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 80, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "파티용 칠면조")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 80, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "포르간식 돼지구이")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 140, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "좋은 장비로 구운 닭고기")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 2400, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "미푀르유식 닭요리")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "조리한 돼지고기")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 2400, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "특제양념 돼지구이")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 100, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "카이만식 양요리")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20, 10,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "고급진 카이만식 양요리")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "훈제 연어")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 30, 10,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "코리아 김")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 100, 5,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 2,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "갓잡은 생선")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 0,true,true));
				player.sendMessage(ChatColor.RED + "물고기에 기생충이 있었던 것 같다.");
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "바다 위에서 구운 생선구이")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 0,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "강한 불에 익힌 스테이크")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 100, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "수비드 스테이크")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "베아그 돼지 요리")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 150, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "베아그식 특제 돼지 구이")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 300, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "이것이 스테이크")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "티본 스테이크")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 300, 2,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "하마베산 생선구이")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20, 10,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "하마베산 생선찜")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 0,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20, 10,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "허니 콤보")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 2,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20, 10,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "레드 콤보")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 3,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20, 10,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "유목민족의 양요리")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 3,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "징기스탄")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 3,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 300, 4,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "탐욕의 사과")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1200, 4,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 5,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "원주민 전통식 구이")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 2,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 3,true,true));
			}
		} catch(Exception e) {
			
		}
		
		//유료 아이템
		try {
			ProgressBar pb = new ProgressBar();
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "핫타임(전투 경험치 2배)")) {
				if(pb.bar1isRun()) {
					ItemStack item = event.getItem();
					item.setAmount(1);
					player.getInventory().addItem(item);
					player.sendMessage(ChatColor.RED + "이미 적용중인 효과입니다.");
				} else {
					new ExpSystemByMob().goldenTime(player);
				}
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "핫타임(강화 확률 증가)")) {
				if(pb.bar2isRun()) {
					ItemStack item = event.getItem();
					item.setAmount(1);
					player.getInventory().addItem(item);
					player.sendMessage(ChatColor.RED + "이미 적용중인 효과입니다.");
				} else {
					new Reinforcement().goldenTime(player);
				}
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "핫타임(의문의 상자 발견 확률 2배)")) {
				if(pb.bar4isRun()) {
					ItemStack item = event.getItem();
					item.setAmount(1);
					player.getInventory().addItem(item);
					player.sendMessage(ChatColor.RED + "이미 적용중인 효과입니다.");
				} else {
					new MobDeath().goldenTime(player);
				}
			}
		} catch(Exception e) {
			
		}
		
		//제작템
		try {
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().substring(0, 2).equals("§3")) {
				int limit = 0;
				try {
					limit = Integer.parseInt(player.getInventory().getItemInMainHand().getItemMeta().getLore().get(0).split(": ")[1]);
				} catch(Exception e) {
					
				}
				if(player.getLevel() >= limit) {
					if(player.getInventory().getItemInMainHand().getType() == Material.POTION) {
						String buff = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName();
						String[] buffList = buff.split(",");
						PotionRatio pr = new PotionRatio();
						pr.calculation(player, Double.parseDouble(buffList[0]));
						int dur = Integer.parseInt(buffList[10]);
						if(Integer.parseInt(buffList[1]) >= 0) {
							player.removePotionEffect(PotionEffectType.ABSORPTION);
							player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION,dur,Integer.parseInt(buffList[1]),true,true));
						}
						if(Integer.parseInt(buffList[2]) >= 0) {
							player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,dur,Integer.parseInt(buffList[2]),true,true));
						}
						if(Integer.parseInt(buffList[3]) >= 0) {
							player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,dur,Integer.parseInt(buffList[3]),true,true));
						}
						if(Integer.parseInt(buffList[4]) >= 0) {
							player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,dur,Integer.parseInt(buffList[4]),true,true));
						}
						if(Integer.parseInt(buffList[5]) >= 0) {
							player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,dur,Integer.parseInt(buffList[5]),true,true));
						}
						if(Integer.parseInt(buffList[6]) >= 0) {
							player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,dur,Integer.parseInt(buffList[6]),true,true));
						}
						if(Integer.parseInt(buffList[7]) >= 0) {
							player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,dur,Integer.parseInt(buffList[7]),true,true));
						}
						if(Integer.parseInt(buffList[8]) >= 0) {
							player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER,dur,Integer.parseInt(buffList[8]),true,true));
						}
						if(Integer.parseInt(buffList[9]) >= 0) {
							player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,dur,Integer.parseInt(buffList[9]),true,true));
						}
					} else {
						try {
							String buff = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName();
							String[] buffList = buff.split(",");
							PotionRatio pr = new PotionRatio();
							
							Cmd8Party cp = new Cmd8Party();
							ArrayList<Player> party = cp.getPlayerParty(player);
							if(party.size() != 0) {
								for(Player pp : party) {
									List<Entity> near = player.getNearbyEntities(6, 4, 6);
									near.add(player);
									if(near.contains(pp)) {
										if(pp.getLevel() >= limit) {
											pr.calculation(pp, Double.parseDouble(buffList[0]));
											int dur = Integer.parseInt(buffList[10]);
											if(Integer.parseInt(buffList[1]) >= 0) {
												pp.removePotionEffect(PotionEffectType.ABSORPTION);
												pp.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION,dur,Integer.parseInt(buffList[1]),true,true));
											}
											if(Integer.parseInt(buffList[2]) >= 0) {
												pp.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,dur,Integer.parseInt(buffList[2]),true,true));
											}
											if(Integer.parseInt(buffList[3]) >= 0) {
												pp.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,dur,Integer.parseInt(buffList[3]),true,true));
											}
											if(Integer.parseInt(buffList[4]) >= 0) {
												pp.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,dur,Integer.parseInt(buffList[4]),true,true));
											}
											if(Integer.parseInt(buffList[5]) >= 0) {
												pp.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,dur,Integer.parseInt(buffList[5]),true,true));
											}
											if(Integer.parseInt(buffList[6]) >= 0) {
												pp.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,dur,Integer.parseInt(buffList[6]),true,true));
											}
											if(Integer.parseInt(buffList[7]) >= 0) {
												pp.addPotionEffect(new PotionEffect(PotionEffectType.POISON,dur,Integer.parseInt(buffList[7]),true,true));
											}
											if(Integer.parseInt(buffList[8]) >= 0) {
												pp.addPotionEffect(new PotionEffect(PotionEffectType.WITHER,dur,Integer.parseInt(buffList[8]),true,true));
											}
											if(Integer.parseInt(buffList[9]) >= 0) {
												pp.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,dur,Integer.parseInt(buffList[9]),true,true));
											}
											pp.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님이 음식을 공유합니다. " + ChatColor.AQUA 
															+ "[음식 이름: " + player.getInventory().getItemInHand().getItemMeta().getDisplayName() + ChatColor.AQUA + "]");
										} else {
											pp.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님이 음식을 공유합니다. " + ChatColor.AQUA 
													+ "[음식 이름: " + player.getInventory().getItemInHand().getItemMeta().getDisplayName() + ChatColor.AQUA + "]");
											pp.sendMessage(ChatColor.RED + "레벨이 부족하여 음식을 먹을 수 없습니다.");
										}
									}
								}
							} else {
								pr.calculation(player, Double.parseDouble(buffList[0]));
								int dur = Integer.parseInt(buffList[10]);
								if(Integer.parseInt(buffList[1]) >= 0) {
									player.removePotionEffect(PotionEffectType.ABSORPTION);
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION,dur,Integer.parseInt(buffList[1]),true,true));
								}
								if(Integer.parseInt(buffList[2]) >= 0) {
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,dur,Integer.parseInt(buffList[2]),true,true));
								}
								if(Integer.parseInt(buffList[3]) >= 0) {
									player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,dur,Integer.parseInt(buffList[3]),true,true));
								}
								if(Integer.parseInt(buffList[4]) >= 0) {
									player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,dur,Integer.parseInt(buffList[4]),true,true));
								}
								if(Integer.parseInt(buffList[5]) >= 0) {
									player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,dur,Integer.parseInt(buffList[5]),true,true));
								}
								if(Integer.parseInt(buffList[6]) >= 0) {
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,dur,Integer.parseInt(buffList[6]),true,true));
								}
								if(Integer.parseInt(buffList[7]) >= 0) {
									player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,dur,Integer.parseInt(buffList[7]),true,true));
								}
								if(Integer.parseInt(buffList[8]) >= 0) {
									player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER,dur,Integer.parseInt(buffList[8]),true,true));
								}
								if(Integer.parseInt(buffList[9]) >= 0) {
									player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,dur,Integer.parseInt(buffList[9]),true,true));
								}
								player.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님이 음식을 공유합니다. " + ChatColor.AQUA 
										+ "[음식 이름: " + player.getInventory().getItemInHand().getItemMeta().getDisplayName() + ChatColor.AQUA + "]");
							}
						} catch(Exception e) {
							
						}
					}
				} else {
					player.sendMessage(ChatColor.RED + "레벨이 부족하여 사용할 수 없습니다.");
					event.setCancelled(true);
					return;
				}
			}
		} catch(Exception e) {
			
		}
		
		try {
			if(player.getInventory().getItemInMainHand().getType() == Material.POTION) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.MUSHROOM_STEW) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.RABBIT_STEW) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.BEETROOT_SOUP) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.SUSPICIOUS_STEW) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.HONEY_BOTTLE) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.ROTTEN_FLESH) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.GOLDEN_APPLE) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void spawnEntity(CreatureSpawnEvent event) {
		try {
			Entity entity = event.getEntity();
			if(entity instanceof Drowned) {
				entity.remove();
			}
			if(!(entity.getType() == EntityType.HORSE || entity.getType() == EntityType.PIG || entity.getType() == EntityType.SHEEP
					|| entity.getType() == EntityType.COW || entity.getType() == EntityType.CHICKEN)) {
				((LivingEntity)entity).addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 2, true, false, false));
			}
			if((entity.getType() != EntityType.HORSE) && (entity.getType() != EntityType.ARMOR_STAND)) {
				SpawnMob sm = new SpawnMob();
				SpawnAnimal sa = new SpawnAnimal();
				if(!sm.spawn(entity)) {			
					event.setCancelled(true);
				}
				if(!sa.spawn(entity)) {			
					event.setCancelled(true);
				}			
			}
			try {
				if(entity.getType() == EntityType.ZOMBIE || entity.getType() == EntityType.SKELETON || entity.getType() == EntityType.WITHER_SKELETON
						|| entity.getType() == EntityType.WITCH || entity.getType() == EntityType.VEX) {
					if(entity.getCustomName() == null) {
						entity.remove();
					}
				}
			} catch(Exception e) {
				
			}
		} catch(Exception e3) {
			
		}
	}
	
	@EventHandler
	public void arrowShootEvent(EntityShootBowEvent event) {
		try {
			Entity entity = event.getProjectile();
			if(entity.getType() == EntityType.ARROW) {
				new ShootArrow(entity);
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void dropItem(PlayerDropItemEvent event) {
		Player player = (Player) event.getPlayer();
		Item itemArg = event.getItemDrop();
		try {
			System.out.println(player.getDisplayName() + "이/가 " + itemArg.getItemStack().getItemMeta().getDisplayName() 
					+ "(" + itemArg.getItemStack().getItemMeta().getLocalizedName() + ")" + ChatColor.WHITE + "을/를 드랍하였다.");
		} catch(Exception e) {
			
		}
		
		try {
			if(itemArg.getItemStack().hasItemMeta()) {
				if(itemArg.getItemStack().getItemMeta().hasCustomModelData()) {
					if(itemArg.getItemStack().getItemMeta().getCustomModelData() == 1) {
						event.setCancelled(true);
						return;
					}
				}
			}
		} catch(Exception e) {
			
		}
		
		TPScroll tp = new TPScroll();
		VilTPScroll vilTP = new VilTPScroll();
		INNTicket ticket = new INNTicket();
		BossTicket boss = new BossTicket();
		ReinforcementScroll reinScroll = new ReinforcementScroll();
		MetalwareToolScroll metalwareScroll = new MetalwareToolScroll();
		DefineScroll define = new DefineScroll();
		DefineAllScroll defineAll = new DefineAllScroll();
		QuestScroll qs = new QuestScroll();
		AnotherScroll as = new AnotherScroll();
		ItemDestroyScroll ids = new ItemDestroyScroll();
		CraftingScroll cs = new CraftingScroll();
		CraftingPotionScroll cps = new CraftingPotionScroll();
		CraftingFoodScroll cfs = new CraftingFoodScroll();
		RerollScroll rs = new RerollScroll();
		
		try {
			//마을 스크롤
			vilTP.vilTP(player, itemArg);
			//숙박티켓
			ticket.sleep(player, itemArg);
			//이동
			tp.teleport(player, itemArg);
			//보스소환
			boss.summon(player, itemArg);
			//강화
			reinScroll.openInv(player, itemArg);
			//세공
			metalwareScroll.openInv(player, itemArg);
			//감정
			define.effect(player, itemArg);
			//전체감정
			defineAll.effect(player, itemArg);
			//퀘스트 스크롤
			qs.quest(player, itemArg);
			//기타 스크롤
			as.effect(player, itemArg);
			//아이템 파기 스크롤
			ids.openInv(player, itemArg);
			//장비 제작 스크롤
			cs.openInv(player, itemArg);
			//포션 제작 스크롤
			cps.openInv(player, itemArg);
			//음식 제작 스크롤
			cfs.openInv(player, itemArg);
			//리롤 스크롤
			rs.openInv(player, itemArg);
			//캐릭터 삭제 스크롤
			new RemoveCharacter(player, itemArg, getDataFolder());
		} catch(Exception e) {
			
		}
		
		//직업
		if (event.getItemDrop().getItemStack().getType() == Material.NETHER_STAR) {
			event.setCancelled(true);
			return;
		}

		//논드랍 아이템
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "본 파이터의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "기사의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "프리스트의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "광전사의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "도박사의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "데빌의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "엔젤의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "대행자의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "그림자 무사의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "버서커의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "군인의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "그림 리퍼의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "마인의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "태초의 인간의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "용기사의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "조커의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "파워레인저의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "아처의 증표")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "마나")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "마나없음")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "고대 드래곤의 뼈")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.WOODEN_HOE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.STONE_HOE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.IRON_HOE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.GOLDEN_HOE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DIAMOND_HOE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.NETHERITE_HOE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.WOODEN_PICKAXE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.STONE_PICKAXE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.IRON_PICKAXE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.GOLDEN_PICKAXE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DIAMOND_PICKAXE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.NETHERITE_PICKAXE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.WOODEN_SHOVEL) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.STONE_SHOVEL) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.IRON_SHOVEL) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.GOLDEN_SHOVEL) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DIAMOND_SHOVEL) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.NETHERITE_SHOVEL) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.PLAYER_HEAD) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.POLISHED_GRANITE_STAIRS) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.SMOOTH_RED_SANDSTONE_STAIRS) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.MOSSY_STONE_BRICK_STAIRS) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.POLISHED_DIORITE_STAIRS) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.MOSSY_COBBLESTONE_STAIRS) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.END_STONE_BRICK_STAIRS) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.SMOOTH_SANDSTONE_STAIRS) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.SMOOTH_QUARTZ_STAIRS) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.GRANITE_STAIRS) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.POLISHED_BLACKSTONE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DIAMOND_AXE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.SADDLE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DEAD_BRAIN_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DEAD_BUBBLE_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DEAD_FIRE_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DEAD_HORN_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DEAD_TUBE_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.BRAIN_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.HORN_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.TUBE_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.BUBBLE_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.FIRE_CORAL_BLOCK) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.ENDER_EYE) {
			player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
			event.setCancelled(true);
		}
		
		try {
			for(String str : event.getItemDrop().getItemStack().getItemMeta().getLore()) {
				try {
					if(str.substring(0, 5).equals("§8내구도")) {
						player.sendMessage(ChatColor.RED + "드랍 불가 아이템입니다.");
						event.setCancelled(true);
					}
				} catch(Exception e1) {
					
				}
			}
		} catch(Exception e) {
			
		}
		
	}
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent event){
		try {
			if(event.getEntity() instanceof LivingEntity) {
				((LivingEntity) event.getEntity()).setArrowsInBody(0);
			}
		} catch(Exception e) {
			
		}
		try {
			if(event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				if(!(event.getEntity() instanceof Player)) {
					if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "신의 검")) {
						event.getEntity().remove();				
					}
					if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "신의 검[범위 축소형]")) {
						event.getEntity().remove();				
					}
				} else {
					Player p = (Player) event.getEntity();
					if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "신의 검")) {
						if(p.getHealth() < 2) {
							p.setHealth(0);
						} else {
							p.setHealth(p.getHealth() - 2);
						}
					}
					if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "신의 검[범위 축소형]")) {
						if(p.getHealth() < 2) {
							p.setHealth(0);
						} else {
							p.setHealth(p.getHealth() - 2);
						}				
					}
				}
			}
		} catch(Exception e) {
			
		}
		//pvp 
		try {
			if(event.getEntity() instanceof Player) {
				if(event.getDamager() instanceof Player) {
					Player player1 = (Player) event.getDamager();
					Player player2 = (Player) event.getEntity();
					if(blue.hasPlayer(player1)) {
						if(blue.hasPlayer(player2)) {
							event.setCancelled(true);
							return;
						}
						player2.damage(event.getDamage());
						event.setDamage(0);
						event.setCancelled(true);
						return;
					}
					if(red.hasPlayer(player1)) {
						if(red.hasPlayer(player2)) {
							event.setCancelled(true);
							return;
						}
						ExpSystemByMob es = new ExpSystemByMob();
						player2.setExp(player2.getExp()/2);
						es.giveExp(player1, (int)(event.getDamage())*player1.getLevel()*200);
						player2.damage(event.getDamage());
						event.setDamage(0);
						event.setCancelled(true);
						return;
					}
					event.setCancelled(true);
					return;
				}
			}
			
		} catch(Exception e) {
			
		}
		// animal Loot
		try {
			if (event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				Location loc = player.getLocation();
				Entity animal = event.getEntity();
				AnimalLoot animalLoot = new AnimalLoot();
				boolean isOk = animalLoot.Loot(player, animal, loc);
				if (isOk == true) {
					event.setCancelled(true);
					return;
				}
			}
		} catch (Exception e) {

		}
		// non attackable entity
		if(event.getEntity().getType() == EntityType.VILLAGER || event.getEntity().getType() == EntityType.PIG 
				|| event.getEntity().getType() == EntityType.CHICKEN || event.getEntity().getType() == EntityType.COW
				|| event.getEntity().getType() == EntityType.SHEEP || event.getEntity().getType() == EntityType.WOLF
				|| event.getEntity().getType() == EntityType.HORSE || event.getEntity().getType() == EntityType.SKELETON_HORSE
				|| event.getEntity().getType() == EntityType.DONKEY
				|| event.getEntity().getType() == EntityType.CAT || event.getEntity().getType() == EntityType.ARMOR_STAND) {
			event.setCancelled(true);
			return;
		}
		// riding horse
		try {
			if(event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				if(!(event.getEntity() instanceof Player)) {
					if(player.getVehicle() != null) {
						event.setCancelled(true);
						return;
					}
				}
			}
		} catch(Exception e) {
			
		}
		// SpectralArrow hit
		try {
			if (event.getDamager() instanceof SpectralArrow) {
				event.setCancelled(true);
				return;
			}
		} catch (Exception e) {

		}
		// target change
		try {
			if (event.getEntity() instanceof Mob) {
				if (!(event.getEntity() instanceof IronGolem)) {
					if (event.getDamager() instanceof Player) {
						int num = rnd.nextInt(5);
						if(num==0) {
							Player player = (Player) event.getDamager();
							Mob mob = (Mob) event.getEntity();
							mob.setTarget(player);
						}
					}
				}
			}
		} catch (Exception e) {

		}
		//enderman target
		try {
			if(event.getEntity() instanceof Enderman) {
				if(event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((Enderman) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 10, 30);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Enderman) {
							((Enderman) nearEntity).setTarget(player);
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		//polar bear target
		try {
			if (event.getEntity() instanceof PolarBear) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((PolarBear) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 10, 30);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof PolarBear) {
							((PolarBear) nearEntity).setTarget(player);
						}
					}
				} else if(event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if(proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((PolarBear) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 10, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof PolarBear) {
								((PolarBear) nearEntity).setTarget(player);
							}
						}
					}
				} else if(event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if(proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((PolarBear) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 10, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof PolarBear) {
								((PolarBear) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
		} catch (Exception e) {

		}
		// Llama target
		try {
			if (event.getEntity() instanceof Llama) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((Llama) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Llama) {
							((Llama) nearEntity).setTarget(player);
						}
					}
				} else if (event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Llama) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Llama) {
								((Llama) nearEntity).setTarget(player);
							}
						}
					}
				} else if (event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Llama) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Llama) {
								((Llama) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
		} catch (Exception e) {

		}
		// Ocelot target
		try {
			if (event.getEntity() instanceof Ocelot) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((Ocelot) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Ocelot) {
							((Ocelot) nearEntity).setTarget(player);
						}
					}
				} else if (event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Ocelot) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Ocelot) {
								((Ocelot) nearEntity).setTarget(player);
							}
						}
					}
				} else if (event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Ocelot) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Ocelot) {
								((Ocelot) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
		} catch (Exception e) {

		}
		// Panda target
		try {
			if (event.getEntity() instanceof Panda) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((Panda) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Panda) {
							((Panda) nearEntity).setTarget(player);
						}
					}
				} else if (event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Panda) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Panda) {
								((Panda) nearEntity).setTarget(player);
							}
						}
					}
				} else if (event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Panda) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Panda) {
								((Panda) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
		} catch (Exception e) {

		}
		// Zoglin target
		try {
			if (event.getEntity() instanceof Zoglin) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((Zoglin) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Zoglin) {
							((Zoglin) nearEntity).setTarget(player);
						}
					}
				} else if (event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Zoglin) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Zoglin) {
								((Zoglin) nearEntity).setTarget(player);
							}
						}
					}
				} else if (event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Zoglin) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Zoglin) {
								((Zoglin) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
		} catch (Exception e) {

		}
		// Rabbit target
		try {
			if (event.getEntity() instanceof Rabbit) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((Rabbit) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Rabbit) {
							((Rabbit) nearEntity).setTarget(player);
						}
					}
				} else if (event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Rabbit) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Rabbit) {
								((Rabbit) nearEntity).setTarget(player);
							}
						}
					}
				} else if (event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Rabbit) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 5, 30);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Rabbit) {
								((Rabbit) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
		} catch (Exception e) {

		}
		// phantom target
		try {
			if (event.getEntity() instanceof Phantom) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((Phantom) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Phantom) {
							((Phantom) nearEntity).setTarget(player);
						}
					}
				} else if (event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Phantom) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Phantom) {
								((Phantom) nearEntity).setTarget(player);
							}
						}
					}
				} else if (event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Phantom) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Phantom) {
								((Phantom) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
		} catch (Exception e) {

		}
		// guardian target
		try {
			if (event.getEntity() instanceof Guardian) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((Guardian) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Guardian) {
							((Guardian) nearEntity).setTarget(player);
						}
						if (nearEntity instanceof ElderGuardian) {
							((ElderGuardian) nearEntity).setTarget(player);
						}
					}
				} else if (event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Guardian) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Guardian) {
								((Guardian) nearEntity).setTarget(player);
							}
							if (nearEntity instanceof ElderGuardian) {
								((ElderGuardian) nearEntity).setTarget(player);
							}
						}
					}
				} else if (event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Guardian) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Guardian) {
								((Guardian) nearEntity).setTarget(player);
							}
							if (nearEntity instanceof ElderGuardian) {
								((ElderGuardian) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
			if (event.getEntity() instanceof ElderGuardian) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((ElderGuardian) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Guardian) {
							((Guardian) nearEntity).setTarget(player);
						}
						if (nearEntity instanceof ElderGuardian) {
							((ElderGuardian) nearEntity).setTarget(player);
						}
					}
				} else if (event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((ElderGuardian) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Guardian) {
								((Guardian) nearEntity).setTarget(player);
							}
							if (nearEntity instanceof ElderGuardian) {
								((ElderGuardian) nearEntity).setTarget(player);
							}
						}
					}
				} else if (event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if (proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((ElderGuardian) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Guardian) {
								((Guardian) nearEntity).setTarget(player);
							}
							if (nearEntity instanceof ElderGuardian) {
								((ElderGuardian) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
		} catch (Exception e) {

		}
		//spider target
		try {
			if (event.getEntity() instanceof Spider) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((Spider) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Spider) {
							((Spider) nearEntity).setTarget(player);
						}
						if (nearEntity instanceof CaveSpider) {
							((CaveSpider) nearEntity).setTarget(player);
						}
					}
				} else if(event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if(proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Spider) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Spider) {
								((Spider) nearEntity).setTarget(player);
							}
							if (nearEntity instanceof CaveSpider) {
								((CaveSpider) nearEntity).setTarget(player);
							}
						}
					}
				} else if(event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if(proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((Spider) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Spider) {
								((Spider) nearEntity).setTarget(player);
							}
							if (nearEntity instanceof CaveSpider) {
								((CaveSpider) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
			if (event.getEntity() instanceof CaveSpider) {
				if (event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					((CaveSpider) event.getEntity()).setTarget(player);
					List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Spider) {
							((Spider) nearEntity).setTarget(player);
						}
						if (nearEntity instanceof CaveSpider) {
							((CaveSpider) nearEntity).setTarget(player);
						}
					}
				} else if(event.getDamager() instanceof Arrow) {
					Arrow proj = (Arrow) event.getDamager();
					if(proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((CaveSpider) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Spider) {
								((Spider) nearEntity).setTarget(player);
							}
							if (nearEntity instanceof CaveSpider) {
								((CaveSpider) nearEntity).setTarget(player);
							}
						}
					}
				} else if(event.getDamager() instanceof SmallFireball) {
					SmallFireball proj = (SmallFireball) event.getDamager();
					if(proj.getShooter() instanceof Player) {
						Player player = (Player) proj.getShooter();
						((CaveSpider) event.getEntity()).setTarget(player);
						List<Entity> entitylist = event.getEntity().getNearbyEntities(20, 20, 20);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Spider) {
								((Spider) nearEntity).setTarget(player);
							}
							if (nearEntity instanceof CaveSpider) {
								((CaveSpider) nearEntity).setTarget(player);
							}
						}
					}
				}
			}
		} catch (Exception e) {

		}
		//Fireball
		try {
			if(event.getEntity() instanceof Fireball) {
				event.setCancelled(true);
			}
		} catch (Exception e) {

		}
		//Golem
		try {
			if(event.getEntity() instanceof IronGolem) {
				IronGolem ir = (IronGolem) event.getEntity();
				GolemOwner go = new GolemOwner();
				Entity player = (Entity)(go.returnPlayer(ir.getUniqueId()));
				boolean isOk = true;
				List<Entity> entitylist = ir.getNearbyEntities(12, 8, 12);
				for (Entity nearEntity : entitylist) {
					if(nearEntity == player) {
						isOk = true;
						break;
					}
					isOk = false;
				}
				if(isOk == false) {
					ir.damage(999999);
				}
			}
			if(event.getDamager() instanceof IronGolem) {
				IronGolem ir = (IronGolem) event.getDamager();
				GolemOwner go = new GolemOwner();
				Entity player = (Entity)(go.returnPlayer(ir.getUniqueId()));
				boolean isOk = true;
				List<Entity> entitylist = ir.getNearbyEntities(12, 8, 12);
				for (Entity nearEntity : entitylist) {
					if(nearEntity == player) {
						isOk = true;
						break;
					}
					isOk = false;
				}
				if(isOk == false) {
					ir.damage(999999);
				}
				
				ir.damage(ir.getMaxHealth() / 100.0);
				
			}
		} catch(Exception e) {
			
		}
		//Arrow
		try {
			if(event.getDamager() instanceof Arrow) {
				if(event.getEntity() instanceof Mob) {
					Arrow arrow = (Arrow) event.getDamager();
					if(!(arrow.getShooter() instanceof Player)) {
						event.setCancelled(true);
						return;
					} else {
						Player player = (Player) arrow.getShooter();
						if(!(event.getEntity() instanceof IronGolem)) {
							((Mob) event.getEntity()).setTarget(player);
						}
					}
				}
				if(event.getEntity() instanceof Player) {
					Arrow arrow = (Arrow) event.getDamager();
					if(arrow.getShooter() instanceof Player) {
						event.setCancelled(true);
					}
					Player player = (Player) event.getEntity();
					LivingEntity entity = (LivingEntity) arrow.getShooter();
					int resist = 0;
					try {
						if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
							try {
								String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
								resist += Integer.parseInt(ench[8]);
							} catch(Exception e) {
								
							}
						}
					} catch(Exception e) {
						
					}
					try {
						if (player.getInventory().getHelmet() != null) {
							String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
							resist += Integer.parseInt(ench[8]);
						}
					} catch(Exception e) {
						
					}
					try {
						if (player.getInventory().getChestplate() != null) {
							String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
							resist += Integer.parseInt(ench[8]);
						}
					} catch(Exception e) {
						
					}
					try {
						if (player.getInventory().getLeggings() != null) {
							String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
							resist += Integer.parseInt(ench[8]);
						}
					} catch(Exception e) {
	
					}
					try {
						if (player.getInventory().getBoots() != null) {
							String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
							resist += Integer.parseInt(ench[8]);
						}
					} catch(Exception e) {
	
					}
					int damage = (int) (event.getDamage() + Integer.parseInt(entity.getEquipment().getItemInMainHand().getItemMeta().getLocalizedName()) * 4);
					damage = (int) (damage - (damage * (42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / 10*Math.sqrt(2)) / 100));
					event.setDamage(damage);
				}
				if(event.getEntity() instanceof Mob) {
					Arrow arrow = (Arrow) event.getDamager();
					Player player = (Player) arrow.getShooter();
					Entity ent = (Entity) event.getEntity();
					double lvl = player.getLevel() * 0.2 + 1;
					double jobMul = 1;
					double enchMul = 1;
					double skillMul = 1;
					double weaponMul = 1;
					try {
						if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
							try {
								enchMul += Integer.parseInt(player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName()) * 2;
							} catch(Exception e) {
								
							}
						}
					} catch(Exception e) {
						
					}
					try {
						if (player.getInventory().getHelmet() != null) {
							String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
							enchMul += Integer.parseInt(ench[0]);
						}
					} catch(Exception e) {
						
					}
					try {
						if (player.getInventory().getChestplate() != null) {
							String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
							enchMul += Integer.parseInt(ench[0]);
						}
					} catch(Exception e) {
						
					}
					try {
						if (player.getInventory().getLeggings() != null) {
							String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
							enchMul += Integer.parseInt(ench[0]);
						}
					} catch(Exception e) {
	
					}
					try {
						if (player.getInventory().getBoots() != null) {
							String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
							enchMul += Integer.parseInt(ench[0]);
						}
					} catch(Exception e) {
	
					}
					if(player.getInventory().contains(Material.GLOWSTONE_DUST)) {
						jobMul = 44;
					}
					if(player.getInventory().contains(Material.CLAY_BALL)) {
						jobMul = 4;
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.DEAD_TUBE_CORAL_BLOCK) {
						weaponMul = 9;
						enchMul *= 2;
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.DEAD_BRAIN_CORAL_BLOCK) {
						weaponMul = 5.8;
						enchMul *= 1.6;
						((LivingEntity)ent).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 0));
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.DEAD_BUBBLE_CORAL_BLOCK) {
						player.getWorld().spawnParticle(Particle.LAVA, ent.getLocation(), 1);
						weaponMul = 4.6;
						enchMul *= 1.2;
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.DEAD_FIRE_CORAL_BLOCK) {
						weaponMul = 3.6;
						enchMul *= 0.8;
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.DEAD_HORN_CORAL_BLOCK) {
						weaponMul = 4.0;
						enchMul *= 1;
					}
					if(arrow.getDamage() == 0.01) {
						skillMul = 2;
					}
					if(arrow.getDamage() == 0.02) {
						skillMul = 20;
					}
					if(arrow.getDamage() == 0.03) {
						skillMul = 200;
					}
					if(arrow.getDamage() == 0.04) {
						skillMul = 300;
					}
					if(arrow.getDamage() == 0.05) {
						skillMul = 2000;
					}
					double damage = (lvl * jobMul * skillMul * weaponMul) + enchMul;
					try {
						if (player.getInventory().getItemInMainHand().getType() == Material.BONE) {
							damage = player.getLevel() * 10;
						} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "죽음의 서약")) {
							damage = player.getLevel() * 80;
						} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "암석 스태프")) {
							damage = player.getLevel() * 200;
						} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "대지의 스태프")) {
							damage = player.getLevel() * 400;
						}
					} catch(Exception e) {
	
					}
					event.setDamage(damage);
				}
				
			}
		} catch(Exception e) {
			
		}
		//SmallFireball
		try {
			if (event.getDamager() instanceof SmallFireball) {
				if(event.getEntity() instanceof Mob) {
					SmallFireball arrow = (SmallFireball) event.getDamager();
					if(!(arrow.getShooter() instanceof Player)) {
						event.setCancelled(true);
						return;
					} else {
						Player player = (Player) arrow.getShooter();
						if(!(event.getEntity() instanceof IronGolem)) {
							((Mob) event.getEntity()).setTarget(player);
						}
					}
				}
				if(event.getEntity() instanceof Player) {
					SmallFireball arrow = (SmallFireball) event.getDamager();
					if(arrow.getShooter() instanceof Player) {
						event.setCancelled(true);
					}
					event.getEntity().setFireTicks(120);
				}
				if(event.getEntity() instanceof Mob) {
					SmallFireball arrow = (SmallFireball) event.getDamager();
					Player player = (Player) arrow.getShooter();
					double lvl = player.getLevel() / 2.0 + 1;
					double jobMul = 1;
					double enchMul = 1;
					double weaponMul = 1;
					try {
						if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
							try {
								enchMul += Integer.parseInt(player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName()) * 2;
							} catch(Exception e) {
								
							}
						}
					} catch(Exception e) {
						
					}
					try {
						if (player.getInventory().getHelmet() != null) {
							String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
							enchMul += Integer.parseInt(ench[0]);
						}
					} catch(Exception e) {
						
					}
					try {
						if (player.getInventory().getChestplate() != null) {
							String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
							enchMul += Integer.parseInt(ench[0]);
						}
					} catch(Exception e) {
						
					}
					try {
						if (player.getInventory().getLeggings() != null) {
							String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
							enchMul += Integer.parseInt(ench[0]);
						}
					} catch(Exception e) {
	
					}
					try {
						if (player.getInventory().getBoots() != null) {
							String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
							enchMul += Integer.parseInt(ench[0]);
						}
					} catch(Exception e) {
	
					}
					if (player.getInventory().contains(Material.MAGENTA_DYE)) {
						if(player.getLevel() >= 700) {
							jobMul = 20;
						}
					}
					if (player.getInventory().contains(Material.INK_SAC)) {
						jobMul = 200;
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.TUBE_CORAL_BLOCK) {
						weaponMul = 2.0;
						enchMul *= 1;
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.BRAIN_CORAL_BLOCK) {
						weaponMul = 3.0;
						enchMul *= 1.3;
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.BUBBLE_CORAL_BLOCK) {
						weaponMul = 10.0;
						enchMul *= 3;
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.FIRE_CORAL_BLOCK) {
						weaponMul = 1.2;
						enchMul *= 0.6;
					}
					if (player.getInventory().getItemInMainHand().getType() == Material.HORN_CORAL_BLOCK) {
						weaponMul = 6.0;
						enchMul *= 2.2;
					}
					double damage = (lvl * jobMul * weaponMul) + enchMul;
					event.setDamage(damage);
				}
			}
		} catch (Exception e) {

		}
		//Llama spit
		try {
			if (event.getDamager() instanceof LlamaSpit) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					if(player.getHealth() <= 4) {
						player.setHealth(0);
					} else {
						player.setHealth(player.getHealth() - 4);
					}
				} else {
					event.setCancelled(true);
					return;
				}

			}
		} catch (Exception e) {

		}
		//Evoker
		try {
			if (event.getDamager() instanceof EvokerFangs) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					player.setHealth(player.getHealth() * 4 / 5);
				} else {
					event.setCancelled(true);
					return;
				}

			}
		} catch (Exception e) {

		}
		//Mob is Damager
		try {
			if(!(event.getDamager() instanceof Player)) {
				LivingEntity mob = (LivingEntity) event.getDamager();
				int damage = (int)(Integer.parseInt(mob.getEquipment().getItemInMainHand().getItemMeta().getLocalizedName()) * 4);
				event.setDamage(event.getDamage() + damage);
			}
		} catch(Exception e) {
			
		}
		//Effect
		try {
			WeaponBuff weaponBuff = new WeaponBuff();
			if (event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				LivingEntity mob = (LivingEntity) event.getEntity();
				weaponBuff.attackBuff(player, mob);
			} else if (event.getEntity() instanceof Player){
				Player player = (Player) event.getEntity();
				weaponBuff.hitBuff(player);
			}
		} catch (Exception e) {

		}
		//Level Bonus
		try {
			if(event.getDamager() instanceof Player) {
				Player player = (Player)event.getDamager();
				int damage = (int)event.getDamage();
				damage += player.getLevel();
				event.setDamage(damage);
			}
		} catch(Exception e) {
			
		}
		// DisableAttack1
		try {
			DisableAttack da = new DisableAttack();
			Player player = (Player) event.getDamager();
			if (!da.disable(player)) {
				event.setCancelled(true);
				return;
			}
		} catch (Exception e) {

		}
		//Damage Calc
		try {
			if(event.getDamager() instanceof Player) {
				Player player = (Player)event.getDamager();
				int damage = (int)event.getDamage();
				Entity entity = (Entity)event.getEntity();
				DamageCal dc = new DamageCal();
				int realDamage = damage + dc.Edamage(player, entity);
				event.setDamage(realDamage);
			} else if(event.getEntity() instanceof Player){
				Player player = (Player)event.getEntity();
				double damage = event.getDamage();
				Entity entity = (Entity)event.getDamager();
				DamageCal dc = new DamageCal();
				double realDamage = dc.Pdamage(player, damage, entity);
				event.setDamage(realDamage);
			}
			
		} catch(Exception e) {
			
		}
		//Class
		try {
			if (event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				PlayerJobBuff buff = new PlayerJobBuff();
				buff.playerBuff(player);
			}
		} catch (Exception e) {

		}		
		//Limit weapon 1
		try {
			Player player = (Player) event.getDamager();
			ItemStack item = player.getInventory().getItemInMainHand();
			if(!(item.getType() == Material.LEATHER_HELMET || item.getType() == Material.LEATHER_CHESTPLATE || item.getType() == Material.LEATHER_LEGGINGS
					|| item.getType() == Material.LEATHER_BOOTS || item.getType() == Material.CHAINMAIL_HELMET || item.getType() == Material.CHAINMAIL_CHESTPLATE 
					|| item.getType() == Material.CHAINMAIL_LEGGINGS || item.getType() == Material.CHAINMAIL_BOOTS || item.getType() == Material.IRON_HELMET 
					|| item.getType() == Material.IRON_CHESTPLATE || item.getType() == Material.IRON_LEGGINGS || item.getType() == Material.IRON_BOOTS 
					|| item.getType() == Material.GOLDEN_HELMET || item.getType() == Material.GOLDEN_CHESTPLATE || item.getType() == Material.GOLDEN_LEGGINGS 
					|| item.getType() == Material.GOLDEN_BOOTS || item.getType() == Material.DIAMOND_HELMET || item.getType() == Material.DIAMOND_CHESTPLATE 
					|| item.getType() == Material.DIAMOND_LEGGINGS || item.getType() == Material.DIAMOND_BOOTS || item.getType() == Material.NETHERITE_HELMET 
					|| item.getType() == Material.NETHERITE_CHESTPLATE || item.getType() == Material.NETHERITE_LEGGINGS || item.getType() == Material.NETHERITE_BOOTS)) {
				LimitLevel la = new LimitLevel();
				if(la.limit(player, item) == false) {
					player.sendMessage(ChatColor.RED + "아직 이 무기를 다루기에는 내 힘이 부족하다.");
					event.setCancelled(true);
					return;
				}
			}
		} catch(Exception e) {
			
		}	
		//Limit weapon 2
		try {
			Player player = (Player) event.getEntity();
			ItemStack item = player.getInventory().getItemInMainHand();
			if (!(item.getType() == Material.LEATHER_HELMET || item.getType() == Material.LEATHER_CHESTPLATE
					|| item.getType() == Material.LEATHER_LEGGINGS || item.getType() == Material.LEATHER_BOOTS
					|| item.getType() == Material.CHAINMAIL_HELMET || item.getType() == Material.CHAINMAIL_CHESTPLATE
					|| item.getType() == Material.CHAINMAIL_LEGGINGS || item.getType() == Material.CHAINMAIL_BOOTS
					|| item.getType() == Material.IRON_HELMET || item.getType() == Material.IRON_CHESTPLATE
					|| item.getType() == Material.IRON_LEGGINGS || item.getType() == Material.IRON_BOOTS
					|| item.getType() == Material.GOLDEN_HELMET || item.getType() == Material.GOLDEN_CHESTPLATE
					|| item.getType() == Material.GOLDEN_LEGGINGS || item.getType() == Material.GOLDEN_BOOTS
					|| item.getType() == Material.DIAMOND_HELMET || item.getType() == Material.DIAMOND_CHESTPLATE
					|| item.getType() == Material.DIAMOND_LEGGINGS || item.getType() == Material.DIAMOND_BOOTS
					|| item.getType() == Material.NETHERITE_HELMET || item.getType() == Material.NETHERITE_CHESTPLATE
					|| item.getType() == Material.NETHERITE_LEGGINGS || item.getType() == Material.NETHERITE_BOOTS)) {
				LimitLevel la = new LimitLevel();
				if (la.limit(player, item) == false) {
					player.damage(event.getDamage());
					event.setCancelled(true);
					return;
				}
			}
		} catch (Exception e) {

		}
		//JobReduceWeaponDamage 
		try {
			if(event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				if(player.getInventory().contains(Material.CLAY_BALL) || player.getInventory().contains(Material.GLOWSTONE_DUST) || 
						player.getInventory().contains(Material.INK_SAC)) {
					event.setDamage(event.getDamage()/4);
				}
			}
		} catch(Exception e) {
			
		}
		//JobWeaponBuff 
		try {
			if(event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				int num = player.getLevel();
				// 본 파이터
				if (player.getInventory().contains(Material.RED_DYE)) {
					event.setDamage(event.getDamage() + num * 0.75);
				}
				// 광전사
				if (player.getInventory().contains(Material.CYAN_DYE)) {
					event.setDamage(event.getDamage() + num * 0.6);
				}
				// 데빌
				if (player.getInventory().contains(Material.GRAY_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/10) + num);
				}
				// 엔젤
				if (player.getInventory().contains(Material.PINK_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/15) + num);
				}
				// 대행자
				if (player.getInventory().contains(Material.LIME_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/12) + num);
				}
				// 그림자 무사
				if (player.getInventory().contains(Material.YELLOW_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/40) + num);
				}
				// 버서커
				if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/30) + num);
				}
				// 그림 리퍼		
				if (player.getInventory().contains(Material.ORANGE_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/25) + num);
				}
				// 군인	
				if (player.getInventory().contains(Material.MAGENTA_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/30) + num);
				}
				// 마인
				if (player.getInventory().contains(Material.BLUE_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/5) + num);
				}
				// 팔라딘		
				if (player.getInventory().contains(Material.BROWN_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/7) + num);
				}
				// 용기사
				if (player.getInventory().contains(Material.BLACK_DYE)) {
					event.setDamage(event.getDamage() + ((num*num)/6) + num);
				}
				// 조커
				if (player.getInventory().contains(Material.INK_SAC)) {
					event.setDamage(event.getDamage() + ((num*num)/8) + num);
				}
			}
		} catch(Exception e) {
			
		}
		//Sweeping Damage
		try {
			if (event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				SweepingCal sc = new SweepingCal();
				sc.sweeping(player, event.getDamage(), event.getEntity());
			}
		} catch (Exception e) {

		}
		// hit from mob
		try {
			if (event.getDamager() instanceof Entity) {
				Entity entity = (Entity) event.getDamager();
				Player player = (Player) event.getEntity();
				PlayerHitDebuff debuff = new PlayerHitDebuff();
				debuff.playerHitDebuff(player, entity);
			}
		} catch (Exception e) {

		}
		// hit mob1
		try {
			if (event.getDamager() instanceof Player) {
				Entity entity = (Entity) event.getEntity();
				Player player = (Player) event.getDamager();
				//===========================================================================
				// 타격 시 확률적 마나 증가
				int num = 0;
				num += new SpecialEffect().a10050(player);
				num += new SpecialEffect().a1(player);
				num += new SpecialEffect().a9(player);
				num += new SpecialEffect().a15(player);
				num += new SpecialEffect().w3(player);
				num += new SpecialEffect().w6(player);
				num += new SpecialEffect().w8(player);
				
				if(rnd.nextInt(100) < num) {
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
				//===========================================================================
				// 흡혈
				double addHealthPercent = 0;
				addHealthPercent += new SpecialEffect().a10040(player);
				addHealthPercent += new SpecialEffect().c1(player);
				addHealthPercent += new SpecialEffect().a13(player);
				addHealthPercent += new SpecialEffect().w1(player);
				addHealthPercent += new SpecialEffect().s3(player);
				addHealthPercent += new SpecialEffect().s5(player);
				addHealthPercent += new SpecialEffect().w2(player);
				addHealthPercent += new SpecialEffect().w5(player);
				addHealthPercent += new SpecialEffect().w10(player);
				
				if(addHealthPercent > 0) {
					int addHealth = (int) (event.getDamage() * addHealthPercent / 100); 

					PotionRatioForVampire pr = new PotionRatioForVampire();
					pr.calculation(player, addHealth);
					
					event.setDamage(event.getDamage() * (100 - 10 * addHealthPercent) / 100);
				}
				//===========================================================================
				// 독뎀
				int poison = 0;
				ArrayList<Integer> ary = new ArrayList<>(); 
				ary.add(new SpecialEffect().a10070(player));
				ary.add(new SpecialEffect().a10(player));
				ary.add(new SpecialEffect().s2(player));
				ary.add(new SpecialEffect().a16(player));
				Collections.sort(ary);
				Collections.reverse(ary);
				poison = ary.get(0);
				
				if(poison != 0) {
					if(entity.getType() == EntityType.ZOMBIE || entity.getType() == EntityType.ZOMBIE_VILLAGER || entity.getType() == EntityType.HUSK
							|| entity.getType() == EntityType.DROWNED || entity.getType() == EntityType.SKELETON || entity.getType() == EntityType.WITHER_SKELETON
							|| entity.getType() == EntityType.WITHER) {
						((LivingEntity) entity).addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, poison));
					} else {
						((LivingEntity) entity).addPotionEffect(new PotionEffect(PotionEffectType.HARM, 100, poison));
					}
				}
				//===========================================================================
				// 회복
				int percent10 = 0;
				percent10 += new SpecialEffect().a10090(player);
				percent10 += new SpecialEffect().a11(player);
				percent10 += new SpecialEffect().b3(player);
				percent10 += new SpecialEffect().a21(player);
				percent10 += new SpecialEffect().b7(player);
				
				if(rnd.nextInt(100) < percent10) {
					if(player.getHealth() >= 18) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 2);
					}
				}
				//===========================================================================
				PlayerHitDebuff debuff = new PlayerHitDebuff();
				debuff.playerHitDebuff(player, entity);
			}
		} catch (Exception e) {
			
		}
		// hit mob2
		try {
			if (event.getDamager() instanceof Arrow) {
				Entity entity = (Entity) event.getEntity();
				Player player = ((Player)((Arrow) event.getDamager()).getShooter());
				//===========================================================================
				// 타격 시 확률적 마나 증가
				int num = 0;
				num += new SpecialEffect().a10060(player);
				
				if(rnd.nextInt(100) < num) {
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
				//===========================================================================
				// 흡혈
				int addHealthPercent = 0;
				addHealthPercent += new SpecialEffect().a10040(player);
				addHealthPercent += new SpecialEffect().c1(player);
				addHealthPercent += new SpecialEffect().a13(player);
				addHealthPercent += new SpecialEffect().w1(player);
				addHealthPercent += new SpecialEffect().s3(player);
				addHealthPercent += new SpecialEffect().s5(player);
				addHealthPercent += new SpecialEffect().w2(player);
				addHealthPercent += new SpecialEffect().w5(player);
				addHealthPercent += new SpecialEffect().w10(player);
				
				if(addHealthPercent > 0) {
					int addHealth = (int) (event.getDamage() * addHealthPercent / 100); 

					PotionRatioForVampire pr = new PotionRatioForVampire();
					pr.calculation(player, addHealth);
				}
				//===========================================================================
				// 독뎀
				int poison = 0;
				ArrayList<Integer> ary = new ArrayList<>(); 
				ary.add(new SpecialEffect().a10080(player));
				ary.add(new SpecialEffect().h2(player));
				ary.add(new SpecialEffect().a17(player));
				Collections.sort(ary);
				Collections.reverse(ary);
				poison = ary.get(0);
				
				if(poison != 0) {
					if(entity.getType() == EntityType.ZOMBIE || entity.getType() == EntityType.ZOMBIE_VILLAGER || entity.getType() == EntityType.HUSK
							|| entity.getType() == EntityType.DROWNED || entity.getType() == EntityType.SKELETON || entity.getType() == EntityType.WITHER_SKELETON
							|| entity.getType() == EntityType.WITHER) {
						((LivingEntity) entity).addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, poison));
					} else {
						((LivingEntity) entity).addPotionEffect(new PotionEffect(PotionEffectType.HARM, 100, poison));
					}
				}
				//===========================================================================
				// 회복
				int percent10 = 0;
				percent10 += new SpecialEffect().a10100(player);
				percent10 += new SpecialEffect().a22(player);
				percent10 += new SpecialEffect().b8(player);
				
				if(rnd.nextInt(100) < percent10) {
					if(player.getHealth() >= 18) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 2);
					}
				}
				//===========================================================================
				PlayerHitDebuff debuff = new PlayerHitDebuff();
				debuff.playerHitDebuff(player, entity);
			}
		} catch (Exception e) {

		}
		// hit mob3
		try {
			if (event.getDamager() instanceof SmallFireball) {
				Entity entity = (Entity) event.getEntity();
				Player player = ((Player)((SmallFireball) event.getDamager()).getShooter());
				//===========================================================================
				// 타격 시 확률적 마나 증가
				int num = 0;
				num += new SpecialEffect().a10060(player);
				
				if(rnd.nextInt(100) < num) {
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
				//===========================================================================
				// 흡혈
				int addHealthPercent = 0;
				addHealthPercent += new SpecialEffect().a10040(player);
				addHealthPercent += new SpecialEffect().c1(player);
				addHealthPercent += new SpecialEffect().a13(player);
				addHealthPercent += new SpecialEffect().w1(player);
				addHealthPercent += new SpecialEffect().s3(player);
				addHealthPercent += new SpecialEffect().s5(player);
				addHealthPercent += new SpecialEffect().w2(player);
				addHealthPercent += new SpecialEffect().w5(player);
				addHealthPercent += new SpecialEffect().w10(player);
				
				if(addHealthPercent > 0) {
					int addHealth = (int) (event.getDamage() * addHealthPercent / 100); 

					PotionRatioForVampire pr = new PotionRatioForVampire();
					pr.calculation(player, addHealth);
				}
				//===========================================================================
				// 독뎀
				int poison = 0;
				ArrayList<Integer> ary = new ArrayList<>();
				ary.add(new SpecialEffect().a10080(player));
				ary.add(new SpecialEffect().h2(player));
				ary.add(new SpecialEffect().a17(player));
				Collections.sort(ary);
				Collections.reverse(ary);
				poison = ary.get(0);
				
				if(poison != 0) {
					if(entity.getType() == EntityType.ZOMBIE || entity.getType() == EntityType.ZOMBIE_VILLAGER || entity.getType() == EntityType.HUSK
							|| entity.getType() == EntityType.DROWNED || entity.getType() == EntityType.SKELETON || entity.getType() == EntityType.WITHER_SKELETON
							|| entity.getType() == EntityType.WITHER) {
						((LivingEntity) entity).addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, poison));
					} else {
						((LivingEntity) entity).addPotionEffect(new PotionEffect(PotionEffectType.HARM, 100, poison));
					}
				}
				//===========================================================================
				// 회복
				int percent10 = 0;
				percent10 += new SpecialEffect().a10100(player);
				percent10 += new SpecialEffect().a22(player);
				percent10 += new SpecialEffect().b8(player);
				
				if(rnd.nextInt(100) < percent10) {
					if(player.getHealth() >= 18) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 2);
					}
				}
				//===========================================================================
				PlayerHitDebuff debuff = new PlayerHitDebuff();
				debuff.playerHitDebuff(player, entity);
			}
		} catch (Exception e) {

		}
		// thorns
		try {
			if (event.getDamager() instanceof LivingEntity && !(event.getDamager() instanceof Player)) {
				if (event.getEntity() instanceof Player) {
					if(!(new Colosseum()).colosseum(event.getEntity())) {
						try {
							DisableAttack da = new DisableAttack();
							Player player = (Player) event.getEntity();
							if (da.disable(player)) {
								if(player.getVehicle() == null) {
									LivingEntity entity = (LivingEntity) event.getDamager();
									Thorns t = new Thorns();
									entity.damage(t.thorns(player, entity));
								}
							}
						} catch (Exception e) {

						}
					}
				}
			}
		} catch (Exception e) {

		}
		// playerDamage(MaxHealth is 20)
		try {
			if (event.getEntity() instanceof Player) {
				Player player = (Player) event.getEntity();
				DamageRatio dr = new DamageRatio();
				event.setDamage(dr.calculation(player, event.getDamage()));
			}
		} catch (Exception e) {

		}
		//damage event
		try {
			if(event.getEntity().getType() == EntityType.VILLAGER || event.getEntity().getType() == EntityType.PIG 
					|| event.getEntity().getType() == EntityType.CHICKEN || event.getEntity().getType() == EntityType.COW
					|| event.getEntity().getType() == EntityType.SHEEP || event.getEntity().getType() == EntityType.WOLF
					|| event.getEntity().getType() == EntityType.HORSE || event.getEntity().getType() == EntityType.SKELETON_HORSE
					|| event.getEntity().getType() == EntityType.DONKEY
					|| event.getEntity().getType() == EntityType.CAT || event.getEntity().getType() == EntityType.ARMOR_STAND) {
				event.setCancelled(true);
				return;
			}
			if (!(event.getEntity() instanceof Player)) {
				LivingEntity ent = (LivingEntity) event.getEntity();
				if(event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					if(player.getLevel() == 0) {
						event.setDamage(1);
					}
				}
				ent.damage(event.getDamage());
				event.setDamage(0);
				event.setCancelled(true);
				return;
			} 
		} catch (Exception e) {

		}
	}
	
	@EventHandler
	public void skillDamage(EntityDamageEvent event) {
		if(event.getDamage() <= 0) {
			event.setCancelled(true);
			return;
		}
		if(event.getEntity().getType() == EntityType.PIG || event.getEntity().getType() == EntityType.COW 
				|| event.getEntity().getType() == EntityType.CHICKEN || event.getEntity().getType() == EntityType.SHEEP || event.getEntity().getType() == EntityType.VILLAGER
				|| event.getEntity().getType() == EntityType.HORSE || event.getEntity().getType() == EntityType.SKELETON_HORSE || event.getEntity().getType() == EntityType.ZOMBIE_HORSE
				|| event.getEntity().getType() == EntityType.WOLF || event.getEntity().getType() == EntityType.CAT || event.getEntity().getType() == EntityType.DONKEY
				|| event.getEntity().getType() == EntityType.ITEM_FRAME || event.getEntity().getType() == EntityType.DROPPED_ITEM) {
			event.setCancelled(true);
			return;
		}
		
		//몹 스킬 트리거
		try {
			try {
				if (event.getEntity() instanceof Mob) {
					Entity entity = (Entity) event.getEntity();
					Player player = null;
					List<Entity> nearEntity = entity.getNearbyEntities(20, 10, 20);
					for(Entity ent : nearEntity) {
					    if(ent instanceof Player) {
					        player = (Player) ent;
					        break;
					    }
					}
					PlayerHitDebuff debuff = new PlayerHitDebuff();
					debuff.playerHitDebuff(player, entity);
				}
			} catch (Exception e) {
				
			}
		} catch(Exception e) {
			
		}
		
		// 인식변경
		try {
			if (event.getEntity() instanceof Mob) {
				if (!(event.getEntity() instanceof IronGolem)) {
					Mob mob = (Mob) event.getEntity();
					Player player = null;
					if(mob.getTarget() == null) {
						List<Entity> nearEntity = mob.getNearbyEntities(5, 5, 5);
						for(Entity ent : nearEntity) {
						    if(ent instanceof Player) {
						        player = (Player) ent;
						        break;
						    }
						}
						mob.setTarget(player);
					}
				}
			}
		} catch (Exception e) {

		}
		
		// 크리퍼 날라감
		try {
			if (event.getEntity() instanceof Creeper) {
				Creeper mob = (Creeper) event.getEntity();
				Vector vec = mob.getEyeLocation().add(0,1,0).getDirection().multiply(-1.5f);
				if(rnd.nextInt(2) == 0) {
					vec = mob.getEyeLocation().add(0,1,0).getDirection().multiply(-1.5f);
				} else {
					vec = mob.getEyeLocation().add(0,1,0).getDirection().multiply(1.5f);
				}
				mob.setVelocity(vec);
			}
		} catch (Exception e) {

		}
		
		//회피
		try {
			if (event.getEntity() instanceof Player) {
				Player player = (Player) event.getEntity();
				int num = 0;
				num += new SpecialEffect().a10020(player);
				num += new SpecialEffect().a7(player);
				num += new SpecialEffect().l1(player);
				num += new SpecialEffect().b2(player);
				num += new SpecialEffect().a14(player);
				num += new SpecialEffect().h3(player);
				num += new SpecialEffect().s4(player);
				num += new SpecialEffect().s6(player);
				num += new SpecialEffect().s8(player);
				num += new SpecialEffect().w4(player);
				num += new SpecialEffect().w9(player);
				num += new SpecialEffect().b6(player);
				
				if(num > 70) {
					num = 70;
				}
				if(rnd.nextInt(100) < num) {
					event.setCancelled(true);
					return;
				}
			}
		} catch(Exception e) {
			
		}
		
		// 데미지 처리
		try {
			//콜로세움 전투
			if ((new Colosseum()).colosseum(event.getEntity())) {
				if(event.getEntity() instanceof Player) {
					event.setDamage(1);
					Player player = (Player) event.getEntity();
					if(player.getHealth()-2 > 0) {
						player.setHealth(player.getHealth()-2);
					} else {
						player.setHealth(0);
					}
				} else if(event.getEntity() instanceof IronGolem) {
					event.setDamage(999999999);
				} else {
					LivingEntity monster = (LivingEntity) event.getEntity();
					monster.removePotionEffect(PotionEffectType.HARM);
					monster.removePotionEffect(PotionEffectType.HEAL);
					
					event.setDamage(1);
					if(event.getCause() == DamageCause.FIRE_TICK || event.getCause() == DamageCause.FIRE) {
						event.setDamage(0);
					}
					Entity mob = event.getEntity();
					double damage = event.getFinalDamage();
					new MobDeath(mob, damage);
				}
			} else {
				//특수뎀
				try {
					DamageRatio dr = new DamageRatio();
					if (event.getCause() == DamageCause.FIRE_TICK || event.getCause() == DamageCause.FIRE || event.getCause() == DamageCause.HOT_FLOOR) {
						if (event.getEntity() instanceof Player) {
							Player player = (Player) event.getEntity();
							int resist = 0;
							try {
								if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
									ItemStack item = player.getInventory().getItemInMainHand();
									if(item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
											|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
											|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
											|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
											|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
											|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
											|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
											|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
											|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
											|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
											|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
											|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
											|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
											|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
											|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
											|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
											|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
											|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
											|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
											|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS) {
										LimitLevel la = new LimitLevel();
										if(la.limit(player, item) == true) {
											try {
												String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
												resist += Integer.parseInt(ench[6]);
											} catch(Exception e) {
												
											}
										}
									}
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getHelmet() != null) {
									String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[6]);
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getChestplate() != null) {
									String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[6]);
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getLeggings() != null) {
									String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[6]);
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getBoots() != null) {
									String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[6]);
								}
							} catch (Exception e) {

							}
							double damage = dr.calculation(player, event.getDamage());
							Inventory inv = player.getInventory();
							if(inv.contains(Material.RED_DYE) || inv.contains(Material.GREEN_DYE) || inv.contains(Material.LAPIS_LAZULI)
									|| inv.contains(Material.CYAN_DYE) || inv.contains(Material.LIGHT_GRAY_DYE)) {
								damage = 1.5 - (1.5 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
									|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
								damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
								damage = 3 - (3 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
									|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
								damage = 5 - (5 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else {
								damage = 1.5 - (1.5 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							}
							if(damage < 0.001) {
								damage = 0.001;
							}
							event.setDamage(damage);
						}
					}
					if (event.getCause() == DamageCause.VOID) {
						if (event.getEntity() instanceof Player) {
							Player player = (Player) event.getEntity();
							event.setDamage(player.getMaxHealth());
						}
					}
					if (event.getCause() == DamageCause.DROWNING) {
						if (event.getEntity() instanceof Player) {
							Player player = (Player) event.getEntity();
							event.setDamage(0.6);
							player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 1));
						}
					}
					if (event.getCause() == DamageCause.POISON) {
						if (event.getEntity() instanceof Player) {
							Player player = (Player) event.getEntity();
							Inventory inv = player.getInventory();
							if(inv.contains(Material.RED_DYE) || inv.contains(Material.GREEN_DYE) || inv.contains(Material.LAPIS_LAZULI)
									|| inv.contains(Material.CYAN_DYE) || inv.contains(Material.LIGHT_GRAY_DYE)) {
								event.setDamage(dr.calculation(player, player.getLevel()/6));
							} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
									|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
								event.setDamage(dr.calculation(player, player.getLevel()/4));
							} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
								event.setDamage(dr.calculation(player, player.getLevel()/2));
							} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
									|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
								event.setDamage(dr.calculation(player, player.getLevel()));
							} else {
								event.setDamage(dr.calculation(player, player.getLevel()/4));
							}
							
							// 독 데미지 경감
							try {
								int num = 0;
								num += new SpecialEffect().a10150(player);
								num += new SpecialEffect().a26(player);
								num += new SpecialEffect().s9(player);
								num += new SpecialEffect().a27(player);

								if (num > 100) {
									num = 100;
								}
								event.setDamage(event.getDamage() * ((100-num)/100.0));
								
								if(event.getDamage() <= 0) {
									event.setCancelled(true);
									return;
								}
							} catch(Exception e) {
								
							}
							
						}
					}
					if (event.getCause() == DamageCause.WITHER) {
						if (event.getEntity() instanceof Player) {
							Player player = (Player) event.getEntity();
							Inventory inv = player.getInventory();
							if(inv.contains(Material.RED_DYE) || inv.contains(Material.GREEN_DYE) || inv.contains(Material.LAPIS_LAZULI)
									|| inv.contains(Material.CYAN_DYE) || inv.contains(Material.LIGHT_GRAY_DYE)) {
								event.setDamage(dr.calculation(player, player.getLevel()/3));
							} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
									|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
								event.setDamage(dr.calculation(player, player.getLevel()/2));
							} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
								event.setDamage(dr.calculation(player, player.getLevel()));
							} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
									|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
								event.setDamage(dr.calculation(player, player.getLevel()*2));
							} else {
								event.setDamage(dr.calculation(player, player.getLevel()/2));
							}
							
							// 위더 데미지 경감
							try {
								int num = 0;
								num += new SpecialEffect().a10160(player);
								num += new SpecialEffect().a25(player);
								num += new SpecialEffect().s10(player);

								if (num > 100) {
									num = 100;
								}
								event.setDamage(event.getDamage() * ((100-num)/100.0));
								
								if(event.getDamage() <= 0) {
									event.setCancelled(true);
									return;
								}
							} catch(Exception e) {
								
							}
							
						}
					}
					if (event.getCause() == DamageCause.BLOCK_EXPLOSION) {
						if (event.getEntity() instanceof Player) {
							Player player = (Player) event.getEntity();
							int resist = 0;
							try {
								if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
									ItemStack item = player.getInventory().getItemInMainHand();
									if(item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
											|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
											|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
											|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
											|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
											|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
											|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
											|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
											|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
											|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
											|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
											|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
											|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
											|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
											|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
											|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
											|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
											|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
											|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
											|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS) {
										LimitLevel la = new LimitLevel();
										if(la.limit(player, item) == true) {
											try {
												String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
												resist += Integer.parseInt(ench[7]);
											} catch(Exception e) {
												
											}
										}
									}
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getHelmet() != null) {
									String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[7]);
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getChestplate() != null) {
									String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[7]);
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getLeggings() != null) {
									String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[7]);
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getBoots() != null) {
									String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[7]);
								}
							} catch (Exception e) {

							}
							double damage = dr.calculation(player, event.getDamage());
							Inventory inv = player.getInventory();
							if(inv.contains(Material.RED_DYE) || inv.contains(Material.GREEN_DYE) || inv.contains(Material.LAPIS_LAZULI)
									|| inv.contains(Material.CYAN_DYE) || inv.contains(Material.LIGHT_GRAY_DYE)) {
								damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
									|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
								damage = 4 - (4 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
								damage = 6 - (6 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
									|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
								damage = 10 - (10 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else {
								damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							}
							if(damage < 0.001) {
								damage = 0.001;
							}
							event.setDamage(damage);
							player.setFireTicks(160);
						}
					}
					if (event.getCause() == DamageCause.ENTITY_EXPLOSION) {
						if (event.getEntity() instanceof Player) {
							Player player = (Player) event.getEntity();
							int resist = 0;
							try {
								if (player.getInventory().getItemInMainHand() != null) {
									ItemStack item = player.getInventory().getItemInMainHand();
									if(item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
											|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
											|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
											|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
											|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
											|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
											|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
											|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
											|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
											|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
											|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
											|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
											|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
											|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
											|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
											|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
											|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
											|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
											|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
											|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS) {
										LimitLevel la = new LimitLevel();
										if(la.limit(player, item) == true) {
											try {
												String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
												resist += Integer.parseInt(ench[7]);
											} catch(Exception e) {
												
											}
										}
									}
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getHelmet() != null) {
									String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[7]);
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getChestplate() != null) {
									String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[7]);
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getLeggings() != null) {
									String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[7]);
								}
							} catch (Exception e) {

							}
							try {
								if (player.getInventory().getBoots() != null) {
									String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
									resist += Integer.parseInt(ench[7]);
								}
							} catch (Exception e) {

							}
							double damage = dr.calculation(player, event.getDamage());
							Inventory inv = player.getInventory();
							if(inv.contains(Material.RED_DYE) || inv.contains(Material.GREEN_DYE) || inv.contains(Material.LAPIS_LAZULI)
									|| inv.contains(Material.CYAN_DYE) || inv.contains(Material.LIGHT_GRAY_DYE)) {
								damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
									|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
								damage = 4 - (4 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
								damage = 6 - (6 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
									|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
								damage = 10 - (10 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							} else {
								damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
							}
							if(damage < 0.001) {
								damage = 0.001;
							}
							event.setDamage(damage);
							player.setFireTicks(160);
						}
					}
					if(event.getCause() == DamageCause.MAGIC) {
						try {
							if(event.getEntity() instanceof Player) {
								Player player = (Player) event.getEntity();
								event.setDamage(dr.calculation(player, event.getDamage()));
							}
						} catch(Exception e) {
							
						}
					}
					if(event.getCause() == DamageCause.LIGHTNING) {
						try {
							if(event.getEntity() instanceof Player) {
								Player player = (Player) event.getEntity();
								player.setHealth(player.getHealth()/2);
								event.setDamage(0);
							}
						} catch(Exception e) {
							
						}
					}
					if(event.getCause() == DamageCause.CUSTOM) {
						try {
							if(event.getEntity() instanceof Player) {
								Player player = (Player) event.getEntity();
								event.setDamage(dr.calculation(player, event.getDamage()));
							}
						} catch(Exception e) {
							
						}
					}
					if(event.getCause() == DamageCause.STARVATION) {
						event.setCancelled(true);
					}
				} catch(Exception e) {
					
				}
				// Mob Loot
				try {
					if (event.getCause() == DamageCause.ENTITY_SWEEP_ATTACK) {
						if (event.getEntity() instanceof Mob) {				
							Entity mob = event.getEntity();
							double damage = event.getFinalDamage();
							MobDeath md = new MobDeath(mob, damage);
						}
					} else if (event.getCause() == DamageCause.ENTITY_EXPLOSION) {
						if (event.getEntity() instanceof Mob) {				
							Entity mob = event.getEntity();
							double damage = event.getFinalDamage();
							MobDeath md = new MobDeath(mob, damage);
						}
					} else if (event.getCause() == DamageCause.MAGIC) {
						if (event.getEntity() instanceof Mob) {				
							Entity mob = event.getEntity();
							double damage = event.getFinalDamage();
							MobDeath md = new MobDeath(mob, damage);
						}
					} else if (event.getCause() == DamageCause.WITHER) {
						if (event.getEntity() instanceof Mob) {				
							Entity mob = event.getEntity();
							double damage = event.getFinalDamage();
							MobDeath md = new MobDeath(mob, damage);
						}
					} else if (event.getCause() == DamageCause.FIRE_TICK || event.getCause() == DamageCause.FIRE) {
						if (event.getEntity() instanceof Mob) {				
							Entity mob = event.getEntity();
							
							String str = mob.getCustomName().split("\\.")[1];
							String num = str.split("]")[0];
							try {
								int mobLvl = Integer.parseInt(num);
								event.setDamage(mobLvl/2);
							} catch (Exception e) {
								event.setDamage(1);
							}
							
							double damage = event.getFinalDamage();
							MobDeath md = new MobDeath(mob, damage);
						}
					} else if (event.getCause() == DamageCause.POISON) {
						if (event.getEntity() instanceof Mob) {				
							Entity mob = event.getEntity();
							double damage = event.getFinalDamage();
							MobDeath md = new MobDeath(mob, damage);
						}
					} else if (event.getCause() == DamageCause.HOT_FLOOR) {
						if (event.getEntity() instanceof Mob) {				
							Entity mob = event.getEntity();
							double damage = event.getFinalDamage();
							MobDeath md = new MobDeath(mob, damage);
						}
					} else if (event.getCause() == DamageCause.CUSTOM) {
						if (event.getEntity() instanceof Mob) {				
							Entity mob = event.getEntity();
							double damage = event.getFinalDamage();
							MobDeath md = new MobDeath(mob, damage);
						}
					} else if (event.getCause() == DamageCause.FALL) {
						if (event.getEntity() instanceof Mob) {				
							event.setCancelled(true);
							return;
						}
					}
					//몹 정리
					if (event.getCause() == DamageCause.DROWNING) {
						if (event.getEntity() instanceof Mob) {
							Mob mob = (Mob) event.getEntity();
							mob.remove();
						}
					} else if (event.getCause() == DamageCause.SUFFOCATION) {
						if (event.getEntity() instanceof Mob) {
							Mob mob = (Mob) event.getEntity();
							mob.remove();
						}
					} else if (event.getCause() == DamageCause.VOID) {
						if (event.getEntity() instanceof Mob) {
							Mob mob = (Mob) event.getEntity();
							mob.remove();
						}
					}
				} catch (Exception e) {

				}
			}
		} catch (Exception e) {

		}
		
		//Change Name Color
		try {
			if(!(event.getEntity() instanceof Player)) {
				if (((LivingEntity) event.getEntity()).getHealth() - event.getFinalDamage() <= ((LivingEntity) event.getEntity()).getMaxHealth() / 5) {
					String name = event.getEntity().getCustomName().substring(2);
					String[] nameAry = name.split("L");
					event.getEntity().setCustomName(ChatColor.RED + nameAry[0] + "L" + nameAry[1]);
				} else if (((LivingEntity) event.getEntity()).getHealth() - event.getFinalDamage() <= ((LivingEntity) event.getEntity()).getMaxHealth() / 2) {
					String name = event.getEntity().getCustomName().substring(2);
					String[] nameAry = name.split("L");
					event.getEntity().setCustomName(ChatColor.YELLOW + nameAry[0] + "L" + nameAry[1]);
				} else if (((LivingEntity) event.getEntity()).getHealth() - event.getFinalDamage() <= ((LivingEntity) event.getEntity()).getMaxHealth()) {
					String name = event.getEntity().getCustomName().substring(2);
					String[] nameAry = name.split("L");
					event.getEntity().setCustomName(ChatColor.WHITE + nameAry[0] + "L" + nameAry[1]);
				}
			}
		} catch (Exception e) {

		}
		
		// 연습 상대
		if(event.getEntity().getType() == EntityType.MUSHROOM_COW) {
			event.getEntity().setCustomName(Integer.toString((int) event.getFinalDamage()));
			event.getEntity().setCustomNameVisible(true);
			((LivingEntity) event.getEntity()).setHealth(999999999);
		}
		
		// 보스바
		try {
			if(!(event.getEntity() instanceof Player)) {
				Entity mob = event.getEntity();
				// 코낭그
				if (mob.getCustomName().substring(2).equalsIgnoreCase("코낭그" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar1().getPlayers()) {
							new BossHealth().getBar1().setProgress(0);
							new BossHealth().getBar1().removePlayer(p);
						}
					} else {
						new BossHealth().getBar1().setProgress((boss.getHealth()-event.getFinalDamage()) / 700000.0);
					}
				}
				// 탑 1층
				if (mob.getCustomName().substring(2).equalsIgnoreCase("1층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar2().getPlayers()) {
							new BossHealth().getBar2().setProgress(0);
							new BossHealth().getBar2().removePlayer(p);
						}
					} else {
						new BossHealth().getBar2().setProgress((boss.getHealth()-event.getFinalDamage()) / 250000.0);
					}
				}
				// 탑 2층
				if (mob.getCustomName().substring(2).equalsIgnoreCase("2층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar3().getPlayers()) {
							new BossHealth().getBar3().setProgress(0);
							new BossHealth().getBar3().removePlayer(p);
						}
					} else {
						new BossHealth().getBar3().setProgress((boss.getHealth()-event.getFinalDamage()) / 600000.0);
					}
				}
				// 탑 3층
				if (mob.getCustomName().substring(2).equalsIgnoreCase("3층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar4().getPlayers()) {
							new BossHealth().getBar4().setProgress(0);
							new BossHealth().getBar4().removePlayer(p);
						}
					} else {
						new BossHealth().getBar4().setProgress((boss.getHealth()-event.getFinalDamage()) / 1200000.0);
					}
				}
				// 아덴
				if (mob.getCustomName().substring(2).equalsIgnoreCase("아덴" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar5().getPlayers()) {
							new BossHealth().getBar5().setProgress(0);
							new BossHealth().getBar5().removePlayer(p);
						}
					} else {
						new BossHealth().getBar5().setProgress((boss.getHealth()-event.getFinalDamage()) / 20000.0);
					}
				}
				// 특급 요리사
				if (mob.getCustomName().substring(2).equalsIgnoreCase("특급 요리사" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar6().getPlayers()) {
							new BossHealth().getBar6().setProgress(0);
							new BossHealth().getBar6().removePlayer(p);
						}
					} else {
						new BossHealth().getBar6().setProgress((boss.getHealth()-event.getFinalDamage()) / 100000.0);
					}
				}
				// 케흘렌
				if (mob.getCustomName().substring(2).equalsIgnoreCase("케흘렌" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar7().getPlayers()) {
							new BossHealth().getBar7().setProgress(0);
							new BossHealth().getBar7().removePlayer(p);
						}
					} else {
						new BossHealth().getBar7().setProgress((boss.getHealth()-event.getFinalDamage()) / 120000.0);
					}
				}
				// 발로르
				if (mob.getCustomName().substring(2).equalsIgnoreCase("발로르" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar8().getPlayers()) {
							new BossHealth().getBar8().setProgress(0);
							new BossHealth().getBar8().removePlayer(p);
						}
					} else {
						new BossHealth().getBar8().setProgress((boss.getHealth()-event.getFinalDamage()) / 200000.0);
					}
				}
				// 티타니아
				if (mob.getCustomName().substring(2).equalsIgnoreCase("요정여왕 티타니아" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar9().getPlayers()) {
							new BossHealth().getBar9().setProgress(0);
							new BossHealth().getBar9().removePlayer(p);
						}
					} else {
						new BossHealth().getBar9().setProgress((boss.getHealth()-event.getFinalDamage()) / 35000.0);
					}
				}
				// 오베론
				if (mob.getCustomName().substring(2).equalsIgnoreCase("요정왕 오베론" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar10().getPlayers()) {
							new BossHealth().getBar10().setProgress(0);
							new BossHealth().getBar10().removePlayer(p);
						}
					} else {
						new BossHealth().getBar10().setProgress((boss.getHealth()-event.getFinalDamage()) / 35000.0);
					}
				}
				// 아라크네
				if (mob.getCustomName().substring(2).equalsIgnoreCase("아라크네" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar11().getPlayers()) {
							new BossHealth().getBar11().setProgress(0);
							new BossHealth().getBar11().removePlayer(p);
						}
					} else {
						new BossHealth().getBar11().setProgress((boss.getHealth()-event.getFinalDamage()) / 1200000.0);
					}
				}
				// 석상 파수꾼
				if (mob.getCustomName().substring(2).equalsIgnoreCase("석상 파수꾼" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar12().getPlayers()) {
							new BossHealth().getBar12().setProgress(0);
							new BossHealth().getBar12().removePlayer(p);
						}
					} else {
						new BossHealth().getBar12().setProgress((boss.getHealth()-event.getFinalDamage()) / 2000000.0);
					}
				}
				// 레티아리우스
				if (mob.getCustomName().substring(2).equalsIgnoreCase("레티아리우스" + ChatColor.YELLOW + " [Lv.??]")) {
				
					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar14().getPlayers()) {
							new BossHealth().getBar14().setProgress(0);
							new BossHealth().getBar14().removePlayer(p);
						}
					} else {
						new BossHealth().getBar14().setProgress((boss.getHealth()-event.getFinalDamage()) / 20.0);
					}
				}
				// 갈리
				if (mob.getCustomName().substring(2).equalsIgnoreCase("갈리" + ChatColor.YELLOW + " [Lv.??]")) {
				
					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar15().getPlayers()) {
							new BossHealth().getBar15().setProgress(0);
							new BossHealth().getBar15().removePlayer(p);
						}
					} else {
						new BossHealth().getBar15().setProgress((boss.getHealth()-event.getFinalDamage()) / 30.0);
					}
				}
				// 디마카에루스
				if (mob.getCustomName().substring(2).equalsIgnoreCase("디마카에루스" + ChatColor.YELLOW + " [Lv.??]")) {
				
					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar16().getPlayers()) {
							new BossHealth().getBar16().setProgress(0);
							new BossHealth().getBar16().removePlayer(p);
						}
					} else {
						new BossHealth().getBar16().setProgress((boss.getHealth()-event.getFinalDamage()) / 40.0);
					}
				}
				// 프라에그나리
				if (mob.getCustomName().substring(2).equalsIgnoreCase("프라에그나리" + ChatColor.YELLOW + " [Lv.??]")) {
				
					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar17().getPlayers()) {
							new BossHealth().getBar17().setProgress(0);
							new BossHealth().getBar17().removePlayer(p);
						}
					} else {
						new BossHealth().getBar17().setProgress((boss.getHealth()-event.getFinalDamage()) / 50.0);
					}
				}
				// 4층의 지배자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("4층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar18().getPlayers()) {
							new BossHealth().getBar18().setProgress(0);
							new BossHealth().getBar18().removePlayer(p);
						}
					} else {
						new BossHealth().getBar18().setProgress((boss.getHealth()-event.getFinalDamage()) / 1600000.0);
					}
				}
				// 5층의 지배자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("5층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar19().getPlayers()) {
							new BossHealth().getBar19().setProgress(0);
							new BossHealth().getBar19().removePlayer(p);
						}
					} else {
						new BossHealth().getBar19().setProgress((boss.getHealth()-event.getFinalDamage()) / 3000000.0);
					}
				}
				// 되살아난 피르볼그의 제사장
				if (mob.getCustomName().substring(2).equalsIgnoreCase("되살아난 피르볼그의 제사장" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar20().getPlayers()) {
							new BossHealth().getBar20().setProgress(0);
							new BossHealth().getBar20().removePlayer(p);
						}
					} else {
						new BossHealth().getBar20().setProgress((boss.getHealth()-event.getFinalDamage()) / 3500000.0);
					}
				}
				// 미아즈마
				if (mob.getCustomName().substring(2).equalsIgnoreCase("미아즈마" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar21().getPlayers()) {
							new BossHealth().getBar21().setProgress(0);
							new BossHealth().getBar21().removePlayer(p);
						}
					} else {
						new BossHealth().getBar21().setProgress((boss.getHealth()-event.getFinalDamage()) / 3000000.0);
					}
				}
				// 와우
				if (mob.getCustomName().substring(2).equalsIgnoreCase("와우" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar22().getPlayers()) {
							new BossHealth().getBar22().setProgress(0);
							new BossHealth().getBar22().removePlayer(p);
						}
					} else {
						new BossHealth().getBar22().setProgress((boss.getHealth()-event.getFinalDamage()) / 4000000.0);
					}
				}
				// 공양을 받는 돼지
				if (mob.getCustomName().substring(2).equalsIgnoreCase("공양을 받는 돼지" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar23().getPlayers()) {
							new BossHealth().getBar23().setProgress(0);
							new BossHealth().getBar23().removePlayer(p);
						}
					} else {
						new BossHealth().getBar23().setProgress((boss.getHealth()-event.getFinalDamage()) / 5000000.0);
					}
				}
				// 아빠 상어
				if (mob.getCustomName().substring(2).equalsIgnoreCase("아빠 상어" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar24().getPlayers()) {
							new BossHealth().getBar24().setProgress(0);
							new BossHealth().getBar24().removePlayer(p);
						}
					} else {
						new BossHealth().getBar24().setProgress((boss.getHealth()-event.getFinalDamage()) / 7000000.0);
					}
				}
				// 해왕신 포세이돈
				if (mob.getCustomName().substring(2).equalsIgnoreCase("해왕신 포세이돈" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar25().getPlayers()) {
							new BossHealth().getBar25().setProgress(0);
							new BossHealth().getBar25().removePlayer(p);
						}
					} else {
						new BossHealth().getBar25().setProgress((boss.getHealth()-event.getFinalDamage()) / 15000000.0);
					}
				}
				// 6층의 지배자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("6층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar26().getPlayers()) {
							new BossHealth().getBar26().setProgress(0);
							new BossHealth().getBar26().removePlayer(p);
						}
					} else {
						new BossHealth().getBar26().setProgress((boss.getHealth()-event.getFinalDamage()) / 3800000.0);
					}
				}
				// 7층의 지배자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("7층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar27().getPlayers()) {
							new BossHealth().getBar27().setProgress(0);
							new BossHealth().getBar27().removePlayer(p);
						}
					} else {
						new BossHealth().getBar27().setProgress((boss.getHealth()-event.getFinalDamage()) / 5500000.0);
					}
				}
				// 8층의 지배자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("8층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar28().getPlayers()) {
							new BossHealth().getBar28().setProgress(0);
							new BossHealth().getBar28().removePlayer(p);
						}
					} else {
						new BossHealth().getBar28().setProgress((boss.getHealth()-event.getFinalDamage()) / 3800000.0);
					}
				}
				// 9층의 지배자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("9층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar29().getPlayers()) {
							new BossHealth().getBar29().setProgress(0);
							new BossHealth().getBar29().removePlayer(p);
						}
					} else {
						new BossHealth().getBar29().setProgress((boss.getHealth()-event.getFinalDamage()) / 3800000.0);
					}
				}
				// 10층의 지배자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("10층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar30().getPlayers()) {
							new BossHealth().getBar30().setProgress(0);
							new BossHealth().getBar30().removePlayer(p);
						}
					} else {
						new BossHealth().getBar30().setProgress((boss.getHealth()-event.getFinalDamage()) / 3800000.0);
					}
				}
				// 11층의 지배자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("11층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar31().getPlayers()) {
							new BossHealth().getBar31().setProgress(0);
							new BossHealth().getBar31().removePlayer(p);
						}
					} else {
						new BossHealth().getBar31().setProgress((boss.getHealth()-event.getFinalDamage()) / 3800000.0);
					}
				}
				// 12층의 지배자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("12층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar32().getPlayers()) {
							new BossHealth().getBar32().setProgress(0);
							new BossHealth().getBar32().removePlayer(p);
						}
					} else {
						new BossHealth().getBar32().setProgress((boss.getHealth()-event.getFinalDamage()) / 3800000.0);
					}
				}
				// 숲의 심판자
				if (mob.getCustomName().substring(2).equalsIgnoreCase("숲의 심판자" + ChatColor.YELLOW + " [Lv.??]")) {
					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar33().getPlayers()) {
							new BossHealth().getBar33().setProgress(0);
							new BossHealth().getBar33().removePlayer(p);
						}
					} else {
						new BossHealth().getBar33().setProgress((boss.getHealth()-event.getFinalDamage()) / 4000000.0);
					}
				}
				// 유적의 주인?
				if (mob.getCustomName().substring(2).equalsIgnoreCase("유적의 주인?" + ChatColor.YELLOW + " [Lv.10000]")) {
					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar34().getPlayers()) {
							new BossHealth().getBar34().setProgress(0);
							new BossHealth().getBar34().removePlayer(p);
						}
					} else {
						new BossHealth().getBar34().setProgress((boss.getHealth()-event.getFinalDamage()) / 100000000.0);
					}
				}
			}
		} catch(Exception e) {
			
		}
		
		// 부활
		try {
			if (event.getEntity() instanceof Player) {
				Player player = (Player) event.getEntity();
				if(player.getHealth() <= event.getFinalDamage()) {
					
					int num = 0;
					num += new SpecialEffect().a10120(player);
					num += new SpecialEffect().s7(player);
					
					if(rnd.nextInt(100) < num) {
						player.setHealth(10);
						event.setDamage(0);
					}
					
				}
			}
		} catch(Exception e) {
			
		}
		
		// 데미지 표기
		try {
			if(event.getEntity() instanceof Mob) {
				Entity entity = event.getEntity();
				
				int damage = (int)event.getFinalDamage();
				
				if(damage > 0 && !(event.getCause() == DamageCause.ENTITY_ATTACK) && !(event.getCause() == DamageCause.ENTITY_SWEEP_ATTACK)) {
					ArmorStand damageSign = (ArmorStand) entity.getWorld().spawnEntity(entity.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
					damageSign.setVisible(false);
					damageSign.setSmall(true);
					
					if(damage < 100) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#808080") + Integer.toString(damage));
					} else if(damage < 200) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#B4B4B4") + Integer.toString(damage));
					} else if(damage < 300) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#E5E5E5") + Integer.toString(damage));
					} else if(damage < 400) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#EFEFEF") + Integer.toString(damage));
					} else if(damage < 500) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#FFFFFF") + Integer.toString(damage));
					} else if(damage < 600) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#f2ffeb") + Integer.toString(damage));
					} else if(damage < 700) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#e0ffcf") + Integer.toString(damage));
					} else if(damage < 800) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ccffb0") + Integer.toString(damage));
					} else if(damage < 900) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#b3ff8a") + Integer.toString(damage));
					} else if(damage < 1000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#9dff69") + Integer.toString(damage));
					} else if(damage < 2000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#7fff3b") + Integer.toString(damage));
					} else if(damage < 3000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#1aff00") + Integer.toString(damage));
					} else if(damage < 4000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00ff77") + Integer.toString(damage));
					} else if(damage < 5000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00ffc3") + Integer.toString(damage));
					} else if(damage < 6000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00fff7") + Integer.toString(damage));
					} else if(damage < 7000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00d0ff") + Integer.toString(damage));
					} else if(damage < 8000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00aeff") + Integer.toString(damage));
					} else if(damage < 9000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#008cff") + Integer.toString(damage));
					} else if(damage < 10000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#0062ff") + Integer.toString(damage));
					} else if(damage < 20000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#002aff") + Integer.toString(damage));
					} else if(damage < 30000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#3c00ff") + Integer.toString(damage));
					} else if(damage < 40000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#8c00ff") + Integer.toString(damage));
					} else if(damage < 50000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#c300ff") + Integer.toString(damage));
					} else if(damage < 60000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff00f7") + Integer.toString(damage));
					} else if(damage < 70000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff00b3") + Integer.toString(damage));
					} else if(damage < 80000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff0080") + Integer.toString(damage));
					} else if(damage < 90000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff0048") + Integer.toString(damage));
					} else if(damage < 100000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff0000") + Integer.toString(damage));
					} else if(damage < 200000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ab0000") + Integer.toString(damage));
					} else if(damage < 300000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#630000") + Integer.toString(damage));
					} else if(damage < 400000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#8f0062") + Integer.toString(damage));
					} else if(damage < 500000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#70008f") + Integer.toString(damage));
					} else if(damage < 600000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#420054") + Integer.toString(damage));
					} else if(damage < 10000000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + ChatColor.MAGIC + Integer.toString(damage));
					} else {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ffffff") + Integer.toString(damage));
					}
					damageSign.setCustomNameVisible(true);
					damageSign.setGravity(false);
					damageSign.setRemoveWhenFarAway(true);
					
					new BukkitRunnable() {
						int time = 0;
						
						@Override
						public void run() {
							time++;
							damageSign.teleport(damageSign.getLocation().add(0,0.02,0));
							
							if(time >= 30) {
								damageSign.remove();
								this.cancel();
							}
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
				}
			}		 
		} catch(Exception e) {
			
		}
		
	}
	
	@EventHandler
	public void mouseEvent(PlayerInteractEvent event) {
		// horse
		try {
			EquipmentSlot e = event.getHand();
			if (e.equals(EquipmentSlot.HAND)) {
				Player player = event.getPlayer();
				if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
					ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
					Material type = player.getInventory().getItemInMainHand().getType();
					if (type == Material.SADDLE) {
						if(player.getVehicle() == null) {
							HorseOwner ho = new HorseOwner();
							if(ho.already(player)) {
								try {
									ho.returnHorse(player).remove();
								} catch(Exception e2) {
									
								}
								ho.remove(player);
							}
							if(im.getDisplayName().equals(ChatColor.GRAY + "갈색마")) {
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
								Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
								horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
								horse.setCustomNameVisible(true);
								horse.setBreed(false);
								horse.setMaxHealth(1);
								horse.setNoDamageTicks(Integer.MAX_VALUE);
								horse.setAdult();
								horse.setTamed(true);
								horse.setOwner(player);
								horse.setRemoveWhenFarAway(true);
								horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
								ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
								ItemMeta barIm = bar.getItemMeta();
								barIm.setDisplayName(ChatColor.RED + " ");
								barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
								bar.setItemMeta(barIm);
								horse.getInventory().setArmor(bar);
								int num = rnd.nextInt(100);
								if(num < 60) {
									horse.setStyle(Horse.Style.NONE);
								} else if(num < 80) {
									horse.setStyle(Horse.Style.WHITE);
								} else if(num < 90) {
									horse.setStyle(Horse.Style.WHITEFIELD);
								} else if(num < 99) {
									horse.setStyle(Horse.Style.WHITE_DOTS);
								} else if(num < 100) {
									horse.setStyle(Horse.Style.BLACK_DOTS);
								}
								horse.setColor(Horse.Color.BROWN);
								horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.2);
								ho.put(player, horse);
							}
							if(im.getDisplayName().equals(ChatColor.WHITE + "검갈마")) {
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
								Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
								horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
								horse.setCustomNameVisible(true);
								horse.setBreed(false);
								horse.setMaxHealth(1);
								horse.setNoDamageTicks(Integer.MAX_VALUE);
								horse.setAdult();
								horse.setTamed(true);
								horse.setOwner(player);
								horse.setRemoveWhenFarAway(true);
								horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
								ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
								ItemMeta barIm = bar.getItemMeta();
								barIm.setDisplayName(ChatColor.RED + " ");
								barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
								bar.setItemMeta(barIm);
								horse.getInventory().setArmor(bar);
								int num = rnd.nextInt(100);
								if(num < 60) {
									horse.setStyle(Horse.Style.NONE);
								} else if(num < 80) {
									horse.setStyle(Horse.Style.WHITE);
								} else if(num < 90) {
									horse.setStyle(Horse.Style.WHITEFIELD);
								} else if(num < 99) {
									horse.setStyle(Horse.Style.WHITE_DOTS);
								} else if(num < 100) {
									horse.setStyle(Horse.Style.BLACK_DOTS);
								}
								horse.setColor(Horse.Color.DARK_BROWN);
								horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.23);
								ho.put(player, horse);
							}
							if(im.getDisplayName().equals(ChatColor.YELLOW + "황갈마")) {
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
								Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
								horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
								horse.setCustomNameVisible(true);
								horse.setBreed(false);
								horse.setMaxHealth(1);
								horse.setNoDamageTicks(Integer.MAX_VALUE);
								horse.setAdult();
								horse.setTamed(true);
								horse.setOwner(player);
								horse.setRemoveWhenFarAway(true);
								horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
								ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
								ItemMeta barIm = bar.getItemMeta();
								barIm.setDisplayName(ChatColor.RED + " ");
								barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
								bar.setItemMeta(barIm);
								horse.getInventory().setArmor(bar);
								int num = rnd.nextInt(100);
								if(num < 60) {
									horse.setStyle(Horse.Style.NONE);
								} else if(num < 80) {
									horse.setStyle(Horse.Style.WHITE);
								} else if(num < 90) {
									horse.setStyle(Horse.Style.WHITEFIELD);
								} else if(num < 99) {
									horse.setStyle(Horse.Style.WHITE_DOTS);
								} else if(num < 100) {
									horse.setStyle(Horse.Style.BLACK_DOTS);
								}
								horse.setColor(Horse.Color.CREAMY);
								horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.26);
								ho.put(player, horse);
							}
							if(im.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "회색마")) {
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
								Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
								horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
								horse.setCustomNameVisible(true);
								horse.setBreed(false);
								horse.setMaxHealth(1);
								horse.setNoDamageTicks(Integer.MAX_VALUE);
								horse.setAdult();
								horse.setTamed(true);
								horse.setOwner(player);
								horse.setRemoveWhenFarAway(true);
								horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
								ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
								ItemMeta barIm = bar.getItemMeta();
								barIm.setDisplayName(ChatColor.RED + " ");
								barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
								bar.setItemMeta(barIm);
								horse.getInventory().setArmor(bar);
								int num = rnd.nextInt(100);
								if(num < 60) {
									horse.setStyle(Horse.Style.NONE);
								} else if(num < 80) {
									horse.setStyle(Horse.Style.WHITE);
								} else if(num < 90) {
									horse.setStyle(Horse.Style.WHITEFIELD);
								} else if(num < 99) {
									horse.setStyle(Horse.Style.WHITE_DOTS);
								} else if(num < 100) {
									horse.setStyle(Horse.Style.BLACK_DOTS);
								}
								horse.setColor(Horse.Color.GRAY);
								horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.29);
								ho.put(player, horse);
							}
							if(im.getDisplayName().equals(ChatColor.AQUA + "황금갈기마")) {
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
								Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
								horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
								horse.setCustomNameVisible(true);
								horse.setBreed(false);
								horse.setMaxHealth(1);
								horse.setNoDamageTicks(Integer.MAX_VALUE);
								horse.setAdult();
								horse.setTamed(true);
								horse.setOwner(player);
								horse.setRemoveWhenFarAway(true);
								horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
								ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
								ItemMeta barIm = bar.getItemMeta();
								barIm.setDisplayName(ChatColor.RED + " ");
								barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
								bar.setItemMeta(barIm);
								horse.getInventory().setArmor(bar);
								int num = rnd.nextInt(100);
								if(num < 60) {
									horse.setStyle(Horse.Style.NONE);
								} else if(num < 80) {
									horse.setStyle(Horse.Style.WHITE);
								} else if(num < 90) {
									horse.setStyle(Horse.Style.WHITEFIELD);
								} else if(num < 99) {
									horse.setStyle(Horse.Style.WHITE_DOTS);
								} else if(num < 100) {
									horse.setStyle(Horse.Style.BLACK_DOTS);
								}
								horse.setColor(Horse.Color.CHESTNUT);
								horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.32);
								ho.put(player, horse);
							}
							if(im.getDisplayName().equals(ChatColor.DARK_RED + "흑마")) {
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
								Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
								horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
								horse.setCustomNameVisible(true);
								horse.setBreed(false);
								horse.setMaxHealth(1);
								horse.setNoDamageTicks(Integer.MAX_VALUE);
								horse.setAdult();
								horse.setTamed(true);
								horse.setOwner(player);
								horse.setRemoveWhenFarAway(true);
								horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
								ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
								ItemMeta barIm = bar.getItemMeta();
								barIm.setDisplayName(ChatColor.RED + " ");
								barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
								bar.setItemMeta(barIm);
								horse.getInventory().setArmor(bar);
								int num = rnd.nextInt(100);
								if(num < 60) {
									horse.setStyle(Horse.Style.NONE);
								} else if(num < 80) {
									horse.setStyle(Horse.Style.WHITE);
								} else if(num < 90) {
									horse.setStyle(Horse.Style.WHITEFIELD);
								} else if(num < 99) {
									horse.setStyle(Horse.Style.WHITE_DOTS);
								} else if(num < 100) {
									horse.setStyle(Horse.Style.BLACK_DOTS);
								}
								horse.setColor(Horse.Color.BLACK);
								horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.35);
								ho.put(player, horse);
							}
							if(im.getDisplayName().equals(ChatColor.DARK_PURPLE + "백마")) {
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 0.5f, 1.0f);
								player.getWorld().playSound(player.getLocation(), Sound.ENTITY_HORSE_AMBIENT, 8.0f, 1.0f);
								Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
								horse.setCustomName(ChatColor.GRAY + "" + player.getDisplayName() + "'s horse");
								horse.setCustomNameVisible(true);
								horse.setBreed(false);
								horse.setMaxHealth(1);
								horse.setNoDamageTicks(Integer.MAX_VALUE);
								horse.setAdult();
								horse.setTamed(true);
								horse.setOwner(player);
								horse.setRemoveWhenFarAway(true);
								horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
								ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
								ItemMeta barIm = bar.getItemMeta();
								barIm.setDisplayName(ChatColor.RED + " ");
								barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
								barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
								bar.setItemMeta(barIm);
								horse.getInventory().setArmor(bar);
								int num = rnd.nextInt(100);
								if(num < 60) {
									horse.setStyle(Horse.Style.NONE);
								} else if(num < 80) {
									horse.setStyle(Horse.Style.WHITE);
								} else if(num < 90) {
									horse.setStyle(Horse.Style.WHITEFIELD);
								} else if(num < 99) {
									horse.setStyle(Horse.Style.WHITE_DOTS);
								} else if(num < 100) {
									horse.setStyle(Horse.Style.BLACK_DOTS);
								}
								horse.setColor(Horse.Color.WHITE);
								horse.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.38);
								ho.put(player, horse);
							}
						}
						event.setCancelled(true);
						return;
					}
				}
			}
		} catch (Exception e) {

		}
		// 장비 착용
		try {
			EquipmentSlot e = event.getHand();
			if (e.equals(EquipmentSlot.HAND)) {
				Player player = event.getPlayer();
				if ((event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) && player.isOp() == false) {
					Material type = player.getInventory().getItemInMainHand().getType();
					if((type == Material.LEATHER_HELMET) || (type == Material.LEATHER_CHESTPLATE) || (type == Material.LEATHER_LEGGINGS) || (type == Material.LEATHER_BOOTS) 
							|| (type == Material.CHAINMAIL_HELMET) || (type == Material.CHAINMAIL_CHESTPLATE) || (type == Material.CHAINMAIL_LEGGINGS) || (type == Material.CHAINMAIL_BOOTS)
							|| (type == Material.IRON_HELMET) || (type == Material.IRON_CHESTPLATE) || (type == Material.IRON_LEGGINGS) || (type == Material.IRON_BOOTS)
							|| (type == Material.GOLDEN_HELMET) || (type == Material.GOLDEN_CHESTPLATE) || (type == Material.GOLDEN_LEGGINGS) || (type == Material.GOLDEN_BOOTS)
							|| (type == Material.DIAMOND_HELMET) || (type == Material.DIAMOND_CHESTPLATE) || (type == Material.DIAMOND_LEGGINGS) || (type == Material.DIAMOND_BOOTS)
							|| (type == Material.NETHERITE_HELMET) || (type == Material.NETHERITE_CHESTPLATE) || (type == Material.NETHERITE_LEGGINGS) || (type == Material.NETHERITE_BOOTS)
							|| (type == Material.PLAYER_HEAD) || (type == Material.EGG) || (type == Material.RED_DYE) || (type == Material.GREEN_DYE) || (type == Material.CYAN_DYE) 
							|| (type == Material.LIGHT_GRAY_DYE) || (type == Material.GRAY_DYE) || (type == Material.PINK_DYE) || (type == Material.LIME_DYE) 
							|| (type == Material.YELLOW_DYE) || (type == Material.LIGHT_BLUE_DYE) || (type == Material.MAGENTA_DYE) || (type == Material.ORANGE_DYE) 
							|| (type == Material.BLUE_DYE) || (type == Material.BROWN_DYE) || (type == Material.BLACK_DYE)) {
						event.setCancelled(true);
					}
				}
			}
		} catch (Exception e) {

		}
		//다락문 등 막기
		try {
			EquipmentSlot e = event.getHand (); 
	        if (e.equals (EquipmentSlot.HAND)) {
	    		Player player = event.getPlayer();
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    			Block block = event.getClickedBlock();
	    			if(block.getType() == Material.OAK_TRAPDOOR || block.getType() == Material.SPRUCE_TRAPDOOR || block.getType() == Material.BIRCH_TRAPDOOR 
	    					|| block.getType() == Material.JUNGLE_TRAPDOOR || block.getType() == Material.ACACIA_TRAPDOOR || block.getType() == Material.DARK_OAK_TRAPDOOR
	    					|| block.getType() == Material.WARPED_TRAPDOOR || block.getType() == Material.TRAPPED_CHEST || block.getType() == Material.ITEM_FRAME
	    					|| block.getType() == Material.ACACIA_FENCE_GATE || block.getType() == Material.BIRCH_FENCE_GATE || block.getType() == Material.CRIMSON_FENCE_GATE
	    					|| block.getType() == Material.DARK_OAK_FENCE_GATE || block.getType() == Material.JUNGLE_FENCE_GATE || block.getType() == Material.OAK_FENCE_GATE
	    					|| block.getType() == Material.SPRUCE_FENCE_GATE || block.getType() == Material.WARPED_FENCE_GATE) {
	    				if(!(player.getGameMode() == GameMode.CREATIVE && player.isOp())) {
	    					event.setCancelled(true);
	    				}
	    			}
	    		}
	        }
		} catch(Exception e) {
			
		}
		//커맨드형 스킬
		try {
			EquipmentSlot e = event.getHand(); 
	        if (e.equals (EquipmentSlot.HAND)) {
	        	Player player = event.getPlayer();
	        	try {	    
	    			if(player.getVehicle() == null) {
	    				if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        				Inventory inv = player.getInventory();
	        				ItemStack item = player.getInventory().getItemInMainHand();
	        				if(inv.contains(Material.CLAY_BALL) || inv.contains(Material.GLOWSTONE_DUST)) {
	        					if(item.getType() == Material.DEAD_BRAIN_CORAL_BLOCK || item.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK || item.getType() == Material.DEAD_FIRE_CORAL_BLOCK
	        							|| item.getType() == Material.DEAD_HORN_CORAL_BLOCK || item.getType() == Material.DEAD_TUBE_CORAL_BLOCK) {
	        						MouseClickForSkill mc = new MouseClickForSkill();
	        						int time = mc.getTime(player);
	        						if(time==0) {
	        							mc.click(player, "R");
	        						} else {
	        							mc.click(player, "R", time);
	        						}
	        					}
	        				}
	        				if(inv.contains(Material.INK_SAC)) {
	        					if(item.getType() == Material.BRAIN_CORAL_BLOCK || item.getType() == Material.BUBBLE_CORAL_BLOCK || item.getType() == Material.FIRE_CORAL_BLOCK
	        							|| item.getType() == Material.HORN_CORAL_BLOCK || item.getType() == Material.TUBE_CORAL_BLOCK) {
	        						MouseClickForSkill mc = new MouseClickForSkill();
	        						int time = mc.getTime(player);
	        						if(time==0) {
	        							mc.click(player, "R");
	        						} else {
	        							mc.click(player, "R", time);
	        						}
	        					}
	        				}
	        				if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BLACK_DYE) || inv.contains(Material.GREEN_DYE) 
	        						|| inv.contains(Material.LAPIS_LAZULI) || inv.contains(Material.CYAN_DYE) || inv.contains(Material.LIGHT_GRAY_DYE) 
	        						|| inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE) 
	        						|| inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.BROWN_DYE)) {
	        					if(item.getType() == Material.WOODEN_SWORD
	        							|| item.getType() == Material.STONE_SWORD
	        							|| item.getType() == Material.IRON_SWORD
	        							|| item.getType() == Material.GOLDEN_SWORD
	        							|| item.getType() == Material.DIAMOND_SWORD
	        							|| item.getType() == Material.NETHERITE_SWORD
	        							|| item.getType() == Material.OAK_LEAVES
	        							|| item.getType() == Material.SPRUCE_LEAVES
	        							|| item.getType() == Material.BIRCH_LEAVES
	        							|| item.getType() == Material.JUNGLE_LEAVES
	        							|| item.getType() == Material.ACACIA_LEAVES
	        							|| item.getType() == Material.DARK_OAK_LEAVES
	        							|| item.getType() == Material.COBBLESTONE_WALL
	        							|| item.getType() == Material.MOSSY_COBBLESTONE_WALL
	        							|| item.getType() == Material.BROWN_CARPET
	        							|| item.getType() == Material.GREEN_CARPET
	        							|| item.getType() == Material.BLACK_CARPET
	        							|| item.getType() == Material.STONE
	        							|| item.getType() == Material.OAK_PLANKS
	        							|| item.getType() == Material.SPRUCE_PLANKS
	        							|| item.getType() == Material.BIRCH_PLANKS
	        							|| item.getType() == Material.JUNGLE_PLANKS
	        							|| item.getType() == Material.ACACIA_PLANKS
	        							|| item.getType() == Material.DARK_OAK_PLANKS
	        							|| item.getType() == Material.BEDROCK
	        							|| item.getType() == Material.SPRUCE_LOG
	        							|| item.getType() == Material.BIRCH_LOG
	        							|| item.getType() == Material.JUNGLE_LOG
	        							|| item.getType() == Material.ACACIA_LOG
	        							|| item.getType() == Material.DARK_OAK_LOG
	        							|| item.getType() == Material.SANDSTONE
	        							|| item.getType() == Material.CHISELED_SANDSTONE
	        							|| item.getType() == Material.CUT_SANDSTONE
	        							|| item.getType() == Material.LAPIS_BLOCK
	        							|| item.getType() == Material.MAGENTA_WOOL
	        							|| item.getType() == Material.LIME_WOOL
	        							|| item.getType() == Material.GRAY_WOOL
	        							|| item.getType() == Material.LIGHT_GRAY_WOOL
	        							|| item.getType() == Material.CYAN_WOOL
	        							|| item.getType() == Material.PURPLE_WOOL
	        							|| item.getType() == Material.OAK_SLAB
	        							|| item.getType() == Material.SPRUCE_SLAB
	        							|| item.getType() == Material.BIRCH_SLAB
	        							|| item.getType() == Material.JUNGLE_SLAB
	        							|| item.getType() == Material.ACACIA_SLAB
	        							|| item.getType() == Material.DARK_OAK_SLAB
	        							|| item.getType() == Material.STONE_SLAB
	        							|| item.getType() == Material.COBBLESTONE_SLAB
	        							|| item.getType() == Material.STONE_BRICK_SLAB
	        							|| item.getType() == Material.NETHER_BRICK_SLAB
	        							|| item.getType() == Material.QUARTZ_SLAB
	        							|| item.getType() == Material.RED_SANDSTONE
	        							|| item.getType() == Material.RED_SANDSTONE_SLAB
	        							|| item.getType() == Material.SMOOTH_RED_SANDSTONE
	        							|| item.getType() == Material.OBSIDIAN
	        							|| item.getType() == Material.SMOOTH_SANDSTONE
	        							|| item.getType() == Material.CHISELED_RED_SANDSTONE
	        							|| item.getType() == Material.CUT_RED_SANDSTONE
	        							|| item.getType() == Material.RED_SANDSTONE_STAIRS
	        							|| item.getType() == Material.STONE_STAIRS) {
	        						MouseClickForSkill mc = new MouseClickForSkill();
	        						int time = mc.getTime(player);
	        						if(time==0) {
	        							mc.click(player, "R");
	        						} else {
	        							mc.click(player, "R", time);
	        						}
	        					}
	        				}
	        				if(inv.contains(Material.RED_DYE)) {
	        					if(item.getType() == Material.BONE) {
	        						MouseClickForSkill mc = new MouseClickForSkill();
	        						int time = mc.getTime(player);
	        						if(time==0) {
	        							mc.click(player, "R");
	        						} else {
	        							mc.click(player, "R", time);
	        						}
	        					}
	        				}
	        				if(inv.contains(Material.MAGENTA_DYE)) {
	        					if(item.getType() == Material.WOODEN_PICKAXE 
	        							|| item.getType() == Material.STONE_PICKAXE
	        							|| item.getType() == Material.IRON_PICKAXE
	        							|| item.getType() == Material.GOLDEN_PICKAXE
	        							|| item.getType() == Material.DIAMOND_PICKAXE
	        							|| item.getType() == Material.NETHERITE_PICKAXE) {
	        						MouseClickForSkill mc = new MouseClickForSkill();
	        						int time = mc.getTime(player);
	        						if(time==0) {
	        							mc.click(player, "R");
	        						} else {
	        							mc.click(player, "R", time);
	        						}
	        					}
	        				}
	        				if(inv.contains(Material.ORANGE_DYE)) {
	        					if(item.getType() == Material.WOODEN_HOE
	        							|| item.getType() == Material.STONE_HOE
	        							|| item.getType() == Material.IRON_HOE
	        							|| item.getType() == Material.GOLDEN_HOE
	        							|| item.getType() == Material.DIAMOND_HOE
	        							|| item.getType() == Material.NETHERITE_HOE) {
	        						MouseClickForSkill mc = new MouseClickForSkill();
	        						int time = mc.getTime(player);
	        						if(time==0) {
	        							mc.click(player, "R");
	        						} else {
	        							mc.click(player, "R", time);
	        						}
	        					}
	        				}
	        			}
	    				
	    			}
	    		} catch(Exception e1) {
	    			
	    		}
	        }
		} catch(Exception e) {
			
		}
		//퀘스트
		try {			
			QuestBoard qb = new QuestBoard();
			EquipmentSlot e = event.getHand (); 
	        if (e.equals (EquipmentSlot.HAND)) {
	        	//퀘스트 클리어 이벤트
	    		Player player = event.getPlayer();
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
	    			if(player.getInventory().getItemInMainHand().getType() == Material.WRITTEN_BOOK) {
	    				try {
	    					if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "티페라리 왕가의 비밀")) {
	    						QuestBoard cb = new QuestBoard();
	    						if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서2===")) {
	    							int qNum = cb.getNum(player);
	    							cb.mq50_2(player, qNum+1);	
	    						}
	    					}
	    				} catch(Exception e2) {
	    					
	    				}
	    			}
	    		}
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    			Block block = event.getClickedBlock();
	    			int i = 0;
					Inventory inv = player.getInventory();
					for (int j = 0 ; j < 36 ; j++) {
						if(inv.getItem(j) == null) {
							i++;
						}
					}
	    			if(block.getType()==Material.CHEST && block.getX()==-1977 && block.getY()==83 && block.getZ()==2950) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===해적선의 보물===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.q2(player, qNum+1);	
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.ENDER_CHEST && block.getX()==-699 && block.getY()==92 && block.getZ()==2143) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대를 밝히는 힘===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq12(player, qNum+1);	
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.LECTERN && block.getX()==-1174 && block.getZ()==1983) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===파르홀론의 역사===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq8(player, qNum+1);	
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==-699 && block.getZ()==2133) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대에 숨겨진 비밀===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq11(player, qNum+1);
		    					player.teleport(new Location(world, 3796, 26, 3798));
		    					
		    					// 생성 가능 캐릭터 파일
		    					try {
		    						File dataFolder = getDataFolder();
		    			            if(!dataFolder.exists()) {
		    			                dataFolder.mkdir();
		    			            } else {
		    			            	File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
		    			            	if(!dir.exists()) {
		    			            		try{
		    			            		    dir.mkdir(); 
		    			            		} catch(Exception e2) {
		    			            		    e2.getStackTrace();
		    			            		}
		    							}
		    							File file = new File(dir, "available_character.dat");
		    							try {
		    								FileReader filereader = new FileReader(file);
		    			    				BufferedReader bufReader = new BufferedReader(filereader);
		    			    				String[] num = bufReader.readLine().split(" ");
		    			    				num[5] = "1";
		    			    				num[6] = "1";
		    			    				num[7] = "1";
		    			    				num[8] = "1";
		    			    				num[9] = "1";
		    			    				String str = "";
		    			    				for(int j = 0 ; j < 17 ; j++) {
		    			    					str += num[j] + " ";
		    			    				}
		    			    				str += num[17];
	    									BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
	    					                fw.write(str);
	    					                fw.close();
	    					                bufReader.close();
	    								} catch (IOException e2) {
	    									e2.printStackTrace();
	    								}
		    						}
		    					} catch (Exception e2) {
		    						
		    					}
		    					
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자6===")) {
	    					int qNum = qb.getNum(player);
	    					qb.mq21(player, qNum+1);
	    					player.teleport(new Location(world, 3796, 19, 3799.5));
	    				}
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.PLAYER_HEAD && block.getX()==-648 && block.getY()==42 && block.getZ()==1332) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자2===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq19(player, qNum+1);
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.CHEST && block.getX()==-1994 && block.getY()==32 && block.getZ()==81) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 보물3===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq26_1(player, qNum+1);
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==3812 && block.getZ()==3800) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 흐름의 힘===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq41(player, qNum+1);
		    					// 생성 가능 캐릭터 파일
		    					try {
		    						File dataFolder = getDataFolder();
		    			            if(!dataFolder.exists()) {
		    			                dataFolder.mkdir();
		    			            } else {
		    			            	File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
		    			            	if(!dir.exists()) {
		    			            		try{
		    			            		    dir.mkdir(); 
		    			            		} catch(Exception e2) {
		    			            		    e2.getStackTrace();
		    			            		}
		    							}
		    							File file = new File(dir, "available_character.dat");
		    							try {
		    								FileReader filereader = new FileReader(file);
		    			    				BufferedReader bufReader = new BufferedReader(filereader);
		    			    				String[] num = bufReader.readLine().split(" ");
		    			    				num[11] = "1";
		    			    				String str = "";
		    			    				for(int j = 0 ; j < 17 ; j++) {
		    			    					str += num[j] + " ";
		    			    				}
		    			    				str += num[17];
	    									BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
	    					                fw.write(str);
	    					                fw.close();
	    					                bufReader.close();
	    								} catch (IOException e2) {
	    									e2.printStackTrace();
	    								}
		    						}
		    					} catch (Exception e2) {
		    						
		    					}
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==3810 && block.getZ()==3800) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 흐름의 힘===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq41(player, qNum+2);
		    					// 생성 가능 캐릭터 파일
		    					try {
		    						File dataFolder = getDataFolder();
		    			            if(!dataFolder.exists()) {
		    			                dataFolder.mkdir();
		    			            } else {
		    			            	File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
		    			            	if(!dir.exists()) {
		    			            		try{
		    			            		    dir.mkdir(); 
		    			            		} catch(Exception e2) {
		    			            		    e2.getStackTrace();
		    			            		}
		    							}
		    							File file = new File(dir, "available_character.dat");
		    							try {
		    								FileReader filereader = new FileReader(file);
		    			    				BufferedReader bufReader = new BufferedReader(filereader);
		    			    				String[] num = bufReader.readLine().split(" ");
		    			    				num[10] = "1";
		    			    				String str = "";
		    			    				for(int j = 0 ; j < 17 ; j++) {
		    			    					str += num[j] + " ";
		    			    				}
		    			    				str += num[17];
	    									BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
	    					                fw.write(str);
	    					                fw.close();
	    					                bufReader.close();
	    								} catch (IOException e2) {
	    									e2.printStackTrace();
	    								}
		    						}
		    					} catch (Exception e2) {
		    						
		    					}
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==3808 && block.getZ()==3800) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 흐름의 힘===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq41(player, qNum+3);
		    					// 생성 가능 캐릭터 파일
		    					try {
		    						File dataFolder = getDataFolder();
		    			            if(!dataFolder.exists()) {
		    			                dataFolder.mkdir();
		    			            } else {
		    			            	File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
		    			            	if(!dir.exists()) {
		    			            		try{
		    			            		    dir.mkdir(); 
		    			            		} catch(Exception e2) {
		    			            		    e2.getStackTrace();
		    			            		}
		    							}
		    							File file = new File(dir, "available_character.dat");
		    							try {
		    								FileReader filereader = new FileReader(file);
		    			    				BufferedReader bufReader = new BufferedReader(filereader);
		    			    				String[] num = bufReader.readLine().split(" ");
		    			    				num[12] = "1";
		    			    				String str = "";
		    			    				for(int j = 0 ; j < 17 ; j++) {
		    			    					str += num[j] + " ";
		    			    				}
		    			    				str += num[17];
	    									BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
	    					                fw.write(str);
	    					                fw.close();
	    					                bufReader.close();
	    								} catch (IOException e2) {
	    									e2.printStackTrace();
	    								}
		    						}
		    					} catch (Exception e2) {
		    						
		    					}
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.GOLD_BLOCK && block.getX() <= 1853 && block.getZ() <= 2115
	    					&& block.getX() >= 1845 && block.getZ() >= 2109) {
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단8===")) {
	    					int num = 0;
	    					for(Entity ent : player.getNearbyEntities(30, 25, 30)) {
	    						if(ent.getType() == EntityType.SKELETON) {
	    							num++;
	    						}
	    					}
	    					if(num == 0) {
	    						for(Entity ent : player.getNearbyEntities(30, 25, 30)) {
		    						if(ent instanceof Player) {
		    							Player p = (Player) ent; 
		    							new BossHealth().getBar21().setProgress(1.0);
			    						new BossHealth().getBar21().addPlayer(p);
		    						}
		    					}
	    						new BossHealth().getBar21().setProgress(1.0);
	    						new BossHealth().getBar21().addPlayer(player);
	    						world.spawnEntity(new Location(world, 1858, 82, 2109), EntityType.SKELETON);
	    						player.sendMessage(ChatColor.RED + "미아즈마가 집 밖으로 나왔습니다.");
	    					}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.CHEST && block.getX()==-791 && block.getY()==49 && block.getZ()==-561) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 수염의 보물2===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq48_16(player, qNum+1);
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.GOLD_BLOCK && block.getX() <= 3731 && block.getZ() <= 2395
	    					&& block.getX() >= 3716 && block.getZ() >= 2380) {
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_USE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				world.playSound(player.getLocation(), Sound.BLOCK_BELL_RESONATE, 10.0f, 10.0f);
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마지막 종===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq48_18(player, qNum+1);
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==-1100 && block.getZ()==1455) {
	    				boolean bool = true;
	    				for (Player allPlayer : Bukkit.getOnlinePlayers()) {
	    					Location loc = allPlayer.getLocation(); 
	    					//-1079 196 1439  -1099 183 1468
	    					if(loc.getX()<=-1079 && loc.getY()<=196 && loc.getZ()<=1468
	    							&& loc.getX()>=-1099 && loc.getY()>=180 && loc.getZ()>=1439) {
	    						bool = false;
	    					}
	    				}
	    				if(bool == false) {
	    					player.sendMessage("누군가 안에 있습니다.");
	    				} else {
	    					player.teleport(new Location(world, -1096, 186, 1453.5, -90.0f, 0.0f));
	    					ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
	    					SkullMeta sm = (SkullMeta) skull.getItemMeta();
	    					sm.setOwningPlayer(player);
	    					skull.setItemMeta(sm);
	    					
	    					List<Entity> entitylist = player.getNearbyEntities(30, 10, 30);
	    					for (Entity nearEntity : entitylist) {
	    						if (nearEntity.getType() != EntityType.PLAYER) {
	    							if (nearEntity instanceof LivingEntity) {
	    								nearEntity.remove();
	    							}
	    						}
	    					}
	    					
	    					Skeleton mob = (Skeleton) world.spawnEntity(new Location(world, -1083, 186, 1453.5), EntityType.SKELETON);
	    					EntityEquipment head = mob.getEquipment();
	    					head.setHelmet(skull);
	    					((LivingEntity)mob).setMaxHealth(player.getLevel() * 50000 + 5);
	    					((LivingEntity)mob).setHealth(player.getLevel() * 50000 + 5);
	    					((LivingEntity)mob).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
	    					((LivingEntity)mob).addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, player.getLevel()*10000));
	    				}
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.WHITE_GLAZED_TERRACOTTA && block.getX() <= 3760 && block.getZ() <= 4123
	    					&& block.getX() >= 3758 && block.getZ() >= 4121) {
	    				ItemStack master = new ItemStack(Material.TRIPWIRE_HOOK);
	    				ItemMeta masterIm = master.getItemMeta();
	    				masterIm.setDisplayName(ChatColor.YELLOW + "숲의 탑 열쇠");
	    				master.setItemMeta(masterIm);
	    				
	    				if(!player.getInventory().contains(master)) {
	    					player.getInventory().addItem(master);
	    					player.sendMessage(ChatColor.WHITE + "열쇠를 획득했다.");
	    				}
	    				
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==3664 && block.getZ()==3674) {
	    				new CharacterSelectButton(player, getDataFolder());
	    			}
	    			if(block.getType()==Material.STONE_BUTTON || block.getType()==Material.PLAYER_HEAD) {
	    				new PlateEvent().effect(event.getPlayer(), event.getClickedBlock());
	    			}
	    		}
	        }
		} catch(Exception e) {
			
		}
		//다중창고 시스템
		try {
			EquipmentSlot e = event.getHand(); 
	        if (e.equals (EquipmentSlot.HAND)) {	
	        	Player player = event.getPlayer();
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    			Block block = event.getClickedBlock();
	    			if(block.getType() == Material.ENDER_CHEST) {
	    				
	    				//저장
	    				new SaveAll(player, getDataFolder());
	    				
	    				Cmd13Chest cc = new Cmd13Chest();
	    		    	if(cc.isPlayerInSelectAL(player.getUniqueId().toString())) {
	    		    		int num = cc.getChestNum(player.getUniqueId().toString());
	    		    		if(num != 1) {
	    		    			event.setCancelled(true);
	    		    			world.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_OPEN, 1.0f, 1.0f);
	    		    			new ChestOwner(player, num, null);
	    		    		}
	    		    	}
	    			}
	    		}
	        }
		} catch(Exception e) {
			
		}
		//기타
		try {
			EquipmentSlot e = event.getHand(); 
	        if (e.equals (EquipmentSlot.HAND)) {	 
	        	//날기
	        	try {
	        		Player player = event.getPlayer();
		        	if(player.getInventory().getItemInMainHand().getType() == Material.ELYTRA) {
		        		if (player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) {												
							player.sendMessage(ChatColor.GREEN + "[스킬]블링크가 발동됩니다.");

							Vector vec = player.getEyeLocation().getDirection().multiply(3.0f);
							player.setVelocity(vec);
							world.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
						}
		        	}
	        	} catch(Exception e1) {
	        		
	        	}
	        	//발사체
	    		try {
	    			// riding horse
	    			try {
						Player player = event.getPlayer();
						if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
							if (player.getVehicle() == null) {
								ArrowEffect ae = new ArrowEffect();
								ae.useBow(player);
								ae.useGun(player);
								ae.useStaff(player);
							}
						}
	    			} catch (Exception e1) {

	    			}
	    		} catch(Exception e1) {
	    			
	    		}	    		
	        	//상자 이벤트&루트 체스트
	    		Player player = event.getPlayer();
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    			Block block = event.getClickedBlock();
	    			
	    			if(block.getType() == Material.CHEST && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.TRAPPED_CHEST && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CRAFTING_TABLE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.FURNACE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.MINECART && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.JUKEBOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.ANVIL && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CHIPPED_ANVIL && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.DAMAGED_ANVIL && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLACK_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLUE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BROWN_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CYAN_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GRAY_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GREEN_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIGHT_BLUE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIGHT_GRAY_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIME_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.MAGENTA_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.ORANGE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.PINK_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.PURPLE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.RED_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.WHITE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.YELLOW_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LOOM && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.COMPOSTER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BARREL && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.SMOKER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLAST_FURNACE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CARTOGRAPHY_TABLE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.FLETCHING_TABLE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GRINDSTONE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.SMITHING_TABLE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.STONECUTTER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.HOPPER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.HOPPER_MINECART && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.DROPPER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.OBSERVER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLACK_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLUE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BROWN_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CYAN_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GRAY_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GREEN_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIGHT_BLUE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIGHT_GRAY_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIME_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.MAGENTA_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.ORANGE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.PINK_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.PURPLE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.RED_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.WHITE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.YELLOW_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BREWING_STAND && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.DISPENSER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.JUKEBOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.FLOWER_POT && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_ACACIA_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_ALLIUM && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_AZURE_BLUET && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_BAMBOO && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_BIRCH_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_BLUE_ORCHID && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_BROWN_MUSHROOM && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_CACTUS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_CORNFLOWER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_CRIMSON_FUNGUS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_CRIMSON_ROOTS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_DANDELION && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_DARK_OAK_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_DEAD_BUSH && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_FERN && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_JUNGLE_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_LILY_OF_THE_VALLEY && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_OAK_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_ORANGE_TULIP && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_OXEYE_DAISY && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_PINK_TULIP && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_POPPY && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_RED_MUSHROOM && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_RED_TULIP && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_SPRUCE_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_WARPED_FUNGUS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_WARPED_ROOTS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_WHITE_TULIP && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_WITHER_ROSE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.ARMOR_STAND && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			
	    			if(block.getType() == Material.ENCHANTING_TABLE) {
	    				MysteryChestTableOpen mcto = new MysteryChestTableOpen();
	    				mcto.openInv(player);
	    				event.setCancelled(true);
	    			}
	    			
	    			if(block.getType() == Material.WHITE_GLAZED_TERRACOTTA) {
	    				LootChest lc = new LootChest();
		    			lc.open(player, block);
		    			event.setCancelled(true);
	    			}
	    			
	    		}
	    		//취소 이벤드
	    		try {
	    			if(event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
	        			if(player.getInventory().getItemInMainHand().getType() == Material.SNOWBALL) {
	        				try {
	        					if(player.isOp() && (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)) {
	        						if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 10)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 10);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 9)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 9);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 8)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 8);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 7)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 7);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 6)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 6);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 5)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 5);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 4)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 4);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 3)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 3);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 2)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 2);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Do you wanna build a snowman? (range 1)")) {
		        						new SnowStack(player.getTargetBlockExact(50), 1);
		        					} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "마법봉")) {
		        						if(player.isSneaking()) {
		        							new ParticleEffect(player).newEffect49();
		        						} else {
		        							new ParticleEffect(player).newEffect55(10000);
		        						}
		        					}
	        					}
	        				} catch(Exception e2) {
	        					
	        				}
	        				event.setCancelled(true);
	        			} else if(player.getInventory().getItemInMainHand().getType() == Material.LINGERING_POTION) {
	        				event.setCancelled(true);
	        				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
	        				try {
	        					System.out.println(player.getDisplayName() + "이/가 " + player.getInventory().getItemInMainHand().getItemMeta().getDisplayName() 
	        							+ ChatColor.WHITE + "을/를 섭취하였다.");
	        				} catch(Exception e1) {
	        					
	        				}
	        				
	        				world.playSound(player.getLocation(), Sound.ENTITY_SPLASH_POTION_BREAK, 1.0f, 1.0f);
	        				
	        				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "힐링 폭탄")) {
	        					PotionRatio pr = new PotionRatio();
	        					pr.calculation(player, 3000.0);
	        				}
	        				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "마나 폭탄")) {
	        					for(int tmp = 0 ; tmp < 3 ; tmp++) {
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
	        				}
	        				
	        			} else if(player.getInventory().getItemInMainHand().getType() == Material.BLACK_GLAZED_TERRACOTTA) {
	        				new ItemBomb(player, player.getInventory().getItemInMainHand());
	        			} else if(player.getInventory().getItemInMainHand().getType() == Material.ENDER_EYE) {
	        				event.setCancelled(true);
	        			}
	        		}
	    		} catch(Exception e1) {
	    			
	    		}
	    		//증표
	    		try {
	    			if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        			PlayerStat ps = new PlayerStat();
	        			ps.viewStat(player);
	        		}
	    		} catch(Exception e1) {
	    			
	    		}
	        } 	 
		} catch(Exception e) {
			
		}
		//밭 보호 이벤트
		try { 
			if(event.getAction()==Action.PHYSICAL && event.getClickedBlock().getType() == Material.FARMLAND) {
				event.setCancelled(true);
			}
		} catch(Exception e) {
					
		}
		//발판 이벤트
		try {
			if (event.getAction() == Action.PHYSICAL) {
				new PlateEvent().effect(event.getPlayer(), event.getClickedBlock());
			}
		} catch (Exception e) {

		}
	}
	
	@EventHandler
	public void animationEvent(PlayerAnimationEvent event) {
		//퀘
		try {					        
			Player player = event.getPlayer();
			Block block = player.getTargetBlockExact(5);
			if(player.getGameMode() == GameMode.ADVENTURE && player.isOp() == false) {
				Location loc = block.getLocation();
				int i = 0;
				Inventory inv = player.getInventory();
				for (int j = 0 ; j < 36 ; j++) {
					if(inv.getItem(j) == null) {
						i++;
					}
				}
				if (loc.getX() == -1492 && loc.getY() == 65 && loc.getZ() == 2035) {
					QuestBoard qb = new QuestBoard();
					if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===전설의 시작===")) {
						if (i != 0) {
							int qNum = qb.getNum(player);
							qb.mq7(player, qNum + 1);
						} else {
							player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
						}

					}
				}
				if (loc.getX() == -1992 && loc.getY() == 58 && loc.getZ() == 2241) {
					QuestBoard qb = new QuestBoard();
					if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 무기1===")) {
						if (i != 0) {
							int qNum = qb.getNum(player);
							qb.mq15(player, qNum + 1);
						} else {
							player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
						}
					}
				}
				if (loc.getX() == -1105 && loc.getY() == 82 && loc.getZ() == 1235) {
					QuestBoard qb = new QuestBoard();
					if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자1===")) {
						if (i != 0) {
							int qNum = qb.getNum(player);
							qb.mq18(player, qNum + 1);
						} else {
							player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
						}
					}
				}
			}
		} catch(Exception e) {
			
		}	
		//생활
		try {					        
			Player player = event.getPlayer();
			Location loc = player.getLocation();
			Block block = player.getTargetBlockExact(5);
			if(player.getGameMode() == GameMode.ADVENTURE || player.isOp() == false) {
				FantasyLife fl = new FantasyLife();	        		
				fl.fantasyLife(player, block, loc);
				if(block.getType() == Material.WHEAT) {
					player.getWorld().playEffect(block.getLocation(), Effect.STEP_SOUND, Material.WHEAT);
				} else if(block.getType() == Material.COAL_ORE || block.getType() == Material.IRON_ORE || block.getType() == Material.GOLD_ORE
						|| block.getType() == Material.DIAMOND_ORE || block.getType() == Material.EMERALD_ORE){
					player.getWorld().playEffect(block.getLocation(), Effect.STEP_SOUND, Material.STONE);
				} else if(block.getType() == Material.NETHER_QUARTZ_ORE){
					player.getWorld().playEffect(block.getLocation(), Effect.STEP_SOUND, Material.NETHER_QUARTZ_ORE);
				}
			}
		} catch(Exception e) {
			
		}		
		//커맨드형 스킬
		try {
			Player player = event.getPlayer();
			Inventory inv = player.getInventory();
			ItemStack item = player.getInventory().getItemInMainHand();
			if(event.getAnimationType() == PlayerAnimationType.ARM_SWING && player.getVehicle() == null) {	    	
				if(inv.contains(Material.CLAY_BALL) || inv.contains(Material.GLOWSTONE_DUST)) {
					if(item.getType() == Material.DEAD_BRAIN_CORAL_BLOCK || item.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK || item.getType() == Material.DEAD_FIRE_CORAL_BLOCK
							|| item.getType() == Material.DEAD_HORN_CORAL_BLOCK || item.getType() == Material.DEAD_TUBE_CORAL_BLOCK) {
						MouseClickForSkill mc = new MouseClickForSkill();
						int time = mc.getTime(player);
						if(time==0) {
							mc.click(player, "L");
						} else {
							mc.click(player, "L", time);
						}
					}
				}
				if(inv.contains(Material.INK_SAC)) {
					if(item.getType() == Material.BRAIN_CORAL_BLOCK || item.getType() == Material.BUBBLE_CORAL_BLOCK || item.getType() == Material.FIRE_CORAL_BLOCK
							|| item.getType() == Material.HORN_CORAL_BLOCK || item.getType() == Material.TUBE_CORAL_BLOCK) {
						MouseClickForSkill mc = new MouseClickForSkill();
						int time = mc.getTime(player);
						if(time==0) {
							mc.click(player, "L");
						} else {
							mc.click(player, "L", time);
						}
					}
				}
				if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BLACK_DYE) || inv.contains(Material.GREEN_DYE) 
						|| inv.contains(Material.LAPIS_LAZULI) || inv.contains(Material.CYAN_DYE) || inv.contains(Material.LIGHT_GRAY_DYE) 
						|| inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE) 
						|| inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.BROWN_DYE)) {
					if(item.getType() == Material.WOODEN_SWORD
							|| item.getType() == Material.STONE_SWORD
							|| item.getType() == Material.IRON_SWORD
							|| item.getType() == Material.GOLDEN_SWORD
							|| item.getType() == Material.DIAMOND_SWORD
							|| item.getType() == Material.NETHERITE_SWORD
							|| item.getType() == Material.OAK_LEAVES
							|| item.getType() == Material.SPRUCE_LEAVES
							|| item.getType() == Material.BIRCH_LEAVES
							|| item.getType() == Material.JUNGLE_LEAVES
							|| item.getType() == Material.ACACIA_LEAVES
							|| item.getType() == Material.DARK_OAK_LEAVES
							|| item.getType() == Material.COBBLESTONE_WALL
							|| item.getType() == Material.MOSSY_COBBLESTONE_WALL
							|| item.getType() == Material.BROWN_CARPET
							|| item.getType() == Material.GREEN_CARPET
							|| item.getType() == Material.BLACK_CARPET
							|| item.getType() == Material.STONE
							|| item.getType() == Material.OAK_PLANKS
							|| item.getType() == Material.SPRUCE_PLANKS
							|| item.getType() == Material.BIRCH_PLANKS
							|| item.getType() == Material.JUNGLE_PLANKS
							|| item.getType() == Material.ACACIA_PLANKS
							|| item.getType() == Material.DARK_OAK_PLANKS
							|| item.getType() == Material.BEDROCK
							|| item.getType() == Material.SPRUCE_LOG
							|| item.getType() == Material.BIRCH_LOG
							|| item.getType() == Material.JUNGLE_LOG
							|| item.getType() == Material.ACACIA_LOG
							|| item.getType() == Material.DARK_OAK_LOG
							|| item.getType() == Material.SANDSTONE
							|| item.getType() == Material.CHISELED_SANDSTONE
							|| item.getType() == Material.CUT_SANDSTONE
							|| item.getType() == Material.LAPIS_BLOCK
							|| item.getType() == Material.MAGENTA_WOOL
							|| item.getType() == Material.LIME_WOOL
							|| item.getType() == Material.GRAY_WOOL
							|| item.getType() == Material.LIGHT_GRAY_WOOL
							|| item.getType() == Material.CYAN_WOOL
							|| item.getType() == Material.PURPLE_WOOL
							|| item.getType() == Material.OAK_SLAB
							|| item.getType() == Material.SPRUCE_SLAB
							|| item.getType() == Material.BIRCH_SLAB
							|| item.getType() == Material.JUNGLE_SLAB
							|| item.getType() == Material.ACACIA_SLAB
							|| item.getType() == Material.DARK_OAK_SLAB
							|| item.getType() == Material.STONE_SLAB
							|| item.getType() == Material.COBBLESTONE_SLAB
							|| item.getType() == Material.STONE_BRICK_SLAB
							|| item.getType() == Material.NETHER_BRICK_SLAB
							|| item.getType() == Material.QUARTZ_SLAB
							|| item.getType() == Material.RED_SANDSTONE
							|| item.getType() == Material.RED_SANDSTONE_SLAB
							|| item.getType() == Material.SMOOTH_RED_SANDSTONE
							|| item.getType() == Material.OBSIDIAN
							|| item.getType() == Material.SMOOTH_SANDSTONE
							|| item.getType() == Material.CHISELED_RED_SANDSTONE
							|| item.getType() == Material.CUT_RED_SANDSTONE
							|| item.getType() == Material.RED_SANDSTONE_STAIRS
							|| item.getType() == Material.STONE_STAIRS) {
						MouseClickForSkill mc = new MouseClickForSkill();
						int time = mc.getTime(player);
						if(time==0) {
							mc.click(player, "L");
						} else {
							mc.click(player, "L", time);
						}
					}
				}
				if(inv.contains(Material.RED_DYE)) {
					if(item.getType() == Material.BONE) {
						MouseClickForSkill mc = new MouseClickForSkill();
						int time = mc.getTime(player);
						if(time==0) {
							mc.click(player, "L");
						} else {
							mc.click(player, "L", time);
						}
					}
				}
				if(inv.contains(Material.MAGENTA_DYE)) {
					if(item.getType() == Material.WOODEN_PICKAXE 
							|| item.getType() == Material.STONE_PICKAXE
							|| item.getType() == Material.IRON_PICKAXE
							|| item.getType() == Material.GOLDEN_PICKAXE
							|| item.getType() == Material.DIAMOND_PICKAXE
							|| item.getType() == Material.NETHERITE_PICKAXE) {
						MouseClickForSkill mc = new MouseClickForSkill();
						int time = mc.getTime(player);
						if(time==0) {
							mc.click(player, "L");
						} else {
							mc.click(player, "L", time);
						}
					}
				}
				if(inv.contains(Material.ORANGE_DYE)) {
					if(item.getType() == Material.WOODEN_HOE
							|| item.getType() == Material.STONE_HOE
							|| item.getType() == Material.IRON_HOE
							|| item.getType() == Material.GOLDEN_HOE
							|| item.getType() == Material.DIAMOND_HOE
							|| item.getType() == Material.NETHERITE_HOE) {
						MouseClickForSkill mc = new MouseClickForSkill();
						int time = mc.getTime(player);
						if(time==0) {
							mc.click(player, "L");
						} else {
							mc.click(player, "L", time);
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void blockBreakEvent(BlockBreakEvent event) {
		Player player = event.getPlayer();
		if(event.getBlock().getType() == Material.CHAIN_COMMAND_BLOCK) {
			event.setCancelled(true);
		}
		if(event.getBlock().getType() == Material.COMMAND_BLOCK) {
//			if(!player.getDisplayName().equals("yumehama")) {
//				event.setCancelled(true);
//			}			
			event.setCancelled(true);
		}
		if(event.getBlock().getType() == Material.REPEATING_COMMAND_BLOCK) {
			event.setCancelled(true);
		}	
		if(event.getBlock().getType() == Material.ARMOR_STAND) {
			event.setCancelled(true);
		}
		if(player.isOp() == false) {
			event.setCancelled(true);
		}
		
		Location loc = player.getLocation();
		if (loc.getX() <= 3785 && loc.getY() <= 28 && loc.getZ() <= 3746 && 
				loc.getX() >= 3725 && loc.getY() >= 0 && loc.getZ() >= 3700) {
			event.setCancelled(true);
		}
			
	}
	
	@EventHandler
	public void summonMobDeathEvent(EntityDeathEvent event) {
		//bomb
		try {
			if(event.getEntity().getCustomName().substring(2).split("§")[0].equalsIgnoreCase("연어 인형")) {
				String name = event.getEntity().getCustomName().substring(14);
				String numStr = name.split("]")[0];
				int num = Integer.parseInt(numStr);
				Location loc = event.getEntity().getLocation();
				event.getEntity().getWorld().createExplosion(loc, 0, false, false);
				List <Entity> entitylist = event.getEntity().getNearbyEntities (8, 5, 8); 
				for (Entity nearEntity : entitylist) { 
				    if (nearEntity.getType() != EntityType.PLAYER) { 
				    	LivingEntity entity = (LivingEntity) nearEntity;
				    	entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 200, true, false, false));
				    	entity.damage(num * 50);
				    }        
				}   
			}
			if(event.getEntity().getCustomName().substring(2).split("§")[0].equalsIgnoreCase("데빌의 힘")) {
				List <Entity> entitylist = event.getEntity().getNearbyEntities (10, 20, 10); 
				for (Entity nearEntity : entitylist) { 
				    if(nearEntity instanceof LivingEntity) {
				    	LivingEntity nearMob = (LivingEntity) nearEntity;
					    nearMob.addPotionEffect(new PotionEffect(PotionEffectType.HARM,1,32700));
					    nearMob.addPotionEffect(new PotionEffect(PotionEffectType.HEAL,1,32700));
				    }        
				}
			}
			if(event.getEntity().getCustomName().substring(2).split("§")[0].equalsIgnoreCase("유적의 주인")) {
				
				ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
				ItemMeta rewardKeyIm = rewardKey.getItemMeta();
				rewardKeyIm.setDisplayName(ChatColor.YELLOW + "숲의 유적 보상 열쇠");
				rewardKey.setItemMeta(rewardKeyIm);
				
				List<Entity> entitylist = event.getEntity().getNearbyEntities(40, 20, 40);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearplayer = (Player) nearEntity;
						Location loc = nearplayer.getLocation();
						if (loc.getX() <= 3587 && loc.getY() <= 57 && loc.getZ() <= 3737 
								&& loc.getX() >= 3537 && loc.getY() >= 0 && loc.getZ() >= 3685) {
							nearplayer.getInventory().addItem(rewardKey);
							nearplayer.teleport(new Location(world, 3470.5, 52, 3740));
							nearplayer.sendMessage("유적 어딘가로 이동했다.");
						}
					}
				}
			}
			if(event.getEntity().getCustomName().substring(2).split("§")[0].equalsIgnoreCase("유적의 주인?")) {
				
				ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
				ItemMeta rewardKeyIm = rewardKey.getItemMeta();
				rewardKeyIm.setDisplayName(ChatColor.YELLOW + "숲의 유적 하드 보상 열쇠");
				rewardKey.setItemMeta(rewardKeyIm);
				
				List<Entity> entitylist = event.getEntity().getNearbyEntities(30, 30, 30);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearplayer = (Player) nearEntity;
						Location loc = nearplayer.getLocation();
						if (loc.getX() <= 3699 && loc.getY() <= 230 && loc.getZ() <= 4217 
								&& loc.getX() >= 3657 && loc.getY() >= 180 && loc.getZ() >= 4172) {
							nearplayer.getInventory().addItem(rewardKey);
							nearplayer.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "크윽.. 나의 시험을 통과하다니..");
							nearplayer.sendMessage(ChatColor.YELLOW + "숲의 유적 하드 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
						}
					}
				}
			}
		} catch(Exception e) {
			
		}	
		//golem
		try {
			if(event.getEntity() instanceof IronGolem) {
				IronGolem ir = (IronGolem) event.getEntity();
				GolemOwner go = new GolemOwner();
				go.remove(ir.getUniqueId());
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void invOpen(InventoryOpenEvent event) {
		try {
	        Player player = (Player) event.getPlayer();
	        if(event.getInventory().getType() == InventoryType.ENDER_CHEST || event.getInventory().getType() == InventoryType.CHEST) {
	        	
	        	if(et.isOn(player)) {
	        		int cnt = 0;
		        	for(ItemStack item : player.getInventory().getContents()) {
		        		if(item == null) continue;
		        		if(item.getType() == Material.EMERALD) {
		        			cnt += item.getAmount();
		        		}
		        	}
		        	player.getInventory().remove(Material.EMERALD);
		        	if(cnt/64 != 0) {
		        		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, cnt/64);
		        		ItemMeta im = item.getItemMeta();
		        		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		        		item.setItemMeta(im);
		        		player.getInventory().addItem(item);
		        	}
		        	player.getInventory().addItem(new ItemStack(Material.EMERALD, cnt%64));
		        	
		        	
		        	int cnt2 = 0;
		        	for(ItemStack item : player.getInventory().getContents()) {
		        		if(item == null) continue;
		        		if(item.getType() == Material.EMERALD_BLOCK) {
		        			cnt2 += item.getAmount();
		        		}
		        	}
		        	player.getInventory().remove(Material.EMERALD_BLOCK);
		        	if(cnt2/64 != 0) {
		        		ItemStack item = new ItemStack(Material.SCUTE, cnt2/64);
		        		ItemMeta im = item.getItemMeta();
		        		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		        		item.setItemMeta(im);
		        		player.getInventory().addItem(item);
		        	}
		        	ItemStack eme2 = new ItemStack(Material.EMERALD_BLOCK, cnt2%64);
	        		ItemMeta emeIm2 = eme2.getItemMeta();
	        		emeIm2.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
	        		eme2.setItemMeta(emeIm2);
		        	player.getInventory().addItem(eme2);
		        	
		        	
		        	int cnt3 = 0;
		        	for(ItemStack item : player.getInventory().getContents()) {
		        		if(item == null) continue;
		        		if(item.getType() == Material.SCUTE) {
		        			cnt3 += item.getAmount();
		        		}
		        	}
		        	player.getInventory().remove(Material.SCUTE);
		        	if(cnt3/64 != 0) {
		        		ItemStack item = new ItemStack(Material.RABBIT_HIDE, cnt3/64);
		        		ItemMeta im = item.getItemMeta();
		        		im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
		        		item.setItemMeta(im);
		        		player.getInventory().addItem(item);
		        	}
		        	ItemStack eme3 = new ItemStack(Material.SCUTE, cnt3%64);
	        		ItemMeta emeIm3 = eme3.getItemMeta();
	        		emeIm3.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
	        		eme3.setItemMeta(emeIm3);
		        	player.getInventory().addItem(eme3);
		        	
		        	int cnt4 = 0;
		        	for(ItemStack item : player.getInventory().getContents()) {
		        		if(item == null) continue;
		        		if(item.getType() == Material.RABBIT_HIDE) {
		        			cnt4 += item.getAmount();
		        		}
		        	}
		        	player.getInventory().remove(Material.RABBIT_HIDE);
		        	if(cnt4/64 != 0) {
		        		ItemStack item = new ItemStack(Material.RABBIT_FOOT, cnt4/64);
		        		ItemMeta im = item.getItemMeta();
		        		im.setDisplayName(ChatColor.DARK_RED + "에메랄드 결정+");
		        		item.setItemMeta(im);
		        		player.getInventory().addItem(item);
		        	}
		        	ItemStack eme4 = new ItemStack(Material.RABBIT_HIDE, cnt4%64);
	        		ItemMeta emeIm4 = eme4.getItemMeta();
	        		emeIm4.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
	        		eme4.setItemMeta(emeIm4);
		        	player.getInventory().addItem(eme4);
	        	}
		    	
	        }
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void interactEvent(PlayerInteractEntityEvent event) {
		EquipmentSlot e = event.getHand();
		if(e.equals(EquipmentSlot.HAND)) {
			Player player = (Player) event.getPlayer();
			// 못건들여
			if(event.getRightClicked().getType() == EntityType.ITEM_FRAME && player.getGameMode() == GameMode.ADVENTURE) {
				event.setCancelled(true);
				return;
			}
			// 말 타기
			if(event.getRightClicked().getType() == EntityType.HORSE) {
				Horse horse = (Horse) event.getRightClicked();
				if(horse.getOwner() != player) {
					event.setCancelled(true);
					return;
				}
				if(player.getInventory().getItemInMainHand().getType() == Material.GOLDEN_APPLE) {
					event.setCancelled(true);
					player.updateInventory();
					return;
				}
			}
			// 라마 못타
			if(event.getRightClicked().getType() == EntityType.LLAMA) {
				event.setCancelled(true);
			}
			// 빌리저 대화
			if(event.getRightClicked().getType() == EntityType.VILLAGER || event.getRightClicked().getType() == EntityType.ARMOR_STAND) {
				InteractVillager iv = new InteractVillager();
				if(iv.interactVillager(player, event.getRightClicked()) == true) {
					event.setCancelled(true);
				}
			}
			// npc 대화
			if (event.getRightClicked().getType() == EntityType.SKELETON_HORSE) {
				InteractNPC iv = new InteractNPC();
				if (iv.interactNPC(player, event.getRightClicked()) == true) {
					event.setCancelled(true);
				}
			}
		}
	}
	
	@EventHandler
	public void feedEvent(PlayerInteractAtEntityEvent event) {
		EquipmentSlot e = event.getHand();
		if(e.equals(EquipmentSlot.HAND)) {
			Player player = (Player) event.getPlayer();
			// 말 타기
			if(event.getRightClicked().getType() == EntityType.HORSE) {
				Horse horse = (Horse) event.getRightClicked();
				if(player.getInventory().getItemInMainHand().getType() == Material.GOLDEN_APPLE || player.getInventory().getItemInMainHand().getType() == Material.APPLE
						|| player.getInventory().getItemInMainHand().getType() == Material.CARROT || player.getInventory().getItemInMainHand().getType() == Material.GOLDEN_CARROT) {
					event.setCancelled(true);
					player.updateInventory();
					return;
				}
			}
		}
	}
	
	@EventHandler
	public void clickInv(InventoryClickEvent event) {
		
		if(event.getWhoClicked() instanceof Player) {
			Player player = (Player) event.getWhoClicked();
			if(event.getClick() == ClickType.MIDDLE) {
//				if(player.getGameMode() == GameMode.CREATIVE) {
//					if(player.isOp() == true) {
//						event.getCurrentItem().setAmount(1);
//					} else {
//						event.setCancelled(true);
//						return;
//					}
//				}
			}
		}
		
		try {
			// 거래창 클릭(거래)
			Inventory inv = event.getClickedInventory();
			Player player = (Player) event.getWhoClicked();
			ItemStack item = event.getCurrentItem();
			int slot = event.getSlot();
			if(new Trade().clickTradeInv(player, inv, slot, item)) {
				event.setCancelled(true);
			}
		} catch(Exception e) {
			
		}
		
		try {
			// 플레이어 인벤 클릭(거래)
			Inventory inv = event.getInventory();
			Inventory pInv = event.getClickedInventory();
			Player player = (Player) event.getWhoClicked();
			ItemStack item = event.getCurrentItem();
			int slot = event.getSlot();
			if(new Trade().clickPlayerInv(player, inv, pInv, slot, item)) {
				event.setCancelled(true);
			}
		} catch(Exception e) {
			
		}
		
		if(event.getClick() != ClickType.MIDDLE) {
			// 핫키 제한
			try {
				if(event.getHotbarButton() != -1) {
					ItemStack item = event.getCurrentItem();
					if(item.getType() == Material.RED_DYE || item.getType() == Material.GREEN_DYE || item.getType() == Material.LAPIS_LAZULI
							|| item.getType() == Material.CYAN_DYE || item.getType() == Material.LIGHT_GRAY_DYE || item.getType() == Material.GRAY_DYE
							|| item.getType() == Material.PINK_DYE || item.getType() == Material.LIME_DYE || item.getType() == Material.YELLOW_DYE
							|| item.getType() == Material.LIGHT_BLUE_DYE || item.getType() == Material.MAGENTA_DYE || item.getType() == Material.ORANGE_DYE
							|| item.getType() == Material.BLUE_DYE || item.getType() == Material.BROWN_DYE || item.getType() == Material.BLACK_DYE
							|| item.getType() == Material.INK_SAC || item.getType() == Material.CLAY_BALL || item.getType() == Material.GLOWSTONE_DUST) {
						event.setCancelled(true);
						Player player = (Player) event.getWhoClicked();
						Cmd13Chest cc = new Cmd13Chest();
						if(cc.isPlayerInSelectAL(player.getUniqueId().toString())) {
				    		int num = cc.getChestNum(player.getUniqueId().toString());
				    		if(num != 1) {
				    			if(event.getHotbarButton() == 0) {
				    				if(num-1 < 2) {
				    					player.sendMessage("Not available chest");
				    				} else {
				    					if(cc.getUserALContains(player.getUniqueId().toString())) {
											if(cc.getUserAL(player.getUniqueId().toString()) < num-1) {
												player.sendMessage("Not available chest");
												return;
											}
											
											new BukkitRunnable() {
												int time = 0;

												@Override
												public void run() {

													if (time == 0) {
														player.closeInventory();
													}

													if (time >= 5) {
														cc.putSelectAL(player.getUniqueId().toString(), num-1);
														new ChestOwner(player, num-1, null);
														this.cancel();
													}

													time++;
												}
											}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
											
										} else {
											player.sendMessage("Not available chest");
											return;
										}
				    				}
				    			} else if(event.getHotbarButton() == 1) {
				    				if(cc.getUserALContains(player.getUniqueId().toString())) {
										if(cc.getUserAL(player.getUniqueId().toString()) < num+1) {
											player.sendMessage("Not available chest");
											return;
										}
										
										new BukkitRunnable() {
											int time = 0;

											@Override
											public void run() {

												if (time == 0) {
													player.closeInventory();
												}
												
												if (time >= 5) {
													cc.putSelectAL(player.getUniqueId().toString(), num+1);
													new ChestOwner(player, num+1, null);
													this.cancel();
												}

												time++;
											}
										}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
										
									} else {
										player.sendMessage("Not available chest");
										return;
									}
				    			} else if(event.getHotbarButton() == 2) {
				    				if(num-5 < 2) {
				    					player.sendMessage("이동할 수 없는 상자입니다.");
				    				} else {
				    					if(cc.getUserALContains(player.getUniqueId().toString())) {
											if(cc.getUserAL(player.getUniqueId().toString()) < num-5) {
												player.sendMessage("Not available chest");
												return;
											}
											
											new BukkitRunnable() {
												int time = 0;

												@Override
												public void run() {

													if (time == 0) {
														player.closeInventory();
													}

													if (time >= 5) {
														cc.putSelectAL(player.getUniqueId().toString(), num-5);
														new ChestOwner(player, num-5, null);
														this.cancel();
													}

													time++;
												}
											}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
											
										} else {
											player.sendMessage("Not available chest");
											return;
										}
				    				}
				    			} else if(event.getHotbarButton() == 3) {
				    				if(cc.getUserALContains(player.getUniqueId().toString())) {
										if(cc.getUserAL(player.getUniqueId().toString()) < num+5) {
											player.sendMessage("Not available chest");
											return;
										}
										
										new BukkitRunnable() {
											int time = 0;

											@Override
											public void run() {

												if (time == 0) {
													player.closeInventory();
												}
												
												if (time >= 5) {
													cc.putSelectAL(player.getUniqueId().toString(), num+5);
													new ChestOwner(player, num+5, null);
													this.cancel();
												}

												time++;
											}
										}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
										
									} else {
										player.sendMessage("Not available chest");
										return;
									}
				    			}
				    		}
				    	}
					}
					event.setCancelled(true);
					return;
				}
			} catch(Exception e) {
				
			}
			// 제한레벨
			try {
				Player player = (Player) event.getWhoClicked();
				int lvl = player.getLevel();
				ItemStack item;
				ItemMeta im;
				String[] ary;
				try {
					item = player.getInventory().getBoots();
					im = item.getItemMeta();
					ary = im.getLocalizedName().split(",");
					if(Integer.parseInt(ary[10]) > lvl) {
						player.getInventory().addItem(item);
						player.getInventory().setBoots(null);
					}
				} catch(Exception e) {
					
				}
				try {
					item = player.getInventory().getLeggings();
					im = item.getItemMeta();
					ary = im.getLocalizedName().split(",");
					if(Integer.parseInt(ary[10]) > lvl) {
						player.getInventory().addItem(item);
						player.getInventory().setLeggings(null);
					}
				} catch(Exception e) {
					
				}
				try {
					item = player.getInventory().getChestplate();
					im = item.getItemMeta();
					ary = im.getLocalizedName().split(",");
					if(Integer.parseInt(ary[10]) > lvl) {
						player.getInventory().addItem(item);
						player.getInventory().setChestplate(null);
					}
				} catch(Exception e) {
					
				}
				try {
					item = player.getInventory().getHelmet();
					im = item.getItemMeta();
					ary = im.getLocalizedName().split(",");
					if(Integer.parseInt(ary[10]) > lvl) {
						player.getInventory().addItem(item);
						player.getInventory().setHelmet(null);
					}
				} catch(Exception e) {
					
				}
				try {
					item = player.getInventory().getItemInOffHand();
					im = item.getItemMeta();
					ary = im.getLocalizedName().split(",");
					if(Integer.parseInt(ary[10]) > lvl) {
						player.getInventory().addItem(item);
						player.getInventory().setItemInOffHand(null);
					}
				} catch(Exception e) {
					
				}
			} catch(Exception e) {
				
			}
			// 제한레벨
			try {
				Player player = (Player) event.getWhoClicked();
				if(event.getInventory().getType() == InventoryType.CRAFTING) {
					if(event.getSlot() == 36) {
						LimitLevel la = new LimitLevel();
						ItemStack item = event.getCursor();
						if(la.limit(player, item) == false) {
							event.setCancelled(true);
							return;
						}
					}
					if(event.getSlot() == 37) {
						LimitLevel la = new LimitLevel();
						ItemStack item = event.getCursor();
						if(la.limit(player, item) == false) {
							event.setCancelled(true);
							return;
						}
					}
					if(event.getSlot() == 38) {
						LimitLevel la = new LimitLevel();
						ItemStack item = event.getCursor();
						if(la.limit(player, item) == false) {
							event.setCancelled(true);
							return;
						}
					}
					if(event.getSlot() == 39) {
						LimitLevel la = new LimitLevel();
						ItemStack item = event.getCursor();
						if(la.limit(player, item) == false) {
							event.setCancelled(true);
							return;
						}
						if(item.getType() == Material.PLAYER_HEAD && player.isOp() == false) {
							event.setCancelled(true);
							return;
						}
					}
					if(event.getSlot() == 40) {
						LimitLevel la = new LimitLevel();
						ItemStack item = event.getCursor();
						if(la.limit(player, item) == false) {
							event.setCancelled(true);
							return;
						}
					}
				}
			} catch(Exception e) {

			}
			// 시프트 클릭 제한레벨
			try {
				if(event.isShiftClick()) {
					Player player = (Player) event.getWhoClicked();
					LimitLevel la = new LimitLevel();
					ItemStack item = event.getCurrentItem();
					if(!la.limit(player, item)) {
						event.setCancelled(true);
						return;
					}
				}
			} catch(Exception e) {
				
			}
			// 못건드리는 템
			try {
				ItemStack clicked = event.getCurrentItem();
		        Player player = (Player) event.getWhoClicked();
		        if(clicked != null && clicked.getType() == Material.RED_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "본 파이터")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "boneFighter", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.GREEN_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "기사")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "knight", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.LAPIS_LAZULI) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "프리스트")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "priest", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.CYAN_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "광전사")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "berserker1", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.LIGHT_GRAY_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "도박사")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "gambler", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.GRAY_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "데빌")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "devil", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.PINK_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "엔젤")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "angel", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.LIME_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "대행자")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "agent", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.YELLOW_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "그림자 무사")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "shadowKnight", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.LIGHT_BLUE_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "버서커")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "berserker2", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.MAGENTA_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "군인")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "soldier", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.ORANGE_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "그림 리퍼")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "grimReaper", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.BLUE_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "마인")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "akuma", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.BROWN_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "팔라딘")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "paladin", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.BLACK_DYE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "용기사")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "dragonKnight", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.INK_SAC) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "조커")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "commander", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.CLAY_BALL) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "아처")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "archer", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.GLOWSTONE_DUST) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "파워레인저")) {
		            	player.closeInventory();
		            	new ReloadPlayerData(player, "powerRanger", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.HEART_OF_THE_SEA) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.MAGMA_CREAM) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.RED + "나가기")) {
		            	player.closeInventory();
		        	}
		            event.setCancelled(true);
		            return;
		        }  
		        if(clicked != null && clicked.getType() == Material.SHULKER_SHELL) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.RED + "나가기")) {
		            	player.closeInventory();
		        	}
		            event.setCancelled(true);
		            return;
		        }  
		        if(clicked != null && clicked.getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.RED + " ")) {
		        		event.setCancelled(true);
		                return;             
		        	}  
		        }
		        if(clicked != null && clicked.getType() == Material.BLUE_STAINED_GLASS_PANE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.RED + " ")) {
		        		event.setCancelled(true);
		                return;             
		        	}  
		        }
		        if(clicked != null && clicked.getType() == Material.GRAY_STAINED_GLASS_PANE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.RED + " ")) {
		        		event.setCancelled(true);
		                return;             
		        	}  
		        }
		        if(clicked != null && clicked.getType() == Material.WHITE_STAINED_GLASS_PANE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.RED + " ")) {
		        		event.setCancelled(true);
		                return;             
		        	}  
		        }
		        if(clicked != null && clicked.getType() == Material.STONE_AXE) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.RED + " ")) {
		        		event.setCancelled(true);
		                return;             
		        	}  
		        }
		        if(clicked != null && clicked.getType() == Material.BONE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.SKELETON_SKULL) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.RED_CONCRETE) {
		        	try {
		        		if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거래 수락")) {
		        			event.setCancelled(true);
					    	return;
		        		}
		        	} catch(Exception e) {
		        		
		        	}
		        }
		        if(clicked != null && clicked.getType() == Material.GREEN_CONCRETE) {
		        	try {
		        		if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "거래 수락")) {
		        			event.setCancelled(true);
					    	return;
		        		}
		        	} catch(Exception e) {
		        		
		        	}
		        }
		        if(clicked != null && clicked.getType() == Material.SLIME_BALL) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "강화하기")) {
		        		Inventory inv = event.getInventory();
		        		ReinforcementMakeEvent rm = new ReinforcementMakeEvent();
		        		if(rm.rein(player, inv) == false) {
		        			event.setCancelled(true);
		        			return;
		        		}
		        	}
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "장비 제작")) {
		        		Inventory inv = event.getInventory();
		        		CraftingItem ci = new CraftingItem();
		        		ci.make(player, inv);
		        		event.setCancelled(true);
		        		return;
		        	}
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "포션 제작")) {
		        		Inventory inv = event.getInventory();
		        		CraftingPotion cp = new CraftingPotion();
		        		cp.make(player, inv);
		        		event.setCancelled(true);
		        		return;
		        	}
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "음식 제작")) {
		        		Inventory inv = event.getInventory();
		        		CraftingFood cp = new CraftingFood();
		        		cp.make(player, inv);
		        		event.setCancelled(true);
		        		return;
		        	}
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "캐릭터 생성")) {
		        		player.closeInventory();
		        		Inventory inv = event.getInventory();
		        		if((inv.getItem(0) != null) && (inv.getItem(1) != null) && (inv.getItem(2) != null)
		        				&& (inv.getItem(3) != null) && (inv.getItem(4) != null)) {
		        			player.sendMessage(ChatColor.BOLD + "캐릭터는 5명까지만 생성할 수 있습니다.");
		        		} else {
		        			new NewCharacter(player, getDataFolder());
		        		}
		        		event.setCancelled(true);
		        		return;
		        	}
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "상자 열기")) {
		        		try {
		        			Inventory inv = event.getInventory();
			        		MysteryChestOpen mco = new MysteryChestOpen();
			        		mco.make(player, inv);
		        		} catch(Exception e) {
		        			
		        		}
		        		event.setCancelled(true);
		        		return;
		        	}
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "세공하기")) {
		        		Inventory inv = event.getInventory();
		        		MetalwareMakeEvent rm = new MetalwareMakeEvent();
		        		rm.rein(player, inv);
		        		event.setCancelled(true);
		        		return;
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.NETHER_STAR) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "본 파이터의 별")) {
		        		new AddCharacter(player, "boneFighter", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "기사의 별")) {
		        		new AddCharacter(player, "knight", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "프리스트의 별")) {
		        		new AddCharacter(player, "priest", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "광전사의 별")) {
		        		new AddCharacter(player, "berserker1", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "도박사의 별")) {
		        		new AddCharacter(player, "gambler", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "그림자 무사의 별")) {
		        		new AddCharacter(player, "shadowKnight", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "버서커의 별")) {
		        		new AddCharacter(player, "berserker2", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "군인의 별")) {
		        		new AddCharacter(player, "soldier", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "그림 리퍼의 별")) {
		        		new AddCharacter(player, "grimReaper", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "아처의 별")) {
		        		new AddCharacter(player, "archer", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "데빌의 별")) {
		        		new AddCharacter(player, "devil", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "엔젤의 별")) {
		        		new AddCharacter(player, "angel", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "대행자의 별")) {
		        		new AddCharacter(player, "agent", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "마인의 별")) {
		        		new AddCharacter(player, "akuma", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "팔라딘의 별")) {
		        		new AddCharacter(player, "paladin", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "용기사의 별")) {
		        		new AddCharacter(player, "dragonKnight", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "조커의 별")) {
		        		new AddCharacter(player, "commander", getDataFolder());
		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "파워레인저의 별")) {
		        		new AddCharacter(player, "powerRanger", getDataFolder());
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.SADDLE) {
		        	if(!clicked.hasItemMeta()) {
		        		event.setCancelled(true);
			            return;
		        	}
		        }
		        if(clicked != null && clicked.getType() == Material.LIME_CONCRETE) {
		        	int idx = 0;
		        	for(ItemStack item : event.getInventory().getContents()) {
		        		if(item == null) {
		        			idx++;
		        			continue;
		        		}
		        		try {
		        			System.out.println(player.getDisplayName() + "이/가 " + item.getItemMeta().getDisplayName() 
		        					+ "(" + item.getItemMeta().getLocalizedName() + ")" + ChatColor.WHITE + "을/를 거래하였다." + "[Idx: " + idx + "]");
		        		} catch(Exception e) {
		        			
		        		}
		        		idx++;
		        	}
		        }
			} catch(Exception e) {
				
			}
		}
    }
	
	@EventHandler
	public void placeBlockEvent(BlockPlaceEvent event) {
		Player player = (Player) event.getPlayer();
		if(player.getGameMode()==GameMode.SURVIVAL || player.isOp() == false) {
			event.setCancelled(true);
		}
		if(player.getGameMode()==GameMode.CREATIVE && player.isOp()) {
			if(!event.canBuild()) {
				event.setBuild(true);
			}
		}
	}
	
	@EventHandler
	public void offPlayer(PlayerQuitEvent event) {
		Player player = event.getPlayer();	
		
		//adventure
		player.setGameMode(GameMode.ADVENTURE);
		
		// Ban
		if ((player.getUniqueId().toString().equalsIgnoreCase("5d5f3cf5-bbec-4dba-b97c-fe2ddf900191"))) {
			event.setQuitMessage(null);
			return;
		}
		
		// Message
		if (player.getDisplayName().equalsIgnoreCase("yumehama")) {
			event.setQuitMessage(ChatColor.DARK_RED + "'더 게임 종결자' 유메하마" + ChatColor.WHITE + "님이 로그아웃 하였습니다.");
		} else if (player.getDisplayName().equalsIgnoreCase("WoolRing")) {
			event.setQuitMessage(ChatColor.GREEN + "'노란 머리가 젤다죠?' 울링" + ChatColor.WHITE + "님이 아뇨 뚱인데요?");
		} else if (player.getDisplayName().equalsIgnoreCase("_nanoboost_")) {
			event.setQuitMessage(ChatColor.RED + "7월 26일 해병대 훈련소 들어갑니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("why9196")) {
			event.setQuitMessage(ChatColor.BLUE + "??????????!?????");
		} else if(player.getDisplayName().equalsIgnoreCase("Akilae3102")) {
			event.setQuitMessage(ChatColor.AQUA + "'노랑단은 가벼운' 아킬레가 세상을 떠났습니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("Espina_ID")) {
			event.setQuitMessage(ChatColor.BOLD + "'탈영병' 에스피나의 시간이 얼마 남지 않았습니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("KangOSung")) {
			event.setQuitMessage(ChatColor.BOLD + "'일이 생긴' 캉님이 급히 떠났습니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("Illusion__")) {
			event.setQuitMessage(ChatColor.BOLD + "훗, 오늘도 할 일을 끝내버렸군.");
		} else if(player.getDisplayName().equalsIgnoreCase("JunletTridner")) {
			event.setQuitMessage(ChatColor.GOLD + "세계 최고의 운을 가진 그 분이 세상을 떠났습니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("SARASHINA_RUKA")) {
			event.setQuitMessage(ChatColor.YELLOW + "오늘도 하루종일 광질을 했습니다.");
		} else {
			event.setQuitMessage("야생의 누군가가 도망쳐버렸다.");
		}
		
		// pity system
		new PitySystem().removePlayer(player);
		// Off in Dungeon
		new OffInDungeon(player);
		// Refresh Server
		int num = 0;
		for (Player allPlayer : Bukkit.getOnlinePlayers()) {
			num++;
		}
		if(num==1) {
			for(Entity ent : player.getWorld().getEntities()){
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
					if(ent.getType() == EntityType.LLAMA) {
						ent.remove();
					}
					if(ent.getType() == EntityType.CREEPER) {
						ent.remove();
					}
					if(ent.getType() == EntityType.RABBIT) {
						ent.remove();
					}
					if(ent.getType() == EntityType.PANDA) {
						ent.remove();
					}
					if(ent.getType() == EntityType.OCELOT) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ZOGLIN) {
						ent.remove();
					}
					if(ent.getType() == EntityType.HORSE) {
						if(((Horse) ent).isCustomNameVisible()) {
							ent.remove();
						}
					}
					if(ent.getType() == EntityType.ARMOR_STAND) {
						ArmorStand as = (ArmorStand) ent;
						if(as.getHelmet().getType() == Material.ANDESITE_STAIRS) {
							ent.remove();
						} else if(as.getHelmet().getType() == Material.RED_NETHER_BRICK_STAIRS) {
							ent.remove();
						} else if(as.getHelmet().getType() == Material.POLISHED_ANDESITE_STAIRS) {
							ent.remove();
						} else if(as.getItemInHand().getType() == Material.POLISHED_BLACKSTONE_SLAB) {
							ent.remove();
						} else if(as.getItemInHand().getType() == Material.GREEN_CARPET) {
							ent.remove();
						}
					}
					if(ent.getType() == EntityType.DROPPED_ITEM) {
						ent.remove();
					}
				} catch(Exception e) {
					
				}
			}
		}	
		
		//저장
		new SaveAll(player, getDataFolder());
		
		//파티클 제거
		try {
			ParticleData pd = new ParticleData(player.getUniqueId());
			if(pd.hasID()) {
				pd.endTask();
				pd.removeID();
			}
		} catch(Exception e) {
			
		}
		
		//파티 제거
		try {
			Cmd8Party cp = new Cmd8Party();
			ArrayList<Player> party = cp.getPlayerParty(player);
			if(party.size() != 0) {
				party.remove(player);
				player.sendMessage(ChatColor.RED + "Leave the party.");
				for(Player p : party) {
					p.sendMessage(ChatColor.RED + "" + player.getDisplayName() + " leave your party.");
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void entityChangeBlockEvent(EntityChangeBlockEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void blockPhysicsEvent(BlockPhysicsEvent event) {
		Material mat = event.getBlock().getType();
		if(mat == Material.ACACIA_BUTTON || mat == Material.BIRCH_BUTTON || mat == Material.CRIMSON_BUTTON || mat == Material.DARK_OAK_BUTTON
				|| mat == Material.JUNGLE_BUTTON || mat == Material.OAK_BUTTON || mat == Material.POLISHED_BLACKSTONE_BUTTON || mat == Material.SPRUCE_BUTTON
				|| mat == Material.STONE_BUTTON || mat == Material.WARPED_BUTTON || mat == Material.ACACIA_PRESSURE_PLATE || mat == Material.BIRCH_PRESSURE_PLATE
				|| mat == Material.CRIMSON_PRESSURE_PLATE || mat == Material.DARK_OAK_PRESSURE_PLATE || mat == Material.HEAVY_WEIGHTED_PRESSURE_PLATE || mat == Material.JUNGLE_PRESSURE_PLATE
				|| mat == Material.LIGHT_WEIGHTED_PRESSURE_PLATE || mat == Material.OAK_PRESSURE_PLATE || mat == Material.POLISHED_BLACKSTONE_PRESSURE_PLATE || mat == Material.SPRUCE_PRESSURE_PLATE
				|| mat == Material.STONE_PRESSURE_PLATE || mat == Material.WARPED_PRESSURE_PLATE || mat == Material.ACACIA_DOOR || mat == Material.BIRCH_DOOR
				|| mat == Material.CRIMSON_DOOR || mat == Material.DARK_OAK_DOOR || mat == Material.IRON_DOOR || mat == Material.JUNGLE_DOOR
				|| mat == Material.OAK_DOOR || mat == Material.SPRUCE_DOOR || mat == Material.WARPED_DOOR || mat == Material.REPEATER
				|| mat == Material.TRIPWIRE_HOOK || mat == Material.TRIPWIRE || mat == Material.STRING || mat == Material.REDSTONE
				|| mat == Material.REDSTONE_WIRE|| mat == Material.COMMAND_BLOCK || mat == Material.CHAIN_COMMAND_BLOCK || mat == Material.REPEATING_COMMAND_BLOCK) {
			event.setCancelled(false);
		} else {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void waterPassEvent(BlockFromToEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void coralEvent(BlockFadeEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void arrowRemove(ProjectileHitEvent event) {
		try {
			event.getEntity().getPassenger().remove(); 
			Entity ent = event.getEntity().getPassenger();
			Item item = (Item) ent;
			if(item.getItemStack().getType() == Material.BLUE_ICE) {
				ent.getWorld().playSound(ent.getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0f, 1.0f);
			} else if(item.getItemStack().getType() == Material.END_CRYSTAL) {
				ent.getWorld().playSound(ent.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
			}
		} catch(Exception e) {
			
		}
		event.getEntity().remove();
	}
	
	@EventHandler
	public void ExplosionCancel(EntityExplodeEvent event) {
		Entity entity = event.getEntity();
		
		if(entity instanceof Creeper) {
			for(PotionEffect effect : ((LivingEntity) entity).getActivePotionEffects ()){
				((LivingEntity) entity).removePotionEffect(effect.getType());
		    }
			event.setCancelled(true);
		}
		if(entity instanceof Fireball) {
			event.setCancelled(true);
		}
		if(event.getEntityType() == EntityType.PRIMED_TNT || event.getEntityType() == EntityType.ENDER_CRYSTAL || event.getEntityType() == EntityType.MINECART_TNT) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void fireballFireCancel(ExplosionPrimeEvent event) {
		event.setFire(false); 
		
		Entity ent = event.getEntity();
		if(ent instanceof Creeper) {
			for(PotionEffect effect : ((LivingEntity) ent).getActivePotionEffects ()){
				((LivingEntity) ent).removePotionEffect(effect.getType());
		    }
		}
		if (ent instanceof Fireball) {
			event.setRadius(2);
		}
		 
	}
	
	@EventHandler
	public void conversionEvent(EntityTransformEvent event) {
		if(event.getEntity().getType() == EntityType.ZOMBIE) {
			event.getEntity().remove();
		} else if(event.getEntity().getType() == EntityType.HUSK) {
			event.getEntity().remove();
		} else if(event.getEntity().getType() == EntityType.PIGLIN) {
			event.getEntity().remove();
		}
	}
	
	@EventHandler
	public void sheepColor(SheepDyeWoolEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void craftEvent(CraftItemEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void throwEvent(ProjectileLaunchEvent event) {
		if(event.getEntity() instanceof Egg || event.getEntity() instanceof EnderPearl) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockChange(EntityChangeBlockEvent event) {
//		if(event.getBlock().getType() != Material.REDSTONE_ORE && event.getBlock().getType() != Material.REDSTONE && event.getBlock().getType() != Material.REDSTONE_WIRE
//				 && event.getBlock().getType() != Material.REDSTONE_BLOCK && event.getBlock().getType() != Material.REDSTONE_LAMP && event.getBlock().getType() != Material.REDSTONE_TORCH
//				 && event.getBlock().getType() != Material.REDSTONE_WALL_TORCH && event.getBlock().getType() != Material.REPEATER && event.getBlock().getType() != Material.COMPARATOR) {
//			event.setCancelled(true);
//			event.getBlock().setType(Material.AIR);
//		}
	}
	
	@EventHandler
	public void worldChange(PlayerChangedWorldEvent event) {
		Player player = event.getPlayer();
		if(!player.getWorld().getName().equalsIgnoreCase("world")) {
			player.teleport(new Location(Bukkit.getWorld("world"), -1844, 71, 3012));
		}
	}
	
	@EventHandler
	public void slimeEvent(SlimeSplitEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void armorstandEvent(PlayerArmorStandManipulateEvent event) {
		if(event.getPlayer().getGameMode() != GameMode.CREATIVE) {
			event.setCancelled(true);
			return;
		}
	}
	
	@EventHandler
	public void breedEvent(EntityBreedEvent event) {
		event.setCancelled(true);
		return;
	}
	
	@EventHandler
	public void consoleEvent(ServerCommandEvent event) {
		if(event.getCommand().equals("where")) {
			for (Player allPlayer : Bukkit.getOnlinePlayers()) {
				getLogger().info(allPlayer.getDisplayName() + " " + (int)(allPlayer.getLocation().getX()) + " " + (int)(allPlayer.getLocation().getY()) + " " + (int)(allPlayer.getLocation().getZ()));
			}
		} else if(event.getCommand().split(" ")[0].equals("k")) {
			try {
				String[] ary = event.getCommand().split(" ");
				if(ary.length == 3) {
					Player p = Bukkit.getPlayer(ary[2]);
					try {
						if(ary[1].equals("0")) {
							p.kickPlayer("서버가 재시작되면서 게임에서 나가졌습니다.");
						} else if(ary[1].equals("1")) {
							p.kickPlayer("점검 중입니다.");
						} else if(ary[1].equals("2")) {
							p.kickPlayer("매크로 사용이 감지되었습니다. 현재 1회 경고를 받은 상태이며, 자세한 사항은 디스코드 공지를 확인하시길 바랍니다.");
						}
					} catch(Exception e) {
						
					}
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equals("trace")) {
			try {
				String[] ary = event.getCommand().split(" ");
				if(ary.length == 2) {
					Player player = Bukkit.getPlayer(ary[1]);
					try {
						taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

							int time = 0;
							ThreadTracePlayer td = new ThreadTracePlayer(player.getUniqueId());

							@Override
							public void run() {
								if (!td.hasID()) {
									td.setID(taskID);
								}

								if (time < 600) {
									getLogger().info(player.getDisplayName() + " " 
											+ ((int)(player.getLocation().getX()*10))/10.0 + " " 
											+ ((int)(player.getLocation().getY()*10))/10.0 + " " 
											+ ((int)(player.getLocation().getZ()*10))/10.0);
								}

								if (time >= 600) {
									td.endTask();
									td.removeID();
									return;
								}

								time++;
							}

						}, 0, 1);
					} catch(Exception e) {
						
					}
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equals("chat")) {
			try {
				String[] args = event.getCommand().substring(5).split(" ");
				String sentance = "";
				for(String str : args) {
					if(str.length() != 0) {
						while(true) {
							if(str.contains("&")) {
								int idx = str.indexOf("&");
								str = str.substring(0, idx) + "§" + str.substring(idx+1);
							} else {
								break;
							}
						}
						sentance += str + " ";
					}
				}
				for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					allPlayer.sendMessage(sentance);
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equals("killyou")) {
			try {
				String[] ary = event.getCommand().split(" ");
				if(ary.length == 2) {
					Player player = Bukkit.getPlayer(ary[1]);
					player.damage(9999999);
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equals("giveyou")) {
			try {
				Player owner = Bukkit.getPlayer("yumehama");
				if(owner.isOnline()) {
					ItemStack item = owner.getInventory().getItemInMainHand();
					
					String[] ary = event.getCommand().split(" ");
					if(ary.length == 2) {
						Player player = Bukkit.getPlayer(ary[1]);
						player.getInventory().addItem(item);
					}
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equals("setExp")) {
			try {
				String[] ary = event.getCommand().split(" ");
				if(ary.length == 3) {
					Player player = Bukkit.getPlayer(ary[1]);
					try {
						player.setExp((float) (Integer.parseInt(ary[2]) / 100.0));
					} catch(Exception e) {
						
					}
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equals("muyaho")) {
			try {
				String[] ary = event.getCommand().split(" ");
				if(ary.length == 3) {
					Player player = Bukkit.getPlayer(ary[1]);
					String rank = ary[2];
					if(ary[2].equals("7")) {
						try {
							Location chestLoc = new Location(player.getWorld(), -1843, 92, 3043);
							Block block = chestLoc.getBlock();
							Chest chest = (Chest) block.getState();
							ItemStack weapon = chest.getInventory().getItem(4).clone();
							ItemMeta im = weapon.getItemMeta();
							im.setDisplayName(ChatColor.DARK_PURPLE + "무야호");
							ArrayList<String> var1Lore = new ArrayList();
							var1Lore.add(ChatColor.GRAY + "레벨 범위: ??");
							var1Lore.add(ChatColor.GRAY + " ");
							var1Lore.add(ChatColor.GRAY + "힝 속았지?");
							im.setLore(var1Lore);
							weapon.setItemMeta(im);
							player.getInventory().addItem(weapon);
							player.sendMessage(ChatColor.DARK_PURPLE + "의문의 상자" + ChatColor.WHITE + "를 획득했다.");
						} catch(Exception e) {
							
						}
					} else if(ary[2].equals("6")) {
						try {
							Location chestLoc = new Location(player.getWorld(), -1843, 92, 3043);
							Block block = chestLoc.getBlock();
							Chest chest = (Chest) block.getState();
							ItemStack weapon = chest.getInventory().getItem(3).clone();
							ItemMeta im = weapon.getItemMeta();
							im.setDisplayName(ChatColor.DARK_RED + "무야호");
							ArrayList<String> var1Lore = new ArrayList();
							var1Lore.add(ChatColor.GRAY + "레벨 범위: ??");
							var1Lore.add(ChatColor.GRAY + " ");
							var1Lore.add(ChatColor.GRAY + "힝 속았지?");
							im.setLore(var1Lore);
							weapon.setItemMeta(im);
							player.getInventory().addItem(weapon);
							player.sendMessage(ChatColor.DARK_RED + "의문의 상자" + ChatColor.WHITE + "를 획득했다.");
						} catch(Exception e) {
							
						}
					} else if(ary[2].equals("5")) {
						try {
							Location chestLoc = new Location(player.getWorld(), -1843, 92, 3043);
							Block block = chestLoc.getBlock();
							Chest chest = (Chest) block.getState();
							ItemStack weapon = chest.getInventory().getItem(2).clone();
							ItemMeta im = weapon.getItemMeta();
							im.setDisplayName(ChatColor.AQUA + "무야호");
							ArrayList<String> var1Lore = new ArrayList();
							var1Lore.add(ChatColor.GRAY + "레벨 범위: ??");
							var1Lore.add(ChatColor.GRAY + " ");
							var1Lore.add(ChatColor.GRAY + "힝 속았지?");
							im.setLore(var1Lore);
							weapon.setItemMeta(im);
							player.getInventory().addItem(weapon);
							player.sendMessage(ChatColor.AQUA + "의문의 상자" + ChatColor.WHITE + "를 획득했다.");
						} catch(Exception e) {
							
						}
					}
					
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		}
		
	}
	
	@EventHandler
	public void onBlockIgnite(BlockIgniteEvent event) {
		if(!(event.getCause() == IgniteCause.FLINT_AND_STEEL)) {
			event.setCancelled(true);
			return;
		}
	}
	
	@EventHandler
	public void blockBurnEvent(BlockBurnEvent event) {
		event.setCancelled(true);
		return;
	}
	
	@EventHandler
	public void onHangingBreak (HangingBreakEvent event) {
	    if (event.getCause() == RemoveCause.EXPLOSION) {
	        event.setCancelled(true);
	    } 
	    if (event.getCause() == RemoveCause.PHYSICS) {
	    	event.setCancelled(true);
	    }
	    if (event.getCause() == RemoveCause.OBSTRUCTION) {
	    	event.setCancelled(true);
	    }
	}
	
	@EventHandler
	public void onHangingBreakByEntity (HangingBreakByEntityEvent event) {
	    if (event.getCause() == RemoveCause.EXPLOSION) {
	        event.setCancelled(true);
	    } 
	    if (event.getCause() == RemoveCause.ENTITY) {
	    	if(!event.getRemover().isOp()) {
	    		event.setCancelled(true);
	    	}
	    }
	    if (event.getCause() == RemoveCause.PHYSICS) {
	    	event.setCancelled(true);
	    }
	    if (event.getCause() == RemoveCause.OBSTRUCTION) {
	    	event.setCancelled(true);
	    }
	}
	
	@EventHandler
	public void dismountEvent(VehicleExitEvent event) {
		if(event.getExited() instanceof Player) {
			if(event.getVehicle() instanceof Horse) {
				event.getVehicle().remove();
			}
		}
	}
	
	@EventHandler
	public void swapHand(PlayerSwapHandItemsEvent event) {
		try {
			Player player = event.getPlayer();
			ItemStack item1 = player.getInventory().getItemInMainHand();
			ItemStack item2 = player.getInventory().getItemInOffHand();
			if(item1.getItemMeta() == null) {
				new StepAndRolling().effect(player);
				event.setCancelled(true);
				return;
			}
			if(item2.getItemMeta() == null) {
				new StepAndRolling().effect(player);
				event.setCancelled(true);
				return;
			}
			try {
				if(!(item1.getType() == Material.LEATHER_HELMET || item1.getType() == Material.LEATHER_CHESTPLATE || item1.getType() == Material.LEATHER_LEGGINGS
						|| item1.getType() == Material.LEATHER_BOOTS || item1.getType() == Material.CHAINMAIL_HELMET || item1.getType() == Material.CHAINMAIL_CHESTPLATE 
						|| item1.getType() == Material.CHAINMAIL_LEGGINGS || item1.getType() == Material.CHAINMAIL_BOOTS || item1.getType() == Material.IRON_HELMET 
						|| item1.getType() == Material.IRON_CHESTPLATE || item1.getType() == Material.IRON_LEGGINGS || item1.getType() == Material.IRON_BOOTS 
						|| item1.getType() == Material.GOLDEN_HELMET || item1.getType() == Material.GOLDEN_CHESTPLATE || item1.getType() == Material.GOLDEN_LEGGINGS 
						|| item1.getType() == Material.GOLDEN_BOOTS || item1.getType() == Material.DIAMOND_HELMET || item1.getType() == Material.DIAMOND_CHESTPLATE 
						|| item1.getType() == Material.DIAMOND_LEGGINGS || item1.getType() == Material.DIAMOND_BOOTS || item1.getType() == Material.NETHERITE_HELMET 
						|| item1.getType() == Material.NETHERITE_CHESTPLATE || item1.getType() == Material.NETHERITE_LEGGINGS || item1.getType() == Material.NETHERITE_BOOTS)
						|| item1.getType() == Material.RABBIT_STEW || item1.getType() == Material.BEETROOT_SOUP || item1.getType() == Material.MUSHROOM_STEW
						|| item1.getType() == Material.SUSPICIOUS_STEW || item1.getType() == Material.POTION || item1.getType() == Material.HONEY_BOTTLE) {
					LimitLevel la = new LimitLevel();
					if(la.limit(player, item1) == false) {
						player.sendMessage(ChatColor.RED + "아직 이 무기를 다루기에는 내 힘이 부족하다.");
						return;
					}
				}
			} catch(Exception e) {
				
			}
			ExtraSkill ex = new ExtraSkill();
			boolean bool = ex.ExSkill(player, item1, item2);
			if(!(player.getInventory().contains(Material.HEART_OF_THE_SEA))) {
				ItemStack item = new ItemStack(Material.MAGMA_CREAM);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.RED + "마나없음");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
			}
			
			if(bool == false) {
				new StepAndRolling().effect(player);
			}
			
			event.setCancelled(true);
			return;
		} catch(Exception e) {
			event.setCancelled(true);
			return;
		}
	}
	
	@EventHandler
	public void entityUnbreak(HangingBreakByEntityEvent event) {
		if(event.getRemover() instanceof Player) {
			Player player = (Player) event.getRemover();
			if(player.getGameMode() == GameMode.ADVENTURE) {
				event.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void buildEvent(BlockCanBuildEvent event) {
		if(!event.isBuildable()) {
			event.setBuildable(true);
		}
	}
	
	@EventHandler
	public void moistureChangeEvent(MoistureChangeEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void leavesDecayEvent(LeavesDecayEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void entityBlockFormEvent(EntityBlockFormEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void invenClose(InventoryCloseEvent event) {
		try {
			if(event.getInventory().getType() == InventoryType.CHEST) {
				Player player = (Player) event.getPlayer();
				Inventory inv = event.getInventory();
				if(inv.getSize() == 27 && !player.isOp()) {
					if(inv.getItem(26) == null) {
						Cmd13Chest cc = new Cmd13Chest();
						new SaveAll(player, getDataFolder());
				    	if(cc.isPlayerInSelectAL(player.getUniqueId().toString())) {
				    		int num = cc.getChestNum(player.getUniqueId().toString());
				    		if(num != 1) {
				    			world.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_CLOSE, 1.0f, 1.0f);
				    			new ChestOwner(player, num, inv);
				    		}
				    	}
					} else {
						if(inv.getItem(26).getType() != Material.SHULKER_SHELL) {
							Cmd13Chest cc = new Cmd13Chest();
							new SaveAll(player, getDataFolder());
					    	if(cc.isPlayerInSelectAL(player.getUniqueId().toString())) {
					    		int num = cc.getChestNum(player.getUniqueId().toString());
					    		if(num != 1) {
					    			world.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_CLOSE, 1.0f, 1.0f);
					    			new ChestOwner(player, num, inv);
					    		}
					    	}
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		try {
			Inventory inv = event.getInventory();
			Player player = (Player) event.getPlayer();
			
			// 강화
			try {
				if(inv.getItem(7).getType() == Material.SLIME_BALL) {
					if(inv.getItem(8).getType() == Material.SHULKER_SHELL) {
						if(inv.getItem(2).getType() == Material.WHITE_STAINED_GLASS_PANE) {
							if(inv.getSize() == 9) {
								try {player.getInventory().addItem(inv.getItem(0));} catch(Exception e) {}
								try {player.getInventory().addItem(inv.getItem(1));} catch(Exception e) {}
							}
						}
					}
				}
			} catch(Exception e) {
				
			}
			
			// 의문의 상자 열기
			try {
				if(inv.getItem(7).getType() == Material.SLIME_BALL) {
					if(inv.getItem(8).getType() == Material.SHULKER_SHELL) {
						if(inv.getItem(2) == null || (inv.getItem(2).getType() != Material.WHITE_STAINED_GLASS_PANE)) {
							if(inv.getSize() == 9) {
								boolean bool = true;
								for(ItemStack item : inv.getContents()) {
									if (item == null) {
										continue;
									} 
									if(item.getType() == Material.HEART_OF_THE_SEA) {
										bool = false;
									}
								}
								if(bool) {
									try {player.getInventory().addItem(inv.getItem(0));} catch(Exception e) {}
									try {player.getInventory().addItem(inv.getItem(1));} catch(Exception e) {}
									try {player.getInventory().addItem(inv.getItem(2));} catch(Exception e) {}
									try {player.getInventory().addItem(inv.getItem(3));} catch(Exception e) {}
									try {player.getInventory().addItem(inv.getItem(4));} catch(Exception e) {}
									try {player.getInventory().addItem(inv.getItem(5));} catch(Exception e) {}
								} else {
									player.sendMessage(ChatColor.RED + "상자를 여는 도중 실수로 망가져버렸다.");
								}
							}
						}
					}
				}
			} catch(Exception e) {
				
			}
			
			// 장비 제작
			try {
				if(inv.getItem(43).getType() == Material.SLIME_BALL) {
					if(inv.getItem(44).getType() == Material.SHULKER_SHELL) {
						if(inv.getSize() == 45) {
							try {player.getInventory().addItem(inv.getItem(0));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(1));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(2));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(3));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(4));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(9));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(10));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(11));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(12));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(13));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(18));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(19));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(20));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(21));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(22));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(27));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(28));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(29));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(30));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(31));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(36));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(37));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(38));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(39));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(40));} catch(Exception e) {}
							
							try {player.getInventory().addItem(inv.getItem(25));} catch(Exception e) {}
						}
					}
				}
			} catch(Exception e) {
				
			}
			
			// 음식, 포션 제작
			try {
				if(inv.getItem(25).getType() == Material.SLIME_BALL) {
					if(inv.getItem(26).getType() == Material.SHULKER_SHELL) {
						if(inv.getSize() == 27) {
							try {player.getInventory().addItem(inv.getItem(1));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(2));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(3));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(10));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(11));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(12));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(19));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(20));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(21));} catch(Exception e) {}
							
							try {player.getInventory().addItem(inv.getItem(15));} catch(Exception e) {}
						}
					}
				}
			} catch(Exception e) {
				
			}
			
			// 거래
			try {
				new Trade().closeTradeInv(player, inv);
			} catch (Exception e) {

			}
			
			try {
				if(inv.getItem(0).getType() == Material.NETHER_STAR) {
					if(inv.getItem(8).getType() == Material.OAK_SIGN) {
						if(inv.getSize() == 9) {
							int p = rnd.nextInt(5);
							try {
								if(!player.getInventory().contains(Material.NETHER_STAR)) {
									//player.getInventory().addItem(inv.getItem(p));
								}
							} catch(Exception e) {
								
							}
							//player.teleport(new Location(player.getWorld(), -699, 52, 2135));
						}
					}
				}
			} catch(Exception e) {
				
			}
			
			new InvArrange(player);
			
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void regenHealth(EntityRegainHealthEvent event) {
		if(event.getRegainReason() == RegainReason.SATIATED) {
			event.setCancelled(true);
		}
		if(event.getRegainReason() == RegainReason.MAGIC) {
			if(event.getEntity() instanceof Player) {
				Player player = (Player) event.getEntity();
				HealBuffRatio hbr = new HealBuffRatio();
				hbr.cal(player, event.getAmount());
				event.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void tpEvent(PlayerTeleportEvent event) {
		Player player = event.getPlayer();
		Location loc = event.getTo();
		new TPMobSpawn(player, loc);
	}
	
	@EventHandler
	public void chatEvent(AsyncPlayerChatEvent event) {
//		Player player = event.getPlayer();
//		String msg = event.getMessage();
//		if(new RenameCraftingItem().renameCraftingItem(player, msg) == false) {
//			event.setCancelled(true);
//		}
	}
	
	@EventHandler
	public void fishingEvent(PlayerFishEvent event) {
		Player player = event.getPlayer();
		event.setExpToDrop(0);
		if(event.getCaught() != null) {
			event.getCaught().remove();
		} else {
			return;
		}
//		int num = rnd.nextInt(250);
//		System.out.println(num);
//		if(num == 0) {
//			ItemStack item = new ItemStack(Material.COOKIE);
//			ItemMeta im = item.getItemMeta();
//			im.setDisplayName(ChatColor.AQUA + "리로이");
//			item.setItemMeta(im);
//			player.getInventory().addItem(item);
//			player.sendMessage("그 녀석. 리로이를 획득하였다.");
//			for (Player allPlayer : Bukkit.getOnlinePlayers()) {
//			    allPlayer.sendMessage(player.getDisplayName() + "님이 리로이를 낚아버렸습니다.");
//			    allPlayer.sendMessage("==이벤트 종료==");
//			}
//		} else {
//			ItemStack item = new ItemStack(Material.COD);
//			ItemMeta im = item.getItemMeta();
//			im.setDisplayName(ChatColor.GRAY + "꽝");
//			item.setItemMeta(im);
//			player.getInventory().addItem(item);
//			player.sendMessage("꽝을 낚았다.");
//		}
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