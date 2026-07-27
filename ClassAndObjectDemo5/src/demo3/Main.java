package demo3;

/*
 * 第 3 题
 *
 * 完成 Account（账户）和 SavingsAccount（储蓄账户）两个类，
 * SavingsAccount 继承 Account。
 *
 * 账户包含开户人（owner）信息；储蓄账户还包含利率（interestRate）信息。
 *
 * 创建一个开户人为“李华”、利率为 0.03 的储蓄账户。
 * 创建过程中，分别输出账户创建信息和储蓄账户创建信息。
 *
 * 预期输出：
 * 父类账户创建：李华
 * 子类储蓄账户创建，利率：0.03
 *
 */
public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("李华", 0.03);
    }
}
