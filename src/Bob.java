import java.util.Scanner;

public class Bob {
    static public void main(String[] args) {


        System.out.println("Bob enters the room. It seems like he wants to have a conversation.");

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        if (userInput.endsWith("?"))

        {
            System.out.println("Sure.");
        }

        else  if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");

        }

        else if (userInput.equals(" ")) {
            System.out.println("Fine. Be that way!");

        }
        else {
            System.out.println("Whatever.");
        }

    }


}

