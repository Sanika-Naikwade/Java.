public class MethodOverloading {

    public int add(int a, int b){
        return a + b;

    }

    public int sub(int a, int b){
        return a-b;
    }

    public int multi(int a, int b){
        return a * b;
    }

    public static void main(String[] args){
        MethodOverloading x = new MethodOverloading();

        x.add(10,20);
        x.sub(100 , 50);
        x.multi( 10, 5);


    System.out.println("Addition of two integers: " + x.add(10, 20));
    System.out.println("Addition of three integers: " + x.sub(100,50));
    System.out.println("Addition of two doubles: " + x.multi(10,5));

    }

    
}
