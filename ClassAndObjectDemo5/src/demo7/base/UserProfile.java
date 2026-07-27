package demo7.base;

/**
 * 用户资料包含以下信息：
 * - 密码（password）：只能在用户资料类自身中使用。
 * - 所在城市（city）：资料报告器需要直接读取。
 * - 会员称号（title）：VIP 用户资料需要直接读取。
 * - 积分（points）：Main 需要直接读取。
 * 为用户资料准备以下默认信息：
 * 密码为“123456”，所在城市为“杭州”，会员称号为“金牌会员”，积分为 300。
 */

/** 用户基础资料；成员权限按照实际使用范围最小化设置。 */
public class UserProfile {
    /** 仅允许用户资料类自身直接使用的密码。 */
    private String password;
    /** 同包资料报告器可直接读取的所在城市。 */
    protected String city;
    /** 允许跨包子类直接使用的会员称号。 */
    protected String title;
    /** 允许外部入口直接展示的积分。 */
    public int points;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /** 创建具有默认资料的用户档案。 */
    public UserProfile() {
        this.password = "123456";
        this.city = "杭州";
        this.title = "金牌会员";
        this.points = 300;
    }
}
