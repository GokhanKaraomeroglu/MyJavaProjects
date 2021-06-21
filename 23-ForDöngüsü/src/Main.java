
import java.util.Scanner;

// For Döngüsü
  /*
  for (başlatma; koşul; arttırma veya azaltma) {
        Döngü doğru olduğu sürece burası çalışacak

    }

    */
public class Main {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        /*
        int i;
       
        for (i=0; i<10; i++ ){
            System.out.println("i sayısı: " + i);
        }
        */
        /*
        for (int i=0; i<10; i++ ){
            System.out.println("i sayısı: " + i);
        }
        */
        /*
        for (int i=10; i>0; i-- ){
            System.out.println("i sayısı: " + i);
        }
        */
        /*
        int i=0;
       
        for (; i<10; i++ ){
            System.out.println("i sayısı: " + i);
        }
        */
        /*
        int i=0;
        int j=10;
       
        for (; i<10 && j>0; i++,j-- ){
            System.out.println("i sayısı: " + i + ", j sayısı: " + j);
        }
        */
        /*
        for (int i=2; i<=128; i*=2 ){
            System.out.println("i sayısı: " + i);
        }
        */
        
        System.out.print("Faktöryeli alınacak sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int f =1;
        
        for (int i= 1; i<=sayi; i++){
            
            //f= f*i;
           f*=i;
        }
        System.out.println("\n"  + sayi + " sayısının faktöryeli " + f + "'dir... ");
    }
    
}
