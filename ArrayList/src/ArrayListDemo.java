import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList 使用练习
 * 包含：构造、常见操作、三种遍历方式
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        testConstruct();
        testCommonOperations();
        testTraversal();
    }

    /**
     * 4.1 ArrayList 的构造
     */
    public static void testConstruct() {
        System.out.println("===== 4.1 ArrayList的构造 =====");

        // 构造一个空的列表（推荐写法）
        List<Integer> list1 = new ArrayList<>();

        // 构造一个具有10个容量的列表
        List<Integer> list2 = new ArrayList<>(10);
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // 用已有列表构造新列表，两个列表元素一致
        List<Integer> list3 = new ArrayList<>(list2);

        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
    }

    /**
     * 4.2 ArrayList 常见操作：增、删、改、查
     */
    public static void testCommonOperations() {
        System.out.println("===== 4.2 ArrayList常见操作 =====");

        List<Integer> list = new ArrayList<>();

        // 尾插元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 在下标1的位置插入元素，后续元素整体后移
        list.add(1, 1);
        System.out.println("添加后: " + list);

        // 获取有效元素个数
        System.out.println("元素个数: " + list.size());

        // 获取下标2的元素
        System.out.println("下标2的元素: " + list.get(2));

        // 将下标0的元素修改为0
        list.set(0, 0);
        System.out.println("修改后: " + list);

        // 删除下标3的元素（注意：传整数默认按位置删）
        list.remove(3);
        System.out.println("删除下标3后: " + list);

        // 删除值为2的元素（按值删除需要写成 Integer 对象）
        list.remove(Integer.valueOf(2));
        System.out.println("删除数字2后: " + list);

        // 判断是否包含指定元素
        System.out.println("是否包含5: " + list.contains(5));
    }

    /**
     * 4.3 ArrayList 的三种遍历方式
     */
    public static void testTraversal() {
        System.out.println("===== 4.3 ArrayList的遍历 =====");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 方式一：for 循环 + 下标
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 方式二：foreach 遍历
        for (Integer x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 方式三：迭代器遍历
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
