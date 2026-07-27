package demo4;

/** 电动车继承交通工具的品牌信息，并增加电量信息。 */
public class ElectricCar extends Vehicle{
    /** 当前电量。 */
    public int batteryLevel;

    /** 创建默认品牌、满电状态的电动车。 */
    public ElectricCar() {
        super();
        this.batteryLevel = 100;
    }

    /** 使用提供的品牌和电量创建电动车。 */
    public ElectricCar(String brand, int batteryLevel) {
        super(brand);
        this.batteryLevel = batteryLevel;
    }
}