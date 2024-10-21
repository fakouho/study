package OOP기초공부;

import java.util.Scanner;

public class PersonMian {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner sc = new Scanner(System.in);

        System.out.printf("이름을 입력 하세요 = ");
        person.name=sc.next();
        System.out.printf("나이을 입력 하세요 = ");
        person.age= sc.nextInt();
        System.out.printf("성별을 입력 하세요 = ");
        person.gender=sc.next();

        System.out.println(person.name+"\n"+person.gender+"\n"+person.age);
        System.out.printf("나는 고기를 ");
        person.eat();
        

    }

            
            
}
