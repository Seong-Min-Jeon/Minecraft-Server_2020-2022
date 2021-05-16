package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class NewCharacter {

	public NewCharacter(Player player, File folder) {
		Inventory inv = Bukkit.createInventory(player, 18, "New Character");
		
		ItemStack star1 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star1Im = star1.getItemMeta();
		star1Im.setDisplayName(ChatColor.YELLOW + "본 파이터의 별");
		ArrayList<String> star1Lore = new ArrayList();
		star1Lore.add(ChatColor.WHITE + "뼈를 이용한 다채로운 전투를 즐길 수 있다.");
		star1Lore.add(ChatColor.WHITE + "(뼈 이외의 근접무기로 공격을 할 수 없다.)");
		star1Im.setLore(star1Lore);
		star1.setItemMeta(star1Im);
		
		ItemStack star2 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star2Im = star2.getItemMeta();
		star2Im.setDisplayName(ChatColor.YELLOW + "기사의 별");
		ArrayList<String> star2Lore = new ArrayList();
		star2Lore.add(ChatColor.WHITE + "소환물을 소환해 싸워나갈 수 있다.");
		star2Im.setLore(star2Lore);
		star2.setItemMeta(star2Im);
		
		ItemStack star3 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star3Im = star3.getItemMeta();
		star3Im.setDisplayName(ChatColor.YELLOW + "프리스트의 별");
		ArrayList<String> star3Lore = new ArrayList();
		star3Lore.add(ChatColor.WHITE + "회복 기술을 사용하여 자신과 아군을 지킬 수 있다.");
		star3Im.setLore(star3Lore);
		star3.setItemMeta(star3Im);
		
		ItemStack star4 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star4Im = star4.getItemMeta();
		star4Im.setDisplayName(ChatColor.YELLOW + "광전사의 별");
		ArrayList<String> star4Lore = new ArrayList();
		star4Lore.add(ChatColor.WHITE + "강한 공격력으로 적을 찍어내릴 수 있다.");
		star4Im.setLore(star4Lore);
		star4.setItemMeta(star4Im);
		
		ItemStack star5 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star5Im = star5.getItemMeta();
		star5Im.setDisplayName(ChatColor.YELLOW + "도박사의 별");
		ArrayList<String> star5Lore = new ArrayList();
		star5Lore.add(ChatColor.WHITE + "운에 승패를 거는 직업이다.");
		star5Im.setLore(star5Lore);
		star5.setItemMeta(star5Im);
		
		ItemStack star6 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star6Im = star6.getItemMeta();
		star6Im.setDisplayName(ChatColor.LIGHT_PURPLE + "그림자 무사의 별");
		ArrayList<String> star6Lore = new ArrayList();
		star6Lore.add(ChatColor.WHITE + "스피디한 플레이를 즐길 수 있다.");
		star6Im.setLore(star6Lore);
		star6.setItemMeta(star6Im);
		
		ItemStack star7 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star7Im = star7.getItemMeta();
		star7Im.setDisplayName(ChatColor.LIGHT_PURPLE + "버서커의 별");
		ArrayList<String> star7Lore = new ArrayList();
		star7Lore.add(ChatColor.WHITE + "압도적인 힘으로 적을 섬멸할 수 있다.");
		star7Im.setLore(star7Lore);
		star7.setItemMeta(star7Im);
		
		ItemStack star8 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star8Im = star8.getItemMeta();
		star8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "군인의 별");
		ArrayList<String> star8Lore = new ArrayList();
		star8Lore.add(ChatColor.WHITE + "남녀노소 즐길 수 있는 우직한 전사가 된다.");
		star8Lore.add(ChatColor.WHITE + "(곡괭이 이외의 근접무기로 공격을 할 수 없다.)");
		star8Im.setLore(star8Lore);
		star8.setItemMeta(star8Im);
		
		ItemStack star9 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star9Im = star9.getItemMeta();
		star9Im.setDisplayName(ChatColor.LIGHT_PURPLE + "그림 리퍼의 별");
		ArrayList<String> star9Lore = new ArrayList();
		star9Lore.add(ChatColor.WHITE + "낫을 들고 싸우는 사신의 후손이 된다.");
		star9Lore.add(ChatColor.WHITE + "(낫 이외의 근접무기로 공격을 할 수 없다.)");
		star9Im.setLore(star9Lore);
		star9.setItemMeta(star9Im);
		
		ItemStack star10 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star10Im = star10.getItemMeta();
		star10Im.setDisplayName(ChatColor.LIGHT_PURPLE + "아처의 별");
		ArrayList<String> star10Lore = new ArrayList();
		star10Lore.add(ChatColor.WHITE + "근거리 전투와 다른 색다른 전투를 할 수 있다.");
		star10Im.setLore(star10Lore);
		star10.setItemMeta(star10Im);
		
		ItemStack star11 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star11Im = star11.getItemMeta();
		star11Im.setDisplayName(ChatColor.AQUA + "데빌의 별");
		ArrayList<String> star11Lore = new ArrayList();
		star11Lore.add(ChatColor.WHITE + "데빌의 사악한 힘을 얻을 수 있다.");
		star11Im.setLore(star11Lore);
		star11.setItemMeta(star11Im);
		
		ItemStack star12 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star12Im = star12.getItemMeta();
		star12Im.setDisplayName(ChatColor.AQUA + "엔젤의 별");
		ArrayList<String> star12Lore = new ArrayList();
		star12Lore.add(ChatColor.WHITE + "엔젤의 힘으로 자신과 아군을 보호할 수 있다.");
		star12Im.setLore(star12Lore);
		star12.setItemMeta(star12Im);
		
		ItemStack star13 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star13Im = star13.getItemMeta();
		star13Im.setDisplayName(ChatColor.AQUA + "대행자의 별");
		ArrayList<String> star13Lore = new ArrayList();
		star13Lore.add(ChatColor.WHITE + "신의 힘을 빌려 싸울 수 있다.");
		star13Im.setLore(star13Lore);
		star13.setItemMeta(star13Im);
		
		ItemStack star14 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star14Im = star14.getItemMeta();
		star14Im.setDisplayName(ChatColor.DARK_RED + "마인의 별");
		ArrayList<String> star14Lore = new ArrayList();
		star14Lore.add(ChatColor.WHITE + "태초의 마나를 사용하던 종족인 마인이 된다.");
		star14Im.setLore(star14Lore);
		star14.setItemMeta(star14Im);
		
		ItemStack star15 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star15Im = star15.getItemMeta();
		star15Im.setDisplayName(ChatColor.DARK_RED + "팔라딘의 별");
		ArrayList<String> star15Lore = new ArrayList();
		star15Lore.add(ChatColor.WHITE + "신의 병사인 팔라딘이 되어 전투할 수 있다.");
		star15Im.setLore(star15Lore);
		star15.setItemMeta(star15Im);
		
		ItemStack star16 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star16Im = star16.getItemMeta();
		star16Im.setDisplayName(ChatColor.DARK_RED + "용기사의 별");
		ArrayList<String> star16Lore = new ArrayList();
		star16Lore.add(ChatColor.WHITE + "용의 힘을 사용할 수 있다.");
		star16Im.setLore(star16Lore);
		star16.setItemMeta(star16Im);
		
		ItemStack star17 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star17Im = star17.getItemMeta();
		star17Im.setDisplayName(ChatColor.DARK_RED + "조커의 별");
		ArrayList<String> star17Lore = new ArrayList();
		star17Lore.add(ChatColor.WHITE + "총을 사용하는 무자비한 광란의 삶을 즐길 수 있다.");
		star17Im.setLore(star17Lore);
		star17.setItemMeta(star17Im);
		
		ItemStack star18 = new ItemStack(Material.NETHER_STAR);
		ItemMeta star18Im = star18.getItemMeta();
		star18Im.setDisplayName(ChatColor.DARK_RED + "파워레인저의 별");
		ArrayList<String> star18Lore = new ArrayList();
		star18Lore.add(ChatColor.WHITE + "더욱 화려하게 활을 사용할 수 있다.");
		star18Im.setLore(star18Lore);
		star18.setItemMeta(star18Im);
		
		ItemStack bar = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
		ItemMeta barIm = bar.getItemMeta();
		barIm.setDisplayName(ChatColor.RED + " ");
		barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		bar.setItemMeta(barIm);
		
		inv.setItem(0, bar);
		inv.setItem(1, bar);
		inv.setItem(2, bar);
		inv.setItem(3, bar);
		inv.setItem(4, bar);
		inv.setItem(5, bar);
		inv.setItem(6, bar);
		inv.setItem(7, bar);
		inv.setItem(8, bar);
		inv.setItem(9, bar);
		inv.setItem(10, bar);
		inv.setItem(11, bar);
		inv.setItem(12, bar);
		inv.setItem(13, bar);
		inv.setItem(14, bar);
		inv.setItem(15, bar);
		inv.setItem(16, bar);
		inv.setItem(17, bar);
		
		// 생성 가능 캐릭터 파일
		try {
			File dataFolder = folder;
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				File dir = new File(folder + "/" + player.getUniqueId().toString());
				if (!dir.exists()) {
					try {
						dir.mkdir();
					} catch (Exception e) {
						e.getStackTrace();
					}
				}
				File file = new File(dir, "available_character.dat");
				if (!file.exists()) {
					try {
						file.createNewFile();
						BufferedWriter fw = new BufferedWriter(
								new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
						fw.write("1 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0");
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				FileReader filereader = new FileReader(file);
                BufferedReader bufReader = new BufferedReader(filereader);
                String data;
                data = bufReader.readLine();
                String[] ary = data.split(" ");
                if(!ary[0].equals("0")) {
                	inv.setItem(0, star1);
                }
                if(!ary[1].equals("0")) {
                	inv.setItem(1, star2);
                }
                if(!ary[2].equals("0")) {
                	inv.setItem(2, star3);
                }
                if(!ary[3].equals("0")) {
                	inv.setItem(3, star4);
                } 
                if(!ary[4].equals("0")) {
                	inv.setItem(4, star5);
                } 
                if(!ary[5].equals("0")) {
                	inv.setItem(5, star6);
                } 
                if(!ary[6].equals("0")) {
                	inv.setItem(6, star7);
                } 
                if(!ary[7].equals("0")) {
                	inv.setItem(7, star8);
                } 
                if(!ary[8].equals("0")) {
                	inv.setItem(8, star9);
                } 
                if(!ary[9].equals("0")) {
                	inv.setItem(9, star10);
                } 
                if(!ary[10].equals("0")) {
                	inv.setItem(10, star11);
                } 
                if(!ary[11].equals("0")) {
                	inv.setItem(11, star12);
                } 
                if(!ary[12].equals("0")) {
                	inv.setItem(12, star13);
                } 
                if(!ary[13].equals("0")) {
                	inv.setItem(13, star14);
                } 
                if(!ary[14].equals("0")) {
                	inv.setItem(14, star15);
                } 
                if(!ary[15].equals("0")) {
                	inv.setItem(15, star16);
                } 
                if(!ary[16].equals("0")) {
                	inv.setItem(16, star17);
                } 
                if(!ary[17].equals("0")) {
                	inv.setItem(17, star18);
                }
                bufReader.close();
			}
		} catch (Exception e) {

		}
		player.openInventory(inv);
	}
	
}
