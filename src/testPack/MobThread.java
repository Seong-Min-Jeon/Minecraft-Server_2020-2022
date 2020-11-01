package testPack;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.v1_16_R1.CraftWorld;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Husk;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Player;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Stray;
import org.bukkit.entity.Vex;
import org.bukkit.entity.Vindicator;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

import net.minecraft.server.v1_16_R1.WorldServer;

public class MobThread {

	int sleep;
	Random rnd = new Random();

	public MobThread(Player player) {

		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;

			@Override
			public void run() {

				Location loc = player.getLocation();
				
				if(loc.getBlock().getType() != Material.WATER) {
					if(time % 360 == 10) {
						if (loc.getX() <= 3712 && loc.getY() <= 47 && loc.getZ() <= 3708 && loc.getX() >= 3686
								&& loc.getY() >= 39 && loc.getZ() >= 3672) {
							tutozone(player, loc);
						}
					}

					if (time % 90 == 10) {
//						if(loc.getX()<=3712 && loc.getY()<=47 && loc.getZ()<=3708
//								&& loc.getX()>=3686 && loc.getY()>=39 && loc.getZ()>=3672) {
//							tutozone(player, loc);
//						}
						if (loc.getX() <= -1833 && loc.getY() <= 60 && loc.getZ() <= 3107 && loc.getX() >= -1882
								&& loc.getY() >= 50 && loc.getZ() >= 3068) {
							greenSlime(player, loc);
						} else if(loc.getX() <= -1887 && loc.getY() <= 56 && loc.getZ() <= 3068 && loc.getX() >= -1946
								&& loc.getY() >= 45 && loc.getZ() >= 2986) {
							coastZombie(player, loc);
						} else if(loc.getX() <= -1786 && loc.getY() <= 57 && loc.getZ() <= 3094 && loc.getX() >= -1820
								&& loc.getY() >= 50 && loc.getZ() >= 3061) {
							wargunilSkel(player, loc);
						} else if(loc.getX() <= -1960 && loc.getY() <= 60 && loc.getZ() <= 2954 && loc.getX() >= -1980
								&& loc.getY() >= 52 && loc.getZ() >= 2947) {
							wargunilSea(player, loc);
						} else if(loc.getX() <= -1870 && loc.getY() <= 80 && loc.getZ() <= 2694 && loc.getX() >= -1925
								&& loc.getY() >= 45 && loc.getZ() >= 2635) {
							forestGhost(player, loc);
						} else if(loc.getX() <= -1882 && loc.getY() <= 77 && loc.getZ() <= 2617 && loc.getX() >= -1938
								&& loc.getY() >= 45 && loc.getZ() >= 2596) {
							crystalWarrior(player, loc);
						} else if(loc.getX() <= -1788 && loc.getY() <= 65 && loc.getZ() <= 2570 && loc.getX() >= -1822
								&& loc.getY() >= 50 && loc.getZ() >= 2535) {
							woodFairy(player, loc);
						} else if(loc.getX() <= 3713 && loc.getY() <= 23 && loc.getZ() <= 3765 && loc.getX() >= 3703
								&& loc.getY() >= 15 && loc.getZ() >= 3756) {
							turtleWarrior(player, loc);
						} else if(loc.getX() <= -1830 && loc.getY() <= 100 && loc.getZ() <= 2472 && loc.getX() >= -1964
								&& loc.getY() >= 40 && loc.getZ() >= 2324) {
							vindicator(player, loc);
						} else if(loc.getX() <= -1936 && loc.getY() <= 100 && loc.getZ() <= 2686 && loc.getX() >= -2143
								&& loc.getY() >= 30 && loc.getZ() >= 2444) {
							forganWestForest(player, loc);
						} else if(loc.getX() <= -1913 && loc.getY() <= 100 && loc.getZ() <= 2354 && loc.getX() >= -2121
								&& loc.getY() >= 30 && loc.getZ() >= 2271) {
							mountainThief(player, loc);
						} else if(loc.getX() <= 3532 && loc.getY() <= 30 && loc.getZ() <= 3773 && loc.getX() >= 3447
								&& loc.getY() >= 10 && loc.getZ() >= 3690) {
							forestRuins(player, loc);
						} else if(loc.getX() <= -1436 && loc.getY() <= 200 && loc.getZ() <= 2410 && loc.getX() >= -1753
								&& loc.getY() >= 40 && loc.getZ() >= 1983) {
							senMag1(player, loc);
						} else if(loc.getX() <= -804 && loc.getY() <= 90 && loc.getZ() <= 2464 && loc.getX() >= -1436
								&& loc.getY() >= 50 && loc.getZ() >= 1812) {
							senMag2(player, loc);
						} else if(loc.getX() <= -1027 && loc.getY() <= 52 && loc.getZ() <= 2365 && loc.getX() >= -1096
								&& loc.getY() >= 3 && loc.getZ() >= 2246) {
							partholon(player, loc);
						} else if(loc.getX() <= -568 && loc.getY() <= 60 && loc.getZ() <= 1993 && loc.getX() >= -642
								&& loc.getY() >= 40 && loc.getZ() >= 1881) {
							tiruCoast(player, loc);
						} else if(loc.getX() <= 3603 && loc.getY() <= 31 && loc.getZ() <= 3976 && loc.getX() >= 3481
								&& loc.getY() >= 5 && loc.getZ() >= 3837) {
							mineDun1(player, loc);
						} else if(loc.getX() <= -712 && loc.getY() <= 88 && loc.getZ() <= 1800 && loc.getX() >= -1051
								&& loc.getY() >= 40 && loc.getZ() >= 1562) {
							tiruField(player, loc);
						} else if(loc.getX() <= -539 && loc.getY() <= 88 && loc.getZ() <= 1819 
								&& loc.getX() >= -726 && loc.getY() >= 40 && loc.getZ() >= 1612) {
							tiruField2(player, loc);
						} else if(loc.getX() <= -930 && loc.getY() <= 39 && loc.getZ() <= 1966 && loc.getX() >= -1049
								&& loc.getY() >= 3 && loc.getZ() >= 1804) {
							seedFrontCave(player, loc);
						} else if(loc.getX() <= -499 && loc.getY() <= 89 && loc.getZ() <= 1542 && loc.getX() >= -719
								&& loc.getY() >= 35 && loc.getZ() >= 1387) {
							toMiyu(player, loc);
						} else if(loc.getX() <= -538 && loc.getY() <= 34 && loc.getZ() <= 1541 && loc.getX() >= -610
								&& loc.getY() >= 10 && loc.getZ() >= 1487) {
							toMiyuCoastCave(player, loc);
						} else if(loc.getX() <= -970 && loc.getY() <= 55 && loc.getZ() <= 1653 && loc.getX() >= -1020
								&& loc.getY() >= 32 && loc.getZ() >= 1575) {
							toMiyuCave(player, loc);
						} else if(loc.getX() <= -919 && loc.getY() <= 109 && loc.getZ() <= 1465 && loc.getX() >= -997
								&& loc.getY() >= 59 && loc.getZ() >= 1291) {
							miyu1(player, loc);
						} else if(loc.getX() <= -962 && loc.getY() <= 109 && loc.getZ() <= 1289 && loc.getX() >= -1030
								&& loc.getY() >= 59 && loc.getZ() >= 1203) {
							miyu2(player, loc);
						} else if(loc.getX() <= -1005 && loc.getY() <= 109 && loc.getZ() <= 1204 && loc.getX() >= -1116
								&& loc.getY() >= 59 && loc.getZ() >= 1095) {
							miyu3(player, loc);
						} else if(loc.getX() <= -1118 && loc.getY() <= 109 && loc.getZ() <= 1312 && loc.getX() >= -1182
								&& loc.getY() >= 59 && loc.getZ() >= 1140) {
							miyu4(player, loc);
						} else if(loc.getX() <= -1187 && loc.getY() <= 109 && loc.getZ() <= 1460 && loc.getX() >= -1233
								&& loc.getY() >= 59 && loc.getZ() >= 1273) {
							miyu5(player, loc);
						} else if(loc.getX() <= -1234 && loc.getY() <= 109 && loc.getZ() <= 1460 && loc.getX() >= -1290
								&& loc.getY() >= 59 && loc.getZ() >= 1311) {
							miyu6(player, loc);
						} else if(loc.getX() <= -646 && loc.getY() <= 95 && loc.getZ() <= 1380 && loc.getX() >= -750
								&& loc.getY() >= 55 && loc.getZ() >= 1277) {
							miyuGY(player, loc);
						} else if(loc.getX() <= -1314 && loc.getY() <= 48 && loc.getZ() <= 2082 
								&& loc.getX() >= -1579 && loc.getY() >= 0 && loc.getZ() >= 1745) {
							valley(player, loc);
						} else if(loc.getX() <= -685 && loc.getY() <= 160 && loc.getZ() <= 1274 
								&& loc.getX() >= -946 && loc.getY() >= 56 && loc.getZ() >= 924) {
							miyuEast(player, loc);
						} else if(loc.getX() <= -960 && loc.getY() <= 75 && loc.getZ() <= 990 
								&& loc.getX() >= -1277 && loc.getY() >= 45 && loc.getZ() >= 871) {
							miyuNorth(player, loc);
						} else if(loc.getX() <= -1323 && loc.getY() <= 100 && loc.getZ() <= 1513 
								&& loc.getX() >= -1639 && loc.getY() >= 35 && loc.getZ() >= 1105) {
							miyuWest1(player, loc);
						} else if(loc.getX() <= -1200 && loc.getY() <= 100 && loc.getZ() <= 1235 
								&& loc.getX() >= -1420 && loc.getY() >= 40 && loc.getZ() >= 1142) {
							miyuWest2(player, loc);
						} else if(loc.getX() <= -360 && loc.getY() <= 100 && loc.getZ() <= 1225 
								&& loc.getX() >= -684 && loc.getY() >= 45 && loc.getZ() >= 1007) {
							kaimanNorth1(player, loc);
						} else if(loc.getX() <= -429 && loc.getY() <= 80 && loc.getZ() <= 1571 
								&& loc.getX() >= -560 && loc.getY() >= 40 && loc.getZ() >= 1376) {
							toKaiman(player, loc);
						} else if(loc.getX() <= 48 && loc.getY() <= 98 && loc.getZ() <= 1238 
								&& loc.getX() >= -356 && loc.getY() >= 40 && loc.getZ() >= 1136) {
							kaimanNorth2(player, loc);
						} else if(loc.getX() <= 67 && loc.getY() <= 98 && loc.getZ() <= 1132 
								&& loc.getX() >= -72 && loc.getY() >= 40 && loc.getZ() >= 1010) {
							kaimanNorth3(player, loc);
						} else if(loc.getX() <= -382 && loc.getY() <= 106 && loc.getZ() <= 1001 
								&& loc.getX() >= -497 && loc.getY() >= 40 && loc.getZ() >= 888) {
							kaimanNorth4(player, loc);
						} else if(loc.getX() <= -532 && loc.getY() <= 90 && loc.getZ() <= 990 
								&& loc.getX() >= -658 && loc.getY() >= 60 && loc.getZ() >= 852) {
							devilPortal(player, loc);
						} else if(loc.getX() <= -49 && loc.getY() <= 150 && loc.getZ() <= 1130 
								&& loc.getX() >= -336 && loc.getY() >= 10 && loc.getZ() >= 791) {
							middleValley(player, loc);
						} else if(loc.getX() <= 3788 && loc.getY() <= 60 && loc.getZ() <= 3482 
								&& loc.getX() >= 3707 && loc.getY() >= 30 && loc.getZ() >= 3296) {
							fairyDungeon(player, loc);
						} else if(loc.getX() <= -1789 && loc.getY() <= 200 && loc.getZ() <= 931 
								&& loc.getX() >= -2964 && loc.getY() >= 30 && loc.getZ() >= 443) {
							aranmore(player, loc);
						} else if(loc.getX() <= 3753 && loc.getY() <= 62 && loc.getZ() <= 3232 
								&& loc.getX() >= 3639 && loc.getY() >= 12 && loc.getZ() >= 3182) {
							aranmoreDun1(player, loc);
						} else if(loc.getX() <= 3749 && loc.getY() <= 91 && loc.getZ() <= 3225 
								&& loc.getX() >= 3644 && loc.getY() >= 70 && loc.getZ() >= 3184) {
							aranmoreDun2(player, loc);
						} else if(loc.getX() <= -616 && loc.getY() <= 94 && loc.getZ() <= 871 
								&& loc.getX() >= -897 && loc.getY() >= 43 && loc.getZ() >= 699) {
							swampSlime1(player, loc);
						} else if(loc.getX() <= -810 && loc.getY() <= 94 && loc.getZ() <= 693 
								&& loc.getX() >= -970 && loc.getY() >= 43 && loc.getZ() >= 602) {
							swampSlime2(player, loc);
						} else if(loc.getX() <= -313 && loc.getY() <= 103 && loc.getZ() <= 691 
								&& loc.getX() >= -795 && loc.getY() >= 45 && loc.getZ() >= 311) {
							swampSpider(player, loc);
						} else if(loc.getX() <= -888 && loc.getY() <= 109 && loc.getZ() <= 572 
								&& loc.getX() >= -1238 && loc.getY() >= 43 && loc.getZ() >= 167) {
							swampWater(player, loc);
						} else if(loc.getX() <= -868 && loc.getY() <= 115 && loc.getZ() <= 166 
								&& loc.getX() >= -1156 && loc.getY() >= 47 && loc.getZ() >= 27) {
							swampNorthEast1(player, loc);
						} else if(loc.getX() <= -869 && loc.getY() <= 109 && loc.getZ() <= -41 
								&& loc.getX() >= -974 && loc.getY() >= 47 && loc.getZ() >= -222) {
							swampNorthEast2(player, loc);
						} else if(loc.getX() <= 3424 && loc.getY() <= 40 && loc.getZ() <= 3826 
								&& loc.getX() >= 3390 && loc.getY() >= 11 && loc.getZ() >= 3783) {
							senMansion1(player, loc);
						} else if(loc.getX() <= 3386 && loc.getY() <= 16 && loc.getZ() <= 3759 
							&& loc.getX() >= 3348 && loc.getY() >= 11 && loc.getZ() >= 3721) {
							senMansion2(player, loc);
						} else if(loc.getX() <= 3388 && loc.getY() <= 37 && loc.getZ() <= 3827 
								&& loc.getX() >= 3354 && loc.getY() >= 13 && loc.getZ() >= 3803) {
							senMansion3(player, loc);
						} else if(loc.getX() <= 3383 && loc.getY() <= 32 && loc.getZ() <= 3803 
								&& loc.getX() >= 3355 && loc.getY() >= 11 && loc.getZ() >= 3766) {
							senMansion4(player, loc);
						} else if(loc.getX() <= -125 && loc.getY() <= 113 && loc.getZ() <= 498 
								&& loc.getX() >= -311 && loc.getY() >= 41 && loc.getZ() >= 150) {
							puru1(player, loc);
						} else if(loc.getX() <= -124 && loc.getY() <= 115 && loc.getZ() <= 149 
								&& loc.getX() >= -408 && loc.getY() >= 41 && loc.getZ() >= -263) {
							puru2(player, loc);
						} else if(loc.getX() <= 62 && loc.getY() <= 115 && loc.getZ() <= 367 
								&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= 37) {
							puru3(player, loc);
						} else if(loc.getX() <= 29 && loc.getY() <= 115 && loc.getZ() <= 27 
								&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= -208) {
							puru4(player, loc);
						} else if(loc.getX() <= 211 && loc.getY() <= 115 && loc.getZ() <= 461
								&& loc.getX() >= 61 && loc.getY() >= 41 && loc.getZ() >= 366) {
							puru5(player, loc);
						} else if(loc.getX() <= 693 && loc.getY() <= 115 && loc.getZ() <= 364 
								&& loc.getX() >= 65 && loc.getY() >= 41 && loc.getZ() >= 19) {
							puru6(player, loc);
						} else if(loc.getX() <= 319 && loc.getY() <= 115 && loc.getZ() <= -51 
								&& loc.getX() >= 40 && loc.getY() >= 41 && loc.getZ() >= -421) {
							puru7(player, loc);
						} else if(loc.getX() <= 33 && loc.getY() <= 41 && loc.getZ() <= -487 && 
								loc.getX() >= -40 && loc.getY() >= 4 && loc.getZ() >= -568) {
							beiagSeaCave(player, loc);
						} else if(loc.getX() <= -931 && loc.getY() <= 42 && loc.getZ() <= 526 && 
								loc.getX() >= -1020 && loc.getY() >= 1 && loc.getZ() >= 401) {
							swampCave(player, loc);
						} else if(loc.getX() <= -36 && loc.getY() <= 65 && loc.getZ() <= -227 && 
								loc.getX() >= -175 && loc.getY() >= 49 && loc.getZ() >= -323) {
							beiagBreakVil(player, loc);
						} else if(loc.getX() <= -78 && loc.getY() <= 62 && loc.getZ() <= 776 
								&& loc.getX() >= -179 && loc.getY() >= 4 && loc.getZ() >= 580) {
							necroValley(player, loc);
						} else if(loc.getX() <= 146 && loc.getY() <= 77 && loc.getZ() <= 555 
								&& loc.getX() >= -59 && loc.getY() >= 58 && loc.getZ() >= 466) {
							puruCave(player, loc);
						} else if(loc.getX() <= 313 && loc.getY() <= 41 && loc.getZ() <= -154 
								&& loc.getX() >= 250 && loc.getY() >= 25 && loc.getZ() >= -184) {
							dungeon(player, loc);
						} else if(loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 697 
								&& loc.getX() >= 147 && loc.getY() >= 3 && loc.getZ() >= 489) {
							magicTower1(player, loc);
						} else if(loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 935 
								&& loc.getX() >= 47 && loc.getY() >= 3 && loc.getZ() >= 700) {
							magicTower2(player, loc);
						} else if(loc.getX() <= 146 && loc.getY() <= 164 && loc.getZ() <= 697 
								&& loc.getX() >= 8 && loc.getY() >= 78 && loc.getZ() >= 502) {
							magicTower3(player, loc);
						} else if(loc.getX() <= 96 && loc.getY() <= 62 && loc.getZ() <= 695 
								&& loc.getX() >= 50 && loc.getY() >= 53 && loc.getZ() >= 615) {
							darkMaze(player, loc);
						} else if(loc.getX() <= 625 && loc.getY() <= 200 && loc.getZ() <= 887 && 
								loc.getX() >= 493 && loc.getY() >= 40 && loc.getZ() >= 389) {
							castleWest(player, loc);
						} else if(loc.getX() <= 810 && loc.getY() <= 150 && loc.getZ() <= 891 && 
								loc.getX() >= 627 && loc.getY() >= 45 && loc.getZ() >= 661) {
							castleSouth(player, loc);
						} else if(loc.getX() <= 967 && loc.getY() <= 150 && loc.getZ() <= 656 && 
								loc.getX() >= 758 && loc.getY() >= 45 && loc.getZ() >= 620) {
							castleSouthEast(player, loc);
						} else if(loc.getX() <= 1105 && loc.getY() <= 104 && loc.getZ() <= 895 && 
								loc.getX() >= 908 && loc.getY() >= 40 && loc.getZ() >= 747) {
							castleNearVil(player, loc);
						} else if(loc.getX() <= 901 && loc.getY() <= 80 && loc.getZ() <= 911 && 
								loc.getX() >= 819 && loc.getY() >= 50 && loc.getZ() >= 774) {
							castleNearVilNearGround(player, loc);
						} else if(loc.getX() <= 847 && loc.getY() <= 57 && loc.getZ() <= 739 && 
								loc.getX() >= 777 && loc.getY() >= 29 && loc.getZ() >= 683) {
							castleNearVilNearCave(player, loc);
						} else if(loc.getX() <= 782 && loc.getY() <= 56 && loc.getZ() <= 633 
								&& loc.getX() >= 699 && loc.getY() >= 34 && loc.getZ() >= 551) {
							aracunePhan(player, loc);
						} else if(loc.getX() <= 759 && loc.getY() <= 30 && loc.getZ() <= 588 
								&& loc.getX() >= 741 && loc.getY() >= 5 && loc.getZ() >= 570) {
							aracuneSpi(player, loc);
						} else if(loc.getX() <= 744 && loc.getY() <= 120 && loc.getZ() <= 659 && 
								loc.getX() >= 710 && loc.getY() >= 60 && loc.getZ() >= 617) {
							sumukwon(player, loc);
						} else if(loc.getX() <= 718 && loc.getY() <= 75 && loc.getZ() <= 617 && 
								loc.getX() >= 675 && loc.getY() >= 65 && loc.getZ() >= 566) {
							castle1F(player, loc);
						} else if(loc.getX() <= 712 && loc.getY() <= 91 && loc.getZ() <= 609 && 
								loc.getX() >= 668 && loc.getY() >= 82 && loc.getZ() >= 566) {
							castle2F(player, loc);
						} else if(loc.getX() <= 713 && loc.getY() <= 116 && loc.getZ() <= 605 && 
								loc.getX() >= 672 && loc.getY() >= 100 && loc.getZ() >= 572) {
							castle3F(player, loc);
						} else if(loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 165 && 
								loc.getX() >= 695 && loc.getY() >= 40 && loc.getZ() >= 6) {
							wheatEast(player, loc);
						} else if(loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 415 && 
								loc.getX() >= 695 && loc.getY() >= 50 && loc.getZ() >= 167) {
							kleahWest(player, loc);
						} else if(loc.getX() <= 1082 && loc.getY() <= 165 && loc.getZ() <= 312 && 
								loc.getX() >= 901 && loc.getY() >= 60 && loc.getZ() >= 248) {
							kleah1(player, loc);
						} else if(loc.getX() <= 1072 && loc.getY() <= 165 && loc.getZ() <= 247 && 
								loc.getX() >= 904 && loc.getY() >= 60 && loc.getZ() >= 110) {
							kleah2(player, loc);
						}
					} 
					
					if(time >= 360) {
						time = 0;
					}
					
					time++;
				}
				
			}

		}, 0, 1);
	}

	public void tutozone(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 3712 && loc.getY() <= 47 && loc.getZ() <= 3708 && loc.getX() >= 3686 && loc.getY() >= 39
				&& loc.getZ() >= 3672)) {
			return;
		}
		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = new ItemStack(Material.SKELETON_SKULL);
		head.setHelmet(headItem);
	}

	public void greenSlime(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1833 && loc.getY() <= 60 && loc.getZ() <= 3107 && loc.getX() >= -1882 && loc.getY() >= 50
				&& loc.getZ() >= 3068)) {
			return;
		}
		Slime mob = (Slime) loc.getWorld().spawnEntity(loc, EntityType.SLIME);
	}

	public void coastZombie(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1887 && loc.getY() <= 56 && loc.getZ() <= 3068 && loc.getX() >= -1946 && loc.getY() >= 45
				&& loc.getZ() >= 2986)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(0);
		head.setHelmet(headItem);
	}

	public void wargunilSkel(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1786 && loc.getY() <= 57 && loc.getZ() <= 3094 && loc.getX() >= -1820 && loc.getY() >= 50
				&& loc.getZ() >= 3061)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(1);
		head.setHelmet(headItem);
	}

	public void wargunilSea(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -1960 && loc.getY() <= 60 && loc.getZ() <= 2954 && loc.getX() >= -1980 && loc.getY() >= 52
				&& loc.getZ() >= 2947)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		} else if (num >= 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		}
	}

	public void forestGhost(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1870 && loc.getY() <= 80 && loc.getZ() <= 2694 && loc.getX() >= -1925 && loc.getY() >= 45
				&& loc.getZ() >= 2635)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(4);
		head.setHelmet(headItem);
	}

	public void crystalWarrior(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1882 && loc.getY() <= 77 && loc.getZ() <= 2617 && loc.getX() >= -1938 && loc.getY() >= 45
				&& loc.getZ() >= 2596)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(5);
		head.setHelmet(headItem);
	}

	public void woodFairy(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1788 && loc.getY() <= 65 && loc.getZ() <= 2570 && loc.getX() >= -1822 && loc.getY() >= 50
				&& loc.getZ() >= 2535)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(6);
		head.setHelmet(headItem);
	}

	public void turtleWarrior(Player player, Location loc) {
		loc = location(loc);
		while (loc.add(0, -2, 0).getBlock().getType() == Material.WATER) {
			loc = location(loc);
		}
		loc.add(0, 3, 0);
		if (!(loc.getX() <= 3713 && loc.getY() <= 23 && loc.getZ() <= 3765 && loc.getX() >= 3703 && loc.getY() >= 15
				&& loc.getZ() >= 3756)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(7);
		head.setHelmet(headItem);
	}

	public void vindicator(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1830 && loc.getY() <= 100 && loc.getZ() <= 2472 && loc.getX() >= -1964 && loc.getY() >= 40
				&& loc.getZ() >= 2324)) {
			return;
		}
		if (num == 0) {
			Vindicator mob = (Vindicator) loc.getWorld().spawnEntity(loc, EntityType.VINDICATOR);
		} else if (num == 1) {
			Evoker mob = (Evoker) loc.getWorld().spawnEntity(loc, EntityType.EVOKER);
		}
	}

	public void forganWestForest(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1936 && loc.getY() <= 100 && loc.getZ() <= 2686 && loc.getX() >= -2143 && loc.getY() >= 30
				&& loc.getZ() >= 2444)) {
			return;
		}
		if (num == 0) {
			Witch mob = (Witch) loc.getWorld().spawnEntity(loc, EntityType.WITCH);
		} else if (num == 1) {
			Ravager mob = (Ravager) loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		}
	}

	public void mountainThief(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1913 && loc.getY() <= 100 && loc.getZ() <= 2354 && loc.getX() >= -2121 && loc.getY() >= 30
				&& loc.getZ() >= 2271)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(8);
		head.setHelmet(headItem);
	}

	public void forestRuins(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3532 && loc.getY() <= 30 && loc.getZ() <= 3773 && loc.getX() >= 3447 && loc.getY() >= 10
				&& loc.getZ() >= 3690)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(10);
			head.setHelmet(headItem);
		}
	}

	public void senMag1(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -1436 && loc.getY() <= 200 && loc.getZ() <= 2410 && loc.getX() >= -1753 && loc.getY() >= 40
				&& loc.getZ() >= 1983)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(0);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(1);
			head.setHelmet(headItem);
		} else if (num == 2) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				Stray mob = (Stray) loc.getWorld().spawnEntity(loc, EntityType.STRAY);
			}
		} else if (num == 3) {
			Ravager mob = (Ravager) loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		}

	}

	public void senMag2(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -804 && loc.getY() <= 90 && loc.getZ() <= 2464 && loc.getX() >= -1436 && loc.getY() >= 50
				&& loc.getZ() >= 1812)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Enderman mob = (Enderman) loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		}
	}

	public void partholon(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1027 && loc.getY() <= 52 && loc.getZ() <= 2365 && loc.getX() >= -1096 && loc.getY() >= 3
				&& loc.getZ() >= 2246)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Spider mob = (Spider) loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		}
	}

	public void tiruCoast(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -568 && loc.getY() <= 60 && loc.getZ() <= 1993 && loc.getX() >= -642 && loc.getY() >= 40
				&& loc.getZ() >= 1881)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(6);
		head.setHelmet(headItem);
	}

	public void mineDun1(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 3603 && loc.getY() <= 31 && loc.getZ() <= 3976 && loc.getX() >= 3481 && loc.getY() >= 5
				&& loc.getZ() >= 3837)) {
			return;
		}
		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 2) {
			Spider mob = (Spider) loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		}
	}

	public void tiruField(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -712 && loc.getY() <= 88 && loc.getZ() <= 1800 && loc.getX() >= -1051 && loc.getY() >= 40
				&& loc.getZ() >= 1562)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(7);
		head.setHelmet(headItem);
	}

	public void tiruField2(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -539 && loc.getY() <= 88 && loc.getZ() <= 1819 
				&& loc.getX() >= -726 && loc.getY() >= 40 && loc.getZ() >= 1612)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(7);
		head.setHelmet(headItem);
	}
	
	public void seedFrontCave(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -930 && loc.getY() <= 39 && loc.getZ() <= 1966 && loc.getX() >= -1049 && loc.getY() >= 3
				&& loc.getZ() >= 1804)) {
			return;
		}
		if (num == 0) {
			CaveSpider mob = (CaveSpider) loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		} else if (num == 1) {
			Silverfish mob = (Silverfish) loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		}
	}

	public void toMiyu(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -499 && loc.getY() <= 89 && loc.getZ() <= 1542 && loc.getX() >= -719 && loc.getY() >= 35
				&& loc.getZ() >= 1387)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
		}
	}

	public void toMiyuCoastCave(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -538 && loc.getY() <= 34 && loc.getZ() <= 1541 && loc.getX() >= -610 && loc.getY() >= 10
				&& loc.getZ() >= 1487)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(10);
		head.setHelmet(headItem);
	}

	public void toMiyuCave(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -970 && loc.getY() <= 55 && loc.getZ() <= 1653 && loc.getX() >= -1020 && loc.getY() >= 32
				&& loc.getZ() >= 1575)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(11);
		head.setHelmet(headItem);
	}

	public void miyu1(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -919 && loc.getY() <= 109 && loc.getZ() <= 1465 && loc.getX() >= -997 && loc.getY() >= 59
				&& loc.getZ() >= 1291)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(0);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(1);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		}
	}

	public void miyu2(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -962 && loc.getY() <= 109 && loc.getZ() <= 1289 && loc.getX() >= -1030 && loc.getY() >= 59
				&& loc.getZ() >= 1203)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		}
	}

	public void miyu3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1005 && loc.getY() <= 109 && loc.getZ() <= 1204 && loc.getX() >= -1116 && loc.getY() >= 59
				&& loc.getZ() >= 1095)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		}
	}

	public void miyu4(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -1118 && loc.getY() <= 109 && loc.getZ() <= 1312 && loc.getX() >= -1182 && loc.getY() >= 59
				&& loc.getZ() >= 1140)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(0);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(1);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		}
	}

	public void miyu5(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -1187 && loc.getY() <= 109 && loc.getZ() <= 1460 && loc.getX() >= -1233 && loc.getY() >= 59
				&& loc.getZ() >= 1273)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		}
	}

	public void miyu6(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1234 && loc.getY() <= 109 && loc.getZ() <= 1460 && loc.getX() >= -1290 && loc.getY() >= 59
				&& loc.getZ() >= 1311)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		}
	}

	public void miyuGY(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -646 && loc.getY() <= 95 && loc.getZ() <= 1380 && loc.getX() >= -750 && loc.getY() >= 55
				&& loc.getZ() >= 1277)) {
			return;
		}
		if (num == 0) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			}
		} else if (num == 1) {
			Ravager mob = (Ravager) loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		}
	}

	public void valley(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1314 && loc.getY() <= 48 && loc.getZ() <= 2082 
				&& loc.getX() >= -1579 && loc.getY() >= 0 && loc.getZ() >= 1745)) {
			return;
		}
		if (num == 0) {
			Vex mob = (Vex) loc.getWorld().spawnEntity(loc, EntityType.VEX);
		} else if (num == 1) {
			Slime mob = (Slime) loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		}
	}

	public void miyuEast(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -685 && loc.getY() <= 160 && loc.getZ() <= 1274 
				&& loc.getX() >= -946 && loc.getY() >= 56 && loc.getZ() >= 924)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(0);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(1);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Blaze mob = (Blaze) loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		}
	}
	
	public void miyuNorth(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -960 && loc.getY() <= 75 && loc.getZ() <= 990 
				&& loc.getX() >= -1277 && loc.getY() >= 45 && loc.getZ() >= 871)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Enderman mob = (Enderman) loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		}
	}
	
	public void miyuWest1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1323 && loc.getY() <= 100 && loc.getZ() <= 1513 
				&& loc.getX() >= -1639 && loc.getY() >= 35 && loc.getZ() >= 1105)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		
		if (num == 0) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				Stray mob = (Stray) loc.getWorld().spawnEntity(loc, EntityType.STRAY);
			}
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		}
	}
	
	public void miyuWest2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1200 && loc.getY() <= 100 && loc.getZ() <= 1235 
				&& loc.getX() >= -1420 && loc.getY() >= 40 && loc.getZ() >= 1142)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		
		if (num == 0) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				Stray mob = (Stray) loc.getWorld().spawnEntity(loc, EntityType.STRAY);
			}
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		}
	}
	
	public void toKaiman(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -429 && loc.getY() <= 80 && loc.getZ() <= 1571 
				&& loc.getX() >= -560 && loc.getY() >= 40 && loc.getZ() >= 1376)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
		}
	}
	
	public void kaimanNorth1(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -360 && loc.getY() <= 100 && loc.getZ() <= 1225 
				&& loc.getX() >= -684 && loc.getY() >= 45 && loc.getZ() >= 1007)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		}
	}
	
	public void kaimanNorth2(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= 48 && loc.getY() <= 98 && loc.getZ() <= 1238 
				&& loc.getX() >= -356 && loc.getY() >= 40 && loc.getZ() >= 1136)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		}
	}
	
	public void kaimanNorth3(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= 67 && loc.getY() <= 98 && loc.getZ() <= 1132 
				&& loc.getX() >= -72 && loc.getY() >= 40 && loc.getZ() >= 1010)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		}
	}
	
	public void kaimanNorth4(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -382 && loc.getY() <= 106 && loc.getZ() <= 1001 
				&& loc.getX() >= -497 && loc.getY() >= 40 && loc.getZ() >= 888)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		}
	}
	
	public void devilPortal(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -532 && loc.getY() <= 90 && loc.getZ() <= 990 
				&& loc.getX() >= -658 && loc.getY() >= 60 && loc.getZ() >= 852)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(10);
			head.setHelmet(headItem);
		} else if (num == 2) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(11);
			head.setHelmet(headItem);
		}
	}
	
	public void middleValley(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -49 && loc.getY() <= 150 && loc.getZ() <= 1130 
				&& loc.getX() >= -336 && loc.getY() >= 10 && loc.getZ() >= 791)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(12);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(13);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(14);
			head.setHelmet(headItem);
		} else if (num == 3) {
			Enderman mob = (Enderman) loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		}
	}
	
	public void fairyDungeon(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3788 && loc.getY() <= 60 && loc.getZ() <= 3482 
				&& loc.getX() >= 3707 && loc.getY() >= 30 && loc.getZ() >= 3296)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Vex mob = (Vex) loc.getWorld().spawnEntity(loc, EntityType.VEX);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(15);
			head.setHelmet(headItem);
		}
	}
	
	public void aranmore(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -1789 && loc.getY() <= 200 && loc.getZ() <= 931 
				&& loc.getX() >= -2964 && loc.getY() >= 30 && loc.getZ() >= 443)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.POLAR_BEAR);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(18);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(19);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(20);
			head.setHelmet(headItem);
		}
	}
	
	public void aranmoreDun1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3753 && loc.getY() <= 62 && loc.getZ() <= 3232 
				&& loc.getX() >= 3639 && loc.getY() >= 12 && loc.getZ() >= 3182)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void aranmoreDun2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3749 && loc.getY() <= 91 && loc.getZ() <= 3225 
				&& loc.getX() >= 3644 && loc.getY() >= 70 && loc.getZ() >= 3184)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void swampSlime1(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -616 && loc.getY() <= 94 && loc.getZ() <= 871 
				&& loc.getX() >= -897 && loc.getY() >= 43 && loc.getZ() >= 699)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		}
	}
	
	public void swampSlime2(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -810 && loc.getY() <= 94 && loc.getZ() <= 693 
				&& loc.getX() >= -970 && loc.getY() >= 43 && loc.getZ() >= 602)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		}
	}
	
	public void swampSpider(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -313 && loc.getY() <= 103 && loc.getZ() <= 691 
				&& loc.getX() >= -795 && loc.getY() >= 45 && loc.getZ() >= 311)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		}
	}
	
	public void swampWater(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -888 && loc.getY() <= 109 && loc.getZ() <= 572 
				&& loc.getX() >= -1238 && loc.getY() >= 43 && loc.getZ() >= 167)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void swampNorthEast1(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -868 && loc.getY() <= 115 && loc.getZ() <= 166 
				&& loc.getX() >= -1156 && loc.getY() >= 47 && loc.getZ() >= 27)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void swampNorthEast2(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -869 && loc.getY() <= 109 && loc.getZ() <= -41 
				&& loc.getX() >= -974 && loc.getY() >= 47 && loc.getZ() >= -222)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void senMansion1(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 3424 && loc.getY() <= 40 && loc.getZ() <= 3826 
				&& loc.getX() >= 3390 && loc.getY() >= 11 && loc.getZ() >= 3783)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void senMansion2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3386 && loc.getY() <= 16 && loc.getZ() <= 3759 
				&& loc.getX() >= 3348 && loc.getY() >= 11 && loc.getZ() >= 3721)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void senMansion3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3388 && loc.getY() <= 37 && loc.getZ() <= 3827 
				&& loc.getX() >= 3354 && loc.getY() >= 13 && loc.getZ() >= 3803)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void senMansion4(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 3383 && loc.getY() <= 32 && loc.getZ() <= 3803 
				&& loc.getX() >= 3355 && loc.getY() >= 11 && loc.getZ() >= 3766)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} 
	}
	
	public void puru1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -125 && loc.getY() <= 113 && loc.getZ() <= 498 
				&& loc.getX() >= -311 && loc.getY() >= 41 && loc.getZ() >= 150)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void puru2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -124 && loc.getY() <= 115 && loc.getZ() <= 149 
				&& loc.getX() >= -408 && loc.getY() >= 41 && loc.getZ() >= -263)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			}
		}
	}
	
	public void puru3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 62 && loc.getY() <= 115 && loc.getZ() <= 367 
				&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= 37)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		}
	}
	
	public void puru4(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 29 && loc.getY() <= 115 && loc.getZ() <= 27 
				&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= -208)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			}
		}
	}
	
	public void puru5(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 211 && loc.getY() <= 115 && loc.getZ() <= 461
				&& loc.getX() >= 61 && loc.getY() >= 41 && loc.getZ() >= 366)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void puru6(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 693 && loc.getY() <= 115 && loc.getZ() <= 364 
				&& loc.getX() >= 65 && loc.getY() >= 41 && loc.getZ() >= 19)) {
			return;
		}
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void puru7(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 319 && loc.getY() <= 115 && loc.getZ() <= -51 
				&& loc.getX() >= 40 && loc.getY() >= 41 && loc.getZ() >= -421)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void beiagSeaCave(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 33 && loc.getY() <= 41 && loc.getZ() <= -487 && 
				loc.getX() >= -40 && loc.getY() >= 4 && loc.getZ() >= -568)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void swampCave(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -931 && loc.getY() <= 42 && loc.getZ() <= 526 && 
				loc.getX() >= -1020 && loc.getY() >= 1 && loc.getZ() >= 401)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		} 
	}
	
	public void beiagBreakVil(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -36 && loc.getY() <= 65 && loc.getZ() <= -227 && 
				loc.getX() >= -175 && loc.getY() >= 49 && loc.getZ() >= -323)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} 
	}
	
	public void necroValley(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -78 && loc.getY() <= 62 && loc.getZ() <= 776 
				&& loc.getX() >= -179 && loc.getY() >= 4 && loc.getZ() >= 580)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} 
	}
	
	public void puruCave(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 146 && loc.getY() <= 77 && loc.getZ() <= 555 
				&& loc.getX() >= -59 && loc.getY() >= 58 && loc.getZ() >= 466)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMITE);
		}
	}
	
	public void dungeon(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 313 && loc.getY() <= 41 && loc.getZ() <= -154 
				&& loc.getX() >= 250 && loc.getY() >= 25 && loc.getZ() >= -184)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void magicTower1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 697 
				&& loc.getX() >= 147 && loc.getY() >= 3 && loc.getZ() >= 489)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
	}
	
	public void magicTower2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 935 
				&& loc.getX() >= 47 && loc.getY() >= 3 && loc.getZ() >= 700)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		}
	}
	
	public void magicTower3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 146 && loc.getY() <= 164 && loc.getZ() <= 697 
				&& loc.getX() >= 8 && loc.getY() >= 78 && loc.getZ() >= 502)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
	}
	
	public void darkMaze(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 96 && loc.getY() <= 62 && loc.getZ() <= 695 
				&& loc.getX() >= 50 && loc.getY() >= 53 && loc.getZ() >= 615)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMITE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
	}
	
	public void castleWest(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 625 && loc.getY() <= 200 && loc.getZ() <= 887 && 
				loc.getX() >= 493 && loc.getY() >= 40 && loc.getZ() >= 389)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void castleSouth(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 810 && loc.getY() <= 150 && loc.getZ() <= 891 && 
				loc.getX() >= 627 && loc.getY() >= 45 && loc.getZ() >= 661)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			CustomSkeleton2 cs = new CustomSkeleton2(loc);
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
		}
	}
	
	public void castleSouthEast(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 967 && loc.getY() <= 150 && loc.getZ() <= 656 && 
				loc.getX() >= 758 && loc.getY() >= 55 && loc.getZ() >= 620)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void castleNearVil(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1105 && loc.getY() <= 104 && loc.getZ() <= 895 && 
				loc.getX() >= 908 && loc.getY() >= 40 && loc.getZ() >= 747)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.CREEPER);
		}
	}
	
	public void castleNearVilNearGround(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 901 && loc.getY() <= 80 && loc.getZ() <= 911 && 
				loc.getX() >= 819 && loc.getY() >= 50 && loc.getZ() >= 774)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITCH);
		}
	}
	
	public void castleNearVilNearCave(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 847 && loc.getY() <= 57 && loc.getZ() <= 739 && 
				loc.getX() >= 777 && loc.getY() >= 29 && loc.getZ() >= 683)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.MAGMA_CUBE);
		}
	}
	
	public void aracunePhan(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 782 && loc.getY() <= 56 && loc.getZ() <= 633 
				&& loc.getX() >= 699 && loc.getY() >= 34 && loc.getZ() >= 551)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.PHANTOM);
		}
	}
	
	public void aracuneSpi(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 759 && loc.getY() <= 30 && loc.getZ() <= 588 
				&& loc.getX() >= 741 && loc.getY() >= 5 && loc.getZ() >= 570)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		}
	}
	
	public void sumukwon(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 744 && loc.getY() <= 120 && loc.getZ() <= 659 && 
				loc.getX() >= 710 && loc.getY() >= 60 && loc.getZ() >= 617)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			CustomSkeleton2 cs = new CustomSkeleton2(loc);
			WorldServer world = ((CraftWorld) player.getWorld()).getHandle();
			world.addEntity(cs);
		}
	}
	
	public void castle1F(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 718 && loc.getY() <= 75 && loc.getZ() <= 617 && 
				loc.getX() >= 675 && loc.getY() >= 65 && loc.getZ() >= 566)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void castle2F(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 712 && loc.getY() <= 91 && loc.getZ() <= 609 && 
				loc.getX() >= 668 && loc.getY() >= 82 && loc.getZ() >= 566)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void castle3F(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 713 && loc.getY() <= 116 && loc.getZ() <= 605 && 
				loc.getX() >= 672 && loc.getY() >= 100 && loc.getZ() >= 572)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void wheatEast(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 165 && 
				loc.getX() >= 695 && loc.getY() >= 40 && loc.getZ() >= 6)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void kleahWest(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 415 && 
				loc.getX() >= 695 && loc.getY() >= 50 && loc.getZ() >= 167)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMITE);
		}
	}
	
	public void kleah1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1082 && loc.getY() <= 165 && loc.getZ() <= 312 && 
				loc.getX() >= 901 && loc.getY() >= 60 && loc.getZ() >= 248)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				Silverfish s = (Silverfish) loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
				s.setPassenger(loc.getWorld().spawnEntity(loc, EntityType.PHANTOM));
			}
		}
	}
	
	public void kleah2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1072 && loc.getY() <= 165 && loc.getZ() <= 247 && 
				loc.getX() >= 904 && loc.getY() >= 60 && loc.getZ() >= 110)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.VINDICATOR);
		}
	}
	
	
	public Location location(Location loc) {
		int x = rnd.nextInt(10) - 5;
		int z = rnd.nextInt(10) - 5;
		loc.add(x, 0, z);
		loc.add(0, 1, 0);
		return loc;
	}

}
