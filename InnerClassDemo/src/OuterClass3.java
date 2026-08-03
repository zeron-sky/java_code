/**
 * 局部内部类练习：外部类 OuterClass3 + 局部内部类 LocalInner
 *
 * 要点回顾：
 * 1. 局部内部类定义在方法体内部，只能在定义它的方法体内使用
 * 2. 不能被 public / static 等访问修饰符修饰
 * 3. 可以访问外部类的成员变量，也可以访问所在方法的局部变量
 *    （JDK8 起局部变量自动视为 final，不能在内部类中修改）
 */
public class OuterClass3 {

    public int a = 10; // 外部类的实例成员

    // 局部内部类要定义在方法体内部
    public void method() {
        int b = 20; // 方法的局部变量

        class LocalInner {
            public void methodInnerClass() {
                // 局部内部类可以访问外部类的成员变量和方法局部变量
                System.out.println("a = " + a);
                System.out.println("b = " + b);
            }
        }

        // 局部内部类只能在该方法体内使用，其他位置访问不到
        LocalInner localInner = new LocalInner();
        localInner.methodInnerClass();
    }

    public static void main(String[] args) {
        new OuterClass3().method();
    }
}
