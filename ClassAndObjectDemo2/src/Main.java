/**
 * 【综合题】类和对象 —— 简易图书 Book
 *
 * 1. 成员变量(public)：title, author, price, stock
 * 2. 成员方法(无 static)：
 *    - setInfo(...)          // 用 this 赋值
 *    - borrow()              // stock>0 则减1并提示借出，否则提示库存不足
 *    - returnBook()          // stock+1 并提示归还
 *    - printInfo()           // 打印书名/作者/价格/库存
 * 3. 构造：无参 this("未命名","佚名",0.0,0)；有参用 this.xxx=xxx
 * 4. 重写 toString，使 println(对象) 输出可读信息
 * 5. main 测试：
 *    b1 = new Book("Java SE","比特",88.5,3)
 *    b2 = new Book() 后 setInfo("数据结构","严蔚敏",45.0,1)
 *    打印 b1、b2 → b1借2次 → b2借2次 → b2还1次 → println(b1)、println(b2)
 *
 * 参考输出：
 * 书名:Java SE, 作者:比特, 价格:88.5, 库存:3
 * 书名:数据结构, 作者:严蔚敏, 价格:45.0, 库存:1
 * Java SE 借出成功，剩余库存：2
 * Java SE 借出成功，剩余库存：1
 * 数据结构 借出成功，剩余库存：0
 * 数据结构 库存不足，无法借出
 * 数据结构 归还成功，当前库存：1
 * [Java SE, 比特, 88.5, 库存:1]
 * [数据结构, 严蔚敏, 45.0, 库存:1]
 */

// Book：图书类（模板）；每个 new Book() 得到一个独立对象
class Book {
    // 成员变量：每个对象各自一份
    public String title;     // 书名
    public String author;    // 作者
    public double price;     // 价格
    public int stock;        // 库存数量

    /**
     * 批量设置属性。
     * 形参与成员变量同名时，必须用 this.成员 表示“当前对象的字段”，
     * 否则 year=year 只会改局部形参，改不到对象。
     */
    public void setInfo(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    /** 借书：有库存则减 1，否则提示不足 */
    public void borrow() {
        if (stock > 0) {
            stock--; // 等价于 this.stock--，成员方法里可省略 this
            System.out.println(title + " 借出成功，剩余库存：" + stock);
        } else {
            System.out.println(title + " 库存不足，无法借出");
        }
    }

    /** 还书：库存加 1 */
    public void returnBook() {
        stock++;
        System.out.println(title + " 归还成功，当前库存：" + stock);
    }

    /** 打印当前对象的图书信息 */
    public void printInfo() {
        System.out.println("书名：" + title + ", 作者:" + author + ", 价格：" + price + ", 库存：" + stock);
    }

    /**
     * 无参构造：用 this(...) 调用有参构造，避免重复写赋值代码。
     * 注意：this(...) 必须写在构造方法的第一行。
     */
    public Book() {
        this("未命名", "佚名", 0.0, 0);
    }

    /**
     * 有参构造：创建对象时由 new 自动调用，完成初始化。
     * 写了有参后，编译器不再生成默认无参，所以无参要自己写。
     */
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    /**
     * 重写 toString：System.out.println(book) 时会调用它，
     * 否则默认输出类似 Book@1a2b3c 的地址信息。
     */
    public String toString() {
        return "[" + "书名：" + title + ", 作者:" + author + ", 价格：" + price + ", 库存：" + stock + "]";
    }
}

public class Main {

    public static void main(String[] args) {
        // 1. 有参构造：创建时直接初始化
        Book b1 = new Book("Java SE", "比特", 88.5, 3);
        b1.printInfo();

        // 2. 无参构造 + setInfo：先默认值，再改成指定信息
        Book b2 = new Book();
        b2.setInfo("数据结构", "严蔚敏", 45.0, 1);
        b2.printInfo();

        // 3. 借书：b1 库存 3 可借 2 次；b2 库存 1，第 2 次会失败
        b1.borrow();
        b1.borrow();
        b2.borrow();
        b2.borrow();

        // 4. 还书
        b2.returnBook();

        // 5. 直接打印对象，走 toString()
        System.out.println(b1);
        System.out.println(b2);
    }
}
