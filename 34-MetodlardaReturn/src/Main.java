
//  Metodlarda Return
  // return den sonra hiçbir kod çalışmaz. return fonsiyonu bitirir.

public class Main {
    
    /* public static int toplama(int a, int b, int c){
        
        // System.out.println("Toplamları = " + (a + b + c));
        return (a + b + c);
    } */
    public static int ikiilecarp (int a){
        return a*2;
    }
    public static int ikiiletopla (int a){
        return a+2;
    }
    public static int ucilecarp (int a){
        return a*3;
    }
    
    public static int deneme (int a){
        System.out.println("Çıktı veriliyor....");
        return a*3;
        // System.out.println("Çıktı alındı...."); burasına java ulaşamıyor...
    }
    public static void main(String[] args) {
      
        System.out.println("***************");
        //System.out.println("Çıktı Değeri " + toplama(3, 3, 6) );
        System.out.println("Çıktı değeri " + ucilecarp(ikiiletopla(ikiilecarp(5))));
        System.out.println("***************");
        System.out.println(deneme (5));
    }
}
