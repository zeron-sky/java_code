package p04_shape_polymorphism;

/**
 * 图形基类 —— 图形绘制体系中的父类。
 *
 * 定义了所有图形的共同行为 —— draw()（绘制）。
 * 每种具体的图形都有自己独特的绘制方式，由子类重写实现。
 *
 * 本包（p04_shape_polymorphism）的核心目的是演示"多态的数组遍历"：
 * 将不同子类对象放入同一个父类数组中，遍历时调用同一个 draw() 方法，
 * 每个对象自动执行自己的绘制逻辑。
 *
 * @see Rect
 * @see Cycle
 * @see Flower
 * @see Triangle
 */
public class Shape {

    /**
     * 绘制图形 —— 默认实现。
     *
     * 子类应重写此方法，输出各自图形特有的绘制信息。
     */
    public void draw() {
        System.out.println("绘制图形");
    }
}
