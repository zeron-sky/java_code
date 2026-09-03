import java.util.NoSuchElementException;

public class MyStackTest {
    public static void main(String[] args) {
        // 1. 测试入栈和查看栈顶元素
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        if (stack.size() != 3 || stack.peek() != 30) {
            throw new AssertionError("入栈测试失败");
        }
        System.out.println("入栈测试通过");

        // 2. 测试出栈：最后放进去的元素应该最先出来
        if (stack.pop() != 30 || stack.pop() != 20 || stack.pop() != 10) {
            throw new AssertionError("出栈测试失败");
        }
        if (!stack.empty()) {
            throw new AssertionError("清空后，栈应该为空");
        }
        System.out.println("出栈测试通过");

        // 3. 测试扩容：放入超过初始容量的元素
        MyStack largeStack = new MyStack();
        for (int i = 0; i < 1001; i++) {
            largeStack.push(i);
        }
        if (largeStack.size() != 1001 || largeStack.peek() != 1000) {
            throw new AssertionError("扩容测试失败");
        }
        System.out.println("扩容测试通过");

        // 4. 测试空栈出栈是否会抛出异常
        try {
            new MyStack().pop();
            throw new AssertionError("空栈出栈应该抛出异常");
        } catch (NoSuchElementException e) {
            System.out.println("空栈测试通过");
        }

        System.out.println("所有测试通过！");
    }
}
