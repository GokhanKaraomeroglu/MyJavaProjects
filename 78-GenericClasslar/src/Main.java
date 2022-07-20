
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
    Character[] char_dizi = {'J','A','V','A'};
    Integer[] integer_dizi = {1,2,3,4,5,6};
    
    String[] string_dizi = {"Java","Python","C++","Php"};
    
    Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Merve")};
    
    
    YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
    YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
    YazdirmaSinifi<Integer> yazdir_int = new YazdirmaSinifi<Integer>();
    YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();
    
    
    
    yazdir_char.yazdir(char_dizi);
        
    System.out.println("******************************");

    yazdir_string.yazdir(string_dizi);
        System.out.println("******************************");

    yazdir_int.yazdir(integer_dizi);
        System.out.println("******************************");

    yazdir_ogrenci.yazdir(ogrenci_dizi);
    
  


    
    
        
        


    }
   
}