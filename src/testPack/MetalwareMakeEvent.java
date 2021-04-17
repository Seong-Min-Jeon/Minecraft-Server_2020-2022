package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MetalwareMakeEvent {
	
	public void rein(Player player, Inventory inv) {
		try {
			if(inv.getItem(0).getType()==Material.DIAMOND_AXE) {
				ItemStack itemStack = inv.getItem(0);
    			ItemStack itemStack2 = inv.getItem(1);              
    			Metalware t = new Metalware();
    			t.effect(player, itemStack, itemStack2, inv); 
			}
		} catch(Exception e) {
			player.sendMessage(ChatColor.WHITE + "첫번째 칸에는 강화할 장신구, 두번째 칸에는 세공 도구를 넣어주세요.");
		}
		return;
	}
	
}
