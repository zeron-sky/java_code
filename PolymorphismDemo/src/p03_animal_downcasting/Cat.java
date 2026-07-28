package p03_animal_downcasting;

/**
 * 猫 —— Animal 的子类。
 *
 * 继承 Animal，重写 cry() 方法输出猫的叫声。
 * 同时拥有自己的独有方法 catchMouse()，父类 Animal 中不存在此方法。
 *
 * 向下转型的意义：当 Cat 对象被赋值给 Animal 类型的引用时（向上转型），
 * 如果想让猫去"捉老鼠"，必须先将 Animal 引用强制转回 Cat 类型，
 * 才能调用 catchMouse() 这个子类独有方法。
 *
 * @see Animal
 * @see Dog
 * @see Main
 */
public class Cat extends Animal {

    /**
     * 构造一只猫。
     *
     * @param name 猫的名称
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * 猫的叫声 —— 重写父类方法。
     */
    @Override
    public void cry() {
        System.out.println("猫：" + name + "喵喵。");
    }

    /**
     * 猫的独有行为：捉老鼠。
     *
     * 此方法仅在 Cat 类中定义，父类 Animal 中没有。
     * 要通过 Animal 引用调用此方法，必须向下转型为 Cat。
     */
    public void catchMouse() {
        System.out.println("猫：" + name + "在捉老鼠。");
    }
}
