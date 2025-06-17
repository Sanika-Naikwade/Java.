public class MathFunction {
    public static void main(String[] args) {
        int n = 16;

        
        double sqrt = Math.sqrt(n);
        System.out.println("Square root of " + n + " is " + sqrt);

     
        double power = Math.pow(n, 4);
        System.out.println(n + " raised to the power 4 is " + power);

        
        double radians = Math.toRadians(90);
        double sine = Math.sin(radians);
        System.out.println("Sine of 90 degrees is " + sine);

        
     
        double max = Math.max(40, 25);
        System.out.println("Maximum of 40 and 25 is " + max);
    }
}
