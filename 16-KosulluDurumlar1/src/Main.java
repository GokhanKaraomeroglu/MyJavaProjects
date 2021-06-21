
import java.util.Scanner;


// Koşullu Durumlar
/* 
        if (koşul) {
            Koşul sağlanınca (true) bu blok çalışır.
        }
        
        else {
               Bu blogun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.
        }
        */
public class Main {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner (System.in);
      int a;
      System.out.print("Lütfen yaşınızı giriniz: ");
      int yas = scanner. nextInt();
      
        
      if (yas >= 18) {
        System.out.println("İçeri girebilirsiniz...");
        
    }
      else {
              System.out.println("İçeri giremezsiniz...");
              }  
        
        
    }
}
