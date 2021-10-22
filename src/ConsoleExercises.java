import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args){
        double pi = 3.14159;
        float almostPi = (float) pi;
        System.out.println("The value of pi is approximately "+ almostPi);
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();
            System.out.println("You entered: --> \"" + userInput + "\"<---");
        Scanner scanner1 = scanner.nextLine(System.in);
        String

//This is what happens when I tried to enter a string and not an integer.
//        Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//        at java.base/java.util.Scanner.next(Scanner.java:1594)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//        at ConsoleExercises.main(ConsoleExercises.java:10)



    }
}
