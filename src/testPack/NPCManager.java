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

import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.NPCLib;
import dev.sergiferry.playernpc.api.NPCSlot;
import dev.sergiferry.playernpc.api.NPC.FollowLookType;

public class NPCManager {

	QuestBoard qb = new QuestBoard();
	
	public NPCManager(Player player) {
		questNPC(player);
	}
	
	public NPCManager(Player player, int num) {
		allTime(player);
	}
	
	public NPC npc1(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), -2503, 53, 531, 0, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "의문의 소녀", loc);
		String[] name = getSkin("_Shirayuki");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc2(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), -2453, 84, 751, 0, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "기사", loc);
		String[] name = getSkin("0GoblinSlayer0");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc3(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), -2433, 28, 796, 180, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "의장", loc);
		String[] name = getSkin("7Voo");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc4(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 3728, 140, 3146, 270, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "의문의 소녀", loc);
		String[] name = getSkin("_Shirayuki");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc5(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 3728, 140, 3146, 270, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "모험가", loc);
		String[] name = getSkin("SkyQC");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc6(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), -2246, 51, -2415, 90, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "데히트라", loc);
		String[] name = getSkin("SkyQC");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc7(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), -2250, 51, -2415, 270, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "의문의 남성", loc);
		String[] name = getSkin("SkyQC");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc8(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 291, 55, 153, 90, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "빨간모자 소녀", loc);
		String[] name = getSkin("_Blue__Apple_");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc9(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 973.5, 64, 42.5, 0, 0);
		NPC npc = NPCLib.getInstance().generateNPC(player, "why", loc);
		String[] name = getSkin("why9196");
		npc.setText("에일을 구한 영웅");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(NPCSlot.HELMET, new ItemStack(Material.NETHERITE_HELMET));
		npc.setItem(NPCSlot.CHESTPLATE, new ItemStack(Material.NETHERITE_CHESTPLATE));
		npc.setItem(NPCSlot.LEGGINGS, new ItemStack(Material.NETHERITE_LEGGINGS));
		npc.setItem(NPCSlot.BOOTS, new ItemStack(Material.NETHERITE_BOOTS));
		npc.setItem(NPCSlot.MAINHAND, new ItemStack(Material.JUNGLE_LOG));
		System.out.println(7);
		npc.create();
		System.out.println(8);
		npc.show();
		System.out.println(9);
		npc.update();
		System.out.println(10);
		
		return npc;
	}
	
	public NPC npc10(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 151.5, 71, 1902.5, 0, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "구경꾼", loc);
		String[] name = getSkin("JunletTridner");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(NPCSlot.HELMET, new ItemStack(Material.GOLDEN_HELMET));
		npc.setItem(NPCSlot.CHESTPLATE, new ItemStack(Material.GOLDEN_CHESTPLATE));
		npc.setItem(NPCSlot.LEGGINGS, new ItemStack(Material.GOLDEN_LEGGINGS));
		npc.setItem(NPCSlot.BOOTS, new ItemStack(Material.GOLDEN_BOOTS));
		npc.setItem(NPCSlot.MAINHAND, new ItemStack(Material.SPRUCE_PLANKS));
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc11(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 150.5, 71, 1902.5, 0, 0);
		
		NPC npc = NPCLib.getInstance().generateNPC(player, "구경꾼", loc);
		String[] name = getSkin("SARASHINA_RUKA");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(NPCSlot.HELMET, new ItemStack(Material.SKELETON_SKULL));
		npc.setItem(NPCSlot.CHESTPLATE, new ItemStack(Material.GOLDEN_CHESTPLATE));
		npc.setItem(NPCSlot.LEGGINGS, new ItemStack(Material.GOLDEN_LEGGINGS));
		npc.setItem(NPCSlot.BOOTS, new ItemStack(Material.GOLDEN_BOOTS));
		npc.setItem(NPCSlot.MAINHAND, new ItemStack(Material.GOLDEN_HOE));
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc12(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 149.5, 71, 1902.5, 0, 0);

		NPC npc = NPCLib.getInstance().generateNPC(player, "구경꾼", loc);
		String[] name = getSkin("Cute_Camel");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(NPCSlot.HELMET, new ItemStack(Material.SKELETON_SKULL));
		npc.setItem(NPCSlot.CHESTPLATE, new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		npc.setItem(NPCSlot.LEGGINGS, new ItemStack(Material.CHAINMAIL_LEGGINGS));
		npc.setItem(NPCSlot.BOOTS, new ItemStack(Material.CHAINMAIL_BOOTS));
		npc.setItem(NPCSlot.MAINHAND, new ItemStack(Material.IRON_HOE));
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public NPC npc13(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 155.5, 71, 1904.5, 0, 0);

		NPC npc = NPCLib.getInstance().generateNPC(player, "구경꾼", loc);
		String[] name = getSkin("Joojak");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setFollowLookType(FollowLookType.PLAYER);
		npc.setShowOnTabList(false);
		npc.create();
		npc.show();
		
		return npc;
	}
	
	public void allTime(Player player) {
		try {
			npc9(player);
			npc10(player);
			npc11(player);
			npc12(player);
			npc13(player);
		} catch(Exception e) {
			
		}
	}
	
	public void questNPC(Player player) {
		try {
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희2===")) {
				npc1(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희3===")) {
				npc1(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희4===")) {
				npc2(player);
				npc1(player).destroy();
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희5===")) {
				npc2(player);
				npc3(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희6===")) {
				npc2(player);
				npc3(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희7===")) {
				npc2(player);
				npc3(player);
				npc4(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===카루 던전===")) {
				npc5(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 만남===")) {
				npc6(player);
				npc7(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===그대는 빨간모자===")) {
				npc8(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기1===")) {
				npc8(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===또다시 빨간모자===")) {
				npc8(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기2===")) {
				npc8(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===찾아온 불청객===")) {
				Location loc = player.getLocation().clone().add(1,0,0);
				loc.setYaw(90);
				loc.setPitch(0);
				
				NPC npc = NPCLib.getInstance().generateNPC(player, "데히트라", loc);
				String[] name = getSkin("SkyQC");
				npc.setSkin(name[0], name[1]);
				npc.setCollidable(false);
				npc.setFollowLookType(FollowLookType.PLAYER);
				npc.setShowOnTabList(false);
				npc.create();
				npc.show();
				
				new BukkitRunnable() {
					@Override
					public void run() {
						npc.destroy();
					}
				}.runTaskLater(Main.getPlugin(Main.class), 1250);
	 		}
		} catch(Exception e) {
			
		}
	}
	
	public void defineQuest(Player player, String str) {
		if(str.equals("설원의 가희 의문의 소녀")) {
			npc1(player);
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
	
}
