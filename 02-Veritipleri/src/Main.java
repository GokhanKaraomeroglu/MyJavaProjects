// Veri Tipleri


public class Main {
    public static void main(String[] args) {
    
        int a = 4; // -2^31 +2^31-1
        
        System.out.println (Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        
        byte b = 100; // -2^31 +2^31-1
        
        System.out.println (Byte.MAX_VALUE); // 127
        System.out.println(Byte.MIN_VALUE); // -128
        
        short c = 1000; // -2^31 +2^31-1
        
        System.out.println (Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); // -32768
        
        short d = 10000; // -2^31 +2^31-1
        
        System.out.println (Long.MAX_VALUE); // 32767
        System.out.println(Long.MIN_VALUE); // -32768
        
        // byte--> short--> int--> long
        
        short e = 1000;
        int f = (e/2);
        int g = e;
        
        byte h = 100;
        byte i = (byte)(h / 2);
        System.out.println(i);
        
         short j = 100;
         byte k = 2;
         int l = 4;
         
         long m = j+k+l;
         System.out.println(m);
    }
  
}
