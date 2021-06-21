
import java.util.Scanner;


// Basit Hesap Makinesi GK

public class Main {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner (System.in);
        
      System.out.println("************************************");
        String islemler = "+ Toplama İşlemi\n"
                          +"- Çıkarma İşlemi\n"
                          +"* Çarpma İşlemi\n"
                          +"/ Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("************************************");
        
        int a;
        int b;
        System.out.print("Birinci Sayı: ");
                a = scanner.nextInt();
                scanner.nextLine();
        System.out.print("İşlemi Seçiniz: ");
        String islem = scanner.nextLine();        
        
        switch(islem){
            case "+":
                
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Toplamları : " + (a+b));
                break;
            case "-":
                
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Farkları : " + (a-b));
                break;
            case "*":
                
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Çarpımları : " + (a * b));
                break;
            case "/":
                
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Bölümü : " + ((double)a / b));
                break;
            default:
                System.out.println("Geçersiz İşlem");
   
        }

    }
}
