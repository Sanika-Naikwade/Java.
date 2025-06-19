class one{
    void mit(){
        System.out.println("MIT AOE");
    }
}

class two extends one{
    void location(){
        System.out.println("Alandi");
    }
}

class three extends two{
    void city(){
        System.out.println("Pune");
    }
}


public class multilevelInheritance {
    public static void main(String[] args){
        three x = new three();
        x.mit();
        x.location();
        x.city();
    }
    
}
