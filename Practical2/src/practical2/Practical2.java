import java.util.Scanner;

public class Practical2 {
    
     public static void main (String[] args) {
  
        double num = 0.0;
        int sum2 = 0;
       
    	Scanner scan = new Scanner(System.in);
        
        System.out.println("Number SquareRoot");
        
        for(int i=0; i<=20;i+=2){
        
        num =Math.sqrt(i);
       
     
        System.out.println( i + num  );
        
        
        }
        
}
}