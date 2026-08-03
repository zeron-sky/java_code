package demo3;

import java.util.Objects;

/**
 * 练习目标：重写 Object 类的三个方法
 * 1. toString()  —— 打印对象时显示内容，而不是"类名@地址"
 * 2. equals()    —— 比较对象"内容"，而不是"地址"
 * 3. hashCode()  —— 让内容相同的对象，哈希值也相同
 *
 * 注意：Object 是所有类的父类，所以不写 extends Object 也默认继承它。
 */
public class Person {

    // 属性：比较对象内容是否相等，比的就是这两个字段
    private String name;
    private int age;

    // ---- 封装：getter / setter（本练习没用到，但这是 Java 的标准写法）----
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 构造方法：创建对象时必须传入姓名和年龄
    // 注意：this.name 表示"当前对象的 name"，= 右边的是参数 name，同名参数用 this 区分
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ---------- 4.1 toString() ----------
    // 不重写的话，System.out.println(person) 打印的是：demo3.Person@1b6d3586
    // （即 getClass().getName() + "@" + 16进制哈希值）
    // 重写后，打印的就是对象的内容
    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +   // \' 表示单引号字符本身
                ", age=" + age +
                ']';
    }

    // ---------- 4.2 equals() ----------
    // 不重写的话，equals 默认实现是 return (this == obj)，也就是比地址
    // 重写的目的：让"名字和年龄都一样"的两个对象视为相等
    //
    // 课件四步套路（顺序不能乱）：
    //   第1步 地址相同 -> 就是同一个对象
    //   第2步 传 null  -> 肯定不相等
    //   第3步 类型不对 -> 不相等
    //   第4步 向下转型 -> 逐个比较属性内容
    //
    // 注意：参数类型必须是 Object！
    //       写成 Person 就不是"重写"而是"重载"，@Override 会直接编译报错
    @Override
    public boolean equals(Object o) {
        // 第1步：o 就是当前对象本身（地址一样），直接相等
        if (o == this)
            return true;
        // 第2步：传进来的是 null，任何对象都不等于 null
        if (o == null)
            return false;
        // 第3步：o 不是 Person 类型，没法比
        if (!(o instanceof Person))
            return false;
        // 第4步：o 确实是 Person，向下转型，然后比较两个字段
        Person person = (Person) o;
        // 字符串比内容用 equals（name 是引用类型）
        // 基本类型比内容用 ==（age 是 int）
        // 注意：this.name 放在 equals 前面，this 一定是非 null 的，更安全
        return this.name.equals(person.name) && this.age == person.age;
    }

    // ---------- 4.3 hashCode() ----------
    // 不重写的话，两个内容相同的对象哈希值不同（默认跟内存位置有关）
    // 重写后：内容相同 -> 哈希值相同
    // 铁律：重写了 equals 就必须重写 hashCode（以后学 HashMap 会用到）
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
