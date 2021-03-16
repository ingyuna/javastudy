package quiz07;

public class MainClass {

	public static void main(String[] args) {
		
		Game game = new Game(2);  // player가 2명
		game.setPlayers();  // player 세팅
		game.play();   // game 시작
		
		// 게임은 2명이서 각 각 엔터를 누르고 그 다음 엔터를 누르기까지 누가 더 10초에 가깝게 걸렸나 하는 게임. 
		
		
	}

}
