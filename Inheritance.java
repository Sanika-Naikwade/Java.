class Hello {
    void mam() {
        System.out.println("Hello ma'am");
    }
}

class Display extends Hello {
    void me() {
        System.out.println("I am Sanika");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Display x = new Display(); 
        x.mam();    
        x.me();  
    }
}

