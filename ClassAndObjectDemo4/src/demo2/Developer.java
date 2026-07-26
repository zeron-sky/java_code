package demo2;

public class Developer extends Employee {
    public String language;

    public void showInfo() {
        //输出姓名、年龄和编程语言
        System.out.println("姓名：" + this.name + " ,年龄：" + this.age + " ,编程语言：" + this.language);
    }
}