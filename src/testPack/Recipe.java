package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapView;
import org.bukkit.map.MapView.Scale;
import org.bukkit.plugin.Plugin;


public class Recipe {

	private Plugin plugin;
	
	public void Recipe() {
		plugin = Main.getPlugin(Main.class);
		
		ShapelessRecipe r1 = recipe1();
		
		plugin.getServer().clearRecipes();
		plugin.getServer().addRecipe(r1);
	}
	
	public ShapelessRecipe recipe1() {
		ItemStack item = new ItemStack(Material.MAP);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.WHITE + "Áöµµ");
		item.setItemMeta(im);
		MapView map = (MapView) item;
		map.setScale(Scale.FAR);
		map.setTrackingPosition(false);
		
		ShapelessRecipe r1 = new ShapelessRecipe(item);
		
		r1.addIngredient(1, Material.PAPER);
		
		return r1;
	}
	
}
