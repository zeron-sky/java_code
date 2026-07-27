package demo8;

/*
 * 第 8 题
 *
 * 某身份核验系统包含 IdentityDocument（身份证明）、
 * StudentCard（学生证）和 CampusStudentCard（校园学生证）三个类。
 * StudentCard 继承 IdentityDocument，CampusStudentCard 继承 StudentCard。
 *
 * 身份证明包含编号（documentNumber）；学生证包含学校名称（schoolName）；
 * 校园学生证包含校区名称（campusName）。
 *
 * 创建一张编号为“ID2026”、学校名称为“星海大学”、校区名称为“东校区”的校园学生证。
 * 在 main（主方法）中输出：
 * 编号：ID2026，学校：星海大学，校区：东校区
 *
 * 系统要求：校园学生证设计完成后，不允许再在它的基础上创建新的子类型；
 * 学生证的“展示学校信息”功能也不允许被校园学生证改变。
 *
 * 除输出编号、学校和校区外，还要调用“展示学校信息”功能，输出：
 * 学校：星海大学
 */
public class Main {
    public static void main(String[] args) {
        CampusStudentCard studentCard = new CampusStudentCard();
        System.out.println("编号：" + studentCard.documentNumber + "，学校：" + studentCard.schoolName + "，校区：" + studentCard.campusName);
        studentCard.showSchoolInfo();
    }
}