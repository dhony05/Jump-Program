public class PlanetEarth{



    public static void main(String[] args) {
        
        human a = new human();
        a.Chage("Done");
        human a = new human("Roberto");
        a.Chage();


    }
    


}

public class human{

    String name  = "";

    public human(){
        this.human = "One human";
    }

    public human(String name){
        this.human = name;
    }

    public static void Chage(String name){
        System.out.println(name + " is making good changes in the planet");

    }
    public static void Chage(){
        System.out.println("Humans are not making any good changes to the planet");
    }


     
}