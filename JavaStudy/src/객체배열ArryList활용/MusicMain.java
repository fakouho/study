package 객체배열ArryList활용;

import java.util.ArrayList;

public class MusicMain {
    public static void main(String[] args) {
        ArrayList<Music> list = new ArrayList<>();

        list.add(new Music("감자","우석",100,"금주"));
        list.add(new Music("사과","우석",100,"금주"));
        list.add(new Music("곰자","우석",100,"금주"));

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i).getTitle());
            System.out.println(list.get(i).getSinger());
            System.out.println(list.get(i).getPlayTime());
            System.out.println(list.get(i).getPath());

        }
    }
}
