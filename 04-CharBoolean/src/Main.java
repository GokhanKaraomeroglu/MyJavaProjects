// Char Boolean

public class Main {
    public static void main(String[] args) {
        // Char karekterleri gostermek için, 2 byte yer kaplar, 2^16 karakter
        // Boolean Kosullu durumlarda true false,
        
        char a = 'A';
        char b = '+';
        char c = 1500;
        char d = 2500;
        char e = '\u0152';
        char f = '\u063C';
                
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        
        boolean aa = true;
        boolean bb = false;
        
        System.out.println(aa);
        System.out.println(bb);
        
        System.out.println(b+d);
    }
    
}
