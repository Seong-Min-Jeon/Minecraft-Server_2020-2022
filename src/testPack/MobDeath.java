package testPack;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MobDeath {

	Player player = null;

	public MobDeath(Player playerArg, Entity mobArg, double damageArg) {
		Entity mob = mobArg;
		double damage = damageArg;
		this.player = playerArg;
		death(mob, damage);
	}

	public MobDeath(Entity mobArg, double damageArg) {
		Entity mob = mobArg;
		double damage = damageArg;
		death(mob, damage);
	}

	public void death(Entity mob, double damage) {
		MobLoot mobloot = new MobLoot();
		Player lootPlayer;
		if (this.player == null) {
			if(((Mob) mob).getTarget() instanceof Player) {
				lootPlayer = (Player) (((Mob) mob).getTarget());				
			} else if(((Mob) mob).getTarget().getType() == EntityType.IRON_GOLEM) {
				IronGolem ir =(IronGolem) ((Mob) mob).getTarget();
				GolemOwner go = new GolemOwner();
				lootPlayer = go.returnPlayer(ir.getUniqueId());
			} else {
				lootPlayer = (Player) (((Mob) mob).getTarget());	
			}
		} else {
			lootPlayer = this.player;
		}
		
		if (((LivingEntity) mob).getHealth() - damage <= 0) {
			// 레벨 안맞으면 캔슬
			String str = mob.getCustomName().split("\\.")[1];
			String num = str.split("]")[0];
			try {
				int mobLvl = Integer.parseInt(num);
				int dist = lootPlayer.getLevel() - mobLvl;
				if (dist < -20) {
					lootPlayer.sendMessage(ChatColor.RED + "몬스터와의 수준 차이로 아무것도 얻을 수 없습니다.");
					return;
				}
			} catch (Exception e) {

			}
			
			try {
				String name = mob.getCustomName().substring(2);

				// 공격을 모르는 스켈이
				if (name.equalsIgnoreCase("공격을 모르는 스켈이" + ChatColor.YELLOW + " [Lv.0]")) {
					mobloot.mob1(lootPlayer);
				}
				// 보스 스켈이
				if (name.equalsIgnoreCase("보스 스켈이" + ChatColor.YELLOW + " [Lv.0]")) {
					mobloot.mob2(lootPlayer);
				}
				// 초록 슬라임
				if (name.equalsIgnoreCase("초록 슬라임" + ChatColor.YELLOW + " [Lv.1]")) {
					mobloot.mob3(lootPlayer);
				}
				// 해안가 좀비
				if (name.equalsIgnoreCase("해안가 좀비" + ChatColor.YELLOW + " [Lv.6]")) {
					mobloot.mob4(lootPlayer);
				}
				// 워그닐에 배신당한 자
				if (name.equalsIgnoreCase("워그닐에 배신당한 자" + ChatColor.YELLOW + " [Lv.13]")) {
					mobloot.mob5(lootPlayer);
				}
				// 검은 수염 하수인
				if (name.equalsIgnoreCase("검은 수염 하수인" + ChatColor.YELLOW + " [Lv.32]")) {
					mobloot.mob6(lootPlayer);
				}
				// 검은 수염 간부
				if (name.equalsIgnoreCase("검은 수염 간부" + ChatColor.YELLOW + " [Lv.40]")) {
					mobloot.mob7(lootPlayer);
				}
				// 포레스트 고스트
				if (name.equalsIgnoreCase("포레스트 고스트" + ChatColor.YELLOW + " [Lv.15]")) {
					mobloot.mob8(lootPlayer);
				}
				// 크리스탈 워리어
				if (name.equalsIgnoreCase("크리스탈 워리어" + ChatColor.YELLOW + " [Lv.18]")) {
					mobloot.mob9(lootPlayer);
				}
				// 저주받은 나무 요정
				if (name.equalsIgnoreCase("저주받은 나무 요정" + ChatColor.YELLOW + " [Lv.20]")) {
					mobloot.mob10(lootPlayer);
				}
				// 산호 좀비
				if (name.equalsIgnoreCase("산호 정령" + ChatColor.YELLOW + " [Lv.12]")) {
					mobloot.mob11(lootPlayer);
				}
				// 산호 스트레이
				if (name.equalsIgnoreCase("산호 스트레이" + ChatColor.YELLOW + " [Lv.16]")) {
					mobloot.mob12(lootPlayer);
				}
				// 거북 병사
				if (name.equalsIgnoreCase("거북 병사" + ChatColor.YELLOW + " [Lv.15]")) {
					mobloot.mob13(lootPlayer);
				}
				// 엘더 가디언
				if (name.equalsIgnoreCase("엘더 가디언" + ChatColor.YELLOW + " [Lv.19]")) {
					mobloot.mob14(lootPlayer);
				}
				// 고블린
				if (name.equalsIgnoreCase("고블린" + ChatColor.YELLOW + " [Lv.47]")) {
					mobloot.mob15(lootPlayer);
				}
				// 파르홀론의 망자
				if (name.equalsIgnoreCase("파르홀론의 망자" + ChatColor.YELLOW + " [Lv.50]")) {
					mobloot.mob16(lootPlayer);
				}
				// 파르홀론의 유령
				if (name.equalsIgnoreCase("파르홀론의 유령" + ChatColor.YELLOW + " [Lv.58]")) {
					mobloot.mob17(lootPlayer);
				}
				// 변이된 곰
				if (name.equalsIgnoreCase("변이된 곰" + ChatColor.YELLOW + " [Lv.62]")) {
					mobloot.mob18(lootPlayer);
				}
				// 침략자
				if (name.equalsIgnoreCase("침략자" + ChatColor.YELLOW + " [Lv.24]")) {
					mobloot.mob19(lootPlayer);
				}
				// 숲의 황소
				if (name.equalsIgnoreCase("숲의 황소" + ChatColor.YELLOW + " [Lv.34]")) {
					mobloot.mob20(lootPlayer);
				}
				// 숲의 마녀
				if (name.equalsIgnoreCase("숲의 마녀" + ChatColor.YELLOW + " [Lv.31]")) {
					mobloot.mob21(lootPlayer);
				}
				// 산적
				if (name.equalsIgnoreCase("산적" + ChatColor.YELLOW + " [Lv.27]")) {
					mobloot.mob22(lootPlayer);
				}
				// 변이된 나뭇잎
				if (name.equalsIgnoreCase("변이된 나뭇잎" + ChatColor.YELLOW + " [Lv.35]")) {
					mobloot.mob23(lootPlayer);
				}
				// 되살아난 모험가
				if (name.equalsIgnoreCase("되살아난 모험가" + ChatColor.YELLOW + " [Lv.38]")) {
					mobloot.mob24(lootPlayer);
				}
				// 유적의 주인
				if (name.equalsIgnoreCase("유적의 주인" + ChatColor.YELLOW + " [Lv.43]")) {
					mobloot.mob25(lootPlayer);
				}
				// 오크
				if (name.equalsIgnoreCase("오크" + ChatColor.YELLOW + " [Lv.60]")) {
					mobloot.mob26(lootPlayer);
				}
				// 미래를 예지하는 눈
				if (name.equalsIgnoreCase("미래를 예지하는 눈" + ChatColor.YELLOW + " [Lv.66]")) {
					mobloot.mob27(lootPlayer);
				}
				// 검은 인간
				if (name.equalsIgnoreCase("검은 인간" + ChatColor.YELLOW + " [Lv.72]")) {
					mobloot.mob28(lootPlayer);
				}
				// 포보르 정찰병
				if (name.equalsIgnoreCase("포보르 정찰병" + ChatColor.YELLOW + " [Lv.80]")) {
					mobloot.mob29(lootPlayer);
				}
				// 유적을 지키는 거미
				if (name.equalsIgnoreCase("유적을 지키는 거미" + ChatColor.YELLOW + " [Lv.100]")) {
					mobloot.mob30(lootPlayer);
				}
				// 파르홀론의 수호자
				if (name.equalsIgnoreCase("파르홀론의 수호자" + ChatColor.YELLOW + " [Lv.113]")) {
					mobloot.mob31(lootPlayer);
				}
				// 외눈의 포보르
				if (name.equalsIgnoreCase("외눈의 포보르" + ChatColor.YELLOW + " [Lv.83]")) {
					mobloot.mob32(lootPlayer);
				}
				// 포보르 세력 플레이어
				if (name.equalsIgnoreCase("포보르 세력 플레이어" + ChatColor.YELLOW + " [Lv.96]")) {
					mobloot.mob33(lootPlayer);
				}
				// 동굴 거미
				if (name.equalsIgnoreCase("동굴 거미" + ChatColor.YELLOW + " [Lv.134]")) {
					mobloot.mob34(lootPlayer);
				}
				// 동굴 벌레
				if (name.equalsIgnoreCase("동굴 벌레" + ChatColor.YELLOW + " [Lv.140]")) {
					mobloot.mob35(lootPlayer);
				}
				// 아랑
				if (name.equalsIgnoreCase("아랑" + ChatColor.YELLOW + " [Lv.127]")) {
					mobloot.mob36(lootPlayer);
				}
				// 머라우더
				if (name.equalsIgnoreCase("머라우더" + ChatColor.YELLOW + " [Lv.135]")) {
					mobloot.mob37(lootPlayer);
				}
				// 파르홀론의 전투병
				if (name.equalsIgnoreCase("파르홀론의 전투병" + ChatColor.YELLOW + " [Lv.253]")) {
					mobloot.mob38(lootPlayer);
				}
				// 포보르 세력 플레이어
				if (name.equalsIgnoreCase("포보르 세력 플레이어" + ChatColor.YELLOW + " [Lv.150]")) {
					mobloot.mob39(lootPlayer);
				}
				// 분노의 형상
				if (name.equalsIgnoreCase("분노의 형상" + ChatColor.YELLOW + " [Lv.158]")) {
					mobloot.mob40(lootPlayer);
				}
				// 공허의 형상
				if (name.equalsIgnoreCase("공허의 형상" + ChatColor.YELLOW + " [Lv.160]")) {
					mobloot.mob41(lootPlayer);
				}
				// 고통의 형상
				if (name.equalsIgnoreCase("고통의 형상" + ChatColor.YELLOW + " [Lv.163]")) {
					mobloot.mob42(lootPlayer);
				}
				// 침묵의 형상
				if (name.equalsIgnoreCase("침묵의 형상" + ChatColor.YELLOW + " [Lv.165]")) {
					mobloot.mob43(lootPlayer);
				}
				// 우울의 형상
				if (name.equalsIgnoreCase("우울의 형상" + ChatColor.YELLOW + " [Lv.168]")) {
					mobloot.mob44(lootPlayer);
				}
				// 허몽의 형상
				if (name.equalsIgnoreCase("허몽의 형상" + ChatColor.YELLOW + " [Lv.171]")) {
					mobloot.mob45(lootPlayer);
				}
				// 오만의 형상
				if (name.equalsIgnoreCase("오만의 형상" + ChatColor.YELLOW + " [Lv.178]")) {
					mobloot.mob46(lootPlayer);
				}
				// 배신의 형상
				if (name.equalsIgnoreCase("배신의 형상" + ChatColor.YELLOW + " [Lv.174]")) {
					mobloot.mob47(lootPlayer);
				}
				// 시련의 형상
				if (name.equalsIgnoreCase("시련의 형상" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob48(lootPlayer);
				}
				// 귀웅
				if (name.equalsIgnoreCase("귀웅" + ChatColor.YELLOW + " [Lv.148]")) {
					mobloot.mob49(lootPlayer);
				}
				// 대사
				if (name.equalsIgnoreCase("대사" + ChatColor.YELLOW + " [Lv.157]")) {
					mobloot.mob50(lootPlayer);
				}
				// 영혼을 탐하는 요정
				if (name.equalsIgnoreCase("영혼을 탐하는 요정" + ChatColor.YELLOW + " [Lv.200]")) {
					mobloot.mob51(lootPlayer);
				}
				// 딥슬라임
				if (name.equalsIgnoreCase("딥슬라임" + ChatColor.YELLOW + " [Lv.194]")) {
					mobloot.mob52(lootPlayer);
				}
				// 워리어
				if (name.equalsIgnoreCase("워리어" + ChatColor.YELLOW + " [Lv.184]")) {
					mobloot.mob53(lootPlayer);
				}
				// 빈디케이터
				if (name.equalsIgnoreCase("빈디케이터" + ChatColor.YELLOW + " [Lv.190]")) {
					mobloot.mob54(lootPlayer);
				}
				// 저거너트
				if (name.equalsIgnoreCase("저거너트" + ChatColor.YELLOW + " [Lv.198]")) {
					mobloot.mob55(lootPlayer);
				}
				// 유서퍼
				if (name.equalsIgnoreCase("유서퍼" + ChatColor.YELLOW + " [Lv.203]")) {
					mobloot.mob56(lootPlayer);
				}
				// 뒤틀린 역사의 흔적
				if (name.equalsIgnoreCase("뒤틀린 역사의 흔적" + ChatColor.YELLOW + " [Lv.211]")) {
					mobloot.mob57(lootPlayer);
				}
				// 아공간 파수꾼
				if (name.equalsIgnoreCase("아공간 파수꾼" + ChatColor.YELLOW + " [Lv.218]")) {
					mobloot.mob58(lootPlayer);
				}
				// 조난당한 영혼
				if (name.equalsIgnoreCase("조난당한 영혼" + ChatColor.YELLOW + " [Lv.201]")) {
					mobloot.mob59(lootPlayer);
				}
				// 익사당한 선원
				if (name.equalsIgnoreCase("익사당한 선원" + ChatColor.YELLOW + " [Lv.205]")) {
					mobloot.mob60(lootPlayer);
				}
				// 수라
				if (name.equalsIgnoreCase("수라" + ChatColor.YELLOW + " [Lv.212]")) {
					mobloot.mob61(lootPlayer);
				}
				// 나찰
				if (name.equalsIgnoreCase("나찰" + ChatColor.YELLOW + " [Lv.216]")) {
					mobloot.mob62(lootPlayer);
				}
				// 나호
				if (name.equalsIgnoreCase("나호" + ChatColor.YELLOW + " [Lv.222]")) {
					mobloot.mob63(lootPlayer);
				}
				// 나섬
				if (name.equalsIgnoreCase("나섬" + ChatColor.YELLOW + " [Lv.230]")) {
					mobloot.mob64(lootPlayer);
				}
				// 데빌 보초병
				if (name.equalsIgnoreCase("데빌 보초병" + ChatColor.YELLOW + " [Lv.243]")) {
					mobloot.mob65(lootPlayer);
				}
				// 데빌 병사
				if (name.equalsIgnoreCase("데빌 병사" + ChatColor.YELLOW + " [Lv.250]")) {
					mobloot.mob66(lootPlayer);
				}
				// 데빌 분대장
				if (name.equalsIgnoreCase("데빌 분대장" + ChatColor.YELLOW + " [Lv.260]")) {
					mobloot.mob67(lootPlayer);
				}
				// 묘지기의 신직
				if (name.equalsIgnoreCase("묘지기의 신직" + ChatColor.YELLOW + " [Lv.226]")) {
					mobloot.mob68(lootPlayer);
				}
				// 묘지기의 사령관
				if (name.equalsIgnoreCase("묘지기의 사령관" + ChatColor.YELLOW + " [Lv.231]")) {
					mobloot.mob69(lootPlayer);
				}
				// 묘지기의 영술사
				if (name.equalsIgnoreCase("묘지기의 영술사" + ChatColor.YELLOW + " [Lv.236]")) {
					mobloot.mob70(lootPlayer);
				}
				// 묘지기의 이능자
				if (name.equalsIgnoreCase("묘지기의 이능자" + ChatColor.YELLOW + " [Lv.245]")) {
					mobloot.mob71(lootPlayer);
				}
				// 보초를 서는 요정
				if (name.equalsIgnoreCase("보초를 서는 요정" + ChatColor.YELLOW + " [Lv.183]")) {
					mobloot.mob72(lootPlayer);
				}
				// 공격대 요정
				if (name.equalsIgnoreCase("공격대 요정" + ChatColor.YELLOW + " [Lv.187]")) {
					mobloot.mob73(lootPlayer);
				}
				// 불의 요정
				if (name.equalsIgnoreCase("불의 요정" + ChatColor.YELLOW + " [Lv.192]")) {
					mobloot.mob74(lootPlayer);
				}
				// 요정의 소환수
				if (name.equalsIgnoreCase("요정의 소환수" + ChatColor.YELLOW + " [Lv.194]")) {
					mobloot.mob75(lootPlayer);
				}
				// 거대 요정
				if (name.equalsIgnoreCase("거대 요정" + ChatColor.YELLOW + " [Lv.200]")) {
					mobloot.mob76(lootPlayer);
				}
				// 요정왕 오베론
				if (name.equalsIgnoreCase("요정왕 오베론" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob77(lootPlayer);
					mob.remove();
				}
				// 요정여왕 티타니아
				if (name.equalsIgnoreCase("요정여왕 티타니아" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob78(lootPlayer);
					mob.remove();
				}
				// 나비
				if (name.equalsIgnoreCase("나비" + ChatColor.YELLOW + " [Lv.254]")) {
					mobloot.mob79(lootPlayer);
				}
				// 설원 정찰자
				if (name.equalsIgnoreCase("설원 정찰자" + ChatColor.YELLOW + " [Lv.217]")) {
					mobloot.mob80(lootPlayer);
				}
				// 설원 정찰자
				if (name.equalsIgnoreCase("설원 정찰자" + ChatColor.YELLOW + " [Lv.224]")) {
					mobloot.mob81(lootPlayer);
				}
				// 설원 정찰자
				if (name.equalsIgnoreCase("설원 정찰자" + ChatColor.YELLOW + " [Lv.230]")) {
					mobloot.mob82(lootPlayer);
				}
				// 발로르의 보병
				if (name.equalsIgnoreCase("발로르의 보병" + ChatColor.YELLOW + " [Lv.230]")) {
					mobloot.mob83(lootPlayer);
				}
				// 발로르의 궁병
				if (name.equalsIgnoreCase("발로르의 궁병" + ChatColor.YELLOW + " [Lv.230]")) {
					mobloot.mob83(lootPlayer);
				}
				// 발로르의 보병
				if (name.equalsIgnoreCase("발로르의 보병" + ChatColor.YELLOW + " [Lv.232]")) {
					mobloot.mob84(lootPlayer);
				}
				// 발로르의 궁병
				if (name.equalsIgnoreCase("발로르의 궁병" + ChatColor.YELLOW + " [Lv.232]")) {
					mobloot.mob84(lootPlayer);
				}
				// 발로르의 보병
				if (name.equalsIgnoreCase("발로르의 보병" + ChatColor.YELLOW + " [Lv.238]")) {
					mobloot.mob85(lootPlayer);
				}
				// 발로르의 궁병
				if (name.equalsIgnoreCase("발로르의 궁병" + ChatColor.YELLOW + " [Lv.238]")) {
					mobloot.mob85(lootPlayer);
				}
				// 케흘렌
				if (name.equalsIgnoreCase("케흘렌" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob86(lootPlayer);
				}
				// 발로르
				if (name.equalsIgnoreCase("발로르" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob87(lootPlayer);
				}
				// 거대 슬라임
				if (name.equalsIgnoreCase("거대 슬라임" + ChatColor.YELLOW + " [Lv.253]")) {
					mobloot.mob88(lootPlayer);
				}
				// 늑대 거미
				if (name.equalsIgnoreCase("늑대 거미" + ChatColor.YELLOW + " [Lv.258]")) {
					mobloot.mob89(lootPlayer);
				}
				// 독거미
				if (name.equalsIgnoreCase("독거미" + ChatColor.YELLOW + " [Lv.264]")) {
					mobloot.mob90(lootPlayer);
				}
				// 늪지의 마수
				if (name.equalsIgnoreCase("늪지의 마수" + ChatColor.YELLOW + " [Lv.265]")) {
					mobloot.mob91(lootPlayer);
				}
				// 늪지의 마신왕
				if (name.equalsIgnoreCase("늪지의 마신왕" + ChatColor.YELLOW + " [Lv.270]")) {
					mobloot.mob92(lootPlayer);
				}
				// 산적
				if (name.equalsIgnoreCase("산적" + ChatColor.YELLOW + " [Lv.268]")) {
					mobloot.mob93(lootPlayer);
				}
				// 전투형 집사
				if (name.equalsIgnoreCase("전투형 집사" + ChatColor.YELLOW + " [Lv.100]")) {
					mobloot.mob94(lootPlayer);
				}
				// 전투형 메이드
				if (name.equalsIgnoreCase("전투형 메이드" + ChatColor.YELLOW + " [Lv.105]")) {
					mobloot.mob95(lootPlayer);
				}
				// 기사출신 집사
				if (name.equalsIgnoreCase("기사출신 집사" + ChatColor.YELLOW + " [Lv.110]")) {
					mobloot.mob96(lootPlayer);
				}
				// 장교출신 메이드
				if (name.equalsIgnoreCase("장교출신 메이드" + ChatColor.YELLOW + " [Lv.110]")) {
					mobloot.mob96(lootPlayer);
				}
				// 보안팀장
				if (name.equalsIgnoreCase("보안팀장" + ChatColor.YELLOW + " [Lv.115]")) {
					mobloot.mob96(lootPlayer);
				}
				// 전투형 집사
				if (name.equalsIgnoreCase("전투형 집사" + ChatColor.YELLOW + " [Lv.105]")) {
					mobloot.mob97(lootPlayer);
				}
				// 전투형 메이드
				if (name.equalsIgnoreCase("전투형 메이드" + ChatColor.YELLOW + " [Lv.108]")) {
					mobloot.mob98(lootPlayer);
				}
				// 아덴
				if (name.equalsIgnoreCase("아덴" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob99(lootPlayer);
				}
				// 특급 요리사
				if (name.equalsIgnoreCase("특급 요리사" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob100(lootPlayer);
				}
				// 바선생
				if (name.equalsIgnoreCase("바선생" + ChatColor.YELLOW + " [Lv.180]")) {
					mobloot.mob101(lootPlayer);
				}
				// 푸르 고블린
				if (name.equalsIgnoreCase("푸르 고블린" + ChatColor.YELLOW + " [Lv.271]")) {
					mobloot.mob102(lootPlayer);
				}
				// 되살아난 전사
				if (name.equalsIgnoreCase("되살아난 전사" + ChatColor.YELLOW + " [Lv.274]")) {
					mobloot.mob103(lootPlayer);
				}
				// 포보르 세력 플레이어
				if (name.equalsIgnoreCase("포보르 세력 플레이어" + ChatColor.YELLOW + " [Lv.279]")) {
					mobloot.mob104(lootPlayer);
				}
				// 캘시퍼
				if (name.equalsIgnoreCase("캘시퍼" + ChatColor.YELLOW + " [Lv.283]")) {
					mobloot.mob105(lootPlayer);
				}
				// 하급 파괴수
				if (name.equalsIgnoreCase("하급 파괴수" + ChatColor.YELLOW + " [Lv.290]")) {
					mobloot.mob106(lootPlayer);
				}
				// 되살아난 해골
				if (name.equalsIgnoreCase("되살아난 해골" + ChatColor.YELLOW + " [Lv.286]")) {
					mobloot.mob107(lootPlayer);
				}
				// 밀 가디언
				if (name.equalsIgnoreCase("밀 가디언" + ChatColor.YELLOW + " [Lv.294]")) {
					mobloot.mob108(lootPlayer);
				}
				// 변장한 늑대
				if (name.equalsIgnoreCase("변장한 늑대" + ChatColor.YELLOW + " [Lv.300]")) {
					mobloot.mob109(lootPlayer);
				}
				// 약쟁이
				if (name.equalsIgnoreCase("약쟁이" + ChatColor.YELLOW + " [Lv.299]")) {
					mobloot.mob110(lootPlayer);
				}
				// 과자 마녀
				if (name.equalsIgnoreCase("과자 마녀" + ChatColor.YELLOW + " [Lv.306]")) {
					mobloot.mob111(lootPlayer);
				}
				// 1층의 지배자
				if (name.equalsIgnoreCase("1층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob112(lootPlayer);
				}
				// 2층의 지배자
				if (name.equalsIgnoreCase("2층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob113(lootPlayer);
				}
				// 3층의 지배자
				if (name.equalsIgnoreCase("3층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob114(lootPlayer);
				}
				// 4층의 지배자
				if (name.equalsIgnoreCase("4층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob115(lootPlayer);
				}
				// 5층의 지배자
				if (name.equalsIgnoreCase("5층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob116(lootPlayer);
				}
				// 6층의 지배자
				if (name.equalsIgnoreCase("6층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob117(lootPlayer);
				}
				// 7층의 지배자
				if (name.equalsIgnoreCase("7층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob118(lootPlayer);
				}
				// 8층의 지배자
				if (name.equalsIgnoreCase("8층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob119(lootPlayer);
				}
				// 9층의 지배자
				if (name.equalsIgnoreCase("9층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob120(lootPlayer);
				}
				// 10층의 지배자
				if (name.equalsIgnoreCase("10층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob121(lootPlayer);
				}
				// 11층의 지배자
				if (name.equalsIgnoreCase("11층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob122(lootPlayer);
				}
				// 탑의 주인
				if (name.equalsIgnoreCase("탑의 주인" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob123(lootPlayer);
				}
				// 지하의 파수꾼
				if (name.equalsIgnoreCase("지하의 파수꾼" + ChatColor.YELLOW + " [Lv.320]")) {
					mobloot.mob124(lootPlayer);
				}
				// 지하의 파수꾼
				if (name.equalsIgnoreCase("지하의 파수꾼" + ChatColor.YELLOW + " [Lv.324]")) {
					mobloot.mob125(lootPlayer);
				}
				// 갓 슬라임
				if (name.equalsIgnoreCase("갓 슬라임" + ChatColor.YELLOW + " [Lv.310]")) {
					mobloot.mob126(lootPlayer);
				}
				// 사라진 부락의 전사
				if (name.equalsIgnoreCase("사라진 부락의 전사" + ChatColor.YELLOW + " [Lv.306]")) {
					mobloot.mob127(lootPlayer);
				}
				// 네크로벨리의 암살자
				if (name.equalsIgnoreCase("네크로벨리의 암살자" + ChatColor.YELLOW + " [Lv.308]")) {
					mobloot.mob128(lootPlayer);
				}
				// 네크로벨리의 감시자
				if (name.equalsIgnoreCase("네크로벨리의 감시자" + ChatColor.YELLOW + " [Lv.314]")) {
					mobloot.mob129(lootPlayer);
				}
				// 네크로벨리의 복병
				if (name.equalsIgnoreCase("네크로벨리의 복병" + ChatColor.YELLOW + " [Lv.318]")) {
					mobloot.mob130(lootPlayer);
				}
				// 푸르 날벌레
				if (name.equalsIgnoreCase("푸르 날벌레" + ChatColor.YELLOW + " [Lv.312]")) {
					mobloot.mob131(lootPlayer);
				}
				// 푸르 날벌레
				if (name.equalsIgnoreCase("푸르 날벌레" + ChatColor.YELLOW + " [Lv.317]")) {
					mobloot.mob132(lootPlayer);
				}
				// 지하감옥의 간부
				if (name.equalsIgnoreCase("지하감옥의 간부" + ChatColor.YELLOW + " [Lv.329]")) {
					mobloot.mob133(lootPlayer);
				}
				// 지하감옥의 죄수
				if (name.equalsIgnoreCase("지하감옥의 죄수" + ChatColor.YELLOW + " [Lv.325]")) {
					mobloot.mob134(lootPlayer);
				}
				// 마력의 부산물
				if (name.equalsIgnoreCase("마력의 부산물" + ChatColor.YELLOW + " [Lv.325]")) {
					mobloot.mob135(lootPlayer);
				}
				// 강화 개조 인간
				if (name.equalsIgnoreCase("강화 개조 인간" + ChatColor.YELLOW + " [Lv.330]")) {
					mobloot.mob136(lootPlayer);
				}
				// 마법에 타락한 자
				if (name.equalsIgnoreCase("마법에 타락한 자" + ChatColor.YELLOW + " [Lv.332]")) {
					mobloot.mob137(lootPlayer);
				}
				// 전생한 슬라임
				if (name.equalsIgnoreCase("전생한 슬라임" + ChatColor.YELLOW + " [Lv.336]")) {
					mobloot.mob138(lootPlayer);
				}
				// 재앙
				if (name.equalsIgnoreCase("재앙" + ChatColor.YELLOW + " [Lv.343]")) {
					mobloot.mob139(lootPlayer);
				}
				// 타락한 모험가
				if (name.equalsIgnoreCase("타락한 모험가" + ChatColor.YELLOW + " [Lv.347]")) {
					mobloot.mob140(lootPlayer);
				}
				// 코낭그
				if (name.equalsIgnoreCase("코낭그" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob141(lootPlayer);
				}
				// 요정의 파편
				if (name.equalsIgnoreCase("요정의 파편" + ChatColor.YELLOW + " [Lv.338]")) {
					mobloot.mob142(lootPlayer);
				}
				// 초마도용기사
				if (name.equalsIgnoreCase("초마도용기사" + ChatColor.YELLOW + " [Lv.342]")) {
					mobloot.mob143(lootPlayer);
				}
				// 떠도는 망령 전사
				if (name.equalsIgnoreCase("떠도는 망령 전사" + ChatColor.YELLOW + " [Lv.344]")) {
					mobloot.mob144(lootPlayer);
				}
				// 떠도는 망령 마법사
				if (name.equalsIgnoreCase("떠도는 망령 마법사" + ChatColor.YELLOW + " [Lv.349]")) {
					mobloot.mob145(lootPlayer);
				}
				// 그리즐리 베어
				if (name.equalsIgnoreCase("그리즐리 베어" + ChatColor.YELLOW + " [Lv.347]")) {
					mobloot.mob146(lootPlayer);
				}
				// TNTZ
				if (name.equalsIgnoreCase("TNTZ" + ChatColor.YELLOW + " [Lv.351]")) {
					mob.getWorld().createExplosion(mob.getLocation(), 5, false, false);
					mobloot.mob147(lootPlayer);
				}
				// 포보르 세력 플레이어
				if (name.equalsIgnoreCase("포보르 세력 플레이어" + ChatColor.YELLOW + " [Lv.354]")) {
					mobloot.mob150(lootPlayer);
				}
				// 마법소녀
				if (name.equalsIgnoreCase("마법소녀" + ChatColor.YELLOW + " [Lv.357]")) {
					mobloot.mob151(lootPlayer);
				}
				// 파스칼
				if (name.equalsIgnoreCase("파스칼" + ChatColor.YELLOW + " [Lv.359]")) {
					mobloot.mob148(lootPlayer);
				}
				// 에밀
				if (name.equalsIgnoreCase("에밀" + ChatColor.YELLOW + " [Lv.363]")) {
					mobloot.mob149(lootPlayer);
				}
				// 진흙 요정
				if (name.equalsIgnoreCase("진흙 요정" + ChatColor.YELLOW + " [Lv.366]")) {
					mobloot.mob152(lootPlayer);
				}
				// 푸른 가오리
				if (name.equalsIgnoreCase("푸른 가오리" + ChatColor.YELLOW + " [Lv.380]")) {
					mobloot.mob153(lootPlayer);
				}
				// 아라크네의 하수인
				if (name.equalsIgnoreCase("아라크네의 하수인" + ChatColor.YELLOW + " [Lv.383]")) {
					mobloot.mob154(lootPlayer);
				}
				// 아라크네
				if (name.equalsIgnoreCase("아라크네" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob155(lootPlayer);
				}
				// 네오아쿠아 마돌
				if (name.equalsIgnoreCase("네오아쿠아 마돌" + ChatColor.YELLOW + " [Lv.365]")) {
					mobloot.mob156(lootPlayer);
				}
				// 라이트레이 마돌
				if (name.equalsIgnoreCase("라이트레이 마돌" + ChatColor.YELLOW + " [Lv.369]")) {
					mobloot.mob157(lootPlayer);
				}
				// 방황하는 요정
				if (name.equalsIgnoreCase("방황하는 요정" + ChatColor.YELLOW + " [Lv.372]")) {
					mobloot.mob158(lootPlayer);
				}
				// 방황하는 요정
				if (name.equalsIgnoreCase("방황하는 요정" + ChatColor.YELLOW + " [Lv.376]")) {
					mobloot.mob159(lootPlayer);
				}
				// 분노하는 요정
				if (name.equalsIgnoreCase("분노하는 요정" + ChatColor.YELLOW + " [Lv.379]")) {
					mobloot.mob160(lootPlayer);
				}
				// 분노하는 요정
				if (name.equalsIgnoreCase("분노하는 요정" + ChatColor.YELLOW + " [Lv.383]")) {
					mobloot.mob161(lootPlayer);
				}
				// 뒤틀린 요정
				if (name.equalsIgnoreCase("뒤틀린 요정" + ChatColor.YELLOW + " [Lv.384]")) {
					mobloot.mob162(lootPlayer);
				}
				// 뒤틀린 요정
				if (name.equalsIgnoreCase("뒤틀린 요정" + ChatColor.YELLOW + " [Lv.386]")) {
					mobloot.mob163(lootPlayer);
				}
				// 켄
				if (name.equalsIgnoreCase("켄" + ChatColor.YELLOW + " [Lv.390]")) {
					mobloot.mob164(lootPlayer);
				}
				// 류
				if (name.equalsIgnoreCase("류" + ChatColor.YELLOW + " [Lv.394]")) {
					mobloot.mob165(lootPlayer);
				}
				// 고우키
				if (name.equalsIgnoreCase("고우키" + ChatColor.YELLOW + " [Lv.397]")) {
					mobloot.mob166(lootPlayer);
				}
				// 범인
				if (name.equalsIgnoreCase("범인" + ChatColor.YELLOW + " [Lv.395]")) {
					mobloot.mob167(lootPlayer);
				}
				// 포도
				if (name.equalsIgnoreCase("포도" + ChatColor.YELLOW + " [Lv.399]")) {
					mobloot.mob168(lootPlayer);
				}
				// 클레어흐의 망령
				if (name.equalsIgnoreCase("클레어흐의 망령" + ChatColor.YELLOW + " [Lv.400]")) {
					mobloot.mob169(lootPlayer);
				}
				// 404 Not Found
				if (name.equalsIgnoreCase("404 Not Found" + ChatColor.YELLOW + " [Lv.404]")) {
					mobloot.mob170(lootPlayer);
				}
				// 타락한 주민
				if (name.equalsIgnoreCase("타락한 주민" + ChatColor.YELLOW + " [Lv.406]")) {
					mobloot.mob171(lootPlayer);
				}
				// 잠식된 주민
				if (name.equalsIgnoreCase("잠식된 주민" + ChatColor.YELLOW + " [Lv.409]")) {
					mobloot.mob172(lootPlayer);
				}
				// 카스파르
				if (name.equalsIgnoreCase("카스파르" + ChatColor.YELLOW + " [Lv.407]")) {
					mobloot.mob173(lootPlayer);
				}
				// 와일드
				if (name.equalsIgnoreCase("와일드" + ChatColor.YELLOW + " [Lv.413]")) {
					mobloot.mob174(lootPlayer);
				}
				// 자미엘
				if (name.equalsIgnoreCase("자미엘" + ChatColor.YELLOW + " [Lv.420]")) {
					mobloot.mob175(lootPlayer);
				}
				// 나무 벌레
				if (name.equalsIgnoreCase("나무 벌레" + ChatColor.YELLOW + " [Lv.410]")) {
					mobloot.mob176(lootPlayer);
				}
				// 산적
				if (name.equalsIgnoreCase("산적" + ChatColor.YELLOW + " [Lv.415]")) {
					mobloot.mob177(lootPlayer);
				}
				// 흑아
				if (name.equalsIgnoreCase("흑아" + ChatColor.YELLOW + " [Lv.417]")) {
					mobloot.mob178(lootPlayer);
				}
				// 자독
				if (name.equalsIgnoreCase("자독" + ChatColor.YELLOW + " [Lv.420]")) {
					mobloot.mob179(lootPlayer);
				}
				// 클레어흐의 광신도
				if (name.equalsIgnoreCase("클레어흐의 광신도" + ChatColor.YELLOW + " [Lv.414]")) {
					mobloot.mob180(lootPlayer);
				}
				// 클레어흐의 광신도
				if (name.equalsIgnoreCase("클레어흐의 광신도" + ChatColor.YELLOW + " [Lv.419]")) {
					mobloot.mob181(lootPlayer);
				}
				// 클레어흐의 광신도 간부
				if (name.equalsIgnoreCase("클레어흐의 광신도 간부" + ChatColor.YELLOW + " [Lv.423]")) {
					mobloot.mob182(lootPlayer); 
				}
				// 클레어흐의 포보르
				if (name.equalsIgnoreCase("클레어흐의 포보르" + ChatColor.YELLOW + " [Lv.427]")) {
					mobloot.mob183(lootPlayer);
				}
				// 파르홀론의 묘를 지키는 자
				if (name.equalsIgnoreCase("파르홀론의 묘를 지키는 자" + ChatColor.YELLOW + " [Lv.142]")) {
					mobloot.mob184(lootPlayer); 
				}
				// 약화된 아라크네
				if (name.equalsIgnoreCase("약화된 아라크네" + ChatColor.YELLOW + " [Lv.146]")) {
					mobloot.mob185(lootPlayer);
				}
				// 에임
				if (name.equalsIgnoreCase("에임" + ChatColor.YELLOW + " [Lv.426]")) {
					mobloot.mob186(lootPlayer); 
				}
				// HeYhO
				if (name.equalsIgnoreCase("HeYhO" + ChatColor.YELLOW + " [Lv.431]")) {
					mobloot.mob187(lootPlayer);
				}
				// 녹지 않는 뼈
				if (name.equalsIgnoreCase("녹지 않는 뼈" + ChatColor.YELLOW + " [Lv.434]")) {
					mobloot.mob188(lootPlayer); 
				}
				// 레드 블럭
				if (name.equalsIgnoreCase("레드 블럭" + ChatColor.YELLOW + " [Lv.438]")) {
					mobloot.mob189(lootPlayer);
				}
				// 사막 망령 전사
				if (name.equalsIgnoreCase("사막 망령 전사" + ChatColor.YELLOW + " [Lv.440]")) {
					mobloot.mob190(lootPlayer);
				}
				// Death Gun
				if (name.equalsIgnoreCase("Death Gun" + ChatColor.YELLOW + " [Lv.444]")) {
					mobloot.mob191(lootPlayer); 
				}
				// 공허
				if (name.equalsIgnoreCase("공허" + ChatColor.YELLOW + " [Lv.448]")) {
					mobloot.mob192(lootPlayer);
				}
				// 개조된 버서커 플레이어
				if (name.equalsIgnoreCase("개조된 버서커 플레이어" + ChatColor.YELLOW + " [Lv.450]")) {
					mobloot.mob193(lootPlayer);
				}
				// 개조된 아처 플레이어
				if (name.equalsIgnoreCase("개조된 아처 플레이어" + ChatColor.YELLOW + " [Lv.453]")) {
					mobloot.mob194(lootPlayer);
				}
				// 사막 노래기
				if (name.equalsIgnoreCase("사막 노래기" + ChatColor.YELLOW + " [Lv.455]")) {
					mobloot.mob195(lootPlayer);
				}
				// 사막 곰
				if (name.equalsIgnoreCase("사막 곰" + ChatColor.YELLOW + " [Lv.458]")) {
					mobloot.mob196(lootPlayer);
				}
				// 사막 전갈
				if (name.equalsIgnoreCase("사막 전갈" + ChatColor.YELLOW + " [Lv.465]")) {
					mobloot.mob197(lootPlayer);
				}
				// 쌍창 전사 석상
				if (name.equalsIgnoreCase("쌍창 전사 석상" + ChatColor.YELLOW + " [Lv.468]")) {
					mobloot.mob198(lootPlayer);
				}
				// 빛의 궁수 석상
				if (name.equalsIgnoreCase("빛의 궁수 석상" + ChatColor.YELLOW + " [Lv.471]")) {
					mobloot.mob199(lootPlayer);
				}
				// 쌍검 전사 석상
				if (name.equalsIgnoreCase("쌍검 전사 석상" + ChatColor.YELLOW + " [Lv.474]")) {
					mobloot.mob200(lootPlayer);
				}
				// 루 라바다의 석상
				if (name.equalsIgnoreCase("루 라바다의 석상" + ChatColor.YELLOW + " [Lv.475]")) {
					mobloot.mob201(lootPlayer);
				}
				// 누아다의 석상
				if (name.equalsIgnoreCase("누아다의 석상" + ChatColor.YELLOW + " [Lv.479]")) {
					mobloot.mob202(lootPlayer);
				}
				// 길을 잃은 검은 수염단
				if (name.equalsIgnoreCase("길을 잃은 검은 수염단" + ChatColor.YELLOW + " [Lv.459]")) {
					mobloot.mob203(lootPlayer);
				}
				// 길을 잃은 검은 수염단
				if (name.equalsIgnoreCase("길을 잃은 검은 수염단" + ChatColor.YELLOW + " [Lv.463]")) {
					mobloot.mob204(lootPlayer);
				}
				// 암석 전사
				if (name.equalsIgnoreCase("암석 전사" + ChatColor.YELLOW + " [Lv.463]")) {
					mobloot.mob205(lootPlayer);
				}
				// 암석 전사
				if (name.equalsIgnoreCase("암석 전사" + ChatColor.YELLOW + " [Lv.465]")) {
					mobloot.mob206(lootPlayer);
				}
				// 암석 전사
				if (name.equalsIgnoreCase("암석 전사" + ChatColor.YELLOW + " [Lv.470]")) {
					mobloot.mob207(lootPlayer);
				}
				// 스톤 가디언
				if (name.equalsIgnoreCase("스톤 가디언" + ChatColor.YELLOW + " [Lv.475]")) {
					mobloot.mob208(lootPlayer);
				}
				// 석상 파수꾼
				if (name.equalsIgnoreCase("석상 파수꾼" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob209(lootPlayer);
				}
				// 암석 거인의 파편
				if (name.equalsIgnoreCase("암석 거인의 파편" + ChatColor.YELLOW + " [Lv.480]")) {
					mobloot.mob210(mob, lootPlayer);
				}
				// 유황 골렘
				if (name.equalsIgnoreCase("유황 골렘" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob211(mob, lootPlayer);
				}
				// 레티아리우스
				if (name.equalsIgnoreCase("레티아리우스" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob212(lootPlayer);
				}
				// 갈리
				if (name.equalsIgnoreCase("갈리" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob213(lootPlayer);
				}
				// 디마카에루스
				if (name.equalsIgnoreCase("디마카에루스" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob214(lootPlayer);
				}
				// 프라에그나리
				if (name.equalsIgnoreCase("프라에그나리" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob215(lootPlayer);
				}
				// 고먐미
				if (name.equalsIgnoreCase("고먐미" + ChatColor.YELLOW + " [Lv.480]")) {
					mobloot.mob216(lootPlayer);
				}
				// 멈멈미
				if (name.equalsIgnoreCase("멈멈미" + ChatColor.YELLOW + " [Lv.483]")) {
					mobloot.mob217(lootPlayer);
				}
				// 펨뮌
				if (name.equalsIgnoreCase("펨뮌" + ChatColor.YELLOW + " [Lv.484]")) {
					mobloot.mob218(lootPlayer);
				}
				// 맴무새
				if (name.equalsIgnoreCase("맴무새" + ChatColor.YELLOW + " [Lv.488]")) {
					mobloot.mob219(lootPlayer);
				}
				// 먐
				if (name.equalsIgnoreCase("먐" + ChatColor.YELLOW + " [Lv.489]")) {
					mobloot.mob220(lootPlayer);
				}
				// 모짐머
				if (name.equalsIgnoreCase("모짐머" + ChatColor.YELLOW + " [Lv.493]")) {
					mobloot.mob221(lootPlayer);
				}
				// 뭔숨미
				if (name.equalsIgnoreCase("뭔숨미" + ChatColor.YELLOW + " [Lv.494]")) {
					mobloot.mob222(lootPlayer);
				}
				// 부멈미
				if (name.equalsIgnoreCase("부멈미" + ChatColor.YELLOW + " [Lv.497]")) {
					mobloot.mob223(lootPlayer);
				}
				// 포보르화 도마뱀
				if (name.equalsIgnoreCase("포보르화 도마뱀" + ChatColor.YELLOW + " [Lv.499]")) {
					mobloot.mob224(lootPlayer);
				}
				// 포보르화 복어
				if (name.equalsIgnoreCase("포보르화 복어" + ChatColor.YELLOW + " [Lv.503]")) {
					mobloot.mob225(lootPlayer);
				}
				// 되살아난 피르볼그의 제사장
				if (name.equalsIgnoreCase("되살아난 피르볼그의 제사장" + ChatColor.YELLOW + " [Lv.??]")) {
					mobloot.mob226(lootPlayer);
				}
				// 중장갑 포보르
				if (name.equalsIgnoreCase("중장갑 포보르" + ChatColor.YELLOW + " [Lv.505]")) {
					mobloot.mob227(lootPlayer);
				}
				// 포보르 사제
				if (name.equalsIgnoreCase("포보르 사제" + ChatColor.YELLOW + " [Lv.510]")) {
					mobloot.mob228(lootPlayer);
				}
				// 미아즈마단 신입
				if (name.equalsIgnoreCase("미아즈마단 신입" + ChatColor.YELLOW + " [Lv.500]")) {
					mobloot.mob229(lootPlayer);
				}
				// 섬을 좀먹는 벌레
				if (name.equalsIgnoreCase("섬을 좀먹는 벌레" + ChatColor.YELLOW + " [Lv.504]")) {
					mobloot.mob230(lootPlayer);
				}
				// 미아즈마단 단원
				if (name.equalsIgnoreCase("미아즈마단 단원" + ChatColor.YELLOW + " [Lv.505]")) {
					mobloot.mob231(lootPlayer);
				}
				// 정신이 나간 포로
				if (name.equalsIgnoreCase("정신이 나간 포로" + ChatColor.YELLOW + " [Lv.509]")) {
					mobloot.mob232(lootPlayer);
				}
				// 미아즈마단 보초병
				if (name.equalsIgnoreCase("미아즈마단 보초병" + ChatColor.YELLOW + " [Lv.510]")) {
					mobloot.mob233(lootPlayer);
				}
				// 미아즈마단 강화병
				if (name.equalsIgnoreCase("미아즈마단 강화병" + ChatColor.YELLOW + " [Lv.514]")) {
					mobloot.mob234(lootPlayer);
				}
				// 불타는 석탄
				if (name.equalsIgnoreCase("불타는 석탄" + ChatColor.YELLOW + " [Lv.515]")) {
					mobloot.mob235(lootPlayer);
				}
				// 녹아내리는 불꽃
				if (name.equalsIgnoreCase("녹아내리는 불꽃" + ChatColor.YELLOW + " [Lv.519]")) {
					mobloot.mob236(lootPlayer);
				}
				// 미아즈마단 이급 군인
				if (name.equalsIgnoreCase("미아즈마단 이급 군인" + ChatColor.YELLOW + " [Lv.520]")) {
					mobloot.mob237(lootPlayer);
				}
				// 미아즈마단 일급 군인
				if (name.equalsIgnoreCase("미아즈마단 일급 군인" + ChatColor.YELLOW + " [Lv.524]")) {
					mobloot.mob238(lootPlayer);
				}
				// 미아즈마단 간부
				if (name.equalsIgnoreCase("미아즈마단 간부" + ChatColor.YELLOW + " [Lv.525]")) {
					mobloot.mob239(lootPlayer);
				}
				// 미아즈마단 애완곰
				if (name.equalsIgnoreCase("미아즈마단 애완곰" + ChatColor.YELLOW + " [Lv.530]")) {
					mobloot.mob240(lootPlayer);
				}
			} catch (Exception e) {

			}
			
//================================================================================================================================

			try {
				mob.getVehicle().remove();
			} catch(Exception e) {
				
			}
			try {
				for(Entity ent : mob.getPassengers()) {
					ent.remove();
				}
			} catch(Exception e) {
				
			}
			
//================================================================================================================================
			int cnt = 0;
        	for(ItemStack item : lootPlayer.getInventory().getContents()) {
        		if(item == null) continue;
        		if(item.getType() == Material.EMERALD) {
        			cnt += item.getAmount();
        		}
        	}
        	lootPlayer.getInventory().remove(Material.EMERALD);
        	if(cnt/64 != 0) {
        		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, cnt/64);
        		ItemMeta im = item.getItemMeta();
        		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
        		item.setItemMeta(im);
        		lootPlayer.getInventory().addItem(item);
        	}
        	lootPlayer.getInventory().addItem(new ItemStack(Material.EMERALD, cnt%64));
        	
        	
        	int cnt2 = 0;
        	for(ItemStack item : lootPlayer.getInventory().getContents()) {
        		if(item == null) continue;
        		if(item.getType() == Material.EMERALD_BLOCK) {
        			cnt2 += item.getAmount();
        		}
        	}
        	lootPlayer.getInventory().remove(Material.EMERALD_BLOCK);
        	if(cnt2/64 != 0) {
        		ItemStack item = new ItemStack(Material.SCUTE, cnt2/64);
        		ItemMeta im = item.getItemMeta();
        		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
        		item.setItemMeta(im);
        		lootPlayer.getInventory().addItem(item);
        	}
        	ItemStack eme2 = new ItemStack(Material.EMERALD_BLOCK, cnt2%64);
    		ItemMeta emeIm2 = eme2.getItemMeta();
    		emeIm2.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
    		eme2.setItemMeta(emeIm2);
        	lootPlayer.getInventory().addItem(eme2);
        	
        	
        	int cnt3 = 0;
        	for(ItemStack item : lootPlayer.getInventory().getContents()) {
        		if(item == null) continue;
        		if(item.getType() == Material.SCUTE) {
        			cnt3 += item.getAmount();
        		}
        	}
        	lootPlayer.getInventory().remove(Material.SCUTE);
        	if(cnt3/64 != 0) {
        		ItemStack item = new ItemStack(Material.RABBIT_HIDE, cnt3/64);
        		ItemMeta im = item.getItemMeta();
        		im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
        		item.setItemMeta(im);
        		lootPlayer.getInventory().addItem(item);
        	}
        	ItemStack eme3 = new ItemStack(Material.SCUTE, cnt3%64);
    		ItemMeta emeIm3 = eme3.getItemMeta();
    		emeIm3.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
    		eme3.setItemMeta(emeIm3);
        	lootPlayer.getInventory().addItem(eme3);
        	
        	
        	int cnt4 = 0;
        	for(ItemStack item : lootPlayer.getInventory().getContents()) {
        		if(item == null) continue;
        		if(item.getType() == Material.RABBIT_HIDE) {
        			cnt4 += item.getAmount();
        		}
        	}
        	lootPlayer.getInventory().remove(Material.RABBIT_HIDE);
        	if(cnt4/64 != 0) {
        		ItemStack item = new ItemStack(Material.RABBIT_FOOT, cnt4/64);
        		ItemMeta im = item.getItemMeta();
        		im.setDisplayName(ChatColor.DARK_RED + "에메랄드 결정+");
        		item.setItemMeta(im);
        		lootPlayer.getInventory().addItem(item);
        	}
        	ItemStack eme4 = new ItemStack(Material.RABBIT_HIDE, cnt4%64);
    		ItemMeta emeIm4 = eme4.getItemMeta();
    		emeIm4.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
    		eme4.setItemMeta(emeIm4);
        	lootPlayer.getInventory().addItem(eme4);
			
		}
	}

}
