package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Cmd26setLocalizedName implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(player.isOp()) {
				String name = args[0];
				if(name.equals("")) {
					player.sendMessage(ChatColor.RED + "사용할 수 없는 이름입니다.");
				} else {
					if(player.getInventory().getItemInMainHand().getItemMeta() != null) {
						ItemStack item = player.getInventory().getItemInMainHand();
						ItemMeta im = item.getItemMeta();
						im.setLocalizedName(name);
						item.setItemMeta(im);
						player.sendMessage(ChatColor.WHITE + "변경 완료");
						return true;
					} else {
						player.sendMessage(ChatColor.RED + "오른손에 아이템을 들어야 합니다.");
						return true;
					}
				}
			}
		}	
		return true;
	}

}
