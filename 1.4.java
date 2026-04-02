class Resort {
    int rno, days;
    String name;
    float charges;

    void getInfo(int r, String n, float c, int d) {
        rno = r;
        name = n;
        charges = c;
        days = d;
    }

    float compute() {
        float amt = days * charges;
        if (amt > 11000)
            amt = amt * 1.02f;
        return amt;
    }

    void display() {
        System.out.println(rno + " " + name + " Amount: " + compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.getInfo(1, "Sakshi", 2000, 6);
        r.display();
    }
}