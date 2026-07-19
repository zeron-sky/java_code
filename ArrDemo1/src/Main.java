import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

    示例 1:
    输入: [2,2,1]
    输出: 1

    示例 2:
    输入: [4,1,2,1,2]
    输出: 4*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入数组的长度：");
        int n = sc.nextInt();

        int ret = 0;

        System.out.print("请输入 " + n + " 个整数：");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            // 相同的数异或会抵消：a ^ a = 0，最后只剩只出现一次的数。
            ret ^= num;
        }
        System.out.println("只出现一次的数字是：" + ret);
    }




    /*给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出
    和为目标值 target 的那两个整数，并返回它们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    你可以按任意顺序返回答案。
    示例 1：
    输入：nums = [2,7,11,15], target = 9

    输出：[0,1]

    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。*/
    public static int[] twoSum(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组长度 n：");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("请输入 " + n + " 个整数：");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("请输入目标值 target：");
        int target = sc.nextInt();

        int[] ret = twoSum(nums, target);
        System.out.println("结果下标：" + Arrays.toString(ret));
    }
}
