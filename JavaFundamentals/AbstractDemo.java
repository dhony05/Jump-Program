/* 
Here a abstract class called human is created, this class have an abstract method called Action,
 another method called "age" which receive a parameter type int and return another type int 
 another "clothing" method which receive a parameter type String and return a String

*/
abstract class human {
    public abstract void Action();

    String studentName;
    int actualYear = 2019;

    public int age(int yearOfBorn) {
        System.out.println(studentName + " is " + (actualYear - yearOfBorn) + " years old");
        return actualYear - yearOfBorn;
    }

    public String clothing(String Day) {
        String result = "";
        if ((Day.equals("Monday") || Day.equals("Tuesday") || Day.equals("Wednesday") || Day.equals("Thursday"))) {
            result = studentName + " is wearing button shirt";
        } else if (Day.equals("Friday")) {
            result = studentName + " is wearing T-shirt";
        } else {
            result = studentName + " is on weekend mood";
        }
        System.out.println(result);
        return result;
    }
}

/*
 * Here we create and interface with two abstract methods. this methods doesnt
 * have any behavior
 */
interface Human_Behavior {
    public abstract void happy();

    public abstract void Dance(String what);
}

/*
 * Here, class Student is created and it implements Human_Behavior interface
 * "Action" method is getting behavior as well as "happy" and "Dance" method,
 * aslo contructor is created which receive a parameter type String and set the
 * value of studentName attribute from human abstract class
 * 
 */
class Student extends human implements Human_Behavior {
    int yearOfBorn;

    @Override
    public void Action() {
        System.out.println(studentName + " is Coding");
    }

    // Create a constructor
    public Student(String studentName) {
        this.studentName = studentName;
    }

    // The method MUst be called in this class
    @Override
    public void happy() {
        System.out.println(studentName + " is feeling happy.");
    }

    @Override
    public void Dance(String what) {
        System.out.println(studentName + " is dancing " + what);

    }
}
/*
 * Here we instaciated a object called "donelys" from class student with the
 * argument of "Donelys" with this object we are calling the other methods
 */

public class AbstractDemo { // HumanBehavior
    public static void main(String[] args) {

        Student donelys = new Student("Donelys");
        donelys.Action();
        donelys.age(1994);
        donelys.clothing("Friday");
        donelys.happy();
        donelys.Dance("Bachata");

    }

}