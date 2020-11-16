package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RemoveCharacter {

	public RemoveCharacter(Player player, Item itemArg, File folder) {
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "캐릭터 삭제 스크롤")) {
			World world = player.getWorld();
			player.kickPlayer(ChatColor.BOLD + "해당 캐릭터가 삭제되었습니다.");
			// 캐릭터 창고 비우기
			try {
				File dataFolder = folder;
	            if(!dataFolder.exists()) {
	                dataFolder.mkdir();
	            } else {
	            	String dataName = null;
	            	if(player.getInventory().contains(Material.RED_DYE)) {
	            		dataName = "boneFighter";
	            	} else if(player.getInventory().contains(Material.GREEN_DYE)) {
	            		dataName = "knight";
	            	} else if(player.getInventory().contains(Material.LAPIS_LAZULI)) {
	            		dataName = "priest";
	            	} else if(player.getInventory().contains(Material.CYAN_DYE)) {
	            		dataName = "berserker1";
	            	} else if(player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
	            		dataName = "gambler";
	            	} else if(player.getInventory().contains(Material.GRAY_DYE)) {
	            		dataName = "devil";
	            	} else if(player.getInventory().contains(Material.PINK_DYE)) {
	            		dataName = "angel";
	            	} else if(player.getInventory().contains(Material.LIME_DYE)) {
	            		dataName = "agent";
	            	} else if(player.getInventory().contains(Material.YELLOW_DYE)) {
	            		dataName = "shadowKnight";
	            	} else if(player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
	            		dataName = "berserker2";
	            	} else if(player.getInventory().contains(Material.MAGENTA_DYE)) {
	            		dataName = "soldier";
	            	} else if(player.getInventory().contains(Material.ORANGE_DYE)) {
	            		dataName = "grimReaper";
	            	} else if(player.getInventory().contains(Material.BLUE_DYE)) {
	            		dataName = "akuma";
	            	} else if(player.getInventory().contains(Material.BROWN_DYE)) {
	            		dataName = "paladin";
	            	} else if(player.getInventory().contains(Material.BLACK_DYE)) {
	            		dataName = "dragonKnight";
	            	} else if(player.getInventory().contains(Material.INK_SAC)) {
	            		dataName = "commander";
	            	} else if(player.getInventory().contains(Material.CLAY_BALL)) {
	            		dataName = "archer";
	            	} else if(player.getInventory().contains(Material.GLOWSTONE_DUST)) {
	            		dataName = "powerRanger";
	            	} 
	            	if(dataName != null) {
	            		File file = new File(folder, "playerInv.dat");
	                    if(!file.exists()) {
	                        try {
	                        	file.createNewFile();
	                        } catch (IOException e) {
	                            e.printStackTrace();
	                        }
						}
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
							if(dataName.equals("boneFighter")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 0);
							} else if(dataName.equals("knight")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 1);
							} else if(dataName.equals("priest")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 2);
							} else if(dataName.equals("berserker1")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 3);
							} else if(dataName.equals("gambler")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 4);
							} else if(dataName.equals("devil")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 5);
							} else if(dataName.equals("angel")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 6);
							} else if(dataName.equals("agent")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 7);
							} else if(dataName.equals("shadowKnight")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 8);
							} else if(dataName.equals("berserker2")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 9);
							} else if(dataName.equals("soldier")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 10);
							} else if(dataName.equals("grimReaper")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 11);
							} else if(dataName.equals("akuma")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 12);
							} else if(dataName.equals("paladin")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 13);
							} else if(dataName.equals("dragonKnight")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 14);
							} else if(dataName.equals("commander")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 15);
							} else if(dataName.equals("archer")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 16);
							} else if(dataName.equals("powerRanger")) {
								ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 17);
							}
							int x = Integer.parseInt(ary[0]);
							int y = Integer.parseInt(ary[1]);
							int z = Integer.parseInt(ary[2]);
							Block block1 = new Location(world,x,y,z).getBlock();
							Chest chest1 = (Chest) block1.getState();
							Inventory c1Inv = chest1.getInventory();
							c1Inv.clear();
							Block block2 = new Location(world,x,y+1,z).getBlock();
							Chest chest2 = (Chest) block2.getState();
							Inventory c2Inv = chest2.getInventory();
							c2Inv.clear();
							bufReader.close();
						}
					}
				}
			} catch(Exception e) {
				
			}
			
			// 데이터 파일 삭제
			try {
				File dataFolder = folder;
	            if(!dataFolder.exists()) {
	                dataFolder.mkdir();
	            } else {
	            	String dataName = null;
	            	if(player.getInventory().contains(Material.RED_DYE)) {
	            		dataName = "boneFighter";
	            	} else if(player.getInventory().contains(Material.GREEN_DYE)) {
	            		dataName = "knight";
	            	} else if(player.getInventory().contains(Material.LAPIS_LAZULI)) {
	            		dataName = "priest";
	            	} else if(player.getInventory().contains(Material.CYAN_DYE)) {
	            		dataName = "berserker1";
	            	} else if(player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
	            		dataName = "gambler";
	            	} else if(player.getInventory().contains(Material.GRAY_DYE)) {
	            		dataName = "devil";
	            	} else if(player.getInventory().contains(Material.PINK_DYE)) {
	            		dataName = "angel";
	            	} else if(player.getInventory().contains(Material.LIME_DYE)) {
	            		dataName = "agent";
	            	} else if(player.getInventory().contains(Material.YELLOW_DYE)) {
	            		dataName = "shadowKnight";
	            	} else if(player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
	            		dataName = "berserker2";
	            	} else if(player.getInventory().contains(Material.MAGENTA_DYE)) {
	            		dataName = "soldier";
	            	} else if(player.getInventory().contains(Material.ORANGE_DYE)) {
	            		dataName = "grimReaper";
	            	} else if(player.getInventory().contains(Material.BLUE_DYE)) {
	            		dataName = "akuma";
	            	} else if(player.getInventory().contains(Material.BROWN_DYE)) {
	            		dataName = "paladin";
	            	} else if(player.getInventory().contains(Material.BLACK_DYE)) {
	            		dataName = "dragonKnight";
	            	} else if(player.getInventory().contains(Material.INK_SAC)) {
	            		dataName = "commander";
	            	} else if(player.getInventory().contains(Material.CLAY_BALL)) {
	            		dataName = "archer";
	            	} else if(player.getInventory().contains(Material.GLOWSTONE_DUST)) {
	            		dataName = "powerRanger";
	            	} 
	            	File dir = new File(folder + "/" + player.getUniqueId().toString());
	            	if(!dir.exists()) {
	            		try{
	            		    dir.mkdir(); 
	            		} catch(Exception e) {
	            		    e.getStackTrace();
	            		}
	            	}
	            	if(dataName != null) {
	            		File file = new File(dir, dataName + "_data.dat");
	                    if(file.exists()) {
	                       file.delete();
						}
	                    File qfile = new File(dir, dataName + "_Qdata.dat");
	                    if(qfile.exists()) {
	                       qfile.delete();
						}
					}
				}
			} catch(Exception e) {
				
			}
			itemArg.remove();
		}
	}
	
}
