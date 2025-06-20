class One {
    void method(){
        System.out.println("MIT AOE");
    }
}

class Two extends One {
    void method(){
        System.out.println("Alandi");
    }
}

class Three extends Two {
    void method(){
        System.out.println("Pune");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        One x = new Two();
        One y = new Three();

        x.method();
        y.method();

    }
    
}
