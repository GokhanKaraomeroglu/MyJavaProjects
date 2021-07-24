
import java.util.Scanner;

// Parametreli Metodlar
  

public class Main {
    public static void selamlama(String isim){
    
        System.out.println("Selam " + isim);    
   }
    public static void toplama(int a, int b, int c){
        
        System.out.println("Toplamları = " + (a + b + c));
        
    }
    public static void carpma (int a, int b){
        
        System.out.println("Çarpımları = " + (a * b));
        
    }
    public static void main(String[] args) {
        
       
        selamlama("Hakan");
        System.out.println("***************");
        toplama(3, 3, 6);
        System.out.println("***************");
        carpma(765, 879);
        
    }
}
