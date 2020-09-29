package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemDestroyScroll {

	public void openInv(Player player, Item itemArg) {
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "������ �ı� ��ũ��")) {
			itemArg.remove();
			Inventory inv = Bukkit.createInventory(player, 54, "Item Destroy Table");
			ItemStack no = new ItemStack(Material.SHULKER_SHELL);
			ItemMeta noIm = no.getItemMeta();
			noIm.setDisplayName(ChatColor.RED + "������");
			ArrayList<String> noLore = new ArrayList();
			noLore.add(ChatColor.GRAY + "�����⸦ �����ų� â�� ������ ���̺� ���� �������� ������ϴ�.");
			noIm.setLore(noLore);
			noIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			noIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			no.setItemMeta(noIm);

			inv.setItem(53, no);
			player.openInventory(inv);
		}
	}
	
}
