package testPack;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class CharacterSelectButton{

	public CharacterSelectButton(Player player, File folder) {
		int[] ary = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		try {
			File dataFolder = folder;
			if(!dataFolder.exists()) {
                dataFolder.mkdir();
            }
			File dir = new File(dataFolder + "/" + player.getUniqueId().toString());
        	if(!dir.exists()) {
        		try{
        		    dir.mkdir(); 
        		} catch(Exception e) {
        		    e.getStackTrace();
        		}
        	}
        	File[] files = dir.listFiles();
        	for(File f : files) {
        		if(f.getName().equals("boneFighter_data.dat")) {
        			ary[0] = 1;
        		} else if(f.getName().equals("knight_data.dat")) {
        			ary[1] = 1;
        		} else if(f.getName().equals("priest_data.dat")) {
        			ary[2] = 1;
        		} else if(f.getName().equals("berserker1_data.dat")) {
        			ary[3] = 1;
        		} else if(f.getName().equals("gambler_data.dat")) {
        			ary[4] = 1;
        		} else if(f.getName().equals("devil_data.dat")) {
        			ary[10] = 1;
        		} else if(f.getName().equals("angel_data.dat")) {
        			ary[11] = 1;
        		} else if(f.getName().equals("agent_data.dat")) {
        			ary[12] = 1;
        		} else if(f.getName().equals("shadowKnight_data.dat")) {
        			ary[5] = 1;
        		} else if(f.getName().equals("berserker2_data.dat")) {
        			ary[6] = 1;
        		} else if(f.getName().equals("soldier_data.dat")) {
        			ary[7] = 1;
        		} else if(f.getName().equals("grimReaper_data.dat")) {
        			ary[8] = 1;
        		} else if(f.getName().equals("akuma_data.dat")) {
        			ary[13] = 1;
        		} else if(f.getName().equals("paladin_data.dat")) {
        			ary[14] = 1;
        		} else if(f.getName().equals("dragonKnight_data.dat")) {
        			ary[15] = 1;
        		} else if(f.getName().equals("commander_data.dat")) {
        			ary[16] = 1;
        		} else if(f.getName().equals("archer_data.dat")) {
        			ary[9] = 1;
        		} else if(f.getName().equals("powerRanger_data.dat")) {
        			ary[17] = 1;
        		}
        	}
		} catch(Exception e) {
			
		}
		Inventory inv = Bukkit.createInventory(player, 9, "Character Select");
		ItemStack newChar = new ItemStack(Material.SLIME_BALL);
		ItemMeta newCharIm = newChar.getItemMeta();
		newCharIm.setDisplayName(ChatColor.GREEN + "캐릭터 생성");
		newChar.setItemMeta(newCharIm);
		ItemStack bar = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
		ItemMeta barIm = bar.getItemMeta();
		barIm.setDisplayName(ChatColor.RED + " ");
		barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		bar.setItemMeta(barIm);
		
		inv.setItem(5, bar);
		inv.setItem(6, bar);
		inv.setItem(7, bar);
		inv.setItem(8, newChar);
		
		ArrayList<Integer> ch = new ArrayList<>();
		for(int i = 0 ; i < 18 ; i++) {
			if(ary[i] == 0) {
				continue;
			}
			ch.add(i);
		}
		
		for(int i = 0 ; i < ch.size() ; i++) {
			ItemStack job = null;
			if(ch.get(i) == 0) {
				job = new ItemStack(Material.RED_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "본 파이터");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 1) {
				job = new ItemStack(Material.GREEN_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "기사");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 2) {
				job = new ItemStack(Material.LAPIS_LAZULI);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "프리스트");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 3) {
				job = new ItemStack(Material.CYAN_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "광전사");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 4) {
				job = new ItemStack(Material.LIGHT_GRAY_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "도박사");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 10) {
				job = new ItemStack(Material.GRAY_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "데빌");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 11) {
				job = new ItemStack(Material.PINK_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "엔젤");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 12) {
				job = new ItemStack(Material.LIME_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "대행자");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 5) {
				job = new ItemStack(Material.YELLOW_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "그림자 무사");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 6) {
				job = new ItemStack(Material.LIGHT_BLUE_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "버서커");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 7) {
				job = new ItemStack(Material.MAGENTA_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "군인");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 8) {
				job = new ItemStack(Material.ORANGE_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "그림 리퍼");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 13) {
				job = new ItemStack(Material.BLUE_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "마인");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 14) {
				job = new ItemStack(Material.BROWN_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "팔라딘");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 15) {
				job = new ItemStack(Material.BLACK_DYE);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "용기사");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 16) {
				job = new ItemStack(Material.INK_SAC);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "대대장");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 9) {
				job = new ItemStack(Material.CLAY_BALL);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "아처");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			} else if(ch.get(i) == 17) {
				job = new ItemStack(Material.GLOWSTONE_DUST);
				ItemMeta jobIm = job.getItemMeta();
				jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
				jobIm.setDisplayName(ChatColor.GOLD + "파워레인저");
				jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				job.setItemMeta(jobIm);
			}
			if(job != null) {
				inv.setItem(i, job);
			}
		}
		player.openInventory(inv);
	}

}
