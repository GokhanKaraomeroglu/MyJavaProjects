
public class Test {
    public static void main(String[] args) {

        Araba araba1 = new Araba();
       
        araba1.setKapilar(4);
        System.out.println("Kapi sayisi " + araba1.getKapilar());
        
        
        /*
        Araba araba2;
        araba2.setKapilar(10);
        */
        

        // NullPointerException
        Araba araba3= null;
        araba3.setKapilar(4);
        
        
    }
}
