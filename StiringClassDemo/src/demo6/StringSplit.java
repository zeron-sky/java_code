package demo6;

/**
 * 练习 6 - 字符串拆分（课件 3.5）【重点】
 *
 * 每种拆分方式写成一个方法，Main 类依次调用测试
 */
public class StringSplit {

    // 1. 按空格拆分
    public void split1() {
        // 把 "hello world hello bit" 按空格拆分成数组，用 for-each 循环打印
        String str = "hello world hello bit";
        String[] array = str.split(" ");
        System.out.println("按空格拆分成 " + array.length + " 段：");
        for (String s : array) {
            System.out.println(s);
        }
        System.out.print("\n=====================================\n\n");
    }

    // 2. 只拆成 2 段
    public void split2() {
        // 用 split(" ", 2) 拆成 2 段，循环打印，观察和上面有什么不同
        String str = "hello world hello bit";
        String[] array = str.split(" ", 2);
        System.out.println("split(\" \", 2) 只拆成 " + array.length + " 段：");
        for (String s : array) {
            System.out.println(s);
        }
        System.out.print("\n=====================================\n\n");
    }

    // 3. 拆分 IP 地址
    public void split3() {
        // 把 "192.168.1.1" 按 "." 拆分
        // 注意："." 是正则特殊字符，要写成 split("\\.")，循环打印
        String str = "192.168.1.1";
        String[] array = str.split("\\.");
        System.out.println("按 \".\" 拆分 IP 地址：");
        for (String s : array) {
            System.out.println(s);
        }
        System.out.print("\n=====================================\n\n");
    }

    // 4. 多次拆分
    public void split4() {
        // 把 "name=zhangsan&age=18" 先按 "&" 拆，再按 "=" 拆
        // 打印成 "name = zhangsan" 的形式
        String str = "name=zhangsan&age=18";
        String[] array = str.split("=|&");
        System.out.println("按 \"=\" 或 \"&\" 拆分：");
        for (String s : array) {
            System.out.println(s);
        }
        System.out.print("\n=====================================\n\n");
    }
}
