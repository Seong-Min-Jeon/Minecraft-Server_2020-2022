package testPack;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
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

public class Cmd2ChangeAir implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
			
		int r;
		int num;
		Random rnd = new Random();
		Material mat = null;
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.isOp() == false) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("ChangeAir")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.RED + "���� /�е�/���� �� �Է��ؾ���;; ������ �𸣽ʴϱ�??");
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("help")) {
						player.sendMessage(ChatColor.GREEN + "���� /�е�/������ �Է��ϼ���(�е��� 5�� �ִ��Դϴ�.)");
						return true;
					}
					r = Integer.parseInt(args[0]);
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "�ƴ� �ι�°�� ������ �־���� �� �����");
					return true;
				}
				try { 				
					num = Integer.parseInt(args[1]);
					if(num>5) {
						player.sendMessage(ChatColor.RED + "5�̻��� ����� Ů�ϴ�");
						return true;
					}
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "�е��� ���������� ���Ҿ�;;");
					return true;
				}
				try { 
					String name = args[2].toUpperCase();
					if(name.equalsIgnoreCase("yumehama")) {
						player.sendMessage(ChatColor.DARK_BLUE + "�ȳ� ���� ��ȯ�Ϸ��� �Ŵ�?");
						player.sendMessage(ChatColor.DARK_BLUE + "���� ������ �ϳ� �ٲ�");
						player.sendMessage(ChatColor.DARK_BLUE + "��� �������̾�");
						return true;
					} else {						
						mat = Material.valueOf(name);
					}					
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "���ӿ� �ִ� �̸��� ���ֽ���(��: orange_stained_glass_pane)");
					return true;
				}
				try {
					Location loc = player.getLocation();
				    for(int x = (r * -1); x <= r; x++) {
				        for(int y = (r * -1); y <= r; y++) {
				            for(int z = (r * -1); z <= r; z++) {
				                Block b = loc.getWorld().getBlockAt(loc.getBlockX() + x, loc.getBlockY() + y, loc.getBlockZ() + z);		
				                int random = rnd.nextInt(100);
				                if(num>=random) {
				                	if(b.getType() == Material.AIR)
					                    b.setType(mat);
				                }
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
