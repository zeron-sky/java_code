import java.util.Scanner;

public class Main {
    // 递归求解汉诺塔：把 n 个盘子从 src(起点柱) 借助 tmp(中转柱) 移到 tgt(目标柱)
    public static void hanoi(int n, char src, char tgt, char tmp) {
        if (n == 0) {
            return;
        }
        // 1. 上面 n-1 个：src(起点柱) → tmp(中转柱)，借助 tgt(目标柱)
        hanoi(n - 1, src, tmp, tgt);
        // 2. 当前这 n 个里最大的 1 个：src(起点柱) → tgt(目标柱)
        System.out.println(src + "(起点柱) -> " + tgt + "(目标柱)");
        // 3. 上面 n-1 个：tmp(中转柱) → tgt(目标柱)，借助 src(起点柱)
        hanoi(n - 1, tmp, tgt, src);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入盘子个数
        System.out.println("盘子个数为：");
        int n = sc.nextInt();
        // A=起点柱  B=目标柱  C=中转柱
        char src = 'A', tgt = 'B', tmp = 'C';

        hanoi(n, src, tgt, tmp);
    }


    //递归求斐波那契数列的第 N 项
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //输出结果
        System.out.println(fib(n));
    }


    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int sumNum(int n) {
        if (n < 9) {
            return n;
        }
        return n % 10 + sumNum(n / 10);
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //输出结果
        System.out.println(sumNum(n));
    }


    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)（递归）
    public static void print(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            print(n / 10);
            System.out.print(n % 10 + " ");
        }
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 n：");
        int n = sc.nextInt();

        print(n);
    }


    // 递归求 1 + 2 + ... + n
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 读取 n，计算 1~n 的和
        System.out.println("请输入 n：");
        int n = sc.nextInt();
        System.out.println("1~" + n + " 的和为：" + sum(n));
    }


    // 递归求 n 的阶乘
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

    // 读取 n 并输出其阶乘
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 读取 n，计算 n 的阶乘
        System.out.println("请输入 n：");
        int n = sc.nextInt();
        System.out.println(n + " 的阶乘为：" + fac(n));
    }
}
