package shapes;

//Using this abstract class is to force the subclasses to define the the
//abstract methods

abstract class Quadrilateral extends Shape implements Measurable{


//    protected properties to share with the subclasses

    protected double length;

    protected double width;

//    constructor which is a special method that is called when an object is
//    created. The constructor has the same name as the class and does not
//    define a return type only accepts arguments. Inside the parenthesis
//    is accepting the arguments. We are setting the blueprint for
//    an object's fields.

    public Quadrilateral(double length , double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral() {

    }

//    methods to get my length and width

    public double getLength() {

        return this.length = length;
    }

    public double getWidth() {
        return this.width = width;
    }

    //  Abstract methods have no body/behavior and only provide information
//    about the method name and return type and parameters.
//      When we use curly braces ie{}, we are creating a body.
//
    public abstract double setLength();

    public abstract double setWidth();

}
