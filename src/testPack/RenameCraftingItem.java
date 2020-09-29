package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RenameCraftingItem {
	
	public boolean renameCraftingItem(Player player, String msg) {
		if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
			if(msg.substring(0,1).equals("&") && msg.substring(msg.length() - 1).equals("&")) {
				ItemStack item = player.getInventory().getItemInMainHand();
				ItemMeta im = item.getItemMeta();
				if(im.getDisplayName().substring(0, 2).equals("��3")) {
					im.setDisplayName("��3" + msg.substring(1, msg.length()-1));
					item.setItemMeta(im);
					player.sendMessage(ChatColor.GREEN + "�������� �̸��� ����Ǿ����ϴ�.");
					return false;
				}
				player.sendMessage(ChatColor.RED + "�̸� ������ �Ұ����� �������Դϴ�.");
				return false;
			}
		}
		return true;
	}
	
}
