package testPack;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;

import net.minecraft.server.v1_16_R3.EntityBlaze;
import net.minecraft.server.v1_16_R3.EntityHuman;
import net.minecraft.server.v1_16_R3.EntitySkeleton;
import net.minecraft.server.v1_16_R3.EntitySkeletonWither;
import net.minecraft.server.v1_16_R3.EntityTypes;
import net.minecraft.server.v1_16_R3.EntityWither;
import net.minecraft.server.v1_16_R3.EntityWitherSkull;
import net.minecraft.server.v1_16_R3.PathfinderGoalAvoidTarget;
import net.minecraft.server.v1_16_R3.PathfinderGoalFloat;
import net.minecraft.server.v1_16_R3.PathfinderGoalHurtByTarget;
import net.minecraft.server.v1_16_R3.PathfinderGoalLookAtPlayer;
import net.minecraft.server.v1_16_R3.PathfinderGoalMeleeAttack;
import net.minecraft.server.v1_16_R3.PathfinderGoalMoveTowardsRestriction;
import net.minecraft.server.v1_16_R3.PathfinderGoalNearestAttackableTarget;
import net.minecraft.server.v1_16_R3.PathfinderGoalRandomLookaround;
import net.minecraft.server.v1_16_R3.PathfinderGoalRandomStroll;

public class CustomWitherSkeleton extends EntitySkeletonWither{

	public CustomWitherSkeleton(Location loc) {
		super(EntityTypes.WITHER_SKELETON, ((CraftWorld) loc.getWorld()).getHandle());
		this.setPosition(loc.getX(), loc.getY(), loc.getZ());
	}
	
	@Override
	public void initPathfinder() {
		this.goalSelector.a(0, new PathfinderGoalFloat(this));
		
		this.goalSelector.a(4, new PathfinderGoalMeleeAttack(this, 1.0D, true));
		this.goalSelector.a(5, new PathfinderGoalMoveTowardsRestriction(this, 0.2D));
		this.goalSelector.a(7, new PathfinderGoalRandomStroll(this, 0.2D));
		this.goalSelector.a(8, new PathfinderGoalRandomLookaround(this));
		this.goalSelector.a(8, new PathfinderGoalLookAtPlayer(this, EntityHuman.class, 50.0F));
		
		this.targetSelector.a(1, new PathfinderGoalHurtByTarget(this));
		this.targetSelector.a(2, new PathfinderGoalNearestAttackableTarget<EntityHuman>(this, EntityHuman.class, true));
	}
}
