
public class Araba {
   
    private String model;
    private int kapilar;
    private int tekerlek;
    private String motor;
    private String renk;

    
    public String getModel() {
        return model;
    }

    
    public void setModel(String model) {
        this.model = model;
    }

    
    public int getKapilar() {
        return kapilar;
    }

    
    public void setKapilar(int kapilar) {
        
        if (kapilar <= 0) {
            System.out.println ("Kapi sayisi 0'dan kucuk olamaz.");
        }
        else{
        this.kapilar = kapilar;
        }
    }

   
    public int getTekerlek() {
        return tekerlek;
    }

   
    public void setTekerlek(int tekerlek) {
        if (tekerlek <= 0 ) {
            System.out.println("Tekerlek sayisi 0 dan kucuk olamaz");
        }
        
        else{
        this.tekerlek = tekerlek;
        }
    }

    
    public String getMotor() {
        return motor;
    }

    
    public void setMotor(String motor) {
        this.motor = motor;
    }

    
    public String getRenk() {
        return renk;
    }

   
    public void setRenk(String renk) {
        this.renk = renk;
    }
   
    
    
}
