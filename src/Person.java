public class Person {

private String name;




static public void main (String [] args){

        Person p1 = new Person();

        p1.name="Billy Ray";

        System.out.println(p1.getName());

        p1.sayHello();

        p1.setName("Ray Billy");

        System.out.println(p1.name);
//
//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
//    System.out.println(person1.getName().equals(person2.getName()));
//    System.out.println(person1 == person2);


//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1 == person2);

//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1.getName());
//    System.out.println(person2.getName());
//    person2.setName("Jane");
//    System.out.println(person1.getName());
//    System.out.println(person2.getName());

}
    public String getName(){
//TODO: return the person's name
       return name;


    }

    public void setName (String name){

    //TODO: change the name property to the passed value
        this.name = name;

    }
    public void sayHello(){



    System.out.println("Hello from " + this.name + "!");
    //TODO: print a message to the console using the person's name


}

//    The class should have a constructor that accepts a `String` value and sets
//    the person's name to the passed string.
//
//    Create a `main` method on the class that creates a new `Person` object and
//    tests the above methods.
}
