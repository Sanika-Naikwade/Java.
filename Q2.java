class Vehicle{
    void fun1(){
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle{
    void fun2(){
        System.out.println("This is a car.");
        System.out.println("--------------------");

    }
}

class Bike extends Vehicle{
    void fun3(){
        System.out.println("This is a bike.");
    }
}


public class Q2 {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.fun1();
        obj1.fun2();


        Bike obj2 = new Bike();
        obj2.fun1();
        obj2.fun3();

    }
    
}
