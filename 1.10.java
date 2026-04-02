interface Bank {
    float getInterestRate();
}

class SBI implements Bank {
    public float getInterestRate() { return 6.5f; }
}

class HDFC implements Bank {
    public float getInterestRate() { return 7.0f; }
}

class ICICI implements Bank {
    public float getInterestRate() { return 7.5f; }
}

class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("HDFC: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("ICICI: " + b.getInterestRate());
    }
}