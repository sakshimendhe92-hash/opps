abstract class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    abstract double calculateBonus(double salary);
}

class Manager extends Employee {
    Manager(String n, int i) {
        super(n, i);
    }

    double calculateBonus(double salary) {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String n, int i) {
        super(n, i);
    }

    double calculateBonus(double salary) {
        return salary * 0.10 + 2000;
    }
}

class TestEmp {
    public static void main(String[] args) {
        Employee e;

        e = new Manager("Asha", 1);
        System.out.println("Manager Bonus: " + e.calculateBonus(50000));

        e = new Developer("Riya", 2);
        System.out.println("Developer Bonus: " + e.calculateBonus(50000));
    }
}