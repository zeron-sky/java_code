package demo1;

/**
 * 自行车类（继承自Vehicle）
 * 属性：继承自父类的品牌(brand)、行驶速度(speed)
 * 行为：移动move()（重写）、响铃ringBell()
 */
public class Bicycle extends Vehicle {

    // 无参构造方法
    public Bicycle() {
        super();
    }

    // 带参构造方法
    public Bicycle(String brand, int speed) {
        super(brand, speed);
    }

    /**
     * 重写移动方法
     * 输出自行车的移动信息
     */
    @Override
    public void move() {
        System.out.println(getBrand() + "品牌的自行车正在以" + getSpeed() + "km/h的速度行驶中~");
    }

    /**
     * 自行车特有方法：响铃
     */
    public void ringBell() {
        System.out.println("自行车响铃：滴~滴~滴~");
    }
}