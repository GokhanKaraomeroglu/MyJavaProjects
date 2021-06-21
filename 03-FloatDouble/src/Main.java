// Float Double

public class Main {
    public static void main(String[] args) {
        // Double 64 bit - 8 byte
        // Float 32 bit - 4 byte
        
        // otomatik dönüstürme int-->Float--> Double 
        
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.45d;
        
        System.out.println(c);
        
        float e = (float) 6.0;
        float f = 6f;
        float g = 6.3f;
        
        int h = 22/7;
        float i = 22f/7f;
        double j = 22d/7d;
        System.out.println("h = " + h); // h = 3
        System.out.println("i = " + i); // i = 3.142857
        System.out.println("j = " + j); // j = 3.142857142857143
        
        int k = 7;
        float l = k;
        double m = k;
        System.out.println("l = " + l); // l = 7.0
        System.out.println("m = " + m); // m = 7.0
        
        float n = (float) a; // a double
        
        double o = 75.25;
        double p = 44.0;
        double r = 4d;
        
        float s = 75.25f;
        float q = 44.0f;
        float t = 4f;
        
        System.out.println("Ortalama = "+ (o+p+r)/3);
        System.out.println("Ortalama2 = "+ (s+q+t)/3);
    }
    
}
