package demo2;

// 类没有写 extends 时，默认继承 Object（Object 是所有类的父类）
public class Person implements Cloneable {
    public String id;
    public Money m = new Money();

    public Person(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.m = (Money) m.clone();
        return p;
    }
}
