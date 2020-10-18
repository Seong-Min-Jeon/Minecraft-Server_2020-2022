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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "�� �������� ��")) {
			ItemStack job = new ItemStack(Material.RED_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�� �������� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//��Ŭ
			ItemStack knuckle = new ItemStack(Material.BONE);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "��� �巡���� ��");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "����� ��")) {
			ItemStack job = new ItemStack(Material.GREEN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "����� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0");
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� ������ ��������");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "������Ʈ�� ��")) {
			ItemStack job = new ItemStack(Material.LAPIS_LAZULI);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������Ʈ�� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0");
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� ������ ��������");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "�������� ��")) {
			ItemStack job = new ItemStack(Material.CYAN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�������� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0");
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� ������ ��������");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "���ڻ��� ��")) {
			ItemStack job = new ItemStack(Material.LIGHT_GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "���ڻ��� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0");
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� ������ ��������");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "������ ��")) {
			ItemStack job = new ItemStack(Material.GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.JUNGLE_PLANKS);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("666,300,0,0,100,666,0,0,0,666,0");
			item5Im.setDisplayName(ChatColor.DARK_RED + "���� ������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� �Ǹ����� �ϻ� ���� ��");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//tp
			Location loc = new Location(world,-800,300,1400);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
			//player.kickPlayer(ChatColor.RED + "Error Code:" + ChatColor.MAGIC + " Hi My Name Is Yumehama(The God)"
			//		+ "\n" + ChatColor.GRAY + "����� ���ÿ� ���� ������ Ÿ���ϰ� �ֽ��ϴ�.");
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "������ ��")) {
			ItemStack job = new ItemStack(Material.PINK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_PLANKS);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("500,0,0,0,0,1000,200,200,200,500,0");
			item5Im.setDisplayName(ChatColor.DARK_RED + "���� ������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "��õ�翡�� �ϻ� ���� ����");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "�������� ��")) {
			ItemStack job = new ItemStack(Material.LIME_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�������� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_LOG);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("777,77,77,77,77,777,777,777,777,777,0");
			item5Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ���� ��");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�ȹٸ��� ��÷� ������� ����");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "�׸��� ������ ��")) {
			ItemStack job = new ItemStack(Material.YELLOW_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�׸��� ������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.SPRUCE_LOG);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("30,5,5,5,0,0,0,0,0,0");
			item5Im.setDisplayName(ChatColor.AQUA + "������ ����");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�Ǹ����� ����� �Ǿ��ִ� ��");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "����Ŀ�� ��")) {
			ItemStack job = new ItemStack(Material.LIGHT_BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "����Ŀ�� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.SPRUCE_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("50,0,0,0,5,0,0,0,0,0");
			item5Im.setDisplayName(ChatColor.AQUA + "�ݶ����� ���");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�ֵθ��� ������ ���̴� ���� ������ �� �ִ� ��");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "������ ��")) {
			ItemStack job = new ItemStack(Material.MAGENTA_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "�׸� ������ ��")) {
			ItemStack job = new ItemStack(Material.ORANGE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�׸� ������ ��ǥ");
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
			//�Ӹ�
			ItemStack item5 = new ItemStack(Material.SKELETON_SKULL);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GOLD + "" + player.getDisplayName() + "�� �Ӹ�");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5.setItemMeta(item5Im);
			player.getInventory().setItem(39, item5);	
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,Integer.MAX_VALUE,0));
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "������ ��")) {
			ItemStack job = new ItemStack(Material.BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("500,0,0,0,10,300,0,0,0,100");
			item5Im.setDisplayName(ChatColor.DARK_RED + "�߸��縣��");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� �ڵ��� ������ ������� ������� ��");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
			//player.kickPlayer(ChatColor.RED + "Error Code:" + ChatColor.MAGIC + " Hi My Name Is Yumehama(The God)"
			//		+ "\n" + ChatColor.GRAY + "����� ���ÿ� ���� ������ Ÿ���ϰ� �ֽ��ϴ�.");
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "�ȶ���� ��")) {
			ItemStack job = new ItemStack(Material.BROWN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�ȶ���� ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("100,0,0,0,0,1000,0,0,0,1000");
			item5Im.setDisplayName(ChatColor.DARK_RED + "��Ű�� ���� ��");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ �ſ��� �ϻ� ���� ��");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "������ ��")) {
			ItemStack job = new ItemStack(Material.BLACK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("200,0,0,0,0,500,0,0,0,1500");
			item5Im.setDisplayName(ChatColor.DARK_RED + "��ͽ�");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� ������ �� ���ε� ��");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "��ó�� ��")) {
			ItemStack job = new ItemStack(Material.CLAY_BALL);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "��ó�� ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("0");
			item5Im.setDisplayName(ChatColor.GOLD + "�׶�����");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�� �Ӽ��� ���� �ִ� Ȱ");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		//������ �� ==================================================================================================================================================
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "������ �� �������� ��")) {
			ItemStack job = new ItemStack(Material.RED_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�� �������� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//��Ŭ
			ItemStack knuckle = new ItemStack(Material.BONE);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "��� �巡���� ��");
			knuckle.setItemMeta(knuckleIm);	
			player.getInventory().setItem(0, knuckle);
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "������ ����� ��")) {
			ItemStack job = new ItemStack(Material.GREEN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "����� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ���� ����� �� ���� ���");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "������ ������Ʈ�� ��")) {
			ItemStack job = new ItemStack(Material.LAPIS_LAZULI);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������Ʈ�� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ���� ����� �� ���� ���");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);	
			//����
			ItemStack knuckle = new ItemStack(Material.SHIELD);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "������Ʈ�� ����");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "������ �������� ��")) {
			ItemStack job = new ItemStack(Material.CYAN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�������� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ���� ����� �� ���� ���");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "������ ���ڻ��� ��")) {
			ItemStack job = new ItemStack(Material.LIGHT_GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "���ڻ��� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ���� ����� �� ���� ���");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "������ ������ ��")) {
			ItemStack job = new ItemStack(Material.GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "���� ������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "����� ī�縣�� ������ �ִ� ��");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "������ ������ ��")) {
			ItemStack job = new ItemStack(Material.PINK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.THORNS, 99, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "���� ������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ �� �������� ���� ����");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "������ �������� ��")) {
			ItemStack job = new ItemStack(Material.LIME_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�������� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.FIRE_ASPECT, 99, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ���� ��");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�ȹٸ��� ��÷� ������� ����");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "������ �׸��� ������ ��")) {
			ItemStack job = new ItemStack(Material.YELLOW_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�׸��� ������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.GOLDEN_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 30, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);
			item5Im.setDisplayName(ChatColor.AQUA + "������ ����");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�Ǹ����� ����� �Ǿ��ִ� ��");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "������ ����Ŀ�� ��")) {
			ItemStack job = new ItemStack(Material.LIGHT_BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "����Ŀ�� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.GOLDEN_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 25, true);
			item5Im.addEnchant(Enchantment.KNOCKBACK, 3, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 6, true);
			item5Im.setDisplayName(ChatColor.AQUA + "�ݶ����� ���");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�ֵθ��� ������ ���̴� ���� ������ �� �ִ� ��");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "������ ������ ��")) {
			ItemStack job = new ItemStack(Material.MAGENTA_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "������ �׸� ������ ��")) {
			ItemStack job = new ItemStack(Material.ORANGE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�׸� ������ ��ǥ");
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
			//�Ӹ�
			ItemStack item5 = new ItemStack(Material.SKELETON_SKULL);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GOLD + "" + player.getDisplayName() + "�� �Ӹ�");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5.setItemMeta(item5Im);
			player.getInventory().setItem(39, item5);	
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,Integer.MAX_VALUE,0));
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "������ ������ ��")) {
			ItemStack job = new ItemStack(Material.BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
			item5Im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
			item5Im.addEnchant(Enchantment.KNOCKBACK, 4, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "�߸��縣��");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� �ڵ��� ������ ������� ������� ��");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "������ �ȶ���� ��")) {
			ItemStack job = new ItemStack(Material.BROWN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�ȶ���� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "������ ������ ��")) {
			ItemStack job = new ItemStack(Material.BLACK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.THORNS, 500, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "��ͽ�");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�Ǹ� Ž�ϴ� �Ǹ��� ���ε� ��");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "������ ��ó�� ��")) {
			ItemStack job = new ItemStack(Material.CLAY_BALL);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "��ó�� ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.WHITE + "�ʺ��ڿ� Ȱ");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ����� �� ���� �� ����.");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		//���� ������ �� ==================================================================================================================================================
		if (itemArg.getItemStack().getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.AQUA + "���� ������ �� �������� ��")) {
			ItemStack job = new ItemStack(Material.RED_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�� �������� ��ǥ");
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
			// ����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// ��Ŭ
			ItemStack knuckle = new ItemStack(Material.BONE);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "��� �巡���� ��");
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
				.equalsIgnoreCase(ChatColor.AQUA + "���� ������ ����� ��")) {
			ItemStack job = new ItemStack(Material.GREEN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "����� ��ǥ");
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
			// ����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// ����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ���� ����� �� ���� ���");
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
				.equalsIgnoreCase(ChatColor.AQUA + "���� ������ ������Ʈ�� ��")) {
			ItemStack job = new ItemStack(Material.LAPIS_LAZULI);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������Ʈ�� ��ǥ");
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
			// ����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// ����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ���� ����� �� ���� ���");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			// ����
			ItemStack knuckle = new ItemStack(Material.SHIELD);
			ItemMeta knuckleIm = knuckle.getItemMeta();
			knuckleIm.setDisplayName(ChatColor.GOLD + "������Ʈ�� ����");
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
				.equalsIgnoreCase(ChatColor.AQUA + "���� ������ �������� ��")) {
			ItemStack job = new ItemStack(Material.CYAN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�������� ��ǥ");
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
			// ����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// ����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ���� ����� �� ���� ���");
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
				.equalsIgnoreCase(ChatColor.AQUA + "���� ������ ���ڻ��� ��")) {
			ItemStack job = new ItemStack(Material.LIGHT_GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "���ڻ��� ��ǥ");
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
			// ����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// ����
			ItemStack item5 = new ItemStack(Material.BIRCH_LEAVES);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GRAY + "��������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ���� ����� �� ���� ���");
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
				.equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ ������ ��")) {
			ItemStack job = new ItemStack(Material.GRAY_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			// ����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// ����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "���� ������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "����� ī�縣�� ������ �ִ� ��");
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
				.equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ ������ ��")) {
			ItemStack job = new ItemStack(Material.PINK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			// ����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// ����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.THORNS, 99, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "���� ������");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ �� �������� ���� ����");
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
				.equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ �������� ��")) {
			ItemStack job = new ItemStack(Material.LIME_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�������� ��ǥ");
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
			// ����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			// ����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 99, true);
			item5Im.addEnchant(Enchantment.FIRE_ASPECT, 99, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "���� ���� ���� ��");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�ȹٸ��� ��÷� ������� ����");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ �׸��� ������ ��")) {
			ItemStack job = new ItemStack(Material.YELLOW_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�׸��� ������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.GOLDEN_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 30, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);
			item5Im.setDisplayName(ChatColor.AQUA + "������ ����");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�Ǹ����� ����� �Ǿ��ִ� ��");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ ����Ŀ�� ��")) {
			ItemStack job = new ItemStack(Material.LIGHT_BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "����Ŀ�� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//����
			ItemStack item5 = new ItemStack(Material.GOLDEN_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 25, true);
			item5Im.addEnchant(Enchantment.KNOCKBACK, 3, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 6, true);
			item5Im.setDisplayName(ChatColor.AQUA + "�ݶ����� ���");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�ֵθ��� ������ ���̴� ���� ������ �� �ִ� ��");
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
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ ������ ��")) {
			ItemStack job = new ItemStack(Material.MAGENTA_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);	
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ �׸� ������ ��")) {
			ItemStack job = new ItemStack(Material.ORANGE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�׸� ������ ��ǥ");
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
			//�Ӹ�
			ItemStack item5 = new ItemStack(Material.SKELETON_SKULL);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.GOLD + "" + player.getDisplayName() + "�� �Ӹ�");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5.setItemMeta(item5Im);
			player.getInventory().setItem(39, item5);	
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,Integer.MAX_VALUE,0));
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ ������ ��")) {
			ItemStack job = new ItemStack(Material.BLUE_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
			item5Im.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
			item5Im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
			item5Im.addEnchant(Enchantment.KNOCKBACK, 4, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "�߸��縣��");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "���� �ڵ��� ������ ������� ������� ��");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ �ȶ���� ��")) {
			ItemStack job = new ItemStack(Material.BROWN_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "�ȶ���� ��ǥ");
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
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ ������ ��")) {
			ItemStack job = new ItemStack(Material.BLACK_DYE);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "������ ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.addEnchant(Enchantment.THORNS, 500, true);
			item5Im.setDisplayName(ChatColor.DARK_RED + "��ͽ�");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "�Ǹ� Ž�ϴ� �Ǹ��� ���ε� ��");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
			item.setItemMeta(itemIm);	
			player.getInventory().setItem(8, item);		
			//tp
			Location loc = new Location(world,-1844,70,3012);
			player.teleport(loc);
			player.getWorld().playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
			itemArg.remove();
			itemArg.getLocation().getWorld().playSound(loc, Sound.BLOCK_ANVIL_HIT, 1.0f, 1.0f);
		}
		if(itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "���� ������ ��ó�� ��")) {
			ItemStack job = new ItemStack(Material.CLAY_BALL);
			ItemMeta jobIm = job.getItemMeta();
			jobIm.addEnchant(Enchantment.BINDING_CURSE, 32700, true);
			jobIm.setDisplayName(ChatColor.GOLD + "��ó�� ��ǥ");
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
			//����
			ItemStack item5 = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setDisplayName(ChatColor.WHITE + "�ʺ��ڿ� Ȱ");
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "������ ����� �� ���� �� ����.");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getInventory().addItem(item5);
			//����
			ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.BLUE + "����");
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
