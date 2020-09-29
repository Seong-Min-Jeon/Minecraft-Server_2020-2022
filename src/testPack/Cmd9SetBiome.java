package testPack;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Cmd9SetBiome implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
			
		int r;
		int num;
		Random rnd = new Random();
		Biome bio = null;
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.isOp() == false) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("setBiome")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.RED + "���� /�е�/from����/to���� �� �Է��ؾ���;; ������ �𸣽ʴϱ�??");
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("help")) {
						player.sendMessage(ChatColor.GREEN + "���� /�е�/from����/to������ �Է��ϼ���(�е� 100�� �����Ͻø� ������ �ش��ϴ� ������ ȿ���� ����˴ϴ�.)");
						return true;
					}
					r = Integer.parseInt(args[0]);
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "�ƴ� �ι�°�� ������ �־���� �� �����");
					return true;
				}
				try { 
					String name = args[1].toUpperCase();
					if(name.equalsIgnoreCase("yumehama")) {
						player.sendMessage(ChatColor.AQUA + "�ȳ� ���� ��ȯ�Ϸ��� �Ŵ�?");
						player.sendMessage(ChatColor.AQUA + "���� ������ �ϳ� �ٲ�");
						player.sendMessage(ChatColor.AQUA + "��� �������̾�");
						return true;
					} else {						
						bio = Biome.valueOf(name);
					}					
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "from���� ����: ���ӿ� �ִ� �̸��� ���ֽ���(��: orange_stained_glass_pane)");
					return true;
				}
				try {
					Location loc = player.getLocation();
				    for(int x = (r * -1); x <= r; x++) {
				        for(int y = (r * -1); y <= r; y++) {
				            for(int z = (r * -1); z <= r; z++) {				                
				                loc.getWorld().setBiome(loc.getBlockX() + x, loc.getBlockY() + y, loc.getBlockZ() + z, bio);	
				            }
				        }
				    }
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "�� �� ���� ����");
					return true;
				}
			}
		}	
		return true;
	}

}
