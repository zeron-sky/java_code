package demo1;

/*LibraryItem（馆藏资料）：
 编写无参 showCategory() 方法，输出“这是普通馆藏资料”。
 编写带一个 String 参数的 showCategory(String category) 方法，
 输出“馆藏分类：”加上传入的分类名称。*/

/** 馆藏资料的父类，提供两种分类展示方式。 */
public class LibraryItem {
    /** 展示默认的资料类型。 */
    public void showCategory() {
        System.out.println("这是普通馆藏资料");
    }
    /** 根据传入的分类名称展示资料分类。 */
    public void showCategory(String category) {
        System.out.println("馆藏分类：" + category);
    }
}