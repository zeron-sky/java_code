package demo7;

/**
 * 练习 7 - 字符串截取和去空格（课件 3.6 + 3.7）
 * <p>
 * 每个操作写成一个方法，Main 类依次调用测试
 */
public class StringSubstring {

    // 1. substring(5)：从下标 5 截到末尾
    public void substring1() {
        // 定义字符串 str = "helloworld"，用 str.substring(5) 截取并打印
        String str = "helloworld";
        System.out.println(str.substring(5));
    }

    // 2. substring(0, 5)：截取 [0,5)
    public void substring2() {
        // 定义字符串 str = "helloworld"，用 str.substring(0, 5) 截取并打印
        // 体会"前闭后开"：包含 0，不包含 5
        String str = "helloworld";
        System.out.println(str.substring(0, 5));
    }

    // 3. trim：去掉左右两端的空格
    public void trim1() {
        // 定义字符串 s = "  hello world  "
        // 把 s 和 s.trim() 分别加上 [] 打印，观察两端空格
        String str = "         hello world             ";
        System.out.println(str);
        System.out.println("[" + str.trim() + "]");
    }
}
