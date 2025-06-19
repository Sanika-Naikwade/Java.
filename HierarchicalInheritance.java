class one {
    void method1() {
        System.out.println("This is method 1");
    }
}

class two extends one {
    void method2() {
        System.out.println("This is method 2");
        System.out.println("--------------------");
    }
}

class three extends one {
    void method3() {
        System.out.println("This is method 3");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        two x = new two();
        x.method1();
        x.method2();

        three y = new three();
        y.method1();
        y.method3();
    }
}
