package demo2_employee_comprehensive;

/**
 * 题目：设计一个 Employee（员工）抽象类，包含姓名、工号属性和抽象方法 calculateSalary()（计算薪资）。
 * 再定义两个接口：
 *
 * - Bonusable：包含 getBonus()（计算奖金）方法。
 * - Promotable：包含 promote()（晋升）方法。
 *
 * 创建 FullTimeEmployee（全职员工）和 PartTimeEmployee（兼职员工）两个子类：
 *
 * - 全职员工：继承 Employee，实现 Bonusable 和 Promotable，薪资=基本工资+奖金，晋升时基本工资增加 10%。
 * - 兼职员工：继承 Employee，不实现接口，薪资=时薪×工时，无奖金和晋升。
 *
 * 最后测试两类员工的薪资计算和功能差异。
 *
 * Employee、Bonusable、Promotable、FullTimeEmployee、PartTimeEmployee 和 Main 分别放在独立的 Java 文件中。
 */
public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee =
                new FullTimeEmployee("张三", "E001", 10000, 2000);
        PartTimeEmployee partTimeEmployee =
                new PartTimeEmployee("李四", "E002", 30, 8);

        Employee[] employees = {fullTimeEmployee, partTimeEmployee};
        for (Employee employee : employees) {
            System.out.println("员工姓名：" + employee.getName()
                    + "，工号：" + employee.getEmployeeId());
            System.out.printf("薪资：%.2f%n", employee.calculateSalary());
        }

        System.out.printf("全职员工奖金：%.2f%n", fullTimeEmployee.getBonus());
        System.out.printf("晋升前薪资：%.2f%n", fullTimeEmployee.calculateSalary());
        fullTimeEmployee.promote();
        System.out.printf("晋升后薪资：%.2f%n", fullTimeEmployee.calculateSalary());
        System.out.println("兼职员工无奖金和晋升能力");
    }
}
