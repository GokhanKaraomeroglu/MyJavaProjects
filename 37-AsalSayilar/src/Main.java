
//  1-1000 Asal Sayilar
  

public class Main {
    public static boolean asal (int sayi){
        
        for (int i= 2; i<sayi; i++){
            
            if (sayi % i == 0){
                return false;
            }
        }
         return true;
    }

    public static void main(String[] args) {
        
        // for (int i= 2; i<1000; i++){
        int i=2;
        while (i<1000){
            if(asal(i)){
                System.out.println(i);
            }
            i++;
        } 
    
    }
}
