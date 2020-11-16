package testPack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class InventoryReload {

	public InventoryReload(Player player, String job, File folder) {
		World world = Bukkit.getWorld("world");
		// 상자에서 복구
		try {
			File dataFolder = folder;
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				File file = new File(folder, "playerInv.dat");
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
							Material type = c1Inv.getItem(i).getType();
							if(type == Material.RED_DYE || type == Material.GREEN_DYE || type == Material.LAPIS_LAZULI
									|| type == Material.CYAN_DYE || type == Material.LIGHT_GRAY_DYE || type == Material.GRAY_DYE
									|| type == Material.PINK_DYE || type == Material.LIME_DYE || type == Material.YELLOW_DYE
									|| type == Material.LIGHT_BLUE_DYE || type == Material.MAGENTA_DYE || type == Material.ORANGE_DYE
									|| type == Material.BLUE_DYE || type == Material.BROWN_DYE || type == Material.BLACK_DYE
									|| type == Material.INK_SAC || type == Material.CLAY_BALL || type == Material.GLOWSTONE_DUST) {
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
							Material type = c2Inv.getItem(i).getType();
							if(type == Material.RED_DYE || type == Material.GREEN_DYE || type == Material.LAPIS_LAZULI
									|| type == Material.CYAN_DYE || type == Material.LIGHT_GRAY_DYE || type == Material.GRAY_DYE
									|| type == Material.PINK_DYE || type == Material.LIME_DYE || type == Material.YELLOW_DYE
									|| type == Material.LIGHT_BLUE_DYE || type == Material.MAGENTA_DYE || type == Material.ORANGE_DYE
									|| type == Material.BLUE_DYE || type == Material.BROWN_DYE || type == Material.BLACK_DYE
									|| type == Material.INK_SAC || type == Material.CLAY_BALL || type == Material.GLOWSTONE_DUST) {
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
		
		//시작 캐릭이면 특수 아이템을 부여
		try {
			Inventory inv = player.getInventory();
			if(inv.contains(Material.RED_DYE)) {
				ItemStack bone = new ItemStack(Material.BONE);
				ItemMeta boneIm = bone.getItemMeta();
				boneIm.setDisplayName(ChatColor.GOLD + "고대 드래곤의 뼈");
				bone.setItemMeta(boneIm);	
				player.getInventory().setItem(0, bone);
			} else if(inv.contains(Material.ORANGE_DYE)) {
				ItemStack item5 = new ItemStack(Material.SKELETON_SKULL);
				ItemMeta item5Im = item5.getItemMeta();
				item5Im.setDisplayName(ChatColor.GOLD + "" + player.getDisplayName() + "의 머리");
				item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				item5Im.setUnbreakable(true);
				item5.setItemMeta(item5Im);
				player.getInventory().setItem(39, item5);	
			} else {
				if(inv.getItem(0) == null) {
					ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
					ItemMeta item5Im = item5.getItemMeta();
					item5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0");
					item5Im.setDisplayName(ChatColor.GRAY + "나뭇가지");
					ArrayList<String> item5Lore = new ArrayList();
					item5Lore.add(ChatColor.GRAY + "그저 하찮은 나뭇가지");
					item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
					item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
					item5Im.setUnbreakable(true);
					item5Im.setLore(item5Lore);
					item5.setItemMeta(item5Im);
					player.getInventory().addItem(item5);	
				}
			}
		} catch(Exception e) {
			
		}
	}
	
}
