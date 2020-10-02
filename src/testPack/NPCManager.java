package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R1.CraftServer;
import org.bukkit.craftbukkit.v1_16_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.SkeletonHorse;
import org.bukkit.scheduler.BukkitRunnable;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import net.minecraft.server.v1_16_R1.EntityPlayer;
import net.minecraft.server.v1_16_R1.MinecraftServer;
import net.minecraft.server.v1_16_R1.PacketPlayOutEntityDestroy;
import net.minecraft.server.v1_16_R1.PacketPlayOutEntityHeadRotation;
import net.minecraft.server.v1_16_R1.PacketPlayOutNamedEntitySpawn;
import net.minecraft.server.v1_16_R1.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_16_R1.PlayerConnection;
import net.minecraft.server.v1_16_R1.PlayerInteractManager;
import net.minecraft.server.v1_16_R1.WorldServer;

public class NPCManager {

	MinecraftServer server = ((CraftServer) Bukkit.getServer()).getServer();
	WorldServer world = ((CraftWorld) Bukkit.getWorld("world")).getHandle();
	QuestBoard qb = new QuestBoard();
	
	public NPCManager(Player player) {
		questNPC(player);
	}
	
	public EntityPlayer npc1() {
		Location loc = new Location(Bukkit.getWorld("world"), -2503, 53, 531, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "�ǹ��� �ҳ�");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Shirayuki");
		if(name == null) {
			System.out.println("�ǹ��� �ҳ� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc2() {
		Location loc = new Location(Bukkit.getWorld("world"), -2453, 84, 751, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "���");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Goblin_Slayer_");
		if(name == null) {
			System.out.println("��� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc3() {
		Location loc = new Location(Bukkit.getWorld("world"), -2433, 28, 796, 180, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("7Voo");
		if(name == null) {
			System.out.println("���� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc4() {
		Location loc = new Location(Bukkit.getWorld("world"), -3728, 140, 3146, 270, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "�ǹ��� �ҳ�");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Shirayuki");
		if(name == null) {
			System.out.println("�ǹ��� �ҳ� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc5() {
		Location loc = new Location(Bukkit.getWorld("world"), 3728, 140, 3146, 270, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "���谡");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("SkyQC");
		if(name == null) {
			System.out.println("���谡 Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc6() {
		Location loc = new Location(Bukkit.getWorld("world"), -2246, 51, -2415, 90, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "����Ʈ��");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("SkyQC");
		if(name == null) {
			System.out.println("����Ʈ�� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc7() {
		Location loc = new Location(Bukkit.getWorld("world"), -2250, 51, -2415, 270, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "�ǹ��� ����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("SkyQC");
		if(name == null) {
			System.out.println("�ǹ��� ���� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc8() {
		Location loc = new Location(Bukkit.getWorld("world"), 291, 55, 153, 90, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "�������� �ҳ�");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Blue__Apple_");
		if(name == null) {
			System.out.println("�������� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public void questNPC(Player player) {
		try {
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����2===")) {
				addNPCPacket(player, npc1());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����3===")) {
				addNPCPacket(player, npc1());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����4===")) {
				addNPCPacket(player, npc2());
				removeNPCPacket(player, npc1());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����5===")) {
				addNPCPacket(player, npc2());
				addNPCPacket(player, npc3());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����6===")) {
				addNPCPacket(player, npc2());
				addNPCPacket(player, npc3());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===������ ����7===")) {
				addNPCPacket(player, npc2());
				addNPCPacket(player, npc3());
				addNPCPacket(player, npc4());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===ī�� ����===")) {
				addNPCPacket(player, npc5());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===���ο� ����===")) {
				addNPCPacket(player, npc6());
				addNPCPacket(player, npc7());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�״�� ��������===")) {
				addNPCPacket(player, npc8());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� �̾߱�1===")) {
				addNPCPacket(player, npc8());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�Ǵٽ� ��������===")) {
				addNPCPacket(player, npc8());
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===�������� �̾߱�2===")) {
				addNPCPacket(player, npc8());
	 		}
		} catch(Exception e) {
			
		}
	}
	
	public void defineQuest(Player player, String str) {
		if(str.equals("������ ���� �ǹ��� �ҳ�")) {
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
		connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
		connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
		connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 256 / 360)));

		new BukkitRunnable() {
			@Override
			public void run() {
				connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
			}
		}.runTaskLater(Main.getPlugin(Main.class), 10);

		// connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
	}
	
	public void removeNPCPacket(Player player, EntityPlayer npc) {
		PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
		connection.sendPacket(new PacketPlayOutEntityDestroy(npc.getId()));
	}
	
}
