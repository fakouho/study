package 객체배열;

import java.util.ArrayList;

public class 객체배열기초 {
    public static void main(String[] args) {
        ArrayList<Pokemon> bag = new ArrayList<>();
//        Pokemon[] bag2 = new Pokemon[3];
//        bag2[0] = new Pokemon("망나뇽",20,"꼬리치기",20);
//        bag2[1] = new Pokemon("파이리",20,"꼬리치기",20);
//        bag2[2] = new Pokemon("고릴라",20,"꼬리치기",20);
        bag.add(new Pokemon("망나뇽", 20, "꼬리치기", 20));
        bag.add(new Pokemon("파이리", 20, "꼬리치기", 20));
        bag.add(new Pokemon("고릴라", 20, "꼬리치기", 20));

        for (int i = 0; i <bag.size(); i++) {
            System.out.println(bag.get(i).getName()+bag.get(i).getHp()+bag.get(i).getSkill());
        }



    }
}
