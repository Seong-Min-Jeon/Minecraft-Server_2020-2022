package testPack;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class ParticleEffect {

	private int taskID;
	private final Player player;
	private Entity ent;

	public ParticleEffect(Player player) {
		this.player = player;
	}
	
	public ParticleEffect(Player player, Entity ent) {
		this.player = player;
		this.ent = ent;
	}
	
	// 본 체스트
	public void startE1() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (player.getNoDamageTicks() == 0) {
					pd.endTask();
					pd.removeID();
				}

				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 30);
				player.getWorld().spawnParticle(Particle.DRIP_LAVA, second, 30);
			}

		}, 0, 1);
	}

	// 뼈감옥
	public void startE2() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 30) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var), Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var), Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.PORTAL, first, 10);
				player.getWorld().spawnParticle(Particle.PORTAL, second, 10);
			}

		}, 0, 1);
	}

	// 디바인 링크
	public void startE3() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(0, Math.sin(var) + 1, 0);
				second = loc.clone().add(0, Math.sin(var) + 1, 0);

				player.getWorld().spawnParticle(Particle.SNEEZE, first, 0);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 0);
			}

		}, 0, 1);
	}

	// 증원
	public void startE4() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(0, Math.sin(var) + 1, 0);
				second = loc.clone().add(0, Math.sin(var) + 1, 0);

				player.getWorld().spawnParticle(Particle.SNEEZE, first, 0);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 0);
			}

		}, 0, 1);
	}

	// 성스러운 힘
	public void startE5() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.CRIT, first, 10);
					player.getWorld().spawnParticle(Particle.CRIT, second, 10);
				}
			}

		}, 0, 1);
	}

	// 버티기
	public void startE6() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SNEEZE, first, 10);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 10);

			}

		}, 0, 1);
	}

	// 도박사의 판
	public void startE7() {
		ArrayList<Particle> list = new ArrayList<>();

		list.add(Particle.VILLAGER_ANGRY);
		list.add(Particle.VILLAGER_HAPPY);

		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 2, Math.sin(var));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);

			}

		}, 0, 1);
	}

	// 무조건 이기는 판
	public void startE8() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 2, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 2, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 10);

			}

		}, 0, 1);
	}

	// 카사르의 복수
	public void startE9() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), var / 2, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), var / 2, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.WATER_SPLASH, first, 10);
				player.getWorld().spawnParticle(Particle.WATER_SPLASH, second, 10);

			}

		}, 0, 1);
	}

	// 신의 권능
	public void startE10() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2, first3, second3, first4, second4;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 40) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				while (true) {
					if (loc.getBlock().getType() != Material.AIR || loc.getY() <= 1) {
						loc.add(0, 1, 0);
						break;
					}
					loc = loc.add(0, -1, 0);
				}

				for (int i = 1; i < 10; i++) {
					first = loc.clone().add(Math.cos(var) + i, 0, Math.sin(var) + i);
					second = loc.clone().add(Math.cos(var + Math.PI) + i, 0, Math.sin(var + Math.PI) + i);
					first2 = loc.clone().add(Math.cos(var) - i, 0, Math.sin(var) + i);
					second2 = loc.clone().add(Math.cos(var - Math.PI) + i, 0, Math.sin(var + Math.PI) + i);
					first3 = loc.clone().add(Math.cos(var) - i, 0, Math.sin(var) - i);
					second3 = loc.clone().add(Math.cos(var + Math.PI) - i, 0, Math.sin(var + Math.PI) - i);
					first4 = loc.clone().add(Math.cos(var) + i, 0, Math.sin(var) - i);
					second4 = loc.clone().add(Math.cos(var + Math.PI) + i, 0, Math.sin(var + Math.PI) - i);

					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first2, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second2, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first3, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second3, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first4, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second4, 10);
				}
			}

		}, 0, 1);
	}

	// 기사단 창립
	public void startE11() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var) * 2, 0, Math.sin(var) * 2);
				second = loc.clone().add(Math.cos(var + Math.PI) * 2, 0, Math.sin(var + Math.PI) * 2);

				player.getWorld().spawnParticle(Particle.CLOUD, first, 10);
				player.getWorld().spawnParticle(Particle.CLOUD, second, 10);

			}
		}, 0, 1);
	}

	// 사기 진작
	public void startE12() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.SPELL_WITCH, first, 10);
					player.getWorld().spawnParticle(Particle.SPELL_WITCH, second, 10);
				}
			}
		}, 0, 1);
	}

	// 신의 주사위
	public void startE13() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 10);

			}
		}, 0, 1);
	}

	// 발도
	public void startE14() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, first, 10);
				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, second, 10);
				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, first2, 10);
				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, second2, 10);

			}
		}, 0, 1);
	}

	// 나이트메어
	public void startE15() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SMOKE_LARGE, first, 10);
				player.getWorld().spawnParticle(Particle.SMOKE_LARGE, second, 10);
				player.getWorld().spawnParticle(Particle.FALLING_LAVA, first, 10);
				player.getWorld().spawnParticle(Particle.FALLING_LAVA, second, 10);

			}
		}, 0, 1);
	}

	// 포션의 부작용
	public void startE16() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, first, 10);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, second, 10);

			}
		}, 0, 1);
	}

	// 포션 중독
	public void startE17() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.LAVA, first, 10);
				player.getWorld().spawnParticle(Particle.LAVA, second, 10);

			}
		}, 0, 1);
	}

	// 마편
	public void startE18() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.NOTE, first, 10);
					player.getWorld().spawnParticle(Particle.NOTE, second, 10);
				}

			}
		}, 0, 1);
	}

	// 선임의 명령
	public void startE19() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, second, 10);

			}
		}, 0, 1);
	}

	// 죽음의 숫자
	public void startE20() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, i, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, i, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.SQUID_INK, first, 10);
					player.getWorld().spawnParticle(Particle.SQUID_INK, second, 10);
				}

			}
		}, 0, 1);
	}

	// 지옥불
	public void startE21() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 10; i++) {
					first = loc.clone().add(i, i, i);
					second = loc.clone().add(-i, i, i);
					first2 = loc.clone().add(-i, i, -i);
					second2 = loc.clone().add(i, i, -i);

					player.getWorld().spawnParticle(Particle.LAVA, first, 0);
					player.getWorld().spawnParticle(Particle.LAVA, second, 0);
					player.getWorld().spawnParticle(Particle.LAVA, first2, 0);
					player.getWorld().spawnParticle(Particle.LAVA, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 에로우 실드
	public void startE22() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 300) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.TOTEM, first, 0);
				player.getWorld().spawnParticle(Particle.TOTEM, second, 0);

			}
		}, 0, 1);
	}

	// 루인 오브 노바
	public void startE23() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;
				loc = player.getLocation();

				while (true) {
					if (loc.getBlock().getType() != Material.AIR || loc.getY() <= 1) {
						loc.add(0, 1, 0);
						break;
					}
					loc = loc.add(0, -1, 0);
				}

				for (int i = 1; i < 8; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);
					first2 = loc.clone().add(Math.cos(var + Math.PI / 2) * i, 0, Math.sin(var + Math.PI / 2) * i);
					second2 = loc.clone().add(Math.cos(var + Math.PI * 3 / 2) * i, 0,
							Math.sin(var + Math.PI * 3 / 2) * i);

					player.getWorld().spawnParticle(Particle.SQUID_INK, first, 0);
					player.getWorld().spawnParticle(Particle.SQUID_INK, second, 0);
					player.getWorld().spawnParticle(Particle.SQUID_INK, first2, 0);
					player.getWorld().spawnParticle(Particle.SQUID_INK, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 니 위로 내 밑으로
	public void startE24() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 4; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);
					first2 = loc.clone().add(Math.cos(var + Math.PI / 2) * i, 0, Math.sin(var + Math.PI / 2) * i);
					second2 = loc.clone().add(Math.cos(var + Math.PI * 3 / 2) * i, 0,
							Math.sin(var + Math.PI * 3 / 2) * i);

					player.getWorld().spawnParticle(Particle.END_ROD, first, 0);
					player.getWorld().spawnParticle(Particle.END_ROD, second, 0);
					player.getWorld().spawnParticle(Particle.END_ROD, first2, 0);
					player.getWorld().spawnParticle(Particle.END_ROD, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 라떼는 말이야
	public void startE25() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			int time;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 30) {
					pd.endTask();
					pd.removeID();
				}

				time++;

				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.NOTE, first, 30);
				player.getWorld().spawnParticle(Particle.NOTE, second, 30);
			}

		}, 0, 1);
	}

	// 헬파이어
	public void startE26() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;
				loc = player.getLocation();

				for (int i = 1; i < 8; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);
					first2 = loc.clone().add(Math.cos(var + Math.PI / 2) * i, 0, Math.sin(var + Math.PI / 2) * i);
					second2 = loc.clone().add(Math.cos(var + Math.PI * 3 / 2) * i, 0,
							Math.sin(var + Math.PI * 3 / 2) * i);

					player.getWorld().spawnParticle(Particle.FLAME, first, 0);
					player.getWorld().spawnParticle(Particle.FLAME, second, 0);
					player.getWorld().spawnParticle(Particle.FLAME, first2, 0);
					player.getWorld().spawnParticle(Particle.FLAME, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 본 체스트
	public void startE27() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (player.getNoDamageTicks() == 0) {
					pd.endTask();
					pd.removeID();
				}

				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.END_ROD, first, 0);
				player.getWorld().spawnParticle(Particle.END_ROD, second, 0);
			}

		}, 0, 1);
	}

	// 그림 리퍼 폼1
	public void startE0_1() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				var += Math.PI / 8;
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 0.3, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 0.3, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 0);
				player.getWorld().spawnParticle(Particle.DRIP_LAVA, second, 0);

			}
		}, 0, 1);
	}

	// 그림 리퍼 폼2
	public void startE0_2() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				var += Math.PI / 8;
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 0.3, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 0.3, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SOUL, first, 0);
				player.getWorld().spawnParticle(Particle.SOUL, second, 0);

			}
		}, 0, 1);
	}

	// 데빌 레이저
	public void startE0_3() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			Location loc, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
			Vector dir;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}
				
				if(time >= 40) {
					pd.endTask();
					pd.removeID();
				}

				loc = player.getEyeLocation();
				dir = loc.getDirection();
				e1 = loc.clone().add(dir.getX(), dir.getY(), dir.getZ());
				e2 = loc.clone().add(dir.getX() * 2, dir.getY() * 2, dir.getZ() * 2);
				e3 = loc.clone().add(dir.getX() * 3, dir.getY() * 3, dir.getZ() * 3);
				e4 = loc.clone().add(dir.getX() * 4, dir.getY() * 4, dir.getZ() * 4);
				e5 = loc.clone().add(dir.getX() * 5, dir.getY() * 5, dir.getZ() * 5);
				e6 = loc.clone().add(dir.getX() * 6, dir.getY() * 6, dir.getZ() * 6);
				e7 = loc.clone().add(dir.getX() * 7, dir.getY() * 7, dir.getZ() * 7);
				e8 = loc.clone().add(dir.getX() * 8, dir.getY() * 8, dir.getZ() * 8);
				e9 = loc.clone().add(dir.getX() * 9, dir.getY() * 9, dir.getZ() * 9);
				e10 = loc.clone().add(dir.getX() * 10, dir.getY() * 10, dir.getZ() * 10);
				e11 = loc.clone().add(dir.getX() * 11, dir.getY() * 11, dir.getZ() * 11);
				e12 = loc.clone().add(dir.getX() * 12, dir.getY() * 12, dir.getZ() * 12);
				e13 = loc.clone().add(dir.getX() * 13, dir.getY() * 13, dir.getZ() * 13);
				e14 = loc.clone().add(dir.getX() * 14, dir.getY() * 14, dir.getZ() * 14);
				e15 = loc.clone().add(dir.getX() * 15, dir.getY() * 15, dir.getZ() * 15);
				e16 = loc.clone().add(dir.getX() * 16, dir.getY() * 16, dir.getZ() * 16);
				e17 = loc.clone().add(dir.getX() * 17, dir.getY() * 17, dir.getZ() * 17);
				e18 = loc.clone().add(dir.getX() * 18, dir.getY() * 18, dir.getZ() * 18);
				e19 = loc.clone().add(dir.getX() * 19, dir.getY() * 19, dir.getZ() * 19);
				e20 = loc.clone().add(dir.getX() * 20, dir.getY() * 20, dir.getZ() * 20);

				player.getWorld().spawnParticle(Particle.CRIT, e1, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e2, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e3, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e4, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e5, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e6, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e7, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e8, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e9, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e10, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e11, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e12, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e13, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e14, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e15, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e16, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e17, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e18, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e19, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e20, 0);
				
				time++;

			}
		}, 0, 1);
	}
	
	// 마인 레이저
	public void startE0_4() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			Location loc, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
			Vector dir;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 40) {
					pd.endTask();
					pd.removeID();
				}

				loc = player.getEyeLocation();
				dir = loc.getDirection();
				e1 = loc.clone().add(dir.getX(), dir.getY(), dir.getZ());
				e2 = loc.clone().add(dir.getX() * 2, dir.getY() * 2, dir.getZ() * 2);
				e3 = loc.clone().add(dir.getX() * 3, dir.getY() * 3, dir.getZ() * 3);
				e4 = loc.clone().add(dir.getX() * 4, dir.getY() * 4, dir.getZ() * 4);
				e5 = loc.clone().add(dir.getX() * 5, dir.getY() * 5, dir.getZ() * 5);
				e6 = loc.clone().add(dir.getX() * 6, dir.getY() * 6, dir.getZ() * 6);
				e7 = loc.clone().add(dir.getX() * 7, dir.getY() * 7, dir.getZ() * 7);
				e8 = loc.clone().add(dir.getX() * 8, dir.getY() * 8, dir.getZ() * 8);
				e9 = loc.clone().add(dir.getX() * 9, dir.getY() * 9, dir.getZ() * 9);
				e10 = loc.clone().add(dir.getX() * 10, dir.getY() * 10, dir.getZ() * 10);
				e11 = loc.clone().add(dir.getX() * 11, dir.getY() * 11, dir.getZ() * 11);
				e12 = loc.clone().add(dir.getX() * 12, dir.getY() * 12, dir.getZ() * 12);
				e13 = loc.clone().add(dir.getX() * 13, dir.getY() * 13, dir.getZ() * 13);
				e14 = loc.clone().add(dir.getX() * 14, dir.getY() * 14, dir.getZ() * 14);
				e15 = loc.clone().add(dir.getX() * 15, dir.getY() * 15, dir.getZ() * 15);
				e16 = loc.clone().add(dir.getX() * 16, dir.getY() * 16, dir.getZ() * 16);
				e17 = loc.clone().add(dir.getX() * 17, dir.getY() * 17, dir.getZ() * 17);
				e18 = loc.clone().add(dir.getX() * 18, dir.getY() * 18, dir.getZ() * 18);
				e19 = loc.clone().add(dir.getX() * 19, dir.getY() * 19, dir.getZ() * 19);
				e20 = loc.clone().add(dir.getX() * 20, dir.getY() * 20, dir.getZ() * 20);

				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e1, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e2, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e3, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e4, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e5, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e6, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e7, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e8, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e9, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e10, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e11, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e12, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e13, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e14, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e15, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e16, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e17, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e18, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e19, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e20, 0);

				time++;

			}
		}, 0, 1);
	}

	// 아이 오브 오더
	public void startE0_5() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.CRIT, first, 10);
					player.getWorld().spawnParticle(Particle.CRIT, second, 10);
				}
			}
		}, 0, 1);
	}
	
	// 터렛 레이저
	public void startE0_6() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			Location loc, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
			Vector dir;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 200) {
					pd.endTask();
					pd.removeID();
				}

				loc = ent.getLocation().add(new Vector(0, 2, 0));
				dir = loc.getDirection();
				e1 = loc.clone().add(dir.getX(), dir.getY(), dir.getZ());
				e2 = loc.clone().add(dir.getX() * 2, dir.getY(), dir.getZ() * 2);
				e3 = loc.clone().add(dir.getX() * 3, dir.getY(), dir.getZ() * 3);
				e4 = loc.clone().add(dir.getX() * 4, dir.getY(), dir.getZ() * 4);
				e5 = loc.clone().add(dir.getX() * 5, dir.getY(), dir.getZ() * 5);
				e6 = loc.clone().add(dir.getX() * 6, dir.getY(), dir.getZ() * 6);
				e7 = loc.clone().add(dir.getX() * 7, dir.getY(), dir.getZ() * 7);
				e8 = loc.clone().add(dir.getX() * 8, dir.getY(), dir.getZ() * 8);
				e9 = loc.clone().add(dir.getX() * 9, dir.getY(), dir.getZ() * 9);
				e10 = loc.clone().add(dir.getX() * 10, dir.getY(), dir.getZ() * 10);
				e11 = loc.clone().add(dir.getX() * 11, dir.getY(), dir.getZ() * 11);
				e12 = loc.clone().add(dir.getX() * 12, dir.getY(), dir.getZ() * 12);
				e13 = loc.clone().add(dir.getX() * 13, dir.getY(), dir.getZ() * 13);
				e14 = loc.clone().add(dir.getX() * 14, dir.getY(), dir.getZ() * 14);
				e15 = loc.clone().add(dir.getX() * 15, dir.getY(), dir.getZ() * 15);
				e16 = loc.clone().add(dir.getX() * 16, dir.getY(), dir.getZ() * 16);
				e17 = loc.clone().add(dir.getX() * 17, dir.getY(), dir.getZ() * 17);
				e18 = loc.clone().add(dir.getX() * 18, dir.getY(), dir.getZ() * 18);
				e19 = loc.clone().add(dir.getX() * 19, dir.getY(), dir.getZ() * 19);
				e20 = loc.clone().add(dir.getX() * 20, dir.getY(), dir.getZ() * 20);

				player.getWorld().spawnParticle(Particle.CRIT, e1, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e2, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e3, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e4, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e5, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e6, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e7, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e8, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e9, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e10, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e11, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e12, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e13, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e14, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e15, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e16, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e17, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e18, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e19, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e20, 0);

				time++;

			}
		}, 0, 1);
	}
	
////몬스터 기술////	
	
	
	// 시련의 형상
	public void startE28() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first, 0);
					player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second, 0);
				}
			}

		}, 0, 1);
	}

	// 요정왕
	public void startE29() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 30) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var), Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var), Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SLIME, first, 10);
				player.getWorld().spawnParticle(Particle.SLIME, second, 10);
			}

		}, 0, 1);
	}

	// 발로르
	public void startE30() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.FLAME, first, 10);
				player.getWorld().spawnParticle(Particle.FLAME, second, 10);
				player.getWorld().spawnParticle(Particle.FLAME, first2, 10);
				player.getWorld().spawnParticle(Particle.FLAME, second2, 10);

			}
		}, 0, 1);
	}
	
	// 아덴
	public void startE31() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.END_ROD, first, 10);
				player.getWorld().spawnParticle(Particle.END_ROD, second, 10);

			}
		}, 0, 1);
	}
	
	// 죽음의 탑 공통
	public void startE32() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var), 2, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 2, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 10);

			}
			
		}, 0, 1);
	}
	
	// 죽음의 탑 심판
	public void startE33() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.CRIT, first, 10);
				player.getWorld().spawnParticle(Particle.CRIT, second, 10);
				player.getWorld().spawnParticle(Particle.CRIT, first2, 10);
				player.getWorld().spawnParticle(Particle.CRIT, second2, 10);

			}

		}, 0, 1);
	}

	// 코낭그
	public void startE34() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first, 10);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second, 10);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first2, 10);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second2, 10);

			}
		}, 0, 1);
	}
	
	// 프라에그나리
	public void startE35() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.NOTE, first, 10);
				player.getWorld().spawnParticle(Particle.NOTE, second, 10);
				player.getWorld().spawnParticle(Particle.NOTE, first2, 10);
				player.getWorld().spawnParticle(Particle.NOTE, second2, 10);

			}
		}, 0, 1);
	}

}
