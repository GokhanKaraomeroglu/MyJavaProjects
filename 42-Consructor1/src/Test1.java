import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Account account3 = new Account("123456",4000.0,"Hakan KARAOMEROGLU","hakan@gmail.com","654321");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Merhaba " + account3.getIsim());
        System.out.println("Hesap Numaranız " + account3.getHesapNo());
        System.out.println("Bakiyeniz: " + account3.getBakiye() + " Tl'dir... ");
       
        System.out.println("*************************"); 
        System.out.println(" İşlemler...\n" +
" 1. Bakiye Öğrenme\n" +
" 2. Para Çekme\n" +
" 3. Para Yatırma\n" +
" 4. Çıkma");
        
        System.out.println("*************************");
        

       
       // account2.paraCekme(3000);
       
       while (true){
            System.out.print ("Lütfen bir işlem seçiniz...");
            int islem = scanner.nextInt();
            if (islem == 1){  
                account3.bakiye();
                continue;
            }
            else if (islem == 2){
              System.out.print("Para çekilecek miktarı giriniz: " );
              double miktar1 = scanner.nextDouble();
              account3.paraCekme(miktar1);
              continue;  
            }
            else if (islem == 3) {
                System.out.print("Para yatırılacak miktarı giriniz: " );
              int miktar2 = scanner.nextInt();
              account3.paraYatir(miktar2);
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
