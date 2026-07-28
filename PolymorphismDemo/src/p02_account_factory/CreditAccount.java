package p02_account_factory;

/**
 * 信用账户 —— Account 的子类，代表银行信用账户类型。
 *
 * 通过继承复用了父类的 ownerName 属性和构造逻辑，
 * 并通过 @Override 重写 showAccount() 方法，
 * 在展示时明确标识为"信用账户"。
 *
 * 多态体现：当 Account 引用指向 CreditAccount 对象时，
 * showAccount() 实际执行的是本类的重写版本。
 *
 * @see Account
 * @see SavingsAccount
 */
public class CreditAccount extends Account {

    /**
     * 构造一个信用账户。
     *
     * @param ownerName 开户人姓名，传递给父类构造器
     */
    public CreditAccount(String ownerName) {
        super(ownerName);
    }

    /**
     * 以信用账户的格式展示账户信息。
     * 重写父类 showAccount()，输出信用账户标识和开户人姓名。
     */
    @Override
    public void showAccount() {
        System.out.println("信用账户：" + ownerName + "。");
    }
}
