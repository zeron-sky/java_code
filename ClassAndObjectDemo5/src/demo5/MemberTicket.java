package demo5;

/** 会员票继承普通票的观众信息，并增加会员状态。 */
public class MemberTicket extends Ticket {
    /** 是否为会员。 */
    public boolean member;

    public MemberTicket() {
        // 复用本类的带参构造方法，提供默认会员票信息。
        this("默认观众", false);
    }

    public MemberTicket(String viewerName, boolean member) {
        // 由父类负责登记观众姓名。
        super(viewerName);
    }
}
