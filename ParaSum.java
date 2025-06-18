public class ParaSum {
    int x;
    int y;
    int sum;

    ParaSum(int a , int b){
       x=a;
       y=b;
       sum= a+b;

    }

    void Sum(){
        System.out.println("Sum of two numbers is : " + sum);
    }

    public static void main(String[] args) {
        ParaSum obj = new ParaSum(10, 25);

        obj.Sum();
        
    }
    
}
