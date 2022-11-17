package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ReinforcementMakeEvent {
	
	public boolean rein(Player player, Inventory inv) {
		try {
			if(inv.getItem(0).getType()==Material.WOODEN_SWORD || inv.getItem(0).getType()==Material.STONE_SWORD || inv.getItem(0).getType()==Material.IRON_SWORD || inv.getItem(0).getType()==Material.GOLDEN_SWORD ||
        			inv.getItem(0).getType()==Material.DIAMOND_SWORD || inv.getItem(0).getType()==Material.LEATHER_HELMET || inv.getItem(0).getType()==Material.LEATHER_CHESTPLATE ||
        			inv.getItem(0).getType()==Material.LEATHER_LEGGINGS || inv.getItem(0).getType()==Material.LEATHER_BOOTS || inv.getItem(0).getType()==Material.CHAINMAIL_HELMET ||
        			inv.getItem(0).getType()==Material.CHAINMAIL_CHESTPLATE || inv.getItem(0).getType()==Material.CHAINMAIL_LEGGINGS || inv.getItem(0).getType()==Material.CHAINMAIL_BOOTS ||
        			inv.getItem(0).getType()==Material.IRON_HELMET || inv.getItem(0).getType()==Material.IRON_CHESTPLATE || inv.getItem(0).getType()==Material.IRON_LEGGINGS ||
        			inv.getItem(0).getType()==Material.IRON_BOOTS || inv.getItem(0).getType()==Material.GOLDEN_HELMET || inv.getItem(0).getType()==Material.GOLDEN_CHESTPLATE ||
        			inv.getItem(0).getType()==Material.GOLDEN_LEGGINGS || inv.getItem(0).getType()==Material.GOLDEN_BOOTS || inv.getItem(0).getType()==Material.DIAMOND_HELMET ||
        			inv.getItem(0).getType()==Material.DIAMOND_CHESTPLATE || inv.getItem(0).getType()==Material.DIAMOND_LEGGINGS || inv.getItem(0).getType()==Material.DIAMOND_BOOTS ||
        			inv.getItem(0).getType() == Material.OAK_LEAVES || inv.getItem(0).getType() == Material.SPRUCE_LEAVES || inv.getItem(0).getType() == Material.BIRCH_LEAVES ||
        			inv.getItem(0).getType() == Material.JUNGLE_LEAVES || inv.getItem(0).getType() == Material.ACACIA_LEAVES || inv.getItem(0).getType() == Material.DARK_OAK_LEAVES ||
					inv.getItem(0).getType() == Material.COBBLESTONE_WALL || inv.getItem(0).getType() == Material.MOSSY_COBBLESTONE_WALL || inv.getItem(0).getType() == Material.BROWN_CARPET ||
					inv.getItem(0).getType() == Material.GREEN_CARPET || inv.getItem(0).getType() == Material.BLACK_CARPET || inv.getItem(0).getType() == Material.STONE ||
					inv.getItem(0).getType() == Material.OAK_PLANKS || inv.getItem(0).getType() == Material.SPRUCE_PLANKS || inv.getItem(0).getType() == Material.BIRCH_PLANKS ||
					inv.getItem(0).getType() == Material.JUNGLE_PLANKS || inv.getItem(0).getType() == Material.ACACIA_PLANKS || inv.getItem(0).getType() == Material.DARK_OAK_PLANKS ||
					inv.getItem(0).getType() == Material.BEDROCK || inv.getItem(0).getType() == Material.SPRUCE_LOG || inv.getItem(0).getType() == Material.BIRCH_LOG ||
					inv.getItem(0).getType() == Material.JUNGLE_LOG || inv.getItem(0).getType() == Material.ACACIA_LOG || inv.getItem(0).getType() == Material.DARK_OAK_LOG ||
					inv.getItem(0).getType() == Material.SANDSTONE || inv.getItem(0).getType() == Material.CHISELED_SANDSTONE || inv.getItem(0).getType() == Material.CUT_SANDSTONE ||
					inv.getItem(0).getType() == Material.LAPIS_BLOCK || inv.getItem(0).getType() == Material.MAGENTA_WOOL || inv.getItem(0).getType() == Material.LIME_WOOL ||
					inv.getItem(0).getType() == Material.GRAY_WOOL || inv.getItem(0).getType() == Material.LIGHT_GRAY_WOOL || inv.getItem(0).getType() == Material.CYAN_WOOL ||
					inv.getItem(0).getType() == Material.PURPLE_WOOL || inv.getItem(0).getType() == Material.OAK_SLAB || inv.getItem(0).getType() == Material.SPRUCE_SLAB ||
					inv.getItem(0).getType() == Material.BIRCH_SLAB || inv.getItem(0).getType() == Material.JUNGLE_SLAB || inv.getItem(0).getType() == Material.ACACIA_SLAB ||
					inv.getItem(0).getType() == Material.DARK_OAK_SLAB || inv.getItem(0).getType() == Material.STONE_SLAB || inv.getItem(0).getType() == Material.COBBLESTONE_SLAB ||
					inv.getItem(0).getType() == Material.STONE_BRICK_SLAB || inv.getItem(0).getType() == Material.NETHER_BRICK_SLAB || inv.getItem(0).getType() == Material.QUARTZ_SLAB ||
					inv.getItem(0).getType() == Material.RED_SANDSTONE || inv.getItem(0).getType() == Material.RED_SANDSTONE_SLAB || inv.getItem(0).getType() == Material.SMOOTH_RED_SANDSTONE ||
					inv.getItem(0).getType() == Material.OBSIDIAN || inv.getItem(0).getType() == Material.SMOOTH_SANDSTONE || inv.getItem(0).getType() == Material.CHISELED_RED_SANDSTONE ||
					inv.getItem(0).getType() == Material.CUT_RED_SANDSTONE || inv.getItem(0).getType() == Material.RED_SANDSTONE_STAIRS || inv.getItem(0).getType() == Material.STONE_STAIRS ||
					inv.getItem(0).getType() == Material.DEAD_BRAIN_CORAL_BLOCK || inv.getItem(0).getType() == Material.DEAD_BUBBLE_CORAL_BLOCK || inv.getItem(0).getType() == Material.DEAD_FIRE_CORAL_BLOCK || 
					inv.getItem(0).getType() == Material.DEAD_HORN_CORAL_BLOCK || inv.getItem(0).getType() == Material.DEAD_TUBE_CORAL_BLOCK || inv.getItem(0).getType() == Material.BRAIN_CORAL_BLOCK ||
					inv.getItem(0).getType() == Material.HORN_CORAL_BLOCK || inv.getItem(0).getType() == Material.TUBE_CORAL_BLOCK || inv.getItem(0).getType() == Material.BUBBLE_CORAL_BLOCK ||
					inv.getItem(0).getType() == Material.FIRE_CORAL_BLOCK || inv.getItem(0).getType()==Material.NETHERITE_SWORD || inv.getItem(0).getType()==Material.NETHERITE_HELMET ||
        			inv.getItem(0).getType()==Material.NETHERITE_CHESTPLATE || inv.getItem(0).getType()==Material.NETHERITE_LEGGINGS || inv.getItem(0).getType()==Material.NETHERITE_BOOTS ||
        			inv.getItem(0).getType()==Material.CARVED_PUMPKIN) {
				if(inv.getItem(1).getType()==Material.CHARCOAL || inv.getItem(1).getType() == Material.PLAYER_HEAD || inv.getItem(1).getType() == Material.STICK || inv.getItem(1).getType() == Material.NETHERITE_INGOT) {
					if(inv.getItem(1).getAmount() < 1) { 
            			player.sendMessage(ChatColor.WHITE + "언디파인드 에러입니다.");
            		} else {
            			ItemStack itemStack = inv.getItem(0);
            			ItemStack itemStack2 = inv.getItem(1);              
            			Transcendence t = new Transcendence();
            			t.transcendence(player, itemStack, itemStack2, inv);    
            		}
					return false;
				} else if(inv.getItem(1).getType()==Material.COAL || inv.getItem(1).getType()==Material.IRON_INGOT || inv.getItem(1).getType()==Material.GOLD_INGOT ||
            			inv.getItem(1).getType()==Material.DIAMOND || inv.getItem(1).getType()==Material.QUARTZ) {
            		if(inv.getItem(1).getAmount() < 1) {
            			player.sendMessage(ChatColor.WHITE + "광물은 1개 이상 넣어주세요.");
            		} else {
            			ItemStack itemStack = inv.getItem(0);
            			ItemMeta item = itemStack.getItemMeta();
            			ItemMeta itemResource = inv.getItem(1).getItemMeta();
            			ItemMeta newMeta = null;
            			Reinforcement rein = new Reinforcement();
            			if(inv.getItem(0).getType() == Material.DEAD_BRAIN_CORAL_BLOCK || inv.getItem(0).getType() == Material.DEAD_BUBBLE_CORAL_BLOCK || inv.getItem(0).getType() == Material.DEAD_FIRE_CORAL_BLOCK || 
            					inv.getItem(0).getType() == Material.DEAD_HORN_CORAL_BLOCK || inv.getItem(0).getType() == Material.DEAD_TUBE_CORAL_BLOCK || inv.getItem(0).getType() == Material.BRAIN_CORAL_BLOCK ||
            					inv.getItem(0).getType() == Material.HORN_CORAL_BLOCK || inv.getItem(0).getType() == Material.TUBE_CORAL_BLOCK || inv.getItem(0).getType() == Material.BUBBLE_CORAL_BLOCK ||
            					inv.getItem(0).getType() == Material.FIRE_CORAL_BLOCK) {
            				if(inv.getItem(1).getType()==Material.QUARTZ) {   
            					if(item.getLocalizedName() != null) {
            						int lvl = Integer.parseInt(item.getLocalizedName());
            						if(lvl==0) {
            							if(!(itemResource.getDisplayName().equals(ChatColor.GRAY + "깨질 듯한 석영"))) {
                							player.sendMessage("이 수준의 석영으로는 개방을 할 수 없을 것 같다.");
                							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                						} else {
                							newMeta = rein.bowRein1(player, item, itemResource);
                							itemStack.setItemMeta(newMeta);
			                    			inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
                						}
            						} else if(lvl==2) {
            							if(!(itemResource.getDisplayName().equals(ChatColor.WHITE + "석영"))) {
                							player.sendMessage("이 수준의 석영으로는 개방을 할 수 없을 것 같다.");
                							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                						} else {
                							newMeta = rein.bowRein2(player, item, itemResource);
                							itemStack.setItemMeta(newMeta);
			                    			inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
                						}
            						} else if(lvl==10) {
            							if(!(itemResource.getDisplayName().equals(ChatColor.YELLOW + "반듯한 석영"))) {
                							player.sendMessage("이 수준의 석영으로는 개방을 할 수 없을 것 같다.");
                							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                						} else {
                							newMeta = rein.bowRein3(player, item, itemResource);
                							itemStack.setItemMeta(newMeta);
			                    			inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
                						}
            						} else if(lvl==50) {
            							if(!(itemResource.getDisplayName().equals(ChatColor.LIGHT_PURPLE + "매혹적인 석영"))) {
                							player.sendMessage("이 수준의 석영으로는 개방을 할 수 없을 것 같다.");
                							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                						} else {
                							newMeta = rein.bowRein4(player, item, itemResource);
                							itemStack.setItemMeta(newMeta);
			                    			inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
                						}
            						} else if(lvl==300) {
            							if(!(itemResource.getDisplayName().equals(ChatColor.AQUA + "보석같은 석영"))) {
                							player.sendMessage("이 수준의 석영으로는 개방을 할 수 없을 것 같다.");
                							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                						} else {
                							newMeta = rein.bowRein5(player, item, itemResource);
                							itemStack.setItemMeta(newMeta);
			                    			inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
                						}
            						} else if(lvl>=1000) {
            							if(!(itemResource.getDisplayName().equals(ChatColor.DARK_RED + "신의 힘이 담긴 석영"))) {
                							player.sendMessage("이 수준의 석영으로는 개방을 할 수 없을 것 같다.");
                							player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 1.0f);
                						} else {
                							newMeta = rein.bowRein6(player, item, itemResource);
                							itemStack.setItemMeta(newMeta);
			                    			inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
                						}
            						}
            					}
                			} else {
                				player.sendMessage(ChatColor.WHITE + "활 개방에는 특수한 광물이 필요합니다.");
                				return false;
                			}
            			} else {
            				if(inv.getItem(0).getType()==Material.LEATHER_HELMET || inv.getItem(0).getType()==Material.LEATHER_CHESTPLATE ||
            						inv.getItem(0).getType()==Material.LEATHER_LEGGINGS || inv.getItem(0).getType()==Material.LEATHER_BOOTS || inv.getItem(0).getType()==Material.CHAINMAIL_HELMET ||
            						inv.getItem(0).getType()==Material.CHAINMAIL_CHESTPLATE || inv.getItem(0).getType()==Material.CHAINMAIL_LEGGINGS || inv.getItem(0).getType()==Material.CHAINMAIL_BOOTS ||
            						inv.getItem(0).getType()==Material.IRON_HELMET || inv.getItem(0).getType()==Material.IRON_CHESTPLATE || inv.getItem(0).getType()==Material.IRON_LEGGINGS ||
            						inv.getItem(0).getType()==Material.IRON_BOOTS || inv.getItem(0).getType()==Material.GOLDEN_HELMET || inv.getItem(0).getType()==Material.GOLDEN_CHESTPLATE ||
            						inv.getItem(0).getType()==Material.GOLDEN_LEGGINGS || inv.getItem(0).getType()==Material.GOLDEN_BOOTS || inv.getItem(0).getType()==Material.DIAMOND_HELMET ||
            						inv.getItem(0).getType()==Material.DIAMOND_CHESTPLATE || inv.getItem(0).getType()==Material.DIAMOND_LEGGINGS || inv.getItem(0).getType()==Material.DIAMOND_BOOTS ||
            						inv.getItem(0).getType()==Material.NETHERITE_HELMET || inv.getItem(0).getType()==Material.NETHERITE_CHESTPLATE || inv.getItem(0).getType()==Material.NETHERITE_LEGGINGS || 
            						inv.getItem(0).getType()==Material.NETHERITE_BOOTS || inv.getItem(0).getType()==Material.CARVED_PUMPKIN) {	             
            					if(inv.getItem(1).getType()==Material.COAL) {  
                    				newMeta = rein.coalReinArmor(player, item, itemResource);
                    			} else if(inv.getItem(1).getType()==Material.IRON_INGOT) {                    				
                    				newMeta = rein.ironReinArmor(player, item, itemResource);
                    			} else if(inv.getItem(1).getType()==Material.GOLD_INGOT) {                    				
                    				newMeta = rein.goldReinArmor(player, item, itemResource);
                    			} else if(inv.getItem(1).getType()==Material.DIAMOND) {                    				
                    				newMeta = rein.diaReinArmor(player, item, itemResource);
                    			}
            				} else {
            					if(inv.getItem(1).getType()==Material.COAL) {  
                    				newMeta = rein.coalReinWeapon(player, item, itemResource);
                    			} else if(inv.getItem(1).getType()==Material.IRON_INGOT) {                    				
                    				newMeta = rein.ironReinWeapon(player, item, itemResource);
                    			} else if(inv.getItem(1).getType()==Material.GOLD_INGOT) {                    				
                    				newMeta = rein.goldReinWeapon(player, item, itemResource);
                    			} else if(inv.getItem(1).getType()==Material.DIAMOND) {                    				
                    				newMeta = rein.diaReinWeapon(player, item, itemResource);
                    			}
            				}
            				if(newMeta != null) {
            					itemStack.setItemMeta(newMeta);
                    			inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
            				} else {
            					player.sendMessage("잘못된 강화방법입니다.");
            					return false;
            				}
            			}	                                  			
            		}
            	} else {
            		player.sendMessage(ChatColor.WHITE + "두번째 칸에는 재료를 넣어주세요.");
            	}
        	} else {
        		player.sendMessage(ChatColor.WHITE + "첫번째 칸에는 강화할 장비를 넣어주세요.(생활 도구는 강화 불가)");
        	}
		} catch(Exception e) {
			player.sendMessage(ChatColor.WHITE + "첫번째 칸에는 강화할 장비, 두번째 칸에는 재료를 넣어주세요.");
		}
		return true;
	}
	
}
