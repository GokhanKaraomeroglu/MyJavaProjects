
import java.util.Scanner;

// Input Alma

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Yasinizi giriniz: ");
        
        int yas = scanner.nextInt();
        
        System.out.println("Yasiniz: " + yas);
    
        System.out.println("Bir Sayı giriniz: ");
        
        double sayi;
        sayi = scanner.nextDouble();
        
        System.out.println("Sayı: " + sayi);
       
        
        System.out.println("Adınızı giriniz: ");
        
        String adi = scanner.nextLine();
        
        System.out.println("Adınız: " + adi);
        */ 
        
        System.out.println("Yasinizi giriniz: ");    
        
        if (scanner.hasNextInt()){
       
        int yas = scanner.nextInt();
        
        System.out.println("Yasiniz: " + yas);
            
        }
        else {
            System.out.println("Lütfen Sayı Giriniz!...");
        }
    
    }
    
    
}
