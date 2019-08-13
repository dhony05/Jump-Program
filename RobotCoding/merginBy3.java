public class merginBy3{

    public static void main(String[] args) {
        mergingString("Python");
        mergingString("Justin");

       // System.out.println("Python".substring("Python".length()-3));
    }


    public static String mergingString(String word){
        StringBuilder sb = new StringBuilder();
        if(word.length()>3){
            sb.append(word.substring(word.length()-3));
            sb.append(word);
            sb.append(word.substring(word.length()-3));

        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}