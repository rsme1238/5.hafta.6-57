
package pkg4.hafta.pkg8;

import java.util.Scanner;

public class Hafta8 {

    
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in); 
         
        System.out.println("Enter here a positive number= ");
        int s = input.nextInt();
        
        System.out.println("\na - b ");
        System.out.println("=====");
        
        for(int a=0; a<=s; a++){
   
            for(int b=0; b<=s; b++){
              if(a*a + b*b ==s){
               System.out.println(+a+"-"+b);
               }
        
        }
            }
      
        
        
    }
    
}
