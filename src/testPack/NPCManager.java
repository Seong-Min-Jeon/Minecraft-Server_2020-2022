package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.craftbukkit.v1_16_R3.CraftServer;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftLivingEntity;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.SkeletonHorse;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.datafixers.util.Pair;

import net.minecraft.server.v1_16_R3.EntityPlayer;
import net.minecraft.server.v1_16_R3.EntityPose;
import net.minecraft.server.v1_16_R3.EnumItemSlot;
import net.minecraft.server.v1_16_R3.MinecraftServer;
import net.minecraft.server.v1_16_R3.PacketPlayOutAnimation;
import net.minecraft.server.v1_16_R3.PacketPlayOutEntityDestroy;
import net.minecraft.server.v1_16_R3.PacketPlayOutEntityEquipment;
import net.minecraft.server.v1_16_R3.PacketPlayOutEntityHeadRotation;
import net.minecraft.server.v1_16_R3.PacketPlayOutMount;
import net.minecraft.server.v1_16_R3.PacketPlayOutNamedEntitySpawn;
import net.minecraft.server.v1_16_R3.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_16_R3.PlayerConnection;
import net.minecraft.server.v1_16_R3.PlayerInteractManager;
import net.minecraft.server.v1_16_R3.WorldServer;

public class NPCManager {

	MinecraftServer server = ((CraftServer) Bukkit.getServer()).getServer();
	WorldServer world = ((CraftWorld) Bukkit.getWorld("world")).getHandle();
	QuestBoard qb = new QuestBoard();
	
	public NPCManager(Player player) {
		questNPC(player);
	}
	
	public NPCManager(Player player, int num) {
		allTime(player);
	}
	
	public EntityPlayer npc1() {
		Location loc = new Location(Bukkit.getWorld("world"), -2503, 53, 531, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "의문의 소녀");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Shirayuki");
		if(name == null) {
			System.out.println("의문의 소녀 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc2() {
		Location loc = new Location(Bukkit.getWorld("world"), -2453, 84, 751, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "기사");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("0GoblinSlayer0");
		if(name == null) {
			System.out.println("기사 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc3() {
		Location loc = new Location(Bukkit.getWorld("world"), -2433, 28, 796, 180, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "의장");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("7Voo");
		if(name == null) {
			System.out.println("의장 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc4() {
		Location loc = new Location(Bukkit.getWorld("world"), 3728, 140, 3146, 270, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "의문의 소녀");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Shirayuki");
		if(name == null) {
			System.out.println("의문의 소녀 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc5() {
		Location loc = new Location(Bukkit.getWorld("world"), 3728, 140, 3146, 270, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "모험가");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("SkyQC");
		if(name == null) {
			System.out.println("모험가 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc6() {
		Location loc = new Location(Bukkit.getWorld("world"), -2246, 51, -2415, 90, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "데히트라");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("SkyQC");
		if(name == null) {
			System.out.println("데히트라 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc7() {
		Location loc = new Location(Bukkit.getWorld("world"), -2250, 51, -2415, 270, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "의문의 남성");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("SkyQC");
		if(name == null) {
			System.out.println("의문의 남성 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc8() {
		Location loc = new Location(Bukkit.getWorld("world"), 291, 55, 153, 90, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "빨간모자 소녀");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Blue__Apple_");
		if(name == null) {
			System.out.println("빨간모자 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc9() {
		Location loc = new Location(Bukkit.getWorld("world"), 973.5, 64, 42.5, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "에일을 구원한 영웅");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("why9196");
		if(name == null) {
			System.out.println("와이 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc10() {
		Location loc = new Location(Bukkit.getWorld("world"), 151.5, 71, 1902.5, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "구경꾼");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("JunletTridner");
		if(name == null) {
			System.out.println("준 확인 불가");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public void allTime(Player player) {
		try {
			EntityPlayer npc9 = npc9();
			addEquipPacket1(player, npc9, Material.NETHERITE_HELMET, Material.NETHERITE_CHESTPLATE, Material.NETHERITE_LEGGINGS
					, Material.NETHERITE_BOOTS, Material.JUNGLE_LOG, Material.AIR);
			EntityPlayer npc10 = npc10();
			addEquipPacket2(player, npc10, Material.GOLDEN_HELMET, Material.GOLDEN_CHESTPLATE, Material.GOLDEN_LEGGINGS
					, Material.GOLDEN_BOOTS, Material.SPRUCE_PLANKS, Material.AIR);
		} catch(Exception e) {
			
		}
	}
	
	public void questNPC(Player player) {
		try {
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희2===")) {
				addNPCPacket(player, npc1());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희3===")) {
				addNPCPacket(player, npc1());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희4===")) {
				addNPCPacket(player, npc2());
				removeNPCPacket(player, npc1());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희5===")) {
				addNPCPacket(player, npc2());
				addNPCPacket(player, npc3());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희6===")) {
				addNPCPacket(player, npc2());
				addNPCPacket(player, npc3());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희7===")) {
				addNPCPacket(player, npc2());
				addNPCPacket(player, npc3());
				addNPCPacket(player, npc4());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===카루 던전===")) {
				addNPCPacket(player, npc5());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 만남===")) {
				addNPCPacket(player, npc6());
				addNPCPacket(player, npc7());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===그대는 빨간모자===")) {
				addNPCPacket(player, npc8());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기1===")) {
				addNPCPacket(player, npc8());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===또다시 빨간모자===")) {
				addNPCPacket(player, npc8());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기2===")) {
				addNPCPacket(player, npc8());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===찾아온 불청객===")) {
				Location loc = player.getLocation().clone().add(1,0,0);
				loc.setYaw(90);
				loc.setPitch(0);
				
				GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "데히트라");
				EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
				npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
				String[] name = getSkin("SkyQC");
				if(name == null) {
					System.out.println("데히트라 확인 불가");
				} else {
					gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
				}
				
				addNPCPacket(player, npc);
				
				new BukkitRunnable() {
					@Override
					public void run() {
						removeNPCPacket(player, npc);
					}
				}.runTaskLater(Main.getPlugin(Main.class), 1250);
	 		}
		} catch(Exception e) {
			
		}
	}
	
	public void defineQuest(Player player, String str) {
		if(str.equals("설원의 가희 의문의 소녀")) {
			addNPCPacket(player, npc1());
		}
	}
	
	private String[] getSkin(String name) {
		try {
			URL url = new URL("https://api.mojang.com/users/profiles/minecraft/" + name);
			InputStreamReader reader = new InputStreamReader(url.openStream());
			String uuid = new JsonParser().parse(reader).getAsJsonObject().get("id").getAsString();
			
			URL url2 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid + "?unsigned=false");
			InputStreamReader reader2 = new InputStreamReader(url2.openStream());
			JsonObject property = new JsonParser().parse(reader2).getAsJsonObject().get("properties")
					.getAsJsonArray().get(0).getAsJsonObject();
			String texture = property.get("value").getAsString();
			String signature = property.get("signature").getAsString();
			return new String[] {texture, signature};
		} catch(Exception e) {
//			EntityPlayer p = ((CraftPlayer) player).getHandle();
//			GameProfile profile = p.getProfile();
//			Property property = profile.getProperties().get("texture").iterator().next();
//			String texture = property.getValue();
//			String signature = property.getSignature();
//			return new String[] {texture, signature};
			return null;
		}
		
	}
	
	public void addNPCPacket(Player player, EntityPlayer npc) {
		
		PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
		
		new BukkitRunnable() {
			@Override
			public void run() {
				connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
				connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
				connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 256 / 360)));
			}
		}.runTaskLater(Main.getPlugin(Main.class), 2);
		
		new BukkitRunnable() {
			@Override
			public void run() {
				connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
			}
		}.runTaskLater(Main.getPlugin(Main.class), 20);

		// connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
	}
	
	public void addEquipPacket1(Player player, EntityPlayer npc, Material head, Material chest, Material legs, Material feet, Material main, Material off) {
		PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
		
		new BukkitRunnable() {
			int time = 0;
			
			@Override
			public void run() {
				
				if(time % 5 == 0) {
					connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
					connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
					connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 256 / 360)));
				}
				
				if(time >= 80) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskLater(Main.getPlugin(Main.class), 2);
		
		new BukkitRunnable() {
			@Override
			public void run() {
				List<Pair<EnumItemSlot, net.minecraft.server.v1_16_R3.ItemStack>> equipmentList = new ArrayList<>();
				equipmentList.add(new Pair<>(EnumItemSlot.HEAD, CraftItemStack.asNMSCopy(new ItemStack(head))));
				equipmentList.add(new Pair<>(EnumItemSlot.CHEST, CraftItemStack.asNMSCopy(new ItemStack(chest))));
				equipmentList.add(new Pair<>(EnumItemSlot.LEGS, CraftItemStack.asNMSCopy(new ItemStack(legs))));
				equipmentList.add(new Pair<>(EnumItemSlot.FEET, CraftItemStack.asNMSCopy(new ItemStack(feet))));
				equipmentList.add(new Pair<>(EnumItemSlot.MAINHAND, CraftItemStack.asNMSCopy(new ItemStack(main))));
				equipmentList.add(new Pair<>(EnumItemSlot.OFFHAND, CraftItemStack.asNMSCopy(new ItemStack(off))));
				PacketPlayOutEntityEquipment entityEquipment = new PacketPlayOutEntityEquipment(npc.getId(), equipmentList);
				PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
				connection.sendPacket(entityEquipment);
			}
		}.runTaskLater(Main.getPlugin(Main.class), 90);
		
		new BukkitRunnable() {
			int time = 0;
			
			@Override
			public void run() {
				if(time % 10 == 0) {
					// main arm swing
					connection.sendPacket(new PacketPlayOutAnimation(npc, 0));
				} else if(time % 103 == 0) {
					// take damage
					connection.sendPacket(new PacketPlayOutAnimation(npc, 1));
				} else if(time % 127 == 0) {
					// leave bed
					connection.sendPacket(new PacketPlayOutAnimation(npc, 2));
				} else if(time % 159 == 0) {
					// off arm swing
					connection.sendPacket(new PacketPlayOutAnimation(npc, 3));
				} else if(time % 207 == 0) {
					// crit
					connection.sendPacket(new PacketPlayOutAnimation(npc, 4));
				} else if(time % 251 == 0) {
					// magic crit
					connection.sendPacket(new PacketPlayOutAnimation(npc, 5));
				}
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

		new BukkitRunnable() {
			@Override
			public void run() {
				connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
			}
		}.runTaskLater(Main.getPlugin(Main.class), 100);
	}
	
	public void addEquipPacket2(Player player, EntityPlayer npc, Material head, Material chest, Material legs, Material feet, Material main, Material off) {
		PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
		
		new BukkitRunnable() {
			int time = 0;
			
			@Override
			public void run() {
				
				if(time % 5 == 0) {
					connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
					connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
					connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 256 / 360)));
				}
				
				if(time >= 80) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskLater(Main.getPlugin(Main.class), 2);
		
		new BukkitRunnable() {
			@Override
			public void run() {
				List<Pair<EnumItemSlot, net.minecraft.server.v1_16_R3.ItemStack>> equipmentList = new ArrayList<>();
				equipmentList.add(new Pair<>(EnumItemSlot.HEAD, CraftItemStack.asNMSCopy(new ItemStack(head))));
				equipmentList.add(new Pair<>(EnumItemSlot.CHEST, CraftItemStack.asNMSCopy(new ItemStack(chest))));
				equipmentList.add(new Pair<>(EnumItemSlot.LEGS, CraftItemStack.asNMSCopy(new ItemStack(legs))));
				equipmentList.add(new Pair<>(EnumItemSlot.FEET, CraftItemStack.asNMSCopy(new ItemStack(feet))));
				equipmentList.add(new Pair<>(EnumItemSlot.MAINHAND, CraftItemStack.asNMSCopy(new ItemStack(main))));
				equipmentList.add(new Pair<>(EnumItemSlot.OFFHAND, CraftItemStack.asNMSCopy(new ItemStack(off))));
				PacketPlayOutEntityEquipment entityEquipment = new PacketPlayOutEntityEquipment(npc.getId(), equipmentList);
				PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
				connection.sendPacket(entityEquipment);
			}
		}.runTaskLater(Main.getPlugin(Main.class), 90);
		
		new BukkitRunnable() {
			@Override
			public void run() {
				connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
			}
		}.runTaskLater(Main.getPlugin(Main.class), 100);
	}
	
	public void removeNPCPacket(Player player, EntityPlayer npc) {
		PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
		connection.sendPacket(new PacketPlayOutEntityDestroy(npc.getId()));
	}
	
}
