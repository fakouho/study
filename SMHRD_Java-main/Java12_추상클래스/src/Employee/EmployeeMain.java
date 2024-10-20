package Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		TempEmployee te = new TempEmployee("SMHRD001", "우유맛쿠키", 3000);
		RegularEmployee re = new RegularEmployee("SMHRD002", "들승현", 4000, 400);
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003", "김치리도조", 10, 20);

		System.out.println(te.print());
		System.out.println(re.print());
		System.out.println(pe.print());
		
		//업캐스팅(자동형변환)
		Employee e1 = te;
		Employee e2 = re;
		Employee e3 = pe;
		
		Employee[] emp_arr = new Employee[3];
		emp_arr[0] = te; // TempEmployee가 Employee 타입으로 자동형변환(업캐스팅) 된상태로 참조값이 할당
		emp_arr[1] = re;
		emp_arr[2] = pe;
		
		
		
		
		
	}

}
