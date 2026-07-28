package p01_messaging;

/**
 * 短信通知 —— Notification 的子类，代表"短信"这种通知方式。
 *
 * 与 EmailNotification 类似，通过继承复用父类结构，
 * 并通过方法重写提供自己的发送逻辑。
 *
 * 多态体现：同一个 send() 调用，在不同子类中产生不同的行为。
 * 这正是"一条消息，多种形态"的含义。
 *
 * @see Notification
 * @see EmailNotification
 */
public class SmsNotification extends Notification {

    /**
     * 构造一条短信通知。
     *
     * @param recipientName 接收人姓名，传递给父类构造器
     */
    public SmsNotification(String recipientName) {
        super(recipientName);
    }

    /**
     * 以短信方式发送通知。
     * 重写父类的 send() 方法，输出短信通知特有的内容。
     */
    public void send() {
        System.out.println("短信通知：" + recipientName + "，您的验证码是 4826。");
    }
}
