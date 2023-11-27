/*Create a package shapes which consist of subpackages named 2d and 3d
2d package consist of classes : Circle , Rect and Triangle Methods 1.calculateArea 2.calculatePerimeter
for each shape
3d package consist of classes : Cylinder , Cube , Sphere Method 1. calculateVloume for each shape
Write ShapeDemo program which imports all the classes from all the given packages and call methods */

// Package declaration for 2D shapes
package shapes.pkg2d;

// Class definition for Circle
public class Circle {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of a circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter of a circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Class definition for Rectangle
public class Rect {
    private double length, width;

    // Constructor to initialize length and width
    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of a rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter of a rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Class definition for Triangle
public class Triangle {
    private double base, height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate area of a triangle
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Method to calculate perimeter of a triangle
    public double calculatePerimeter() {
        // Assuming a right triangle with base and height
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }
}

// Package declaration for 3D shapes
package shapes.pkg3d;

// Class definition for Cylinder
public class Cylinder {
    private double radius, height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate volume of a cylinder
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

// Class definition for Cube
public class Cube {
    private double side;

    // Constructor to initialize side length
    public Cube(double side) {
        this.side = side;
    }

    // Method to calculate volume of a cube
    public double calculateVolume() {
        return side * side * side;
    }
}

// Class definition for Sphere
public class Sphere {
    private double radius;

    // Constructor to initialize radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate volume of a sphere
    public double calculateVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}

// Main program to demonstrate shape calculations
public class ShapeDemo {
    public static void main(String[] args) {
        // Create 2D shapes
        Circle circle = new Circle(5);
        Rect rect = new Rect(10, 5);
        Triangle triangle = new Triangle(6, 8);

        // Calculate and display area and perimeter for each 2D shape
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        // Create 3D shapes
        Cylinder cylinder = new Cylinder(4, 10);
        Cube cube = new Cube(6);
        Sphere sphere = new Sphere(3);

        // Calculate and display volume for each 3D shape
        System.out.println("\nCylinder:");


