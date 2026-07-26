package demo3;

/*
 * 第 3 题
 *
 * 请完成三个类：
 * 1. Member（普通会员）：有 name（名称）字段，初始值为“普通会员”。
 * 2. VipMember（VIP 会员）：继承 Member，也有一个 name（名称）字段，初始值为“VIP会员”，
 *    并编写 showName()（展示名称）方法，直接输出 name。
 * 3. 在 main（主方法）中创建 VipMember（VIP 会员）对象并调用 showName()。
 */
public class Main {
    public static void main(String[] args) {
        VipMember member = new VipMember();

        member.showName();
    }
}
