package p02_account_factory;

/*
 * 银行账户开通
 *
 * 某银行系统需要开通并展示两种账户：储蓄账户（SavingsAccount）和信用账户（CreditAccount）。
 * 请创建账户（Account）、储蓄账户（SavingsAccount）和信用账户（CreditAccount）三个类，且每个类单独
 * 存放在对应的文件中。
 *
 * 业务规则：
 * 1. 每个账户都必须记录开户人姓名（ownerName）。
 * 2. 储蓄账户（SavingsAccount）展示（showAccount）时输出：储蓄账户：<开户人>。
 * 3. 信用账户（CreditAccount）展示（showAccount）时输出：信用账户：<开户人>。
 * 4. 系统必须提供统一的账户展示入口（showAccount），用于展示任意一种账户。
 * 5. 系统必须提供账户开通服务（openAccount）。传入“储蓄”时开通储蓄账户，传入“信用”时开通信用账户。
 * 6. 程序启动后，依次完成：
 *    - 开通开户人“陈雨”的储蓄账户，并通过统一展示入口展示；
 *    - 开通开户人“高远”的信用账户，并通过统一展示入口展示。
 *
 * 预期控制台输出：
 * 储蓄账户：陈雨。
 * 信用账户：高远。
 */
public class Main {

    /**
     * 统一的账户展示入口。
     *
     * 多态的应用 —— 参数类型为父类 Account，
     * 实际传入的可以是任意 Account 子类对象。
     * showAccount() 调用时，JVM 动态绑定到子类的重写方法。
     *
     * @param account 任意类型的账户对象（SavingsAccount / CreditAccount 等）
     */
    public static void showAccount(Account account) {
        // 运行时根据 account 的实际类型调用对应的重写方法
        account.showAccount();
    }

    /**
     * 账户开通服务（简单工厂模式）。
     *
     * 根据传入的账户类型字符串，创建对应的具体账户对象，
     * 并以共同的父类型 Account 返回给调用者。
     *
     * 这是"简单工厂"的典型应用 —— 将对象的创建逻辑集中到一处，
     * 调用者无需关心具体子类的构造细节。
     *
     * @param accountType 账户类型标识（"储蓄" 或 "信用"）
     * @param ownerName   开户人姓名
     * @return 创建好的 Account 子类对象，以 Account 类型返回
     */
    public static Account openAccount(String accountType, String ownerName) {
        if ("储蓄".equals(accountType)) {
            return new SavingsAccount(ownerName);
        }
        // 非"储蓄"则默认为信用账户（此处可根据需要扩展更多类型）
        return new CreditAccount(ownerName);
    }

    /**
     * 程序入口。
     *
     * 演示了"多态 + 简单工厂"的组合使用：
     * 1. openAccount 根据字符串创建具体的子类对象
     * 2. 外部以统一的 Account 类型接收
     * 3. showAccount 统一展示，实际行为由对象真实类型决定
     */
    public static void main(String[] args) {
        // openAccount 返回的实际对象是 SavingsAccount，
        // 但以 Account 类型接收（向上转型）
        Account savingsAccount = openAccount("储蓄", "陈雨");
        showAccount(savingsAccount);

        // openAccount 返回的实际对象是 CreditAccount，
        // 但可以使用完全相同的展示入口
        Account creditAccount = openAccount("信用", "高远");
        showAccount(creditAccount);
    }
}
