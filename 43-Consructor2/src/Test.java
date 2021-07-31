
public class Test {
    public static void main(String[] args) {
    
        Account account1 = new Account();
       
        // System.out.println(account1.getIsim());
                
        Account account2 = new Account("Hakan KARAOMEROGLU","hakan@gmail.com","654321");
       
       // System.out.println(account2.getEmail());
       // System.out.println(account2.getHesapNo());
        
        account2.bilgileriGoster();
    }
}