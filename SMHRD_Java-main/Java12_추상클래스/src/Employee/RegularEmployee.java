package Employee;

public class RegularEmployee extends Employee {

	int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	public int getPay() {

		return (pay + bonus) / 12;
	}

}
