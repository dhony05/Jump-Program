public class Lamda{


    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5,6,7,8};

        even is =()->{
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]%2 ==0);
            }
            is.getEven(numbers);

        };


    }

    


}
interface even{

    public void getEven(int[] a);
}