package p03_animal_downcasting;

/*
 * 动物的向下转型
 *
 * 请创建动物（Animal）、猫（Cat）和狗（Dog）三个类，且每个类单独存放在对应的文件中。
 *
 * 业务规则：
 * 1. 动物都有名称（name）。
 * 2. 猫（Cat）继承动物，叫声（cry）时输出：猫：<名称>喵喵。
 * 3. 狗（Dog）继承动物，叫声（cry）时输出：狗：<名称>汪汪。
 * 4. 猫独有的捉老鼠功能（catchMouse）输出：猫：<名称>在捉老鼠。
 * 5. 狗独有的看门功能（guardDoor）输出：狗：<名称>在看门。
 * 6. 程序启动后，依次完成：
 *    - 创建名称"咪咪"的猫和名称"旺财"的狗，分别使用动物引用指向它们；
 *    - 让猫和狗各自发出叫声；
 *    - 让狗在自己的引用下执行看门功能；
 *    - 尝试将猫的引用当作狗处理会导致运行异常。
 *
 * 预期控制台输出：
 * 猫：咪咪喵喵。
 * 狗：旺财汪汪。
 * 狗：旺财在看门。
 */
public class Main {

    /**
     * 程序入口。
     *
     * 演示了向上转型（Upcasting）与向下转型（Downcasting）两个核心概念：
     *
     * 【向上转型】（多态的基础）
     *   - Animal cat = new Cat("咪咪") —— 子类对象赋值给父类引用
     *   - 通过父类引用调用的方法（如 cry()）由 JVM 动态绑定到子类实现
     *
     * 【向下转型】（调用子类独有方法的手段）
     *   - 当需要调用子类独有的方法（如 Dog.guardDoor()）时，
     *     不能通过父类引用直接调用，必须将父类引用强制转回子类类型
     *   - 强制转换前应使用 instanceof 检查类型安全，
     *     否则可能抛出 ClassCastException
     */
    public static void main(String[] args) {
        // 向上转型：创建子类对象，赋值给父类类型的引用
        // 变量 cat 的"编译时类型"是 Animal，"运行时类型"是 Cat
        Animal cat = new Cat("咪咪");
        Animal dog = new Dog("旺财");

        // 动态绑定：编译看 Animal，运行看 Cat/Dog
        // cat 的编译类型是 Animal（有 cry() 方法），实际调用的是 Cat.cry()
        cat.cry();
        dog.cry();

        // 向下转型：先通过 instanceof 安全检查，再强制转换
        if (dog instanceof Dog) {
            // 将父类引用强制转为子类引用，才能调用子类独有方法
            Dog realdog = (Dog) dog;
            realdog.guardDoor();
        }

        // 风险提示：如果取消下一行的注释，会抛出 ClassCastException
        // 因为 cat 的实际类型是 Cat，不能强制转换为 Dog
        // Dog fakeDog = (Dog) cat;  // ❌ 运行异常！
    }
}
