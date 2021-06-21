
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
               
        System.out.println("What is your name? ");
        int hello = scanner.nextInt(); 
        System.out.println("Hello " + hello);
        System.out.println("How old are you? ");
        int yas = scanner.nextInt();
        if (yas >= 70 ){
        System.out.println("You are aged to perfection!");    
        }
        else {
            System.out.println("You are a spring chicken!");
        }
    
    }
    
    
}
