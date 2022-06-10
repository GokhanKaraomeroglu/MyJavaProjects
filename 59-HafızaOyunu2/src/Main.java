
import java.util.Scanner;


public class Main {
    public static Kart kartlar [][] =new Kart[4][4];
    
    public static void OyunTahtasi (){
        System.out.println("*** Hafıza Oyun Tahtası ***");
        for (int i =0; i <4; i++){
            System.out.println("--------------------");
            
            for (int j =0; j <4; j++){
                if (kartlar[i] [j].isTahmin()){
                System.out.print(" |" + kartlar[i] [j].getDeger()+ "| ");
                }
                else {
                System.out.print(" | | ");
                }   
            }
            System.out.println("");
        }
        System.out.println("--------------------");
        
    }
    public static boolean OyunBittiMi(){
        

        for (int i =0; i <4; i++){
            for (int j =0; j <4; j++){
               if (kartlar[i] [j].isTahmin() == false){
                return false;
                }
            }
        }
    return true;    
    }
    
    public static void TahminEt (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Tahmin: (i ve j değerini boşluklu olarak giriniz.)");
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        kartlar[i1][i2].setTahmin(true);
        OyunTahtasi();
        System.out.print("İkinci Tahmin: (i ve j değerini boşluklu olarak giriniz.)");
        int i3 = scanner.nextInt();
        int i4 = scanner.nextInt();
        
        if (kartlar [i1] [i2].getDeger() == kartlar [i3][i4].getDeger()){
            System.out.println("Doğru tahmin...");
            kartlar[i3][i4].setTahmin(true);
            OyunTahtasi();
        }
        else{
            System.out.println("Malesef yanlış tahmin...");
            kartlar[i1][i2].setTahmin(false);
        }
    }
    public static void yazdir (Kart [][] array){
        for (int i =0; i <4; i++){
            for (int j =0; j <4; j++){
                System.out.print(kartlar [i][j].getDeger() + " " );
            }
            System.out.println(" ");
        }  
    }

    /*
    public static void yaz(Kart [][] array){
        for (Kart[] k : kartlar){
            System.out.println(Arrays.toString(k));
        }
   
    }
    */ // olmadı....
    
    public static void main(String[] args) {
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
        
        yazdir(kartlar);
        // yaz(kartlar);
        /*
        while (OyunBittiMi()== false){
            OyunTahtasi();
            TahminEt();
            
        }
        */
        
    }
}
