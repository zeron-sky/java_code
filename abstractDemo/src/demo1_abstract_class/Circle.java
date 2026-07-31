package demo1_abstract_class;

public class Circle extends Shape {
    private static final double PI = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("圆形: r = " + r);
    }

    @Override
    public void calcArea() {
        area = PI * r * r;
    }
}
