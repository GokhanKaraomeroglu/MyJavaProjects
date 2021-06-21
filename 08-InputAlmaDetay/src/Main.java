
import java.util.Scanner;

// Input Alma Detay
/* Int bir değerden sonra string almak isterseniz 
'enter' string gibi algılanıyor ve hata oluşuyor.
Bunu çözmek için 'Dummy Line' ekliyoruz.
*/
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in );
       
      System.out.println("Yaşınızı giriniz: ");
      int yas = scanner.nextInt();
      
      scanner.nextLine(); // Dummy Line
      
      System.out.println("Adınızı giriniz: ");
      String adi = scanner.nextLine();
      
        System.out.println("\nYaşınız: " + yas);
        
        System.out.println("Adınız: "+ adi); 
        
    }
    
}
