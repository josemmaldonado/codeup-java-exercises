
import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int num1, int num2) {

        return num1 += num2;
    }

    public static int subtraction(int num1, int num2) {

        return num1 -= num2;
    }

    public static int division(int num1, int num2) {

        return num1 /= num2;
    }

    public static int multiplication(int num1, int num2) {

        return num1 *= num2;
    }

    public static int getInteger(int min, int max) {

        Scanner sc = new Scanner(System.in);

        String enterNumber = "Enter a number between 1 and 10: ";

        System.out.print(enterNumber);

        int userInput = sc.nextInt();

        if (userInput >= min & userInput <= max) {

            return userInput;

        }

        System.out.println("Number is not between 1 and 10." + enterNumber);
//    recursion at its finest. Calling the same  method within the
//    same method.
        return getInteger(min, max);
    }


    //  void meanning we are not expected to return anything
//    We can just execute some commands
    public static void factorial() {

        Scanner sc = new Scanner(System.in);

        int userInput;

        String userContinue;

        long factorial = 1;

        String middle = "1";

        do {
            userInput = getInteger(1, 10);

            for (int i = 1; i <= userInput; i++) {

                if (i > 1) {

                    middle += "x" + i;
                }

                factorial *= i;

                System.out.printf("%2d! = %-45s = %d%n", i, middle, factorial);

            }

            System.out.println("Would you like to continue? (y/n)");

            userContinue = sc.nextLine();

        } while (userContinue.equalsIgnoreCase("y"));


    }

    public static void shakeDemDiceAndRollEm() {

        Scanner sc = new Scanner(System.in);

        String userContinue;

        System.out.println("How may side would you like this dice to have: ");

        int sides = sc.nextInt();

        System.out.println("Would you like to roll the dice? (y/n)");

        String rollDice = sc.nextLine();

        if (rollDice.equalsIgnoreCase("y")) {
            do {
                int diceOne = (int) Math.floor(Math.random() * sides);

                int diceDos = (int) Math.floor(Math.random() * sides);

                System.out.println(diceOne);

                System.out.println(diceDos);

                System.out.println("Would you want to play again? (y/n)");

                userContinue = sc.next();

            } while (userContinue.equalsIgnoreCase("y"));
        }

    }


    public static void main(String[] args) {

//        System.out.println("Addition " + addition(1, 1));

//        System.out.println("Subtraction " + subtraction(5, 2));

//        System.out.println("Division " + division(10, 2));

//        System.out.println("Multiplication " + multiplication(6, 6));

//        System.out.println(getInteger(1,10));

//        factorial();

        shakeDemDiceAndRollEm();
    }

}











