package 추상클래스계산기;

public abstract class Employee {
    private String empno;
    private String name;
    private int pay;

    public Employee(String empno, String name, int pay) {
        this.empno = empno;
        this.name = name;
        this.pay = pay;
    }

    public abstract int getMoneyPay();

    public String print() {
        return empno + ":" + name + ":" + pay;
    }

    // Getter 메서드 추가
    public String getEmpno() {
        return empno;
    }

    public String getName() {
        return name;
    }

    public int getPay() {
        return pay;
    }
}
