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
			SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(loc, EntityType.SPECTRAL_ARROW);
			sarrow.setGlowingTicks(0);
			sarrow.setVelocity(arrow.getVelocity());
			return;
		}
		if(arrow1(arrow, loc) && arrow2(arrow, loc)) {
			SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(loc, EntityType.SPECTRAL_ARROW);
			sarrow.setGlowingTicks(0);
			sarrow.setVelocity(arrow.getVelocity());
		}
		return;
	}

	public boolean arrow1(Arrow arrow, Location loc) {
		// 아란모어 -1789 200 931 -2964 30 443
		if (loc.getX() <= -1789 && loc.getY() <= 200
				&& loc.getZ() <= 931 && loc.getX() >= -2964
				&& loc.getY() >= 30 && loc.getZ() >= 443) {
			if(arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.BLUE_ICE));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}
	
	public boolean arrow2(Arrow arrow, Location loc) {
		// 미궁보스 49 61 654  16 51 696
		if (loc.getX() <= 49 && loc.getY() <= 61 && loc.getZ() <= 696 
				&& loc.getX() >= 16 && loc.getY() >= 51 && loc.getZ() >= 654) {
			if(arrow.getPassenger() != null) {
				arrow.removePassenger(arrow.getPassenger());
			}
			Item item = arrow.getWorld().dropItem(loc, new ItemStack(Material.END_CRYSTAL));
			item.setPickupDelay(10000000);
			arrow.addPassenger(item);
			return false;
		}
		return true;
	}

}
