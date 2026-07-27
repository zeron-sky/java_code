package demo3;

/*
SavingsAccount（储蓄账户）：继承 Account。
定义 public double interestRate 字段。
编写一个带 String owner 和 double interestRate 参数的构造方法。
在构造方法的第一行使用 super(owner) 调用父类的有参构造方法。
再为 interestRate 赋值，并输出“子类储蓄账户创建，利率：”加上 interestRate。
*/

/** 储蓄账户在账户信息基础上增加利率。 */
public class SavingsAccount extends Account {
    /** 储蓄账户利率。 */
    public double interestRate;

    public SavingsAccount(String owner, double interestRate) {
        // 先调用父类构造方法，完成继承字段的初始化。
        super(owner);
        this.interestRate = interestRate;
        System.out.println("子类储蓄账户创建，利率：" + interestRate);
    }
}