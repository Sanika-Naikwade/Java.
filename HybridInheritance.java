interface A {
    void method1();
}

class B{
    void method2(){
        System.out.println("This is method 2");
    }
}

class C extends B implements A{
   public void method1(){
        System.out.println("This is method from interface A");
    }
    void method3(){
        System.out.println("This is method 3");
    }

}

class D extends C{
    void method4(){
        System.out.println("This is method 4");
    }


}


public class HybridInheritance {
    public static void main(String[] args){
        D obj = new D();

        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
    
}
