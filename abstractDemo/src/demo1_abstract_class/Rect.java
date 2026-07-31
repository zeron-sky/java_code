package demo1_abstract_class;

public class Rect extends Shape {
    private double length;
    private double width;

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("矩形: length = " + length + ", width = " + width);
    }

    @Override
    public void calcArea() {
        area = length * width;
    }
}
