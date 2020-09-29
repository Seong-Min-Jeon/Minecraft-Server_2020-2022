package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_16_R1.CraftServer;
import org.bukkit.craftbukkit.v1_16_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.google.common.graph.ElementOrder.Type;
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

public class Cmd14ItemLock implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			ItemStack item = player.getInventory().getItemInMainHand();
			if(cmd.getName().equalsIgnoreCase("ItemLock")) {
				try {
					if(item.hasItemMeta()) {
						ItemMeta im = item.getItemMeta();
						if(im.hasCustomModelData()) {
							if(im.getCustomModelData() == 0) {
								im.setCustomModelData(1);
								item.setItemMeta(im);
								player.sendMessage(ChatColor.GREEN + "Lock Complete!");
								return true;
							}
							if(im.getCustomModelData() == 1) {
								im.setCustomModelData(0);
								item.setItemMeta(im);
								player.sendMessage(ChatColor.GREEN + "Unlock Complete!");
								return true;
							}
						} else {
							im.setCustomModelData(1);
							item.setItemMeta(im);
							player.sendMessage(ChatColor.GREEN + "Lock Complete!");
							return true;
						}
					} else {
						player.sendMessage(ChatColor.RED + "Unlockable Item");
						return true;
					}
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "Undefined Error");
					return true;
				}
				return true;
			}
		}	
		return true;
	}


}
