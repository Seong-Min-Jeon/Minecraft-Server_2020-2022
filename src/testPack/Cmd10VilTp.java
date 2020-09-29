package testPack;

import java.util.List;
import java.util.Random;

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
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Cmd10VilTp implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		World world = null;
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			world = player.getWorld();
			
			Location tuto = new Location(world,3700,100,3700);
			Location wargunil = new Location(world,-1844,70,3012);
			Location forgan = new Location(world,-1573,53,2458);
			Location tiru = new Location(world, -672, 46, 1942);
			Location seedMine = new Location(world,-1159,42,1729);
			Location miyu = new Location(world,-1143,181,1461);
			Location kaiman = new Location(world,-478,55,1302);
			Location hiosu = new Location(world,-1370,51,976);
			Location konno = new Location(world,-2465,52,543);
			Location fuhidmeh = new Location(world,-429,98,721); //�������� �ػ깰
			Location sitasaidi = new Location(world,-1132,55,656); //���� �޹���
			Location karce = new Location(world,-199,67,541); //���Ͼ� circle
			Location kuredratt = new Location(world,-61,56,80); //���Ͼ� �׸�
			Location beiag = new Location(world,141,87,-329); //���Ͼ� ��
			Location magicTower = new Location(world,221,81,725,90,0); 
			
			if(player.isOp() == false) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("VilTp")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.WHITE + "1: ���״�/2: ������/3: Ƽ��/4: �õ層��/5: ��ǣ����/6: ī�̸�/7: ����/"
							+ "8: �ܳ�/9: ���� �� ����/10: ��Ÿ���̵�/11: Į��/12: ũ�����Ʈ/13: ���Ʊ�/14: ����ž");
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("0")) {
						player.teleport(tuto);
					}
					if(args[0].equalsIgnoreCase("1")) {
						player.teleport(wargunil);
					}
					if(args[0].equalsIgnoreCase("2")) {
						player.teleport(forgan);
					}
					if(args[0].equalsIgnoreCase("3")) {
						player.teleport(tiru);
					}
					if(args[0].equalsIgnoreCase("4")) {
						player.teleport(seedMine);
					}
					if(args[0].equalsIgnoreCase("5")) {
						player.teleport(miyu);
					}
					if(args[0].equalsIgnoreCase("6")) {
						player.teleport(kaiman);
					}
					if(args[0].equalsIgnoreCase("7")) {
						player.teleport(hiosu);
					}
					if(args[0].equalsIgnoreCase("8")) {
						player.teleport(konno);
					}
					if(args[0].equalsIgnoreCase("9")) {
						player.teleport(fuhidmeh);
					}
					if(args[0].equalsIgnoreCase("10")) {
						player.teleport(sitasaidi);
					}
					if(args[0].equalsIgnoreCase("11")) {
						player.teleport(karce);
					}
					if(args[0].equalsIgnoreCase("12")) {
						player.teleport(kuredratt);
					}
					if(args[0].equalsIgnoreCase("13")) {
						player.teleport(beiag);
					}
					if(args[0].equalsIgnoreCase("14")) {
						player.teleport(magicTower);
					}
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "�߸��� �Է��Դϴٸ�?");
					return true;
				}
			}
		}	
		return true;
	}

}
