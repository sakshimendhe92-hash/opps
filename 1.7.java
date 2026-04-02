abstract class Shape {
    abstract void calculateArea();

    void displayInfo() {
        System.out.println("Shape Info");
    }
}

class Circle extends Shape {
    void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * 5 * 5));
    }
}

class Rectangle1 extends Shape {
    void calculateArea() {
        System.out.println("Rectangle Area: " + (4 * 6));
    }
}

class Test {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.calculateArea();
        s.displayInfo();

        s = new Rectangle1();
        s.calculateArea();
    }
}
