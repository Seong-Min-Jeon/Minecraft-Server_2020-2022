package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MysteryChestTableOpen {

	public void openInv(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Mystery chest table");
		ItemStack ok = new ItemStack(Material.SLIME_BALL);
		ItemMeta okIm = ok.getItemMeta();
		okIm.setDisplayName(ChatColor.GREEN + "상자 열기");
		ArrayList<String> okLore = new ArrayList();
		okLore.add(ChatColor.GRAY + "빈 칸에 의문의 상자를 1개씩 올려주세요.");
		okIm.setLore(okLore);
		okIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		okIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		ok.setItemMeta(okIm);
		ItemStack no = new ItemStack(Material.SHULKER_SHELL);
		ItemMeta noIm = no.getItemMeta();
		noIm.setDisplayName(ChatColor.RED + "나가기");
		noIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		noIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		no.setItemMeta(noIm);
		ItemStack bar = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
		ItemMeta barIm = bar.getItemMeta();
		barIm.setDisplayName(ChatColor.RED + " ");
		barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		bar.setItemMeta(barIm);
		inv.setItem(6, bar);
		inv.setItem(7, ok);
		inv.setItem(8, no);
		player.openInventory(inv);
	}
	
}
