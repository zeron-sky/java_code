package demo8;

/**
 * 测试类：依次运行 StringIntern 的每个方法
 */
public class Main {
    public static void main(String[] args) {
        StringIntern obj = new StringIntern();
        obj.intern1();
        obj.intern2();
    }
}
