
import java.util.Scanner;


// Maksimum olan sayıyı bulma

public class Main {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Lütfen birinci sayıyı giriniz: ");
      int sayi1 = scanner. nextInt();
      System.out.print("Lütfen ikinci sayıyı giriniz: ");
      int sayi2 = scanner. nextInt();
      System.out.print("Lütfen üçüncü sayıyı giriniz: ");
      int sayi3 = scanner. nextInt();
        
      if ((sayi1 >=sayi2) && (sayi1 >= sayi3)) {
          // System.out.println("Sayı 1 en büyük sayıdır...");
          System.out.println("Girdiğiniz en büyük sayı " + sayi1 + "'dir.");
      }
          else if ((sayi2 >= sayi1) && (sayi2 >= sayi3)){
          // System.out.println("Sayı 2 en büyük sayıdır...");
          System.out.println("Girdiğiniz en büyük sayı " + sayi2 + "'dir.");
                  }
          else{
              // System.out.println("Sayı 3 en büyük sayıdır...");
              System.out.println("Girdiğiniz en büyük sayı " + sayi3 + "'dir.");
          }
    
    }
}
