package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AnimalLoot {

	Random rnd = new Random();
	ExpSystem es = new ExpSystem();
	
	public boolean Loot(Player player, Entity animal, Location loc) {
		if(!(animal.getCustomName()==null)) {
			if(animal.getCustomName().equals(ChatColor.GREEN + "돼지")) {
				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "낡은 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1==0) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "미숙하게 채집된 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "미숙하게 채집된 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "미숙하게 채집된 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "미숙하게 채집된 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "적당한 크기의 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "적당한 크기의 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "은빛 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "적당한 크기의 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "적당한 크기의 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "맛있어 보이는 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "맛있어 보이는 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "금빛 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "맛있어 보이는 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "맛있어 보이는 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "좋은 육질의 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "좋은 육질의 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "장인이 만든 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "좋은 육질의 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "좋은 육질의 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "신선도가 뛰어난 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "신선도가 뛰어난 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "신의 채집도구")) {
					int num1 = rnd.nextInt(100);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "신선도가 뛰어난 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "신선도가 뛰어난 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 탐하는 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 탐하는 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "크루아흐의 채집도구")) {
					int num1 = rnd.nextInt(70);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "신선도가 뛰어난 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "신선도가 뛰어난 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.PORKCHOP);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 탐하는 돼지고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 탐하는 돼지고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else {
					player.sendMessage("채집도구를 이용해 고기를 얻을 수 있을 듯 하다.");
				}
				player.getWorld().playSound(loc, Sound.ENTITY_PIG_HURT, 1.0f, 1.0f);
				return true;
			}
			if(animal.getCustomName().equals(ChatColor.GREEN + "소")) {
				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "낡은 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1==0) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "캐넌 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "캐넌 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "캐넌 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "캐넌 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "유틸리티 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "유틸리티 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "은빛 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "유틸리티 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "유틸리티 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "스텐다드 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "스텐다드 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "금빛 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "스텐다드 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "스텐다드 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "셀렉트 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "셀렉트 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "장인이 만든 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "셀렉트 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "셀렉트 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "프라임 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "프라임 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "신의 채집도구")) {
					int num1 = rnd.nextInt(100);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "프라임 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "프라임 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 즐겨먹는 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 즐겨먹는 소고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "크루아흐의 채집도구")) {
					int num1 = rnd.nextInt(70);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "프라임 등급의 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "프라임 등급의 소고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.BEEF);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 즐겨먹는 소고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 즐겨먹는 소고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else {
					player.sendMessage("채집도구를 이용해 고기를 얻을 수 있을 듯 하다.");
				}
				player.getWorld().playSound(loc, Sound.ENTITY_COW_HURT, 1.0f, 1.0f);
				return true;
			}
			if(animal.getCustomName().equals(ChatColor.GREEN + "닭")) {				
				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "낡은 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1==0) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "2등급 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "2등급 닭고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "2등급 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "2등급 닭고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "1등급 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "1등급 닭고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "은빛 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "1등급 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "1등급 닭고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "1+등급 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "1+등급 닭고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "금빛 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "1+등급 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "1+등급 닭고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "닭의 품질을 넘어선 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "닭의 품질을 넘어선 닭고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "장인이 만든 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "닭의 품질을 넘어선 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "닭의 품질을 넘어선 닭고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "닭의 품질을 초월한 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "닭의 품질을 초월한 닭고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "신의 채집도구")) {
					int num1 = rnd.nextInt(100);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "닭의 품질을 초월한 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "닭의 품질을 초월한 닭고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 튀겨먹는 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 튀겨먹는 닭고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "크루아흐의 채집도구")) {
					int num1 = rnd.nextInt(70);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "닭의 품질을 초월한 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "닭의 품질을 초월한 닭고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.CHICKEN);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 튀겨먹는 닭고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 튀겨먹는 닭고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else {
					player.sendMessage("채집도구를 이용해 고기를 얻을 수 있을 듯 하다.");
				}
				player.getWorld().playSound(loc, Sound.ENTITY_CHICKEN_HURT, 1.0f, 1.0f);
				return true;
			}
			if(animal.getCustomName().equals(ChatColor.GREEN + "양")) {					
				if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "낡은 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1==0) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "베타램 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "베타램 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "평범한 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.GRAY + "베타램 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.GRAY + "베타램 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "램(Lamb) 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "램(Lamb) 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "은빛 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.WHITE + "램(Lamb) 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 50000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.WHITE + "램(Lamb) 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "호겟 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "호겟 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "금빛 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.YELLOW + "호겟 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 600000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.YELLOW + "호겟 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "머튼 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "머튼 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "장인이 만든 채집도구")) {
					int num1 = rnd.nextInt(10);
					if(num1<=2) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "머튼 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 7000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "머튼 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==3) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "램(Ram) 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "램(Ram) 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "신의 채집도구")) {
					int num1 = rnd.nextInt(100);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "램(Ram) 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "램(Ram) 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 인정한 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 인정한 양고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "크루아흐의 채집도구")) {
					int num1 = rnd.nextInt(70);
					if(num1<=20) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.AQUA + "램(Ram) 등급의 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 10000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.AQUA + "램(Ram) 등급의 양고기" + ChatColor.WHITE + "를 획득했다.");
					} else if(num1==21) { 
						ItemStack var1 = new ItemStack(Material.MUTTON);
						ItemMeta var1Im = var1.getItemMeta();
						var1Im.setDisplayName(ChatColor.DARK_RED + "신이 인정한 양고기");
						var1.setItemMeta(var1Im);
						player.getInventory().addItem(var1);
						//es.giveExp(player, 20000000);
						player.getWorld().playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						player.sendMessage(ChatColor.DARK_RED + "신이 인정한 양고기" + ChatColor.WHITE + "를 획득했다.");
					}
				} else {
					player.sendMessage("채집도구를 이용해 고기를 얻을 수 있을 듯 하다.");
				}
				player.getWorld().playSound(loc, Sound.ENTITY_SHEEP_HURT, 1.0f, 1.0f);
				return true;
			}
		}
		return false;
	}
	
}
