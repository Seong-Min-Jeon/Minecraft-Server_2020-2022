package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Inheritance {

	private static HashMap<Player, Integer> map = new HashMap<>();
	static File folder = null;
	
	public void setFolder(File f) {
		folder = f;
	}
	
	public void useScroll(Player player, Item itemArg) {
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "불의 계승자 스크롤")) {
			changeInheritance(player, 1, itemArg);
		}
		
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "계승 반환 스크롤")) {
			boolean ret = returnInheritance(player);
			if(ret) {
				itemArg.remove();
			}
		}
	}
	
	public void changeInheritance(Player player, int num, Item itemArg) {
		map.put(player, num);
		if(itemArg != null) {
			itemArg.remove();
			saveFile(player);
		}
	}
	
    public boolean returnInheritance(Player player) {
		int num = getInheritance(player);
		if(num == 0) {
			return false;
		}
		
		// 스크롤 생성해서 주기
		
		changeInheritance(player, 0, null);
		saveFile(player);
		return true;
	}
    
    public int getInheritance(Player player) {
    	if(map.containsKey(player)) {
    		return map.get(player);
    	}
    	return 0;
    }
	
    public void saveFile(Player player) {
    	
    	try {
			ItemStack mo = player.getInventory().getItem(7);
			if(mo == null) {
				return;
			}
			if(!mo.hasItemMeta()) {
				return;
			}
		} catch(Exception e) {
			
		}
    	
    	// 계승자
		try {
			int dataName = -1;
			if (player.getInventory().contains(Material.RED_DYE)) {
				dataName = 0;
			} else if (player.getInventory().contains(Material.GREEN_DYE)) {
				dataName = 1;
			} else if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
				dataName = 2;
			} else if (player.getInventory().contains(Material.CYAN_DYE)) {
				dataName = 3;
			} else if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
				dataName = 4;
			} else if (player.getInventory().contains(Material.GRAY_DYE)) {
				dataName = 10;
			} else if (player.getInventory().contains(Material.PINK_DYE)) {
				dataName = 11;
			} else if (player.getInventory().contains(Material.LIME_DYE)) {
				dataName = 12;
			} else if (player.getInventory().contains(Material.YELLOW_DYE)) {
				dataName = 5;
			} else if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
				dataName = 6;
			} else if (player.getInventory().contains(Material.MAGENTA_DYE)) {
				dataName = 7;
			} else if (player.getInventory().contains(Material.ORANGE_DYE)) {
				dataName = 8;
			} else if (player.getInventory().contains(Material.BLUE_DYE)) {
				dataName = 13;
			} else if (player.getInventory().contains(Material.BROWN_DYE)) {
				dataName = 14;
			} else if (player.getInventory().contains(Material.BLACK_DYE)) {
				dataName = 15;
			} else if (player.getInventory().contains(Material.INK_SAC)) {
				dataName = 16;
			} else if (player.getInventory().contains(Material.CLAY_BALL)) {
				dataName = 9;
			} else if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
				dataName = 17;
			}
			
			if(dataName == -1) {
				return;
			}
			
			File dataFolder = folder;
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(dataFolder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e2) {
            		    e2.getStackTrace();
            		}
				}
				File file = new File(dir, "inheritance.dat");
				try {
					FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);
    				String[] num = bufReader.readLine().split(" ");
    				num[dataName] = Integer.toString(getInheritance(player));
    				String str = "";
    				for(int j = 0 ; j < 17 ; j++) {
    					str += num[j] + " ";
    				}
    				str += num[17];
					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
	                fw.write(str);
	                fw.close();
	                bufReader.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		} catch (Exception e2) {
			
		}
    }
    
}
