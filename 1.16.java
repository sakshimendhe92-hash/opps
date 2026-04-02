class Staff {
    void work() {
        System.out.println("General Staff Work");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Treating patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Assisting doctor");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Handling appointments");
    }
}

class TestStaff {
    public static void main(String[] args) {
        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Receptionist();
        s.work();
    }
}
