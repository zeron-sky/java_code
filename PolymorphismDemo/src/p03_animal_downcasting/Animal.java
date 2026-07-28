package p03_animal_downcasting;

/**
 * 动物基类 —— 动物体系中的父类。
 *
 * 定义了所有动物的共同特征：
 * <ul>
 *   <li>名称（name）—— 每只动物都有名字</li>
 *   <li>叫声行为（cry()）—— 每种动物的叫声不同，由子类重写</li>
 * </ul>
 *
 * 本包（p03_animal_downcasting）的核心目的是演示"向下转型"（Downcasting）：
 * 当通过父类引用操作子类对象时，如果需要调用子类独有的方法，
 * 必须使用强制类型转换将父类引用转回子类类型。
 *
 * @see Cat
 * @see Dog
 */
public class Animal {

    /** 动物名称 */
    public String name;

    /**
     * 构造一只动物。
     *
     * @param name 动物名称
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * 发出叫声 —— 默认实现。
     * 子类应重写此方法以输出各自特有的叫声。
     */
    public void cry() {
        System.out.println("正在叫");
    }
}
