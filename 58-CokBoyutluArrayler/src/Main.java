
import java.util.Scanner;

public class Main {
   // Çok Boyutlu Arrayler 
   // int [Satır][Sütun]
    
    
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
     Scanner scanner = new Scanner(System.in); // Cntr Shift i  
       
       int [] array = {1,2,3,4,5,6,7,8,9,10};
       
       int [] [] array2 = new int[2][2]; 
       int [] [] array3 = {{10,20}, {30,40}};
       
       array2 [0][0]= 10;
       array2 [0][1]= 20;       
       array2 [1][0]= 30;
       array2 [1][1]= 40;
       
       // System.out.println(array3[0][1]);
       // System.out.println(array3[1][1]);
       
      int [] [] array4 = new int[2][2]; 
        System.out.println("Matris için verileri giriniz...");
      for (int i=0; i<2; i++){
           for (int j=0; j<2; j++){
               System.out.print((i+1)+ "'nci satır, " + (j+1)+ "'nci sütun : ");
               array4 [i][j]= scanner.nextInt();
               scanner.nextLine();
           }
           
       }
        System.out.println("*********************");
        System.out.println("Girdiğiniz matris aşağıdadır...");
        for (int i=0; i<2; i++){
           for (int j=0; j<2; j++){
               
              System.out.print(array4 [i] [j]+ " "); 
              
           }
            System.out.println(" ");
       }
    }
}
