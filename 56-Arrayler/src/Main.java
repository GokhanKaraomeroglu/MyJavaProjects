
import java.util.Scanner;

public class Main {
   // Arrayler 
    public static void array_bastir(int [] array){
        
        for (int i=0; i< array.length; i++){
            System.out.println((i+1) +"'nci Eleman : " + array[i]);    
        }
        
    }
     public static double ortalama (int [] array){
        int toplam= 0;
        for (int i=0; i< array.length; i++){
            toplam += array[i];  
        }
        return ((double) toplam / array.length);
    }   
    
    public static void main(String[] args) {
       // int a= 5;
       // int a[] = new int[10];
       // int a[] = {1,2,3,4,5,6,7,8,9,10};
       // a[5]= 32;
       // a[10] = 44;
       
      // int a[] = {30,40,50,60,70};
      // System.out.println(a[0]);
      // System.out.println(a[3]); 
      // System.out.println(a[6]); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
    int [] a = new int[5];
   
    Scanner scanner = new Scanner(System.in); // Cntr Shift i
    /*
    System.out.println("Lütfen 5 adet sayı giriniz..."); 
    for (int i=0; i<5; i++){
       a[i]= scanner.nextInt();
        
    }
    // for (int i=0; i<5; i++){
    //   a[i]= i * 4 + 3;
        
    } 
        System.out.println("**********************");
        System.out.println("*Girdiğiniz sayılar...");
     for (int i=0; i<5; i++){
         System.out.print((i+1) + "'nci sayı :" );
         System.out.println(a[i]);
        
    }*/
    
    
    int [] b = {30,40,50,60,70};
    //    System.out.println("Arrayimizin uzunluğu " + b.length);
    //    array_bastir(b);
        System.out.println("Array ortalaması: "+ ortalama(b));
        
    }
}
