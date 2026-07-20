import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。

    示例 1：
    输入：arr = [2,6,4,1]
    输出：false
    解释：不存在连续三个元素都是奇数的情况。

    示例 2：
    输入：arr = [1,2,34,3,4,5,7,23,12]
    输出：true
    解释：存在连续三个元素都是奇数的情况，即 [5,7,23] 。*/
    public static boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数组长度 n：");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("请输入" + n + "个整数：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if(threeConsecutiveOdds(arr)) {
            System.out.println("存在连续三个元素都是奇数的情况");
        } else {
            System.out.println("不存在连续三个元素都是奇数的情况");
        }
    }



    /* 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
    你可以假设数组是非空的，并且给定的数组总是存在多数元素。

    示例 1：
    输入：[3,2,3]
    输出：3

    示例 2：
    输入：[2,2,1,1,1,2,2]
    输出：2*/

    // 法一：排序取中点。出现次数 > n/2 的元素排序后必覆盖中间位置
    public static int majorityElement1(int[] array) {
        Arrays.sort(array); // 排序，使相同元素聚成连续段
        return array[array.length / 2]; // 中点下标 n/2，该位置即为多数元素
    }

    // 法二：暴力双循环。固定候选 cand，扫全表数票，次数 > n/2 则返回
    public static int majorityElement2(int[] array) {
        int n = array.length;
        for (int cand : array) {
            int cnt = 0;
            for (int num : array) {
                if (cand == num) {
                    cnt++;
                }
                if (cnt > n / 2) {
                    return cand;
                }
            }
        }
        return -1;
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数组长度 n：");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("请输入" + n + "个整数：");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        //int ret = majorityElement1(array);
        int ret = majorityElement2(array);
        System.out.println("多数元素为：" + ret);
    }
}
