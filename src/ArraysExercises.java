import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
//        [I@4617c264 this is the output without arrays.tostring. we get the memory location.
        System.out.println(Arrays.toString(numbers));


// using the array initializer syntax
        String[] threeStooges = {"Larry", "Moe", "Curly"};

        for (String t: threeStooges){
            System.out.println(t);
        }



    }
}
