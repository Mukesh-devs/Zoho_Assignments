package Assignment_8.shape;

class Shape {

    private String color;

    Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double area() {
        System.out.println("Not Defined");
        return 0;
    }

    public double perimeter() {
        System.out.println("Not defined");
        return 0;
    }
}