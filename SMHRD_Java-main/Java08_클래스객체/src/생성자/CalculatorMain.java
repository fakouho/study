package »ý¼ºÀÚ;

public class CalculatorMain {

	public static void main(String[] args) {
	
		
		Calculator cal = new Calculator(10, 3);
		
		System.out.println(cal.sum());
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.div());
		
		
		
		
		cal.setNum1(75);
		cal.setNum2(5);
		
		System.out.println(cal.sum());
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.div());

	}

}
