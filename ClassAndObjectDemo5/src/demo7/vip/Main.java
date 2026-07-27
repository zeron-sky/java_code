package demo7.vip;

import demo7.base.ProfileReporter;

/*
 * 第 7 题
 *
 * 某会员平台需要管理用户资料。请完成 UserProfile（用户资料）、
 * ProfileReporter（资料报告器）和 VipProfile（VIP 用户资料）三个类。
 * VipProfile 继承 UserProfile。
 *
 * 文件分布：
 * - demo7.base：UserProfile、ProfileReporter
 * - demo7.vip：VipProfile、Main
 *
 * 用户资料应保存以下默认信息：
 * - 密码（password）：123456
 * - 所在城市（city）：杭州
 * - 会员称号（title）：金牌会员
 * - 积分（points）：300
 *
 * 各类必须完成的职责：
 * 1. UserProfile：只在自身内部使用密码；创建对象后应具备上述默认资料。
 * 2. ProfileReporter：接收一份用户资料，直接读取其所在城市并输出：
 *    所在城市：杭州
 * 3. VipProfile：直接读取继承得到的会员称号并输出：
 *    会员称号：金牌会员
 * 4. Main：创建 VIP 用户资料和资料报告器；调用资料报告器输出城市，
 *    调用 VIP 用户资料输出会员称号，并直接读取、输出积分：
 *    积分：300
 *
 * 最终完整输出：
 * 所在城市：杭州
 * 会员称号：金牌会员
 * 积分：300
 *
 * 要求：不得为方便访问而扩大资料的可见范围；请根据每项资料实际被谁使用，
 * 选择满足要求的最小访问权限。
 */
public class Main {
    public static void main(String[] args) {
        VipProfile profile1 = new VipProfile();
        ProfileReporter profile2 = new ProfileReporter();

        profile1.vipProfileInfo();
        profile2.showCity(profile1);

        System.out.println("积分：" + profile1.points);
    }
}
