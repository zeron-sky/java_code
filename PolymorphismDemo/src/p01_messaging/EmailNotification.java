package p01_messaging;

/**
 * 邮件通知 —— Notification 的子类，代表"邮件"这种通知方式。
 *
 * 通过继承 Notification，复用了父类的 recipientName 属性和构造逻辑，
 * 并通过重写 send() 方法提供了邮件特有的发送行为。
 *
 * 多态体现：当代码以 Notification 类型引用 EmailNotification 对象时，
 * 调用 send() 实际执行的是本类的 send() 方法（动态绑定）。
 *
 * @see Notification
 * @see SmsNotification
 */
public class EmailNotification extends Notification {

    /**
     * 构造一封邮件通知。
     *
     * @param recipientName 接收人姓名，传递给父类构造器
     */
    public EmailNotification(String recipientName) {
        super(recipientName);
    }

    /**
     * 以邮件方式发送通知。
     * 重写父类的 send() 方法，输出邮件通知特有的内容。
     */
    public void send() {
        System.out.println("邮件通知：" + recipientName + "，您的账单已生成。");
    }
}
