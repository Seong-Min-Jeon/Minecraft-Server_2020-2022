package testPack;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.server.v1_16_R3.ChatMessageType;
import net.minecraft.server.v1_16_R3.IChatBaseComponent;
import net.minecraft.server.v1_16_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_16_R3.PacketPlayOutChat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class Cmd22MysteryChest implements CommandExecutor {
	
	static HashMap<Player, Boolean> limitTime = new HashMap<>();
	static HashMap<Player, Player> tradeRel = new HashMap<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("mysterychest")) {
				player.sendMessage(ChatColor.DARK_AQUA + "====================");
				player.sendMessage(ChatColor.DARK_AQUA + " ");
				player.sendMessage(ChatColor.LIGHT_PURPLE + "의문의 상자" + ChatColor.WHITE + " 카운터: " + new PitySystem().getUnique(player));
				player.sendMessage(ChatColor.AQUA + "의문의 상자" + ChatColor.WHITE + " 카운터: " + new PitySystem().getLegendary(player));
				player.sendMessage(ChatColor.DARK_RED + "의문의 상자" + ChatColor.WHITE + " 카운터: " + new PitySystem().getHero(player));
				player.sendMessage(ChatColor.DARK_GREEN + "의문의 상자" + ChatColor.WHITE + " 카운터: " + new PitySystem().getAcc(player));
				player.sendMessage(ChatColor.DARK_AQUA + " ");
				player.sendMessage(ChatColor.DARK_AQUA + "====================");
			}
		}	
		return true;
	}

}
