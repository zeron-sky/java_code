package demo4;

/*
 * 第 4 题
 *
 * 某共享出行平台需要记录电动车信息。请完成 Vehicle（交通工具）和
 * ElectricCar（电动车）两个类，ElectricCar 继承 Vehicle。
 *
 * 每辆交通工具都要记录品牌（brand）；每辆电动车还要记录当前电量（batteryLevel）。
 *
 * 平台有两种登记电动车的方式：
 * 1. 未提供品牌和电量：系统自动登记为“未知品牌”，电量为 100。
 * 2. 已提供品牌和电量：使用登记时提供的信息。
 *
 * 在 main（主方法）中：
 * 1. 按第一种方式登记一辆电动车，并输出：品牌，电量：电量值。
 * 2. 按第二种方式登记一辆品牌为“比亚迪”、电量为 80 的电动车，
 *    并按相同格式输出。
 *
 * 预期输出：
 * 未知品牌，电量：100
 * 比亚迪，电量：80
 */
public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar1 = new ElectricCar();
        ElectricCar electricCar2 = new ElectricCar("比亚迪", 80);
        System.out.println(electricCar1.brand + ", 电量：" + electricCar1.batteryLevel);
        System.out.println(electricCar2.brand + ", 电量：" + electricCar2.batteryLevel);
    }
}
