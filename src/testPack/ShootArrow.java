package testPack;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.v1_16_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftArrow;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Husk;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Player;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import net.minecraft.server.v1_16_R1.EntityArrow;
import net.minecraft.server.v1_16_R1.EntityPose;
import net.minecraft.server.v1_16_R1.EntitySize;
import net.minecraft.server.v1_16_R1.PacketPlayOutEntityDestroy;
import net.minecraft.server.v1_16_R1.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_16_R1.PlayerConnection;
import net.minecraft.server.v1_16_R1.WorldServer;

public class ShootArrow {

	Random rnd = new Random();

	public ShootArrow(Entity ent) {
		Arrow arrow = (Arrow) ent;
		Location loc = arrow.getLocation();
		if(arrow.getShooter() instanceof Player) {
			return;
		}
		Entity mob = (Entity) arrow.getShooter();
		if(arrow1(arrow, mob, loc) && arrow2(arrow, mob, loc) && arrow3(arrow, mob, loc) && arrow4(arrow, mob, loc)) {
			SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(loc, EntityType.SPECTRAL_ARROW);
			sarrow.setVelocity(arrow.getVelocity());
		}
		return;
	}

	public boolean arrow1(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("설원 정찰자" + ChatColor.YELLOW + " [Lv.224]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.BLUE_ICE));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow2(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("코낭그" + ChatColor.YELLOW + " [Lv.??]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.END_CRYSTAL));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow3(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("초마도용기사" + ChatColor.YELLOW + " [Lv.342]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.ENDER_PEARL));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow4(Arrow arrow, Entity mob, Location loc) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("떠도는 망령 마법사" + ChatColor.YELLOW + " [Lv.349]")) {
			if (arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.MAGMA_CREAM));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}

}
