package p02_account_factory;

/**
 * 储蓄账户 —— Account 的子类，代表银行储蓄账户类型。
 *
 * 与 CreditAccount 类似，通过继承复用父类结构，
 * 并重写 showAccount() 提供储蓄账户特有的展示方式。
 *
 * 多态体现：CreditAccount 和 SavingsAccount 都重写了 showAccount()，
 * 但输出内容不同 —— 同一个方法调用在不同子类中有不同表现。
 *
 * @see Account
 * @see CreditAccount
 */
public class SavingsAccount extends Account {

    /**
     * 构造一个储蓄账户。
     *
     * @param ownerName 开户人姓名，传递给父类构造器
     */
    public SavingsAccount(String ownerName) {
        super(ownerName);
    }

    /**
     * 以储蓄账户的格式展示账户信息。
     * 重写父类 showAccount()，输出储蓄账户标识和开户人姓名。
     */
    @Override
    public void showAccount() {
        System.out.println("储蓄账户：" + ownerName + "。");
    }
}
