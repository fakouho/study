package 배열;

public class 배열 {

	public static void main(String[] args) {
		
//		동일한 자료형의 데이터들이 순차적으로 저장
//		> 반복문을 이용하여 처리하기에 적합한 자료 구조
//		인덱스에 대응하는 데이터들로 이루어진 구조
//		> 한 번에 많은 메모리 공간 선언 가능 
//		인덱스는 0부터 시작
		
//		1. 배열의 생성
//		new int[5];
//		new 자료형[배열의크기]
//		new Scanner
//		new Random
//		객체생성 도구생성
		
//		2. 배열 레퍼런스 변수 선언
//		int[] arr = new int[5]
//		자료형[] 변수이름
		
//		※ 배열 선언 및 생성 시 주의사항
//		- 레퍼런스 변수 선언 시 배열의 크기를 지정할 수 없다.
//		- 반드시 배열이 생성된 후 접근할 수 있다.
//		- 각 원소에 접근시 []사이에 인덱스를 적어 접근한다 
//		   ex) int[]arr=new int[3];
//		   System.out.println(arr[1]);
// 		- 배열의 인덱스는 0부터
//      - int[] arr = new int[3];

//		- arr[0] = 13;  
//		- arr[1] = 20;
//		- 배열 생성시 값을 알고 있는 경우 
//		   int[]arr = {4,5,5,7,10}; 
//		   float[]arr2 = {0.4f, 0.22f};
		
//		int[] intArray = new int[5];
//		int[] myArray = intArray;
//		
//		intArray[1] = 2;
//		int[]Array = 2; <- 이것도 가능
//		System.out.println(intArray[1]);
//		myArray[1] = 6;
//		System.out.println(intArray[1]);  => 2와 6출력
		
//		- 배열의 크기
//		* 레퍼런스 변수 선언 시 결정되지 않음
//		* 배열 생성 시 결정되며 바꿀 수 없음
//		* 배열의 length라는 필드(속성)에 저장 ~~~.length -> 배열의 크기 확인 

	}

}
