public class SeqList {
    // 底层数组：保存顺序表中的所有数据
    private int[] array;

    // 有效元素个数；有效元素的下标范围是 0 到 size - 1
    private int size;

    // 创建默认容量为 10 的顺序表
    public SeqList() {
        array = new int[10]; // 默认数组容量为 10
        size = 0;
    }

    // 创建指定初始容量的顺序表
    public SeqList(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // 扩容：数组满时创建容量为原来两倍的新数组，并复制旧数据
    private void grow() {
        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    // 尾插：将数据放到当前最后一个有效元素的后一格
    public void add(int data) {
        if (size == array.length) {
            grow();
        }
        array[size] = data;
        size++;
    }

    // 在指定下标位置插入数据；pos 可以等于 size，表示在末尾插入
    public void add(int pos, int data) {
        if (pos < 0 || pos > size) {
            System.out.println("下标不合法");
            return;
        }

        if (size == array.length) {
            grow();
        }

        // 从后向前移动，避免前面的数据覆盖后面的数据
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }

        array[pos] = data;
        size++;
    }

    // 判断顺序表中是否包含指定元素
    public boolean contains(int toFind) {
        for (int i = 0; i < size; i++) {
            if (toFind == array[i]) {
                return true;
            }
        }
        return false;
    }

    // 返回指定元素第一次出现的下标；找不到时返回 -1
    public int indexOf(int toFind) {
        for (int i = 0; i < size; i++) {
            if (toFind == array[i]) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素；pos 必须在 0 到 size - 1 范围内
    public int get(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("下标不合法");
            return -1;
        }

        return array[pos];
    }

    // 将 pos 位置已有的元素改为 value，不会新增元素
    public void set(int pos, int value) {
        if (pos < 0 || pos >= size) {
            System.out.println("下标不合法");
            return;
        }

        array[pos] = value;
    }

    // 删除顺序表中第一次出现的元素
    public void remove(int toRemove) {
        // 先找到要删除元素的位置
        int pos = indexOf(toRemove);
        if (pos == -1) {
            System.out.println("此元素" + toRemove + "不存在");
            return;
        }
        // 从删除位置开始，将后面的元素依次向前移动一格
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        // 最后一个有效元素已经重复，因此有效元素个数减一
        size--;
    }

    // 返回当前有效元素的个数，不是数组容量
    public int size() {
        return size;
    }

    // 清空顺序表：只需令有效元素个数变为 0，数组可继续使用
    public void clear() {
        size = 0;
    }

    // 仅用于测试：按顺序输出所有有效元素
    public void display() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i != size - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
