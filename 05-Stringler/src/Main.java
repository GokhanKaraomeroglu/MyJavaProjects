// Stringler

public class Main {
    public static void main(String[] args) {
        
        String a = "Yeniden ";
        System.out.println(a + "Merhaba...");
        
        String b = "Programlamaya ";
        String c = "devam ";
        String d = "et. ";
        
        String hepsi = b+c+d;
        
        System.out.println("Hepsini Yazarsam: " + hepsi);
        
        int aa = 23;
        // String a = "Yeniden "; bu satir oldugu icin tekrar yazmadim.
        String bb = a + aa;
        
        System.out.println(bb);
        
        double e = 4.56;
        byte f = 45;
        
        a= a+e+f;
        
        System.out.println(a);
        
        char g = '?';
        String h = "Nereye gidiyorsun" + g;
        
        System.out.println(h);
                
        String i = "Programlamya " 
                + "devam " 
                + "et.";
        System.out.println(i);
        
        String j = "Programlamaya\tdevam\tet."; // \t--> tab kadar bosluk veriyor.
        System.out.println(j);
        
        String k = "Programlamaya\ndevam\net."; // \n--> new line
        System.out.println(k);
        
    }
    
}
