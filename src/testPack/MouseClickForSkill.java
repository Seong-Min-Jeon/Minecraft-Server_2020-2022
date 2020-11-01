package testPack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import net.minecraft.server.v1_16_R1.PacketPlayOutTitle;
import net.minecraft.server.v1_16_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_16_R1.PacketPlayOutTitle.EnumTitleAction;

public class MouseClickForSkill {

	private static Map<Player, String> cmd = new HashMap<>();
	private static Map<Player, Integer> timer = new HashMap<>();
	Player player;
	
	public void click(Player playerArg, String key) {
		player = playerArg;
		bowPlayerPlaySound(player, key);
		swordPlayerPlaySound(player, key);
		long dayTime = System.currentTimeMillis(); 
 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
 		String strTime = hms.format(new Date(dayTime));
 		Integer time = Integer.parseInt(strTime);
 		timer.put(player, time);
 		String newKey = makeKey(player, key); 	
 		push(player, newKey); 			
	}
	
	public void click(Player playerArg, String key, Integer timeArg) {
		player = playerArg;
		long dayTime = System.currentTimeMillis(); 
 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
 		String strTime = hms.format(new Date(dayTime));
 		Integer time = Integer.parseInt(strTime);
 		if(time-timeArg <= 3000 && time-timeArg > 30) {
 			bowPlayerPlaySound(player, key);
 			swordPlayerPlaySound(player, key);
 			timer.remove(player);
 			timer.put(player, time);
 			String newKey = makeKey(player, key); 
 			push(player, newKey); 			
 		} else if(time-timeArg < 500){
 			
 		} else {
 			bowPlayerPlaySound(player, key);
 			swordPlayerPlaySound(player, key);
 			timer.remove(player);
 			cmd.remove(player);
 			timer.put(player, time);
 			String newKey = makeKey(player, key);
 			push(player, newKey);
 		}
	}
	
	public void push(Player player, String key) {
		if(key==null) {
 			cmd.remove(player);
 			timer.remove(player);
 		} else if(key.length() == 3) {
 			cmd.remove(player);
 			timer.remove(player);
 			sendPacket(player, key);
 			Skill s = new Skill();
 			s.effect(player, key);
 		} else {
 			Inventory inv = player.getInventory();
 			if(inv.contains(Material.CLAY_BALL) || inv.contains(Material.GLOWSTONE_DUST)) {
 				if(!key.equalsIgnoreCase("R")) {
 					cmd.put(player, key); 		
 					sendPacket(player, key);									
 	 			}
 			}
 			if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BLACK_DYE)) {
 				if(!key.equalsIgnoreCase("L")) {
 					cmd.put(player, key); 		
 					sendPacket(player, key);									
 	 			}
 			}
 		}
	}
	
	public void sendPacket(Player player, String key) {
		try {
			PacketPlayOutTitle title = new PacketPlayOutTitle(EnumTitleAction.TITLE, ChatSerializer.a("{\"text\":\" \"}"));
			Object handle = player.getClass().getMethod("getHandle").invoke(player);
			Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
			playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, title);
			if(key.length() == 1) {
				String st = key + "§7 - _ - _";
				PacketPlayOutTitle subtitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, ChatSerializer.a("{\"text\":\"§2" + st + "\"}"));
				playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, subtitle);
			} else if(key.length() == 2) {
				char key1 = key.charAt(0);
				char key2 = key.charAt(1);
				String st = key1 + "§7 - " + "§2" + key2 + "§7 - _";
				PacketPlayOutTitle subtitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, ChatSerializer.a("{\"text\":\"§2" + st + "\"}"));
				playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, subtitle);
			} else if(key.length() == 3) {
				char key1 = key.charAt(0);
				char key2 = key.charAt(1);
				char key3 = key.charAt(2);
				String st = key1 + "§7 - " + "§2" + key2 + "§7 - " + "§2" + key3;
				PacketPlayOutTitle subtitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, ChatSerializer.a("{\"text\":\"§2" + st + "\"}"));
				playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, subtitle);
			}
			
		} catch (Exception e) {

		}
	}
	
	public String makeKey(Player player, String key) {
		String newKey = null;
		if(cmd.containsKey(player)) {
			newKey = cmd.get(player).concat(key);			
		} else {
			newKey = key;
		}
		return newKey;
	}
	
	public Integer getTime(Player player) {
		this.player = player;
		Integer time;
		if(timer.containsKey(player)) {
			time = timer.get(player);
		} else {
			time = 0;
		}		
 		return time;
	}
	
	public void playSound(Player player) {
		player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
	}
	
	public void bowPlayerPlaySound(Player player, String key) {
		if(player.getInventory().contains(Material.CLAY_BALL) || player.getInventory().contains(Material.GLOWSTONE_DUST)) {
 			if(key.equals("R")) {
 				if(cmd.get(player) == null) {
 					return;
 				}
 			}
 			playSound(player);
 		} 
	}
	
	public void swordPlayerPlaySound(Player player, String key) {
		if(player.getInventory().contains(Material.BLUE_DYE) || player.getInventory().contains(Material.BLACK_DYE)) {
 			if(key.equals("L")) {
 				if(cmd.get(player) == null) {
 					return;
 				}
 			}
 			playSound(player);
 		} 
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
