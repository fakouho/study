public class Java메소드 {
    public static void main(String[] args) {
        System.out.println(addNum(5,2));
        System.out.println(min(5,2));
        hello();
    }
    public static int addNum(int a, int b){
        return a+b;
    }
    public static int min(int a, int b){
        return a-b;
    }
    public static void hello(){
        System.out.println("Hello");
    }

}
