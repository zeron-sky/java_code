package demo1;// demo1.Student 类：用于表示一个学生对象，并提供学生之间的分数比较功能

public class Student implements Comparable<Student> {
    // private 表示成员变量只能在 demo1.Student 类内部直接访问
    private String name; // 学生姓名
    private int score;   // 学生分数

    // 获取姓名
    public String getName() {
        return name;
    }

    // 修改姓名
    public void setName(String name) {
        this.name = name;
    }

    // 获取分数
    public int getScore() {
        return score;
    }

    // 修改分数
    public void setScore(int score) {
        this.score = score;
    }

    // 构造方法：创建 demo1.Student 对象时初始化姓名和分数
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 返回 demo1.Student 对象的文字信息，便于直接打印对象时查看内容
    @Override
    public String toString() {
        return "demo1.Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    // 比较当前学生和另一个学生的分数
    @Override
    public int compareTo(Student s) {

        // 当前学生分数更高时返回 -1
        if(this.score > s.score) {
            return -1;
        // 分数相同时返回 0
        } else if (this.score == s.score) {
            return 0;
        // 当前学生分数更低时返回 1
        } else {
            return 1;
        }
    }
}
