package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Husk;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpawnMob {

	Random rnd = new Random();

	public boolean spawn(Entity mob) {
		LivingEntity entity = (LivingEntity) mob;
		Location loc = entity.getLocation();
		if (mob1(entity, loc) && mob2(entity, loc) && mob3(entity, loc) && mob4(entity, loc) && mob5(entity, loc) && mob6(entity, loc) && mob7(entity, loc)
				&& mob8(entity, loc) && mob9(entity, loc) && mob10(entity, loc) && mob11(entity, loc) && mob12(entity, loc) && mob13(entity, loc)
				&& mob14(entity, loc) && mob15(entity, loc) && mob16(entity, loc) && mob17(entity, loc) && mob18(entity, loc) && mob19(entity, loc)
				&& mob20(entity, loc) && mob21(entity, loc) && mob22(entity, loc) && mob23(entity, loc) && mob24(entity, loc) && mob25(entity, loc)
				&& mob26(entity, loc) && mob27(entity, loc) && mob28(entity, loc) && mob29(entity, loc) && mob30(entity, loc) && mob31(entity, loc)
				&& mob32(entity, loc) && mob33(entity, loc) && mob34(entity, loc) && mob35(entity, loc) && mob36(entity, loc) && mob37(entity, loc)
				&& mob38(entity, loc) && mob39(entity, loc) && mob40(entity, loc) && mob41(entity, loc) && mob42(entity, loc) && mob43(entity, loc)
				&& mob44(entity, loc) && mob45(entity, loc) && mob46(entity, loc) && mob47(entity, loc) && mob48(entity, loc) && mob49(entity, loc)
				&& mob50(entity, loc) && mob51(entity, loc) && mob52(entity, loc) && mob53(entity, loc) && mob54(entity, loc) && mob55(entity, loc)
				&& mob56(entity, loc) && mob57(entity, loc) && mob58(entity, loc) && mob59(entity, loc) && mob60(entity, loc) && mob61(entity, loc)
				&& mob62(entity, loc) && mob63(entity, loc) && mob64(entity, loc) && mob65(entity, loc) && mob66(entity, loc) && mob67(entity, loc)
				&& mob68(entity, loc) && mob69(entity, loc) && mob70(entity, loc) && mob71(entity, loc) && mob72(entity, loc) && mob73(entity, loc)
				&& mob74(entity, loc) && mob75(entity, loc) && mob76(entity, loc) && mob77(entity, loc) && mob78(entity, loc) && mob79(entity, loc)
				&& mob80(entity, loc) && mob81(entity, loc) && mob82(entity, loc) && mob83(entity, loc) && mob84(entity, loc) && mob85(entity, loc)
				&& mob86(entity, loc) && mob87(entity, loc) && mob88(entity, loc) && mob89(entity, loc) && mob90(entity, loc) && mob91(entity, loc)
				&& mob92(entity, loc) && mob93(entity, loc) && mob94(entity, loc) && mob95(entity, loc) && mob96(entity, loc) && mob97(entity, loc)
				&& mob98(entity, loc) && mob99(entity, loc) && mob100(entity, loc) && mob101(entity, loc) && mob102(entity, loc) && mob103(entity, loc)
				&& antimob1(entity, loc) && antimob2(entity, loc) && antimob3(entity, loc) && antimob4(entity, loc) && antimob5(entity, loc)
				&& antimob6(entity, loc) && antimob7(entity, loc)) {
			return true;
		}
		return false;
	}

	public boolean antimob1(LivingEntity entity, Location loc) {
		// ���� ���� ��ó -2094 80 2471 -2033 30 2436
		if (loc.getX() <= -2033 && loc.getY() <= 180
				&& loc.getZ() <= 2471 && loc.getX() >= -2094
				&& loc.getY() >= 30 && loc.getZ() >= 2436) {
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.WITCH) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean antimob2(LivingEntity entity, Location loc) {
		// �ܳ� ��ó -2428 95 584 -2515 45 494
		if (loc.getX() <= -2428 && loc.getY() <= 95
				&& loc.getZ() <= 584 && loc.getX() >= -2515
				&& loc.getY() >= 45 && loc.getZ() >= 494) {
			if (entity.getType() == (EntityType) EntityType.POLAR_BEAR) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean antimob3(LivingEntity entity, Location loc) {
		// �ƶ���� ����ķ�� -2414 70 718 -2477 118 777
		if (loc.getX() <= -2414 && loc.getY() <= 118
				&& loc.getZ() <= 777 && loc.getX() >= -2477
				&& loc.getY() >= 70 && loc.getZ() >= 718) {
			if (entity.getType() == (EntityType) EntityType.POLAR_BEAR) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean antimob4(LivingEntity entity, Location loc) {
		// ũ�����Ʈ -113 200 136  2 46 35
		if (loc.getX() <= 2 && loc.getY() <= 200
				&& loc.getZ() <= 136 && loc.getX() >= -113
				&& loc.getY() >= 46 && loc.getZ() >= 35) {
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean antimob5(LivingEntity entity, Location loc) {
		// ���Ʊ� 18 153 -253  155 86 -349
		if (loc.getX() <= 155 && loc.getY() <= 153
				&& loc.getZ() <= -253 && loc.getX() >= 18
				&& loc.getY() >= 86 && loc.getZ() >= -349) {
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE
					|| entity.getType() == (EntityType) EntityType.PIG
					|| entity.getType() == (EntityType) EntityType.MUSHROOM_COW) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean antimob6(LivingEntity entity, Location loc) {
		// ����ž  230 105 698  192 78 756    
		if (loc.getX() <= 230 && loc.getY() <= 105 && loc.getZ() <= 756 
				&& loc.getX() >= 192 && loc.getY() >= 78 && loc.getZ() >= 698) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE
					|| entity.getType() == (EntityType) EntityType.PIG
					|| entity.getType() == (EntityType) EntityType.MUSHROOM_COW) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean antimob7(LivingEntity entity, Location loc) {
		// ����ž ��ó ���� 285 70 750  345 47 782
		if (loc.getX() <= 345 && loc.getY() <= 70 && loc.getZ() <= 782 
				&& loc.getX() >= 285 && loc.getY() >= 47 && loc.getZ() >= 750) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE
					|| entity.getType() == (EntityType) EntityType.PIG
					|| entity.getType() == (EntityType) EntityType.MUSHROOM_COW) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob1(LivingEntity entity, Location loc) {
		// ������ �𸣴� ������ 3686 39 3708 3712 47 3672
		if (loc.getX() <= 3712 && loc.getY() <= 47
				&& loc.getZ() <= 3708 && loc.getX() >= 3686
				&& loc.getY() >= 39 && loc.getZ() >= 3672) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ �𸣴� ������" + ChatColor.YELLOW + " [Lv.0]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1);
				entity.setHealth(1);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_DOOR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.SKELETON_SKULL);
				head.setHelmet(headItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 32700));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob2(LivingEntity entity, Location loc) {
		// �ʷ� ������ -1881 54 3069 -1834 53 3106
		if (loc.getX() <= -1833 && loc.getY() <= 60
				&& loc.getZ() <= 3107 && loc.getX() >= -1882
				&& loc.getY() >= 50 && loc.getZ() >= 3068) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "�ʷ� ������" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8);
				entity.setHealth(8);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob3(LivingEntity entity, Location loc) {
		// �ؾȰ� ����1 -1887 56 2986 -1946 45 3068
		if (loc.getX() <= -1887 && loc.getY() <= 56
				&& loc.getZ() <= 3068 && loc.getX() >= -1946
				&& loc.getY() >= 45 && loc.getZ() >= 2986) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�ؾȰ� ����" + ChatColor.YELLOW + " [Lv.6]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(18);
				entity.setHealth(18);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob4(LivingEntity entity, Location loc) {
		// �ϴ� �Ⱦ�
		// �ؾȰ� ����2 -1929 55 3016 -1966 45 3060
		if (loc.getX() <= -1929 && loc.getY() <= 55
				&& loc.getZ() <= 3060 && loc.getX() >= -1966
				&& loc.getY() >= 45 && loc.getZ() >= 3016) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�ؾȰ� ����" + ChatColor.YELLOW + " [Lv.6]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(18);
				entity.setHealth(18);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob5(LivingEntity entity, Location loc) {
		// ���״ҿ� ��Ŵ��� �� -1820 50 3061 -1786 57 3094
		if (loc.getX() <= -1786 && loc.getY() <= 57
				&& loc.getZ() <= 3094 && loc.getX() >= -1820
				&& loc.getY() >= 50 && loc.getZ() >= 3061) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���״ҿ� ��Ŵ��� ��" + ChatColor.YELLOW + " [Lv.13]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30);
				entity.setHealth(30);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob6(LivingEntity entity, Location loc) {
		// ���� ���� �ϼ��� & ���� ���� ���� -1960 60 2954 -1980 52 2947
		if (loc.getX() <= -1960 && loc.getY() <= 60
				&& loc.getZ() <= 2954 && loc.getX() >= -1980
				&& loc.getY() >= 52 && loc.getZ() >= 2947) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "���� ���� �ϼ���" + ChatColor.YELLOW + " [Lv.32]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(150);
				entity.setHealth(150);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.IRON_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���� ���� ����" + ChatColor.YELLOW + " [Lv.40]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(230);
				entity.setHealth(230);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob7(LivingEntity entity, Location loc) {
		// ������Ʈ ��Ʈ -1870 45 2694 -1925 80 2635
		if (loc.getX() <= -1870 && loc.getY() <= 80
				&& loc.getZ() <= 2694 && loc.getX() >= -1925
				&& loc.getY() >= 45 && loc.getZ() >= 2635) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "������Ʈ ��Ʈ" + ChatColor.YELLOW + " [Lv.15]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(35);
				entity.setHealth(35);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(true);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(150, 250, 250));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob8(LivingEntity entity, Location loc) {
		// ũ����Ż ������ -1938 77 2617 -1882 56 2596
		if (loc.getX() <= -1882 && loc.getY() <= 77
				&& loc.getZ() <= 2617 && loc.getX() >= -1938
				&& loc.getY() >= 45 && loc.getZ() >= 2596) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "ũ����Ż ������" + ChatColor.YELLOW + " [Lv.18]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(50);
				entity.setHealth(50);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DIAMOND_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob9(LivingEntity entity, Location loc) {
		// ���ֹ��� ���� ���� -1822 58 2570 -1788 62 2535
		if (loc.getX() <= -1788 && loc.getY() <= 65
				&& loc.getZ() <= 2570 && loc.getX() >= -1822
				&& loc.getY() >= 50 && loc.getZ() >= 2535) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "���ֹ��� ���� ����" + ChatColor.YELLOW + " [Lv.20]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(60);
				entity.setHealth(60);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 0, 16));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 0, 16));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 0, 16));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 7));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob10(LivingEntity entity, Location loc) {
		// ��ȣ ���� && ��ȣ ��Ʈ���� 3768 19 3789 3737 9 3760
		if (loc.getX() <= 3768 && loc.getY() <= 19
				&& loc.getZ() <= 3789 && loc.getX() >= 3737
				&& loc.getY() >= 9 && loc.getZ() >= 3760) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "��ȣ ����" + ChatColor.YELLOW + " [Lv.12]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20);
				entity.setHealth(20);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.FIRE_CORAL);
				head.setHelmet(headItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "��ȣ ��Ʈ����" + ChatColor.YELLOW + " [Lv.16]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30);
				entity.setHealth(30);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("2");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob11(LivingEntity entity, Location loc) {
		// �ź� ���� 3703 20 3765 3713 15 3756
		if (loc.getX() <= 3713 && loc.getY() <= 23
				&& loc.getZ() <= 3765 && loc.getX() >= 3703
				&& loc.getY() >= 15 && loc.getZ() >= 3756) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�ź� ����" + ChatColor.YELLOW + " [Lv.15]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20);
				entity.setHealth(20);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob12(LivingEntity entity, Location loc) {
		// ���� �����, ����� 3646 16 3793 3618 6 3765
		if (loc.getX() <= 3646 && loc.getY() <= 16
				&& loc.getZ() <= 3793 && loc.getX() >= 3618
				&& loc.getY() >= 6 && loc.getZ() >= 3765) {
			if (entity.getType() == (EntityType) EntityType.GUARDIAN) {
				entity.setCustomName(ChatColor.GRAY + "�����" + ChatColor.YELLOW + " [Lv.12]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30);
				entity.setHealth(30);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ELDER_GUARDIAN) {
				entity.setCustomName(ChatColor.GRAY + "���� �����" + ChatColor.YELLOW + " [Lv.19]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(50);
				entity.setHealth(50);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob13(LivingEntity entity, Location loc) {
		// ħ���� -1830 63 2472 -1964 54 2324
		if (loc.getX() <= -1830 && loc.getY() <= 100
				&& loc.getZ() <= 2472 && loc.getX() >= -1964
				&& loc.getY() >= 40 && loc.getZ() >= 2324) {
			if (entity.getType() == (EntityType) EntityType.VINDICATOR) {
				entity.setCustomName(ChatColor.GRAY + "ħ����" + ChatColor.YELLOW + " [Lv.24]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(80);
				entity.setHealth(80);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.COBBLESTONE_WALL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.EVOKER) {
				entity.setCustomName(ChatColor.GRAY + "ħ����" + ChatColor.YELLOW + " [Lv.24]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(110);
				entity.setHealth(110);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob14(LivingEntity entity, Location loc) {
		// �� ���� ��� -1753 83 2410 -1436 117 1983
		if (loc.getX() <= -1436 && loc.getY() <= 200
				&& loc.getZ() <= 2410 && loc.getX() >= -1753
				&& loc.getY() >= 40 && loc.getZ() >= 1983) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "���" + ChatColor.YELLOW + " [Lv.47]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(280);
				entity.setHealth(280);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�ĸ�Ȧ���� ����" + ChatColor.YELLOW + " [Lv.50]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(350);
				entity.setHealth(350);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "�ĸ�Ȧ���� ����" + ChatColor.YELLOW + " [Lv.58]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(370);
				entity.setHealth(370);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("12");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "���̵� ��" + ChatColor.YELLOW + " [Lv.62]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(380);
				entity.setHealth(380);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 16));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob15(LivingEntity entity, Location loc) {
		// ������ ���� �� -1936 85 2686 -2143 82 2444
		if (loc.getX() <= -1936 && loc.getY() <= 100
				&& loc.getZ() <= 2686 && loc.getX() >= -2143
				&& loc.getY() >= 30 && loc.getZ() >= 2444) {
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "���� Ȳ��" + ChatColor.YELLOW + " [Lv.34]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(150);
				entity.setHealth(150);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITCH) {
				entity.setCustomName(ChatColor.GRAY + "���� ����" + ChatColor.YELLOW + " [Lv.31]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(130);
				entity.setHealth(130);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob16(LivingEntity entity, Location loc) {
		// ���� -1913 58 2354 -2121 53 2271
		if (loc.getX() <= -1913 && loc.getY() <= 100
				&& loc.getZ() <= 2354 && loc.getX() >= -2121
				&& loc.getY() >= 30 && loc.getZ() >= 2271) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.27]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(100);
				entity.setHealth(100);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(5, 60, 20));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(5, 60, 20));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(5, 60, 20));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob17(LivingEntity entity, Location loc) {
		// ���� ���� ���� 3532 29 3773 3447 10 3690
		if (loc.getX() <= 3532 && loc.getY() <= 30
				&& loc.getZ() <= 3773 && loc.getX() >= 3447
				&& loc.getY() >= 10 && loc.getZ() >= 3690) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "���̵� ������" + ChatColor.YELLOW + " [Lv.35]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(100);
				entity.setHealth(100);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(50, 200, 50));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(50, 200, 50));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(50, 200, 50));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�ǻ�Ƴ� ���谡" + ChatColor.YELLOW + " [Lv.38]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(120);
				entity.setHealth(120);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.WOODEN_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob18(LivingEntity entity, Location loc) {
		// ������ ���� 3522 15 3726 3556 35 3691
		if (loc.getX() <= 3556 && loc.getY() <= 35
				&& loc.getZ() <= 3726 && loc.getX() >= 3522
				&& loc.getY() >= 15 && loc.getZ() >= 3691) {
			if (entity.getType() == (EntityType) EntityType.GHAST) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.43]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600);
				entity.setHealth(600);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob19(LivingEntity entity, Location loc) {
		// ���2 -1436 50 1812 -804 90 2464
		if (loc.getX() <= -804 && loc.getY() <= 90
				&& loc.getZ() <= 2464 && loc.getX() >= -1436
				&& loc.getY() >= 50 && loc.getZ() >= 1812) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "��ũ" + ChatColor.YELLOW + " [Lv.60]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(420);
				entity.setHealth(420);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(10, 150, 10));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(10, 150, 10));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(10, 150, 10));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 17));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�̷��� �����ϴ� ��" + ChatColor.YELLOW + " [Lv.66]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(500);
				entity.setHealth(500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("16");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "���� �ΰ�" + ChatColor.YELLOW + " [Lv.72]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(800);
				entity.setHealth(800);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 21));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ������" + ChatColor.YELLOW + " [Lv.80]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1000);
				entity.setHealth(1000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.IRON_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 25));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob20(LivingEntity entity, Location loc) {
		// �ĸ�Ȧ���� ���� -1096 52 2365 -1027 3 2246
		if (loc.getX() <= -1027 && loc.getY() <= 52
				&& loc.getZ() <= 2365 && loc.getX() >= -1096
				&& loc.getY() >= 3 && loc.getZ() >= 2246) {
			if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "������ ��Ű�� �Ź�" + ChatColor.YELLOW + " [Lv.100]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2800);
				entity.setHealth(2800);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 32));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�ĸ�Ȧ���� ��ȣ��" + ChatColor.YELLOW + " [Lv.113]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000);
				entity.setHealth(4000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment shield = entity.getEquipment();
				ItemStack shieldItem = new ItemStack(Material.SHIELD);
				shield.setItemInOffHand(shieldItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 40));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob21(LivingEntity entity, Location loc) {
		// Ƽ�� �ؾȰ� -642 52 1993 -568 52 1881
		if (loc.getX() <= -568 && loc.getY() <= 60
				&& loc.getZ() <= 1993 && loc.getX() >= -642
				&& loc.getY() >= 40 && loc.getZ() >= 1881) {
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�ܴ��� ������" + ChatColor.YELLOW + " [Lv.83]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1300);
				entity.setHealth(1300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 30));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob22(LivingEntity entity, Location loc) {
		// ������� 3481 31 3837 3603 5 3976
		if (loc.getX() <= 3603 && loc.getY() <= 31
				&& loc.getZ() <= 3976 && loc.getX() >= 3481
				&& loc.getY() >= 5 && loc.getZ() >= 3837) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.120]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3100);
				entity.setHealth(3100);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 38));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���̷���" + ChatColor.YELLOW + " [Lv.124]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3300);
				entity.setHealth(3300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("40");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.BOW);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "�Ź�" + ChatColor.YELLOW + " [Lv.115]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2600);
				entity.setHealth(2600);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 35));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob23(LivingEntity entity, Location loc) {
		// Ƽ�� ���� ��� -712 88 1562 -1051 40 1800
		if (loc.getX() <= -712 && loc.getY() <= 88
				&& loc.getZ() <= 1800 && loc.getX() >= -1051
				&& loc.getY() >= 40 && loc.getZ() >= 1562) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ���� �÷��̾�" + ChatColor.YELLOW + " [Lv.96]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2000);
				entity.setHealth(2000);
				int p = rnd.nextInt(5);
				if (p < 2) {
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("34");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
					mobBow.setItemInOffHand(mobBowItem);
				} else {
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BEDROCK);
					weapon.setItemInMainHand(weaponItem);
				}
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 36));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob24(LivingEntity entity, Location loc) {
		// �õ� ���� ���� ���� -1049 39 1804 -930 3 1966
		if (loc.getX() <= -930 && loc.getY() <= 39
				&& loc.getZ() <= 1966 && loc.getX() >= -1049
				&& loc.getY() >= 3 && loc.getZ() >= 1804) {
			if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "���� �Ź�" + ChatColor.YELLOW + " [Lv.134]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2000);
				entity.setHealth(2000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "���� ����" + ChatColor.YELLOW + " [Lv.140]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2400);
				entity.setHealth(2400);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 30));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob25(LivingEntity entity, Location loc) {
		// ��ǣ���� ���� �� -499 86 1542 -719 35 1387
		if (loc.getX() <= -499 && loc.getY() <= 89
				&& loc.getZ() <= 1542 && loc.getX() >= -719
				&& loc.getY() >= 35 && loc.getZ() >= 1387) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�ƶ�" + ChatColor.YELLOW + " [Lv.127]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2800);
				entity.setHealth(2800);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 39));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�Ӷ���" + ChatColor.YELLOW + " [Lv.135]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000);
				entity.setHealth(3000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 42));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob26(LivingEntity entity, Location loc) {
		// ��ǣ���� ���� �� �ؾ� ���� -538 34 1487 -610 10 1541
		if (loc.getX() <= -538 && loc.getY() <= 34
				&& loc.getZ() <= 1541 && loc.getX() >= -610
				&& loc.getY() >= 10 && loc.getZ() >= 1487) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�ĸ�Ȧ���� ������" + ChatColor.YELLOW + " [Lv.253]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 70));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob27(LivingEntity entity, Location loc) {
		// ��ǣ���� ���� �� ���� -970 55 1575 -1020 32 1653
		if (loc.getX() <= -970 && loc.getY() <= 55
				&& loc.getZ() <= 1653 && loc.getX() >= -1020
				&& loc.getY() >= 32 && loc.getZ() >= 1575) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ���� �÷��̾�" + ChatColor.YELLOW + " [Lv.150]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3300);
				entity.setHealth(3300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 45));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob28(LivingEntity entity, Location loc) {
		// ��ǣ����1 -919 59 1291 -997 109 1465
		if (loc.getX() <= -919 && loc.getY() <= 109
				&& loc.getZ() <= 1465 && loc.getX() >= -997
				&& loc.getY() >= 59 && loc.getZ() >= 1291) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�г��� ����" + ChatColor.YELLOW + " [Lv.158]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3500);
				entity.setHealth(3500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 46));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.160]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3700);
				entity.setHealth(3700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 47));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.163]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3800);
				entity.setHealth(3800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob29(LivingEntity entity, Location loc) {
		// ��ǣ����2 -962 59 1289 -1030 109 1203
		if (loc.getX() <= -962 && loc.getY() <= 109
				&& loc.getZ() <= 1289 && loc.getX() >= -1030
				&& loc.getY() >= 59 && loc.getZ() >= 1203) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "ħ���� ����" + ChatColor.YELLOW + " [Lv.165]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3850);
				entity.setHealth(3850);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 48));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����� ����" + ChatColor.YELLOW + " [Lv.168]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3900);
				entity.setHealth(3900);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 49));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����� ����" + ChatColor.YELLOW + " [Lv.171]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000);
				entity.setHealth(4000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob30(LivingEntity entity, Location loc) {
		// ��ǣ����3 -1005 58 1204 -1116 105 1095
		if (loc.getX() <= -1005 && loc.getY() <= 109
				&& loc.getZ() <= 1204 && loc.getX() >= -1116
				&& loc.getY() >= 59 && loc.getZ() >= 1095) {
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.178]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4100);
				entity.setHealth(4100);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����� ����" + ChatColor.YELLOW + " [Lv.174]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4200);
				entity.setHealth(4200);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 53));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob31(LivingEntity entity, Location loc) {
		// ��ǣ����4 -1118 58 1140 -1182 105 1312
		if (loc.getX() <= -1118 && loc.getY() <= 109
				&& loc.getZ() <= 1312 && loc.getX() >= -1182
				&& loc.getY() >= 59 && loc.getZ() >= 1140) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�г��� ����" + ChatColor.YELLOW + " [Lv.158]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3500);
				entity.setHealth(3500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 46));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.160]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3700);
				entity.setHealth(3700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 47));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.163]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3800);
				entity.setHealth(3800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob32(LivingEntity entity, Location loc) {
		// ��ǣ����5 -1187 58 1273 -1233 105 1460
		if (loc.getX() <= -1187 && loc.getY() <= 109
				&& loc.getZ() <= 1460 && loc.getX() >= -1233
				&& loc.getY() >= 59 && loc.getZ() >= 1273) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "ħ���� ����" + ChatColor.YELLOW + " [Lv.165]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3850);
				entity.setHealth(3850);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 48));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����� ����" + ChatColor.YELLOW + " [Lv.168]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3900);
				entity.setHealth(3900);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 49));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����� ����" + ChatColor.YELLOW + " [Lv.171]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000);
				entity.setHealth(4000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob33(LivingEntity entity, Location loc) {
		// ��ǣ����6 -1234 58 1460 -1290 102 1311
		if (loc.getX() <= -1234 && loc.getY() <= 109
				&& loc.getZ() <= 1460 && loc.getX() >= -1290
				&& loc.getY() >= 59 && loc.getZ() >= 1311) {
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.178]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4100);
				entity.setHealth(4100);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����� ����" + ChatColor.YELLOW + " [Lv.174]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4200);
				entity.setHealth(4200);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 53));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob34(LivingEntity entity, Location loc) {
		// ��ǣ���� �÷� -1079 196 1439 -1099 183 1468
		if (loc.getX() <= -1079 && loc.getY() <= 196
				&& loc.getZ() <= 1468 && loc.getX() >= -1099
				&& loc.getY() >= 180 && loc.getZ() >= 1439) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�÷��� ����" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob35(LivingEntity entity, Location loc) {
		// ��ǣ���� ���� -750 95 1380 -646 55 1277
		if (loc.getX() <= -646 && loc.getY() <= 95
				&& loc.getZ() <= 1380 && loc.getX() >= -750
				&& loc.getY() >= 55 && loc.getZ() >= 1277) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�Ϳ�" + ChatColor.YELLOW + " [Lv.148]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3400);
				entity.setHealth(3400);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 44));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "���" + ChatColor.YELLOW + " [Lv.157]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3800);
				entity.setHealth(3800);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 45));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob36(LivingEntity entity, Location loc) {
		// ��� -1314 48 2082 -1579 0 1745
		if (loc.getX() <= -1314 && loc.getY() <= 48
				&& loc.getZ() <= 2082 && loc.getX() >= -1579
				&& loc.getY() >= 0 && loc.getZ() >= 1745) {
			if (entity.getType() == (EntityType) EntityType.VEX) {
				entity.setCustomName(ChatColor.GRAY + "��ȥ�� Ž�ϴ� ����" + ChatColor.YELLOW + " [Lv.200]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000);
				entity.setHealth(5000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 60));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "��������" + ChatColor.YELLOW + " [Lv.194]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000);
				entity.setHealth(5000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 55));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob37(LivingEntity entity, Location loc) {
		// ��ǣ���� ���� �α� -685 56 1274 -946 160 924
		if (loc.getX() <= -685 && loc.getY() <= 160
				&& loc.getZ() <= 1274 && loc.getX() >= -946
				&& loc.getY() >= 56 && loc.getZ() >= 924) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "������" + ChatColor.YELLOW + " [Lv.184]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4500);
				entity.setHealth(4500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.CHAINMAIL_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 54));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���������" + ChatColor.YELLOW + " [Lv.190]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4700);
				entity.setHealth(4700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 55));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "���ų�Ʈ" + ChatColor.YELLOW + " [Lv.198]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4900);
				entity.setHealth(4900);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 56));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������" + ChatColor.YELLOW + " [Lv.203]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5200);
				entity.setHealth(5200);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 57));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob38(LivingEntity entity, Location loc) {
		// ��ǣ���� ���� -960 75 990 -1277 45 871
		if (loc.getX() <= -960 && loc.getY() <= 75
				&& loc.getZ() <= 990 && loc.getX() >= -1277
				&& loc.getY() >= 45 && loc.getZ() >= 871) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "��Ʋ�� ������ ����" + ChatColor.YELLOW + " [Lv.211]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5700);
				entity.setHealth(5700);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 60));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "�ư��� �ļ���" + ChatColor.YELLOW + " [Lv.218]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob39(LivingEntity entity, Location loc) {
		// ��ǣ���� ����1 -1323 83 1105 -1639 114 1513
		if (loc.getX() <= -1323 && loc.getY() <= 100
				&& loc.getZ() <= 1513 && loc.getX() >= -1639
				&& loc.getY() >= 35 && loc.getZ() >= 1105) {
			if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "�������� ��ȥ" + ChatColor.YELLOW + " [Lv.201]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5300);
				entity.setHealth(5300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("57");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�ͻ���� ����" + ChatColor.YELLOW + " [Lv.205]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5500);
				entity.setHealth(5500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 128, 128));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 128, 128));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 128, 128));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 57));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob40(LivingEntity entity, Location loc) {
		// ��ǣ���� ����2 -1200 100 1142 -1420 40 1235
		if (loc.getX() <= -1200 && loc.getY() <= 100
				&& loc.getZ() <= 1235 && loc.getX() >= -1420
				&& loc.getY() >= 40 && loc.getZ() >= 1142) {
			if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "�������� ��ȥ" + ChatColor.YELLOW + " [Lv.201]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5300);
				entity.setHealth(5300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("57");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�ͻ���� ����" + ChatColor.YELLOW + " [Lv.205]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5500);
				entity.setHealth(5500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 128, 128));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 128, 128));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 128, 128));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 57));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob41(LivingEntity entity, Location loc) {
		// ī�̸� ����1 -684 99 1007 -360 45 1225
		if (loc.getX() <= -360 && loc.getY() <= 100
				&& loc.getZ() <= 1225 && loc.getX() >= -684
				&& loc.getY() >= 45 && loc.getZ() >= 1007) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.212]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5800);
				entity.setHealth(5800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 61));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.216]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "��ȣ" + ChatColor.YELLOW + " [Lv.222]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6600);
				entity.setHealth(6600);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob42(LivingEntity entity, Location loc) {
		// Ƽ�� ���� -726 79 1819 -539 79 1612
		if (loc.getX() <= -539 && loc.getY() <= 88
				&& loc.getZ() <= 1819 && loc.getX() >= -726
				&& loc.getY() >= 40 && loc.getZ() >= 1612) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ���� �÷��̾�" + ChatColor.YELLOW + " [Lv.96]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2500);
				entity.setHealth(2500);
				int p = rnd.nextInt(5);
				if (p < 2) {
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("34");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
					mobBow.setItemInOffHand(mobBowItem);
				} else {
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BEDROCK);
					weapon.setItemInMainHand(weaponItem);
				}
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 36));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob43(LivingEntity entity, Location loc) {
		// ī�̸� ���� �� -560 63 1376 -429 76 1571
		if (loc.getX() <= -429 && loc.getY() <= 80
				&& loc.getZ() <= 1571 && loc.getX() >= -560
				&& loc.getY() >= 40 && loc.getZ() >= 1376) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�ƶ�" + ChatColor.YELLOW + " [Lv.127]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2800);
				entity.setHealth(2800);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 39));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�Ӷ���" + ChatColor.YELLOW + " [Lv.135]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000);
				entity.setHealth(3000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 42));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob44(LivingEntity entity, Location loc) {
		// ī�̸� ����2 -356 40 1238 48 98 1136
		if (loc.getX() <= 48 && loc.getY() <= 98
				&& loc.getZ() <= 1238 && loc.getX() >= -356
				&& loc.getY() >= 40 && loc.getZ() >= 1136) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.212]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5800);
				entity.setHealth(5800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 61));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.216]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "��ȣ" + ChatColor.YELLOW + " [Lv.222]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6600);
				entity.setHealth(6600);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob45(LivingEntity entity, Location loc) {
		// ī�̸� ����3 67 98 1132 -72 40 1010
		if (loc.getX() <= 67 && loc.getY() <= 98
				&& loc.getZ() <= 1132 && loc.getX() >= -72
				&& loc.getY() >= 40 && loc.getZ() >= 1010) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.212]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5800);
				entity.setHealth(5800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 61));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.216]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "��ȣ" + ChatColor.YELLOW + " [Lv.222]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6600);
				entity.setHealth(6600);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob46(LivingEntity entity, Location loc) {
		// ī�̸� ����4 -382 69 1001 -497 106 888
		if (loc.getX() <= -382 && loc.getY() <= 106
				&& loc.getZ() <= 1001 && loc.getX() >= -497
				&& loc.getY() >= 40 && loc.getZ() >= 888) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.212]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5800);
				entity.setHealth(5800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 61));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.216]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "��ȣ" + ChatColor.YELLOW + " [Lv.222]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6600);
				entity.setHealth(6600);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob47(LivingEntity entity, Location loc) {
		// ���� ��Ż -532 60 990 -658 90 852
		if (loc.getX() <= -532 && loc.getY() <= 90
				&& loc.getZ() <= 990 && loc.getX() >= -658
				&& loc.getY() >= 60 && loc.getZ() >= 852) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���� ���ʺ�" + ChatColor.YELLOW + " [Lv.243]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 0, 16));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 0, 16));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 0, 16));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 69));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "���� ����" + ChatColor.YELLOW + " [Lv.250]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 0, 16));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 0, 16));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 0, 16));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 71));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���� �д���" + ChatColor.YELLOW + " [Lv.260]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob48(LivingEntity entity, Location loc) {
		// �߹� ��� -49 104 791 -336 10 1130
		if (loc.getX() <= -49 && loc.getY() <= 150
				&& loc.getZ() <= 1130 && loc.getX() >= -336
				&& loc.getY() >= 10 && loc.getZ() >= 791) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�������� ����" + ChatColor.YELLOW + " [Lv.226]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�������� ��ɰ�" + ChatColor.YELLOW + " [Lv.231]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6700);
				entity.setHealth(6700);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "�������� ������" + ChatColor.YELLOW + " [Lv.236]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(7000);
				entity.setHealth(7000);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 65));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "�������� �̴���" + ChatColor.YELLOW + " [Lv.245]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 68));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob49(LivingEntity entity, Location loc) {
		// Ÿ���� ���� �ձ� �Ա� 3707 60 3482 3788 30 3296
		if (loc.getX() <= 3788 && loc.getY() <= 60
				&& loc.getZ() <= 3482 && loc.getX() >= 3707
				&& loc.getY() >= 30 && loc.getZ() >= 3296) {
			if (entity.getType() == (EntityType) EntityType.VEX) {
				entity.setCustomName(ChatColor.GRAY + "���ʸ� ���� ����" + ChatColor.YELLOW + " [Lv.183]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000);
				entity.setHealth(4000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 55));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���ݴ� ����" + ChatColor.YELLOW + " [Lv.187]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000);
				entity.setHealth(5000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BEDROCK);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 56));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob50(LivingEntity entity, Location loc) {
		// Ÿ���� ���� �ձ� 3755 84 3430 3736 74 3461
		if (loc.getX() <= 3755 && loc.getY() <= 84
				&& loc.getZ() <= 3461 && loc.getX() >= 3736
				&& loc.getY() >= 74 && loc.getZ() >= 3430) {
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "���� ����" + ChatColor.YELLOW + " [Lv.192]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5200);
				entity.setHealth(5200);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 57));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.PHANTOM) {
				entity.setCustomName(ChatColor.GRAY + "������ ��ȯ��" + ChatColor.YELLOW + " [Lv.194]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5500);
				entity.setHealth(5500);
				Phantom zombie = (Phantom) entity;
				zombie.setSize(5);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 58));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER) {
				entity.setCustomName(ChatColor.GRAY + "�Ŵ� ����" + ChatColor.YELLOW + " [Lv.200]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30000);
				entity.setHealth(30000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob51(LivingEntity entity, Location loc) {
		// Ÿ���� ���� �ձ� ������1 3770 76 3471 3775 78 3482
		if (loc.getX() <= 3775 && loc.getY() <= 78
				&& loc.getZ() <= 3482 && loc.getX() >= 3770
				&& loc.getY() >= 76 && loc.getZ() >= 3471) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30000);
				entity.setHealth(30000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 65));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.WITHER) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob52(LivingEntity entity, Location loc) {
		// Ÿ���� ���� �ձ� ������2 3775 76 3471 3780 78 3482
		if (loc.getX() <= 3780 && loc.getY() <= 78
				&& loc.getZ() <= 3482 && loc.getX() >= 3775
				&& loc.getY() >= 76 && loc.getZ() >= 3471) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�������� ƼŸ�Ͼ�" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30000);
				entity.setHealth(30000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.CYAN_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 65));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.WITHER) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob53(LivingEntity entity, Location loc) {
		// Ÿ���� ���� �ձ� ������ 3754 90 3497 3797 75 3456
		if (loc.getX() <= 3797 && loc.getY() <= 90
				&& loc.getZ() <= 3497 && loc.getX() >= 3754
				&& loc.getY() >= 75 && loc.getZ() >= 3456) {
			if (entity.getType() == (EntityType) EntityType.WITHER) {
				entity.setCustomName(ChatColor.GRAY + "�Ŵ� ����" + ChatColor.YELLOW + " [Lv.200]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20000);
				entity.setHealth(20000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.SKELETON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob54(LivingEntity entity, Location loc) {
		// �ƶ���� -1789 200 931 -2964 30 443
		if (loc.getX() <= -1789 && loc.getY() <= 200
				&& loc.getZ() <= 931 && loc.getX() >= -2964
				&& loc.getY() >= 30 && loc.getZ() >= 443) {
			if (entity.getType() == (EntityType) EntityType.POLAR_BEAR) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.254]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(15000);
				entity.setHealth(15000);
				PolarBear zombie = (PolarBear) entity;
				int tmp = rnd.nextInt(2);
				if (tmp == 0) {
					zombie.setBaby();
				} else {
					zombie.setAdult();
				}
				zombie.setAware(true);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "���� ������" + ChatColor.YELLOW + " [Lv.217]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.CYAN_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 68));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���� ������" + ChatColor.YELLOW + " [Lv.224]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("70");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���� ������" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BLACK_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 71));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob55(LivingEntity entity, Location loc) {
		// ���� ���� �Ա�
		if (loc.getX() <= 3832 && loc.getY() <= 42
				&& loc.getZ() <= 3242 && loc.getX() >= 3769
				&& loc.getY() >= 8 && loc.getZ() >= 3179) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�߷θ��� ����" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 72));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�߷θ��� �ú�" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(13000);
				entity.setHealth(13000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("72");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob56(LivingEntity entity, Location loc) {
		// ���� ���� �Ʒ� 3753 62 3182  3639 12 3232
		if (loc.getX() <= 3753 && loc.getY() <= 62
				&& loc.getZ() <= 3232 && loc.getX() >= 3639
				&& loc.getY() >= 12 && loc.getZ() >= 3182) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�߷θ��� ����" + ChatColor.YELLOW + " [Lv.232]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(13000);
				entity.setHealth(13000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 72));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�߷θ��� �ú�" + ChatColor.YELLOW + " [Lv.232]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(14000);
				entity.setHealth(14000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("72");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob57(LivingEntity entity, Location loc) {
		// ���� ���� �� 3749 91 3225  3644 70 3184
		if (loc.getX() <= 3749 && loc.getY() <= 91
				&& loc.getZ() <= 3225 && loc.getX() >= 3644
				&& loc.getY() >= 70 && loc.getZ() >= 3184) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�߷θ��� ����" + ChatColor.YELLOW + " [Lv.238]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(14000);
				entity.setHealth(14000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 73));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�߷θ��� �ú�" + ChatColor.YELLOW + " [Lv.238]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(15000);
				entity.setHealth(15000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("74");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob58(LivingEntity entity, Location loc) {
		// ���� ���� �߰� ����
		if (loc.getX() <= 3792 && loc.getY() <= 70
				&& loc.getZ() <= 3216 && loc.getX() >= 3790
				&& loc.getY() >= 68 && loc.getZ() >= 3214) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���귻" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(70000);
				entity.setHealth(70000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SOUL_TORCH);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(22);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 80));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob59(LivingEntity entity, Location loc) {
		// ���� ���� ����
		if (loc.getX() <= 3741 && loc.getY() <= 141
				&& loc.getZ() <= 3237 && loc.getX() >= 3739
				&& loc.getY() >= 139 && loc.getZ() >= 3235) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "�߷θ�" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(150000);
				entity.setHealth(150000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BLACK_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(23);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 90));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob60(LivingEntity entity, Location loc) {
		// ���� ������ -616 94 699  -897 43 871
		if (loc.getX() <= -616 && loc.getY() <= 94
				&& loc.getZ() <= 871 && loc.getX() >= -897
				&& loc.getY() >= 43 && loc.getZ() >= 699) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "�Ŵ� ������" + ChatColor.YELLOW + " [Lv.253]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				Slime slime = (Slime) entity;
				slime.setSize(5);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 74));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob61(LivingEntity entity, Location loc) {
		// �� �Ź����� -795 103 311  -313 45 691
		if (loc.getX() <= -313 && loc.getY() <= 103
				&& loc.getZ() <= 691 && loc.getX() >= -795
				&& loc.getY() >= 45 && loc.getZ() >= 311) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "���� �Ź�" + ChatColor.YELLOW + " [Lv.258]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(15000);
				entity.setHealth(15000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "���Ź�" + ChatColor.YELLOW + " [Lv.264]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(15000);
				entity.setHealth(15000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob62(LivingEntity entity, Location loc) {
		// ���� ������ -810 94 693  -970 43 602
		if (loc.getX() <= -810 && loc.getY() <= 94
				&& loc.getZ() <= 693 && loc.getX() >= -970
				&& loc.getY() >= 43 && loc.getZ() >= 602) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "�Ŵ� ������" + ChatColor.YELLOW + " [Lv.253]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				Slime slime = (Slime) entity;
				slime.setSize(5);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 74));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob63(LivingEntity entity, Location loc) {
		// ���� �������� -888 109 572 -1238 43 167
		if (loc.getX() <= -888 && loc.getY() <= 109
				&& loc.getZ() <= 572 && loc.getX() >= -1238
				&& loc.getY() >= 43 && loc.getZ() >= 167) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.265]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(16500);
				entity.setHealth(16500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(0);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(27, 84, 56));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(27, 84, 56));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(27, 84, 56));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ���ſ�" + ChatColor.YELLOW + " [Lv.270]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(40000);
				entity.setHealth(40000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 77));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob64(LivingEntity entity, Location loc) {
		// ���� �ϵ���1 -868 115 166  -1156 47 27  
		if (loc.getX() <= -868 && loc.getY() <= 115
				&& loc.getZ() <= 166 && loc.getX() >= -1156
				&& loc.getY() >= 47 && loc.getZ() >= 27) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.268]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(16000);
				entity.setHealth(16000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(2);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob65(LivingEntity entity, Location loc) {
		// ���� �ϵ���2 -974 109 -41  -869 47 -222
		if (loc.getX() <= -869 && loc.getY() <= 109
				&& loc.getZ() <= -41 && loc.getX() >= -974
				&& loc.getY() >= 47 && loc.getZ() >= -222) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����" + ChatColor.YELLOW + " [Lv.268]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(16000);
				entity.setHealth(16000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(2);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob66(LivingEntity entity, Location loc) {
		// Ǫ�� ���1 -311 113 498  -125 41 150
		if (loc.getX() <= -125 && loc.getY() <= 113 && loc.getZ() <= 498 
				&& loc.getX() >= -311 && loc.getY() >= 41 && loc.getZ() >= 150) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "Ǫ�� ���" + ChatColor.YELLOW + " [Lv.271]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(18000);
				entity.setHealth(18000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GOLDEN_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(12);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 78));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�ǻ�Ƴ� ����" + ChatColor.YELLOW + " [Lv.274]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(19000);
				entity.setHealth(19000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(13);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 80));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob67(LivingEntity entity, Location loc) {
		// Ǫ�� ���2 -124 115 149  -408 41 -263
		if (loc.getX() <= -124 && loc.getY() <= 115
				&& loc.getZ() <= 149 && loc.getX() >= -408
				&& loc.getY() >= 41 && loc.getZ() >= -263) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "�ϱ� �ı���" + ChatColor.YELLOW + " [Lv.290]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(24000);
				entity.setHealth(24000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 87));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�ǻ�Ƴ� �ذ�" + ChatColor.YELLOW + " [Lv.286]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(22500);
				entity.setHealth(22500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("85");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(15);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob68(LivingEntity entity, Location loc) {
		// Ǫ�� ���3 -123 115 367  62 41 37
		if (loc.getX() <= 62 && loc.getY() <= 115 && loc.getZ() <= 367 
				&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= 37) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ���� �÷��̾�" + ChatColor.YELLOW + " [Lv.279]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20000);
				entity.setHealth(20000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(14);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 82));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "Ķ����" + ChatColor.YELLOW + " [Lv.283]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(21000);
				entity.setHealth(21000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 84));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob69(LivingEntity entity, Location loc) {
		// Ǫ�� ���4 29 115 27  -123 41 -208
		if (loc.getX() <= 29 && loc.getY() <= 115
				&& loc.getZ() <= 27 && loc.getX() >= -123
				&& loc.getY() >= 41 && loc.getZ() >= -208) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "�ϱ� �ı���" + ChatColor.YELLOW + " [Lv.290]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(24000);
				entity.setHealth(24000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 87));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�ǻ�Ƴ� �ذ�" + ChatColor.YELLOW + " [Lv.286]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(22500);
				entity.setHealth(22500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("85");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob70(LivingEntity entity, Location loc) {
		// Ǫ�� ���5 61 115 366  211 41 461
		if (loc.getX() <= 211 && loc.getY() <= 115 && loc.getZ() <= 461
				&& loc.getX() >= 61 && loc.getY() >= 41 && loc.getZ() >= 366) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "Ǫ�� ���" + ChatColor.YELLOW + " [Lv.271]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(18000);
				entity.setHealth(18000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GOLDEN_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(12);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 78));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�ǻ�Ƴ� ����" + ChatColor.YELLOW + " [Lv.274]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(19000);
				entity.setHealth(19000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(13);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 80));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob71(LivingEntity entity, Location loc) {
		// Ǫ�� ���6 65 115 364  693 41 19
		if (loc.getX() <= 693 && loc.getY() <= 115 && loc.getZ() <= 364 
				&& loc.getX() >= 65 && loc.getY() >= 41 && loc.getZ() >= 19) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�� �����" + ChatColor.YELLOW + " [Lv.294]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(26000);
				entity.setHealth(26000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.IRON_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(15);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 89));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.300]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(70000);
				entity.setHealth(70000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment weapon2 = entity.getEquipment();
				ItemStack weaponItem2 = new ItemStack(Material.APPLE);
				weapon2.setItemInOffHand(weaponItem2);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(16);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 92));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob72(LivingEntity entity, Location loc) {
		// Ǫ�� ���7 40 115 -51  319 41 -421
		if (loc.getX() <= 319 && loc.getY() <= 115 && loc.getZ() <= -51 
				&& loc.getX() >= 40 && loc.getY() >= 41 && loc.getZ() >= -421) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "������" + ChatColor.YELLOW + " [Lv.299]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(28000);
				entity.setHealth(28000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.POTION);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment weapon2 = entity.getEquipment();
				ItemStack weaponItem2 = new ItemStack(Material.DRAGON_BREATH);
				weapon2.setItemInOffHand(weaponItem2);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(17);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(192, 0, 192));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(45, 180, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(207, 20, 20));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 91));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITCH) {
				entity.setCustomName(ChatColor.GRAY + "���� ����" + ChatColor.YELLOW + " [Lv.306]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(80000);
				entity.setHealth(80000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE
					|| entity.getType() == (EntityType) EntityType.PIG
					|| entity.getType() == (EntityType) EntityType.MUSHROOM_COW) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob73(LivingEntity entity, Location loc) {
		// �� ���� ����1 3390 40 3826  3424 11 3783
		if (loc.getX() <= 3424 && loc.getY() <= 40
				&& loc.getZ() <= 3826 && loc.getX() >= 3390
				&& loc.getY() >= 11 && loc.getZ() >= 3783) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.100]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2300);
				entity.setHealth(2300);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 37));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ���̵�" + ChatColor.YELLOW + " [Lv.105]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2400);
				entity.setHealth(2400);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("36");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob74(LivingEntity entity, Location loc) {
		// �� ���� ����2 3415 25 3769  3395 9 3712
		if (loc.getX() <= 3415 && loc.getY() <= 25
				&& loc.getZ() <= 3769 && loc.getX() >= 3395
				&& loc.getY() >= 9 && loc.getZ() >= 3712) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.110]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(5);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 40));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�屳��� ���̵�" + ChatColor.YELLOW + " [Lv.110]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("38");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(6);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 40));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "��������" + ChatColor.YELLOW + " [Lv.115]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(7);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 40));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob75(LivingEntity entity, Location loc) {
		// �� ���� ����3 3348 11 3759  3386 16 3721
		if (loc.getX() <= 3386 && loc.getY() <= 16
				&& loc.getZ() <= 3759 && loc.getX() >= 3348
				&& loc.getY() >= 11 && loc.getZ() >= 3721) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.105]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2500);
				entity.setHealth(2500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 38));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ���̵�" + ChatColor.YELLOW + " [Lv.108]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2700);
				entity.setHealth(2700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("37");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob76(LivingEntity entity, Location loc) {
		// �� ���� ����4 3336 10 3725  3299 45 3762
		if (loc.getX() <= 3336 && loc.getY() <= 45
				&& loc.getZ() <= 3762 && loc.getX() >= 3299
				&& loc.getY() >= 10 && loc.getZ() >= 3725) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "�Ƶ�" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20000);
				entity.setHealth(20000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(8);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 45));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "���̵� ����" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000);
				entity.setHealth(3000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 42));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob77(LivingEntity entity, Location loc) {
		// �� ���� ����5 3354 37 3827  3388 13 3803
		if (loc.getX() <= 3388 && loc.getY() <= 37
				&& loc.getZ() <= 3827 && loc.getX() >= 3354
				&& loc.getY() >= 13 && loc.getZ() >= 3803) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "������ ����" + ChatColor.YELLOW + " [Lv.105]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2500);
				entity.setHealth(2500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 38));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ ���̵�" + ChatColor.YELLOW + " [Lv.108]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2700);
				entity.setHealth(2700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("37");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob78(LivingEntity entity, Location loc) {
		// �� ���� ����6 3355 32 3803  3383 11 3766
		if (loc.getX() <= 3383 && loc.getY() <= 32
				&& loc.getZ() <= 3803 && loc.getX() >= 3355
				&& loc.getY() >= 11 && loc.getZ() >= 3766) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "Ư�� �丮��" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(60000);
				entity.setHealth(60000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 65));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "�ټ���" + ChatColor.YELLOW + " [Lv.180]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000);
				entity.setHealth(5000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 55));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob79(LivingEntity entity, Location loc) {
		// ž 1��
		if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "1���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(250000);
				entity.setHealth(250000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(0);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 95));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob80(LivingEntity entity, Location loc) {
		// ž 2��
		if (loc.getX() <= 90 && loc.getY() <= 100 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 88 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(450000);
				entity.setHealth(450000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 115));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob81(LivingEntity entity, Location loc) {
		// ž 3��
		if (loc.getX() <= 90 && loc.getY() <= 115 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 101 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob82(LivingEntity entity, Location loc) {
		// ž 4��
		if (loc.getX() <= 90 && loc.getY() <= 128 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 116 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob83(LivingEntity entity, Location loc) {
		// ž 5��
		if (loc.getX() <= 90 && loc.getY() <= 141 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 129 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob84(LivingEntity entity, Location loc) {
		// ž 6��
		if (loc.getX() <= 90 && loc.getY() <= 156 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 142 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob85(LivingEntity entity, Location loc) {
		// ž 7��
		if (loc.getX() <= 90 && loc.getY() <= 169 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 157 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob86(LivingEntity entity, Location loc) {
		// ž 8��
		if (loc.getX() <= 90 && loc.getY() <= 182 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 170 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob87(LivingEntity entity, Location loc) {
		// ž 9��
		if (loc.getX() <= 90 && loc.getY() <= 197 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 183 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob88(LivingEntity entity, Location loc) {
		// ž 10��
		if (loc.getX() <= 90 && loc.getY() <= 210 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 198 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob89(LivingEntity entity, Location loc) {
		// ž 11��
		if (loc.getX() <= 90 && loc.getY() <= 223 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 211 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob90(LivingEntity entity, Location loc) {
		// ž 12��
		if (loc.getX() <= 90 && loc.getY() <= 238 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 224 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2���� ������" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob91(LivingEntity entity, Location loc) {
		// ���Ʊ� ��ó �������� 33 41 -487  -40 4 -568
		if (loc.getX() <= 33 && loc.getY() <= 41 && loc.getZ() <= -487 && 
				loc.getX() >= -40 && loc.getY() >= 4 && loc.getZ() >= -568) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "������ �ļ���" + ChatColor.YELLOW + " [Lv.320]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(31000);
				entity.setHealth(31000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(18);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 96));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "������ �ļ���" + ChatColor.YELLOW + " [Lv.324]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(31000);
				entity.setHealth(31000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("96");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(18);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob92(LivingEntity entity, Location loc) {
		// ���� ������ ���� -1020 42 526  -931 1 401
		if (loc.getX() <= -931 && loc.getY() <= 42 && loc.getZ() <= 526 && 
				loc.getX() >= -1020 && loc.getY() >= 1 && loc.getZ() >= 401) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "�� ������" + ChatColor.YELLOW + " [Lv.310]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(29000);
				entity.setHealth(29000);
				Slime slime = (Slime) entity;
				slime.setSize(3);
				entity.setMaxHealth(29000);
				entity.setHealth(29000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 93));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob93(LivingEntity entity, Location loc) {
		// ���Ʊ� �ֺ� ���� -36 65 -227  -175 49 -323
		if (loc.getX() <= -36 && loc.getY() <= 65 && loc.getZ() <= -227 && 
				loc.getX() >= -175 && loc.getY() >= 49 && loc.getZ() >= -323) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "����� �ζ��� ����" + ChatColor.YELLOW + " [Lv.306]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(29000);
				entity.setHealth(29000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(19);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 92));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob94(LivingEntity entity, Location loc) {
		// ��ũ�κ��� -179 62 776  -78 4 580
		if (loc.getX() <= -78 && loc.getY() <= 62 && loc.getZ() <= 776 
				&& loc.getX() >= -179 && loc.getY() >= 4 && loc.getZ() >= 580) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "��ũ�κ����� �ϻ���" + ChatColor.YELLOW + " [Lv.308]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(28000);
				entity.setHealth(28000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(20);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 92));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "��ũ�κ����� ������" + ChatColor.YELLOW + " [Lv.314]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30000);
				entity.setHealth(30000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("94");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_HORN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(120, 120, 40));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(80, 40, 20));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "��ũ�κ����� ����" + ChatColor.YELLOW + " [Lv.318]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(32000);
				entity.setHealth(32000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 94));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob95(LivingEntity entity, Location loc) {
		// Ǫ����� ���� -59 77 555  146 58 466 
		if (loc.getX() <= 146 && loc.getY() <= 77 && loc.getZ() <= 555 
				&& loc.getX() >= -59 && loc.getY() >= 58 && loc.getZ() >= 466) {
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "Ǫ�� ������" + ChatColor.YELLOW + " [Lv.312]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(31000);
				entity.setHealth(31000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 93));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMITE) {
				entity.setCustomName(ChatColor.GRAY + "Ǫ�� ������" + ChatColor.YELLOW + " [Lv.317]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(32000);
				entity.setHealth(32000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 93));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob96(LivingEntity entity, Location loc) {
		// ���ϰ��� 313 41 -184  250 25 -154
		if (loc.getX() <= 313 && loc.getY() <= 41 && loc.getZ() <= -154 
				&& loc.getX() >= 250 && loc.getY() >= 25 && loc.getZ() >= -184) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���ϰ����� ����" + ChatColor.YELLOW + " [Lv.329]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(33500);
				entity.setHealth(33500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(22);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 97));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "���ϰ����� �˼�" + ChatColor.YELLOW + " [Lv.325]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(33000);
				entity.setHealth(33000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(23);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 96));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob97(LivingEntity entity, Location loc) {
		// ����ž 1  147 3 489  429 172 697
		if (loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 697 
				&& loc.getX() >= 147 && loc.getY() >= 3 && loc.getZ() >= 489) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "������ �λ깰" + ChatColor.YELLOW + " [Lv.325]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(32000);
				entity.setHealth(32000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 96));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "��ȭ ���� �ΰ�" + ChatColor.YELLOW + " [Lv.330]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(34000);
				entity.setHealth(34000);
				Husk husk = (Husk) entity;
				husk.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(24);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 98));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob98(LivingEntity entity, Location loc) {
		// ����ž 2 429 172 700  47 3 935
		if (loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 935 
				&& loc.getX() >= 47 && loc.getY() >= 3 && loc.getZ() >= 700) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "������ Ÿ���� ��" + ChatColor.YELLOW + " [Lv.332]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(35000);
				entity.setHealth(35000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 99));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "������ ������" + ChatColor.YELLOW + " [Lv.336]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(36000);
				entity.setHealth(36000);
				Slime slime = (Slime) entity;
				slime.setSize(2);
				entity.setMaxHealth(36000);
				entity.setHealth(36000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob99(LivingEntity entity, Location loc) {
		// ����ž 3  146 78 502  8 164 697
		if (loc.getX() <= 146 && loc.getY() <= 164 && loc.getZ() <= 697 
				&& loc.getX() >= 8 && loc.getY() >= 78 && loc.getZ() >= 502) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "������ �λ깰" + ChatColor.YELLOW + " [Lv.325]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(32000);
				entity.setHealth(32000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 96));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "��ȭ ���� �ΰ�" + ChatColor.YELLOW + " [Lv.330]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(34000);
				entity.setHealth(34000);
				Husk husk = (Husk) entity;
				husk.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(24);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 98));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob100(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob101(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob102(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob103(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob104(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob105(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob106(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob107(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob108(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob109(LivingEntity entity, Location loc) {
		return true;
	}

	public boolean mob110(LivingEntity entity, Location loc) {
		return true;
	}


}
