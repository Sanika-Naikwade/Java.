    class Encapsulation {

    private String name;
    private String grade;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGrade(){
        return grade;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }

    
}
public class Student{
    public static void main(String[] args) {
        Encapsulation x = new Encapsulation();

        x.setName("Rahul");
        x.setGrade("A+");

        System.out.println("Student Name: " + x.getName());
        System.out.println("Student Grade: " + x.getGrade());
    }
}
