package demo5;

/**
 * 练习 5 - 字符串替换（课件 3.4）
 *
 * 每个替换操作写成一个方法，Main 类依次调用测试
 */
public class StringReplace {

    // 1. replaceAll：把所有的 "l" 替换成 "_"
    public void replace1() {
        // 定义字符串 str = "helloworld"，用 str.replaceAll("l", "_") 替换并打印
        String str = "helloworld";
        System.out.println("replaceAll 替换所有 \"l\"：" + str.replaceAll("l", "_"));
        System.out.print("\n=====================================\n\n");
    }

    // 2. replaceFirst：只替换第一个 "l"
    public void replace2() {
        // 定义字符串 str = "helloworld"，用 str.replaceFirst("l", "_") 替换并打印
        String str = "helloworld";
        System.out.println("replaceFirst 只替换第一个 \"l\"：" + str.replaceFirst("l", "_"));
        System.out.print("\n=====================================\n\n");
    }

    // 3. 观察原字符串有没有被修改
    public void replace3() {
        // 定义字符串 str = "helloworld"，直接打印 str，看它有没有变
        String str = "helloworld";
        str.replaceAll("l", "a");
        str.replaceFirst("l", "a");
        System.out.println("替换操作之后，原字符串 str：" + str);
        System.out.print("\n=====================================\n\n");
    }
}
