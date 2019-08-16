public class overloading{


    public static void main(String[] args) {
        Student harold = new Student("Harold");
        Student c = new Student();
        harold.read("manga");
        c.read("something");
        
    }

    
}
public class Student{

    String studentName ;


    public Student(){
        this.studentName = "Student";

    }
    public Student(String studentName){
        this.studentName = studentName;
    }


    public  void  read(String s ){

          System.out.println( studentName + " is reading " + s);

    }

}