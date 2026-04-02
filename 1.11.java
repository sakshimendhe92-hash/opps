class Shape {
    void display() {
        System.out.println("General Shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle Area: " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle Area: " + (4 * 6));
    }
}

class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}
