import java.util.Scanner;

public class Main {
    //在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值

    //定义求最大值的方法
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println("两个整数的最大值：" + max(20, 30));
        System.out.println("三个小数的最大值：" + max(48.6, 14.3, 36.1));
    }


    //求斐波那契数列的第n项(迭代实现)

    //定义一个求斐波那契数列的方法
    public static int fib(int n) {
        int fib1 = 1, fib2 = 1;
        for (int i = 3; i <= n; i++) {
            int next = fib1 + fib2;
            fib1 = fib2;
            fib2 = next;
        }
        return fib2;
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入斐波那契数列的项数 n：");
        int n = sc.nextInt();
        System.out.println("第 " + n + " 项斐波那契数为：" + fib(n));
    }


    //求1！+2！+3！+4！+........+n!的和

    //定义一个求阶乘的方法
    public static int fac(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //定义一个求阶乘和的方法
    public static int facSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }

    public static void main3(String[] args) {
        //输入n, 求1!~n!的和
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //输出结果
        System.out.println(facSum(n));
    }


    /*编写代码模拟三次密码输入的场景。最多能输入三次密码，密码正确，提示“登录成功”,密码错误，可以重新输入，
    最多输入三次。三次均错，则提示退出程序*/
    public static void main2(String[] args) {
        //定义Scanner对象，用于读取输入
        Scanner sc = new Scanner(System.in);
        //最大输入次数
        int maxInput = 3;
        //正确密码
        String correctPassword = "123456";
        //提示输入密码
        System.out.println("请输入密码，最多可输入" + maxInput + "次：");

        while (maxInput > 0) {
            String passWord = sc.nextLine();
            if (correctPassword.equals(passWord)) {
                System.out.println("登录成功");
                break;
            }
            maxInput--;
            if (maxInput > 0) {
                System.out.println("密码错误，请重新输入，最多可输入" + maxInput + "次");
            } else {
                System.out.println("密码输入已超过3次，退出程序");
            }
        }
    }


    //输出一个整数的每一位，如：123的每一位是3，2，1
    public static void main1(String[] args) {
        int n = 123;
        while (n != 0) {
            System.out.print(n % 10 + " ");
            n /= 10;
        }
    }
}
