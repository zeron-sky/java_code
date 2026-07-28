package p04_shape_polymorphism;

/**
 * 花形 —— Shape 的子类。
 *
 * 重写 draw() 方法绘制花形。
 *
 * @see Shape
 */
public class Flower extends Shape {

    /**
     * 绘制花形。
     * 重写父类 draw() 方法，输出"花形"。
     */
    public void draw() {
        System.out.println("花形");
    }
}
