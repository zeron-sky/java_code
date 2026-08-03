/**
 * 实例内部类练习：外部类 OuterClass2 + 实例内部类 InstanceInner
 * <p>
 * 要点回顾：
 * 1. 实例内部类（未被 static 修饰）必须依附外部类对象才能创建
 * 2. 创建方式：外部类对象.new 内部类()，如 outer.new InstanceInner()
 * 3. 实例内部类可以直接访问外部类的所有成员（实例成员和静态成员都可以）
 * 4. 成员重名时：裸写 c 访问自己的，外部类名.this.c 访问外部类的
 */
public class OuterClass2 {

    public int a = 10;        // 外部类的实例成员
    public static int b = 20; // 外部类的静态成员
    public int c = 30;        // 外部类的实例成员（与内部类的 c 重名）

    // 实例内部类：未被 static 修饰的成员内部类
    public class InstanceInner {

        public int c = 40; // 内部类的实例成员（与外部类的 c 重名）

        public void methodInner() {
            // 实例内部类可以直接访问外部类的所有成员（不需要借助引用）
            a = 100;             // 修改外部类实例成员
            OuterClass2.b = 200; // 修改外部类静态成员（写清楚类名，来源更明确）

            System.out.println("通过内部类对象访问外部类的成员变量 a, a = " + a);
            System.out.println("通过内部类对象访问外部类的成员变量 b, b = " + b);

            System.out.println("\n==============================================");

            // 成员重名时，实例内部类优先访问自己的成员变量
            System.out.println("通过内部类对象访问内部类的成员变量 c, c = " + c);

            // 要访问外部类重名的成员变量，必须用 外部类名.this.成员变量名
            System.out.println("通过内部类对象访问外部类成员变量 c, c = " + OuterClass2.this.c);
        }
    }

    public static void main(String[] args) {
        // 创建外部类对象
        OuterClass2 outer = new OuterClass2();
        System.out.println("\n==============================================");
        System.out.println("通过外部类对象访问成员变量 a, a = " + outer.a);
        System.out.println("通过外部类对象访问成员变量 b, b = " + OuterClass2.b);
        System.out.println("通过外部类对象访问成员变量 c, c = " + outer.c);

        // 写法一：i1 依附 outer，内部类修改 a 的效果可以在 outer 上看到
        OuterClass2.InstanceInner i1 = outer.new InstanceInner();
        i1.methodInner();
        // 修改后回看外部类对象，a 从 10 变成 100，证明内部类确实改动了外部类
        System.out.println("\n修改后，通过外部类对象 outer 访问 a, a = " + outer.a);

        System.out.println("\n==============================================");

        // 写法二：先创建外部类对象，再用它创建内部类对象
        OuterClass2 outer2 = new OuterClass2();
        OuterClass2.InstanceInner i2 = outer2.new InstanceInner();
        i2.methodInner();
    }
}
