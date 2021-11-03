package shapes;

public class Square extends Rectangle{

public double side;

    public Square(double side) {

        super(side, side);
        this.side = side;

    }


    public double getWidth(){

        return this.width = side;

    }
    public double getArea() {

        System.out.println("This is our side " + this.side);
        return (this.side * this.side);
    }

    public double getPerimeter() {

        return (4 * this.side);
    }






}
