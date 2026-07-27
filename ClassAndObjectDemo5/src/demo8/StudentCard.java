package demo8;

/** 学生证，在身份证明基础上增加学校信息。 */
public class StudentCard extends IdentityDocument {
    /** 学校名称。 */
    String schoolName = "星海大学";

    /** 禁止子类重写学校信息的展示规则。 */
    public final void showSchoolInfo() {
        System.out.println("学校：" + schoolName);
    }
}
