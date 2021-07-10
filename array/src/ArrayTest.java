/**
 * @author Francis
 * @create 2021-06-19 15:59
 */
public class ArrayTest {
    //编写一个main方法
    public static void main(String[] args) {
        /*它们的体重分别是3kg,5kg,1kg,3.4kg,2kg,50kg。
        请问这六只鸡的总体重是多少?平均体重是多少?
        思路分析
        1.定义六个变量double,求和得到总体重
        2.平均体重=总体重/6
        3.分析传统实现的方式问题
        .6->600->5664.引出新的技术->使用数组来解决.*/
        double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 50;
        double totalWeight1 = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
        double avgWeight=totalWeight1/6;
         System.out.println
         ("总体重="+totalWeight1+"平均体重="+avgWeight);

        double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8, 88.8, 1.1, 5.6, 100};
        System.out.println("===使用数组解决===");
        double totalWeight = 0;
        for (int i = 0; i < hens.length; i++) {
            System.out.println("第" + (i + 1) + "个元素的值=" + hens[i]);
            totalWeight += hens[i];
        }
        System.out.println("总体重=" + totalWeight + "平均体重=" + (totalWeight / hens.length));
    }
}

