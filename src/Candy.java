import java.util.Arrays;

public class Candy {//candy constructor
//string property
    public String name;

    public String size;
//array of strings


    public Candy(String name){

        this.name = name;

        this.size = "unknown";
    }

    public Candy(String name, String size){

        this.name = name;

        this.size = size;
    }


    public void trickOrTreat() {
         System.out.printf("Check out my candy, %s %s", name, size);
    }

//    public candyDescriptors(String description){
//
//    }
    public static  String [] myBag = {"candy-coated", "chocolate", "bite-sized",
                        "sugar-coated", "coconut", "fun-sized",
                        "cookie-crunch", "dark chocolate", "left-side",};

    public static void main(String[] args) {

        Candy butterfingers = new Candy("unwanted");

        butterfingers.name = "Butterfingers";

        butterfingers.size = "minture";

        Candy snickers = new Candy("least wanted");

        snickers.name = "Snickers";

        snickers.size =" fun-sized";

        Candy payday = new Candy("includes nuts");

        payday.name = "Payday";

        payday.size = "Normal size";



        System.out.println(Arrays.toString(myBag));

//        for (String myBags : myBag) {
//            System.out.println("I have a piece of myBags);
//        }

    }
};





