package Animal;

//모든 동물들이 가지고 있어야하 하는 공통된 속성/기능 -> 추상적
public abstract class Animal {	
	//특성(필드) : 눈, 귀
	boolean eye;
	boolean ear;
	
	//기능(메서드) : 움직인다, 공격한다 -> 구체적인 기능은 작성 x, 선언만 ->추상메서드
	public abstract void move();
	public abstract void attack();

}
