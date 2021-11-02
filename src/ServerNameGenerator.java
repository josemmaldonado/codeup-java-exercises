import java.util.Random;

public class ServerNameGenerator {

     public static void main(String[] args) {


         String[] adjectives = {"Ambitious", "Adorable", "Adventurous", "Ambitious"
                 , "Animated", "Annoying", "Beautiful", "Cheerful", "Clever", "Determined", "Enthusiastic"};

         String[] nouns = {"Holiday","Pizza","Honey","Greece","Guitar"
         ,"Branch","Breakfast","Jewellery","Rose","Hydrogen","Iron"};

         Random random = new java.util.Random();

         int randomAdjective = random.nextInt(adjectives.length);

         int randomNouns = random.nextInt(nouns.length);


        System.out.println("Here is your server name: ");

         System.out.println(nouns[randomNouns]+"-"+adjectives[randomAdjective]);

     }


}
