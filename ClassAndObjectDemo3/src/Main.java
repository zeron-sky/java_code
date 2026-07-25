/**
 * 第1题：封装 - private 与 getter/setter
 * <p>
 * 创建 Account，属性私有，通过 get/set 访问；setBalance 拒绝负数。
 * main 中分别 set -100 和 1000，观察结果。
 */
class Account {
    private String accountName;
    private double balance;

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("余额不足");
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }
}

/**
 * 第2题：static 修饰成员变量
 * <p>
 * 场景：网吧里多台电脑，机房名称对所有电脑相同。
 * 要求：
 * 1. 写 Computer 类：实例属性 name（机器名）；静态属性 roomName（机房名，初始值自定）
 * 2. main 中创建 2~3 台电脑，用类名访问并打印 roomName
 * 3. 再通过其中一个对象改 roomName，打印各对象看到的 roomName，观察是否共享
 */
class Computer {
    public String name;
    public static String roomName = "学校机房";

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }
}


/**
 * 第3题：static 修饰成员方法
 * <p>
 * 场景：机房名是全班共享信息，且不允许在类外直接读写字段。
 * 要求：
 * 1. 用静态方式保存机房名，并做成类外不能直接访问
 * 2. 提供类级别的查询方式，在 main 里不创建对象也能查到机房名并打印
 */
class Lab {
    private static String roomName = "301机房";

    public static String getRoomName() {
        return roomName;
    }
}


public class Main {
    public static void main(String[] args) {
        // ===== 第1题 =====
        System.out.println("========== 第1题 ==========");
        Account ac = new Account();
        ac.setAccountName("abc");
        ac.setBalance(-100);

        System.out.println(ac.getAccountName());
        System.out.println(ac.getBalance());
        System.out.println();

        // ===== 第2题 =====
        System.out.println("========== 第2题 ==========");
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        computer1.name = "联想";
        computer2.name = "华硕";

        // 推荐用类名访问静态变量
        System.out.println(Computer.roomName);

        // 改一次 roomName，观察是否共享
        Computer.roomName = "新机房";
        System.out.println(computer1.roomName);
        System.out.println(computer2.roomName);
        System.out.println(Computer.roomName);

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println();

        // ===== 第3题 =====
        System.out.println("========== 第3题 ==========");
        System.out.println(Lab.getRoomName());
        System.out.println();
    }
}
