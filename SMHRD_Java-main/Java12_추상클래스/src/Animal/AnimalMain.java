package Animal;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		
		Lion lion = new Lion(); // 라이언 객체 생성
		Rabbit rabbit = new Rabbit(); // 토끼 객체 생성
		
		//추상클래스는 객체 생성 불가능
		//추상클래스의 기능 물려받아 사용하고 싶을때 또는
		//추상메서드를 무조건 재정의해야된다고 강제성 부여 할 때 사용
		//new Animal(); << 안됨
		
		lion.attack();
		rabbit.attack();
		
		Animal a1 = lion; // 업캐스팅: 서브(작) -> 슈퍼(큰) => 자동형변환
		Animal a2 = new Lion();
		Animal a3 = rabbit;
		
		ArrayList<Animal> al = new ArrayList<Animal>();
		al.add(a1);
		al.add(new Lion());
		al.add(a3);
		
		for(Animal a:al) {
			a.move();
		}
		
		//업캐스팅이 된 경우에는 모든 멤버에 접근할 수 없음
		//슈퍼클래스의 맴버에만 접근가능
		//단, 서브클래스에서 오버라이딩 한 경우에는 서브클래스 메서드 호출
		//a1.sleep();
		//업캐스팅된 객체를 원래상태로 돌려주는것 -> 다운캐스팅(명시적형변환)
		Lion l  = (Lion)a1;
		l.sleep();
		

	}

}
