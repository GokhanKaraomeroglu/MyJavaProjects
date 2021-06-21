
import java.util.Scanner;

// Break Continue Anahtar Kelimeleri
   /*
    break anahtar kelimesi
         
     Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
     Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.
            
     break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa
     ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.
         
    continue anahtar kelimesi 
            
     Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan 
     işlemlerini yapmadan direk döngü bloğunun başına döner.
           
        */

public class Main {
  
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        /*
        int i = 0;
        while (i < 20){
            if (i==10){
                break;
            }
           i++;
           System.out.println("i= " + i);
        } */
        /*
        System.out.println("Doğru sayıyı bulma...");
        
        while (true){
            System.out.print("Bir sayı giriniz... ");
            int sayi = scanner.nextInt();
            if (sayi == -1){
                
                System.out.println("Doğru sayıyı buldunuz...");
                break;
            }
            System.out.println("Malesef yanlış sayı");
        }
        */
       /*
        for (int i= 0; i<10; i++){
           if (i== 4 || i==7){
               continue;
           } 
           
            System.out.println("i = " + i);
        }
        */
       int i = 0;
        // System.out.println("i = " + i );
        while (i < 10) {
            
           // i++;
            if (i == 4 || i == 7) {
             i++; // burası olmazsa sonsuz döngü olur.
                continue;
            }
            System.out.println("i = " + i );
            i++;
            
        }
       
        
        
    }
    
}
