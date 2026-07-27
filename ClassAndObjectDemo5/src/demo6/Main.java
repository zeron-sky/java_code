package demo6;

/*
 * 第 6 题
 *
 * 某展馆系统需要登记展品。请完成 Exhibit（展品）和
 * DigitalExhibit（数字展品）两个类，DigitalExhibit 继承 Exhibit。
 *
 * 系统首次使用数字展品功能时，需要完成展品系统和数字展品系统的启动；
 * 后续再次登记数字展品时，系统不应重复启动。
 *
 * 每登记一个数字展品，都要完成展品部分和数字展品部分的登记、创建流程。
 * 两部分都应在各自对应阶段输出一条登记信息和一条创建信息。
 *
 * 在 main（主方法）中连续创建两个数字展品对象，使完整输出严格为：
 *
 * 展品系统启动
 * 数字展品系统启动
 * 展品登记
 * 展品创建
 * 数字展品登记
 * 数字展品创建
 * 展品登记
 * 展品创建
 * 数字展品登记
 * 数字展品创建
 *
 * 请自行判断：不同类型的初始化代码应写在哪里，
 * 并保证第二次创建对象不会重复输出系统启动信息。
 */
public class Main {
    public static void main(String[] args) {
        DigitalExhibit exhibit1 = new DigitalExhibit();
        DigitalExhibit exhibit2 = new DigitalExhibit();
    }
}
