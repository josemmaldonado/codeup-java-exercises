import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f", pi);
//
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("\nEnter 3 words: ");
//
//        String userInput = scanner.next();
//
//        String userInput1 = scanner.next();
//
//        String userInput2 = scanner.next();
//
//        System.out.println("You entered: -->  \"" + userInput + " " + userInput1 + " " + userInput2 + " \"<---");

//        another way to print the inputs is using the printf

//System.out.printf("You entered %s,%s,%s, ", userInput, userInput1, userInput2);

//     When we scanner.next it'll only scan the first token and the default
//        delimiter is the space bar. So it'll scan everything until you
//        hit the space bar or the first white space.
//        System.out.println("Enter a  sentence: ");
//
//        String userInputString = scanner.nextLine();
//
//        System.out.println("You entered " + userInputString);

        System.out.println("Enter the length of the classroom please?");

        String lengthInput =scanner.nextLine();

       int roomLength = Integer.parseInt(lengthInput);

        System.out.println("Enter the width of the classroom please?");

        String widthInput = scanner.nextLine();

        int roomWidth = Integer.parseInt(widthInput);

        System.out.println("Do you like apples?");

        int roomArea = roomWidth * roomLength;

        int roomPerimeter = (roomWidth * 2) + (roomLength * 2);

        System.out.println("Based of your numbers that you enter, the area of your room is " + roomArea);

        System.out.println("And the perimeter of the room is " + roomPerimeter + " How you like dem apples!!");


    }
}
