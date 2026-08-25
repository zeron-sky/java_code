// 单向链表：通过 head 找到链表中的第一个节点
public class SingleLinkedList {
    // 链表节点：只供单链表内部使用
    private static class LinkedNode {
        private int data;
        private LinkedNode next;

        private LinkedNode(int data) {
            this.data = data;
        }
    }

    // 头引用：指向链表的第一个数据节点
    private LinkedNode head;

    // 头插法：把新节点插入到链表的最前面
    public void addFirst(int data) {
        LinkedNode newNode = new LinkedNode(data);

        // 新节点先指向原来的第一个节点
        newNode.next = head;

        // 再让 head 指向新节点，新节点成为新的第一个节点
        head = newNode;
    }

    // 尾插法：把新节点插入到链表的末尾
    public void addLast(int data) {
        LinkedNode newNode = new LinkedNode(data);
        // 链表为空时，新节点直接成为头节点
        if (head == null) {
            head = newNode;
            return;
        }

        // 遍历到最后一个节点
        LinkedNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        // 将新节点接到末尾
        cur.next = newNode;
    }

    // 在指定下标插入元素，允许的下标范围是 0 到当前长度
    public void add(int index, int data) {
        int size = this.size();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("下标越界！index = " + index);
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        LinkedNode preNode = head;
        for (int i = 1; i < index; i++) {
            preNode = preNode.next;
        }
        LinkedNode newNode = new LinkedNode(data);
        newNode.next = preNode.next;
        preNode.next = newNode;
    }

    // 返回链表中元素的数量
    public int size() {
        if (head == null) {
            return 0;
        }

        LinkedNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    // 按值查找元素，找到返回 true，否则返回 false
    public boolean contains(int data) {
        for (LinkedNode cur = head; cur != null; cur = cur.next) {
            if (cur.data == data) {
                return true;
            }
        }
        return false;
    }

    // 按值查找元素的第一次出现位置，找不到返回 -1
    public int indexOf(int data) {
        int index = 0;
        for (LinkedNode cur = head; cur != null; cur = cur.next, index++) {
            if (cur.data == data) {
                return index;
            }
        }
        return -1;
    }

    // 按下标删除链表节点
    public void remove(int index) {
        int size = size();
        // 处理下标边界情况
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("下标越界！index = " + index);
        }

        // 删除头节点
        if (index == 0) {
            head = head.next;
            return;
        }

        // 删除中间节点和尾节点
        LinkedNode prevNode = head;
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }

        LinkedNode toDelete = prevNode.next;
        prevNode.next = toDelete.next;
    }

    // 按值删除第一个匹配节点
    public void removeFirstByValue(int data) {
        // 处理空链表的情况
        if (head == null) {
            return;
        }

        // 处理头节点
        if (head.data == data) {
            head = head.next;
            return;
        }

        LinkedNode prevNode = head;
        // 查找要删除节点的前一个节点
        while (prevNode.next != null) {
            if (prevNode.next.data == data) {
                break;
            }
            prevNode = prevNode.next;
        }
        if (prevNode.next == null) {
            return;
        }

        LinkedNode toDelete = prevNode.next;
        prevNode.next = toDelete.next;
    }

    // 按值删除所有匹配节点
    public void removeAllByValue(int data) {
        // 处理空链表的情况
        if (head == null) {
            return;
        }

        LinkedNode prevNode = head;
        LinkedNode cur = head.next;

        while (cur != null) {
            if (cur.data == data) {
                prevNode.next = cur.next;
                cur = cur.next;
            } else {
                prevNode = cur;
                cur = cur.next;
            }
        }

        // 处理头节点
        if (head.data == data) {
            head = head.next;
        }
    }

    // 清空整个链表
    public void clear() {
        head = null;
    }

    // 根据下标获取节点数据
    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("下标越界！");
        }

        int i = 0;
        for (LinkedNode cur = head; cur != null; cur = cur.next) {
            if (i == index) {
                return cur.data;
            }
            i++;
        }
        return -1;
    }

    // 修改指定下标的节点数据
    public void set(int index, int data) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("下标越界！");
        }

        int i = 0;
        for (LinkedNode cur = head; cur != null; cur = cur.next) {
            if (i == index) {
                cur.data = data;
                return;
            }
            i++;
        }
    }

    // 将链表转换成字符串，格式示例：[4,3,2,1]
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        // 从第一个节点开始遍历
        LinkedNode cur = head;

        stringBuilder.append("[");
        while (cur != null) {
            stringBuilder.append(cur.data);

            // 当前节点不是最后一个节点时，才添加逗号
            if (cur.next != null) {
                stringBuilder.append(",");
            }

            // 移动到下一个节点
            cur = cur.next;
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
