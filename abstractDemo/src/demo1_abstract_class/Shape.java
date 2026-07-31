package demo1_abstract_class;

public abstract class Shape {
    protected double area;

    public abstract void draw();

    public abstract void calcArea();

    public double getArea() {
        return area;
    }
}
