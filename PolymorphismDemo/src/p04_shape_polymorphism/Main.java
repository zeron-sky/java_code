package p04_shape_polymorphism;

/*
 * 图形的多态
 *
 * 请创建图形（Shape）、矩形（Rect）、圆形（Cycle）、花形（Flower）四个类，每个类单独存放在对应的文件中。
 *
 * 业务规则：
 * 1. 图形（Shape）都有绘制（draw）行为。
 * 2. 矩形（Rect）继承图形，绘制时输出：矩形。
 * 3. 圆形（Cycle）继承图形，绘制时输出：圆形。
 * 4. 花形（Flower）继承图形，绘制时输出：花形。
 * 5. 程序启动后，依次完成：
 *    - 创建一个矩形、一个圆形和一个花形，分别使用图形数组保存；
 *    - 遍历数组，绘制每个图形。
 *    - 再新增三角形（Triangle），继承图形，绘制时输出：三角形。
 *    - 在数组中增加一个三角形，再次遍历绘制全部四个图形。
 *
 * 预期控制台输出：
 * 矩形。
 * 圆形。
 * 花形。
 * 矩形。
 * 圆形。
 * 花形。
 * 三角形。
 */
public class Main {

    /**
     * 程序入口。
     *
     * 演示了"多态的数组遍历"的典型应用：
     *
     * 【核心思想】
     * 将不同子类对象放入同一个父类类型数组中，
     * 遍历时使用统一的父类引用调用 draw() 方法，
     * 实际执行的却是各个子类的重写版本 —— 这就是多态。
     *
     * 【可扩展性】
     * shapes1 数组包含 Rect、Cycle、Flower 三种图形，
     * shapes2 数组新增了 Triangle —— 无需修改遍历逻辑，
     * 新增的 Triangle 自动融入多态体系，体现了"对扩展开放"的设计原则。
     *
     * 【预期输出】
     * 第一个循环：矩形、圆形、花形
     * 第二个循环：矩形、圆形、花形、三角形
     */
    public static void main(String[] args) {
        // 第一个图形数组：含 3 种图形
        Shape[] shapes1 = {new Rect(), new Cycle(), new Flower()};

        // 遍历数组，每轮循环中的 shape 引用指向不同的子类对象
        for (Shape shape : shapes1) {
            shape.draw();     // 多态：实际调用的是各子类的 draw()
        }

        // 第二个图形数组：新增 Triangle，再次遍历
        Shape[] shapes2 = {new Rect(), new Cycle(), new Flower(), new Triangle()};

        for (Shape shape : shapes2) {
            shape.draw();     // 多态：Triangle.draw() 自动加入
        }
    }
}
