
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    
    
    public static int [] arrayi_doldur (int sayi){
        Scanner scanner = new Scanner(System.in);
        int [] cikti = new int [sayi];
        System.out.println("Dizinizi oluşturmak için " + sayi + " tane değer girin... ");
        
        for (int i=0; i< sayi; i++){
            System.out.print((i+1) + "'nci elemanı giriniz : ");
            cikti [i]= scanner.nextInt();
            scanner.nextLine();
        }
        return cikti;
    }
    
    public static void array_bastir(int [] array){
        System.out.println("************************");
        System.out.println("Dizinizin Elemanları; ");
        for (int i=0; i< array.length; i++){
            System.out.println((i+1) +"'nci Eleman : " + array[i]);    
        }
        
    }    
   public static void array_sort (int [] array){
       
       Arrays.sort(array); // Array sınıfından metod ile sıraladık.
       array_bastir(array);
   }
    
    public static void main(String[] args) {
        
        // int [] a = arrayi_doldur(3);
        
        // array_bastir(a);
        
        // array_sort(a);
        
        int [] a1 = {1,2,3,4,5,6};
        int [] a2 = {1,2,3,4,5,6};
        
        /*
        if (a1 == a2){ // Eşit değiller...
            System.out.println("Eşitler...");
            
        }
        else{
            System.out.println("Eşit Değiller...");
        }*/
        
        if (Arrays.equals(a1, a2)){ // İçerikleri aynı...
            System.out.println("Eşitler...");
            
        }
        else{
            System.out.println("Eşit Değiller...");
        }
    }
    
}
