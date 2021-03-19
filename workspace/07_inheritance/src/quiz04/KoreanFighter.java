package quiz04;

public class KoreanFighter extends Fighter {


	// field -> 문제해결을 위한 field값은 fighter에 모두 정의되어 있는 상태라서 여기엔 필드값이 없다.
	
	// constructor   -> 반드시 있어야한다. Fight의 public Fighter(String name, int energy, int power)를 불러와야 하니까.
	public KoreanFighter(String name) {     // 슈퍼클래스 컨스트럭터를 불러왔는데 (필드가 없으니까) 근데 메인 클래스를 보면 다른점이 메인에서는 이름만 전달하고 있다.
																// 그래서 에너지와 파워는 전달 안해서 지워준다. 			
		super(name, (int)(Math.random() * 100) + 1, (int)(Math.random() * 10) + 1 );
	}                          // -> global Fighter에도 붙여넣기. 이름만 수정(Korean -> Global)
	
	
	// method	
	// attack() : 20% 확률로 한 방에 KO 시킬 수 있습니다.
	@Override
	public void attack(Fighter fighter) {   // **앞에 Fighter는 코리안 파이터, 글로벌 파이터, 둘 다 올 수 있으니까 Fighter 타입으로 해준다.
		// 나 : this                     -> 내 값을 바꿀때는 this 붙여서 바꾸기
		// 상대편 : fighter               -> 상대편 값을 바꿀때는 fighter로
		if (Math.random() < 0.2) { //20% 확률
			fighter.setEnergy(0);         // 상대편의 에너지를 20%의 확률로 제로로 떨어뜨려서 KO 시킬 수 있다.
			System.out.println(fighter.getName() + " KO!");
		} else {
			// 내 power만큼 상대편 energy가 줄어듭니다.
			fighter.setEnergy(fighter.getEnergy() - this.getPower());
			System.out.println("공격: " + this.getName() + "[" + fighter.getName() + " 남은 에너지: " + fighter.getEnergy() + "]");
		}
	}
	
}
