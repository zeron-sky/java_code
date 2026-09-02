class Node {
    // 双向链表节点
    public Node prev; // 前驱节点
    public Node next; // 后继节点
    public int val;   // 节点值

    public Node(int val) {
        this.prev = null;
        this.next = null;
        this.val = val;
    }
}

public class DLinkedList {
    // 头节点，空表时为 null
    private Node head;

    // 头插
    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 尾插
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        // 从头查找尾节点
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newNode;
        newNode.prev = cur;
    }

    // 按下标插入，允许 index == size
    public void add(int index, int val) {
        int size = getSize();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("下标越界, index = " + index);
        }

        if (index == 0) {
            addFirst(val);
            return;
        }

        if (index == size) {
            addLast(val);
            return;
        }

        // 找到下标为 index 的节点
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        // 在 cur 前插入新节点
        Node prev = cur.prev;
        Node newNode = new Node(val);

        newNode.next = cur;
        cur.prev = newNode;

        prev.next = newNode;
        newNode.prev = prev;
    }

    // 判断是否包含指定值
    public boolean contains(int val) {
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.val == val) {
                return true;
            }
        }
        return false;
    }

    // 返回指定值的首次下标
    public int indexOf(int val) {
        int index = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.val == val) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // 删除头节点
    public void removeFirst() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // 删除尾节点
    public void removeLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.prev.next = null;
    }

    // 按下标删除节点
    public void remove(int index) {
        int size = getSize();
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标越界! index = " + index);
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node toDelete = head;
        for (int i = 0; i < index; i++) {
            toDelete = toDelete.next;
        }
        Node prev = toDelete.prev;
        Node next = toDelete.next;

        prev.next = next;
        next.prev = prev;
    }

    // 删除第一个匹配指定值的节点
    public void removeByValue(int val) {
        if (head == null) {
            return;
        }

        if (head.val == val) {
            removeFirst();
            return;
        }

        // 查找首个匹配节点
        Node cur = head;
        while (cur != null) {
            if (cur.val == val) {
                break;
            }
            cur = cur.next;
        }

        if (cur == null) {
            System.out.println("要删除的结点不存在");
            return;
        }

        Node prev = cur.prev;
        Node next = cur.next;

        prev.next = next;
        if (next != null) {
            next.prev = prev;
        }
    }


    // 返回链表长度
    public int getSize() {
        int size = 0;
        for (Node cur = this.head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        Node tail = null;

        // 正向输出并记录尾节点
        for (Node cur = head; cur != null; cur = cur.next) {
            tail = cur;
            stringbuilder.append(cur.val);
            if (cur.next != null) {
                stringbuilder.append(",");
            }
        }

        stringbuilder.append("] | [");

        // 反向输出，检查 prev 指针
        for (Node cur = tail; cur != null; cur = cur.prev) {
            stringbuilder.append(cur.val);
            if (cur.prev != null) {
                stringbuilder.append(",");
            }
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();

        // 测试头插：结果应为 [3,2,1]
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        System.out.println("头插后：" + list);

        // 测试尾插：结果应为 [3,2,1,4,5]
        list.addLast(4);
        list.addLast(5);
        System.out.println("尾插后：" + list);

        // 测试中间插入：把 99 插入下标 2
        list.add(2, 99);
        System.out.println("中间插入后：" + list);

        // 测试 contains：查找存在和不存在的元素
        System.out.println("查找 99：" + list.contains(99));
        System.out.println("查找 100：" + list.contains(100));

        // 测试 indexOf：查找元素的下标
        System.out.println("查找 99 的下标：" + list.indexOf(99));
        System.out.println("查找 100 的下标：" + list.indexOf(100));

        // 测试重复元素：indexOf 应该返回第一次出现的位置
        list.addLast(99);
        System.out.println("添加重复元素后：" + list);
        System.out.println("查找 99 的下标：" + list.indexOf(99));

        // 测试空链表尾删：结果应为 [] | []
        DLinkedList removeList = new DLinkedList();
        removeList.removeLast();
        System.out.println("空链表尾删后：" + removeList);

        // 测试单节点尾删：结果应为 [] | []
        removeList.addLast(1);
        removeList.removeLast();
        System.out.println("单节点尾删后：" + removeList);

        // 测试多节点尾删一次：结果应为 [1,2] | [2,1]
        removeList.addLast(1);
        removeList.addLast(2);
        removeList.addLast(3);
        removeList.removeLast();
        System.out.println("多节点尾删后：" + removeList);

        // 测试多节点连续尾删直到空表：结果应为 [1] | [1]，再变为 [] | []
        removeList.removeLast();
        System.out.println("连续尾删第二次后：" + removeList);
        removeList.removeLast();
        System.out.println("连续尾删至空表后：" + removeList);

        // 测试删除中间节点：删除下标 2 的节点，结果应为 [1,2,4] | [4,2,1]
        DLinkedList removeIndexList = new DLinkedList();
        removeIndexList.addLast(1);
        removeIndexList.addLast(2);
        removeIndexList.addLast(3);
        removeIndexList.addLast(4);
        removeIndexList.remove(2);
        System.out.println("删除中间节点后：" + removeIndexList);

        // 测试删除头节点：结果应为 [2,4] | [4,2]
        removeIndexList.remove(0);
        System.out.println("按下标删除头节点后：" + removeIndexList);

        // 测试删除尾节点：结果应为 [2] | [2]
        removeIndexList.remove(removeIndexList.getSize() - 1);
        System.out.println("按下标删除尾节点后：" + removeIndexList);

        // 测试删除最后一个节点：结果应为 [] | []
        removeIndexList.remove(0);
        System.out.println("删除最后一个节点后：" + removeIndexList);

        // 测试直接删除头节点：结果应为 [8] | [8]
        DLinkedList firstList = new DLinkedList();
        firstList.removeFirst();
        firstList.addLast(7);
        firstList.addLast(8);
        firstList.removeFirst();
        System.out.println("直接删除头节点后：" + firstList);
        firstList.removeFirst();
        System.out.println("直接删除单节点头节点后：" + firstList);

        // 测试按值删除头、中间和尾节点：结果应依次为 [2,3,4]、[2,4]、[2]
        DLinkedList valueList = new DLinkedList();
        valueList.addLast(1);
        valueList.addLast(2);
        valueList.addLast(3);
        valueList.addLast(4);
        valueList.removeByValue(1);
        System.out.println("按值删除头节点后：" + valueList);
        valueList.removeByValue(3);
        System.out.println("按值删除中间节点后：" + valueList);
        valueList.removeByValue(4);
        System.out.println("按值删除尾节点后：" + valueList);

        // 测试按值删除重复元素：只删除第一个 5，结果应为 [6,5] | [5,6]
        DLinkedList duplicateList = new DLinkedList();
        duplicateList.addLast(5);
        duplicateList.addLast(6);
        duplicateList.addLast(5);
        duplicateList.removeByValue(5);
        System.out.println("按值删除重复元素后：" + duplicateList);

        // 测试按值删除不存在的元素和空链表：链表内容都不变
        valueList.removeByValue(99);
        System.out.println("删除不存在的元素后：" + valueList);
        DLinkedList emptyValueList = new DLinkedList();
        emptyValueList.removeByValue(99);
        System.out.println("空链表按值删除后：" + emptyValueList);

        // 测试非法下标：都应抛出 IndexOutOfBoundsException
        try {
            valueList.remove(-1);
            System.out.println("删除非法下标：未抛出异常");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("删除非法下标：捕获到 IndexOutOfBoundsException");
        }
        try {
            valueList.add(valueList.getSize() + 1, 99);
            System.out.println("插入非法下标：未抛出异常");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("插入非法下标：捕获到 IndexOutOfBoundsException");
        }
    }
}
