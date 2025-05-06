
interface Draw {
    void draw();
}

interface Shape extends Draw {
    void shapeType();
    double calculateArea();
}

class Rectangle implements Shape {
    double length = 10;
    double width = 5;

    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void shapeType() {
        System.out.println("This is a Rectangle");
    }

    public double calculateArea() {
        return length * width;
    }
}


class Circle implements Shape {
    double radius = 7;
    final double PI = 3.14;

    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void shapeType() {
        System.out.println("This is a Circle");
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}


class Square implements Shape {
    double side = 4;

    public void draw() {
        System.out.println("Drawing Square");
    }

    public void shapeType() {
        System.out.println("This is a Square");
    }

    public double calculateArea() {
        return side * side;
    }
}
 class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Square s = new Square();

        r.draw();
        r.shapeType();
        System.out.println("Area: " + r.calculateArea() + "\n");


        c.draw();
        c.shapeType();
        System.out.println("Area: " + c.calculateArea() + "\n");

        s.draw();
        s.shapeType();
        System.out.println("Area: " + s.calculateArea());
    }
}
