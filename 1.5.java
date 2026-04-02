class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    void haveData(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        calculate();
    }

    void calculate() {
        netpay = basic + hra + da;
    }

    void display() {
        System.out.println(empno + " " + ename + " NetPay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.haveData(1, "Riya", 10000, 2000, 1500);
        e.display();
    }
}
