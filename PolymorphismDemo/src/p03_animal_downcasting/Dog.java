package p03_animal_downcasting;

/**
 * 狗 —— Animal 的子类。
 *
 * 继承 Animal，重写 cry() 方法输出狗的叫声。
 * 拥有自己的独有方法 guardDoor()，父类 Animal 中不存在此方法。
 *
 * 向下转型的体现：当 Dog 对象被赋值给 Animal 引用后，
 * 必须使用 (Dog) 强制转换，才能调用 guardDoor()。
 * 如果错误地将 Cat 对象强制转换为 Dog，会抛出 ClassCastException。
 *
 * @see Animal
 * @see Cat
 * @see Main
 */
public class Dog extends Animal {

    /**
     * 构造一只狗。
     *
     * @param name 狗的名称
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * 狗的叫声 —— 重写父类方法。
     */
    @Override
    public void cry() {
        System.out.println("狗：" + name + "汪汪。");
    }

    /**
     * 狗的独有行为：看门。
     *
     * 此方法仅在 Dog 类中定义，父类 Animal 中没有。
     * 要通过 Animal 引用调用此方法，必须先通过 instanceof 检查类型安全，
     * 再向下转型为 Dog。
     */
    public void guardDoor() {
        System.out.println("狗：" + name + "在看门。");
    }
}
