package EPoketmon;

public class Pikachu implements EPoketmon{

	// EPoketmon 재정의 
	@Override
	public void attack() {
		System.out.println("피카츄 공격!");
		
	}

	@Override
	public void moving() {
		System.out.println("피카츄 이동!");
		
	}

}
