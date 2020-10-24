package testPack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.Horse;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Item;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Player;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.event.Event.Result;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockIgniteEvent.IgniteCause;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreeperPowerEvent;
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
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
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
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerFishEvent;
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
import org.bukkit.event.vehicle.VehicleCollisionEvent;
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
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;
import org.bukkit.util.Vector;

import net.minecraft.server.v1_16_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_16_R1.PacketPlayOutTitle;
import net.minecraft.server.v1_16_R1.WorldGenDecoratorNetherGlowstone;
import net.minecraft.server.v1_16_R1.PacketPlayOutTitle.EnumTitleAction;

import java.util.Random;

public class Main extends JavaPlugin implements Listener{
	
	// gamerule doMobLoot false
	// gamerule doMobSpawning false
	// gamerule keepInventory true
	// gamerule doImmediateRespawn true
	// gamerule doLimitedCrafting true
	// gamerule mobGriefing false
	// gamerule doWeatherCycle false
	// Damage_ALL, Damage_Undead, Damage_Arthropods, Impaling, Sweeping, Protection_Environment, Protection_Fire, Protection_Explosion, Protection_Projectile, Thorns, Level
	
	Random rnd = new Random();
	World world;
	int sleep = 0;

	Cmd12EmeraldToggle et = new Cmd12EmeraldToggle();

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
		
		new RefreshServer();
		new NPCHitBox();
		
		
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
		
//		if (player.getDisplayName().equalsIgnoreCase("yumehama")) {
//			for (int x = 1400; x < 1600; x++) {
//				for (int y = 0; y < 55; y++) {
//					for (int z = 3328; z < 3584; z++) {
//						player.getWorld().getBlockAt(x, y, z).setType(Material.AIR);
//					}
//				}
//			}
//			// z = 1928~2050 ��ŸƮ
//
//			if (player.getDisplayName().equalsIgnoreCase("yumehama")) {
//				System.out.println(player.getLocation().toString());
//				player.teleport(new Location(world, -478, 55, 1302));
//			}
//		}
		
		// ���Ӱ����� �÷��̾�
		try {
//			if (!(player.getDisplayName().equalsIgnoreCase("yumehama"))) {
//				player.kickPlayer("���� ���� �� �Դϴ�.");
//				return;
//			}
			if ((player.getUniqueId().toString().equalsIgnoreCase("5d5f3cf5-bbec-4dba-b97c-fe2ddf900191"))) {
				player.kickPlayer("You are Banned");
				return;
			}
		} catch (Exception e) {
			System.err.println(player.getDisplayName() + "�� ������ �õ��Ͽ����ϴ�.");
		}
		
		//���ҽ��� ����
		if(player.getDisplayName().equalsIgnoreCase("woolring")) { 
			
		} else {
			player.setResourcePack("https://cdn.discordapp.com/attachments/557875773617340416/769112921950781450/SPOILER_tutorial_resource_pack_46.zip");
		}
		
		//Message
		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {
			event.setJoinMessage("�װ� ���ƿԴ�. " + ChatColor.DARK_RED + "'�� ���� ������' �����ϸ�.");
		} else if(player.getDisplayName().equalsIgnoreCase("WoolRing")) {
			event.setJoinMessage("�װ� ���ƿԴ�. " + ChatColor.GREEN + "'��Ʈ�� ��Ʈ�� ���� ����' �︵.");
		} else if(player.getDisplayName().equalsIgnoreCase("_nanoboost_")) {
			event.setJoinMessage("�װ� ���ƿԴ�. " + ChatColor.RED + "'0������ ���ι�' ����ν�Ʈ.");
		} else if(player.getDisplayName().equalsIgnoreCase("why9196")) {
			event.setJoinMessage("�װ� ���ƿԴ�. " + ChatColor.BLACK + "'�� ����� ����' ����.");
		} else if(player.getDisplayName().equalsIgnoreCase("Akilae3102")) {
			event.setJoinMessage("�װ� ���ƿԴ�. " + ChatColor.AQUA + "'ȭ������ ������ ��' ��ų��.");
		} else if(player.getDisplayName().equalsIgnoreCase("Espina_ID")) {
			event.setJoinMessage("�װ� ���ƿԴ�. " + ChatColor.BOLD + "'�̵带 ����ϴ�' �����ǳ�.");
		} else {
			event.setJoinMessage("�߻��� �������� �����ߴ�.");
		}
		
		//set 
		player.setGameMode(GameMode.ADVENTURE);
		player.setOp(false);
		if(player.getDisplayName().equalsIgnoreCase("yumehama") || player.getDisplayName().equalsIgnoreCase("WoolRing")) {
			player.setOp(true);
		}		
		
		//��ǥ ���� ����
		for (ItemStack is : player.getInventory().getContents()) {
			if(is == null) continue;
			try {
				int len = is.getItemMeta().getDisplayName().length();
				if (is.getItemMeta().getDisplayName().substring(len-2,len).equals("��ǥ")) {
					player.getInventory().remove(is);
					player.getInventory().setItem(7,is);
			    }
			} catch(Exception e) {
				
			}
		}
		
		//bar
		BossBar bar = Bukkit.createBossBar(ChatColor.BOLD + "" + ChatColor.AQUA + "���� ����ġ 2��", BarColor.BLUE, BarStyle.SOLID);
		bar.setVisible(true);
		bar.addPlayer(player);
		BossBar bar2 = Bukkit.createBossBar(ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "��ȭȮ�� ����", BarColor.PURPLE, BarStyle.SOLID);
		bar2.setVisible(false);
		bar2.addPlayer(player);
		BossBar bar3 = Bukkit.createBossBar(ChatColor.BOLD + "" + ChatColor.DARK_GREEN + "���޶��� ȹ�淮 ���� 2��(����)", BarColor.GREEN, BarStyle.SOLID);
		bar3.setVisible(false);
		bar3.addPlayer(player);
		BossBar bar4 = Bukkit.createBossBar(ChatColor.BOLD + "" + ChatColor.DARK_RED + "���̵�", BarColor.RED, BarStyle.SOLID);
		bar4.setVisible(false);
		bar4.addPlayer(player);
		try {
			File dataFolder = getDataFolder();
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File file = new File(getDataFolder(), player.getDisplayName() + "_data.dat");
                if(!file.exists()) {
                    try {
                    	file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } 
            }
		} catch(Exception e) {
			
		}
		try {
			File dataFolder = getDataFolder();
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File file = new File(getDataFolder(), player.getDisplayName() + "_Qdata.dat");
                if(!file.exists()) {
                    try {
                    	file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                	FileReader filereader = new FileReader(file);
                    BufferedReader bufReader = new BufferedReader(filereader);
                    String quest = "";
                    String num = "";
                    quest = bufReader.readLine();
                    num = bufReader.readLine();
                    if(quest.equals("q1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q1(event.getPlayer(), Integer.parseInt(num));
                    }    
                    if(quest.equals("q2")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q2(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q3")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q3(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q4")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q4(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q5")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q5(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q6")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q6(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q7")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q7(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q8")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q8(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q9")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q9(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q10")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q10(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q11")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q11(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q12")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q12(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q13")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q13(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q14")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q14(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q15")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q15(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q16")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q16(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q17")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q17(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("q18")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.q18(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq1_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq1_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq1_2")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq1_2(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq1_3")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq1_3(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq1_4")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq1_4(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq1_5")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq1_5(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq1_6")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq1_6(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq2")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq2(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq2_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq2_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("eq2_2")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.eq2_2(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq2")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq2(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq3")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq3(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq4")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq4(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq5")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq5(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq6")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq6(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq7")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq7(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq8")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq8(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq9")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq9(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq10")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq10(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq11")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq11(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq12")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq12(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq13")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq13(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq14")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq14(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq15")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq15(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq15_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq15_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq16")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq16(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq17")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq17(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq18")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq18(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq19")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq19(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq20")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq20(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq20_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq20_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq20_2")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq20_2(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq21")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq21(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq22")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq22(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq23")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq23(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq24")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq24(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq25")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq25(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq26")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq26(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq26_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq26_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq27")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq27(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq28")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq28(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq29")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq29(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq29_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq29_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq30")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq30(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq31")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq31(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq32")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq32(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq33")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq33(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq33_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq33_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq34")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq34(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq34_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq34_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq35")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq35(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq35_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq35_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq36")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq36(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq37")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq37(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq37_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq37_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq37_2")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq37_2(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq38")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq38(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq38_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq38_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq38_2")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq38_2(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq39")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq39(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq39_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq39_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq39_2")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq39_2(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq40")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq40(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq41")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq41(event.getPlayer(), Integer.parseInt(num));
                    }
                    if(quest.equals("mq41_1")) {
                    	QuestBoard qb = new QuestBoard();
                		qb.mq41_1(event.getPlayer(), Integer.parseInt(num));
                    }
                    bufReader.close();
                }
            }
		} catch(Exception e) {
			
		}
		
//		if(player.getDisplayName().equals("yumehama") || player.getDisplayName().equalsIgnoreCase("WoolRing")) {
//			player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, Integer.MAX_VALUE, 0));
//		}
		world = player.getWorld();
		JoinJob jj = new JoinJob();
		if(!(player.getDisplayName().equalsIgnoreCase("WoolRing1"))) {
			jj.chooseJob(player);
		}
		
		//Mob Spawning Field	
		new MobThread(player);	
			
		ItemStack master = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta masterIm = master.getItemMeta();
		masterIm.setLocalizedName("100000,100000,100000,100000,0,100000,100000,100000,100000,100000,0");
		masterIm.addEnchant(Enchantment.DAMAGE_ALL, 0, true);
		masterIm.setDisplayName(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "���� ��[���� �����]");
		ArrayList<String> masterLore = new ArrayList();
		masterIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		masterIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		masterIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		masterIm.setUnbreakable(true);
		masterIm.setLore(masterLore);
		master.setItemMeta(masterIm);
		if(player.getDisplayName().equalsIgnoreCase("yumehama") && !player.getInventory().contains(master)) {player.getInventory().addItem(master);}
//		if(player.getDisplayName().equalsIgnoreCase("WoolRing") && !player.getInventory().contains(master)) {player.getInventory().addItem(master);}
		
//		ItemStack var1 = new ItemStack(Material.OAK_PLANKS);
//		ItemMeta var1Im = var1.getItemMeta();
//		var1Im.setLocalizedName("866,24,47,346,429,500,100,100,100,547,250");
//		var1Im.setDisplayName(ChatColor.DARK_RED + "�Ϸ�õ�����");
//		ArrayList<String> var1Lore = new ArrayList();
//		var1Lore.add(ChatColor.GRAY + "���� ����: 250");
//		var1Lore.add(ChatColor.GRAY + " ");
//		var1Lore.add(ChatColor.GRAY + "������ 50�� �������� ����� ����");
//		var1Lore.add(ChatColor.GRAY + "����� ������ Ŭ������ �˺��ٵ� ������ ����.");
//		var1Lore.add(ChatColor.GRAY + "���� ������ �Ҹ���� �� �����Ǿ���.");
//		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var1Im.setUnbreakable(true);
//		var1Im.setLore(var1Lore);
//		var1.setItemMeta(var1Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var1);}
//		
//		ItemStack var2 = new ItemStack(Material.SPRUCE_PLANKS);
//		ItemMeta var2Im = var2.getItemMeta();
//		var2Im.setLocalizedName("300,0,0,100,300,200,100,0,0,0,250");
//		var2Im.setDisplayName(ChatColor.DARK_RED + "��ũ ���޼�");
//		ArrayList<String> var2Lore = new ArrayList();
//		var2Lore.add(ChatColor.GRAY + "���� ����: 250");
//		var2Lore.add(ChatColor.GRAY + " ");
//		var2Lore.add(ChatColor.GRAY + "ũ����Ż������ �ֱ��� ������� ����");
//		var2Lore.add(ChatColor.GRAY + "�̸��� ���� '����� ����ġ�� ��'�̴�.");	
//		var2Lore.add(ChatColor.GRAY + "���� ������ �Ҹ���� �� �����Ǿ���.");
//		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var2Im.setUnbreakable(true);
//		var2Im.setLore(var2Lore);
//		var2.setItemMeta(var2Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var2);}
//		
//		ItemStack var3 = new ItemStack(Material.COBBLESTONE_WALL);
//		ItemMeta var3Im = var3.getItemMeta();
//		var3Im.setLocalizedName("0,0,0,0,0,699,3,0,1,0,276");
//		var3Im.setDisplayName(ChatColor.DARK_BLUE + "�η���ȣ��");
//		ArrayList<String> var3Lore = new ArrayList();
//		var3Lore.add(ChatColor.GRAY + "���� ����: 276");
//		var3Lore.add(ChatColor.GRAY + " ");
//		var3Lore.add(ChatColor.GRAY + "������: _nanoboost_");
//		var3Lore.add(ChatColor.GRAY + "���� ������ �Ҹ���� �� �����Ǿ���.");
//		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var3Im.setUnbreakable(true);
//		var3Im.setLore(var3Lore);
//		var3.setItemMeta(var3Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var3);}
//		
//		ItemStack var4 = new ItemStack(Material.JUNGLE_PLANKS);
//		ItemMeta var4Im = var4.getItemMeta();
//		var4Im.setLocalizedName("1021,544,609,184,215,0,7,0,0,1124,95");
//		var4Im.setDisplayName(ChatColor.DARK_BLUE + "�η��л���");
//		ArrayList<String> var4Lore = new ArrayList();
//		var4Lore.add(ChatColor.GRAY + "���� ����: 95");
//		var4Lore.add(ChatColor.GRAY + " ");
//		var4Lore.add(ChatColor.GRAY + "������: _nanoboost_");
//		var4Lore.add(ChatColor.GRAY + "���� ������ �Ҹ���� �� �����Ǿ���.");
//		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var4Im.setUnbreakable(true);
//		var4Im.setLore(var4Lore);
//		var4.setItemMeta(var4Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var4);}
//		
//		ItemStack var5 = new ItemStack(Material.CYAN_WOOL);
//		ItemMeta var5Im = var5.getItemMeta();
//		var5Im.setLocalizedName("859,100,0,100,10,200,100,100,100,858,200");
//		var5Im.setDisplayName(ChatColor.AQUA + "���������� ��");
//		ArrayList<String> var5Lore = new ArrayList();
//		var5Lore.add(ChatColor.GRAY + "���� ����: 200");
//		var5Lore.add(ChatColor.GRAY + " ");
//		var5Lore.add(ChatColor.GRAY + "���������� ����ϴ� ���̴�.");
//		var5Lore.add(ChatColor.GRAY + "���� ������ �Ҹ���� �� �����Ǿ���.");
//		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		var5Im.setUnbreakable(true);
//		var5Im.setLore(var5Lore);
//		var5.setItemMeta(var5Im);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(var5);}
		
//		ItemStack helmet = new ItemStack(Material.IRON_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("0,30,30,30,0,400,30,30,30,50,330");
//		helmetIm.setDisplayName(ChatColor.GREEN + "������ ���");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "���� ����: 330");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "������ �ֱ��� ������� ���");
//		helmetLore.add(ChatColor.GRAY + "���������� �ؾ��� ���� ǰ����");
//		helmetLore.add(ChatColor.GRAY + "������ �Ǿ���.");
//		helmetLore.add(ChatColor.GRAY + "(��Ʈ ������)");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("0,30,30,30,0,400,30,30,30,50,330");
//		chestplateIm.setDisplayName(ChatColor.GREEN + "������ ����");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "���� ����: 330");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "������ �ֱ��� ������� ����");
//		chestplateLore.add(ChatColor.GRAY + "���������� �ؾ��� ���� ǰ����");
//		chestplateLore.add(ChatColor.GRAY + "������ �Ǿ���.");
//		chestplateLore.add(ChatColor.GRAY + "(��Ʈ ������)");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("0,30,30,30,0,400,30,30,30,50,330");
//		leggingsIm.setDisplayName(ChatColor.GREEN + "������ ����");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "���� ����: 330");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "������ �ֱ��� ������� ����");
//		leggingsLore.add(ChatColor.GRAY + "���������� �ؾ��� ���� ǰ����");
//		leggingsLore.add(ChatColor.GRAY + "������ �Ǿ���.");
//		leggingsLore.add(ChatColor.GRAY + "(��Ʈ ������)");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.IRON_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("0,30,30,30,0,400,30,30,30,50,330");
//		bootsIm.setDisplayName(ChatColor.GREEN + "������ �Ź�");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "���� ����: 330");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "������ �ֱ��� ������� �Ź�");
//		bootsLore.add(ChatColor.GRAY + "���������� �ؾ��� ���� ǰ����");
//		bootsLore.add(ChatColor.GRAY + "������ �Ǿ���.");
//		bootsLore.add(ChatColor.GRAY + "(��Ʈ ������)");
//		bootsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		bootsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		bootsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		bootsIm.setUnbreakable(true);
//		bootsIm.setLore(bootsLore);
//		boots.setItemMeta(bootsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(boots);}
		
		
//		ItemStack weapon = new ItemStack(Material.BIRCH_PLANKS);
//		ItemMeta weaponIm = weapon.getItemMeta();
//		weaponIm.setLocalizedName("0,800,800,800,300,100,200,200,200,300,330");
//		weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "������");
//		ArrayList<String> weaponLore = new ArrayList();
//		weaponLore.add(ChatColor.GRAY + "���� ����: 330");
//		weaponLore.add(ChatColor.GRAY + " ");
//		weaponLore.add(ChatColor.GRAY + "�������� ���� ��� ��븦 ��������� ��");
//		weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		weaponIm.setUnbreakable(true);
//		weaponIm.setLore(weaponLore);
//		weapon.setItemMeta(weaponIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(weapon);}
//
//		ItemStack helmet = new ItemStack(Material.IRON_HELMET);
//		ItemMeta helmetIm = helmet.getItemMeta();
//		helmetIm.setLocalizedName("0,0,0,0,0,1200,0,0,0,0,330");
//		helmetIm.setDisplayName(ChatColor.YELLOW + "������");
//		ArrayList<String> helmetLore = new ArrayList();
//		helmetLore.add(ChatColor.GRAY + "���� ����: 330");
//		helmetLore.add(ChatColor.GRAY + " ");
//		helmetLore.add(ChatColor.GRAY + "��õ�ϴ� õ�簡 ����� �� ���");
//		helmetIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		helmetIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		helmetIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		helmetIm.setUnbreakable(true);
//		helmetIm.setLore(helmetLore);
//		helmet.setItemMeta(helmetIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(helmet);}
//
//		ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
//		ItemMeta chestplateIm = chestplate.getItemMeta();
//		chestplateIm.setLocalizedName("300,0,0,0,100,1000,0,0,0,1000,330");
//		chestplateIm.setDisplayName(ChatColor.YELLOW + "���칮");
//		ArrayList<String> chestplateLore = new ArrayList();
//		chestplateLore.add(ChatColor.GRAY + "���� ����: 330");
//		chestplateLore.add(ChatColor.GRAY + " ");
//		chestplateLore.add(ChatColor.GRAY + "�쿡�� �������� ����");
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		chestplateIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		chestplateIm.setUnbreakable(true);
//		chestplateIm.setLore(chestplateLore);
//		chestplate.setItemMeta(chestplateIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(chestplate);}
//
//		ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
//		ItemMeta leggingsIm = leggings.getItemMeta();
//		leggingsIm.setLocalizedName("300,0,0,0,0,500,0,0,0,0,330");
//		leggingsIm.setDisplayName(ChatColor.YELLOW + "��ȯâ");
//		ArrayList<String> leggingsLore = new ArrayList();
//		leggingsLore.add(ChatColor.GRAY + "���� ����: 330");
//		leggingsLore.add(ChatColor.GRAY + " ");
//		leggingsLore.add(ChatColor.GRAY + "���� �� �Ƚ��� �� ������ �Ź�");
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//		leggingsIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
//		leggingsIm.setUnbreakable(true);
//		leggingsIm.setLore(leggingsLore);
//		leggings.setItemMeta(leggingsIm);
//		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {player.getInventory().addItem(leggings);}
//
//		ItemStack boots = new ItemStack(Material.IRON_BOOTS);
//		ItemMeta bootsIm = boots.getItemMeta();
//		bootsIm.setLocalizedName("500,0,0,0,0,0,0,0,0,0,330");
//		bootsIm.setDisplayName(ChatColor.YELLOW + "������");
//		ArrayList<String> bootsLore = new ArrayList();
//		bootsLore.add(ChatColor.GRAY + "���� ����: 330");
//		bootsLore.add(ChatColor.GRAY + " ");
//		bootsLore.add(ChatColor.GRAY + "������ �Ÿ��� ������ ���� �Ź�");
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
		Player player = (Player)event.getPlayer();	
		if(player.getLevel() >= 1000) {
			player.setLevel(1000);
			player.setExp(0);
			ItemStack bonus = new ItemStack(Material.NETHER_STAR);
			ItemMeta bonusIm = bonus.getItemMeta();
			bonusIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			bonusIm.setDisplayName(ChatColor.DARK_RED + "������ ����");
			ArrayList<String> bonusLore = new ArrayList();
			bonusLore.add(ChatColor.GRAY + "�������μ� ���� �� ��ŭ �ߴٴ� ��ǥ");
			bonusLore.add(ChatColor.GRAY + "�������� ��� ��򰡿��� �������� �� �� ���� �� ����.");
			bonusIm.setLore(bonusLore);
			bonusIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			bonusIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			bonus.setItemMeta(bonusIm);
			player.getInventory().addItem(bonus);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			player.sendMessage(ChatColor.GREEN + "�ִ� ������ 1000�� �����Ͽ����ϴ�.");
			player.sendMessage(ChatColor.GREEN + "����ġ�� �ʱ�ȭ�Ǵ� ��� " + ChatColor.DARK_RED + "������ ����" + ChatColor.GREEN + "�� �־����ϴ�.");
			player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
			return;
		}
		player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 0.5f);
		
		//��������Ʈ
		new MainQuest(player);
		
		if(player.getLevel() >= 1) {
			//�� ������
			if(player.getInventory().contains(Material.RED_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (�� ������ Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +8");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*8));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �� ������ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �� ������ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �� ������ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �� ������ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �� ������ 500������ �޼��߽��ϴ�!");
					}	
				}			
			}
			//���
			if(player.getInventory().contains(Material.GREEN_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (��� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +5");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*5));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��� 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��� 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��� 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��� 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��� 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//������Ʈ
			if(player.getInventory().contains(Material.LAPIS_LAZULI)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (������Ʈ Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +8");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*8));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������Ʈ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������Ʈ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������Ʈ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������Ʈ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������Ʈ 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//������
			if(player.getInventory().contains(Material.CYAN_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (������ Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +2");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*2));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//���ڻ�
			if(player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (���ڻ� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +10");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*10));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���ڻ� 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���ڻ� 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���ڻ� 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���ڻ� 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���ڻ� 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//����
			if(player.getInventory().contains(Material.GRAY_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (���� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +20");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*20));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//����
			if(player.getInventory().contains(Material.PINK_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (���� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +30");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*30));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//������
			if(player.getInventory().contains(Material.LIME_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (������ Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +20");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*20));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ������ 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//�׸��� ����
			if(player.getInventory().contains(Material.YELLOW_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (�׸��� ���� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +8");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*8));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸��� ���� 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸��� ���� 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸��� ���� 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸��� ���� 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸��� ���� 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//����Ŀ
			if(player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (����Ŀ Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +3");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*3));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����Ŀ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����Ŀ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����Ŀ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����Ŀ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����Ŀ 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//����
			if(player.getInventory().contains(Material.MAGENTA_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (���� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +15");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*15));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 500������ �޼��߽��ϴ�!");
					}	
				}
				if(player.getLevel()>=900) {
					if(player.getInventory().contains(Material.MAGENTA_DYE)) {
						player.getInventory().remove(Material.MAGENTA_DYE);
						ItemStack job = new ItemStack(Material.INK_SAC);
						ItemMeta jobIm = job.getItemMeta();
						jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
						jobIm.setDisplayName(ChatColor.GOLD + "������� ��ǥ");
						jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
						jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
						job.setItemMeta(jobIm);
						player.getInventory().setItem(7, job);
						player.sendMessage(ChatColor.GREEN + "���� ���� �޼����� ����� ��å�� �Ǿ����ϴ�.");
					}
				}
			}
			//�׸� ����
			if(player.getInventory().contains(Material.ORANGE_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (�׸� ���� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +10");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*10));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸� ���� Ư������ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸� ���� Ư������ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸� ���� Ư������ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸� ���� Ư������ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �׸� ���� Ư������ 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//����
			if(player.getInventory().contains(Material.BLUE_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (���� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +50");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*50));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� Ư������ 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//������ �ΰ�
			if(player.getInventory().contains(Material.BROWN_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (�ȶ�� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +99");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*99));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �ȶ�� Ư������ 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �ȶ�� Ư������ 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �ȶ�� Ư������ 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �ȶ�� Ư������ 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� �ȶ�� Ư������ 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//����
			if(player.getInventory().contains(Material.BLACK_DYE)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (���� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +80");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*80));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ���� 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//�����
			if(player.getInventory().contains(Material.INK_SAC)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (����� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +40");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*40));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����� ��å���� 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����� ��å���� 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����� ��å���� 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����� ��å���� 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ����� ��å���� 500������ �޼��߽��ϴ�!");
					}	
				}
			}
			//����
			if(player.getInventory().contains(Material.CLAY_BALL)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (��ó Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +10");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*10));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��ó 100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��ó 200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��ó 300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��ó 400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� ��ó 500������ �޼��߽��ϴ�!");
					}	
				}
				if(player.getLevel()>=900) {
					if(player.getInventory().contains(Material.CLAY_BALL)) {
						player.getInventory().remove(Material.CLAY_BALL);
						ItemStack job = new ItemStack(Material.GLOWSTONE_DUST);
						ItemMeta jobIm = job.getItemMeta();
						jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
						jobIm.setDisplayName(ChatColor.GOLD + "�Ŀ��������� ��ǥ");
						jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
						jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
						job.setItemMeta(jobIm);
						player.getInventory().setItem(7, job);
						player.sendMessage(ChatColor.GREEN + "���� ���� �޼����� �Ŀ��������� �Ǿ����ϴ�.");
					}
				}
			}
			//�Ŀ�������
			if(player.getInventory().contains(Material.GLOWSTONE_DUST)) {
				int lvl = player.getLevel();
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "���� �� (�Ŀ������� Lv" + player.getLevel() + ")");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				player.sendMessage(ChatColor.WHITE + "�ִ�ü�� +60");
				player.sendMessage(ChatColor.WHITE + "�� ü��: " + (20 + lvl*60));
				player.sendMessage(ChatColor.LIGHT_PURPLE + "===========================");
				if(player.getLevel()==100) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� " + ChatColor.RED + "��" + ChatColor.BLUE + "��" + 
					    		ChatColor.BLACK + "��" + ChatColor.YELLOW + "��" + ChatColor.GREEN +"�� " + ChatColor.WHITE + "100������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==200) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� " + ChatColor.RED + "��" + ChatColor.BLUE + "��" + 
					    		ChatColor.BLACK + "��" + ChatColor.YELLOW + "��" + ChatColor.GREEN +"�� " + ChatColor.WHITE + "200������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==300) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� " + ChatColor.RED + "��" + ChatColor.BLUE + "��" + 
					    		ChatColor.BLACK + "��" + ChatColor.YELLOW + "��" + ChatColor.GREEN +"�� " + ChatColor.WHITE + "300������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==400) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� " + ChatColor.RED + "��" + ChatColor.BLUE + "��" + 
					    		ChatColor.BLACK + "��" + ChatColor.YELLOW + "��" + ChatColor.GREEN +"�� " + ChatColor.WHITE + "400������ �޼��߽��ϴ�!");
					}	
				} else if(player.getLevel()==500) {
					for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					    allPlayer.sendMessage(player.getDisplayName() + "���� " + ChatColor.RED + "��" + ChatColor.BLUE + "��" + 
					    		ChatColor.BLACK + "��" + ChatColor.YELLOW + "��" + ChatColor.GREEN +"�� " + ChatColor.WHITE + "500������ �޼��߽��ϴ�!");
					}	
				}
			}
			
		}	
	}
	
	@EventHandler
	public void reSpawn(PlayerRespawnEvent event) {
		try {
			Player player = (Player)event.getPlayer();
			
			try {				
				player.setExp(0);
			} catch(Exception e10) {

			}
			
			Location loc = player.getLocation();
			Location wargunil = new Location(world,-1844,70,3012);
			Location forgan = new Location(world,-1573,53,2458);
			Location tiru = new Location(world, -672, 46, 1942);
			Location tutoZone = new Location(world,3697,43,3679);
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
			
			//������ �ױ� �ֺ� -2000 101 2856  -1817 93 2546
			if(loc.getX() <= -1817 && loc.getZ() <= 2856 &&
					loc.getX() >= -2000 && loc.getZ() >= 2546) {
				event.setRespawnLocation(forgan);
				return;
			}
			//������ �ٴ� ���� 3815 62 3747  3599 0 3812
			if(loc.getX() <= 3815 && loc.getY() <= 62 && loc.getZ() <= 3812 &&
					loc.getX() >= 3599 && loc.getY() >= 0 && loc.getZ() >= 3747) {
				event.setRespawnLocation(wargunil);
				return;
			}
			//���� ���� 3563 69 3787  3439 8 3681
			if(loc.getX() <= 3563 && loc.getY() <= 69 && loc.getZ() <= 3787 &&
					loc.getX() >= 3439 && loc.getY() >= 8 && loc.getZ() >= 3681) {
				event.setRespawnLocation(forgan);
				return;
			}
			//���� 3481 31 3837 3603 5 3976
			if(loc.getX() <= 3603 && loc.getY() <= 31 && loc.getZ() <= 3976 
					&& loc.getX() >= 3481 && loc.getY() >= 5 && loc.getZ() >= 3837) {
				event.setRespawnLocation(seedMine);
				return;
			}
			//Ÿ���� ���� �ձ� 3706 115 3591  3823 32 3287
			if(loc.getX() <= 3823 && loc.getY() <= 115 && loc.getZ() <= 3591 
					&& loc.getX() >= 3706 && loc.getY() >= 10 && loc.getZ() >= 3287) {
				event.setRespawnLocation(seedMine);
				return;
			}
			//ī�� ���� 3844 223 3276  3628 2 3105
			if(loc.getX() <= 3844 && loc.getY() <= 223 && loc.getZ() <= 3276 
					&& loc.getX() >= 3628 && loc.getY() >= 2 && loc.getZ() >= 3105) {
				event.setRespawnLocation(konno);
				return;
			}
			//�Ƶ��� ���� 3300 65 3706  3431 2 3835
			if(loc.getX() <= 3431 && loc.getY() <= 65 && loc.getZ() <= 3835 
					&& loc.getX() >= 3300 && loc.getY() >= 2 && loc.getZ() >= 3706) {
				event.setRespawnLocation(tiru);
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
				event.setRespawnLocation(konno);
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
			}			
			player.setNoDamageTicks(200);
		} catch(Exception e11) {

		}
	}
	
	@EventHandler
	public void die(PlayerDeathEvent event) {
		event.setDeathMessage(null);
		// ����Ʈ ����
		try {
			Player player = (Player) event.getEntity();
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ſ��� ���3===")) {
				int qNum = cb.getNum(player);
				cb.eq2_2(player, qNum + 1);
			} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�̰��� ������ ��?===")) {
				Location loc = player.getLocation();
				if (loc.getX() <= 49 && loc.getY() <= 61 && loc.getZ() <= 696 
						&& loc.getX() >= 16 && loc.getY() >= 51 && loc.getZ() >= 654) {
					int qNum = cb.getNum(player);
					cb.mq36(player, qNum + 1);
				}
			}
		} catch(Exception e) {
			
		}
		// ������ ����
		try {
			Player player = (Player) event.getEntity();
			new BossHealth().removePlayer(player);
		} catch(Exception e) {
			
		}
		// �Ȱǵ���� ��
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
					ChatSerializer.a("{\"text\":\"��CYOU DIED\"}"));
			Object handle = player.getClass().getMethod("getHandle").invoke(player);
	        Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
	        playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, title);
		} catch(Exception e) {
			
		}
		try { 
			Player player = (Player)event.getEntity();		
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
		} catch(Exception e7) {
			System.err.println(e7);
		}
		
	}
	
	@EventHandler
	public void consumeItem(PlayerItemConsumeEvent event) {
		Player player = (Player)event.getPlayer();
		//Cheat
		if (player.getInventory().getChestplate() != null) {
			if(player.getInventory().getChestplate().getItemMeta().getDisplayName().equals("��6Operator ChestPlate")) {
				ItemStack potion1 = new ItemStack(Material.POTION,64);
				ItemMeta potion1IM = potion1.getItemMeta();
				potion1IM.setDisplayName(ChatColor.WHITE + "���� ���� I");
				ArrayList<String> lore1 = new ArrayList();
				lore1.add(ChatColor.YELLOW + "ȿ��");
				lore1.add(ChatColor.YELLOW + "- " + ChatColor.GRAY + "10��ŭ ü���� ȸ���մϴ�.");
				potion1IM.setLore(lore1);
				potion1.setItemMeta(potion1IM);	
				player.getInventory().addItem(potion1);	
				
				ItemStack potion2 = new ItemStack(Material.POTION,64);
				ItemMeta potion2IM = potion2.getItemMeta();
				potion2IM.setDisplayName(ChatColor.WHITE + "���� ���� II");
				ArrayList<String> lore2 = new ArrayList();
				lore2.add(ChatColor.YELLOW + "ȿ��");
				lore2.add(ChatColor.YELLOW + "- " + ChatColor.GRAY + "30��ŭ ü���� ȸ���մϴ�.");
				potion2IM.setLore(lore2);
				potion2.setItemMeta(potion2IM);
				player.getInventory().addItem(potion2);	
				
				ItemStack potion3 = new ItemStack(Material.POTION,64);
				ItemMeta potion3IM = potion3.getItemMeta();
				potion3IM.setDisplayName(ChatColor.WHITE + "���� ���� III");
				ArrayList<String> lore3 = new ArrayList();
				lore3.add(ChatColor.YELLOW + "ȿ��");
				lore3.add(ChatColor.YELLOW + "- " + ChatColor.GRAY + "100��ŭ ü���� ȸ���մϴ�.");
				potion3IM.setLore(lore3);
				potion3.setItemMeta(potion3IM);
				player.getInventory().addItem(potion3);
				
				ItemStack potion4 = new ItemStack(Material.POTION,64);
				ItemMeta potion4IM = potion4.getItemMeta();
				potion4IM.setDisplayName(ChatColor.WHITE + "���� ���� IV");
				ArrayList<String> lore4 = new ArrayList();
				lore4.add(ChatColor.YELLOW + "ȿ��");
				lore4.add(ChatColor.YELLOW + "- " + ChatColor.GRAY + "200��ŭ ü���� ȸ���մϴ�.");
				potion4IM.setLore(lore4);
				potion4.setItemMeta(potion4IM);
				player.getInventory().addItem(potion4);
			}
		}
		//HP����
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� I")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 10.0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� II")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 30.0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� III")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 100.0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� IV")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 200.0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� V")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 300.0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� VI")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 500.0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� VII")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 800.0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� VIII")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 1100.0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� IX")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 1300.0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ���� X")) {
			PotionRatio pr = new PotionRatio();
			pr.calculation(player, 1600.0);
		}
		//Ư�� ����
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "������")) {
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "�ñ��� ����")) {
			player.setFireTicks(0);
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "�ٶ��� ���� I")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,2400,0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "�ٶ��� ���� II")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,2400,1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "��ȭ�� �ٶ��� ���� II")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,6000,1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "������ ���� I")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,1800,0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "������ ���� II")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,1800,1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,1800,0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "��ȭ�� ������ ���� I")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,3600,0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "��ȭ�� ������ ���� II")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,3000,1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,3000,0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "������ ���� I")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,1800,0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "��ȭ�� ������ ���� I")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,1800,30,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "������ ���� I")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,1200,0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "���ڳ� ����")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 6, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "���״� Ư�� ����")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,1800,0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,1800,2,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "�ذ�")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,1200,2,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,1200,0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON,1200,0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "���� �ΰ��� ��")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER,600,0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "���� �츰 ��")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 600, 4,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "�ź��� �츰 ��")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "���� ���� ����")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1200, 0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "����� ����")) {
			try {
				Cmd8Party cp = new Cmd8Party();
				ArrayList<Player> party = cp.getPlayerParty(player);
				if(party.size() != 0) {
					player.teleport(party.get(rnd.nextInt(party.size())).getLocation());
				}
			} catch(Exception e) {
				
			}
		}
		//����
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "�뱸����")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 2, 0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���ִ� ġŲ")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 50, 0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ġŲ")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 80, 0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "��Ƽ�� ĥ����")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 80, 1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "�������� ��������")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 140, 1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "���� ���� ���� �߰��")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 2400, 1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "��ǣ������ �߿丮")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, 2,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "������ �������")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 2400, 0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Ư����� ��������")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 100, 0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "ī�̸��� ��丮")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20, 10,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "����� ī�̸��� ��丮")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� ����")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 30, 1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "�ڸ��� ��")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 100, 5,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 2,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "������ ����")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 0,true,false,false));
			player.sendMessage(ChatColor.RED + "����⿡ ������� �־��� �� ����.");
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "�ٴ� ������ ���� ��������")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 0,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 2,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���� �ҿ� ���� ������ũ")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 100, 0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "����� ������ũ")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 0,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "���Ʊ� ���� �丮")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 150, 1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "���Ʊ׽� Ư�� ���� ����")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 300, 1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "�̰��� ������ũ")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1,true,false,false));
		}
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "Ƽ�� ������ũ")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 300, 2,true,false,false));
		}

	}
	
	@EventHandler
	public void spawnEntity(CreatureSpawnEvent event) {
		try {
			Entity entity = event.getEntity();
			if(entity instanceof Drowned) {
				entity.remove();
			}
			((LivingEntity)entity).addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 2));
			SpawnMob sm = new SpawnMob();
			SpawnAnimal sa = new SpawnAnimal();
			if(!sm.spawn(entity)) {			
				event.setCancelled(true);
			}
			if(!sa.spawn(entity)) {			
				event.setCancelled(true);
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
		JobScroll job = new JobScroll();
		BossTicket boss = new BossTicket();
		ReinforcementScroll reinScroll = new ReinforcementScroll();
		DefineScroll define = new DefineScroll();
		QuestScroll qs = new QuestScroll();
		AnotherScroll as = new AnotherScroll();
		ItemDestroyScroll ids = new ItemDestroyScroll();
		CraftingScroll cs = new CraftingScroll();
		
		try {
			//���� ��ũ��
			vilTP.vilTP(player, itemArg);
			//����Ƽ��
			ticket.sleep(player, itemArg);		
			//�̵�
			tp.teleport(player, itemArg);
			//������ȯ
			boss.summon(player, itemArg);
			//��ȭ
			reinScroll.openInv(player, itemArg);
			//����
			define.effect(player, itemArg);
			//����Ʈ ��ũ��
			qs.quest(player, itemArg);
			//��Ÿ ��ũ��
			as.effect(player, itemArg);
			//������ �ı� ��ũ��
			ids.openInv(player, itemArg);
			//���� ��ũ��
			cs.openInv(player, itemArg);
		} catch(Exception e) {
			
		}
		
		//����
		if (event.getItemDrop().getItemStack().getType() == Material.NETHER_STAR) {
			job.chooseJob(player, itemArg);
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
		}

		//���� ������
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "�� �������� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "����� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "������Ʈ�� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "�������� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "���ڻ��� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "������ ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "������ ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "�������� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "�׸��� ������ ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "����Ŀ�� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "������ ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "�׸� ������ ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "������ ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "������ �ΰ��� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "������ ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "������� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "�Ŀ��������� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��ó�� ��ǥ")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "����")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "��������")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "��� �巡���� ��")) {
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.WOODEN_HOE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.STONE_HOE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.IRON_HOE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.GOLDEN_HOE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DIAMOND_HOE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.NETHERITE_HOE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.WOODEN_PICKAXE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.STONE_PICKAXE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.IRON_PICKAXE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.GOLDEN_PICKAXE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DIAMOND_PICKAXE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.NETHERITE_PICKAXE) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.WOODEN_SHOVEL) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.STONE_SHOVEL) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.IRON_SHOVEL) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.GOLDEN_SHOVEL) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.DIAMOND_SHOVEL) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.NETHERITE_SHOVEL) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
		if(event.getItemDrop().getItemStack().getType() == Material.PLAYER_HEAD) {
			player.sendMessage(ChatColor.RED + "��� �Ұ� �������Դϴ�.");
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent event){
		try {
			if(event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				if(!(event.getEntity() instanceof Player)) {
					if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "���� ��")) {
						event.getEntity().remove();				
					}
					if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "���� ��[���� �����]")) {
						event.getEntity().remove();				
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
		// SpectralArrow hit
		try {
			if (event.getDamager() instanceof SpectralArrow) {
				event.setCancelled(true);
				return;
			}
		} catch (Exception e) {

		}
		//villager hit
		try {
			if (event.getDamager() instanceof Player) {
				if(event.getEntity() instanceof Villager) {
					if(!event.getDamager().isOp()) {
						event.setCancelled(true);
						return;
					}
				}
			}
		} catch(Exception e) {
			
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
				} else if(event.getDamager() instanceof Snowball) {
					Snowball proj = (Snowball) event.getDamager();
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
				} else if (event.getDamager() instanceof Snowball) {
					Snowball proj = (Snowball) event.getDamager();
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
				} else if (event.getDamager() instanceof Snowball) {
					Snowball proj = (Snowball) event.getDamager();
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
				} else if (event.getDamager() instanceof Snowball) {
					Snowball proj = (Snowball) event.getDamager();
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
				} else if(event.getDamager() instanceof Snowball) {
					Snowball proj = (Snowball) event.getDamager();
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
				} else if(event.getDamager() instanceof Snowball) {
					Snowball proj = (Snowball) event.getDamager();
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
		//animal Loot
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
		//itemFrame
		try {
			if(event.getEntity() instanceof ItemFrame) {
				if(event.getDamager() instanceof Player) {
					Player player = (Player) event.getDamager();
					if(player.getGameMode() == GameMode.ADVENTURE) {
						event.setCancelled(true);
					} else {
						event.setCancelled(false);
					}
				}
				if(event.getDamager() instanceof Arrow) {
					event.setCancelled(true);
				}
				if(event.getDamager() instanceof Snowball) {
					event.setCancelled(true);
				}
				if(event.getDamager() instanceof Fireball) {
					event.setCancelled(true);
				}
				if(event.getDamager() instanceof SmallFireball) {
					event.setCancelled(true);
				}
			}
		} catch(Exception e) {
			
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
				if(isOk == false) 
					event.setDamage(9999999);
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
						((Mob) event.getEntity()).setTarget(player);
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
					if(arrow.getDamage() == 0) {
						skillMul = 2;
					}
					if(arrow.getDamage() == 1) {
						skillMul = 20;
					}
					double damage = (lvl * jobMul * skillMul * weaponMul) + enchMul;
					try {
						if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "������ ����")) {
							damage = player.getLevel() * 50;
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
						((Mob) event.getEntity()).setTarget(player);
					}
				}
				if(event.getEntity() instanceof Player) {
					SmallFireball arrow = (SmallFireball) event.getDamager();
					if(arrow.getShooter() instanceof Player) {
						event.setCancelled(true);
					}
					event.getEntity().setFireTicks(200);
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
						jobMul = 20;
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
		//Snow
		try {
			if (event.getDamager() instanceof Snowball) {
				if(event.getEntity() instanceof Mob) {
					Snowball arrow = (Snowball) event.getDamager();
					if(!(arrow.getShooter() instanceof Player)) {
						event.setCancelled(true);
						return;
					} else {
						Player player = (Player) arrow.getShooter();
						((Mob) event.getEntity()).setTarget(player);
					}
				}
				if(event.getEntity() instanceof Player) {
					event.setCancelled(true);
				}
				Snowball arrow = (Snowball) event.getDamager();
				Player player = (Player) arrow.getShooter();
				double lvl = player.getLevel();
				double Mul = 1;
				if (player.getInventory().getItemInMainHand() != null) {
					Mul += Integer.parseInt(player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",")[0]) / 5.0;
				}				
				double damage = lvl * Mul * 2;
				event.setDamage(damage);
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
					player.sendMessage(ChatColor.RED + "���� �� ���⸦ �ٷ�⿡�� �� ���� �����ϴ�.");
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
		//DisableAttack
		try {
			DisableAttack da = new DisableAttack();
			Player player = (Player) event.getDamager();
			if(!da.disable(player)) {
				event.setCancelled(true);
				return;
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
				// �� ������
				if (player.getInventory().contains(Material.RED_DYE)) {
					event.setDamage(event.getDamage() + num * 0.75);
				}
				// ������
				if (player.getInventory().contains(Material.CYAN_DYE)) {
					event.setDamage(event.getDamage() + num * 0.6);
				}
				// ����
				if (player.getInventory().contains(Material.GRAY_DYE)) {
					event.setDamage(event.getDamage() + num * 5);
				}
				// ����
				if (player.getInventory().contains(Material.PINK_DYE)) {
					event.setDamage(event.getDamage() + num * 4);
				}
				// ������
				if (player.getInventory().contains(Material.LIME_DYE)) {
					event.setDamage(event.getDamage() + num * 4.5);
				}
				// �׸��� ����
				if (player.getInventory().contains(Material.YELLOW_DYE)) {
					event.setDamage(event.getDamage() + num * 0.5);
				}
				// ����Ŀ
				if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
					event.setDamage(event.getDamage() + num * 2);
				}
				// �׸� ����		
				if (player.getInventory().contains(Material.ORANGE_DYE)) {
					event.setDamage(event.getDamage() + num * 3);
				}
				// ����	
				if (player.getInventory().contains(Material.MAGENTA_DYE)) {
					event.setDamage(event.getDamage() + num * 2);
				}
				// ����
				if (player.getInventory().contains(Material.BLUE_DYE)) {
					event.setDamage(event.getDamage() + num * 30);
				}
				// �ȶ��		
				if (player.getInventory().contains(Material.BROWN_DYE)) {
					event.setDamage(event.getDamage() + num * 25);
				}
				// ����
				if (player.getInventory().contains(Material.BLACK_DYE)) {
					event.setDamage(event.getDamage() + num * 28);
				}
				// �����
				if (player.getInventory().contains(Material.INK_SAC)) {
					event.setDamage(event.getDamage() + num * 15);
				}
			}
		} catch(Exception e) {
			
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
				PlayerHitDebuff debuff = new PlayerHitDebuff();
				debuff.playerHitDebuff(player, entity);
			}
		} catch (Exception e) {

		}
		// hit mob4
		try {
			if (event.getDamager() instanceof Snowball) {
				Entity entity = (Entity) event.getEntity();
				Player player = ((Player) ((Snowball) event.getDamager()).getShooter());
				PlayerHitDebuff debuff = new PlayerHitDebuff();
				debuff.playerHitDebuff(player, entity);
			}
		} catch (Exception e) {

		}
		// thorns
		try {
			if (event.getDamager() instanceof LivingEntity && !(event.getDamager() instanceof Player)) {
				if (event.getEntity() instanceof Player) {
					LivingEntity entity = (LivingEntity) event.getDamager();
					Player player = (Player) event.getEntity();
					Thorns t = new Thorns();
					entity.damage(t.thorns(player, entity));
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
					|| event.getEntity().getType() == EntityType.DONKEY || event.getEntity().getType() == EntityType.LLAMA
					|| event.getEntity().getType() == EntityType.CAT || event.getEntity().getType() == EntityType.ARMOR_STAND) {
				event.setCancelled(true);
				return;
			}
			if (!(event.getEntity() instanceof Player)) {
				LivingEntity ent = (LivingEntity) event.getEntity();
				ent.damage(event.getDamage());
				event.setDamage(0);
				event.setCancelled(true);
				return;
			} 
		} catch (Exception e) {

		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		//Change Name Color
//		try {
//			if (((LivingEntity)event.getEntity()).getHealth() <= ((LivingEntity)event.getEntity()).getMaxHealth() / 2) {
//				String name = event.getEntity().getCustomName().substring(2);
//				String[] nameAry = name.split("L");
//				event.getEntity().setCustomName(ChatColor.YELLOW + nameAry[0] + "L" + nameAry[1]);
//			}
//			if (((LivingEntity)event.getEntity()).getHealth() <= ((LivingEntity)event.getEntity()).getMaxHealth() / 5) {
//				String name = event.getEntity().getCustomName().substring(2);
//				String[] nameAry = name.split("L");
//				event.getEntity().setCustomName(ChatColor.RED + nameAry[0] + "L" + nameAry[1]);
//			}
//		} catch(Exception e) {
//			
//		}
//		//Mob Loot
//		try {
//			if(event.getDamager() instanceof IronGolem) {
//				IronGolem ir =(IronGolem) event.getDamager();
//				GolemOwner go = new GolemOwner();
//				Player player = go.returnPlayer(ir.getUniqueId());
//				Entity mob = event.getEntity();
//				double damage = event.getDamage();				
//				MobDeath md = new MobDeath(player, mob, damage);
//			}			
//			if(event.getDamager() instanceof Player) {
//				Entity mob = event.getEntity();
//				double damage = event.getFinalDamage();				
//				MobDeath md = new MobDeath(mob, damage);
//			}	
//			if(event.getDamager() instanceof Arrow) {
//				Entity mob = event.getEntity();
//				Arrow arrow = (Arrow) event.getDamager();
//				Player player = (Player)arrow.getShooter();
//				double damage = event.getFinalDamage();				
//				MobDeath md = new MobDeath(player, mob, damage);
//			}	
//			if(event.getDamager() instanceof SmallFireball) {
//				Entity mob = event.getEntity();
//				SmallFireball arrow = (SmallFireball) event.getDamager();
//				Player player = (Player)arrow.getShooter();
//				double damage = event.getFinalDamage();				
//				MobDeath md = new MobDeath(player, mob, damage);
//			}	
//			if(event.getDamager() instanceof Snowball) {
//				Entity mob = event.getEntity();
//				Snowball arrow = (Snowball) event.getDamager();
//				Player player = (Player)arrow.getShooter();
//				double damage = event.getFinalDamage();				
//				MobDeath md = new MobDeath(player, mob, damage);
//			}	
//		} catch(Exception e) {
//			
//		}
	}
	
	@EventHandler
	public void skillDamage(EntityDamageEvent event) {
		if(event.getDamage() <= 0) {
			event.setCancelled(true);
			return;
		}
		if(event.getEntity().getType() == EntityType.PIG || event.getEntity().getType() == EntityType.COW 
				|| event.getEntity().getType() == EntityType.CHICKEN || event.getEntity().getType() == EntityType.SHEEP || event.getEntity().getType() == EntityType.VILLAGER
				|| event.getEntity().getType() == EntityType.HORSE || event.getEntity().getType() == EntityType.SKELETON_HORSE || event.getEntity().getType() == EntityType.DONKEY
				|| event.getEntity().getType() == EntityType.WOLF || event.getEntity().getType() == EntityType.CAT || event.getEntity().getType() == EntityType.DONKEY) {
			event.setCancelled(true);
			return;
		}
		//Ư����
		try {
			DamageRatio dr = new DamageRatio();
			if (event.getCause() == DamageCause.FIRE_TICK || event.getCause() == DamageCause.FIRE || event.getCause() == DamageCause.HOT_FLOOR) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					int resist = 0;
					try {
						if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
							try {
								String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
								resist += Integer.parseInt(ench[6]);
							} catch(Exception e) {
								
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
						damage = 1 - (1 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
							|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
						damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
						damage = 4 - (4 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
							|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
						damage = 6 - (6 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else {
						damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
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
						event.setDamage(dr.calculation(player, player.getLevel()/8));
					} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
							|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
						event.setDamage(dr.calculation(player, player.getLevel()/4));
					} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
						event.setDamage(dr.calculation(player, player.getLevel()));
					} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
							|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
						event.setDamage(dr.calculation(player, player.getLevel()*5));
					} else {
						event.setDamage(dr.calculation(player, player.getLevel()/4));
					}
				}
			}
			if (event.getCause() == DamageCause.WITHER) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					Inventory inv = player.getInventory();
					if(inv.contains(Material.RED_DYE) || inv.contains(Material.GREEN_DYE) || inv.contains(Material.LAPIS_LAZULI)
							|| inv.contains(Material.CYAN_DYE) || inv.contains(Material.LIGHT_GRAY_DYE)) {
						event.setDamage(dr.calculation(player, player.getLevel()/4));
					} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
							|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
						event.setDamage(dr.calculation(player, player.getLevel()/2));
					} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
						event.setDamage(dr.calculation(player, player.getLevel()*2));
					} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
							|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
						event.setDamage(dr.calculation(player, player.getLevel()*8));
					} else {
						event.setDamage(dr.calculation(player, player.getLevel()/2));
					}
				}
			}
			if (event.getCause() == DamageCause.BLOCK_EXPLOSION) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					int resist = 0;
					try {
						if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
							try {
								String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
								resist += Integer.parseInt(ench[7]);
							} catch(Exception e) {
								
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
						damage = 1 - (1 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
							|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
						damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
						damage = 4 - (4 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
							|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
						damage = 6 - (6 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else {
						damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					}
					if(damage < 0.001) {
						damage = 0.001;
					}
					event.setDamage(damage);
					player.setFireTicks(200);
				}
			}
			if (event.getCause() == DamageCause.ENTITY_EXPLOSION) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					int resist = 0;
					try {
						if (player.getInventory().getItemInMainHand() != null) {
							try {
								String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
								resist += Integer.parseInt(ench[7]);
							} catch(Exception e) {
								
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
						damage = 1 - (1 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else if(inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE) || inv.contains(Material.MAGENTA_DYE)
							|| inv.contains(Material.ORANGE_DYE) || inv.contains(Material.CLAY_BALL)) {
						damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else if(inv.contains(Material.GRAY_DYE) || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE)) {
						damage = 4 - (4 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BROWN_DYE) || inv.contains(Material.BLACK_DYE)
							|| inv.contains(Material.INK_SAC) || inv.contains(Material.GLOWSTONE_DUST)) {
						damage = 6 - (6 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					} else {
						damage = 2 - (2 * ((42.6/Math.sqrt(2)) * Math.log10((resist*0.18+14.15) / (10*Math.sqrt(2)))) / 100);
					}
					if(damage < 0.001) {
						damage = 0.001;
					}
					event.setDamage(damage);
					player.setFireTicks(200);
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
			}
			//�� ����
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
			}
		} catch (Exception e) {

		}
		//Change Name Color
		try {
			if(!(event.getEntity() instanceof Player)) {
				if (((LivingEntity) event.getEntity()).getHealth() - event.getFinalDamage() <= ((LivingEntity) event.getEntity()).getMaxHealth() / 2) {
					String name = event.getEntity().getCustomName().substring(2);
					String[] nameAry = name.split("L");
					event.getEntity().setCustomName(ChatColor.YELLOW + nameAry[0] + "L" + nameAry[1]);
				}
				if (((LivingEntity) event.getEntity()).getHealth() - event.getFinalDamage() <= ((LivingEntity) event.getEntity()).getMaxHealth() / 5) {
					String name = event.getEntity().getCustomName().substring(2);
					String[] nameAry = name.split("L");
					event.getEntity().setCustomName(ChatColor.RED + nameAry[0] + "L" + nameAry[1]);
				}
			}
		} catch (Exception e) {

		}
		
		// ���� ���
		if(event.getEntity().getType() == EntityType.MUSHROOM_COW) {
			event.getEntity().setCustomName(Integer.toString((int) event.getFinalDamage()));
			event.getEntity().setCustomNameVisible(true);
		}
		
		// ������
		try {
			if(!(event.getEntity() instanceof Player)) {
				Entity mob = event.getEntity();
				// �ڳ���
				if (mob.getCustomName().substring(2).equalsIgnoreCase("�ڳ���" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar1().getPlayers()) {
							new BossHealth().getBar1().removePlayer(p);
						}
					} else {
						new BossHealth().getBar1().setProgress(boss.getHealth() / 700000.0);
					}
				}
				// ž 1��
				if (mob.getCustomName().substring(2).equalsIgnoreCase("1���� ������" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar2().getPlayers()) {
							new BossHealth().getBar2().removePlayer(p);
						}
					} else {
						new BossHealth().getBar2().setProgress(boss.getHealth() / 250000.0);
					}
				}
				// ž 2��
				if (mob.getCustomName().substring(2).equalsIgnoreCase("2���� ������" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar3().getPlayers()) {
							new BossHealth().getBar3().removePlayer(p);
						}
					} else {
						new BossHealth().getBar3().setProgress(boss.getHealth() / 550000.0);
					}
				}
				// ž 3��
				if (mob.getCustomName().substring(2).equalsIgnoreCase("3���� ������" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar4().getPlayers()) {
							new BossHealth().getBar4().removePlayer(p);
						}
					} else {
						new BossHealth().getBar4().setProgress(boss.getHealth() / 1000000.0);
					}
				}
				// �Ƶ�
				if (mob.getCustomName().substring(2).equalsIgnoreCase("�Ƶ�" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar5().getPlayers()) {
							new BossHealth().getBar5().removePlayer(p);
						}
					} else {
						new BossHealth().getBar5().setProgress(boss.getHealth() / 20000.0);
					}
				}
				// Ư�� �丮��
				if (mob.getCustomName().substring(2).equalsIgnoreCase("Ư�� �丮��" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar6().getPlayers()) {
							new BossHealth().getBar6().removePlayer(p);
						}
					} else {
						new BossHealth().getBar6().setProgress(boss.getHealth() / 60000.0);
					}
				}
				// ���귻
				if (mob.getCustomName().substring(2).equalsIgnoreCase("���귻" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar7().getPlayers()) {
							new BossHealth().getBar7().removePlayer(p);
						}
					} else {
						new BossHealth().getBar7().setProgress(boss.getHealth() / 70000.0);
					}
				}
				// �߷θ�
				if (mob.getCustomName().substring(2).equalsIgnoreCase("�߷θ�" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar8().getPlayers()) {
							new BossHealth().getBar8().removePlayer(p);
						}
					} else {
						new BossHealth().getBar8().setProgress(boss.getHealth() / 150000.0);
					}
				}
				// ƼŸ�Ͼ�
				if (mob.getCustomName().substring(2).equalsIgnoreCase("�������� ƼŸ�Ͼ�" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar9().getPlayers()) {
							new BossHealth().getBar9().removePlayer(p);
						}
					} else {
						new BossHealth().getBar9().setProgress(boss.getHealth() / 30000.0);
					}
				}
				// ������
				if (mob.getCustomName().substring(2).equalsIgnoreCase("������ ������" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar10().getPlayers()) {
							new BossHealth().getBar10().removePlayer(p);
						}
					} else {
						new BossHealth().getBar10().setProgress(boss.getHealth() / 30000.0);
					}
				}
				// �ƶ�ũ��
				if (mob.getCustomName().substring(2).equalsIgnoreCase("�ƶ�ũ��" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar11().getPlayers()) {
							new BossHealth().getBar11().removePlayer(p);
						}
					} else {
						new BossHealth().getBar11().setProgress(boss.getHealth() / 800000.0);
					}
				}
			}
		} catch(Exception e) {
			
		}
		
	}
	
	@EventHandler
	public void mouseEvent(PlayerInteractEvent event) {
		// �׽�Ʈ��
		try {
			EquipmentSlot e = event.getHand();
			if (e.equals(EquipmentSlot.HAND)) {
				Player player = event.getPlayer();
				if (event.getAction() == Action.RIGHT_CLICK_BLOCK && player.getDisplayName().equalsIgnoreCase("yumehama")) {
					Material type = player.getInventory().getItemInMainHand().getType();
					if((type == Material.DRAGON_HEAD)) {
						
						ArrayList<FallingBlock> ary = new ArrayList<>();
						Location loc = player.getLocation();
						for(int x = -2 ; x < 3 ; x++) {
							for(int y = -1 ; y < 1 ; y++) {
								for(int z = -2 ; z < 3 ; z++) {
									Location loc2 = loc.clone().add(new Vector(x,y+0.01,z));
									if(loc2.getBlock().getType() != Material.AIR) {
										FallingBlock fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, Material.RED_WOOL, (byte)0);
										fb.setVelocity(new Vector(0,0,0));
										fb.setDropItem(false);
										fb.setGravity(false);
										ary.add(fb);
									}
								}
							}
						}
						
						Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

							int time = 0;
							ArrayList<FallingBlock> ary2 = ary;

							@Override
							public void run() {
								
								if (time >= 40) {
									for(FallingBlock fb : ary2) {
										fb.remove();
									}
								}
								
								time++;

							}

						}, 0, 1);
						
						event.setCancelled(true);
						return;
					}
				}
			}
		} catch (Exception e) {

		}
		// ��� ����
		try {
			EquipmentSlot e = event.getHand();
			if (e.equals(EquipmentSlot.HAND)) {
				Player player = event.getPlayer();
				if (event.getAction() == Action.RIGHT_CLICK_BLOCK && player.isOp() == false) {
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
		//�ٶ��� �� ����
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
		//����Ʈ
		try {			
			QuestBoard qb = new QuestBoard();
			EquipmentSlot e = event.getHand (); 
	        if (e.equals (EquipmentSlot.HAND)) {
	        	//����Ʈ Ŭ���� �̺�Ʈ
	    		Player player = event.getPlayer();
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
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.q2(player, qNum+1);	
							} else {
								player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.ENDER_CHEST && block.getX()==-699 && block.getY()==92 && block.getZ()==2143) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��븦 ������ ��===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq12(player, qNum+1);	
							} else {
								player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.LECTERN && block.getX()==-1174 && block.getZ()==1983) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�ĸ�Ȧ���� ����===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq8(player, qNum+1);	
							} else {
								player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
							}
	    				}	
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==-699 && block.getZ()==2133) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��뿡 ������ ���===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq11(player, qNum+1);
		    					player.teleport(new Location(world, 3796, 26, 3798));
		    					ChangeJob cj = new ChangeJob();
		    					cj.changeJob1(player);
							} else {
								player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
							}
	    				}
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��6===")) {
	    					int qNum = qb.getNum(player);
	    					qb.mq21(player, qNum+1);
	    					player.teleport(new Location(world, 3796, 19, 3799.5));
	    				}
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==3796 && block.getZ()==3797) {
	    				ChangeJob cj = new ChangeJob();
    					cj.changeJob1(player);
	    			}
	    			if(block.getType()==Material.PLAYER_HEAD && block.getX()==-648 && block.getY()==42 && block.getZ()==1332) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��2===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq19(player, qNum+1);
							} else {
								player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.CHEST && block.getX()==-1994 && block.getY()==32 && block.getZ()==81) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����3===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq26_1(player, qNum+1);
							} else {
								player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==3812 && block.getZ()==3800) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �帧�� ��===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq41(player, qNum+1);
							} else {
								player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==3810 && block.getZ()==3800) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �帧�� ��===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq41(player, qNum+2);
							} else {
								player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
							}
	    				}	    		
	    				event.setCancelled(true);
	    			}
	    			if(block.getType()==Material.STONE_BUTTON && block.getX()==3808 && block.getZ()==3800) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �帧�� ��===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.mq41(player, qNum+3);
							} else {
								player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
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
	    					player.sendMessage("������ �ȿ� �ֽ��ϴ�.");
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
	    					((LivingEntity)mob).setMaxHealth(player.getLevel() * 5000);
	    					((LivingEntity)mob).setHealth(player.getLevel() * 5000);
	    					((LivingEntity)mob).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
	    					((LivingEntity)mob).addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, player.getLevel()));
	    				}
	    				event.setCancelled(true);
	    			}
	    		}
	        }
		} catch(Exception e) {
			
		}
		//����â�� �ý���
		try {
			EquipmentSlot e = event.getHand(); 
	        if (e.equals (EquipmentSlot.HAND)) {	
	        	Player player = event.getPlayer();
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    			Block block = event.getClickedBlock();
	    			if(block.getType() == Material.ENDER_CHEST) {
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
		//��Ÿ
		try {
			EquipmentSlot e = event.getHand(); 
	        if (e.equals (EquipmentSlot.HAND)) {	 
	        	//����
	        	try {
	        		Player player = event.getPlayer();
		        	if(player.getInventory().getItemInMainHand().getType() == Material.ELYTRA) {
		        		if (player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) {												
							player.sendMessage(ChatColor.GREEN + "[��ų]��ũ�� �ߵ��˴ϴ�.");

							Vector vec = player.getEyeLocation().getDirection().multiply(3.0f);
							player.setVelocity(vec);
							world.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
						}
		        	}
	        	} catch(Exception e1) {
	        		
	        	}
	        	//�߻�ü
	    		try {
	    			if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    				Player player = event.getPlayer();
		    			ArrowEffect ae = new ArrowEffect();
		    			ae.useBow(player);
		    			ae.useGun(player);
		    			ae.useStaff(player);
	    			}	    			
	    		} catch(Exception e1) {
	    			
	    		}	    		
	        	//���� �̺�Ʈ&��Ʈ ü��Ʈ
	    		Player player = event.getPlayer();
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    			Block block = event.getClickedBlock();
	    			if(block.getType() == Material.CHEST && event.getPlayer().isOp() == false) {
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
	    			if(block.getType() == Material.ENCHANTING_TABLE && event.getPlayer().isOp() == false) {
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
	    			if(block.getType() == Material.ARMOR_STAND && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			
	    			
	    			
	    			if(block.getType() == Material.CHEST && event.getPlayer().isOp() == false) {
	    				LootChest lc = new LootChest();
		    			lc.open(player, block);
		    			event.setCancelled(true);
	    			}
	    		}
	    		//��� �̺���
	    		try {
	    			if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        			if(player.getInventory().getItemInMainHand().getType()==Material.BAMBOO) {
	        				event.setCancelled(true);
	        			}	        			
	        		}
	    		} catch(Exception e1) {
	    			
	    		}
	    		//��â Ư�� �̺�Ʈ
	    		try {
	    			if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        			if(player.getInventory().getItemInMainHand().getType()==Material.BAMBOO) {
	        				List <Entity> entitylist = player.getNearbyEntities (5, 5, 5); 
	        				for (Entity nearEntity : entitylist) { 
	        				    if (nearEntity.getType() == EntityType.PLAYER) { 
	        				    	Player nearPlayer = (Player) nearEntity;
	        				    	nearPlayer.setHealth(0);
	        				    	nearPlayer.sendMessage(ChatColor.RED + player.getDisplayName() + "���� ��â���� ����� �Ҹ���׽��ϴ�.");
	        				    }        
	        				}   	
	        			}
	        		}
	    		} catch(Exception e1) {
	    			
	    		}  		
	    		//��ǥ
	    		try {
	    			if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        			PlayerStat ps = new PlayerStat();
	        			ps.viewStat(player);
	        		}
	    		} catch(Exception e1) {
	    			
	    		}
	    		//��ų
	    		try {
	    			if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    				if(event.getClickedBlock() == null) {
	    					Skill skill = new Skill();
		    				skill.effect(player);
	    				}
	    				if(event.getClickedBlock().getType() != Material.ENDER_CHEST) {
	    					Skill skill = new Skill();
		    				skill.effect(player);
	    				}
	    			}
	    		} catch(Exception e1) {
	    			
	    		}   
	    		//Ŀ�ǵ��� ��ų
	    		try {	    			
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
	    				if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BLACK_DYE)) {
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
	    			}
	    		} catch(Exception e1) {
	    			
	    		}
	        } 	 
		} catch(Exception e) {
			
		}
		//�� ��ȣ �̺�Ʈ
		try { 
			if(event.getAction()==Action.PHYSICAL && event.getClickedBlock().getType() == Material.FARMLAND) {
				event.setCancelled(true);
			}
		} catch(Exception e) {
					
		}
	}
	
	@EventHandler
	public void leftMouseEvent(PlayerAnimationEvent event) {
		//��
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
					if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
						if (i != 0) {
							int qNum = qb.getNum(player);
							qb.mq7(player, qNum + 1);
						} else {
							player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
						}

					}
				}
				if (loc.getX() == -1992 && loc.getY() == 58 && loc.getZ() == 2241) {
					QuestBoard qb = new QuestBoard();
					if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����1===")) {
						if (i != 0) {
							int qNum = qb.getNum(player);
							qb.mq15(player, qNum + 1);
						} else {
							player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
						}
					}
				}
				if (loc.getX() == -1105 && loc.getY() == 82 && loc.getZ() == 1235) {
					QuestBoard qb = new QuestBoard();
					if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��1===")) {
						if (i != 0) {
							int qNum = qb.getNum(player);
							qb.mq18(player, qNum + 1);
						} else {
							player.sendMessage(ChatColor.RED + "�κ��丮�� ��ĭ�� �����ϴ�.");
						}
					}
				}
			}
		} catch(Exception e) {
			
		}	
		//��Ȱ
		try {					        
			Player player = event.getPlayer();
			Location loc = player.getLocation();
			Block block = player.getTargetBlockExact(5);
			if(player.getGameMode() == GameMode.ADVENTURE || player.isOp() == false) {
				FantasyLife fl = new FantasyLife();	        		
				fl.fantasyLift(player, block, loc);
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
		//��ų
		try {
			Player player = event.getPlayer();
			if(event.getAnimationType() == PlayerAnimationType.ARM_SWING) {
				if(player.getTargetBlockExact(5) == null) {
					Skill skill = new Skill();
					skill.leftEffect(player);
				}
			}			
		} catch(Exception e1) {
			
		}
		//Ŀ�ǵ��� ��ų
		try {
			Player player = event.getPlayer();
			Inventory inv = player.getInventory();
			ItemStack item = player.getInventory().getItemInMainHand();
			if(event.getAnimationType() == PlayerAnimationType.ARM_SWING) {	    	
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
				if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BLACK_DYE)) {
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
			if(!player.getDisplayName().equals("yumehama")) {
				event.setCancelled(true);
			}			
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
	}
	
	@EventHandler
	public void summonMobDeathEvent(EntityDeathEvent event) {
		//bomb
		try {
			if(event.getEntity().getCustomName().substring(2).split("��")[0].equalsIgnoreCase("���� ����")) {
				String name = event.getEntity().getCustomName().substring(14);
				String numStr = name.split("]")[0];
				int num = Integer.parseInt(numStr);
				Location loc = event.getEntity().getLocation();
				event.getEntity().getWorld().createExplosion(loc, 1, false, false);
				List <Entity> entitylist = event.getEntity().getNearbyEntities (8, 5, 8); 
				for (Entity nearEntity : entitylist) { 
				    if (nearEntity.getType() != EntityType.PLAYER) { 
				    	LivingEntity entity = (LivingEntity) nearEntity;
				    	entity.damage(num * 40);
				    }        
				}   
			}
			if(event.getEntity().getCustomName().substring(2).split("��")[0].equalsIgnoreCase("������ ��")) {
				List <Entity> entitylist = event.getEntity().getNearbyEntities (10, 20, 10); 
				for (Entity nearEntity : entitylist) { 
				    if(nearEntity instanceof LivingEntity) {
				    	LivingEntity nearMob = (LivingEntity) nearEntity;
					    nearMob.addPotionEffect(new PotionEffect(PotionEffectType.HARM,1,32700));
					    nearMob.addPotionEffect(new PotionEffect(PotionEffectType.HEAL,1,32700));
				    }        
				}
			}
			if(event.getEntity().getCustomName().substring(2).split("��")[0].equalsIgnoreCase("������ ����")) {
				
				ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
				ItemMeta rewardKeyIm = rewardKey.getItemMeta();
				rewardKeyIm.setDisplayName(ChatColor.YELLOW + "���� ���� ���� ����");
				rewardKey.setItemMeta(rewardKeyIm);
				
				List<Entity> entitylist = event.getEntity().getNearbyEntities(40, 20, 40);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearplayer = (Player) nearEntity;
						if (nearplayer.getLocation().getX() <= 3556 && nearplayer.getLocation().getY() <= 35
								&& nearplayer.getLocation().getZ() <= 3726 && nearplayer.getLocation().getX() >= 3522
								&& nearplayer.getLocation().getY() >= 15 && nearplayer.getLocation().getZ() >= 3691) {
							nearplayer.getInventory().addItem(rewardKey);
							nearplayer.teleport(new Location(world, 3465, 37, 3749.5, -90f, 1.4f));
							nearplayer.sendMessage("���� ��򰡷� �̵��ߴ�.");
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
	        	
	        	if(et.isOn(player.getDisplayName())) {
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
		        		im.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
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
		        		im.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
		        		item.setItemMeta(im);
		        		player.getInventory().addItem(item);
		        	}
		        	ItemStack eme2 = new ItemStack(Material.EMERALD_BLOCK, cnt2%64);
	        		ItemMeta emeIm2 = eme2.getItemMeta();
	        		emeIm2.setDisplayName(ChatColor.YELLOW + "���޶��� �ָӴ�");
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
		        		im.setDisplayName(ChatColor.AQUA + "���޶��� ����");
		        		item.setItemMeta(im);
		        		player.getInventory().addItem(item);
		        	}
		        	ItemStack eme3 = new ItemStack(Material.SCUTE, cnt3%64);
	        		ItemMeta emeIm3 = eme3.getItemMeta();
	        		emeIm3.setDisplayName(ChatColor.LIGHT_PURPLE + "���޶��� �ָӴ�+");
	        		eme3.setItemMeta(emeIm3);
		        	player.getInventory().addItem(eme3);
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
			if(event.getRightClicked().getType() == EntityType.ITEM_FRAME && player.getGameMode() == GameMode.ADVENTURE) {
				event.setCancelled(true);
				return;
			}
			// ������ ��ȭ
			if(event.getRightClicked().getType() == EntityType.VILLAGER || event.getRightClicked().getType() == EntityType.ARMOR_STAND) {
				InteractVillager iv = new InteractVillager();
				if(iv.interactVillager(player, event.getRightClicked()) == true) {
					event.setCancelled(true);
				}
			}
			// npc ��ȭ
			if (event.getRightClicked().getType() == EntityType.SKELETON_HORSE) {
				InteractNPC iv = new InteractNPC();
				if (iv.interactNPC(player, event.getRightClicked()) == true) {
					event.setCancelled(true);
				}
			}
		}
	}
	
	@EventHandler
	public void clickInv(InventoryClickEvent event) {
		if(event.getClick() != ClickType.MIDDLE) {
			try {
				if(event.getInventory().getType() == InventoryType.CHEST) {
					if(event.getInventory().getSize() == 9) {
						ItemStack clicked = event.getCurrentItem();
				        Player player = (Player) event.getWhoClicked();
				        ChangeJobClick cjc = new ChangeJobClick();
				        cjc.click(player, clicked);
					}
				}
			} catch(Exception e) {
				
			}
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
			} catch(Exception e) {
				
			}
			try {
				Player player = (Player) event.getWhoClicked();
				if(event.isShiftClick() == true && event.getInventory().getSize() == 5) {
					event.setCancelled(true);
					return;
				}
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
			try {
				ItemStack clicked = event.getCurrentItem();
		        Player player = (Player) event.getWhoClicked();
//		        ItemStack item1 = event.getCursor();
//		        try {
//		        	 ItemStack item2 = event.getInventory().getItem(event.getSlot());
//				        if(item1 == item2) {
//				        	if(item1.getType() == Material.OAK_LEAVES || item1.getType() == Material.SPRUCE_LEAVES || item1.getType() == Material.BIRCH_LEAVES
//										|| item1.getType() == Material.JUNGLE_LEAVES || item1.getType() == Material.ACACIA_LEAVES || item1.getType() == Material.DARK_OAK_LEAVES
//										|| item1.getType() == Material.COBBLESTONE_WALL || item1.getType() == Material.MOSSY_COBBLESTONE_WALL || item1.getType() == Material.BROWN_CARPET
//										|| item1.getType() == Material.GREEN_CARPET || item1.getType() == Material.BLACK_CARPET || item1.getType() == Material.STONE
//										|| item1.getType() == Material.OAK_PLANKS || item1.getType() == Material.SPRUCE_PLANKS || item1.getType() == Material.BIRCH_PLANKS
//										|| item1.getType() == Material.JUNGLE_PLANKS || item1.getType() == Material.ACACIA_PLANKS || item1.getType() == Material.DARK_OAK_PLANKS
//										|| item1.getType() == Material.BEDROCK || item1.getType() == Material.SPRUCE_LOG || item1.getType() == Material.BIRCH_LOG
//										|| item1.getType() == Material.JUNGLE_LOG || item1.getType() == Material.ACACIA_LOG || item1.getType() == Material.DARK_OAK_LOG
//										|| item1.getType() == Material.SANDSTONE || item1.getType() == Material.CHISELED_SANDSTONE || item1.getType() == Material.CUT_SANDSTONE
//										|| item1.getType() == Material.LAPIS_BLOCK || item1.getType() == Material.MAGENTA_WOOL || item1.getType() == Material.LIME_WOOL
//										|| item1.getType() == Material.GRAY_WOOL || item1.getType() == Material.LIGHT_GRAY_WOOL || item1.getType() == Material.CYAN_WOOL
//										|| item1.getType() == Material.PURPLE_WOOL || item1.getType() == Material.OAK_SLAB || item1.getType() == Material.SPRUCE_SLAB
//										|| item1.getType() == Material.BIRCH_SLAB || item1.getType() == Material.JUNGLE_SLAB || item1.getType() == Material.ACACIA_SLAB
//										|| item1.getType() == Material.DARK_OAK_SLAB || item1.getType() == Material.STONE_SLAB || item1.getType() == Material.COBBLESTONE_SLAB
//										|| item1.getType() == Material.STONE_BRICK_SLAB || item1.getType() == Material.NETHER_BRICK_SLAB || item1.getType() == Material.QUARTZ_SLAB
//										|| item1.getType() == Material.RED_SANDSTONE || item1.getType() == Material.RED_SANDSTONE_SLAB || item1.getType() == Material.SMOOTH_RED_SANDSTONE
//										|| item1.getType() == Material.OBSIDIAN || item1.getType() == Material.SMOOTH_SANDSTONE || item1.getType() == Material.CHISELED_RED_SANDSTONE
//										|| item1.getType() == Material.CUT_RED_SANDSTONE || item1.getType() == Material.RED_SANDSTONE_STAIRS || item1.getType() == Material.STONE_STAIRS
//										|| item1.getType() == Material.DEAD_BRAIN_CORAL_BLOCK || item1.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK || item1.getType() == Material.DEAD_FIRE_CORAL_BLOCK
//										|| item1.getType() == Material.DEAD_HORN_CORAL_BLOCK || item1.getType() == Material.DEAD_TUBE_CORAL_BLOCK || item1.getType() == Material.BRAIN_CORAL_BLOCK
//										|| item1.getType() == Material.HORN_CORAL_BLOCK || item1.getType() == Material.TUBE_CORAL_BLOCK || item1.getType() == Material.BUBBLE_CORAL_BLOCK
//										|| item1.getType() == Material.FIRE_CORAL_BLOCK || item1.getType() == Material.POLISHED_GRANITE_STAIRS || item1.getType() == Material.SMOOTH_RED_SANDSTONE_STAIRS 
//										|| item1.getType() == Material.MOSSY_COBBLESTONE_STAIRS || item1.getType() == Material.MOSSY_STONE_BRICK_STAIRS || item1.getType() == Material.POLISHED_DIORITE_STAIRS
//										|| item1.getType() == Material.END_STONE_BRICK_STAIRS || item1.getType() == Material.STONE_STAIRS || item1.getType() == Material.SMOOTH_SANDSTONE_STAIRS
//										|| item1.getType() == Material.SMOOTH_QUARTZ_STAIRS || item1.getType() == Material.GRANITE_STAIRS) {
//				        		event.setCancelled(true);
//				        	}        	
//				        }
//		        } catch(Exception e) {
//		        	
//		        }
		        if(clicked != null && clicked.getType() == Material.RED_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.GREEN_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.LAPIS_LAZULI) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.CYAN_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.LIGHT_GRAY_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.GRAY_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.PINK_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.LIME_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.YELLOW_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.LIGHT_BLUE_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.MAGENTA_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.ORANGE_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.BLUE_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.BROWN_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.BLACK_DYE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.INK_SAC) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.GLOWSTONE_DUST) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.CLAY_BALL) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.HEART_OF_THE_SEA) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.MAGMA_CREAM) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.RED + "������")) {
		            	player.closeInventory();
		        	}
		            event.setCancelled(true);
		            return;
		        }  
		        if(clicked != null && clicked.getType() == Material.SHULKER_SHELL) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.RED + "������")) {
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
		        if(clicked != null && clicked.getType() == Material.BONE) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.SKELETON_SKULL) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.SLIME_BALL) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "��ȭ�ϱ�")) {
		        		Inventory inv = event.getInventory();
		        		ReinforcementMakeEvent rm = new ReinforcementMakeEvent();
		        		if(rm.rein(player, inv) == false) {
		        			event.setCancelled(true);
		        			return;
		        		}
		        	}
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "�����ϱ�")) {
		        		Inventory inv = event.getInventory();
		        		CraftingItem ci = new CraftingItem();
		        		ci.make(player, inv);
		        		event.setCancelled(true);
		        		return;
		        	}
		            event.setCancelled(true);
		            return;
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
	}
	
	@EventHandler
	public void offPlayer(PlayerQuitEvent event) {
		Player player = event.getPlayer();		
		
		// Ban
		if ((player.getUniqueId().toString().equalsIgnoreCase("5d5f3cf5-bbec-4dba-b97c-fe2ddf900191"))) {
			event.setQuitMessage(null);
			return;
		}
		
		// Message
		if (player.getDisplayName().equalsIgnoreCase("yumehama")) {
			event.setQuitMessage(ChatColor.DARK_RED + "'�� ���� ������' �����ϸ�" + ChatColor.WHITE + "���� �α׾ƿ� �Ͽ����ϴ�.");
		} else if (player.getDisplayName().equalsIgnoreCase("WoolRing")) {
			event.setQuitMessage(ChatColor.GREEN + "'�׸� �Ϸ�Ʈ�δ� ����' �︵" + ChatColor.WHITE + "���� ���� ���� Ż���մϴ�.");
		} else if (player.getDisplayName().equalsIgnoreCase("_nanoboost_")) {
			event.setQuitMessage(ChatColor.RED + "��ũ�� ���� �ῡ ������ϴ�.");
		} else if(player.getDisplayName().equalsIgnoreCase("why9196")) {
			event.setQuitMessage(ChatColor.BLACK + "????????????????");
		} else if(player.getDisplayName().equalsIgnoreCase("Akilae3102")) {
			event.setQuitMessage("õ�� ������ ���� " + ChatColor.AQUA + "'�ְ��� ��󸮽�Ʈ' ��ų���� ������ �������ϴ�.");
		} else if(player.getDisplayName().equalsIgnoreCase("Espina_ID")) {
			event.setQuitMessage(ChatColor.BOLD + "'����ī���� �����̾����� ī���ϻ��� �����ϰ��� ������ �̵带 ����ϴ�' �����ǳ��� ����Ʈ�� �Ϸ� 2D��ī�̷� �������ϴ�.");
		} else {
			event.setQuitMessage("�߻��� �������� �����Ĺ��ȴ�.");
		}
		
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
					if(ent.getType() == EntityType.DROPPED_ITEM) {
						ent.remove();
					}
				} catch(Exception e) {
					
				}
			}
		}		
		try {
			File dataFolder = getDataFolder();
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File file = new File(getDataFolder(), player.getDisplayName() + "_data.dat");
                if(!file.exists()) {
                    try {
                    	file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                	long time = System.currentTimeMillis(); 
            		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            		String str = dayTime.format(new Date(time));
            		
                	FileReader filereader = new FileReader(file);
                    BufferedReader bufReader = new BufferedReader(filereader);
                    String line = "";
                    FileWriter fw = new FileWriter(file, true);
                    fw.write("\n" + str);
                    fw.write("\n" + "player name: " + player.getDisplayName());
                    fw.write("\n" + "player location: " + (int)(player.getLocation().getX()) + " " + (int)(player.getLocation().getY()) + " " + (int)(player.getLocation().getZ()));
                    fw.write("\n" + "����: " + player.getLevel() + " ����ġ: " + "(" + (int)(player.getExp()*player.getExpToLevel()) + "/" + player.getExpToLevel() + ")"
                    		+ " �ִ�ü��: " + player.getMaxHealth());
                    fw.write("\n");
                    for(int i = 0 ; i<41 ; i++){                    
                    	 try {
                    		 fw.write(player.getInventory().getItem(i).getItemMeta().getDisplayName());        
                    		 fw.write("(" + player.getInventory().getItem(i).getType() + ")"); 
                    		 fw.write(String.valueOf(player.getInventory().getItem(i).getAmount()));
                    		 fw.write(" / ");
                    	 } catch(Exception e) {
                    		
                    	 }                   
                    }
                    fw.write("\n");
                    fw.close();
                    bufReader.close();
                }
            }
		} catch(Exception e) {
			
		}
		try {
			File dataFolder = getDataFolder();
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File file = new File(getDataFolder(), player.getDisplayName() + "_Qdata.dat");
                if(!file.exists()) {
                    try {
                    	file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {                	
                	FileReader filereader = new FileReader(file);
                    BufferedReader bufReader = new BufferedReader(filereader);
                    FileWriter fw = new FileWriter(file, false);              
                    QuestBoard qb = new QuestBoard();
            		if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�ؾ��� ����===")) {
            				int number =  qb.getNum(player);
            				fw.write("q1\n");
            				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("q2\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("q3\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�� ��ɲ�===")) {
        				int number =  qb.getNum(player);
        				fw.write("q4\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===ħ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("q5\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�� ���� ��===")) {
        				int number =  qb.getNum(player);
        				fw.write("q6\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��ȭ�ϴ� ��===")) {
        				int number =  qb.getNum(player);
        				fw.write("q7\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ƺ������� �ٸ�===")) {
        				int number =  qb.getNum(player);
        				fw.write("q8\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("q9\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Żȯ===")) {
        				int number =  qb.getNum(player);
        				fw.write("q10\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ũ�κ���===")) {
        				int number =  qb.getNum(player);
        				fw.write("q11\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("q12\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ο� ���===")) {
        				int number =  qb.getNum(player);
        				fw.write("q13\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �Ǹ�===")) {
        				int number =  qb.getNum(player);
        				fw.write("q14\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ع��� �ı����� ��I===")) {
        				int number =  qb.getNum(player);
        				fw.write("q15\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ű�� ��===")) {
        				int number =  qb.getNum(player);
        				fw.write("q16\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ź��===")) {
        				int number =  qb.getNum(player);
        				fw.write("q17\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("q18\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����1===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����2===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq1_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����3===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq1_2\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����4===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq1_3\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����5===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq1_4\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����6===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq1_5\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����7===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq1_6\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ſ��� ���1===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq2\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ſ��� ���2===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq2_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ſ��� ���3===")) {
        				int number =  qb.getNum(player);
        				fw.write("eq2_2\n");
        				fw.write(Integer.toString(number));
            		}  else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���״� ���� ���===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq2\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ������===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq3\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ź1===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq4\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ź2===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq5\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ��Ź3===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq6\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq7\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�ĸ�Ȧ���� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq8\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ���ư��� ���� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq9\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq10\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��뿡 ������ ���===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq11\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��븦 ������ ��===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq12\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�õ� �������� ���� ��===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq13\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�õ� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq14\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����1===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq15\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����2===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq15_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ǣ���� ��===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq16\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq17\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��1===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq18\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��2===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq19\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��3===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq20\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��4===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq20_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��5===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq20_2\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ �ƴ� ��6===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq21\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�ƶ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq22\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� Ž��===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq23\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===ī�� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq24\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����1===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq25\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����2===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq26\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����3===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq26_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ο� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq27\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ���ſ�===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq28\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ž1===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq29\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ž2===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq29_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�ǻ�Ƴ� �ذ�===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq30\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===��ȥ ���� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq31\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ������ �԰� �;�===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq32\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�״�� ��������===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq33\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� �̾߱�1===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq33_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�Ǵٽ� ��������===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq34\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� �̾߱�2===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq34_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===����ž�� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq35\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq35_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�̰��� ������ ��?===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq36\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� ��� �Ҹ��� �����°�===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq37\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq37_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �޷���===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq37_2\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �� ��� �Ҹ��� �����°�===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq38\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq38_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���̿��� ������===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq38_2\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�׺��� ��1===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq39\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�׺��� ��2===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq39_1\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�׺��� ��3===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq39_2\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�ƶ�ũ���� ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq40\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���� �帧�� ��===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq41\n");
        				fw.write(Integer.toString(number));
            		} else if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�帧�� ������ ����===")) {
        				int number =  qb.getNum(player);
        				fw.write("mq41_1\n");
        				fw.write(Integer.toString(number));
            		}            		
                    fw.close();
                    bufReader.close();
                }
            }
		} catch(Exception e) {
			
		}
		try {
			ParticleData pd = new ParticleData(player.getUniqueId());
			if(pd.hasID()) {
				pd.endTask();
				pd.removeID();
			}
		} catch(Exception e) {
			
		}
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
	
//	@EventHandler
//	public void blockPhysicsEvent(BlockPhysicsEvent event) {
//		if(event.getBlock().getType() == Material.SAND) {
//			Location loc = event.getBlock().getLocation().add(0,-1,0);
//			loc.getBlock().setType(Material.SANDSTONE);
//		}
//	}
	
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
		if(event.getEntityType() == EntityType.PRIMED_TNT || event.getEntityType() == EntityType.ENDER_CRYSTAL) {
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
		}
		if(event.getEntity().getType() == EntityType.PIGLIN) {
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
	public void swapHand(PlayerSwapHandItemsEvent event) {
		try {
			Player player = event.getPlayer();
			ItemStack item1 = player.getInventory().getItemInMainHand();
			ItemStack item2 = player.getInventory().getItemInOffHand();
			if(item1.getItemMeta() == null) {
				event.setCancelled(true);
				return;
			}
			if(item2.getItemMeta() == null) {
				event.setCancelled(true);
				return;
			}
			if(player.getInventory().contains(Material.MAGENTA_DYE) || player.getInventory().contains(Material.MAGENTA_DYE) || player.getInventory().contains(Material.ORANGE_DYE)) {
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
						|| item1.getType() == Material.NETHERITE_CHESTPLATE || item1.getType() == Material.NETHERITE_LEGGINGS || item1.getType() == Material.NETHERITE_BOOTS)) {
					LimitLevel la = new LimitLevel();
					if(la.limit(player, item1) == false) {
						player.sendMessage(ChatColor.RED + "���� �� ���⸦ �ٷ�⿡�� �� ���� �����ϴ�.");
						return;
					}
				}
			} catch(Exception e) {
				
			}
			new ExtraSkill(player, item1, item2);
			if(!(player.getInventory().contains(Material.HEART_OF_THE_SEA))) {
				ItemStack item = new ItemStack(Material.MAGMA_CREAM);
				ItemMeta itemIm = item.getItemMeta();
				itemIm.setDisplayName(ChatColor.RED + "��������");
				item.setItemMeta(itemIm);
				player.getInventory().setItem(8, item);
			}
			event.setCancelled(true);
			return;
		} catch(Exception e) {
			event.setCancelled(true);
			return;
		}
	}
	
	@EventHandler
	public void EntityUnbreak(HangingBreakByEntityEvent event) {
		if(event.getRemover() instanceof Player) {
			Player player = (Player) event.getRemover();
			if(player.getGameMode() == GameMode.ADVENTURE) {
				event.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void InvenClose(InventoryCloseEvent event) {
		try {
			if(event.getInventory().getType() == InventoryType.CHEST) {
				Player player = (Player) event.getPlayer();
				Inventory inv = event.getInventory();
				if(inv.getSize() == 27 && !player.isOp()) {
					Cmd13Chest cc = new Cmd13Chest();
			    	if(cc.isPlayerInSelectAL(player.getUniqueId().toString())) {
			    		int num = cc.getChestNum(player.getUniqueId().toString());
			    		if(num != 1) {
			    			world.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_CLOSE, 1.0f, 1.0f);
			    			new ChestOwner(player, num, inv);
			    		}
			    	}
				}
			}
		} catch(Exception e) {
			
		}
		try {
			Inventory inv = event.getInventory();
			Player player = (Player) event.getPlayer();
			
			try {
				if(inv.getItem(7).getType() == Material.SLIME_BALL) {
					if(inv.getItem(8).getType() == Material.SHULKER_SHELL) {
						if(inv.getSize() == 9) {
							try {player.getInventory().addItem(inv.getItem(0));} catch(Exception e) {}
							try {player.getInventory().addItem(inv.getItem(1));} catch(Exception e) {}
						}
					}
				}
			} catch(Exception e) {
				
			}
			
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
		Player player = event.getPlayer();
		String msg = event.getMessage();
		if(new RenameCraftingItem().renameCraftingItem(player, msg) == false) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void moveEvent(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		new MoveEvent(player);
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
//			im.setDisplayName(ChatColor.AQUA + "������");
//			item.setItemMeta(im);
//			player.getInventory().addItem(item);
//			player.sendMessage("�� �༮. �����̸� ȹ���Ͽ���.");
//			for (Player allPlayer : Bukkit.getOnlinePlayers()) {
//			    allPlayer.sendMessage(player.getDisplayName() + "���� �����̸� ���ƹ��Ƚ��ϴ�.");
//			    allPlayer.sendMessage("==�̺�Ʈ ����==");
//			}
//		} else {
//			ItemStack item = new ItemStack(Material.COD);
//			ItemMeta im = item.getItemMeta();
//			im.setDisplayName(ChatColor.GRAY + "��");
//			item.setItemMeta(im);
//			player.getInventory().addItem(item);
//			player.sendMessage("���� ���Ҵ�.");
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