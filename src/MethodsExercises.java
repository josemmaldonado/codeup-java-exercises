
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

        System.out.println("Number is not between 1 and 10."+enterNumber);
//    recursion at its finest. Calling the same  method within the
//    same method.
        return getInteger(min,max);
    }


//  void meanning we are not expected to return anything
//    We can just execute some commands
    public static void factorial(){

        Scanner sc = new Scanner(System.in);




    }

    public static void main (String [] args){

//        System.out.println("Addition " + addition(1, 1));

//        System.out.println("Subtraction " + subtraction(5, 2));

//        System.out.println("Division " + division(10, 2));

//        System.out.println("Multiplication " + multiplication(6, 6));

        System.out.println(getInteger(1,10));


    }

}











