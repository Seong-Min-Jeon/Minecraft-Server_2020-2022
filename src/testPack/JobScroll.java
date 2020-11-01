	package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JobScroll {

	public void chooseJob(Player player, Item itemArg) {
		World world = player.getWorld();
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "본 파이터의 별")) {
			ItemStack job = new ItemStack(Material.RED_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "본 파이터의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//너클
			ItemStack knuckle = new ItemStack(Material.BONE);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "고대 드래곤의 뼈");
			knuckle.setItemMeta(knuckleIm);	
			player.getInventory().setItem(0, knuckle);
			//tp
			Location loc = new Location(world,3697, 42, 3679);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
			Location loc2 = new Location(world,3697, 42, 3690);
			Skeleton mob = (Skeleton) world.spawnEntity(loc2, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = new ItemStack(Material.SKELETON_SKULL);
			head.setHelmet(headItem);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "기사의 별")) {
			ItemStack job = new ItemStack(Material.GREEN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "기사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
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
			//tp
			Location loc = new Location(world,3697, 42, 3679);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
			Location loc2 = new Location(world,3697, 42, 3690);
			Skeleton mob = (Skeleton) world.spawnEntity(loc2, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = new ItemStack(Material.SKELETON_SKULL);
			head.setHelmet(headItem);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "프리스트의 별")) {
			ItemStack job = new ItemStack(Material.LAPIS_LAZULI);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "프리스트의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
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
			//tp
			Location loc = new Location(world,3697, 42, 3679);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
			Location loc2 = new Location(world,3697, 42, 3690);
			Skeleton mob = (Skeleton) world.spawnEntity(loc2, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = new ItemStack(Material.SKELETON_SKULL);
			head.setHelmet(headItem);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "광전사의 별")) {
			ItemStack job = new ItemStack(Material.CYAN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "광전사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
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
			//tp
			Location loc = new Location(world,3697, 42, 3679);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
			Location loc2 = new Location(world,3697, 42, 3690);
			Skeleton mob = (Skeleton) world.spawnEntity(loc2, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = new ItemStack(Material.SKELETON_SKULL);
			head.setHelmet(headItem);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "도박사의 별")) {
			ItemStack job = new ItemStack(Material.LIGHT_GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "도박사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
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
			//tp
			Location loc = new Location(world,3697, 42, 3679);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
			Location loc2 = new Location(world,3697, 42, 3690);
			Skeleton mob = (Skeleton) world.spawnEntity(loc2, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = new ItemStack(Material.SKELETON_SKULL);
			head.setHelmet(headItem);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "데빌의 별")) {
			ItemStack job = new ItemStack(Material.GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "데빌의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.JUNGLE_PLANKS);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("666,300,0,0,100,666,0,0,0,666,0");
			item5Im.setDisplayName(ChatColor.DARK_RED + "데빌 스워드");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "상위 악마에게 하사 받은 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
			//player.kickPlayer(ChatColor.RED + "Error Code:" + ChatColor.MAGIC + " Hi My Name Is Yumehama(The God)"
			//		+ "\n" + ChatColor.GRAY + "당신의 선택에 의해 계정이 타락하고 있습니다.");
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "엔젤의 별")) {
			ItemStack job = new ItemStack(Material.PINK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "엔젤의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.BIRCH_PLANKS);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("500,0,0,0,0,1000,200,200,200,500,0");
			item5Im.setDisplayName(ChatColor.DARK_RED + "엔젤 스워드");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "대천사에게 하사 받은 성검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "대행자의 별")) {
			ItemStack job = new ItemStack(Material.LIME_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "대행자의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.BIRCH_LOG);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("777,77,77,77,77,777,777,777,777,777,0");
			item5Im.setDisplayName(ChatColor.DARK_RED + "신의 힘을 담은 검");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "안바르의 비늘로 만들어진 성검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "그림자 무사의 별")) {
			ItemStack job = new ItemStack(Material.YELLOW_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "그림자 무사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.SPRUCE_LOG);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("30,5,5,5,0,0,0,0,0,0");
			item5Im.setDisplayName(ChatColor.AQUA + "죽음의 무도");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "악마와의 계약이 되어있는 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "버서커의 별")) {
			ItemStack job = new ItemStack(Material.LIGHT_BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "버서커의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.SPRUCE_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("50,0,0,0,5,0,0,0,0,0");
			item5Im.setDisplayName(ChatColor.AQUA + "반란군의 대검");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "휘두르는 것으로 보이는 적을 섬멸할 수 있는 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "군인의 별")) {
			ItemStack job = new ItemStack(Material.MAGENTA_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "군인의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "그림 리퍼의 별")) {
			ItemStack job = new ItemStack(Material.ORANGE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "그림 리퍼의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//머리
			ItemStack item5 = new ItemStack(Material.SKELETON_SKULL);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GOLD + "" + player.getDisplayName() + "의 머리");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5.setItemMeta(item5Im);
			player.getInventory().setItem(39, item5);	
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,Integer.MAX_VALUE,0));
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "마인의 별")) {
			ItemStack job = new ItemStack(Material.BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "마인의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("500,0,0,0,10,300,0,0,0,100");
			item5Im.setDisplayName(ChatColor.DARK_RED + "발리사르도");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "죽은 자들의 마나를 응축시켜 만들어진 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
			//player.kickPlayer(ChatColor.RED + "Error Code:" + ChatColor.MAGIC + " Hi My Name Is Yumehama(The God)"
			//		+ "\n" + ChatColor.GRAY + "당신의 선택에 의해 계정이 타락하고 있습니다.");
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "팔라딘의 별")) {
			ItemStack job = new ItemStack(Material.BROWN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "팔라딘의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("100,0,0,0,0,1000,0,0,0,1000");
			item5Im.setDisplayName(ChatColor.DARK_RED + "지키는 자의 검");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "전투의 신에게 하사 받은 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "용기사의 별")) {
			ItemStack job = new ItemStack(Material.BLACK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "용기사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("200,0,0,0,0,500,0,0,0,1500");
			item5Im.setDisplayName(ChatColor.DARK_RED + "산귀스");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "용의 역린이 들어간 봉인된 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "아처의 별")) {
			ItemStack job = new ItemStack(Material.CLAY_BALL);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "아처의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			player.setLevel(0);
			player.setExp(0);
			player.setMaxHealth(20);
			player.setHealth(20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects()){
		        player.removePotionEffect(effect.getType());
		    }
			//무기
			ItemStack item5 = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("0");
			item5Im.setDisplayName(ChatColor.GOLD + "그란마그");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "땅 속성이 깃들어 있는 활");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		//보존의 별 ==================================================================================================================================================
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "보존의 본 파이터의 별")) {
			ItemStack job = new ItemStack(Material.RED_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "본 파이터의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*10);
			player.setHealth(20 + lvl*10);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//너클
			ItemStack knuckle = new ItemStack(Material.BONE);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "고대 드래곤의 뼈");
			knuckle.setItemMeta(knuckleIm);	
			player.getInventory().setItem(0, knuckle);
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "보존의 기사의 별")) {
			ItemStack job = new ItemStack(Material.GREEN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "기사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*3);
			player.setHealth(20 + lvl*3);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "나뭇가지");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누군가 오래 사용한 것 같은 목검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "보존의 프리스트의 별")) {
			ItemStack job = new ItemStack(Material.LAPIS_LAZULI);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "프리스트의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*5);
			player.setHealth(20 + lvl*5);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "나뭇가지");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누군가 오래 사용한 것 같은 목검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//방패
			ItemStack knuckle = new ItemStack(Material.SHIELD);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "프리스트의 방패");
			knuckleIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			knuckleIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			knuckleIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			knuckleIm.setUnbreakable(true);
			knuckle.setItemMeta(knuckleIm);	
			player.getInventory().setItem(40, knuckle);
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "보존의 광전사의 별")) {
			ItemStack job = new ItemStack(Material.CYAN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "광전사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl);
			player.setHealth(20 + lvl);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "나뭇가지");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누군가 오래 사용한 것 같은 목검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "보존의 도박사의 별")) {
			ItemStack job = new ItemStack(Material.LIGHT_GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "도박사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*8);
			player.setHealth(20 + lvl*8);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "나뭇가지");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누군가 오래 사용한 것 같은 목검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "보존의 데빌의 별")) {
			ItemStack job = new ItemStack(Material.GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "데빌의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*20);
			player.setHealth(20 + lvl*20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "데빌 스워드");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "계시자 카사르가 가지고 있던 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "보존의 엔젤의 별")) {
			ItemStack job = new ItemStack(Material.PINK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "엔젤의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*30);
			player.setHealth(20 + lvl*30);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.THORNS, 99, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "엔젤 스워드");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "마나난 맥 리르에게 받은 성검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "보존의 대행자의 별")) {
			ItemStack job = new ItemStack(Material.LIME_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "대행자의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*20);
			player.setHealth(20 + lvl*20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.FIRE_ASPECT, 99, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "신의 힘을 담은 검");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "안바르의 비늘로 만들어진 성검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "보존의 그림자 무사의 별")) {
			ItemStack job = new ItemStack(Material.YELLOW_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "그림자 무사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*8);
			player.setHealth(20 + lvl*8);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.GOLDEN_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 30, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);
			item5Im.setDisplayName(ChatColor.AQUA + "죽음의 무도");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "악마와의 계약이 되어있는 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "보존의 버서커의 별")) {
			ItemStack job = new ItemStack(Material.LIGHT_BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "버서커의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*3);
			player.setHealth(20 + lvl*3);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.GOLDEN_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 25, true);
			item5Im.addEnchant(Enchantment.KNOCKBACK, 3, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 6, true);
			item5Im.setDisplayName(ChatColor.AQUA + "반란군의 대검");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "휘두르는 것으로 보이는 적을 섬멸할 수 있는 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "보존의 군인의 별")) {
			ItemStack job = new ItemStack(Material.MAGENTA_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "군인의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*15);
			player.setHealth(20 + lvl*15);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "보존의 그림 리퍼의 별")) {
			ItemStack job = new ItemStack(Material.ORANGE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "그림 리퍼의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*10);
			player.setHealth(20 + lvl*10);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//머리
			ItemStack item5 = new ItemStack(Material.SKELETON_SKULL);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GOLD + "" + player.getDisplayName() + "의 머리");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5.setItemMeta(item5Im);
			player.getInventory().setItem(39, item5);	
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,Integer.MAX_VALUE,0));
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "보존의 마인의 별")) {
			ItemStack job = new ItemStack(Material.BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "마인의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*50);
			player.setHealth(20 + lvl*50);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
			item5Im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
			item5Im.addEnchant(Enchantment.KNOCKBACK, 4, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "발리사르도");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "죽은 자들의 마나를 응축시켜 만들어진 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "보존의 팔라딘의 별")) {
			ItemStack job = new ItemStack(Material.BROWN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "팔라딘의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*99);
			player.setHealth(20 + lvl*99);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "보존의 용기사의 별")) {
			ItemStack job = new ItemStack(Material.BLACK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "용기사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*80);
			player.setHealth(20 + lvl*80);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.THORNS, 500, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "산귀스");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "피를 탐하던 악마가 봉인된 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "보존의 아처의 별")) {
			ItemStack job = new ItemStack(Material.CLAY_BALL);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "아처의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel() / 2;
			player.setLevel(lvl);
			player.setExp(0);
			player.setMaxHealth(20 + lvl*10);
			player.setHealth(20 + lvl*10);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for(PotionEffect effect : player.getActivePotionEffects ()){
		        player.removePotionEffect(effect.getType());
		    }
			//무기
			ItemStack item5 = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.WHITE + "초보자용 활");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누구나 사용할 수 있을 것 같다.");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		//완전 보존의 별 ==================================================================================================================================================
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.AQUA + "완전 보존의 본 파이터의 별")) {
			ItemStack job = new ItemStack(Material.RED_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "본 파이터의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl*10);
			player.setHealth(20 + lvl*10);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			// 마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// 너클
			ItemStack knuckle = new ItemStack(Material.BONE);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "고대 드래곤의 뼈");
			knuckle.setItemMeta(knuckleIm);
			player.getInventory().setItem(0, knuckle);
			// tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.AQUA + "완전 보존의 기사의 별")) {
			ItemStack job = new ItemStack(Material.GREEN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "기사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl*3);
			player.setHealth(20 + lvl*3);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			// 마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// 무기
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "나뭇가지");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누군가 오래 사용한 것 같은 목검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			// tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.AQUA + "완전 보존의 프리스트의 별")) {
			ItemStack job = new ItemStack(Material.LAPIS_LAZULI);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "프리스트의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl*5);
			player.setHealth(20 + lvl*5);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			// 마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// 무기
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "나뭇가지");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누군가 오래 사용한 것 같은 목검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			// 방패
			ItemStack knuckle = new ItemStack(Material.SHIELD);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "프리스트의 방패");
			knuckleIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			knuckleIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			knuckleIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			knuckleIm.setUnbreakable(true);
			knuckle.setItemMeta(knuckleIm);
			player.getInventory().setItem(40, knuckle);
			// tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.AQUA + "완전 보존의 광전사의 별")) {
			ItemStack job = new ItemStack(Material.CYAN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "광전사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl);
			player.setHealth(20 + lvl);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			// 마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// 무기
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "나뭇가지");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누군가 오래 사용한 것 같은 목검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			// tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.AQUA + "완전 보존의 도박사의 별")) {
			ItemStack job = new ItemStack(Material.LIGHT_GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "도박사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl*8);
			player.setHealth(20 + lvl*8);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			// 마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// 무기
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "나뭇가지");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누군가 오래 사용한 것 같은 목검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			// tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 데빌의 별")) {
			ItemStack job = new ItemStack(Material.GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "데빌의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl*20);
			player.setHealth(20 + lvl*20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			// 마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// 무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "데빌 스워드");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "계시자 카사르가 가지고 있던 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			// tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 엔젤의 별")) {
			ItemStack job = new ItemStack(Material.PINK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "엔젤의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl*30);
			player.setHealth(20 + lvl*30);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			// 마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// 무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.THORNS, 99, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "엔젤 스워드");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "마나난 맥 리르에게 받은 성검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			// tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 대행자의 별")) {
			ItemStack job = new ItemStack(Material.LIME_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "대행자의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl*20);
			player.setHealth(20 + lvl*20);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			// 마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// 무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.FIRE_ASPECT, 99, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "신의 힘을 담은 검");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "안바르의 비늘로 만들어진 성검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			// tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 그림자 무사의 별")) {
			ItemStack job = new ItemStack(Material.YELLOW_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "그림자 무사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl * 8);
			player.setHealth(20 + lvl * 8);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.GOLDEN_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 30, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);
			item5Im.setDisplayName(ChatColor.AQUA + "죽음의 무도");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "악마와의 계약이 되어있는 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 버서커의 별")) {
			ItemStack job = new ItemStack(Material.LIGHT_BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "버서커의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl * 3);
			player.setHealth(20 + lvl * 3);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//무기
			ItemStack item5 = new ItemStack(Material.GOLDEN_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 25, true);
			item5Im.addEnchant(Enchantment.KNOCKBACK, 3, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 6, true);
			item5Im.setDisplayName(ChatColor.AQUA + "반란군의 대검");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "휘두르는 것으로 보이는 적을 섬멸할 수 있는 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 군인의 별")) {
			ItemStack job = new ItemStack(Material.MAGENTA_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "군인의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl * 15);
			player.setHealth(20 + lvl * 15);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 그림 리퍼의 별")) {
			ItemStack job = new ItemStack(Material.ORANGE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "그림 리퍼의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl * 10);
			player.setHealth(20 + lvl * 10);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			//머리
			ItemStack item5 = new ItemStack(Material.SKELETON_SKULL);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GOLD + "" + player.getDisplayName() + "의 머리");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5.setItemMeta(item5Im);
			player.getInventory().setItem(39, item5);	
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,Integer.MAX_VALUE,0));
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 마인의 별")) {
			ItemStack job = new ItemStack(Material.BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "마인의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl * 50);
			player.setHealth(20 + lvl * 50);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
			item5Im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
			item5Im.addEnchant(Enchantment.KNOCKBACK, 4, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "발리사르도");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "죽은 자들의 마나를 응축시켜 만들어진 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 팔라딘의 별")) {
			ItemStack job = new ItemStack(Material.BROWN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "팔라딘의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl * 99);
			player.setHealth(20 + lvl * 99);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 용기사의 별")) {
			ItemStack job = new ItemStack(Material.BLACK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "용기사의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			// clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl * 80);
			player.setHealth(20 + lvl * 80);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			//무기
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.THORNS, 500, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "산귀스");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "피를 탐하던 악마가 봉인된 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "완전 보존의 아처의 별")) {
			ItemStack job = new ItemStack(Material.CLAY_BALL);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "아처의 증표");
			jobIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			jobIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			job.setItemMeta(jobIm);
			//clear
			int lvl = player.getLevel();
			player.setLevel(lvl);
			player.setMaxHealth(20 + lvl * 10);
			player.setHealth(20 + lvl * 10);
			player.setSaturation(20);
			player.setExhaustion(20);
			player.getInventory().clear();
			player.getInventory().setItem(7, job);
			for (PotionEffect effect : player.getActivePotionEffects()) {
				player.removePotionEffect(effect.getType());
			}
			//무기
			ItemStack item5 = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.WHITE + "초보자용 활");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "누구나 사용할 수 있을 것 같다.");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//마나
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "마나");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
	}
	
}
