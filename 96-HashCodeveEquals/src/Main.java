
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Player {
    private String isim;
    
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
       return "|||| ID: " + id + " İsim :" + isim + " |||";
       
    }
/*
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.isim);
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        return true;
    }
    
*/
    
}
public class Main {
    
    public static void main(String[] args) {
        
       /* Set<String> hs =new HashSet<String>();
        
        hs.add(" Ahmet");
        hs.add(" Mehmet");
        hs.add(" Hasan");
        
        hs.add(" Ahmet");

        for (String s : hs){
            System.out.println(s);
        } */
       
        
        Set<Player> hashset =new HashSet<Player>();
        
        List<Player> player_list = new ArrayList<Player>();
        
        
        Player player1 = new Player("Mustafa",1);
        Player player2 = new Player("Mehmet",10);
        Player player3 = new Player("Emre",6);
        Player player4 = new Player("Mustafa",1);
        
    
        player_list.add(player1);
        player_list.add(player2);
        player_list.add(player3);
        player_list.add(player4);
     
        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);
     
        // System.out.println(player_list);
        for (Player p: hashset){
            System.out.println(p);
        }
        System.out.println("***************************");
        for (Player p: player_list){
            System.out.println(p);
        }  
    }

    

    
    
}
