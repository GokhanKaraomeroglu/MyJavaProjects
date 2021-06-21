
import java.util.Scanner;

// Whie Döngüsü Kullanarak ATM Programı Yazma
   /*
    İşlemler
    1. Bakiye Öğrenme
    2. Para Çekme
    3. Para Yatırma
    4. Çıkma     
        */

public class Main {
  
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println(" İşlemler...\n" +
" 1. Bakiye Öğrenme\n" +
" 2. Para Çekme\n" +
" 3. Para Yatırma\n" +
" 4. Çıkma");
        
        System.out.println("*************************");
        
        int bakiye = 1000;
        
        while (true){
            System.out.print ("Lütfen bir işlem seçiniz...");
            int islem = scanner.nextInt();
            if (islem == 1){
                
                System.out.println("Bakiyeniz: " + bakiye);
                continue;
            }
            else if (islem == 2){
              System.out.print("Para çekilecek miktarı giriniz: " );
              int miktar1 = scanner.nextInt();
              if (bakiye >= miktar1){
               bakiye= bakiye-miktar1;
                  System.out.println("Yeni bakiye: "+ bakiye);
              }
              else{
                  System.out.println("Bakiye yetersiz");
              }
              continue;  
            }
            else if (islem == 3) {
                System.out.print("Para yatırılacak miktarı giriniz: " );
              int miktar2 = scanner.nextInt();
              bakiye= bakiye+miktar2;
                System.out.println("Yeni bakiyeniz: " + bakiye);
                continue;
            }
            else if(islem == 4){
                System.out.println("Sistemden çıkılıyor...");
                System.out.println("Kartınızı almayı unutmayın...");
            break;
            }
            System.out.println("Yanlış işlem tekrar deneyiniz...");
        }
       
       
    }
    
}
