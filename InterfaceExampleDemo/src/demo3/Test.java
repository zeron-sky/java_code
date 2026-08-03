package demo3;

/**
 * 测试类：验证 Person 重写后的三个方法
 * 预期核心结论：
 *   1. person1 == person2       -> false（== 比地址，两个对象地址不同）
 *   2. person1.equals(person2)  -> true （重写后比内容，内容相同）
 *   3. 两个 hashCode() 相同            （重写后按内容算哈希）
 */
public class Test {
    public static void main(String[] args) {
        // 创建两个"内容完全相同"的对象（名字、年龄都一样）
        // 只有内容相同，才能对比出 == 和 equals 的区别
        Person person1 = new Person("张三", 18);
        Person person2 = new Person("张三", 18);

        // ---------- 4.1 测试 toString ----------
        // 没重写时打印的是 Person@1b6d3586 这种"类名@地址"
        // 重写后打印的是对象内容
        System.out.println(person1);
        System.out.println(person2);

        // ---------- 4.2 测试 == 和 equals 的区别 ----------
        // 基本类型：== 比较的是"值"
        int a = 10;
        int b = 20;
        System.out.println("a == b的值为：" + (a == b));              // false，10 != 20

        // 引用类型：== 比较的是"地址"，两个 new 出来的对象地址必然不同
        System.out.println("person1 == person2的值为：" + (person1 == person2));   // false

        // equals 重写后比较的是"内容"，名字年龄都一样 -> true
        System.out.println("person1和person2是否相等：" + person1.equals(person2)); // true

        // ---------- 4.3 测试 hashCode ----------
        // 重写后：内容相同 -> 哈希值相同（没重写时两个值会不一样）
        System.out.println("person1的哈希值为：" + person1.hashCode());
        System.out.println("person2的哈希值为：" + person2.hashCode());
    }
}
