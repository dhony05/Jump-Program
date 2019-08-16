public class AccessModifiers {
    protected int moneyCheck = 800;
    public int rentBill = 1000;
    private int cellPhoneBill = 50;

    public static void main(String[] args) {
        paying();
        
    }
    public int getCellBill(){
        return this.cellPhoneBill;
        
    }
    public void setCellBill(int value){
        this.cellPhoneBill = value;

    }


}
public class whatEver extends AccessModifiers{
   
    public  void paying(int money){
        moneyCheck -= rentBill;
        int cel = setCellBill(50);
        moneyCheck -= getCellBill();
        if(moneyCheck<0){
            System.out.println("Now I have a debt");
        }else{
            System.out.println("I paid everything");
        }

        }

    }



    
