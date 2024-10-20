package 변수;

public class Ex02자료형 {
	
	//ctrl+space: 자동완성 단축키
	public static void main(String[] args) {
		
		//자료형
		//1. primitive type(기본타입) : 자바언어에 내장된 기본유형
		//1-1. 논리형(boolean) - yes/no, true/false, on/off, 1/0 (switch)
		boolean sw = true; // false
		
		//1-2. 문자형(문자 하나를 표현) - 문자, 유니코드, 아스키코드 표현 가능 
		char c = '나';
		System.out.println(c);
		char c1 = 97;
		System.out.println(c1);
		char c2 = '\uAC00';
		System.out.println(c2);
		
		//1-3. 정수형(byte, short, int(기본), long)
		byte n1 = 1;
		short n2 = 2;
		int n3 = 3;
		
		long n4 = 4;
		
		//1-4. 실수형(float, double(기본))
		float n5 = 10.123f;
		float n6 = (float)10.123;
		double n7 = 10.123;
		
		//타입변환(형변환)
		float n8 = 1.23f; //강제형변환
		//실수형은 기본타입이 double(8byte)
		//->float 담기 위해서는(4byte) 강제적으로 형변환 시켜줘야함
		//why? 데이터의 손실이 일어날 수 있기 때문에 자동으로 형 변환 시켜주지 않음
		double n9 = n8; // 자동형변환(크기가 작은 값을 더 큰 타입으로 변환할 때)		
		
		//2. reference type : 기본타입 외에 모든 타입
		// ex) String : 문자열 (기본 제공x)
		String s = "Hello World!";
		
		System.out.println(s.substring(0,5));
		System.out.println(s+123);
		
		
		//
	}

}
