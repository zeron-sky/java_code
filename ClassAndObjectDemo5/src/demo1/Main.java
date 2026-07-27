package demo1;

/*
 * 第 1 题
 *
 * 完成 LibraryItem（馆藏资料）和 AudioBook（有声读物）两个类，
 * AudioBook 继承 LibraryItem。
 *
 * 馆藏资料可以展示分类（showCategory）；有声读物还能播放（play）。
 *
 * 有声读物展示分类时，显示“这是有声读物资料”。
 * 展示指定分类时，分类（category）为“文学”。
 *
 * 在 main（主方法）中创建一个有声读物对象，完成播放和两次分类展示。
 *
 * 预期输出：
 * 正在播放有声读物
 * 这是有声读物资料
 * 馆藏分类：文学
 *
 */
public class Main {
    public static void main(String[] args) {
        AudioBook audioBook = new AudioBook();
        audioBook.play();
        audioBook.showCategory();
        audioBook.showCategory("文学");
    }
}
