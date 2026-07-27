package demo1;

/*AudioBook（有声读物）：继承 LibraryItem。
编写 play() 方法，输出“正在播放有声读物”。
编写无参 showCategory() 方法，输出“这是有声读物资料”。*/

/** 有声读物继承馆藏资料的分类展示能力，并增加播放功能。 */
public class AudioBook extends LibraryItem {
    /** 播放当前有声读物。 */
    public void play() {
        System.out.println("正在播放有声读物");
    }
    /** 覆盖父类的无参方法，展示有声读物自身的资料类型。 */
    public void showCategory() {
        System.out.println("这是有声读物资料");
    }
}
