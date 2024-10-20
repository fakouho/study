package ArrayList;

import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		// 가변적인 배열과 같은 형태를 가지고 있는 클래스 ArrayList
		// Collection 책에서 읽어보기 390p
		
		// 1. ArrayList 생성하기	
		// ArrayList<저장할 데이터 자료형> + 변수명
		// Stringn s = new String";
		// int[] arr = {} -> new int[5]
		// ArrayList<> 객체 형태의 데이터만 저장 할 수 있다.
		// int , floast, double
		// <> : 제네릭 기법
		// :ArrayList를 생성하는 순간에 저장할 자료형을 결정하는 기범
				
		ArrayList<String> list = new ArrayList<String>();
		// 레퍼런스 변수 형태, 객체 형태만 저장할 수 있다. (기본 자료형 저장X)값
		
		// 2. 값 추가하기
		// 값을 추가하는 메서드가 내부적으로 설계가 되어있음
		// 데이터가 뒤로 들어값니다.
		list.add("연어회");
		list.add("잎새주");
		
		// 2-1 값 원하는 위치에 데이터를 추가하기		
		list.add("방어회");	
		list.add("조개구이");
		list.add(2, "부대찌개");
			
		// 3. 값 가져오기
//		list.get(1);
		System.out.println(list.get(1));
		
		// 4. 값 삭제하기
//		list.remove(0);
		
		// 5. 저장되어있는 데이터의 총 크기 가져오기
		System.out.println(list.size());
		
		//ArrayList에 들어있는 모든 데이터를 출력시켜주고
		// 결과창 보기		
		for(int i =0; i<list.size(); i++){
			System.out.println(list.get(i));	
		}		
		
		// 6. 모든 데이터 값을 한번에 삭제 하는 기능
		list.clear();
		// 데이터가 다 사라졌는지 크기로 확인 가능
		System.out.println(list.size());
	}

}
