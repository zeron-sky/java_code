package demo6;

/** 数字展品子类，用于观察子类的初始化顺序。 */
public class DigitalExhibit extends Exhibit {
    /** 子类首次加载时执行一次，用于启动数字展品系统。 */
    static {
        System.out.println("数字展品系统启动");
    }

    /** 每次创建数字展品时、子类构造方法前执行，用于登记数字展品。 */
    {
        System.out.println("数字展品登记");
    }

    public DigitalExhibit() {
        System.out.println("数字展品创建");
    }
}
