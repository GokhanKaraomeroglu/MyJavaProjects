
import java.util.Scanner;

// Gelismis Hesap Makinesi

public class Main {
    /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya çalışın.
    Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.

    */   
    public static int cikarma(int a,int b) {
        
        return (a - b);
        
    }
    public static double bolme(int a,int b) {
        return ((double)a / b);
        
    }
    public static int toplama(int a,int b){
        
        return (a + b);
        
    }
    public static int toplama(int a,int b,int c) {
        
        return (a + b + c);
    }
    public static int carpma(int a,int b) {
        
        return (a * b);
    }
    public static int carpma(int a,int b,int c) {
        return (a * b * c);
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String islemler =  "1. Toplama İşlemi\n"
                           +"2. Çıkarma İşlemi\n"
                           + "3. Çarpma İşlemi\n"
                           + "4. Bölme İşlemi\n"
                           + "5. Cikis";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");

        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("5")){
                
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("Kaç değer toplayacaksınız ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                switch (kacsayi) {
                    case 2:
                        {
                            System.out.print("Birinci sayi: ");
                            int a = scanner.nextInt();
                            System.out.print("Ikinci sayi: ");
                            int b = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Girilen sayıların toplamları : " + (toplama(a, b)));
                            break;
                        }
                    case 3:
                        {
                            System.out.print("Birinci sayi: ");
                            int a = scanner.nextInt();
                            System.out.print("Ikinci sayi: ");
                            int b = scanner.nextInt();
                            System.out.print("Ucuncu sayi: 3");
                            int c = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Girilen sayıların toplamları : " + (toplama(a, b,c)));
                            break;
                        }
                    default:
                        System.out.println("Bunun için uygun metod bulunmuyor...");
                        break;
                }
                
            }
            else if (islem.equals("2")) {
                System.out.print("Birinci sayi: ");
                int a = scanner.nextInt();
                System.out.print("Ikinci sayi: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Sayıları Farkları : " + cikarma(a, b));
                
            }
            else if (islem.equals("3")){
                System.out.print("Kaç değer çarpacaksınız ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                switch (kacsayi) {
                    case 2:
                        {
                            System.out.print("Birinci sayi: ");
                            int a = scanner.nextInt();
                            System.out.print("Ikinci sayi: ");
                            int b = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Girilen sayıların çarpımları : " + (carpma(a, b)));
                            break;
                        }
                    case 3:
                        {
                            System.out.print("Birinci sayi: ");
                            int a = scanner.nextInt();
                            System.out.print("Ikinci sayi: ");
                            int b = scanner.nextInt();
                            System.out.print("Ucuncu sayi: ");
                            int c = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Girilen sayıların çarpımları : " + (carpma(a, b,c)));
                            break;
                        }
                    default:
                        System.out.println("Bunun için uygun metod bulunmuyor...");
                        break;
                }
            }
            else if (islem.equals("4")) {
                System.out.print("Birinci sayi: ");
                int a = scanner.nextInt();
                System.out.print("Ikinci sayi: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Sayıların Bölümü : " + bolme(a, b)); 
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }    
        }   
    }
}
