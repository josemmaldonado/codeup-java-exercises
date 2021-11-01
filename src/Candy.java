public class Candy {

    public String name;

    public String size;


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

    public static void main(String[] args) {

        Candy butterfingers = new Candy("unwanted");
        butterfingers.name = "Butterfingers";
        butterfingers.size = "minture";

        butterfingers.trickOrTreat();


    }
};





