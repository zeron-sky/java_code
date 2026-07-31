package demo3_standard_javabean;

public abstract class Player extends Person {
    public Player(String name, int age) {
        super(name, age);
    }

    //学习
    public abstract void study();
}