
public class Main {
    
    public static void main(String[] args) {
        /*
        Account account1 = new Account( "Hakan", "hakan@gmail.com", "123456");
        
        Account account2 = account1;
        
        Account account3 = new Account();
        
        if (account1 == account3) {
            
            System.out.println("Aynı objeyi gösteriyor....");
            
        }
        else{
            System.out.println("Aynı objeyi göstermiyor... XXXX");
            
        } */
        
        new Account ("Hakan2", "hakan2@gmail.com", "1234567").bilgileriGoster();
        // Referans atamadığımız için başka yerde kullanılamaz.
    }
    
}
