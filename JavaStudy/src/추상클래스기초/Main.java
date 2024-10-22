package 추상클래스기초;

public class Main {
    public static void main(String[] args) {
        Chip a = new Achip();
        Chip b = new Bchip();

        a.gameStart();


    }
    private  static void insert(Chip game){
        game.gameStart();
    }
}
