package demo10;

/**
 * 练习 10 - StringBuilder 和 StringBuffer（课件 6）
 *
 * 每个操作写成一个方法，Main 类依次调用测试
 */
public class StringBuilderDemo {

    // 1. append：追加
    public void builder1() {
        // new StringBuilder("hello")，用 append 依次追加 ' '、"world"、123，打印
        StringBuilder s = new StringBuilder("🐔你太美");
        s.append(" 蔡徐坤");
        System.out.println("append 追加后：" + s);
        System.out.print("\n=====================================\n\n");
    }

    // 2. 查看常用信息
    public void builder2() {
        // 打印 charAt(0)、length()、capacity() 看看分别是什么
        StringBuilder s = new StringBuilder("鸡你太美");
        System.out.println("charAt(0)   = " + s.charAt(0));
        System.out.println("length()    = " + s.length());
        System.out.println("capacity()  = " + s.capacity());
        System.out.print("\n=====================================\n\n");
    }

    // 3. setCharAt：修改某个位置的字符
    public void builder3() {
        // 用 setCharAt(0, 'H') 修改首字符，打印
        StringBuilder s = new StringBuilder("gunkun");
        s.setCharAt(0, 'k');
        System.out.println("setCharAt(0, 'k') 后：" + s);
        System.out.print("\n=====================================\n\n");
    }

    // 4. insert：插入
    public void builder4() {
        // 用 insert(0, "...") 在开头插入一段内容，打印
        StringBuilder s = new StringBuilder("鸡你太美");
        s.insert(0, "蔡徐坤");
        System.out.println("insert(0, \"蔡徐坤\") 后：" + s);
        System.out.print("\n=====================================\n\n");
    }

    // 5. delete：删除
    public void builder5() {
        // 用 delete 和 deleteCharAt 删除部分字符，打印
        StringBuilder s = new StringBuilder("a鸡你太美");
        s.deleteCharAt(0);
        System.out.println("deleteCharAt(0) 后：" + s);
        s.delete(0, 2);
        System.out.println("delete(0, 2) 后  ：" + s);
        System.out.print("\n=====================================\n\n");
    }

    // 6. reverse + toString
    public void builder6() {
        // 用 reverse 反转，用 toString 转回 String，打印
        StringBuilder s1 = new StringBuilder("美太你鸡");
        s1.reverse();
        String s2 = s1.toString();
        System.out.println("reverse 反转后：" + s2);
        System.out.print("\n=====================================\n\n");
    }

    // 7. String 和 StringBuilder 互相转换
    public void builder7() {
        // String -> StringBuilder：用构造方法
        StringBuilder s1 = new StringBuilder("鸡你太美");
        // StringBuilder -> String：调用 toString()
        String s2 = s1.toString();
        System.out.println("StringBuilder 转回 String：" + s2);
        System.out.print("\n=====================================\n\n");
    }
}
