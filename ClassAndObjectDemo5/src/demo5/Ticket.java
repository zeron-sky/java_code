package demo5;

/** 普通票，负责保存观众姓名。 */
public class Ticket {
    /** 观众姓名。 */
    public String viewerName;

    public Ticket() {
        // 复用带参构造方法，为普通票设置默认观众。
        this("默认观众");
    }

    public Ticket(String viewerName) {
        this.viewerName = viewerName;
    }
}
