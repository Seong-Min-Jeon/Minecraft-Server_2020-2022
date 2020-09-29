package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinJob {

	public void chooseJob(Player player) {
		World world = player.getWorld();
		if(!(player.getInventory().contains(Material.RED_DYE)) && !(player.getInventory().contains(Material.GREEN_DYE)) 
				&& !(player.getInventory().contains(Material.LAPIS_LAZULI)) && !(player.getInventory().contains(Material.CYAN_DYE))
				&& !(player.getInventory().contains(Material.LIGHT_GRAY_DYE)) && !(player.getInventory().contains(Material.GRAY_DYE))
				&& !(player.getInventory().contains(Material.PINK_DYE)) && !(player.getInventory().contains(Material.LIME_DYE))
				&& !(player.getInventory().contains(Material.YELLOW_DYE)) && !(player.getInventory().contains(Material.LIGHT_BLUE_DYE))
				&& !(player.getInventory().contains(Material.MAGENTA_DYE)) && !(player.getInventory().contains(Material.ORANGE_DYE))
				&& !(player.getInventory().contains(Material.BLUE_DYE)) && !(player.getInventory().contains(Material.BROWN_DYE))
				&& !(player.getInventory().contains(Material.BLACK_DYE)) && !(player.getInventory().contains(Material.INK_SAC))
				&& !(player.getInventory().contains(Material.CLAY_BALL)) && !(player.getInventory().contains(Material.GLOWSTONE_DUST))) {
			player.teleport(new Location(world,-1870,60,3005));
			player.getInventory().clear();
			
			ItemStack star1 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star1Im = star1.getItemMeta();
			star1Im.setDisplayName(ChatColor.YELLOW + "본 파이터의 별");
			ArrayList<String> star1Lore = new ArrayList();
			star1Lore.add(ChatColor.WHITE + "뼈를 이용한 전투를 할 수 있다.");
			star1Lore.add(ChatColor.WHITE + "(검을 이용한 공격을 할 수 없다.)");
			star1Lore.add(ChatColor.WHITE + "체력" + ChatColor.RED + "♡♡♡♡♡");
			star1Im.setLore(star1Lore);
			star1.setItemMeta(star1Im);
			player.getInventory().setItem(0,star1);	
			
			ItemStack star2 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star2Im = star2.getItemMeta();
			star2Im.setDisplayName(ChatColor.YELLOW + "기사의 별");
			ArrayList<String> star2Lore = new ArrayList();
			star2Lore.add(ChatColor.WHITE + "아군을 소환하며 싸우는 다채로운 직업이다.");
			star2Lore.add(ChatColor.WHITE + "체력" + ChatColor.RED + "♡♡♡");
			star2Im.setLore(star2Lore);
			star2.setItemMeta(star2Im);
			player.getInventory().setItem(1,star2);	
			
			ItemStack star3 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star3Im = star3.getItemMeta();
			star3Im.setDisplayName(ChatColor.YELLOW + "프리스트의 별");
			ArrayList<String> star3Lore = new ArrayList();
			star3Lore.add(ChatColor.WHITE + "회복 기술을 사용하며 싸울 수 있는 직업이다.");
			star3Lore.add(ChatColor.WHITE + "체력" + ChatColor.RED + "♡♡♡♡");
			star3Im.setLore(star3Lore);
			star3.setItemMeta(star3Im);
			player.getInventory().setItem(2,star3);
			
			ItemStack star4 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star4Im = star4.getItemMeta();
			star4Im.setDisplayName(ChatColor.YELLOW + "광전사의 별");
			ArrayList<String> star4Lore = new ArrayList();
			star4Lore.add(ChatColor.WHITE + "체력이 낮지만 성장할수록 힘이 강해진다.");
			star4Lore.add(ChatColor.WHITE + "체력" + ChatColor.RED + "♡");
			star4Im.setLore(star4Lore);
			star4.setItemMeta(star4Im);
			player.getInventory().setItem(3,star4);
			
			ItemStack star5 = new ItemStack(Material.NETHER_STAR);
			ItemMeta star5Im = star5.getItemMeta();
			star5Im.setDisplayName(ChatColor.YELLOW + "도박사의 별");
			ArrayList<String> star5Lore = new ArrayList();
			star5Lore.add(ChatColor.WHITE + "운에 승패를 거는 직업이다.");
			star5Lore.add(ChatColor.WHITE + "체력" + ChatColor.RED + "♡♡♡♡♡");
			star5Im.setLore(star5Lore);
			star5.setItemMeta(star5Im);
			player.getInventory().setItem(4,star5);
			
			if(player.getDisplayName().equals("yumehama") || player.getDisplayName().equalsIgnoreCase("woolring")) {
				ItemStack star6 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star6Im = star6.getItemMeta();
				star6Im.setDisplayName(ChatColor.AQUA + "데빌의 별");
				ArrayList<String> star6Lore = new ArrayList();
				star6Lore.add(ChatColor.WHITE + "데빌의 힘을 얻을 수 있다.");
				star6Im.setLore(star6Lore);
				star6.setItemMeta(star6Im);
				player.getInventory().setItem(5,star6);
				
				ItemStack star7 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star7Im = star7.getItemMeta();
				star7Im.setDisplayName(ChatColor.AQUA + "엔젤의 별");
				ArrayList<String> star7Lore = new ArrayList();
				star7Lore.add(ChatColor.WHITE + "엔젤의 힘을 얻을 수 있다.");
				star7Im.setLore(star7Lore);
				star7.setItemMeta(star7Im);
				player.getInventory().setItem(6,star7);
				
				ItemStack star8 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star8Im = star8.getItemMeta();
				star8Im.setDisplayName(ChatColor.AQUA + "대행자의 별");
				ArrayList<String> star8Lore = new ArrayList();
				star8Lore.add(ChatColor.WHITE + "신의 힘을 빌려 싸울 수 있다.");
				star8Im.setLore(star8Lore);
				star8.setItemMeta(star8Im);
				player.getInventory().setItem(7,star8);
				
				ItemStack star9 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star9Im = star9.getItemMeta();
				star9Im.setDisplayName(ChatColor.LIGHT_PURPLE + "그림자 무사의 별");
				ArrayList<String> star9Lore = new ArrayList();
				star9Lore.add(ChatColor.WHITE + "빠른 움직임으로 적을 공격할 수 있다.");
				star9Im.setLore(star9Lore);
				star9.setItemMeta(star9Im);
				player.getInventory().setItem(8,star9);
				
				ItemStack star10 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star10Im = star10.getItemMeta();
				star10Im.setDisplayName(ChatColor.LIGHT_PURPLE + "버서커의 별");
				ArrayList<String> star10Lore = new ArrayList();
				star10Lore.add(ChatColor.WHITE + "압도적인 힘으로 적을 섬멸할 수 있다.");
				star10Im.setLore(star10Lore);
				star10.setItemMeta(star10Im);
				player.getInventory().setItem(9,star10);
				
				ItemStack star11 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star11Im = star11.getItemMeta();
				star11Im.setDisplayName(ChatColor.LIGHT_PURPLE + "군인의 별");
				ArrayList<String> star11Lore = new ArrayList();
				star11Lore.add(ChatColor.WHITE + "끈기있게 채광을 할 수 있는 직업이다.");
				star11Lore.add(ChatColor.WHITE + "(곡괭이 이외의 근접무기로 공격을 할 수 없다.)");
				star11Im.setLore(star11Lore);
				star11.setItemMeta(star11Im);
				player.getInventory().setItem(10,star11);
				
				ItemStack star12 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star12Im = star12.getItemMeta();
				star12Im.setDisplayName(ChatColor.LIGHT_PURPLE + "그림 리퍼의 별");
				ArrayList<String> star12Lore = new ArrayList();
				star12Lore.add(ChatColor.WHITE + "낫을 들고 싸우는 사신의 후손이 된다.");
				star12Lore.add(ChatColor.WHITE + "(다른 무기를 이용한 공격을 할 수 없다.)");
				star12Im.setLore(star12Lore);
				star12.setItemMeta(star12Im);
				player.getInventory().setItem(11,star12);
				
				ItemStack star13 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star13Im = star13.getItemMeta();
				star13Im.setDisplayName(ChatColor.DARK_RED + "마인의 별");
				ArrayList<String> star13Lore = new ArrayList();
				star13Lore.add(ChatColor.WHITE + "태초의 마나를 사용하던 종족인 마인이 된다.");
				star13Im.setLore(star13Lore);
				star13.setItemMeta(star13Im);
				player.getInventory().setItem(12,star13);
				
				ItemStack star14 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star14Im = star14.getItemMeta();
				star14Im.setDisplayName(ChatColor.DARK_RED + "팔라딘의 별");
				ArrayList<String> star14Lore = new ArrayList();
				star14Lore.add(ChatColor.WHITE + "신의 병사인 팔라딘이 되어 전투할 수 있다.");
				star14Im.setLore(star14Lore);
				star14.setItemMeta(star14Im);
				player.getInventory().setItem(13,star14);
				
				ItemStack star15 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star15Im = star15.getItemMeta();
				star15Im.setDisplayName(ChatColor.DARK_RED + "용기사의 별");
				ArrayList<String> star15Lore = new ArrayList();
				star15Lore.add(ChatColor.WHITE + "용의 힘을 사용할 수 있다.");
				star15Im.setLore(star15Lore);
				star15.setItemMeta(star15Im);
				player.getInventory().setItem(14,star15);
				
				ItemStack star16 = new ItemStack(Material.NETHER_STAR);
				ItemMeta star16Im = star16.getItemMeta();
				star16Im.setDisplayName(ChatColor.LIGHT_PURPLE + "아처의 별");
				ArrayList<String> star16Lore = new ArrayList();
				star16Lore.add(ChatColor.WHITE + "활에 특화된 직업이다.");
				star16Im.setLore(star16Lore);
				star16.setItemMeta(star16Im);
				player.getInventory().setItem(15,star16);
			}
			
//			if(player.getDisplayName().equals("WoolRing")) {
//				ItemStack star16 = new ItemStack(Material.NETHER_STAR);
//				ItemMeta star16Im = star16.getItemMeta();
//				star16Im.setDisplayName(ChatColor.LIGHT_PURPLE + "아처의 별");
//				ArrayList<String> star16Lore = new ArrayList();
//				star16Lore.add(ChatColor.WHITE + "활에 특화된 직업이다.");
//				star16Im.setLore(star16Lore);
//				star16.setItemMeta(star16Im);
//				player.getInventory().setItem(15,star16);
//			}
		}
	}
}
