public class cloneChallenge implements Cloneable{

    int fox = 9;
    String  tails = "nine";


    public cloneChallenge (int fox, String tails){
        this.fox = fox;
        this.tails = tails;
    }
    




    public static void main(String[] args) {
        cloneChallenge toClone = new cloneChallenge(9, "nine");
        cloneChallenge toClone2 = toClone.clone();

        System.out.println(toClone);
        System.out.println(toClone2);

    }
}