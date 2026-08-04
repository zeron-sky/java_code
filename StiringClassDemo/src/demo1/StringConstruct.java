package demo1;

/**
 * 练习 1 - 字符串的构造方式（课件 2.1）
 *
 * 每种构造方式写成一个方法，Main 类依次调用测试
 */
public class StringConstruct {

    // 方式一：用字符串常量直接赋值
    public void construct1() {
        // 创建 String 变量 s1，赋值为 "hello bit"，然后打印 s1
        String s1 = "hello world";
        System.out.println("用字符串常量直接赋值：" + s1);
    }

    // 方式二：用 new 关键字创建
    public void construct2() {
        // 创建 String 变量 s2 = new String("hello bit")，然后打印 s2
        String s2 = new String("hello bit");
        System.out.println("用 new 关键字创建：" + s2);
    }

    // 方式三：用字符数组构造
    public void construct3() {
        // 定义字符数组 {'h','e','l','l','o',' ','b','i','t'}
        // 用它创建 String 变量 s3，然后打印 s3
        char[] array = {'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a'};
        String s3 = new String(array);
        System.out.println("用字符数组构造：" + s3);
    }

    // 方式四：用字节数组构造
    public void construct4() {
        // 定义字节数组 {72, 101, 108, 108, 111}（对应字符 H e l l o）
        // 用它创建 String 变量 s4，然后打印 s4
        byte[] bytes = {72, 101, 108, 108, 111};
        String s4 = new String(bytes);
        System.out.println("用字节数组构造：" + s4);
    }
}
