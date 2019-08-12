public class AttributeClass {
    /**********************************
     * Attributes are varialbes within a class. They are public constant or public
     * variable that can be accessed directly.
     **********************************/
    int age;
    final int MY_AGE = 2019 - 1994;

    public static void main(String[] args) {
        AttributeClass someone = new AttributeClass();
        AttributeClass donelys = new AttributeClass();
        someone.age = 50;
        System.out.println("someone age is: " + someone.age + " years old.");
        System.out.println("Donelys age is: " + donelys.MY_AGE + " years old.");

        /*****************************
         * Here in comments I'm changing the attribute myAge to 12, this will return as
         * error because myAge is declared as final Variables declare final are
         * unmutable.
         *****************************/
        // donelys.myAge = 12;
        // System.out.println("Donelys age is: " + Donelys.myAge );
        String[] array = { "hola", "hello", "bonjour", "klk" };
        arrayLen(array);
    }

    /*******************************
     * Another Example for attributes .length Actualy I created this method on
     * purpose. An easy way to avoid this method is changing line 25 and just write
     * line 34 There I am using the .length Attribute to know my array length
     *******************************/
    public static int arrayLen(String[] array) {
        System.out.println("Array length is: " + array.length);
        return array.length;
    }
}