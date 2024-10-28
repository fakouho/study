package 추상클래스계산기;

public class TempEmployee extends Employee{
	
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}

	public int getMoneyPay() {
		return getPay() / 12;
	}

}
