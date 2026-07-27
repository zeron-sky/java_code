package demo7.vip;

import demo7.base.UserProfile;

/** VIP 用户资料，可使用父类继承来的会员称号。 */
public class VipProfile extends UserProfile {
    /** 通过 super 读取父类中受保护的会员称号。 */
    public void vipProfileInfo() {
        System.out.println("会员称号：" + super.title);
    }
}