
import java.util.Scanner;

// Do While Döngüsü
  /*
    do {
        koşul doğru olduğu sürece burası çalışacak
        while'dan farklı olarak bir defa mutlaka çalışmasıdır.
    }while (koşul);

    */
public class Main {
  
    public static void main(String[] args) {
        
       /*
       int i= 0;
        do {            
           System.out.println("i = "+ i);
           i++; 
        } while (i<= 10);
       */
       
      Scanner scanner = new Scanner(System.in);
      /* 
      System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        int rakam;
        
        do {  
          
          rakam = sayi - (sayi/10)*10;
           sayi= sayi-rakam;
           sayi= sayi/10;
           toplam= toplam+rakam;
           
           // System.out.println("Rakam " + rakam);
           // System.out.println("Sayı " + sayi); 
           // System.out.println("Toplam "+ toplam); 
        } while (sayi>0);
      
        System.out.println("Girdiğiniz sayının rakamları tolamı: " + toplam);
      */
      System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;
       
        do {  
          
          toplam += sayi % 10;
          sayi /= 10;
          
        } while (sayi>0);
      
        System.out.println("Girdiğiniz sayının rakamları tolamı: " + toplam);
      
      
      
    }
    
}
