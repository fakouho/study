package 객체배열;

public class Pokemon {
    private String name;
    private int hp;
    private int atk;
    private String skill; // 변수명을 소문자로 수정

    // getter로 private로 은닉된 정보를 가져옴
    // setter로 getter로 불러온 정보를 재정의함
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 생성자
    public Pokemon(String name, int hp, String skill, int atk ){
        this.name = name;
        this.hp = hp;
        this.skill = skill; //
        this.atk = atk;
    }
}
