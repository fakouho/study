package MVC기초;

public class Child extends Parson {
    int num = 20;
    @Override
    public void maketang(){
        System.out.println("아이탕수육");
    }
    @Override
    public void makejang(){
        System.out.println("아이자장면");
    }

    public void makeb(){
        System.out.println("볶음밥 맛있다.");
    }
}
