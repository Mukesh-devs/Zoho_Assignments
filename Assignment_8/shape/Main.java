package Assignment_8.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 4, 6);
        Shape triangle = new Triangle("Green", 3, 4, 3, 4, 5);

        System.out.println("Circle");
        System.out.println("Area : " + circle.area() + "\nPerimeter : " + circle.perimeter());
        System.out.println("Rectange");
        System.out.println("Area : " + rectangle.area() + "\nPerimeter : " + rectangle.perimeter());
        System.out.println("Triangle");
        System.out.println("Area : " + triangle.area() + "\nPerimeter : " + triangle.perimeter());
    }
}

