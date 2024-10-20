package Employee;

public class PartTimeEmployee extends Employee {

	int workDay;

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return pay * workDay;
	}

}
