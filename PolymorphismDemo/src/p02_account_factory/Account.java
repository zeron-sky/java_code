package p02_account_factory;

/**
 * 账户基类 —— 银行账户体系中的父类。
 *
 * 本类是所有账户类型的共同抽象，定义了：
 * <ul>
 *   <li>开户人姓名（ownerName）—— 每个账户必备的信息</li>
 *   <li>账户展示行为（showAccount()）—— 由子类各自重写提供具体展示</li>
 * </ul>
 *
 * 配合工厂方法（Main.openAccount()），展示了"多态 + 简单工厂"的经典组合：
 * - 父类定义统一接口（showAccount）
 * - 子类提供不同实现
 * - 工厂方法根据条件创建不同子类，以父类形式返回
 *
 * @see SavingsAccount
 * @see CreditAccount
 * @see Main
 */
public class Account {

    /** 开户人姓名 —— 所有账户都共有的信息 */
    public String ownerName;

    /**
     * 构造一个账户。
     *
     * @param ownerName 开户人姓名
     */
    public Account(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * 展示账户信息 —— 默认实现。
     *
     * 子类应重写此方法以输出各自特有的账户类型标识。
     */
    public void showAccount() {
        System.out.println("账户：" + ownerName);
    }
}
