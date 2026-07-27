package demo3;

/*Account（账户）：
- 定义 public String owner 字段。
- 编写一个带 String owner 参数的构造方法。
- 在该构造方法中为 owner 赋值，并输出“父类账户创建：”加上 owner。*/

/** 账户父类，负责保存开户人信息。 */
public class Account {
    /** 账户开户人。 */
    public String owner;

    /** 初始化父类部分的开户人信息。 */
    public Account(String owner) {
        this.owner = owner;
        System.out.println("父类账户创建：" + owner);
    }
}