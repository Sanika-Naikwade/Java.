public class Shape {

    public double Area1(double r) {
        return 3.14 * r * r;
    }

    public int Area2(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Shape obj = new Shape();

      
        System.out.println("Area of Circle is: " + obj.Area1(5));
        System.out.println("Area of Rectangle is: " + obj.Area2(5, 4));
    }
}

