package testPack;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class ScrollUseEvent {
	
	static ArrayList<Player> lock = new ArrayList<>();

	public ScrollUseEvent(Player player, ItemStack item, File folder) {
		
		if(lock.contains(player)) {
			return;
		}
		
//		for(Player all : Bukkit.getOnlinePlayers()) {
//			PlayerConnection connection = ((CraftPlayer) all).getHandle().playerConnection;
//			connection.sendPacket(new PacketPlayOutAnimation(((CraftPlayer) player).getHandle(), 0));
//		}
		
		TPScroll tp = new TPScroll();
		VilTPScroll vilTP = new VilTPScroll();
		INNTicket ticket = new INNTicket();
		BossTicket boss = new BossTicket();
		ReinforcementScroll reinScroll = new ReinforcementScroll();
		MetalwareToolScroll metalwareScroll = new MetalwareToolScroll();
		DefineAllScroll defineAll = new DefineAllScroll();
		QuestScroll qs = new QuestScroll();
		AnotherScroll as = new AnotherScroll();
		ItemDestroyScroll ids = new ItemDestroyScroll();
		CraftingScroll cs = new CraftingScroll();
		CraftingPotionScroll cps = new CraftingPotionScroll();
		CraftingFoodScroll cfs = new CraftingFoodScroll();
		RerollScroll rs = new RerollScroll();
		Inheritance inheritance = new Inheritance();
		
		try {
			//마을 스크롤
			vilTP.vilTP(player, item);
			//숙박티켓
			ticket.sleep(player, item);
			//이동
			tp.teleport(player, item);
			//보스소환
			boss.summon(player, item);
			//강화
			reinScroll.openInv(player, item);
			//세공
			metalwareScroll.openInv(player, item);
			//전체감정
			defineAll.effect(player, item);
			//퀘스트 스크롤
			qs.quest(player, item);
			//기타 스크롤
			as.effect(player, item);
			//아이템 파기 스크롤
			ids.openInv(player, item);
			//장비 제작 스크롤
			cs.openInv(player, item);
			//포션 제작 스크롤
			cps.openInv(player, item);
			//음식 제작 스크롤
			cfs.openInv(player, item);
			//리롤 스크롤
			rs.openInv(player, item);
			//계승자 스크롤
			inheritance.useScroll(player, item);
			//캐릭터 삭제 스크롤
			new RemoveCharacter(player, item, folder);
		} catch(Exception e) {
			
		}
		
		lock.add(player);
		
		new BukkitRunnable() {
			int time = 0;
			@Override
			public void run() {
				time++;
				if (time >= 20) {
					try {
						lock.remove(player);
					} catch(Exception e) {
						
					}
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
}
