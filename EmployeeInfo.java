    class Employee {
    int Id;
    String Name;
    double Salary;

    Employee(int i , String n , double s){
        Id = i;
        Name = n;
        Salary = s;
    }

    void display(){
        System.out.println("ID: " + Id);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("--------------------"); 
    }
}
    public class EmployeeInfo{
        public static void main(String[] args) {
        
        Employee emp1 = new Employee(501, "David", 50000);
        Employee emp2 = new Employee(502, "Rahul", 100000);
        Employee emp3 = new Employee(503, "Vijay", 75000);

        emp1.display();
        emp2.display();
        emp3.display();
        }
    }

