package testPack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

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
 		if(Math.abs(time-timeArg) <= 3000 && Math.abs(time-timeArg) > 30) {
 			bowPlayerPlaySound(player, key);
 			swordPlayerPlaySound(player, key);
 			timer.remove(player);
 			timer.put(player, time);
 			String newKey = makeKey(player, key); 
 			push(player, newKey); 			
 		} else if(Math.abs(time-timeArg) < 500){
 			
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
 			if(inv.contains(Material.CLAY_BALL) || inv.contains(Material.GLOWSTONE_DUST) || inv.contains(Material.INK_SAC)) {
 				if(!key.equalsIgnoreCase("R")) {
 					cmd.put(player, key); 		
 					sendPacket(player, key);									
 	 			}
 			}
 			if(inv.contains(Material.BLUE_DYE) || inv.contains(Material.BLACK_DYE) || inv.contains(Material.RED_DYE) || inv.contains(Material.GREEN_DYE)
 					 || inv.contains(Material.LAPIS_LAZULI) || inv.contains(Material.CYAN_DYE) || inv.contains(Material.LIGHT_GRAY_DYE) || inv.contains(Material.GRAY_DYE)
 					 || inv.contains(Material.PINK_DYE) || inv.contains(Material.LIME_DYE) || inv.contains(Material.YELLOW_DYE) || inv.contains(Material.LIGHT_BLUE_DYE)
 					 || inv.contains(Material.MAGENTA_DYE) || inv.contains(Material.ORANGE_DYE) || inv.contains(Material.BROWN_DYE)) {
 				if(!key.equalsIgnoreCase("L")) {
 					cmd.put(player, key); 		
 					sendPacket(player, key);									
 	 			}
 			}
 		}
	}
	
	public void sendPacket(Player player, String key) {
		try {
			String message = null;
			if (key.length() == 1) {
				message = "§a" + key + "§7 - _ - _";
			} else if (key.length() == 2) {
				char key1 = key.charAt(0);
				char key2 = key.charAt(1);
				message = "§a" + key1 + "§7 - " + "§a" + key2 + "§7 - _";
			} else if (key.length() == 3) {
				char key1 = key.charAt(0);
				char key2 = key.charAt(1);
				char key3 = key.charAt(2);
				message = "§a" + key1 + "§7 - " + "§a" + key2 + "§7 - " + "§a" + key3;
			}
			TextComponent tc = new TextComponent(message);
			player.spigot().sendMessage(ChatMessageType.ACTION_BAR, tc);
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
		player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.3f, 1.0f);
	}
	
	public void bowPlayerPlaySound(Player player, String key) {
		if(player.getInventory().contains(Material.CLAY_BALL) || player.getInventory().contains(Material.GLOWSTONE_DUST) || player.getInventory().contains(Material.INK_SAC)) {
 			if(key.equals("R")) {
 				if(cmd.get(player) == null) {
 					return;
 				}
 			}
 			playSound(player);
 		} 
	}
	
	public void swordPlayerPlaySound(Player player, String key) {
		if(player.getInventory().contains(Material.BLUE_DYE) || player.getInventory().contains(Material.BLACK_DYE) || player.getInventory().contains(Material.RED_DYE) 
				 || player.getInventory().contains(Material.GREEN_DYE) || player.getInventory().contains(Material.LAPIS_LAZULI) || player.getInventory().contains(Material.CYAN_DYE) 
				 || player.getInventory().contains(Material.LIGHT_GRAY_DYE) || player.getInventory().contains(Material.GRAY_DYE) || player.getInventory().contains(Material.PINK_DYE) 
				 || player.getInventory().contains(Material.LIME_DYE) || player.getInventory().contains(Material.YELLOW_DYE) || player.getInventory().contains(Material.LIGHT_BLUE_DYE)
				 || player.getInventory().contains(Material.MAGENTA_DYE) || player.getInventory().contains(Material.ORANGE_DYE) || player.getInventory().contains(Material.BROWN_DYE)) {
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
