package demo1;

public class Test {
    public static void main(String[] args) {
        // 创建两个学生对象，分别保存姓名和分数
        Student s1 = new Student("zhangsan", 10);
        Student s2 = new Student("lisi", 20);

        // 方式一：用 Comparable，demo1.Student 自己比较分数
        System.out.println("compareTo: " + s1.compareTo(s2));

        // 方式二：用 Comparator，demo1.ScoreComparator 专门比较分数
        ScoreComparator scoreComparator = new ScoreComparator();
        System.out.println("按分数: " + scoreComparator.compare(s1, s2));

        // 方式三：用 Comparator，demo1.NameComparator 专门比较姓名
        NameComparator nameComparator = new NameComparator();
        System.out.println("按姓名: " + nameComparator.compare(s1, s2));
    }
}
