package demo3_standard_javabean;

public abstract class Coach extends  Person {

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
