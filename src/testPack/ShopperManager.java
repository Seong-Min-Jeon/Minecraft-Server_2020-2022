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

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import net.minecraft.server.v1_16_R1.EntityPlayer;
import net.minecraft.server.v1_16_R1.MinecraftServer;
import net.minecraft.server.v1_16_R1.PacketPlayOutEntityHeadRotation;
import net.minecraft.server.v1_16_R1.PacketPlayOutNamedEntitySpawn;
import net.minecraft.server.v1_16_R1.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_16_R1.PlayerConnection;
import net.minecraft.server.v1_16_R1.PlayerInteractManager;
import net.minecraft.server.v1_16_R1.WorldServer;

public class ShopperManager {

	MinecraftServer server = ((CraftServer) Bukkit.getServer()).getServer();
	WorldServer world = ((CraftWorld) Bukkit.getWorld("world")).getHandle();
	QuestBoard qb = new QuestBoard();
	
	public ShopperManager(Player player) {
		addNPCPacket(player, npc1_1());
		addNPCPacket(player, npc2_1());
		addNPCPacket(player, npc3_1());
		addNPCPacket(player, npc4_1());
		addNPCPacket(player, npc5_1());
		addNPCPacket(player, npc6_1());
		addNPCPacket(player, npc7_1());
		addNPCPacket(player, npc7_2());
		addNPCPacket(player, npc8_1());
		addNPCPacket(player, npc8_2());
		addNPCPacket(player, npc9_1());
		addNPCPacket(player, npc10_1());
		addNPCPacket(player, npc11_1());
		addNPCPacket(player, npc11_2());
	}
	
	// ����
	public EntityPlayer npc1_1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1822, 70, 3019, 90, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "�����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("0r4c1e");
		if(name == null) {
			System.out.println("����� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	// ���
	public EntityPlayer npc2_1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1856, 70, 3027, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "���");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("00T_");
		if(name == null) {
			System.out.println("��� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	// �缭
	public EntityPlayer npc3_1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1827, 70, 3007, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "�缭");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("Gretukas");
		if(name == null) {
			System.out.println("�缭 Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	// ���ھ���
	public EntityPlayer npc4_1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1839, 76, 3053, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "���ھ���");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("0j7");
		if(name == null) {
			System.out.println("���ھ��� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	// ��ũ�� ����
	public EntityPlayer npc5_1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1836, 70, 3002, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "��ũ�� ����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Image");
		if(name == null) {
			System.out.println("��ũ�� ���� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	// Ư�� ���� 1
	public EntityPlayer npc6_1() {
		Location loc = new Location(Bukkit.getWorld("world"), 3693, 44, 3713, 0, 0);
		
		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("ButtonPlayZ");
		if(name == null) {
			System.out.println("Ư�� ����1 Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}

	// Ư�� ���� 2
	public EntityPlayer npc7_1() {
		Location loc = new Location(Bukkit.getWorld("world"), 3742, 41, 3702, 0, 0);

		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("__ZFox__");
		if (name == null) {
			System.out.println("Ư�� ����2 Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc7_2() {
		Location loc = new Location(Bukkit.getWorld("world"), 3750, 41, 3684, 0, 0);

		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("__ZFox__");
		if (name == null) {
			System.out.println("Ư�� ����2 Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}

	// ��������
	public EntityPlayer npc8_1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1844, 70, 3007, 0, 0);

		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "��������");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Frenk");
		if (name == null) {
			System.out.println("�������� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc8_2() {
		Location loc = new Location(Bukkit.getWorld("world"), -1847, 70, 3006, 0, 0);

		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "��������");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("_Frenk");
		if (name == null) {
			System.out.println("�������� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}

	// ���� ����
	public EntityPlayer npc9_1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1856, 70, 3021, 0, 0);

		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "���� ����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("Xemna");
		if (name == null) {
			System.out.println("���� ���� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	// ����
	public EntityPlayer npc10_1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1897, 53, 3075, 0, 0);

		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("iPadZombie1");
		if (name == null) {
			System.out.println("���� Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	// Ư�� ���� 3
	public EntityPlayer npc11_1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1935, 52, 3010, 0, 0);

		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("TrashPc");
		if (name == null) {
			System.out.println("Ư�� ����3 Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	public EntityPlayer npc11_2() {
		Location loc = new Location(Bukkit.getWorld("world"), -1884, 51, 2712, 0, 0);

		GameProfile gameProfile = new GameProfile(UUID.randomUUID(), "����");
		EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
		npc.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
		String[] name = getSkin("TrashPc");
		if (name == null) {
			System.out.println("Ư�� ����3 Ȯ�� �Ұ�");
		} else {
			gameProfile.getProperties().put("textures", new Property("textures", name[0], name[1]));
		}
		return npc;
	}
	
	
	// �޼ҵ�
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

		// connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));

	}
	
}
