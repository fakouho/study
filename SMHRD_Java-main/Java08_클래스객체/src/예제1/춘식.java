package 예제1;

public class 춘식 {
//춘식이 캐릭터 설계
// 속성(field),행동(method)
	// 1. 속성(field) : 이름 레벨 공격력 방어력
	String name; // 이름이 있어야돼
	int level;
	int power;
	
	//생성자 : new 키워드 사용해서 객체를 생성할 때만 호출 되는 메서드
	//접근제한자 클래스이름(){} - 생성자 구조
	//기본생성자 : 매개변수 X, 기능 x
	//개발자가 다른 생성자를 정의하지 않으면 컴파일러 자동으로 생성해줌
	public 춘식() {
		
	}
	
	public 춘식(String name, int level, int power) {
		 this.name = name;
		 this.level = level;
		 this.power = power;
	}
	
	
	
	//2. 행동(method) : 공격한다, 걷는다
	public void attack() {
		System.out.println("공격!");
	}
	
	public void walk() {
		System.out.println("걷는다!");
	}

}
