package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class ReloadPlayerData {

	public ReloadPlayerData(Player player, String job, File folder) {
		try {
			File dataFolder = folder;
			String fLevel = null;
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(folder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e) {
            		    e.getStackTrace();
            		}
            	}
            	// 데이터 리로드
            	try {
            		File file = new File(dir, job + "_data.dat");
    				if (!file.exists()) {
    					try {
    						file.createNewFile();
    					} catch (IOException e) {
    						e.printStackTrace();
    					}
    				}
    				FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);
    				String loc = bufReader.readLine();
    				String health = bufReader.readLine();
    				String level = bufReader.readLine();
    				String[] ary1 = loc.split("/");
    				player.teleport(new Location(player.getWorld(), Integer.parseInt(ary1[0]), Integer.parseInt(ary1[1]), Integer.parseInt(ary1[2])));
    				String[] ary3 = level.split("/");
    				player.setLevel(Integer.parseInt(ary3[0]));
    				player.setExp(Float.parseFloat(ary3[1]));
    				String[] ary2 = health.split("/");
    				player.setHealth(Double.parseDouble(ary2[0]));
    				player.setFoodLevel(Integer.parseInt(ary2[1]));
    				bufReader.close();
            	} catch(Exception e) {
            		
            	}
            	// 생활 레벨 리로드
            	try {
            		File file = new File(dir, "fantasy_life_level.dat");
    				if (!file.exists()) {
    					try {
    						file.createNewFile();
    					} catch (IOException e) {
    						e.printStackTrace();
    					}
    				}
    				FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);
    				fLevel = bufReader.readLine();
    				bufReader.close();
            	} catch(Exception e) {
            		
            	}
            	// 증표 리로드
            	try {
            		giveMemento(player, job, fLevel);
            	} catch(Exception e) {
            		
            	}
            	// 인벤토리 리로드
            	try {
            		new InventoryReload(player, job, folder);
            	} catch(Exception e) {
            		
            	}
            	// 퀘스트 리로드
            	try {
            		File file = new File(dir, job + "_Qdata.dat");
                    if(!file.exists()) {
                        try {
                        	file.createNewFile();
                        } catch (IOException e) {
                            e.printStackTrace();
						}
					}
					FileReader filereader = new FileReader(file);
					BufferedReader bufReader = new BufferedReader(filereader);
					String quest = "";
					String num = "";
					quest = bufReader.readLine();
					num = bufReader.readLine();
					if (quest.equals("q1")) {
						QuestBoard qb = new QuestBoard();
						qb.q1(player, Integer.parseInt(num));
					}
					if (quest.equals("q2")) {
						QuestBoard qb = new QuestBoard();
						qb.q2(player, Integer.parseInt(num));
					}
					if (quest.equals("q3")) {
						QuestBoard qb = new QuestBoard();
						qb.q3(player, Integer.parseInt(num));
					}
					if (quest.equals("q4")) {
						QuestBoard qb = new QuestBoard();
						qb.q4(player, Integer.parseInt(num));
					}
					if (quest.equals("q5")) {
						QuestBoard qb = new QuestBoard();
						qb.q5(player, Integer.parseInt(num));
					}
					if (quest.equals("q6")) {
						QuestBoard qb = new QuestBoard();
						qb.q6(player, Integer.parseInt(num));
					}
					if (quest.equals("q7")) {
						QuestBoard qb = new QuestBoard();
						qb.q7(player, Integer.parseInt(num));
					}
					if (quest.equals("q8")) {
						QuestBoard qb = new QuestBoard();
						qb.q8(player, Integer.parseInt(num));
					}
					if (quest.equals("q9")) {
						QuestBoard qb = new QuestBoard();
						qb.q9(player, Integer.parseInt(num));
					}
					if (quest.equals("q10")) {
						QuestBoard qb = new QuestBoard();
						qb.q10(player, Integer.parseInt(num));
					}
					if (quest.equals("q11")) {
						QuestBoard qb = new QuestBoard();
						qb.q11(player, Integer.parseInt(num));
					}
					if (quest.equals("q12")) {
						QuestBoard qb = new QuestBoard();
						qb.q12(player, Integer.parseInt(num));
					}
					if (quest.equals("q13")) {
						QuestBoard qb = new QuestBoard();
						qb.q13(player, Integer.parseInt(num));
					}
					if (quest.equals("q14")) {
						QuestBoard qb = new QuestBoard();
						qb.q14(player, Integer.parseInt(num));
					}
					if (quest.equals("q15")) {
						QuestBoard qb = new QuestBoard();
						qb.q15(player, Integer.parseInt(num));
					}
					if (quest.equals("q16")) {
						QuestBoard qb = new QuestBoard();
						qb.q16(player, Integer.parseInt(num));
					}
					if (quest.equals("q17")) {
						QuestBoard qb = new QuestBoard();
						qb.q17(player, Integer.parseInt(num));
					}
					if (quest.equals("q18")) {
						QuestBoard qb = new QuestBoard();
						qb.q18(player, Integer.parseInt(num));
					}
					if (quest.equals("eq1")) {
						QuestBoard qb = new QuestBoard();
						qb.eq1(player, Integer.parseInt(num));
					}
					if (quest.equals("eq1_1")) {
						QuestBoard qb = new QuestBoard();
						qb.eq1_1(player, Integer.parseInt(num));
					}
					if (quest.equals("eq1_2")) {
						QuestBoard qb = new QuestBoard();
						qb.eq1_2(player, Integer.parseInt(num));
					}
					if (quest.equals("eq1_3")) {
						QuestBoard qb = new QuestBoard();
						qb.eq1_3(player, Integer.parseInt(num));
					}
					if (quest.equals("eq1_4")) {
						QuestBoard qb = new QuestBoard();
						qb.eq1_4(player, Integer.parseInt(num));
					}
					if (quest.equals("eq1_5")) {
						QuestBoard qb = new QuestBoard();
						qb.eq1_5(player, Integer.parseInt(num));
					}
					if (quest.equals("eq1_6")) {
						QuestBoard qb = new QuestBoard();
						qb.eq1_6(player, Integer.parseInt(num));
					}
					if (quest.equals("eq2")) {
						QuestBoard qb = new QuestBoard();
						qb.eq2(player, Integer.parseInt(num));
					}
					if (quest.equals("eq2_1")) {
						QuestBoard qb = new QuestBoard();
						qb.eq2_1(player, Integer.parseInt(num));
					}
					if (quest.equals("eq2_2")) {
						QuestBoard qb = new QuestBoard();
						qb.eq2_2(player, Integer.parseInt(num));
					}
					if (quest.equals("mq1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq2")) {
						QuestBoard qb = new QuestBoard();
						qb.mq2(player, Integer.parseInt(num));
					}
					if (quest.equals("mq3")) {
						QuestBoard qb = new QuestBoard();
						qb.mq3(player, Integer.parseInt(num));
					}
					if (quest.equals("mq4")) {
						QuestBoard qb = new QuestBoard();
						qb.mq4(player, Integer.parseInt(num));
					}
					if (quest.equals("mq5")) {
						QuestBoard qb = new QuestBoard();
						qb.mq5(player, Integer.parseInt(num));
					}
					if (quest.equals("mq6")) {
						QuestBoard qb = new QuestBoard();
						qb.mq6(player, Integer.parseInt(num));
					}
					if (quest.equals("mq7")) {
						QuestBoard qb = new QuestBoard();
						qb.mq7(player, Integer.parseInt(num));
					}
					if (quest.equals("mq8")) {
						QuestBoard qb = new QuestBoard();
						qb.mq8(player, Integer.parseInt(num));
					}
					if (quest.equals("mq9")) {
						QuestBoard qb = new QuestBoard();
						qb.mq9(player, Integer.parseInt(num));
					}
					if (quest.equals("mq10")) {
						QuestBoard qb = new QuestBoard();
						qb.mq10(player, Integer.parseInt(num));
					}
					if (quest.equals("mq11")) {
						QuestBoard qb = new QuestBoard();
						qb.mq11(player, Integer.parseInt(num));
					}
					if (quest.equals("mq12")) {
						QuestBoard qb = new QuestBoard();
						qb.mq12(player, Integer.parseInt(num));
					}
					if (quest.equals("mq13")) {
						QuestBoard qb = new QuestBoard();
						qb.mq13(player, Integer.parseInt(num));
					}
					if (quest.equals("mq14")) {
						QuestBoard qb = new QuestBoard();
						qb.mq14(player, Integer.parseInt(num));
					}
					if (quest.equals("mq15")) {
						QuestBoard qb = new QuestBoard();
						qb.mq15(player, Integer.parseInt(num));
					}
					if (quest.equals("mq15_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq15_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq16")) {
						QuestBoard qb = new QuestBoard();
						qb.mq16(player, Integer.parseInt(num));
					}
					if (quest.equals("mq17")) {
						QuestBoard qb = new QuestBoard();
						qb.mq17(player, Integer.parseInt(num));
					}
					if (quest.equals("mq18")) {
						QuestBoard qb = new QuestBoard();
						qb.mq18(player, Integer.parseInt(num));
					}
					if (quest.equals("mq19")) {
						QuestBoard qb = new QuestBoard();
						qb.mq19(player, Integer.parseInt(num));
					}
					if (quest.equals("mq20")) {
						QuestBoard qb = new QuestBoard();
						qb.mq20(player, Integer.parseInt(num));
					}
					if (quest.equals("mq20_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq20_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq20_2")) {
						QuestBoard qb = new QuestBoard();
						qb.mq20_2(player, Integer.parseInt(num));
					}
					if (quest.equals("mq21")) {
						QuestBoard qb = new QuestBoard();
						qb.mq21(player, Integer.parseInt(num));
					}
					if (quest.equals("mq22")) {
						QuestBoard qb = new QuestBoard();
						qb.mq22(player, Integer.parseInt(num));
					}
					if (quest.equals("mq23")) {
						QuestBoard qb = new QuestBoard();
						qb.mq23(player, Integer.parseInt(num));
					}
					if (quest.equals("mq24")) {
						QuestBoard qb = new QuestBoard();
						qb.mq24(player, Integer.parseInt(num));
					}
					if (quest.equals("mq25")) {
						QuestBoard qb = new QuestBoard();
						qb.mq25(player, Integer.parseInt(num));
					}
					if (quest.equals("mq26")) {
						QuestBoard qb = new QuestBoard();
						qb.mq26(player, Integer.parseInt(num));
					}
					if (quest.equals("mq26_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq26_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq27")) {
						QuestBoard qb = new QuestBoard();
						qb.mq27(player, Integer.parseInt(num));
					}
					if (quest.equals("mq28")) {
						QuestBoard qb = new QuestBoard();
						qb.mq28(player, Integer.parseInt(num));
					}
					if (quest.equals("mq29")) {
						QuestBoard qb = new QuestBoard();
						qb.mq29(player, Integer.parseInt(num));
					}
					if (quest.equals("mq29_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq29_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq30")) {
						QuestBoard qb = new QuestBoard();
						qb.mq30(player, Integer.parseInt(num));
					}
					if (quest.equals("mq31")) {
						QuestBoard qb = new QuestBoard();
						qb.mq31(player, Integer.parseInt(num));
					}
					if (quest.equals("mq32")) {
						QuestBoard qb = new QuestBoard();
						qb.mq32(player, Integer.parseInt(num));
					}
					if (quest.equals("mq33")) {
						QuestBoard qb = new QuestBoard();
						qb.mq33(player, Integer.parseInt(num));
					}
					if (quest.equals("mq33_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq33_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq34")) {
						QuestBoard qb = new QuestBoard();
						qb.mq34(player, Integer.parseInt(num));
					}
					if (quest.equals("mq34_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq34_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq35")) {
						QuestBoard qb = new QuestBoard();
						qb.mq35(player, Integer.parseInt(num));
					}
					if (quest.equals("mq35_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq35_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq36")) {
						QuestBoard qb = new QuestBoard();
						qb.mq36(player, Integer.parseInt(num));
					}
					if (quest.equals("mq37")) {
						QuestBoard qb = new QuestBoard();
						qb.mq37(player, Integer.parseInt(num));
					}
					if (quest.equals("mq37_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq37_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq37_2")) {
						QuestBoard qb = new QuestBoard();
						qb.mq37_2(player, Integer.parseInt(num));
					}
					if (quest.equals("mq38")) {
						QuestBoard qb = new QuestBoard();
						qb.mq38(player, Integer.parseInt(num));
					}
					if (quest.equals("mq38_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq38_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq38_2")) {
						QuestBoard qb = new QuestBoard();
						qb.mq38_2(player, Integer.parseInt(num));
					}
					if (quest.equals("mq39")) {
						QuestBoard qb = new QuestBoard();
						qb.mq39(player, Integer.parseInt(num));
					}
					if (quest.equals("mq39_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq39_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq39_2")) {
						QuestBoard qb = new QuestBoard();
						qb.mq39_2(player, Integer.parseInt(num));
					}
					if (quest.equals("mq40")) {
						QuestBoard qb = new QuestBoard();
						qb.mq40(player, Integer.parseInt(num));
					}
					if (quest.equals("mq41")) {
						QuestBoard qb = new QuestBoard();
						qb.mq41(player, Integer.parseInt(num));
					}
					if (quest.equals("mq41_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq41_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq42")) {
						QuestBoard qb = new QuestBoard();
						qb.mq42(player, Integer.parseInt(num));
					}
					if (quest.equals("mq42_1")) {
						QuestBoard qb = new QuestBoard();
						qb.mq42_1(player, Integer.parseInt(num));
					}
					if (quest.equals("mq43")) {
						QuestBoard qb = new QuestBoard();
						qb.mq43(player, Integer.parseInt(num));
					}
					if (quest.equals("mq44")) {
						QuestBoard qb = new QuestBoard();
						qb.mq44(player, Integer.parseInt(num));
					}
					bufReader.close();
				} catch (Exception e) {
            		
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	public void giveMemento(Player player, String job, String fLevel) {
		if(job.equals("boneFighter")) {
			ItemStack memento = new ItemStack(Material.RED_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "본 파이터의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("knight")) {
			ItemStack memento = new ItemStack(Material.GREEN_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "기사의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("priest")) {
			ItemStack memento = new ItemStack(Material.LAPIS_LAZULI);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "프리스트의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("berserker1")) {
			ItemStack memento = new ItemStack(Material.CYAN_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "광전사의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("gambler")) {
			ItemStack memento = new ItemStack(Material.LIGHT_GRAY_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "도박사의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("devil")) {
			ItemStack memento = new ItemStack(Material.GRAY_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "데빌의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("angel")) {
			ItemStack memento = new ItemStack(Material.PINK_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "엔젤의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("agent")) {
			ItemStack memento = new ItemStack(Material.LIME_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "대행자의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("shadowKnight")) {
			ItemStack memento = new ItemStack(Material.YELLOW_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "그림자 무사의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("berserker2")) {
			ItemStack memento = new ItemStack(Material.LIGHT_BLUE_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "버서커의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("soldier")) {
			ItemStack memento = new ItemStack(Material.MAGENTA_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "군인의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("grimReaper")) {
			ItemStack memento = new ItemStack(Material.ORANGE_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "그림 리퍼의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("akuma")) {
			ItemStack memento = new ItemStack(Material.BLUE_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "마인의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("paladin")) {
			ItemStack memento = new ItemStack(Material.BROWN_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "팔라딘의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("dragonKnight")) {
			ItemStack memento = new ItemStack(Material.BLACK_DYE);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "용기사의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("commander")) {
			ItemStack memento = new ItemStack(Material.INK_SAC);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "대대장의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("archer")) {
			ItemStack memento = new ItemStack(Material.CLAY_BALL);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "아처의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		} else if(job.equals("powerRanger")) {
			ItemStack memento = new ItemStack(Material.GLOWSTONE_DUST);
			ItemMeta mementoIm = memento.getItemMeta();
			mementoIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			mementoIm.setDisplayName(ChatColor.GOLD + "파워레인저의 증표");
			mementoIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			mementoIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			memento.setItemMeta(mementoIm);
			fantasyLifeLevel(player, memento, fLevel);
			player.getInventory().setItem(7, memento);
		}
	}
	
	public void fantasyLifeLevel(Player player, ItemStack item, String level) {
		String[] lvl = level.split(" ");
		ArrayList<String> lore = new ArrayList();
		lore.add(ChatColor.GRAY + "장비 제작 레벨: " + lvl[0]);
		lore.add(ChatColor.GRAY + "포션 제작 레벨: " + lvl[1]);
		lore.add(ChatColor.GRAY + "음식 제작 레벨: " + lvl[2]);
		ItemMeta im = item.getItemMeta();
		im.setLore(lore);
		item.setItemMeta(im);
	}
	
}
