package demo3_standard_javabean;

/**
 * 题目：编写带有接口和抽象类的标准 JavaBean 类
 *
 * 我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。
 *
 * 为了出国交流，跟乒乓球相关的人员都需要学习英语。
 *
 * 请创建名为 Person 的抽象类，包含 name、age 两个成员变量，并按照标准 JavaBean 规范提供
 * getName、setName、getAge、setAge 方法。
 *
 * 乒乓球运动员 TableTennisPlayer：继承 Person，具备学打乒乓球 playTableTennis 能力和说英语
 * speakEnglish 能力。
 * 篮球运动员 BasketballPlayer：继承 Person，具备学打篮球 playBasketball 能力。
 * 乒乓球教练 TableTennisCoach：继承 Person，具备教打乒乓球 teachTableTennis 能力和说英语
 * speakEnglish 能力。
 * 篮球教练 BasketballCoach：继承 Person，具备教打篮球 teachBasketball 能力。
 *
 * 请根据上述业务为 playTableTennis、playBasketball、teachTableTennis、teachBasketball 和
 * speakEnglish 设计对应接口，并在 Main 中创建四类人员，测试每个人具备的行为。
 *
 * 请根据以上需求，使用抽象类和接口完成相关标准 JavaBean 类的设计，并在 Main 中创建对象，
 * 测试四类人员各自具备的行为。
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== 教练行为 =====");
        BasketballCoach basketballCoach = new BasketballCoach("张三", 40);
        TableTennisCoach tableTennisCoach = new TableTennisCoach("李四", 42);
        //篮球教练
        basketballCoach.teach();
        //乒乓球教练
        tableTennisCoach.teach();
        tableTennisCoach.speakEnglish();

        //换行
        System.out.println();

        System.out.println("===== 运动员行为 =====");
        BasketballPlayer basketballPlayer = new BasketballPlayer("王五", 20);
        TableTennisPlayer tableTennisPlayer = new TableTennisPlayer("赵六", 22);
       //篮球运动员
        basketballPlayer.study();
        //乒乓球运动员
        tableTennisPlayer.study();
        tableTennisPlayer.speakEnglish();
    }
}
