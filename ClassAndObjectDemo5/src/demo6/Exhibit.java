package demo6;

/** 展品父类，用于观察父类的初始化顺序。 */
public class Exhibit {
    /** 类首次加载时执行一次，用于启动展品系统。 */
    static {
        System.out.println("展品系统启动");
    }

    /** 每次创建对象时、构造方法前执行，用于登记展品。 */
    {
        System.out.println("展品登记");
    }

    public Exhibit() {
        System.out.println("展品创建");
    }
}
