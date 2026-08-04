package demo3;

/**
 * 练习 3 - 字符串查找（课件 3.2）
 *
 * 每个查找任务写成一个方法，Main 类依次调用测试
 */
public class StringSearch {

    private String s = "aaabbbcccaaabbbccc";   // 类字段：所有查找方法共用这个字符串

    // 1. 取下标为 3 的字符
    public void search1() {
        // 用 s.charAt(3) 取字符并打印
        System.out.println("s 中下标为 3 的字符是：" + s.charAt(3));
        System.out.print("\n=====================================\n\n");
    }

    // 2. 字符 'c' 第一次出现的位置
    public void search2() {
        // 用 s.indexOf('c') 查找并打印
        System.out.println("字符 'c' 第一次出现的位置：" + s.indexOf('c'));
        System.out.print("\n=====================================\n\n");
    }

    // 3. 字符 'c' 最后一次出现的位置
    public void search3() {
        // 用 s.lastIndexOf('c') 查找并打印
        System.out.println("字符 'c' 最后一次出现的位置：" + s.lastIndexOf('c'));
        System.out.print("\n=====================================\n\n");
    }

    // 4. 子串 "bbb" 第一次、最后一次出现的位置
    public void search4() {
        // 分别用 s.indexOf("bbb") 和 s.lastIndexOf("bbb") 查找并打印
        System.out.println("子串 \"bbb\" 第一次出现的位置：" + s.indexOf("bbb"));
        System.out.println("子串 \"bbb\" 最后一次出现的位置：" + s.lastIndexOf("bbb"));
        System.out.print("\n=====================================\n\n");
    }

    // 5. 查找一个不存在的字符
    public void search5() {
        // 用 s.indexOf 查找一个不存在的字符，观察返回值（-1）
        System.out.println("查找不存在的字符 'v' 返回：" + s.indexOf('v'));
        System.out.print("\n=====================================\n\n");
    }
}
