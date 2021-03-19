package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Fighter fighter1 = new KoreanFighter("정찬성");    // 에너지, 공격력은 랜덤 생성 
		Fighter fighter2 = new GlobalFighter("에드가");
		// * 시작할때 얼마의 에너지로 시작하는지 초기화 상태를 설정하면 더 좋다. 지금은 랜덤. 
		
		fighter1.info();    // 시작 초기화 값 보여주고 시작. 
		fighter2.info();
		
		System.out.println("FIGHT START!");
		
		// 선빵 결정
		boolean myTurn = Math.random() < 0.5;
		
		do {
			if (myTurn) {
				fighter1.attack(fighter2);   // fighter1의 공격           // 인수를 전달받는 사람이(fighter2)가 공격받는사람 = 파이터1이 파이터2를 공격함. 
				myTurn = false;    // 서로 한대씩 날릴 수 있도록. 
			} else {
				fighter2.attack(fighter1);  // fighter2의 공격
				myTurn = true;
			}
			                          // (fighter2) -> 글로벌 파이터   (fighter1) -> 코리안파이터
			
		} while (fighter1.isAlive() && fighter2.isAlive());       // = > (fighter1과 fighter2가 모두 살아있으면)
		                             							// * boolean 타입은 get이 아니라 is로 쓰기로 규약되어 있다. 
		System.out.println("FIGHT OVER!");
		
		if (fighter1.isAlive()) {
			System.out.println(fighter1.getName() + " VICTORY! 남은 에너지: " + fighter1.getEnergy());
		} else {
			System.out.println(fighter2.getName() + " VICTORY! 남은 에너지: " + fighter2.getEnergy());
		}
	}

}
