package demo9;

/**
 * 练习 9 - 字符串的不可变性与修改效率（课件 4 + 5）
 *
 * 每个实验写成一个方法，Main 类依次调用测试
 */
public class StringImmutable {

    // 1. 不可变性：拼接会产生新对象
    public void immutable1() {
        // 定义 s = "hello"，拼接 " world" 后打印（体会会产生新对象）
        String s = "hello";
        s = s + " world";          // String 没有修改能力，只能把新对象重新赋给变量
        System.out.println("拼接后的 s：" + s);
        System.out.print("\n=====================================\n\n");
    }

    // 2. 效率对比：String / StringBuffer / StringBuilder
    public void efficiency1() {
        // 分别用 String、StringBuffer、StringBuilder 循环拼接 1 万次
        // 用 System.currentTimeMillis() 记录耗时，打印各自的时间差
        long start1 = System.currentTimeMillis();
        String s1 = "hello";
        for (int i = 0; i < 10000; i++) {
            s1 += " world";
        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        StringBuffer s2 = new StringBuffer("jinitaimei");
        for (int i = 0; i < 10000; i++) {
            s2.append(" caixukun");
        }
        long end2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        StringBuilder s3 = new StringBuilder("xiangshuijiao");
        for (int i = 0; i < 10000; i++) {
            s3.append(" buganhuo");
        }
        long end3 = System.currentTimeMillis();

        System.out.println("String 拼接耗时    : " + (end1 - start1) + " ms");
        System.out.println("StringBuffer 耗时  : " + (end2 - start2) + " ms");
        System.out.println("StringBuilder 耗时 : " + (end3 - start3) + " ms");
        System.out.print("\n=====================================\n\n");
    }
}
