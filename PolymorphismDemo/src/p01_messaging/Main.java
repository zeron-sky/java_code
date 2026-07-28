package p01_messaging;

/*
 * 消息通知
 *
 * 某业务系统需要向用户发送通知。请创建通知（Notification）、短信通知（SmsNotification）和邮件通知
 * （EmailNotification）三个类，且每个类单独存放在对应的文件中。系统支持“短信通知”和“邮件通知”两种方式。
 *
 * 业务规则：
 * 1. 每条通知都必须记录接收人姓名（recipientName）。
 * 2. 短信通知（SmsNotification）发送（send）时输出：短信通知：<接收人>，您的验证码是 4826。
 * 3. 邮件通知（EmailNotification）发送（send）时输出：邮件通知：<接收人>，您的账单已生成。
 * 4. 系统必须提供唯一的通知发送入口（sendNotification）。该入口接收任意一种通知，并完成对应通知的发送。
 * 5. 程序启动后，依次处理：
 *    - 接收人“林晓”的一条短信通知；
 *    - 接收人“周明”的一条邮件通知。
 *
 * 预期控制台输出：
 * 短信通知：林晓，您的验证码是 4826。
 * 邮件通知：周明，您的账单已生成。
 */
public class Main {

    /**
     * 统一的通知发送入口。
     *
     * 这是多态应用的关键 —— 参数类型为父类 Notification，
     * 但实际传入的可以是任意 Notification 的子类对象。
     * 方法内部调用 send() 时，JVM 会根据对象的实际类型，
     * 动态绑定到对应的子类方法上。
     *
     * @param notification 任意类型的通知对象（SmsNotification / EmailNotification 等）
     */
    public static void sendNotification(Notification notification) {
        // 单行调用，多态行为：notification 的实际类型决定执行哪个 send()
        notification.send();
    }

    /**
     * 程序入口。
     *
     * 演示了"编译看左边，运行看右边"的多态原则：
     * - 编译时，notification1 被认定为 Notification 类型
     * - 运行时，notification1 实际指向 SmsNotification 对象，因此调用的是 SmsNotification.send()
     */
    public static void main(String[] args) {
        // 向上转型：创建子类对象，赋值给父类引用
        Notification notification1 = new SmsNotification("林晓");
        sendNotification(notification1);

        Notification notification2 = new EmailNotification("周明");
        sendNotification(notification2);
    }
}
