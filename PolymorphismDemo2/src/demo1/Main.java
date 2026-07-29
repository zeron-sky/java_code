package demo1;

/**
 * 测试类：演示多态的综合练习
 * 功能：创建Person对象，让这个人使用任意一款交通工具
 */
public class Main {
    public static void main(String[] args) {
        // 创建Person对象
        Person person = new Person("李明", 22, "男");
        System.out.println("===== 人员信息 =====");
        System.out.println("名字：" + person.getName());
        System.out.println("年龄：" + person.getAge());
        System.out.println("性别：" + person.getGender());
        System.out.println();

        // 创建交通工具对象（向上转型）
        Vehicle car = new Car("劳斯莱斯", 60);
        Vehicle bicycle = new Bicycle("梅花", 25);

        // 人驾驶汽车
        System.out.println("===== 驾驶汽车 =====");
        person.drive(car);
        System.out.println();

        // 人骑自行车
        System.out.println("===== 骑自行车 =====");
        person.drive(bicycle);
    }
}