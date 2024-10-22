package OOPPokemon;

import java.util.Scanner;

public class PokemonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokemon pok1 = new Pokemon("리자몽",100,"몸통박치기",87);
        Pokemon pok2 = new Pokemon("망나뇽",100,"꼬리치기",67);

        while (true){
            System.out.printf("포켓몬을 선택하세요>>");
            System.out.println("[1]리자몽, [2]망나뇽");
            int check = sc.nextInt();

            if (check==1){
                pok2.setHp((int)pok2.getHp()-pok1.getAtk());
                if (pok2.getHp() <= 0){
                    System.out.println(pok1.getName()+"이 승리하였습니다.");
                    break;
                }else{
                    System.out.println(pok2.getName()+"의 현재 hp는 "+pok2.getHp()+"입니다.");
                }
            } else if (check<=2) {
                pok1.setHp((int)pok1.getHp()-pok2.getAtk());
                if (pok1.getHp()==0){
                    System.out.println(pok2.getName()+"이 승리하였습니다.");
                    break;
                }else {
                    System.out.println(pok1.getName()+"의 현재 hp는 "+pok1.getHp()+"입니다.");
                }
            } else {
                System.out.println("번호를 잘못 누르셧습니다.");
            }
        }


    }
}
