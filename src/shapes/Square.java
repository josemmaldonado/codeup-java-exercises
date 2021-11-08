package shapes;

abstract class Square extends Quadrilateral {


    public Square(double length, double width) {
        super(length, width);
    }

    public double setLength() {

        return this.length;
    }



    public double setWidth() {
        return this.width;
    }



    public double getPerimeter() {

        return (4 * this.length);
    }


    public double getArea() {

        return this.width *= this.width;
    }

}






    //
//public double side;
//
//    public Square(double side) {
//
//        super(side, side);
//        this.side = side;
//
//    }
//
//
//    public double getWidth(){
//
//        return this.width = side;
//
//    }
//    public double getArea() {
//
//        System.out.println("This is our side " + this.side);
//        return (this.side * this.side);
//    }
//
//    public double getPerimeter() {
//
//        return (4 * this.side);
//    }

