package p04_shape_polymorphism;

/**
 * 圆形 —— Shape 的子类。
 *
 * 重写 draw() 方法绘制圆形。
 *
 * @see Shape
 */
public class Cycle extends Shape {

    /**
     * 绘制圆形。
     * 重写父类 draw() 方法，输出"圆形"。
     */
    public void draw() {
        System.out.println("圆形");
    }
}
