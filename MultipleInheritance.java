interface One {
    public void hello(); 
}

interface Two {
    public void city(); 
}

class MultipleInheritance implements One, Two {
    public void hello() {
        System.out.println("Hello everyone, I am Sanika");
    }

    public void city() {
        System.out.println("I am from Kolhapur");
    }

    public static void main(String[] args) {
        MultipleInheritance x = new MultipleInheritance();
        x.hello();
        x.city();
    }
}
