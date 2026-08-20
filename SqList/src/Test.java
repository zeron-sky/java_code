public class Test {
    public static void main(String[] args) {
        SeqList seqList = new SeqList();

        // 尾插：添加 11 个元素，顺便测试自动扩容
        seqList.add(10);
        seqList.add(20);
        seqList.add(30);
        seqList.add(40);
        seqList.add(50);
        seqList.add(60);
        seqList.add(70);
        seqList.add(80);
        seqList.add(90);
        seqList.add(100);
        seqList.add(110);
        System.out.print("尾插后：");
        seqList.display();
        System.out.println();

        // 指定位置插入：在下标 2 的位置插入 330
        seqList.add(2, 330);
        System.out.print("插入 330 后：");
        seqList.display();
        System.out.println();

        // 包含和查找
        System.out.println("是否包含 30：" + seqList.contains(30));
        System.out.println("40 的下标：" + seqList.indexOf(40));
        System.out.println("999 的下标：" + seqList.indexOf(999));

        // 获取和修改
        System.out.println("下标 2 的元素：" + seqList.get(2));
        seqList.set(2, 999);
        System.out.print("把下标 2 修改为 999 后：");
        seqList.display();
        System.out.println();

        // 删除第一次出现的 999
        seqList.remove(999);
        System.out.print("删除 999 后：");
        seqList.display();
        System.out.println();

        // 获取长度并清空
        System.out.println("当前长度：" + seqList.size());
        seqList.clear();
        System.out.print("清空后：");
        seqList.display();
        System.out.println();
        System.out.println("清空后的长度：" + seqList.size());
    }
}
