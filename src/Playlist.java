import java.util.*;

public class Playlist {
    public static void main(String[] args) {
        
        ArrayList<String> desertIslandPlaylist = new
         ArrayList<String>();
        
         // Adding songs to a playlist
        desertIslandPlaylist.add("Be Sweet - Japnese Breakfast");
        desertIslandPlaylist.add("His and hers -  Internet Money");
        desertIslandPlaylist.add("Cooped Up -  Post Malone");
        desertIslandPlaylist.add("I wanna be the one -  Stevie B");
        desertIslandPlaylist.add("Bank On Me - Gunna");  
        desertIslandPlaylist.add("Just the two of us - Bill Weathers");  
        desertIslandPlaylist.add("The Humpty Dance - Digital Underground");
        desertIslandPlaylist.add("Wait in vain - Bob Marley");
        desertIslandPlaylist.add("Sweet Marie - The Anniversary");
        desertIslandPlaylist.add("Happy - Pharrell Williams");
        desertIslandPlaylist.add("Dear Mama - 2Pac");


        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        
        // Gots to delete songs with explicit lyrics. Wifey doesn't like me 
        // playing that music around the kids
        desertIslandPlaylist.remove("Bank On Me - Gunna");
        desertIslandPlaylist.remove("The Humpty Dance - Digital Underground");
        desertIslandPlaylist.remove("His and hers -  Internet Money");
        desertIslandPlaylist.remove("Cooped Up -  Post Malone");


       System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
    
    // Swapping the order of the songs
        int indexA = desertIslandPlaylist.indexOf("I wanna be the one -  Stevie B");
    
          int indexB = desertIslandPlaylist.indexOf("Happy - Pharrell Williams");
    
          desertIslandPlaylist.set(indexA, "Happy - Pharrell Williams");
          desertIslandPlaylist.set(indexB, "I wanna be the one -  Stevie B");
    
          System.out.println(desertIslandPlaylist);
   
        }
     
    
    }




