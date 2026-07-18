public class Main {
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void bubbleSort(int[] arr) {
        //轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //每一轮的比较
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {21, 45, 36, 74, 25, 14, 36, 52, 64, 52};

        System.out.print("排序前: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.print("排序后: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // 给定一个有序整型数组，实现二分查找
    // 找到返回下标，找不到返回 -1
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key > arr[mid]) {
                left = mid + 1;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};

        int key1 = 7;
        int index1 = binarySearch(arr, key1);
        System.out.println("查找 " + key1 + " 的结果下标: " + index1);

        int key2 = 4;
        int index2 = binarySearch(arr, key2);
        System.out.println("查找 " + key2 + " 的结果下标: " + index2);
    }


    /*调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    如数组：[1,2,3,4,5,6]
    调整后可能是：[1, 5, 3, 4, 2, 6]*/
    public static void sort(int[] arr) {
        //双指针法遍历数组
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 1) {
                left++;
            }
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    //交换数字
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main2(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int key = 7;
        int index = binarySearch(arr, key);
        System.out.println("查找 " + key + " 的结果下标: " + index);

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        //调整前数组
        System.out.println("调整前数组:");
        for (int i : arr2) {
            System.out.print(i + " ");
        }

        sort(arr2);

        //调整后数组
        System.out.println("\n调整后数组:");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }


    /*实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素乘以 2 ,
    并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}*/
    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    public static void main1(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("修改前:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int[] ret = transform(arr);
        System.out.println("\n修改后:");
        for (int i : ret) {
            System.out.print(i + " ");
        }
    }
}