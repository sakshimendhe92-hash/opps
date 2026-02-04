
class MyProgramCube {
    public static void main(String[] args) {

        float area;
        Cube c1 = new Cube();

        area = c1.calArea(10, 10, 10);
        System.out.println("area = " + area);
    }
}

class Cube {
    float height;
    float width;
    float depth;

    float calArea(float h, float w, float d) {
        height = h;
        width = w;
        depth = d;

        return height * width * depth;
    }
}

