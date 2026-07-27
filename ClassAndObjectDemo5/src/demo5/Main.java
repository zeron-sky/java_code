package demo5;

/*
 * 第 5 题
 *
 * 某票务系统需要登记普通票和会员票。请完成 Ticket（票）和
 * MemberTicket（会员票）两个类，MemberTicket 继承 Ticket。
 *
 * 每张票包含观众姓名（viewerName）；会员票还要记录是否为会员（member）。
 *
 * 系统支持两种创建会员票的方式：
 * 1. 未提供信息时，观众姓名为“默认观众”，不是会员。
 * 2. 提供观众姓名和会员状态时，使用提供的信息。
 *
 * 无参创建会员票时，应复用本类中已有的带信息创建逻辑；
 * 创建会员票时，观众姓名的信息应由票来完成登记。
 *
 * 在 main（主方法）中分别创建上述两种会员票，并输出：
 * 观众：姓名，会员：状态
 *
 * 预期输出：
 * 观众：默认观众，会员：false
 * 观众：王晨，会员：true
 */
public class Main {
    public static void main(String[] args) {
        MemberTicket ticket1 = new MemberTicket();
        MemberTicket ticket2 = new MemberTicket("王晨", true);

        System.out.println("观众：" + ticket1.viewerName + "，会员：" + ticket1.member);
        System.out.println("观众：" + ticket2.viewerName + "，会员：" + ticket2.member);
    }
}
