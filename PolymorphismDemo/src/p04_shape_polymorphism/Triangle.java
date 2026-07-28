package p04_shape_polymorphism;

/**
 * 三角形 —— Shape 的子类。
 *
 * 演示了多态体系的"可扩展性"：
 * 在不修改现有代码的前提下，新增一个 Shape 子类，
 * 即可无缝接入已有的多态数组和绘制循环。
 *
 * @see Shape
 */
public class Triangle extends Shape {

    /**
     * 绘制三角形。
     * 重写父类 draw() 方法，输出"三角形"。
     */
    public void draw() {
        System.out.println("三角形");
    }
}
