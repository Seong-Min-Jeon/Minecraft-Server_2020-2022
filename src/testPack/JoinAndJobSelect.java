package testPack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class JoinAndJobSelect extends JavaPlugin {

	public JoinAndJobSelect(Player player, String job) {
		World world = Bukkit.getWorld("world");
		// 상자 배정
		try {
			File dataFolder = getDataFolder();
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				File file = new File(getDataFolder() + "playerInv.dat");
				if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					FileReader filereader = new FileReader(file);
					BufferedReader bufReader = new BufferedReader(filereader);
					String line = bufReader.readLine();
					while (line != null) {
						if (line.equals(player.getUniqueId().toString())) {
							break;
						}
						line = bufReader.readLine();
					}
					if (line != null) {
						String loc = bufReader.readLine();
						String[] ary = loc.split("/");
						if(job.equals("boneFighter")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 0);
						} else if(job.equals("knight")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 1);
						} else if(job.equals("priest")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 2);
						} else if(job.equals("berserker1")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 3);
						} else if(job.equals("gambler")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 4);
						} else if(job.equals("devil")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 5);
						} else if(job.equals("angel")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 6);
						} else if(job.equals("agent")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 7);
						} else if(job.equals("shadowKnight")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 8);
						} else if(job.equals("berserker2")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 9);
						} else if(job.equals("soldier")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 10);
						} else if(job.equals("grimReaper")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 11);
						} else if(job.equals("akuma")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 12);
						} else if(job.equals("paladin")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 13);
						} else if(job.equals("dragonKnight")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 14);
						} else if(job.equals("commander")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 15);
						} else if(job.equals("archer")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 16);
						} else if(job.equals("powerRanger")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 17);
						}
						int x = Integer.parseInt(ary[0]);
						int y = Integer.parseInt(ary[1]);
						int z = Integer.parseInt(ary[2]);
						Block block1 = new Location(world,x,y,z).getBlock();
						Chest chest1 = (Chest) block1.getState();
						Inventory c1Inv = chest1.getInventory();
						Inventory pInv = player.getInventory();
						for(int i = 0 ; i < 27 ; i++) {
							if (c1Inv.getItem(i) == null) {
								continue;
							}
							pInv.setItem(i, c1Inv.getItem(i));
						}
						Block block2 = new Location(world,x,y+1,z).getBlock();
						Chest chest2 = (Chest) block2.getState();
						Inventory c2Inv = chest2.getInventory();
						for(int i = 0 ; i < 14 ; i++) {
							if (c2Inv.getItem(i) == null) {
								continue;
							}
							pInv.setItem(i+27, c2Inv.getItem(i));
						}
					}
					bufReader.close();
				}
			}
		} catch (Exception e) {

		}
	}
	
}
