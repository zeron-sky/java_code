package p04_shape_polymorphism;

/**
 * 矩形 —— Shape 的子类。
 *
 * 重写 draw() 方法绘制矩形。
 *
 * @see Shape
 */
public class Rect extends Shape {

    /**
     * 绘制矩形。
     * 重写父类 draw() 方法，输出"矩形"。
     */
    public void draw() {
        System.out.println("矩形");
    }
}
