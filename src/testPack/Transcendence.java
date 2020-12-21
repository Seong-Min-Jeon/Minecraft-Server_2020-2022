package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Transcendence {

	public void transcendence(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
		t(player, is1, is2, inv);
	}
	
	public void t(Player player, ItemStack is1, ItemStack is2, Inventory inv) {
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
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "조건에 맞는 장비, 소재를 넣어주세요.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "달의 힘")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "용사의 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("100,40,0,0,0,30,0,10,10,70,100");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "달의 힘이 깃든 검");
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
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "조건에 맞는 장비, 소재를 넣어주세요.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "태양의 힘")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "용사의 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("100,0,40,0,0,30,10,0,10,70,100");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "태양의 힘이 깃든 검");
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
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "조건에 맞는 장비, 소재를 넣어주세요.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "검의 손잡이")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "달의 힘이 깃든 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("200,100,100,100,0,0,0,0,0,100,240");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "달의 힘이 깃든 검+");
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
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "조건에 맞는 장비, 소재를 넣어주세요.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "검의 손잡이")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "태양의 힘이 깃든 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("150,0,0,0,0,100,100,100,100,100,240");
				weaponIm.setDisplayName(ChatColor.LIGHT_PURPLE + "태양의 힘이 깃든 검+");
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
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "조건에 맞는 장비, 소재를 넣어주세요.");
		}
		
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
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "조건에 맞는 장비, 소재를 넣어주세요.");
		}
		
		if(is2.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "어둠의 결정석")) {
			if(is1.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "용사의 검")) {
				inv.getItem(1).setAmount(inv.getItem(1).getAmount() - 1);
				ItemStack weapon = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
				ItemMeta weaponIm = weapon.getItemMeta();
				weaponIm.setLocalizedName("300,100,100,100,100,100,100,100,100,100,250");
				weaponIm.setDisplayName(ChatColor.GREEN + "황혼의 용사 검");
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
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "조건에 맞는 장비, 소재를 넣어주세요.");
		}
		
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
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
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
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
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
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
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
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
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
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
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
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
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
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
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
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
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
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
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
				weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
				weaponIm.setUnbreakable(true);
				weaponIm.setLore(weaponLore);
				weapon.setItemMeta(weaponIm);
				inv.setItem(0, weapon);
				player.sendMessage(ChatColor.GREEN + "장비 초월에 성공하였습니다.");
				player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 2.0f, 2.0f);
				return;
			}
			player.sendMessage(ChatColor.WHITE + "조건에 맞는 장비, 소재를 넣어주세요.");
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
