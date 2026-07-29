package demo1;

/**
 * 交通工具类（父类）
 * 属性：品牌(brand)、行驶速度(speed)
 * 行为：移动move()
 */
public class Vehicle {
    private String brand; // 品牌
    private int speed;    // 行驶速度

    // 无参构造方法
    public Vehicle() {
        this("未命名", 0);
    }

    // 带参构造方法
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // getter和setter方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * 移动方法
     * 输出交通工具的移动信息
     */
    public void move() {
        System.out.println(brand + "品牌的交通工具正在以" + speed + "km/h的速度行驶中~");
    }
}