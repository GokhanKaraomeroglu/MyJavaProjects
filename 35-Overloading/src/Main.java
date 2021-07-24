
//  Metodlarda Overloading
  

public class Main {
    public static void numara(String isim, int numara){
        
        System.out.println(isim + " isimli Öğrencinin Numarası " + numara + " dır.");
        
    }
    public static void numara( int numara){
        
        System.out.println("İsimsiz Öğrencinin Numarası " + numara + " dır.");
        
    }
    public static void numara(String isim){
        
        System.out.println(isim + " isimli Öğrencinin Numarası Belirlenmemiştir.");
        
    }
    
    /*
    public static void toplama (String a, String b){
        System.out.println(a + " " +  b );
    }
    public static void toplama (int a, int b){
        System.out.println("Toplamları = " + (a + b ));
    }
    
    public static void toplama(int a, int b, int c){
        
        System.out.println("Toplamları = " + (a + b + c));
        // return (a + b + c); 
    }
    */

    public static void main(String[] args) {
      /*
      toplama(4,5,6);
      toplama(3,4);
      toplama("Hakan", "KARAÖMEROĞLU");
      */
        numara("Hakan", 555);
        numara(234);
        numara("Zehra");
    }
}
