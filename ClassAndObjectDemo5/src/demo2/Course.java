package demo2;

/*
Course（课程）：
定义 public String name 字段，值为“普通课程”。
编写 showInfo() 方法，输出“父类课程：”加上父类自己的 name。
*/

/** 普通课程，保存父类课程名称并展示课程信息。 */
public class Course {
    /** 父类中的课程名称。 */
    public String name = "普通课程";

    public void showInfo() {
        System.out.println("父类课程：" + name);
    }
}