class Restaurant {
    boolean available = false;

    synchronized void produce() throws Exception {
        if (available) wait();
        System.out.println("Chef prepared food");
        available = true;
        notify();
    }

    synchronized void consume() throws Exception {
        if (!available) wait();
        System.out.println("Waiter served food");
        available = false;
        notify();
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> {
            try {
                r.produce();
            } catch (Exception e) {}
        });

        Thread waiter = new Thread(() -> {
            try {
                r.consume();
            } catch (Exception e) {}
        });

        chef.start();
        waiter.start();
    }
}
