public class Recursion {
    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * Factorial(n - 1); 
        }
    }
    
    public static void main(String[] args) {
        int number = 5;
        int result = Factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
