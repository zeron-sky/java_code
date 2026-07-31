package demo3_standard_javabean;

public class BasketballPlayer extends  Player  {

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员：姓名：" + getName()
                + "，年龄：" + getAge() + "，行为：学打篮球");
    }
}
