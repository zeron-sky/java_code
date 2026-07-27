package demo2;

/*LiveCourse（直播课程）：继承 Course
- 也定义 public String name
- 编写 showInfo() 方法，依次完成：
  ① 输出“子类课程：”加上子类自己的 name
  ② 使用 super.name 输出“父类课程
  ③ 调用 super.showInfo()。*/

/** 直播课程，通过同名字段和方法演示子类与父类成员的访问区别。 */
public class LiveCourse extends Course {
    /** 子类课程名称，隐藏父类中同名的 name 字段。 */
    public String name;

    public void showInfo() {
        System.out.println("子类课程：" + name);

        // 通过 super 访问被同名字段隐藏的父类名称。
        System.out.println("父类课程：" + super.name);
        // 调用父类的同名方法。
        super.showInfo();
    }
}
