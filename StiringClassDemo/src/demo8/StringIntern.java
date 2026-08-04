package demo8;

/**
 * 练习 8 - intern 方法（课件 3.8）
 *
 * 每个实验写成一个方法，Main 类依次调用测试
 */
public class StringIntern {

    // 实验1：不用 intern
    public void intern1() {
        // new String(new char[]{'x','y','z'}) 得到 s1，字面量 "xyz" 得到 s2
        // 分别用 == 和 equals 比较 s1、s2，打印结果
        String s1 = new String(new char[]{'x', 'y', 'z'});
        String s2 = "xyz";
        System.out.println("s1 == s2     : " + (s1 == s2));     // false：new 出来的是独立对象
        System.out.println("s1.equals(s2): " + s1.equals(s2));  // true：内容相同
        System.out.print("\n=====================================\n\n");
    }

    // 实验2：用 intern（关键：先 intern，再创建字面量）
    public void intern2() {
        // new String(new char[]{'m','n','o'}) 得到 t1，先调用 t1.intern()
        // 再定义 t2 = "mno"，用 == 比较 t1、t2，打印结果
        String t1 = new String(new char[]{'m', 'n', 'o'});  // "mno" 之前没进过常量池
        t1.intern();                                        // 先登记进池 → 池里就是 t1
        String t2 = "mno";                                  // 字面量去池里找 → 找到 t1
        System.out.println("t1 == t2     : " + (t1 == t2));     // true：池里登记的就是 t1
        System.out.println("t1.equals(t2): " + t1.equals(t2));  // true：内容也相同
        System.out.print("\n=====================================\n\n");
    }
}
