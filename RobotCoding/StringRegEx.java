public class StringRegEx{


    public static void main(String[] args) {
        String a = "ACGGGATTATGTAGCCCCTCGAUAGCCGCCCUCGAG";
        Replace(a);
        
    }


    public static void Replace(String s){  
          String newS =  s.replaceFirst("ATG","MET");
          System.out.println(newS);
          int sN = s.indexOf("ATG");
          System.out.println(sN +"," +(sN+1)+","+ (sN+2));
         



    }

}