package EPoketmon;

public class Main {

	public static void main(String[] args) {
		// 객체 생성
		
		//EPoketmon e = new Epoketmon(); -> 인터페이스는 객체 생성 불가능 
		
		Pikachu p = new Pikachu();
		Coil c = new Coil();
		
		EPoketmon e1 = p; // 업캐스팅(자동형변환)
		EPoketmon e2 = c; // 업캐스팅
		
		EPoketmon[] e_arr = new EPoketmon[2];
		
		e_arr[0] = p; // 피카츄 -> 전기포켓몬으로 업캐스팅(자동형변환)
		e_arr[1] = c;
		
		
		
		
	}

}
