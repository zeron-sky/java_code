/*
 * 题目 1：
 * 定义一个 Student 类，包含 name（姓名）和 age（年龄）两个成员变量。
 * 定义 introduce() 方法，输出：姓名张三，年龄18岁。
 * 在 exercise1() 方法中创建一个 Student 对象，赋值后调用 introduce()。
 */
class Student {
    // 学生对象的基础属性。
    public String name;
    public int age;

    // 输出当前学生对象的信息。
    public void introduce() {
        System.out.println("学生信息：姓名=" + name + "，年龄=" + age + "岁");
    }
}

/*
 * 题目 2：
 * 定义一个 PetCat 类，包含 name（名字）和 color（颜色）两个成员变量。
 * 定义 meow() 和 sleep() 两个成员方法，分别输出：<名字>：喵喵喵~~~、<名字>：睡觉中~~~。
 * 在 exercise2() 方法中创建两只 PetCat 对象，分别给成员变量赋值，
 * 并通过对象.成员变量和对象.成员方法的方式访问它们。
 */
class PetCat {
    // 宠物猫对象的基础属性。
    public String name;
    public String color;

    // 输出当前宠物猫正在叫的状态。
    public void meow() {
        System.out.println("宠物猫：名字=" + name + "，颜色=" + color + "，状态=喵喵喵~~~");
    }

    // 输出当前宠物猫正在休息的状态。
    public void sleep() {
        System.out.println("宠物猫：名字=" + name + "，颜色=" + color + "，状态=睡觉中~~~");
    }
}

/*
 * 题目 3：
 * 定义一个 Clock 类，包含 hour（时）、minute（分）和 second（秒）三个成员变量。
 * 定义 setTime(int hour, int minute, int second) 方法：方法参数名必须与成员变量同名，
 * 并使用 this 为当前对象的成员变量赋值。
 * 定义 printTime() 方法，输出格式：时:分:秒。
 * 在 exercise3() 方法中创建两个 Clock 对象，分别设置不同时间并打印。
 */
class Clock {
    // 时钟对象保存的时间。
    public int hour;
    public int minute;
    public int second;

    // 使用 this 区分成员变量和同名参数，为当前对象设置时间。
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // 输出当前对象保存的时间。
    public void printTime() {
        System.out.println("当前时间：" + hour + "时" + minute + "分" + second + "秒");
    }
}

/*
 * 早期的扩展示例草稿：本节练习不调用它，但保留其对象属性和方法定义。
 */
class GamePlayer {
    // 玩家对象的基础属性。
    public String name;
    public int hp;

    // 预留的攻击行为，当前练习未实现也未调用。
    public void attack(GamePlayer target, int damage) {

    }
}

/*
 * 题目 4：
 * 定义一个 Book 类，包含 title（书名）、price（价格）和 borrowed（是否已借出）三个成员变量。
 * 不要给这三个成员变量赋初始值。
 * 定义 printInfo() 方法，打印三个成员变量的值。
 * 在 exercise4() 方法中创建一个 Book 对象，不给任何成员变量赋值，直接调用 printInfo()，
 * 观察对象成员变量的默认值。
 */
class Book {
    // 未显式赋值，用于观察成员变量的默认值。
    public String title;
    public int price;
    public boolean borrowed;

    // 直接输出成员变量，便于查看默认初始化结果。
    public void printInfo() {
        System.out.println("图书信息：书名=" + title + "，价格=" + price + "，是否借出=" + borrowed);
    }
}

/*
 * 题目 5：
 * 定义一个 GameAccount 类，包含 username（用户名）、level（等级）和 vip（是否为会员）三个成员变量。
 * 在声明成员变量时，分别进行就地初始化："游客"、1、false。
 * 定义 printInfo() 方法，打印三个成员变量的值。
 * 在 exercise5() 方法中创建一个 GameAccount 对象，不再额外赋值，直接调用 printInfo()。
 */
class GameAccount {
    // 在声明成员变量时完成就地初始化。
    public String username = "游客";
    public int level = 1;
    public boolean vip = false;

    // 输出当前账号的默认信息。
    public void printInfo() {
        System.out.println("账号信息：用户名=" + username + "，等级=" + level + "，会员=" + vip);
    }
}

/*
 * 题目 6：
 * 定义一个 Point 类，包含 x 和 y 两个整型成员变量。
 * 定义一个带两个 int 参数的构造方法 Point(int x, int y)，使用 this 为成员变量赋值，
 * 并在构造方法中输出：Point(int, int) 构造方法被调用。
 * 定义 printPoint() 方法，输出坐标，格式：(x, y)。
 * 在 exercise6() 方法中使用 new Point(3, 5) 创建对象；不要显式调用构造方法，
 * 再调用 printPoint()。
 */
class Point {
    // 坐标点的横、纵坐标。
    public int x;
    public int y;

    // 创建对象时使用传入坐标完成初始化。
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("构造方法提示：Point(int, int) 已被自动调用");
    }

    // 输出当前坐标点的位置。
    public void printPoint() {
        System.out.println("坐标信息：(" + x + ", " + y + ")");
    }
}

/*
 * 题目 7：
 * 定义一个 Product 类，包含 name（商品名）和 price（价格）两个成员变量。
 * 定义两个构造方法：
 * 1. Product()：将 name 初始化为“未命名商品”，price 初始化为 0。
 * 2. Product(String name, double price)：使用 this 为成员变量赋值。
 * 定义 printInfo() 方法，输出商品名和价格。
 * 在 exercise7() 方法中分别使用 new Product() 和 new Product("键盘", 99.9) 创建两个对象，
 * 并打印它们的信息。
 */
class Product {
    // 商品的基础信息。
    public String name;
    public double price;

    // 无参构造方法提供默认商品信息。
    public Product() {
        name = "未命名商品";
        price = 0.0;
    }

    // 有参构造方法使用 this 为当前对象赋值。
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // 输出当前商品信息。
    public void printInfo() {
        System.out.println("商品信息：名称=" + name + "，价格=" + price + "元");
    }
}

/*
 * 题目 8：
 * 定义一个 MobilePhone 类，包含 brand（品牌）、storage（存储容量）和 price（价格）三个成员变量。
 * 定义两个构造方法：
 * 1. MobilePhone()：必须使用 this("未知品牌", 128, 0.0) 调用另一个构造方法。
 * 2. MobilePhone(String brand, int storage, double price)：使用 this 为成员变量赋值。
 * 定义 printInfo() 方法，打印三个成员变量的值。
 * 在 exercise8() 方法中分别创建一个无参对象和一个带参对象，并打印它们的信息。
 */
class MobilePhone {
    // 手机对象的基础信息。
    String brand;
    int storage;
    double price;

    // 无参构造方法复用有参构造方法提供默认配置。
    public MobilePhone() {
        this("未知品牌", 128, 0.0);
    }

    // 有参构造方法使用 this 为当前对象赋值。
    public MobilePhone(String brand, int storage, double price) {
        this.brand = brand;
        this.storage = storage;
        this.price = price;
    }

    // 输出当前手机信息。
    public void printInfo() {
        System.out.println("手机信息：品牌=" + brand + "，存储=" + storage + "GB，价格=" + price + "元");
    }
}

/*
 * 题目 9：
 * 定义一个 Employee 类，包含 name（姓名）、department（部门）和 age（年龄）三个成员变量。
 * 定义带三个参数的构造方法，使用 this 为成员变量赋值。
 * 重写 toString() 方法，返回格式：[姓名,部门,年龄]。
 * 在 exercise9() 方法中创建一个 Employee 对象，并直接使用 System.out.println(对象) 打印它，
 * 不要手动调用 toString()。
 */
class Employee {
    // 员工对象的基础信息。
    String name;
    String department;
    int age;

    // 有参构造方法使用 this 为当前对象赋值。
    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    // 重写对象的默认打印内容，返回便于阅读的员工信息。
    public String toString() {
        return "员工信息：[姓名=" + name + "，部门=" + department + "，年龄=" + age + "岁]";
    }

}

/*
 * 题目 10：
 * 定义一个 CourseInfo 类，包含 name（课程名）和 hours（课时）两个成员变量。
 * 定义无参构造方法，使用 this("未命名课程", 0) 调用有参构造方法。
 * 定义有参构造方法 CourseInfo(String name, int hours)，使用 this 为成员变量赋值。
 * 重写 toString() 方法，返回格式：[课程名,课时]。
 * 在 exercise10() 方法中创建一个无参对象和一个带参对象，并直接打印这两个对象。
 */
class CourseInfo {
    // 课程对象的基础信息。
    String name;
    int hours;

    // 无参构造方法复用有参构造方法提供默认课程信息。
    public CourseInfo() {
        this("未命名课程", 0);
    }

    // 有参构造方法使用 this 为当前对象赋值。
    public CourseInfo(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    // 重写对象的默认打印内容，返回便于阅读的课程信息。
    public String toString() {
        return "课程信息：[课程名=" + name + "，课时=" + hours + "小时]";
    }
}

public class Main {
    // 按题目顺序运行本节所有练习。
    public static void main(String[] args) {
        System.out.println("========== 题目 1：类、成员变量和成员方法 ==========");
        exercise1();

        System.out.println();
        System.out.println("========== 题目 2：多个对象和成员访问 ==========");
        exercise2();

        System.out.println();
        System.out.println("========== 题目 3：this 关键字 ==========");
        exercise3();

        System.out.println();
        System.out.println("========== 题目 4：成员变量默认初始化 ==========");
        exercise4();

        System.out.println();
        System.out.println("========== 题目 5：就地初始化 ==========");
        exercise5();

        System.out.println();
        System.out.println("========== 题目 6：有参构造方法 ==========");
        exercise6();

        System.out.println();
        System.out.println("========== 题目 7：构造方法重载 ==========");
        exercise7();

        System.out.println();
        System.out.println("========== 题目 8：构造方法 this() 调用 ==========");
        exercise8();

        System.out.println();
        System.out.println("========== 题目 9：toString() ==========");
        exercise9();

        System.out.println();
        System.out.println("========== 题目 10：综合练习 ==========");
        exercise10();
        System.out.println("========== 本节练习结束 ==========");
    }

    // 创建学生对象，演示对象成员的赋值和方法调用。
    public static void exercise1() {
        Student student = new Student();
        student.name = "张三";
        student.age = 18;
        student.introduce();
    }

    // 创建两只不同的宠物猫，演示同一类可实例化多个对象。
    public static void exercise2() {
        PetCat petCat1 = new PetCat();

        petCat1.name = "小咪";
        petCat1.color = "白色";
        petCat1.meow();
        petCat1.sleep();

        PetCat petCat2 = new PetCat();
        petCat2.name = "花花";
        petCat2.color = "黑色";
        petCat2.meow();
        petCat2.sleep();

    }

    // 通过同名参数和成员变量，练习 this 的使用。
    public static void exercise3() {
        Clock clock1 = new Clock();
        clock1.setTime(6, 6, 6);
        clock1.printTime();

        Clock clock2 = new Clock();
        clock2.setTime(12, 12, 12);
        clock2.printTime();

    }

    // 不赋值直接打印，观察对象成员变量的默认值。
    public static void exercise4() {
        Book book = new Book();
        book.printInfo();
    }

    // 创建对象后直接打印，观察成员变量的就地初始化结果。
    public static void exercise5() {
        GameAccount gameaccount = new GameAccount();
        gameaccount.printInfo();
    }

    // 使用 new Point(3, 5) 触发有参构造方法。
    public static void exercise6() {
        Point point = new Point(3, 5);
        point.printPoint();
    }

    // 分别调用无参和有参构造方法，演示构造方法重载。
    public static void exercise7() {
        Product product1 = new Product();
        Product product2 = new Product("巧乐兹", 5.5);
        Product product3 = new Product("雪碧", 3.5);

        product1.printInfo();
        product2.printInfo();
        product3.printInfo();
    }

    // 分别调用无参和有参构造方法，演示 this() 调用。
    public static void exercise8() {
        MobilePhone mp1 = new MobilePhone();
        MobilePhone mp2 = new MobilePhone("小米", 256, 1999);
        mp1.printInfo();
        mp2.printInfo();
    }

    // 直接打印对象，演示 toString() 会被自动调用。
    public static void exercise9() {
        Employee employee = new Employee("张三", "技术部", 18);
        System.out.println(employee);
    }

    // 综合使用构造方法、this() 和 toString()。
    public static void exercise10() {
        CourseInfo course1 = new CourseInfo();
        CourseInfo course2 = new CourseInfo("java课程", 5);

        System.out.println(course1);
        System.out.println(course2);
    }
}
