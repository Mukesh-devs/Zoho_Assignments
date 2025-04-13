package Assignment_8.shape;

class Triangle extends Shape {
    private double base; 
    private double height; 
    private double sideA;
    private double sideB; 
    private double sideC;

    public Triangle(String color, double base, double height, double sideA, double sideB, double sideC) {
        super(color);
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
