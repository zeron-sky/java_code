package demo1;

/**
 * 人类
 * 属性：名字(name)、年龄(age)、性别(gender)
 * 行为：行驶交通工具drive()（能使用所有交通工具）
 */
public class Person {
    private String name;   // 名字
    private int age;       // 年龄
    private String gender; // 性别

    // 无参构造方法
    public Person() {
        this("未知", 0, "未知");
    }

    // 带参构造方法
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 行驶交通工具方法（多态）
     * 参数类型为父类Vehicle，可以接收任何Vehicle的子类对象
     * 通过instanceof判断具体类型，向下转型调用子类特有方法
     *
     * @param vehicle 交通工具对象
     */
    public void drive(Vehicle vehicle) {
        // 调用移动方法（多态：根据实际类型调用重写的方法）
        vehicle.move();

        // 向下转型：判断具体类型并调用子类特有方法
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle; // 向下转型
            car.honk();              // 调用汽车的鸣笛方法
        } else if (vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle; // 向下转型
            bicycle.ringBell();                  // 调用自行车的响铃方法
        }
    }
}