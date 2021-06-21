
import java.util.Scanner;

// While Döngüsü
  /*
    while(döngü koşulu) {
        koşul doğru olduğu sürece burası çalışacak

    }

    */
public class Main {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        /*
        for (int i=0; i<10; i++ ){
            System.out.println("i sayısı: " + i);
        }
        */
       /* 
       int i= 0;
       while (i<= 10){
           System.out.println("i = "+ i);
           i++;
       }
       */
        /*
       int i= 10;
       while (i<= 100){
           System.out.println("i = "+ i);
           i += 5;
       }
       */
        /*
        System.out.print("Faktöryeli alınacak sayıyı giriniz: ");
        
        int sayi = scanner.nextInt();
        int f =1;
        int i= 1;
        while (i<=sayi){
            //f= f*i;
            i++;
           f*=i;
        }
        System.out.println("\n"  + sayi + " sayısının faktöryeli " + f + "'dir... ");
        */
        
         System.out.print("Faktöryeli alınacak sayıyı giriniz: ");
        
        int sayi = scanner.nextInt();
        int f =1;
        
        while (sayi>0){
            
           f*=sayi;
           sayi--;
        }
        System.out.println("\n" + "Girdiğiniz sayısının faktöryeli " + f + "'dir... ");
        
        // sonsuz döngüye dikkat etmek gerekiyor...
    }
    
}
