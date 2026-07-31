package demo3_standard_javabean;

public class BasketballCoach  extends  Coach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练：姓名：" + getName()
                + "，年龄：" + getAge() + "，行为：教篮球");
    }
}
