package Employee;

public class TempEmployee extends Employee {

	public TempEmployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	@Override
	public int getPay() {
		return pay / 12;
	}

}
