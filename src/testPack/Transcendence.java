package testPack;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Transcendence {
	
	Random rnd = new Random();

	public void transcendence(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		t1(player, is1, is2, inv);
		t2(player, is1, is2, inv);
		t3(player, is1, is2, inv);
		t4(player, is1, is2, inv);
		t5(player, is1, is2, inv);
		t6(player, is1, is2, inv);
		t7(player, is1, is2, inv);
		t8(player, is1, is2, inv);
		t9(player, is1, is2, inv);
		t10(player, is1, is2, inv);
		t11(player, is1, is2, inv);
		t12(player, is1, is2, inv);
		t13(player, is1, is2, inv);
		t14(player, is1, is2, inv);
		t15(player, is1, is2, inv);
		t16(player, is1, is2, inv);
		t17(player, is1, is2, inv);
	}
	
	public void t1(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "검은 수염의 증표")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "검은 수염단의 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.ACACIA_LEAVES);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("50,0,0,50,0,0,0,0,0,0,100");
				weaponIm.setDisplayName(ChatColor.AQUA + "검은 수염 간부의 검");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 100");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "검은 수염 간부만이 가질 수 있는 검");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t2(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "달의 힘")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "용사의 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("100,40,0,0,0,30,0,10,10,70,100");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "달의 힘이 깃든 검");
				weaponIm.setCustomModelData(2);
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 100");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "달의 정기를 받은 용사의 검");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t3(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "태양의 힘")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "용사의 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("100,0,40,0,0,30,10,0,10,70,100");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "태양의 힘이 깃든 검");
				weaponIm.setCustomModelData(1);
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 100");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "태양의 정기를 받은 용사의 검");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t4(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "검의 손잡이")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "달의 힘이 깃든 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("200,100,100,100,0,0,0,0,0,100,240");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "달의 힘이 깃든 검+");
				weaponIm.setCustomModelData(4);
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 240");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "달의 정기를 받은 용사의 검");
				weaponLore.add(ChatColor.GRAY + "손잡이를 교체해 더욱 강해졌다.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t5(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "검의 손잡이")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "태양의 힘이 깃든 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("150,0,0,0,0,100,100,100,100,100,240");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "태양의 힘이 깃든 검+");
				weaponIm.setCustomModelData(3);
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 240");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "태양의 정기를 받은 용사의 검");
				weaponLore.add(ChatColor.GRAY + "손잡이를 교체해 더욱 강해졌다.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t6(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "크리스탈라이즈 주괴")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "부조화의 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.SPRUCE_PLANKS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("300,0,0,100,300,200,100,0,0,0,250");
				weaponIm.setDisplayName(ChatColor.DARK_RED + "다크 리펄서");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 250");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "크리스탈라이즈 주괴로 만들어진 직검");
				weaponLore.add(ChatColor.GRAY + "이름의 뜻은 '어둠을 물리치는 자'이다.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t7(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "어둠의 결정석")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "용사의 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("300,100,100,100,100,100,100,100,100,100,250");
				weaponIm.setDisplayName(ChatColor.GREEN + "황혼의 용사 검");
				weaponIm.setCustomModelData(9);
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 250");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "황혼의 세계에서 발견한 물질로 강화된 용사의 검");
				weaponLore.add(ChatColor.GRAY + "용사의 검이 가진 잠재력 중 하나를");
				weaponLore.add(ChatColor.GRAY + "최대치로 끌어낸 듯 하다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t8(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "화염의 돌")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "탑의 초심자 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.BIRCH_LOG);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("500,0,0,800,100,300,0,0,0,3000,400");
				weaponIm.setDisplayName(ChatColor.AQUA + "불타는 여명의 검");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 초심자 검이 진정한 모습을 찾았다.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 초심자 헬멧")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.IRON_HELMET);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("500,100,100,100,0,800,0,0,0,0,400");
				weaponIm.setDisplayName(ChatColor.GREEN + "불타는 여명의 헬멧");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 초심자 헬멧이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 초심자 갑옷")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.IRON_CHESTPLATE);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("100,500,100,100,0,800,0,0,0,0,400");
				weaponIm.setDisplayName(ChatColor.GREEN + "불타는 여명의 갑옷");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 초심자 갑옷이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 초심자 각반")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.IRON_LEGGINGS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("100,100,500,100,0,800,0,0,0,0,400");
				weaponIm.setDisplayName(ChatColor.GREEN + "불타는 여명의 각반");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 초심자 각반이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 초심자 신발")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.IRON_BOOTS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("100,100,100,500,0,800,0,0,0,0,400");
				weaponIm.setDisplayName(ChatColor.GREEN + "불타는 여명의 신발");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 초심자 신발이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "탑의 도전자 도끼")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GREEN_CARPET);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("300,0,0,0,1500,500,0,0,0,500,400");
				weaponIm.setDisplayName(ChatColor.AQUA + "불타는 의지의 도끼");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 도전자 도끼가 진정한 모습을 찾았다.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 도전자 헬멧")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.IRON_HELMET);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("0,0,0,0,0,0,0,0,0,0,400");
				weaponIm.setDisplayName(ChatColor.GREEN + "불타는 의지의 헬멧");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 도전자 헬멧이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 도전자 갑옷")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.IRON_CHESTPLATE);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("0,0,0,0,0,0,0,0,0,0,400");
				weaponIm.setDisplayName(ChatColor.GREEN + "불타는 의지의 갑옷");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 도전자 갑옷이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 도전자 각반")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.IRON_LEGGINGS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("0,0,0,0,0,0,0,0,0,0,400");
				weaponIm.setDisplayName(ChatColor.GREEN + "불타는 의지의 각반");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 도전자 각반이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 도전자 신발")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.IRON_BOOTS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("0,0,0,0,0,0,0,0,0,0,400");
				weaponIm.setDisplayName(ChatColor.GREEN + "불타는 의지의 신발");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 400");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 도전자 신발이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t9(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "천옥개")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "주작")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.LEATHER_HELMET);
				LeatherArmorMeta leatherIm = (LeatherArmorMeta) weapon.getItemMeta();
				leatherIm.setColor(Color.fromRGB(255, 0, 0));
				weapon.setItemMeta(leatherIm);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("1000,300,300,300,100,1000,0,0,0,0,450");
				weaponIm.setDisplayName(ChatColor.GREEN + "천옥개 염봉");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 450");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "천옥개에 의해 주작의 힘이 각성하였다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_DYE);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "청룡")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta leatherIm = (LeatherArmorMeta) weapon.getItemMeta();
				leatherIm.setColor(Color.fromRGB(0, 0, 255));
				weapon.setItemMeta(leatherIm);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("1500,0,0,0,300,800,0,0,0,0,450");
				weaponIm.setDisplayName(ChatColor.GREEN + "천옥개 창룡");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 450");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "천옥개에 의해 청룡의 힘이 각성하였다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_DYE);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "백호")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leatherIm = (LeatherArmorMeta) weapon.getItemMeta();
				leatherIm.setColor(Color.fromRGB(255, 255, 255));
				weapon.setItemMeta(leatherIm);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("600,500,500,500,150,700,0,0,0,300,450");
				weaponIm.setDisplayName(ChatColor.GREEN + "천옥개 노호");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 450");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "천옥개에 의해 백호의 힘이 각성하였다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_DYE);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "현무")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta leatherIm = (LeatherArmorMeta) weapon.getItemMeta();
				leatherIm.setColor(Color.fromRGB(0, 0, 0));
				weapon.setItemMeta(leatherIm);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("300,100,100,100,0,2000,0,0,0,0,450");
				weaponIm.setDisplayName(ChatColor.GREEN + "천옥개 진무");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 450");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "천옥개에 의해 현무의 힘이 각성하였다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_DYE);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t10(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "패왕의 힘")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "리벨리온")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_HELMET);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("2500,0,0,0,0,2000,0,0,0,0,500");
				weaponIm.setDisplayName(ChatColor.GREEN + "패왕권룡 다크 리벨리온");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 500");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "'칠흑의 어둠에서 살고 있는 반역의 송곳니'라는 별명의 신발");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "베놈")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_CHESTPLATE);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("2800,0,0,0,0,2000,0,0,0,0,500");
				weaponIm.setDisplayName(ChatColor.GREEN + "패왕권룡 스타브 베놈");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 500");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "굶주린 송곳니를 가진 독룡이 그려진 갑옷");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "오드아이즈")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_LEGGINGS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("2500,0,0,0,0,2000,0,0,0,0,500");
				weaponIm.setDisplayName(ChatColor.GREEN + "패왕권룡 오드아이즈");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 500");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "두 색의 눈동자를 가진 드래곤의 뿔로 만든 각반");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "클리어윙")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_BOOTS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("2500,0,0,0,0,2000,0,0,0,0,500");
				weaponIm.setDisplayName(ChatColor.GREEN + "패왕권룡 클리어윙");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 500");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "빛의 날개를 가진 드래곤의 비늘로 만든 각반");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t11(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "무명의 성물")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "달의 힘이 깃든 검+")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("2000,0,0,0,1000,800,800,800,800,800,500");
				weaponIm.setDisplayName(ChatColor.AQUA + "검은 달");
				weaponIm.setCustomModelData(6);
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 500");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "어둠의 기운과 달의 기운이 만나 초월된 용사의 검");
				weaponLore.add(ChatColor.GRAY + "달의 찬란한 힘을 잃고 어둠의 힘만 남게 되었다.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t12(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "무명의 성물")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "태양의 힘이 깃든 검+")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("3000,0,0,0,0,1500,0,0,0,1500,500");
				weaponIm.setDisplayName(ChatColor.AQUA + "검은 태양");
				weaponIm.setCustomModelData(5);
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 500");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "어둠의 기운과 태양의 기운이 만나 초월된 용사의 검");
				weaponLore.add(ChatColor.GRAY + "태양의 강렬한 힘을 잃고 어둠의 힘만 남게 되었다.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t13(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "텅 빈 심장")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "검은 달")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("3000,500,500,500,1000,3000,1000,1000,1000,2000,600");
				weaponIm.setDisplayName(ChatColor.AQUA + "검은 달+");
				weaponIm.setCustomModelData(8);
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 600");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "어둠의 기운과 달의 기운이 만나 초월된 용사의 검");
				weaponLore.add(ChatColor.GRAY + "달의 찬란한 힘을 잃고 어둠의 힘만 남게 되었다.");
				weaponLore.add(ChatColor.GRAY + "검은 수염이 숨겨둔 보물을 사용해 잠재력이 깨어났다.");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.BLUE + "-근접 공격 시 40% 확률로 마나 획득");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t14(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "텅 빈 심장")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "검은 태양")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("5000,1500,1500,1500,1500,2000,0,0,0,1000,600");
				weaponIm.setDisplayName(ChatColor.AQUA + "검은 태양+");
				weaponIm.setCustomModelData(7);
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 600");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "어둠의 기운과 태양의 기운이 만나 초월된 용사의 검");
				weaponLore.add(ChatColor.GRAY + "태양의 강렬한 힘을 잃고 어둠의 힘만 남게 되었다.");
				weaponLore.add(ChatColor.GRAY + "검은 수염이 숨겨둔 보물을 사용해 잠재력이 깨어났다.");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.BLUE + "-흡혈 1%");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public void t15(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "크리스탈라이즈 주괴")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "일루시데이터")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				if(rnd.nextInt(10) == 0) {
					ItemStack weapon = new ItemStack(Material.OAK_PLANKS);
					ItemMeta weaponIm = weapon.getItemMeta();
					weaponIm.setLocalizedName("2000,1000,1000,1000,1000,2000,0,0,0,1000,500");
					weaponIm.setDisplayName(ChatColor.DARK_RED + "일루시데이터+");
					ArrayList<String> weaponLore = new ArrayList();
					weaponLore.add(ChatColor.GRAY + "레벨 제한: 500");
					weaponLore.add(ChatColor.GRAY + " ");
					weaponLore.add(ChatColor.GRAY + "부유성 50층 보스에게 드랍된 마검");
					weaponLore.add(ChatColor.GRAY + "평범한 마스터 클래스의 검보다도 성능이 좋다.");
					weaponLore.add(ChatColor.GRAY + "크리스탈라이즈 주괴의 숨겨진 힘으로");
					weaponLore.add(ChatColor.GRAY + "한층 더 단단해졌다.");
					weaponLore.add(ChatColor.GRAY + " ");
					weaponLore.add(ChatColor.BLUE + "-흡혈 0.8%");
					weaponLore.add(ChatColor.BLUE + "-근접 공격 시 20% 확률로 마나 획득");
					weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
					weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
					weaponIm.setUnbreakable(true);
					weaponIm.setLore(weaponLore);
					weapon.setItemMeta(weaponIm);
					inv.setItem(0, weapon);
					player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "장비 초월에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			}
		}
	}
	
	public void t16(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "크리스탈라이즈 주괴")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "다크 리펄서")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				if(rnd.nextInt(10) == 0) {
					ItemStack weapon = new ItemStack(Material.SPRUCE_PLANKS);
					ItemMeta weaponIm = weapon.getItemMeta();
					weaponIm.setLocalizedName("1500,1200,1200,1200,1000,2000,800,800,800,1500,500");
					weaponIm.setDisplayName(ChatColor.DARK_RED + "다크 리펄서+");
					ArrayList<String> weaponLore = new ArrayList();
					weaponLore.add(ChatColor.GRAY + "레벨 제한: 500");
					weaponLore.add(ChatColor.GRAY + " ");
					weaponLore.add(ChatColor.GRAY + "크리스탈라이즈 주괴로 만들어진 직검");
					weaponLore.add(ChatColor.GRAY + "이름의 뜻은 '어둠을 물리치는 자'이다.");
					weaponLore.add(ChatColor.GRAY + "크리스탈라이즈 주괴의 숨겨진 힘으로");
					weaponLore.add(ChatColor.GRAY + "한층 더 단단해졌다.");
					weaponLore.add(ChatColor.GRAY + " ");
					weaponLore.add(ChatColor.BLUE + "-전투 경험치 10% 증가");
					weaponLore.add(ChatColor.BLUE + "-근접 공격 시 30% 확률로 마나 획득");
					weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
					weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
					weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
					weaponIm.setUnbreakable(true);
					weaponIm.setLore(weaponLore);
					weapon.setItemMeta(weaponIm);
					inv.setItem(0, weapon);
					player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
				} else {
					player.sendMessage(ChatColor.WHITE + "장비 초월에 실패하였습니다.");
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
				}
			}
		}
	}
	
	public void t17(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "운명의 돌")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "탑의 조율자 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.BEDROCK);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("3000,0,0,1000,1000,1000,0,0,0,2000,550");
				weaponIm.setDisplayName(ChatColor.AQUA + "운명을 따르는 검");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 조율자 검이 진정한 모습을 찾았다.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 조율자 헬멧")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_HELMET);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("1500,1000,1000,1000,0,2000,0,0,0,0,550");
				weaponIm.setDisplayName(ChatColor.GREEN + "운명을 따르는 헬멧");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 조율자 헬멧이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 조율자 갑옷")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_CHESTPLATE);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("1500,1000,1000,1000,0,2000,0,0,0,0,550");
				weaponIm.setDisplayName(ChatColor.GREEN + "운명을 따르는 갑옷");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 조율자 갑옷이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 조율자 각반")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_LEGGINGS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("1500,1000,1000,1000,0,2000,0,0,0,0,550");
				weaponIm.setDisplayName(ChatColor.GREEN + "운명을 따르는 각반");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 조율자 각반이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 조율자 신발")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_BOOTS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("1500,1000,1000,1000,0,2000,0,0,0,0,550");
				weaponIm.setDisplayName(ChatColor.GREEN + "운명을 따르는 신발");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 조율자 신발이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "탑의 강탈자 창")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.JUNGLE_SLAB);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("3000,1000,1000,1000,1000,0,0,0,0,0,550");
				weaponIm.setDisplayName(ChatColor.AQUA + "운명을 바꾸는 창");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 강탈자 창이 진정한 모습을 찾았다.");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 강탈자 헬멧")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_HELMET);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("0,0,0,0,4000,0,0,0,0,0,550");
				weaponIm.setDisplayName(ChatColor.GREEN + "운명을 바꾸는 헬멧");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 강탈자 헬멧이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 강탈자 갑옷")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_CHESTPLATE);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("0,0,0,0,4000,0,0,0,0,0,550");
				weaponIm.setDisplayName(ChatColor.GREEN + "운명을 바꾸는 갑옷");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 강탈자 갑옷이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 강탈자 각반")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_LEGGINGS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("0,0,0,0,4000,0,0,0,0,0,550");
				weaponIm.setDisplayName(ChatColor.GREEN + "운명을 바꾸는 각반");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 강탈자 각반이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			} else if(is1.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "탑의 강탈자 신발")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.GOLDEN_BOOTS);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("0,0,0,0,4000,0,0,0,0,0,550");
				weaponIm.setDisplayName(ChatColor.GREEN + "운명을 바꾸는 신발");
				ArrayList<String> weaponLore = new ArrayList();
				weaponLore.add(ChatColor.GRAY + "레벨 제한: 550");
				weaponLore.add(ChatColor.GRAY + " ");
				weaponLore.add(ChatColor.GRAY + "탑의 강탈자 신발이 진정한 모습을 찾았다.");
				weaponLore.add(ChatColor.GRAY + "(세트 아이템)");
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
			}
		}
	}
	
	public String makeEnch(String[] ary, String str, int num) {
		String result = "";
		for(int i = 0 ; i < 10 ; i++) {
			if(i == num) {
				result = result + "," + str;
				continue;
			}
			result = result + "," + ary[i];
		}
		String data = result.substring(1);
		return data;
	}
	
}
