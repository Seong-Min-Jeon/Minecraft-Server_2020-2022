package testPack;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftWitherSkeleton;

import net.minecraft.server.v1_16_R1.EntityBlaze;
import net.minecraft.server.v1_16_R1.EntityHuman;
import net.minecraft.server.v1_16_R1.EntitySkeleton;
import net.minecraft.server.v1_16_R1.EntitySkeletonWither;
import net.minecraft.server.v1_16_R1.EntityTypes;
import net.minecraft.server.v1_16_R1.EntityWither;
import net.minecraft.server.v1_16_R1.PathfinderGoalArrowAttack;
import net.minecraft.server.v1_16_R1.PathfinderGoalAvoidTarget;
import net.minecraft.server.v1_16_R1.PathfinderGoalFloat;
import net.minecraft.server.v1_16_R1.PathfinderGoalHurtByTarget;
import net.minecraft.server.v1_16_R1.PathfinderGoalLookAtPlayer;
import net.minecraft.server.v1_16_R1.PathfinderGoalMeleeAttack;
import net.minecraft.server.v1_16_R1.PathfinderGoalMoveTowardsRestriction;
import net.minecraft.server.v1_16_R1.PathfinderGoalMoveTowardsTarget;
import net.minecraft.server.v1_16_R1.PathfinderGoalNearestAttackableTarget;
import net.minecraft.server.v1_16_R1.PathfinderGoalRandomLookaround;
import net.minecraft.server.v1_16_R1.PathfinderGoalRandomStroll;
import net.minecraft.server.v1_16_R1.PathfinderGoalRandomStrollLand;

public class CustomWitherSkeleton2 extends EntitySkeletonWither{

	public CustomWitherSkeleton2(Location loc) {
		super(EntityTypes.WITHER_SKELETON, ((CraftWorld) loc.getWorld()).getHandle());
		this.setPosition(loc.getX(), loc.getY(), loc.getZ());
	}
	
	@Override
	public void initPathfinder() {
		this.goalSelector.a(0, new PathfinderGoalFloat(this));
		
		this.goalSelector.a(4, new PathfinderGoalMeleeAttack(this, 1.0D, true));
		this.goalSelector.a(5, new PathfinderGoalMoveTowardsRestriction(this, 0.2D));
		this.goalSelector.a(1, new PathfinderGoalRandomStroll(this, 1.0D));
		this.goalSelector.a(8, new PathfinderGoalRandomLookaround(this));
		this.goalSelector.a(8, new PathfinderGoalLookAtPlayer(this, EntityHuman.class, 8.0F));
		this.goalSelector.a(2, new PathfinderGoalArrowAttack(this, 1.0D, 40, 20, 15.0F)); 
		this.goalSelector.a(10, new PathfinderGoalMoveTowardsTarget(this, 30.0D, 25.0F));

		this.targetSelector.a(1, new PathfinderGoalHurtByTarget(this));
		this.targetSelector.a(2, new PathfinderGoalNearestAttackableTarget<EntityHuman>(this, EntityHuman.class, true));
		
	}
	
}
