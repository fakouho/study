package 추상클래스계산기;

public class RegularEmployee extends Employee{
	
	private int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	public int getMoneyPay() {
		return (getPay() + bonus) / 12;
	}

}
