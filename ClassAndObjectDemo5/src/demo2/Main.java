package demo2;

/*
 * 第 2 题
 *
 * 完成 Course（课程）和 LiveCourse（直播课程）两个类，
 * LiveCourse 继承 Course。
 *
 * 两个类都有名称（name）：课程名称为“普通课程”，直播课程名称为“直播课程”。
 *
 * 展示直播课程信息时，依次展示直播课程的名称和课程的名称，
 * 并再次展示课程的名称。
 *
 * 在 main（主方法）中创建一个直播课程对象并展示信息。
 *
 * 预期输出：
 * 子类课程：直播课程
 * 父类课程：普通课程
 * 父类课程：普通课程
 */
public class Main {
    public static void main(String[] args) {
        LiveCourse course = new LiveCourse();
        course.name = "直播课程";

        course.showInfo();
    }
}
