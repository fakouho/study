package Toy;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachine {
	
	//필드 : arraylist, random
	//메서드 : 장난감 추가, 랜덤 뽑기
	
	ArrayList<Toy> al = new ArrayList<Toy>();
	Random rd = new Random();
	
	public void addToy(Toy toy) {
		al.add(toy); // 생성된 머신 인스턴스의 al 필드에 장난감 추가
	}
	
	public Toy getToy() {
		//0~2 인덱스 중 랜덤으로 하나 뽑음
		// int ran = rd.nextInt(al.size());
		// return al.get(ran); 
		
		return al.get(rd.nextInt(al.size()));
	}

}
