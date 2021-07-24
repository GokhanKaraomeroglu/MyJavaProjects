
import java.util.Scanner;

// Metodlara Giriş
    /*
    Erişim_Belirleyici(Opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(Parametreler){
        // Burası Fonksiyon Bloğu
        // Fonksiyonun yapacağı işlemler burada olacak.  
    }
    */

public class Main {
    public static void selamlama(){
        
        System.out.println("Merhaba Nasılsınız ?");
        System.out.println("Selamlar...");
        
   }
    public static void faktoriyel(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöryeli alınacak sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        
        int faktoriyel = 1;
        
        while(sayi > 0) {
            
            faktoriyel *= sayi;
            
            sayi--;
        }
        System.out.println("Faktöriyel = " + faktoriyel);
        
    }
    public static void main(String[] args) {
       
        selamlama();
        System.out.println("***************");
        faktoriyel();
        System.out.println("***************");     
        
    }
}
