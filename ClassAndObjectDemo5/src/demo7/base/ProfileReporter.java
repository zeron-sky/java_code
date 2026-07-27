package demo7.base;

/** 资料报告器，负责读取并输出用户资料中的城市信息。 */
public class ProfileReporter {
    /**
     * 与 UserProfile 位于同一包，因此可以直接读取继承对象中的 city。
     */
    public void showCity(UserProfile userProfile) {
        System.out.println("所在城市：" + userProfile.city);
    }
}
