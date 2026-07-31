package demo3_standard_javabean;

public class TableTennisCoach extends Coach implements SpeakEnglish {
    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练：姓名：" + getName()
                + "，年龄：" + getAge() + "，行为：教乒乓球");
    }

    public void speakEnglish() {
        System.out.println("乒乓球教练：姓名：" + getName() + "，行为：说英语");
    }
}
