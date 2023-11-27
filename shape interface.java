/*Create a Shape interface having methods area () and perimeter ().
Create 3 subclasses, Circle and Rectangle, triangle that implement the Shape interface.
Create a class Sample with main method and demonstrate the area and perimeters of both the shape
classes.
You need to handle the values of length, breath, and radius in respective classes to calculate their area
and perimeter.*/
interface shape{
    double area();
    double perimeter();
}
class Rectangle implements shape{
    private  double length;
    private double breadth;

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length-breadth);
    }
}
class Circle interface shape{
    private double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
