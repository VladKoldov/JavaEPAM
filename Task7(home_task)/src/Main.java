import java.sql.SQLOutput;

public class Main {
    public static void printShape(Shape s){
        System.out.println(s.toString() + "area = " + s.calcArea());
    }

    public static double calcAreas(Shape[] shapes){
        double area = 0;
        for (Shape s : shapes){
            area += s.calcArea();
        }
        return area;
    }

    public static double calcAreasByType(Shape[] shapes, String type){
        double area = 0;
        for (Shape s : shapes){
            if(s.getClass().getName().equals(type))
                area += s.calcArea();
        }
        return area;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(2,3),
                new Rectangle(1,3),
                new Rectangle(2,4),
                new Rectangle(6,2),
                new Circle(2),
                new Circle(4),
                new Circle(7),
                new Triangle(1,2,3),
                new Triangle(4,5,7)
        };

        for (Shape s : shapes){
            printShape(s);
        }

        System.out.println("Total area = " + calcAreas(shapes));

        System.out.println("Area of rectangles = " + calcAreasByType(shapes, "Rectangle"));


    }
}
