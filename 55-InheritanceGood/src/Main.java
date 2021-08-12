
public class Main {
    public static void main(String[] args) {
        // BaseProductDao baseProductDao = new OracleProductDao("Oracle String ");
       //  baseProductDao.add(new Product(1, "Su ", 2));
       
      // ProductManager productManager = new ProductManager(new OracleProductDao("Oracle String ") );
      // productManager.add(new Product(2, "Meyve Suyu " , 7));
       
       ProductManager productManager = new ProductManager(new MySqlProductDao("MySql String ") );
       productManager.add(new Product(3, "Şeker " , 6));
    }
    
    // Spring IOC Container
}
