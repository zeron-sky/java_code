package demo4;

/**
 * 练习 4 - 转换（课件 3.3）
 *
 * 每种转换写成一个方法，Main 类依次调用测试
 */
public class StringConvert {

    // 1. 数字 -> 字符串
    public void convert1() {
        // 用 String.valueOf 把 1234、12.34、true 转成字符串，分别打印
        String s1 = String.valueOf(1234);
        String s2 = String.valueOf(12.34);
        String s3 = String.valueOf(true);
        System.out.println("1234 转成字符串后：" + s1);
        System.out.println("12.34 转成字符串后：" + s2);
        System.out.println("true 转成字符串后：" + s3);
        System.out.print("\n=====================================\n\n");
    }

    // 2. 字符串 -> 数字
    public void convert2() {
        // 用 Integer.parseInt 把 "1234" 转成 int
        // 用 Double.parseDouble 把 "12.34" 转成 double，分别打印
        int a = Integer.parseInt("1234");
        double b = Double.parseDouble("12.34");
        System.out.println("\"1234\" 转成 int：" + a);
        System.out.println("\"12.34\" 转成 double：" + b);
        // 验证一下转出来的真是数字，可以做加法运算
        System.out.println("a + 1 = " + (a + 1));
        System.out.println("b + 0.01 = " + (b + 0.01));
        System.out.print("\n=====================================\n\n");
    }

    // 3. 大小写转换
    public void convert3() {
        // 把 "hello" 转成大写、把 "HELLO" 转成小写，分别打印
        String s1 = "hello";
        String s2 = "WORLD";
        System.out.println("\"hello\" 转大写：" + s1.toUpperCase());
        System.out.println("\"WORLD\" 转小写：" + s2.toLowerCase());
        System.out.print("\n=====================================\n\n");
    }

    // 4. 字符串 <-> 字符数组
    public void convert4() {
        // 把 "hello" 转成 char[] 并逐个打印，再用字符数组构造回字符串打印

        // 字符串转数组
        String s1 = "hello";
        char[] array = s1.toCharArray();
        System.out.print("字符串转数组，逐个字符：");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();   // 换行，避免和下一段输出挤在同一行

        // 数组转字符串
        String s2 = new String(array);
        System.out.println("数组再转回字符串：" + s2);
        System.out.print("\n=====================================\n\n");
    }

    // 5. 格式化
    public void convert5() {
        // 用 String.format 把 2019、9、14 拼成 "2019-9-14" 打印
        String s = String.format("%d-%d-%d", 2026, 8, 4);
        System.out.println("格式化结果：" + s);
        System.out.print("\n=====================================\n\n");
    }
}
