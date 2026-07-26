package demo2;

/*
 * 第 2 题
 *
 * 请完成三个类：
 * 1. Employee（员工）：有 name（姓名）和 age（年龄）两个字段。
 * 2. Developer（开发人员）：继承 Employee，新增 language（编程语言）字段，
 *    并编写 showInfo()（展示信息）方法，输出姓名、年龄和编程语言。
 * 3. 在 main（主方法）中创建 Developer（开发人员）对象，分别赋值后调用 showInfo()。
 */
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.name = "张三";
        developer.age = 22;
        developer.language = "java";

        developer.showInfo();
    }
}
