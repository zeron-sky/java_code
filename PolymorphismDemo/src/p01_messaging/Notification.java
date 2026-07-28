package p01_messaging;

/**
 * 通知基类 —— 消息通知体系中的父类。
 *
 * 本类是所有通知类型的共同抽象，定义了通知的基本结构：
 * <ul>
 *   <li>所有通知都必含接收人姓名（recipientName）</li>
 *   <li>所有通知都有发送行为（send()），但具体发送方式由子类重写决定</li>
 * </ul>
 *
 * 此处的 send() 体现了"多态"的核心思想：
 * 父类定义一个统一的接口，子类各自提供不同的实现，
 * 运行时 JVM 根据对象实际类型动态绑定到正确的方法。
 *
 * @see EmailNotification
 * @see SmsNotification
 */
public class Notification {

    /** 接收人姓名 —— 每条通知必须记录的信息 */
    public String recipientName;

    /**
     * 构造一个通知对象。
     *
     * @param recipientName 接收人姓名
     */
    public Notification(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * 发送通知 —— 默认实现，子类应重写此方法以提供具体的发送逻辑。
     *
     * 在父类中提供一个"兜底"实现，子类通过 @Override 覆盖它。
     */
    public void send() {
        System.out.println("通知：" + recipientName + "您有一条信息。");
    }
}