package quiz08;

public class MainClass {

	public static void main(String[] args) {
		
		Producer producer = new Producer();
		
		Singer singer1 = new Singer("alice", 3);
		Singer singer2 = new Singer("emily", 5);
		
		producer.produce(singer1, new Song("", ""));
		producer.produce(singer1, new Song("", ""));
		producer.produce(singer1, new Song("", ""));
		// 여기에 한 줄 더 추가하면 " 더 이상 노래를 추가할 수 없습니다" 라고 나온다. 왜냐면 위에는 3곡이라고 해놨기때문에. 
		
		
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		producer.produce(singer2, new Song("", ""));
		
		singer1.info();
		singer2.info();
		
	}

}
