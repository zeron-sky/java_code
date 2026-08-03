package demo2;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 你的新构造方法要两个参数：Person(String id, Money money)
        Person person1 = new Person("12");
        System.out.println("克隆前 person1 的钱: " + person1.m.money);

        Person person2 = (Person) person1.clone();
        System.out.println("克隆后 person2 的钱: " + person2.m.money);

        // 只改 person2 的钱
        person2.m.money = 99.99;
        System.out.println("修改后 person1 的钱: " + person1.m.money);
        System.out.println("修改后 person2 的钱: " + person2.m.money);
    }
}
