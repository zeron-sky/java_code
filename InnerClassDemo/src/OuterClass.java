/**
 * 静态内部类练习：外部类 OuterClass + 静态内部类 StaticInner
 * <p>
 * 要点回顾：
 * 1. 创建静态内部类对象不需要先创建外部类对象：new OuterClass.StaticInner()
 * 2. 静态内部类可以直接访问外部类的静态成员（如 b）
 * 3. 静态内部类不能直接访问外部类的实例成员（如 a），必须借助外部类对象的引用
 * 4. 静态内部类中可以定义静态成员（如 d），实例内部类做不到
 */
public class OuterClass {

    public int a;          // 外部类的实例成员
    public static int b;   // 外部类的静态成员

    // 静态内部类：被 static 修饰的成员内部类
    static class StaticInner {

        public int c;          // 内部类的实例成员
        public static int d;   // 内部类的静态成员

        public void show() {
            // System.out.println(a); // 编译报错：静态内部类没有外部类对象引用，不能直接访问实例成员 a

            System.out.println("外部类静态成员 b = " + b); // 静态内部类可以直接访问外部类的静态成员
            System.out.println("内部类实例成员 c = " + c); // 访问自己的实例成员
            System.out.println("内部类静态成员 d = " + d); // 访问自己的静态成员
        }

        // 通过外部类对象引用，访问外部类的实例成员
        public void showOuterField(OuterClass outer) {
            System.out.println("通过外部类引用访问实例成员 a = " + outer.a);
        }
    }

    public static void main(String[] args) {
        // 外部类对象：用来给实例成员 a 赋值
        OuterClass o = new OuterClass();
        o.a = 10;
        OuterClass.b = 20;

        // 创建静态内部类对象：不需要外部类对象
        OuterClass.StaticInner si = new OuterClass.StaticInner();
        si.c = 10;          // 实例成员：必须通过对象访问
        StaticInner.d = 20; // 静态成员：通过类名访问

        si.show();
        si.showOuterField(o); // 把外部类对象传给静态内部类，让它能访问 a
    }
}
