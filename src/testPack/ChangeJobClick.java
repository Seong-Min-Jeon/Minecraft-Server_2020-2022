package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ChangeJobClick {

	public void click(Player player, ItemStack item) {
		if (item.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "그림자 무사의 별")) {
			player.getInventory().addItem(item);
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "버서커의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "군인의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "그림 리퍼의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "아처의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "데빌의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "엔젤의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "대행자의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "용기사의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "팔라딘의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "마인의 별")) {
			player.getInventory().addItem(item); 
			player.sendMessage(ChatColor.RED + "직업을 바꾸면 인벤토리와 레벨이 초기화 됩니다. 중요한 물건은 창고에 넣어두시길 바랍니다.");
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
		if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "돌아가기")) {
			player.teleport(new Location(player.getWorld(), -699, 52, 2135));
		}
	}

}
