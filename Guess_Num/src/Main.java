import java.util.Random;
import java.util.Scanner;


/**
 * 猜数字游戏
 * 用户输入数字，判断是大于、小于还是等于系统随机生成的数字，
 * 猜对就结束；最多猜 5 次，没猜对就公布正确答案。
 */

public class Main {
    public static void main(String[] args) {
        // 创建随机数生成器
        Random random = new Random();
        // 生成 1～100 的随机数
        int targetNum = random.nextInt(100) + 1;

        // 创建输入工具，用来读取用户从键盘输入的内容
        Scanner sc = new Scanner(System.in);

        // 最多可以猜的次数
        int maxAttempts = 5;
        // 标记是否猜对
        boolean isCorrect = false;

        // 打印欢迎信息
        System.out.println("===== 欢迎来到猜数字游戏 =====");
        System.out.println("请输入1 ~ 100之间的数字");
        System.out.println("你一共有 " + maxAttempts + " 次机会，开始吧！");
        System.out.println();

        // 循环猜数字，最多猜 maxAttempts 次
        for (int i = 1; i <= maxAttempts; i++) {
            // 提示用户输入
            System.out.print("第 " + i + " 次，请输入你的猜测：");
            // 读取用户输入的整数
            int guessNum = sc.nextInt();

            // 比较用户猜的数字和正确答案
            if (guessNum < targetNum) {
                System.out.println("猜小了！");
            } else if (guessNum > targetNum) {
                System.out.println("猜大了！");
            } else {
                // 猜对了：修改标记，并跳出循环
                System.out.println("恭喜你，猜对了！");
                isCorrect = true;
                break;
            }

            // 计算还剩几次机会
            int remaining = maxAttempts - i;
            if (remaining > 0) {
                System.out.println("还剩余 " + remaining + " 次机会。");
                System.out.println();
            }
        }

        // 如果一直没猜对，公布正确答案
        if (!isCorrect) {
            System.out.println("很遗憾，你没猜对。正确答案是 " + targetNum + "。");
        }

        // 关闭输入工具
        sc.close();
    }
}