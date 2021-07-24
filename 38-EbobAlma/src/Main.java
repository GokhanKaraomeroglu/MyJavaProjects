
import java.util.Scanner;
//  EBOB Bulma
// Sayılar Kullanıcıdan Alınacak

public class Main {
    public static int ebobBulma (int a, int b){
        int ebob =1;
        
        for (int i= 2; i<=a && i<=b; i++){
            
            if (a % i == 0 && b % i == 0){
                ebob=i;
            }
        }
         return ebob;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Birinci sayıyı giriniz...");
        int sayi1 = scanner.nextInt();
  
        System.out.println("İkinci sayıyı giriniz...");
        int sayi2 = scanner.nextInt();
        
        System.out.println("Girdiğiniz sayıların EBOB'u " + ebobBulma(sayi1, sayi2));
    
    }
}
