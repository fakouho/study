package MVC기초;

public class Main {
    public static void main(String[] args) {
        Child ch = new Child();
        Parson ps = new Parson();
        Parson ps2 = new Child();

        ch.maketang();
        ch.makejang();

        ps2.makejang();

    }
}
