package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DefineScroll {

	public void effect(Player player, Item itemArg) {
		
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "장비 감정서")) {
			itemArg.remove();
			ItemStack item = player.getInventory().getItemInMainHand();
			if(item.getType()!=Material.AIR) {
				if(item.getType()==Material.WOODEN_SWORD || item.getType()==Material.STONE_SWORD || item.getType()==Material.IRON_SWORD || item.getType()==Material.GOLDEN_SWORD ||
            			item.getType()==Material.DIAMOND_SWORD || item.getType()==Material.LEATHER_HELMET || item.getType()==Material.LEATHER_CHESTPLATE ||
            			item.getType()==Material.LEATHER_LEGGINGS || item.getType()==Material.LEATHER_BOOTS || item.getType()==Material.CHAINMAIL_HELMET ||
            			item.getType()==Material.CHAINMAIL_CHESTPLATE || item.getType()==Material.CHAINMAIL_LEGGINGS || item.getType()==Material.CHAINMAIL_BOOTS ||
            			item.getType()==Material.IRON_HELMET || item.getType()==Material.IRON_CHESTPLATE || item.getType()==Material.IRON_LEGGINGS ||
            			item.getType()==Material.IRON_BOOTS || item.getType()==Material.GOLDEN_HELMET || item.getType()==Material.GOLDEN_CHESTPLATE ||
            			item.getType()==Material.GOLDEN_LEGGINGS || item.getType()==Material.GOLDEN_BOOTS || item.getType()==Material.DIAMOND_HELMET ||
            			item.getType()==Material.DIAMOND_CHESTPLATE || item.getType()==Material.DIAMOND_LEGGINGS || item.getType()==Material.DIAMOND_BOOTS ||
            			item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES ||
            			item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES ||
						item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET ||
						item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE ||
						item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS ||
						item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS ||
						item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG ||
						item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG ||
						item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE ||
						item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL ||
						item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL ||
						item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB ||
						item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB ||
						item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB ||
						item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB ||
						item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE ||
						item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE ||
						item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS ||
						item.getType()==Material.NETHERITE_HELMET || item.getType()==Material.NETHERITE_CHESTPLATE || item.getType()==Material.NETHERITE_LEGGINGS || 
						item.getType()==Material.NETHERITE_BOOTS) {
					if(item.getItemMeta().getLore()!=null) {
						ItemMeta im = item.getItemMeta();
						String[] ench = im.getLocalizedName().split(",");
						List<String> preList;
						preList = im.getLore();
						int cnt = 0;
						for(int i = 0 ; i < preList.size() ; i++) {			
							if(preList.get(i).equals("=====인챈트=====")) {
								break;
							}
//							if(i==preList.size()-1) {
//								break;
//							}
							cnt++;
						}
						List<String> list = new ArrayList<String>();
						for(int i = 0 ; i < cnt ; i++) {
							list.add(preList.get(i));
						}
						if(!(list.get(list.size()-1).equals(" "))) {
							list.add(" ");
						}
						list.add("=====인챈트=====");
						if(Integer.parseInt(ench[0]) != 0) {
							int lvl = Integer.parseInt(ench[0]);
							list.add(ChatColor.BLUE + "추가 데미지(모든 객체): " + lvl);
						}
						if(Integer.parseInt(ench[1]) != 0) {
							int lvl = Integer.parseInt(ench[1]);
							list.add(ChatColor.BLUE + "추가 데미지(인간형): " + lvl);
						}
						if(Integer.parseInt(ench[2]) != 0) {
							int lvl = Integer.parseInt(ench[2]);
							list.add(ChatColor.BLUE + "추가 데미지(벌레): " + lvl);
						}
						if(Integer.parseInt(ench[3]) != 0) {
							int lvl = Integer.parseInt(ench[3]);
							list.add(ChatColor.BLUE + "추가 데미지(거대 객체): " + lvl);
						}					
						if(Integer.parseInt(ench[4]) != 0) {
							int lvl = Integer.parseInt(ench[4]);
							list.add(ChatColor.BLUE + "스플레시: " + lvl);
						}
						if(Integer.parseInt(ench[5]) != 0) {
							int lvl = Integer.parseInt(ench[5]);
							list.add(ChatColor.BLUE + "보호(일반): " + lvl);
						}
						if(Integer.parseInt(ench[6]) != 0) {
							int lvl = Integer.parseInt(ench[6]);
							list.add(ChatColor.BLUE + "보호(화염): " + lvl);
						}
						if(Integer.parseInt(ench[7]) != 0) {
							int lvl = Integer.parseInt(ench[7]);
							list.add(ChatColor.BLUE + "보호(폭발): " + lvl);
						}
						if(Integer.parseInt(ench[8]) != 0) {
							int lvl = Integer.parseInt(ench[8]);
							list.add(ChatColor.BLUE + "보호(발사체): " + lvl);
						}
						if(Integer.parseInt(ench[9]) != 0) {
							int lvl = Integer.parseInt(ench[9]);
							list.add(ChatColor.BLUE + "반격: " + lvl);
						}
						im.setLore(list);
						item.setItemMeta(im);					
					} 
				} else if(item.getType() == Material.DEAD_BRAIN_CORAL_BLOCK || item.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK || item.getType() == Material.DEAD_FIRE_CORAL_BLOCK
							|| item.getType() == Material.DEAD_HORN_CORAL_BLOCK || item.getType() == Material.DEAD_TUBE_CORAL_BLOCK || item.getType() == Material.BRAIN_CORAL_BLOCK
							|| item.getType() == Material.HORN_CORAL_BLOCK || item.getType() == Material.TUBE_CORAL_BLOCK || item.getType() == Material.BUBBLE_CORAL_BLOCK
							|| item.getType() == Material.FIRE_CORAL_BLOCK) {
					if(item.getItemMeta().getLore()!=null) {
						ItemMeta im = item.getItemMeta();
						String ench = im.getLocalizedName();
						List<String> preList;
						preList = im.getLore();
						int cnt = 0;
						for(int i = 0 ; i < preList.size() ; i++) {			
							if(preList.contains("=====인챈트=====")) {
								break;
							}
//							if(i==preList.size()-1) {
//								break;
//							}
							cnt++;
						}
						List<String> list = new ArrayList<String>();
						for(int i = 0 ; i < cnt ; i++) {
							list.add(preList.get(i));
						}
						if(!(list.get(list.size()-1).equals(" "))) {
							list.add(" ");
						}
						list.add("=====인챈트=====");
						if(Integer.parseInt(ench) != 0) {
							int lvl = Integer.parseInt(ench);
							list.add(ChatColor.BLUE + "추가 데미지: " + lvl);
						}						
						im.setLore(list);
						item.setItemMeta(im);					
					}
				}
			} else {
				player.sendMessage(ChatColor.RED + "오른손에 장비를 들고 사용해주세요.");
				player.getInventory().addItem(itemArg.getItemStack());
			}
		}
	}
	
}
