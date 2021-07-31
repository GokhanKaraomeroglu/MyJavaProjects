
public class Test {
    public static void main(String[] args) {
       // Account account1 = new Account();
        
    /*
        account1.setIsim("Hakan KARAOMEROGLU");
        account1.setHesapNo("123456");
        account1.setEmail("hakan gmail.com");
        account1.setBakiye(1000.0);
        account1.setTelefonNo("0 555 555 55 55");
        
        System.out.println("Bakiye: "+ account1.getBakiye());
       
        */
        Account account2 = new Account("123456",4000.0,"Hakan KARAOMEROGLU","hakan@gmail.com","654321");
        
       // account2.paraCekme(500);
       // account2.paraYatir(1000);
       
       account2.paraCekme(3000);
    }
}