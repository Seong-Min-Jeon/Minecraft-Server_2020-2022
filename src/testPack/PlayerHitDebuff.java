package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.v1_16_R1.CraftWorld;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import net.minecraft.server.v1_16_R1.WorldServer;

public class PlayerHitDebuff {
	
	Random rnd = new Random();
	private int taskID;

	public void playerHitDebuff(Player player, Entity mob) {
		mob1(player, mob);
		mob2(player, mob);
		mob3(player, mob);
		mob4(player, mob);
		mob5(player, mob);
		mob6(player, mob);
		mob7(player, mob);
		mob8(player, mob);
		mob9(player, mob);
		mob10(player, mob);
		mob11(player, mob);
		mob12(player, mob);
		mob13(player, mob);
		mob14(player, mob);
		mob15(player, mob);
		mob16(player, mob);
		mob17(player, mob);
		mob18(player, mob);
		mob19(player, mob);
		mob20(player, mob);
		mob21(player, mob);
	}

	// �÷��� ����
	public void mob1(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("�÷��� ����" + ChatColor.YELLOW + " [Lv.??]")) {
			if(((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(5);
				if(num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE28();
					// ================================================================
					player.damage(player.getHealth()/2);
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,1,true,false,false));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�÷��� ���ְ� �ɸ��ϴ�.");
				}
			}
		}
	}

	// ������
	public void mob2(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("������ ������" + ChatColor.YELLOW + " [Lv.??]")) {
			int num = rnd.nextInt(20);
			if(num <= 3) {
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE29();
				// ================================================================
				player.damage(200);
				player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 1.0f, 1.0f);
				player.sendMessage(ChatColor.RED + "�������� ������ �ߵ��˴ϴ�.");
			}
			if(num == 4) {
				LivingEntity ent = (LivingEntity) mob;
				ent.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 60, 1,true,false,false));
				ent.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 140,true,false,false));
				CustomWither cw = new CustomWither(ent.getLocation());
				WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
				world.addEntity(cw);
				player.getWorld().playEffect(mob.getLocation(), Effect.END_GATEWAY_SPAWN, 0);
				player.sendMessage(ChatColor.RED + "�������� ��ȯ ������ ����߽��ϴ�.");
				sendMessage(player, ChatColor.RED + "�������� ��ȯ ������ ����߽��ϴ�.");
			}
		}
	}

	// ��������
	public void mob3(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("�������� ƼŸ�Ͼ�" + ChatColor.YELLOW + " [Lv.??]")) {
			int num = rnd.nextInt(10);
			if(num == 0) {
				for(int i = 0 ; i < 10 ; i++) {
					player.getWorld().spawnParticle(Particle.CLOUD, mob.getLocation(), 0);
				}
				LivingEntity ent = (LivingEntity) mob;
				ent.setHealth(ent.getHealth() + 5000);
				List<Entity> nearMob = ent.getNearbyEntities(10, 3, 10);
				for(Entity mob2 : nearMob) {
					if(mob2 instanceof Mob) {
						LivingEntity ent2 = (LivingEntity) mob2;
						ent2.setHealth(ent2.getHealth() + 5000);
					}
				}
				player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
				player.sendMessage(ChatColor.RED + "���������� ��ų�� �ֺ� ���Ͱ� ȸ���˴ϴ�.");
				sendMessage(player, ChatColor.RED + "���������� ��ų�� �ֺ� ���Ͱ� ȸ���˴ϴ�.");
			}
		}
	}

	// ���귻
	public void mob4(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("���귻" + ChatColor.YELLOW + " [Lv.??]")) {
			int num = rnd.nextInt(8);
			if(num < 2) {
				for(int i = 0 ; i < 10 ; i++) {
					player.getWorld().spawnParticle(Particle.ASH, mob.getLocation(), 10);
				}
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,200,1,true,false,false));
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,40,50,true,false,false));
				player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
				player.sendMessage(ChatColor.RED + "���귻�� ���ַ� ���� ���ٽ��ϴ�.");
				((WitherSkeleton) mob).setTarget(player);
			} 
			if(num == 2) {
				int num2 = rnd.nextInt(10);
				if(num2==0) {
					mob.teleport(new Location(player.getWorld(), 3788, 69, 3207));
				} else if(num2==1) {
					mob.teleport(new Location(player.getWorld(), 3787, 69, 3212));
				} else if(num2==2) {
					mob.teleport(new Location(player.getWorld(), 3802, 69, 3213));
				} else if(num2==3) {
					mob.teleport(new Location(player.getWorld(), 3801, 69, 3220));
				} else if(num2==4) {
					mob.teleport(new Location(player.getWorld(), 3794, 69, 3207));
				} else if(num2==5) {
					mob.teleport(new Location(player.getWorld(), 3789, 69, 3222));
				} else if(num2==6) {
					mob.teleport(new Location(player.getWorld(), 3794, 69, 3213));
				} else if(num2==7) {
					mob.teleport(new Location(player.getWorld(), 3794, 86, 3215));
				} else if(num2==8) {
					mob.teleport(new Location(player.getWorld(), 3801, 82, 3222));
				} else if(num2==9) {
					mob.teleport(new Location(player.getWorld(), 3787, 82, 3217));
				} else {
					mob.teleport(new Location(player.getWorld(), 3787, 82, 3217));
				}
				player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				player.sendMessage(ChatColor.RED + "���귻�� ��򰡷� �̵��Ͽ����ϴ�.");
				sendMessage(player, ChatColor.RED + "���귻�� ��򰡷� �̵��Ͽ����ϴ�.");
			}
		}
	}

	// �߷θ�
	public void mob5(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("�߷θ�" + ChatColor.YELLOW + " [Lv.??]")) {
			if(((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(10);
				if(num == 0) {
					player.teleport(mob.getLocation());
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,100,true,false,false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100,200,true,false,false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,100,200,true,false,false));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_CHAIN_HIT, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�߷θ��� ����� ��������ϴ�.");
					((Zombie) mob).setTarget(player);
				} 
				if(num == 1) {
					
					mob.teleport(player);
					
					player.sendMessage(ChatColor.RED + "�߷θ��� �����̾ �����մϴ�.");
					sendMessage(player, ChatColor.RED + "�߷θ��� �����̾ �����մϴ�.");
					
					ArrayList<FallingBlock> ary = new ArrayList<>();
					Location loc = mob.getLocation();
					for(int x = -8 ; x < 9 ; x++) {
						for(int y = -1 ; y < 0 ; y++) {
							for(int z = -8 ; z < 9 ; z++) {
								Location loc2 = loc.clone().add(new Vector(x,y+0.05,z));
								if(loc2.getBlock().getType() != Material.AIR) {
									FallingBlock fb = (FallingBlock) mob.getWorld().spawnFallingBlock(loc2, Material.RED_WOOL, (byte)0);
									fb.setVelocity(new Vector(0,0,0));
									fb.setDropItem(false);
									fb.setGravity(false);
									ary.add(fb);
								}
							}
						}
					}
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ArrayList<FallingBlock> ary2 = ary;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time >= 30) {
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE30();
								// ================================================================
								for(FallingBlock fb : ary2) {
									fb.remove();
								}
								List<Entity> nearPlayer = mob.getNearbyEntities(8, 10, 8);
								for(Entity p : nearPlayer) {
									if(p instanceof Player) {
										((Player) p).damage(500);
										p.setFireTicks(200);
									}
								}
								player.sendMessage(ChatColor.RED + "�߷θ��� �����̾ ����Ͽ����ϴ�.");
								sendMessage(player, ChatColor.RED + "�߷θ��� �����̾ ����Ͽ����ϴ�.");
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(13);
				if(num == 0) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,100,true,false,false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100,200,true,false,false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,50,200,true,false,false));
					player.sendMessage(ChatColor.RED + "�߷θ��� ������ ��ȭ�Ǿ����ϴ�.");
					((Zombie) mob).setTarget(player);
				}
			}
		}
	}

	// �Ƶ�
	public void mob6(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("�Ƶ�" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(10);
				if (num == 0) {
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 100, 0, true, false, false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 0, true, false, false));
					((LivingEntity) mob).setHealth(((LivingEntity) mob).getHealth() + 3000);
					player.getWorld().playSound(mob.getLocation(), Sound.AMBIENT_CAVE, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�Ƶ��� ȸ���� �ϱ� ���� �������ϴ�.");
					sendMessage(player, ChatColor.RED + "�Ƶ��� ȸ���� �ϱ� ���� �������ϴ�.");
					((WitherSkeleton) mob).setTarget(player);
				}
				if (num == 1) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE31();
					// ================================================================
					Zombie s1 = (Zombie) player.getWorld().spawnEntity(mob.getLocation(), EntityType.ZOMBIE);
					Zombie s2 = (Zombie) player.getWorld().spawnEntity(mob.getLocation(), EntityType.ZOMBIE);
					Location chestLoc = new Location(player.getWorld(), -1830, 92, 3043);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					EntityEquipment head1 = s1.getEquipment();
					ItemStack head1Item = chest.getInventory().getItem(9);
					head1.setHelmet(head1Item);
					EntityEquipment head2 = s2.getEquipment();
					ItemStack head2Item = chest.getInventory().getItem(10);
					head2.setHelmet(head2Item);
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_BASALT_BREAK, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�Ƶ��� ���̵���� ȣ���Ͽ����ϴ�.");
					sendMessage(player, ChatColor.RED + "�Ƶ��� ���̵���� ȣ���Ͽ����ϴ�.");
				}
			} else {
				int num = rnd.nextInt(32);
				if (num == 0) {
					player.teleport(new Location(player.getWorld(), 3325, 13, 3736));
					mob.teleport(new Location(player.getWorld(), 3327, 13, 3734));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�Ƶ��� �������� �̵��˴ϴ�.");
					((WitherSkeleton) mob).setTarget(player);
				} else if (num == 1) {
					player.teleport(new Location(player.getWorld(), 3325, 13, 3752));
					mob.teleport(new Location(player.getWorld(), 3327, 13, 3754));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�Ƶ��� �������� �̵��˴ϴ�.");
					((WitherSkeleton) mob).setTarget(player);
				} else if (num == 2) {
					player.teleport(new Location(player.getWorld(), 3309, 13, 3752));
					mob.teleport(new Location(player.getWorld(), 3307, 13, 3754));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�Ƶ��� �������� �̵��˴ϴ�.");
					((WitherSkeleton) mob).setTarget(player);
				} else if (num == 3) {
					player.teleport(new Location(player.getWorld(), 3309, 13, 3736));
					mob.teleport(new Location(player.getWorld(), 3307, 13, 3734));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�Ƶ��� �������� �̵��˴ϴ�.");
					((WitherSkeleton) mob).setTarget(player);
				}
			}
		}
	}

	// Ư�� �丮��
	public void mob7(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("Ư�� �丮��" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(10);
				if (num == 0) {
					((LivingEntity) mob).setHealth(((LivingEntity) mob).getHealth() + 8000);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EAT, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "Ư�� �丮�簡 ������ �԰� ȸ���մϴ�.");
					sendMessage(player, ChatColor.RED + "Ư�� �丮�簡 ������ �԰� ȸ���մϴ�.");
					((Zombie) mob).setTarget(player);
				} else if (num == 1) {
					player.setFireTicks(200);
					player.sendMessage(ChatColor.RED + "Ư�� �丮��: ���ְ� �������Ŷ�.");
					((Zombie) mob).setTarget(player);
				}
			} else {
				int num = rnd.nextInt(8);
				if (num == 0) {
					player.setFireTicks(200);
					player.sendMessage(ChatColor.RED + "Ư�� �丮��: ���ְ� �������Ŷ�.");
					((Zombie) mob).setTarget(player);
				}
			}
		}
	}

	// 1���� ������
	public void mob8(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("1���� ������" + ChatColor.YELLOW + " [Lv.??]")) {

			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(12);
				if (num == 0) {
					player.teleport(mob.getLocation());
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 100, true, false, false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100, 200, true, false, false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 200, true, false, false));
					player.setVelocity(player.getEyeLocation().getDirection().multiply(-10.0f));
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_NETHERRACK_STEP, 3.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�����ڰ� ����� �о���ϴ�.");
					((Skeleton) mob).setTarget(player);
				}
				if (num == 1) {
					
					player.sendMessage(ChatColor.RED + "�����ڰ� �ֹ��� �ܿ�� �����߽��ϴ�.");
					sendMessage(player, ChatColor.RED + "�����ڰ� �ֹ��� �ܿ�� �����߽��ϴ�.");
					
					ArrayList<FallingBlock> ary = new ArrayList<>();
					Location loc = mob.getLocation();
					for(int x = -20 ; x < 21 ; x++) {
						for(int y = -1 ; y < 0 ; y++) {
							for(int z = -20 ; z < 21 ; z++) {
								Location loc2 = loc.clone().add(new Vector(x,y+0.05,z));
								if(loc2.getBlock().getType() != Material.AIR) {
									FallingBlock fb = (FallingBlock) mob.getWorld().spawnFallingBlock(loc2, Material.RED_WOOL, (byte)0);
									fb.setVelocity(new Vector(0,0,0));
									fb.setDropItem(false);
									fb.setGravity(false);
									ary.add(fb);
								}
							}
						}
					}
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ArrayList<FallingBlock> ary2 = ary;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time >= 40) {
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								for(FallingBlock fb : ary2) {
									fb.remove();
								}
								List<Entity> nearPlayer = mob.getNearbyEntities(20, 10, 20);
								for (Entity p : nearPlayer) {
									if (p instanceof Player) {
										((Player) p).damage(300);
									}
								}
								player.sendMessage(ChatColor.RED + "�����ڰ� ����I�� ����Ͽ����ϴ�.");
								sendMessage(player, ChatColor.RED + "�����ڰ� ����I�� ����Ͽ����ϴ�.");
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(12);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE32();
					// ================================================================
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 200, true, false, false));
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, true, false, false));
					player.sendMessage(ChatColor.RED + "ž�� ���ַ� �����ڰ� ��ȭ�˴ϴ�.");
					sendMessage(player, ChatColor.RED + "ž�� ���ַ� �����ڰ� ��ȭ�˴ϴ�.");
					((Skeleton) mob).setTarget(player);
				}
			}
		}
	}

	// 2���� ������
	public void mob9(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("2���� ������" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(12);
				if (num == 0) {
					player.teleport(mob.getLocation());
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 200, true, false, false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200, true, false, false));
					player.sendMessage(ChatColor.RED + "ȯ���� �ɷȽ��ϴ�.");
					((Skeleton) mob).setTarget(player);
				}
				if (num == 1) {
					
					player.sendMessage(ChatColor.RED + "�����ڰ� �ֹ��� �ܿ�� �����߽��ϴ�.");
					sendMessage(player, ChatColor.RED + "�����ڰ� �ֹ��� �ܿ�� �����߽��ϴ�.");
					
					ArrayList<FallingBlock> ary = new ArrayList<>();
					Location loc = mob.getLocation();
					for(int x = -20 ; x < 21 ; x++) {
						for(int y = -1 ; y < 0 ; y++) {
							for(int z = -20 ; z < 21 ; z++) {
								Location loc2 = loc.clone().add(new Vector(x,y+0.05,z));
								if(loc2.getBlock().getType() != Material.AIR) {
									FallingBlock fb = (FallingBlock) mob.getWorld().spawnFallingBlock(loc2, Material.RED_WOOL, (byte)0);
									fb.setVelocity(new Vector(0,0,0));
									fb.setDropItem(false);
									fb.setGravity(false);
									ary.add(fb);
								}
							}
						}
					}
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ArrayList<FallingBlock> ary2 = ary;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time >= 40) {
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								for(FallingBlock fb : ary2) {
									fb.remove();
								}
								List<Entity> nearPlayer = mob.getNearbyEntities(20, 10, 20);
								for (Entity p : nearPlayer) {
									if (p instanceof Player) {
										((Player) p).damage(400);
									} 
								}
								player.sendMessage(ChatColor.RED + "�����ڰ� ����II�� ����Ͽ����ϴ�.");
								sendMessage(player, ChatColor.RED + "�����ڰ� ����II�� ����Ͽ����ϴ�.");
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(12);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE32();
					// ================================================================
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 200, true, false, false));
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, true, false, false));
					player.sendMessage(ChatColor.RED + "ž�� ���ַ� �����ڰ� ��ȭ�˴ϴ�.");
					sendMessage(player, ChatColor.RED + "ž�� ���ַ� �����ڰ� ��ȭ�˴ϴ�.");
					((Skeleton) mob).setTarget(player);
				}
			}
		}
	}

	// 3���� ������
	public void mob10(Player player, Entity mob) {

	}

	// 4���� ������
	public void mob11(Player player, Entity mob) {

	}

	// 5���� ������
	public void mob12(Player player, Entity mob) {

	}

	// 6���� ������
	public void mob13(Player player, Entity mob) {

	}

	// 7���� ������
	public void mob14(Player player, Entity mob) {

	}

	// 8���� ������
	public void mob15(Player player, Entity mob) {

	}

	// 9���� ������
	public void mob16(Player player, Entity mob) {

	}

	// 10���� ������
	public void mob17(Player player, Entity mob) {

	}

	// 11���� ������
	public void mob18(Player player, Entity mob) {

	}

	// 12���� ������
	public void mob19(Player player, Entity mob) {

	}

	// ������
	public void mob20(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("������" + ChatColor.YELLOW + " [Lv.299]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 0, true, false, false));
		}
	}

	// �ڳ���
	public void mob21(Player player, Entity mob) {
		
		if (mob.getCustomName().substring(2).equalsIgnoreCase("�ڳ���" + ChatColor.YELLOW + " [Lv.??]")) {
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(12);
				if (num == 0) {
					player.teleport(mob.getLocation());
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 100, true, false, false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100, 200, true, false, false));
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 200, true, false, false));
					player.setVelocity(player.getEyeLocation().getDirection().multiply(-10.0f));
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_NETHERRACK_STEP, 3.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "�����ڰ� ����� �о���ϴ�.");
					((Skeleton) mob).setTarget(player);
				}
				if (num == 1) {
					
					player.sendMessage(ChatColor.RED + "�����ڰ� �ֹ��� �ܿ�� �����߽��ϴ�.");
					sendMessage(player, ChatColor.RED + "�����ڰ� �ֹ��� �ܿ�� �����߽��ϴ�.");
					
					ArrayList<FallingBlock> ary = new ArrayList<>();
					Location loc = mob.getLocation();
					for(int x = -20 ; x < 21 ; x++) {
						for(int y = -1 ; y < 0 ; y++) {
							for(int z = -20 ; z < 21 ; z++) {
								Location loc2 = loc.clone().add(new Vector(x,y+0.05,z));
								if(loc2.getBlock().getType() != Material.AIR) {
									FallingBlock fb = (FallingBlock) mob.getWorld().spawnFallingBlock(loc2, Material.RED_WOOL, (byte)0);
									fb.setVelocity(new Vector(0,0,0));
									fb.setDropItem(false);
									fb.setGravity(false);
									ary.add(fb);
								}
							}
						}
					}
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ArrayList<FallingBlock> ary2 = ary;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time >= 40) {
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								for(FallingBlock fb : ary2) {
									fb.remove();
								}
								List<Entity> nearPlayer = mob.getNearbyEntities(20, 10, 20);
								for (Entity p : nearPlayer) {
									if (p instanceof Player) {
										((Player) p).damage(300);
									}
								}
								player.sendMessage(ChatColor.RED + "�����ڰ� ����I�� ����Ͽ����ϴ�.");
								sendMessage(player, ChatColor.RED + "�����ڰ� ����I�� ����Ͽ����ϴ�.");
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(12);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE32();
					// ================================================================
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 200, true, false, false));
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, true, false, false));
					player.sendMessage(ChatColor.RED + "ž�� ���ַ� �����ڰ� ��ȭ�˴ϴ�.");
					sendMessage(player, ChatColor.RED + "ž�� ���ַ� �����ڰ� ��ȭ�˴ϴ�.");
					((Skeleton) mob).setTarget(player);
				}
			}
		}

	}

	public void mob22(Player player, Entity mob) {

	}

	public void mob23(Player player, Entity mob) {

	}

	public void mob24(Player player, Entity mob) {

	}

	public void mob25(Player player, Entity mob) {

	}

	public void mob26(Player player, Entity mob) {

	}

	public void mob27(Player player, Entity mob) {

	}

	public void mob28(Player player, Entity mob) {

	}

	public void mob29(Player player, Entity mob) {

	}

	public void mob30(Player player, Entity mob) {

	}

	public void mob31(Player player, Entity mob) {

	}

	public void mob32(Player player, Entity mob) {

	}

	public void mob33(Player player, Entity mob) {

	}

	public void mob34(Player player, Entity mob) {

	}

	public void mob35(Player player, Entity mob) {

	}

	public void sendMessage(Player player, String msg) {
		List<Entity> entitylist = player.getNearbyEntities(20, 10, 20);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				nearPlayer.sendMessage(msg);
			}
		}
	}
	
}