package quiz07;

public class Game {

	// field
	private Player[] players;
	// private Player[] player = new Player[playerCount];
	// private Player[] players = new Player[2]; 위에처럼 이게 완성본인데 필드에 이렇게 해줄 순 없고 분리를 해줘야 한다. 왜냐면 몇명이 올지 모르는데 2명으로 잡아놓고 시작하면 안됨.
	
	// constructor
	public Game(int playerCount) {
		players = new Player[playerCount];  // 선언과 배열의 생성을 분리한다.
	}
	
	// method
	public void setPlayers() {
		String[] names = { "alice", "david", "brown", "emily", "james" };   // 플레이어 이름만 정해주면 된다.Scanner에서 이름을 받아서 셋팅을 해도 되고, 이렇게 정해놓고 해도 되고. 방식은 마음대로.
		for (int i = 0; i < players.length; i++) {
			// players[i].setName(name);  -> 이건 Player의 생성자가 없을 때 쓸 수 있음.
			players[i] = new Player(names[(int)(Math.random() * names.length)]);   // 중복은 무시한다. 똑같은 플레이어가 2명 생길 수 있음. 
		}
	}
	public void play() {
		// Player들의 play() 결과를 저장할 int[] times
		int[] times = new int[players.length];    // -> 한가지값만 올 수 있다. 플레이어들의 길이.
		for (int i = 0; i < players.length; i++) {
			times[i] = players[i].play();
		}
		// times 배열에서 10과 가장 가까운 값 찾기 
		// (times[i] - 10)의 절대값을 구한 뒤 그 중 가장 작은 값(최소값)을 구합니다. => 최소값 알고리즘 
		// 절대값 : Math.abs(n)   : n의 절대값. absolute number.
		
		int min = Math.abs(times[0] - 10);   // 첫 번째 요소를 초기화 값으로 사용합니다. 
		int winnerNo = 0;
		for (int i = 1; i < times.length; i++) {   // index i값을 1로 셋팅한다.
			if (min > Math.abs(times[i] - 10)); {   // 최소값을 구하는 대상
				min = Math.abs(times[i] - 10);  
				winnerNo = i;
			}
		}
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].getName() +  "'s result: " + times[i] + "second");
		}
		System.out.println(players[winnerNo].getName() + "'s victory!");
	}
	
}
