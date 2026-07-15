public class Main {
    //求2个整数的最大公约数
    public static void main(String[] args) {
        int a = 100, b = 30;
        while (a % b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        System.out.println(b);
    }

    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main3(String[] args) {
        int i = 1, cnt = 0;
        while(i <= 100) {
            int tmp = i;
            while(tmp > 0) {
                if(tmp % 10 == 9) {
                    cnt++;
                }
                tmp /= 10;
            }
            i++;
        }
        System.out.println(cnt);
    }

    //输出 1000 - 2000 之间所有的闰年
    public static void main2(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if(((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                System.out.print(i + " ");
            }
        }
    }

    //打印 1 - 100 之间所有的素数
    public static void main1(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean flg = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flg = false;
                    break;
                }
            }
            if (flg) {
                System.out.print(i + " ");
            }
        }
    }
}