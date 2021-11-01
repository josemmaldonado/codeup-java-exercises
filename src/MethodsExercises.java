public class MethodsExercises {

static public void main (String [] args){

System.out.println("Addition "+ addition(1,1));

System.out.println("Subtraction " + subtraction(5,2));

System.out.println("Division " + division(10,2));

System.out.println( "Multiplication " + multiplication(6,6));


System.out.print("Enter a number between 1 and 10: ");

//int userInput = getInteger(1, 10);

//    public static int getInteger(int min, int max);{

//        return int min, int max;


    }







    public static int addition(int num1, int num2){

        return num1+=num2;
    }

    public static int subtraction(int num1, int num2){

        return num1-=num2;
    }

    public static int division (int num1, int num2){

        return num1/=num2;
    }

    public static int multiplication(int num1, int num2){

        return num1*=num2;
    }
}
