package demo3_standard_javabean;

public class TableTennisPlayer extends Player implements SpeakEnglish {

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员：姓名：" + getName()
                + "，年龄：" + getAge() + "，行为：学打乒乓球");
    }

    public void speakEnglish() {
        System.out.println("乒乓球运动员：姓名：" + getName() + "，行为：说英语");
    }
}
