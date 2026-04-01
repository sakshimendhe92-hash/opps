class BankingSystem {
    int balance = 1000;

    void withdraw(String user, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(user + " withdrew " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        Thread t1 = new Thread(() -> b.withdraw("User1", 700));
        Thread t2 = new Thread(() -> b.withdraw("User2", 500));

        t1.start();
        t2.start();
    }
}