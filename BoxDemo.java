// Example 3
// Create class template

class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo {
    public static void main(String[] args) {

        // create object of class Box
        Box myBox = new Box();

        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // compute volume of box
        vol = myBox.width * myBox.height * myBox.depth;

        System.out.println("Volume is " + vol);
    }
}