package demo2;

/**
 * 练习 2 - String 对象的比较（课件 3.1）
 * <p>
 * 每种比较方式写成一个方法，Main 类依次调用测试
 */
public class StringCompare {

    // 1. ==：基本类型比较值
    public void compare1() {
        // 定义 int a = 10, b = 20, c = 10，分别打印 a == b 和 a == c
        int a = 10;
        int b = 20;
        int c = 10;
        System.out.println("a与b比较相等的结果是：" + (a == b));
        System.out.println("a与c比较相等的结果是：" + (a == c));
        System.out.println("b与c比较相等的结果是：" + (b == c));
        System.out.print("\n=====================================\n\n");
    }

    // 2. ==：引用类型比较地址
    public void compare2() {
        // new 两个内容相同的 "hello"，new 一个 "world"，再让一个变量等于 s1
        // 分别用 == 比较它们，想想为什么有的是 true 有的是 false
        String s1 = "hello";
        String s2 = "World";
        String s3 = "hello";
        System.out.println("s1与s2用引用类型比较相等的结果是：" + (s1 == s2));
        System.out.println("s1与s3用引用类型比较相等的结果是：" + (s1 == s3));
        System.out.println("s2与s3用引用类型比较相等的结果是：" + (s2 == s3));
        System.out.print("\n=====================================\n\n");
    }

    // 3. equals：比较内容
    public void compare3() {
        // new 两个 "hello" 和一个 "Hello"，用 equals 比较，观察结果
        String s1 = "hello";
        String s2 = "World";
        String s3 = "hello";
        System.out.println("s1与s2用equals比较相等的结果是：" + s1.equals(s2));
        System.out.println("s1与s3用equals比较相等的结果是：" + s1.equals(s3));
        System.out.println("s2与s3用equals比较相等的结果是：" + s2.equals(s3));
        System.out.print("\n=====================================\n\n");
    }

    // 4. compareTo：按字典序比较，返回 int
    public void compare4() {
        // 用 "abc"、"ac"、"abc"、"abcdef" 两两比较，观察返回值
        String s1 = "abc";
        String s2 = "ac";
        String s3 = "abc";
        String s4 = "abcdef";
        System.out.println("s1与s2用compareTo比较相等的结果是：" + s1.compareTo(s2)); // 不同输出字符差值-1
        System.out.println("s1与s2用compareTo比较相等的结果是：" + s1.compareTo(s3)); // 相同输出 0
        System.out.println("s1与s2用compareTo比较相等的结果是：" + s1.compareTo(s4)); // 前k个字符完全相同，输出长度差值 -3
    }

    // 5. compareToIgnoreCase：与compareTo方式相同，但是忽略大小写
    public void compare5() {
        // 用 "abc" 和 "ABc" 比较，观察忽略大小写后的结果
        String s1 = "abc";
        String s2 = "ac";
        String s3 = "ABc";
        String s4 = "abcdef";
        System.out.println("s1与s2用compareToIgnoreCase比较相等的结果是：" + s1.compareToIgnoreCase(s2)); // 不同输出字符差值-1
        System.out.println("s1与s2用compareToIgnoreCase比较相等的结果是：" + s1.compareToIgnoreCase(s3)); // 相同输出 0
        System.out.println("s1与s2用compareToIgnoreCase比较相等的结果是：" + s1.compareToIgnoreCase(s4)); // 前k个字符完全相同，输出长度差值 -3
    }
}