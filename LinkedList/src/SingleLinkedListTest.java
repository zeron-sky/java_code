public class SingleLinkedListTest {
    public static void main(String[] args) {
        // 测试空链表、size 和 toString
        SingleLinkedList list = new SingleLinkedList();
        System.out.println("空链表：" + list + "，长度：" + list.size());

        // 测试头插和尾插
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println("头插后：" + list);
        list.addLast(4);
        list.addLast(5);
        System.out.println("尾插后：" + list);

        // 测试空链表尾插
        SingleLinkedList tailList = new SingleLinkedList();
        tailList.addLast(10);
        tailList.addLast(20);
        System.out.println("空链表尾插后：" + tailList);

        // 测试按下标插入
        SingleLinkedList indexList = new SingleLinkedList();
        indexList.addLast(1);
        indexList.addLast(3);
        indexList.add(1, 2);
        indexList.add(0, 0);
        indexList.add(indexList.size(), 4);
        System.out.println("按下标插入后：" + indexList + "，长度：" + indexList.size());

        // 测试按下标删除
        SingleLinkedList removeList = new SingleLinkedList();
        removeList.addLast(1);
        removeList.addLast(2);
        removeList.addLast(3);
        removeList.addLast(4);
        removeList.remove(0);
        System.out.println("删除头节点后：" + removeList);
        removeList.remove(1);
        System.out.println("删除中间节点后：" + removeList);
        removeList.remove(1);
        System.out.println("删除尾节点后：" + removeList);
        removeList.remove(0);
        System.out.println("删除最后一个节点后：" + removeList);

        // 测试按值删除第一个节点
        SingleLinkedList valueList = new SingleLinkedList();
        valueList.addLast(1);
        valueList.addLast(2);
        valueList.addLast(3);
        valueList.addLast(2);
        valueList.removeFirstByValue(1);
        System.out.println("按值删除头节点后：" + valueList);
        valueList.removeFirstByValue(3);
        System.out.println("按值删除中间节点后：" + valueList);
        valueList.removeFirstByValue(2);
        System.out.println("按值删除第一个重复值后：" + valueList);
        valueList.removeFirstByValue(2);
        System.out.println("按值删除尾节点后：" + valueList);
        valueList.removeFirstByValue(100);
        System.out.println("删除不存在元素后：" + valueList);

        // 测试按值删除所有节点
        SingleLinkedList allValueList = new SingleLinkedList();
        allValueList.addLast(2);
        allValueList.addLast(2);
        allValueList.addLast(3);
        allValueList.addLast(2);
        allValueList.addLast(4);
        allValueList.addLast(2);
        allValueList.removeAllByValue(2);
        System.out.println("按值删除所有节点后：" + allValueList);

        // 测试清空链表
        SingleLinkedList clearList = new SingleLinkedList();
        clearList.addLast(1);
        clearList.addLast(2);
        clearList.clear();
        System.out.println("清空链表后：" + clearList + "，长度：" + clearList.size());

        // 测试查找、获取和修改数据
        System.out.println("是否包含 3：" + list.contains(3));
        System.out.println("是否包含 100：" + list.contains(100));
        System.out.println("元素 3 的下标：" + list.indexOf(3));
        System.out.println("元素 100 的下标：" + list.indexOf(100));
        System.out.println("下标 2 的元素：" + list.get(2));
        list.set(2, 30);
        System.out.println("修改下标 2 后：" + list);

        // 测试重复元素的第一次出现下标
        SingleLinkedList duplicateList = new SingleLinkedList();
        duplicateList.addLast(4);
        duplicateList.addLast(2);
        duplicateList.addLast(4);
        System.out.println("重复元素 4 的第一个下标：" + duplicateList.indexOf(4));

        System.out.println("所有增删查操作演示完成");
    }
}
