package testPack;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.Snow;
import org.bukkit.util.Vector;

public class SnowStack {
	
	public SnowStack(Block flagBlock, int range) {
		Location flagLoc = flagBlock.getLocation().add(-range, -5, -range);
		for(int i = 0 ; i < range*2 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				for(int k = 0 ; k < range*2 ; k++) {
					setSnow(flagLoc.clone().add(i, j, k));
				}
			}
		}
	}
	
	public void setSnow(Location groundLoc) {
		try {
			Block ground = groundLoc.getBlock();
			Block change = groundLoc.add(0,1,0).getBlock();
			if(ground.getType() != Material.AIR && ground.getType() != Material.WATER && ground.getType() != Material.LAVA) {
				if(ground.getType() == Material.SNOW) {
					Snow groundSnow = (Snow) change.getBlockData();
					int groundLayers = groundSnow.getLayers();
					if(groundLayers < 8) {
						return;
					}
				}
				if(change.getType() == Material.AIR || change.getType() == Material.SNOW) {
					int layers = 0;
					int current = 0;
					if(change.getType() == Material.SNOW) {
						Snow snow = (Snow) change.getBlockData();
						current = snow.getLayers();
						layers = getNearSnowLayers(change, current);
					} else {
						layers = getNearSnowLayers(change, 0);
					}
					if(layers > 8) {
						layers = 8;
					}
					change.setType(Material.SNOW);
					Snow snow = (Snow) change.getBlockData();
					if(current < layers) {
						snow.setLayers(layers);
						change.setBlockData(snow);
					} else {
						snow.setLayers(current);
						change.setBlockData(snow);
					}
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	public int getNearSnowLayers(Block flagBlock, int current) {
		int total = 0;
		int tmp = 0;
		for(int i = -1 ; i <= 1 ; i++) {
			for(int j = -1 ; j <= 1 ; j++) {
				Block nearBlock = flagBlock.getLocation().add(i,0,j).getBlock();
				if(nearBlock.getType() == Material.SNOW) {
					Snow snow = (Snow) nearBlock.getBlockData();
					total += snow.getLayers();
					tmp++;
				}
			}
		}
		if(tmp == 0) {
			tmp = 1;
		}
		int layers = (total / 9) + new Random().nextInt(2);
		return layers;
	}
}