package demo1;
/*
 * 第 1 题
 *
 * 请写三个类：
 * 1. Device（设备）：有 brand（品牌）字段，以及 powerOn()（开机）方法，输出“设备已开机”。
 * 2. Phone（手机）：继承 Device，新增 call()（通话）方法，输出“正在通话”。
 * 3. 在 main（主方法）中创建一个 Phone（手机）对象，给它的 brand（品牌）赋值，
 *    然后依次调用 powerOn()（开机）和 call()（通话）。
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "小米";
        phone.powerOn();
        phone.call();
    }
}
