public class Main {
    /*求出0～n之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，
    如；153＝1^3＋5^3＋3^3，则153是一个“水仙花数“。）*/
    public static void main(String[] args) {
        int ones = 0, tens = 0, hundreds = 0;
        for (int i = 100; i <= 999; i++) {
            ones = i % 10;
            tens = (i / 10) % 10;
            hundreds = i / 100;
            if ((hundreds * hundreds * hundreds + tens * tens * tens + ones * ones * ones) == i) {
                System.out.print(i + " ");
            }
        }
    }


    //    计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static void main1(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                sum += 1.0 / i;
            else
                sum += -1.0 / i;
        }
        System.out.printf("结果为：%.2f\n", sum);
    }
}
