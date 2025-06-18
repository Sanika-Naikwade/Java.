public class Paraobj {
    String name;
    int mark;

    Paraobj(String StudentName , int StudentMark){
    name = StudentName;
    mark = StudentMark;


    
}
      void display(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark);

}
public static void main(String[] args){
    Paraobj x=new Paraobj("David : ",92);
    Paraobj y=new Paraobj("Krish",95);

    x.display();
    System.out.println("----");
    y.display();
}
}