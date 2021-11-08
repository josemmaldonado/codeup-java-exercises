import java.util.Scanner;

public class HighLow {

    public  static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("You look like you want to play a guessing game.");

        int randomNumber = (int)Math.floor(Math.random() * 100);

        int userInput;

        System.out.println("I'm thinking of a number between 1-100");

        do{
            System.out.println("Try and guess what is is.");

            userInput = sc.nextInt();

            if(userInput > randomNumber){

                System.out.println("Its lower than that");

            } else if (userInput < randomNumber){

                System.out.println("Its higher than that");

            } else {
                System.out.println("Good guess");

            }

        } while(userInput != randomNumber);

    }
}
