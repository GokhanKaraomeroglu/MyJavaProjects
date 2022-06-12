
public class Main {
    public static void main(String[] args) {
        
        //Sekil sekil = new Sekil("Sekil");
        Sekil sekil;
        sekil = new Kare("Kare2",6);
        
        sekil.alan_hesapla();
        //sekil.cevre_hesapla(); // AbstractClass da tanımlı olmadığı için hata verdi.
        
        Kare kare1 = new Kare("Kare1",5);
        Daire daire1 = new Daire("Daire1", 3);
        
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        kare1.cevre_hesapla();
        
        // kare1.ismini_soyle(); // fonksiyon üstsınıfda var olduğu için çalıştı. ve isim aynı oldu.
    }
    
}
