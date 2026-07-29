package demo1;

/**
 * 汽车类（继承自Vehicle）
 * 属性：继承自父类的品牌(brand)、行驶速度(speed)
 * 行为：移动move()（重写）、鸣笛honk()
 */
public class Car extends Vehicle {

    // 无参构造方法
    public Car() {
        super();
    }

    // 带参构造方法
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    /**
     * 重写移动方法
     * 输出汽车的移动信息
     */
    @Override
    public void move() {
        System.out.println(getBrand() + "品牌的汽车正在以" + getSpeed() + "km/h的速度行驶中~");
    }

    /**
     * 汽车特有方法：鸣笛
     */
    public void honk() {
        System.out.println("汽车鸣笛：叮~叮~叮~");
    }
}