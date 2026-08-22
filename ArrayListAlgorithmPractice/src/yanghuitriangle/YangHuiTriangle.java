package yanghuitriangle;

import java.util.ArrayList;
import java.util.List;

// 杨辉三角
public class YangHuiTriangle {
    // 生成指定行数的杨辉三角
    public List<List<Integer>> generate(int numRows) {
        // 保存已经生成的所有行
        List<List<Integer>> triangle = new ArrayList<>();

        // 从第 0 行开始逐行构造
        for (int i = 0; i < numRows; i++) {
            // 第 i 行包含 i + 1 个元素
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // 每行的首尾元素固定为 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // 中间元素等于上一行相邻两个元素之和
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }

            // 当前行构造完成后，加入结果集
            triangle.add(row);
        }

        return triangle;
    }

    // 程序入口：生成 5 行并输出结果
    public static void main(String[] args) {
        YangHuiTriangle yanghuitriangle = new YangHuiTriangle();
        System.out.println(yanghuitriangle.generate(5));
    }
}
