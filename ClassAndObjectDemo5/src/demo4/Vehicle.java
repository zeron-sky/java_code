package demo4;

/** 交通工具父类，保存品牌信息。 */
public class Vehicle {
    /** 交通工具品牌。 */
    public String brand;

    /** 使用默认品牌登记交通工具。 */
    public Vehicle() {
        this.brand = "未知品牌";
    }

    /** 使用提供的品牌登记交通工具。 */
    public Vehicle(String brand) {
        this.brand = brand;
    }
}