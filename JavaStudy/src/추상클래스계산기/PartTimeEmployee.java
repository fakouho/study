package 추상클래스계산기;
public class PartTimeEmployee extends Employee {
    public int workDay;

    public PartTimeEmployee(String empno, String name, int pay, int workDay) {
        super(empno, name, pay);
        this.workDay = workDay;
    }

    @Override
    public int getMoneyPay() {
        return getPay() * workDay; // getPay()를 사용하여 급여를 조회
    }
}
