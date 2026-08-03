/**
 * 匿名内部类练习：没有类名，声明的同时完成实例化
 *
 * 要点回顾：
 * 1. 语法格式：new 接口/抽象类/具体类() { 类体 };
 *    没有类名，new 和实例化一步完成
 * 2. 必须实现父类型中的所有抽象方法（这里是 greet()）
 * 3. 结尾要有分号：};  不要漏掉
 * 4. 常用于创建只使用一次的类，如给按钮加事件、给排序传比较器
 * 5. 类体内可以定义成员变量（和普通类一样）
 * 6. 类体里只能写成员声明，不能直接写执行语句（执行语句要放进方法里）
 */
public class OuterClass4 {

    public static void main(String[] args) {
        // 匿名内部类：没有类名，new 接口的同时完成实例化
        Greeting greeting = new Greeting() {
            // 匿名内部类可以定义成员变量
            private String name = "小明";

            @Override
            public void greet() {
                System.out.println("Hello " + name);
            }
        };
        greeting.greet();
    }
}

// 供匿名内部类实现的接口（可以换成抽象类或具体类）
interface Greeting {
    void greet();
}
