package testPack;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.v1_16_R1.CraftWorld;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.minecraft.server.v1_16_R1.WorldServer;

public class MoveEvent {
	
	Location loc;

	public MoveEvent(Player player) {
		loc = player.getLocation();
		
		move1(player);
		move2(player);
	}
	
	public void move1(Player player) {
		// πÃ±√ ¥¯¿¸
		if(loc.getX() <= 51 && loc.getY() <= 54 && loc.getZ() <= 677 &&
				loc.getX() >= 49 && loc.getY() >= 52 && loc.getZ() >= 675) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,40,1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,40,1,true,false,false));
			player.teleport(new Location(player.getWorld(), 48, 53, 676, 90, 0));
			player.getWorld().playSound(player.getLocation(), Sound.AMBIENT_CAVE, 3.0f, 1.0f);
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "∏‘¿’∞®¿Ã ¡¶πﬂ∑Œ ø‘±∫.");
			
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 49 61 654  16 51 696 
					if (loc2.getX() <= 49 && loc2.getY() <= 61 && loc2.getZ() <= 696 && 
							loc2.getX() >= 16 && loc2.getY() >= 51 && loc2.getZ() >= 654) {
						num++;
						new BossHealth().getBar1().addPlayer(player);
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 49 61 654  16 51 696
						if (loc2.getX() <= 49 && loc2.getY() <= 61 && loc2.getZ() <= 696 && 
								loc2.getX() >= 16 && loc2.getY() >= 51 && loc2.getZ() >= 654) {
							nearEntity.remove();
						}
					}
				}
			}

			CustomSkeleton2 cs = new CustomSkeleton2(new Location(player.getWorld(), 25, 54, 675));
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);

			new BossHealth().getBar2().setProgress(1.0);
			new BossHealth().getBar2().addPlayer(player);
			
		}
	}
	
	public void move2(Player player) {
		// 27 61 697  29 65 698
		if(loc.getX() <= 29 && loc.getY() <= 65 && loc.getZ() <= 698 &&
				loc.getX() >= 27 && loc.getY() >= 61 && loc.getZ() >= 697) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,40,1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,40,1,true,false,false));
			player.teleport(new Location(player.getWorld(), 221, 81, 725, 90, 0));
			player.getWorld().playSound(player.getLocation(), Sound.AMBIENT_CAVE, 3.0f, 1.0f);
		}
	}
	
}
