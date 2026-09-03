import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyStack {
    // 使用数组保存元素，数组下标越大，元素越靠近栈顶
    private int[] arr;
    // 当前栈中元素的数量，栈顶元素的下标是 size - 1
    private int size;

    // 创建一个初始容量为 1000 的空栈
    public MyStack() {
        this.size = 0;
        this.arr = new int[1000];
    }

    // 入栈
    public void push(int val) {
        // 数组已满时，先扩容再保存新元素
        if (size >= arr.length) {
            realloc();
        }
        // 新元素放在当前栈顶的后面
        arr[size] = val;
        size++;
    }

    // 查看栈顶元素，但不删除它
    public int peek() {
        if (empty()) {
            throw new NoSuchElementException("栈为空，无法获取栈顶元素");
        }
        return arr[size - 1];
    }

    // 删除并返回栈顶元素
    public int pop() {
        if (empty()) {
            throw new NoSuchElementException("栈为空，无法获取栈顶元素");
        }

        // 先将栈顶下标减一，再取出对应元素
        return arr[--size];
    }

    // 返回当前栈中元素的数量
    public int size() {
        return size;
    }

    // 栈中没有元素时返回 true
    public boolean empty() {
        return size == 0;
    }

    // 将数组容量扩大为原来的两倍
    private void realloc() {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
    }
}
