/**
 * @author Francis
 * @create 2021-06-19 15:59
 */
public class ArrayTest {
    //��дһ��main����
    public static void main(String[] args) {
        /*���ǵ����طֱ���3kg,5kg,1kg,3.4kg,2kg,50kg��
        ��������ֻ�����������Ƕ���?ƽ�������Ƕ���?
        ˼·����
        1.������������double,��͵õ�������
        2.ƽ������=������/6
        3.������ͳʵ�ֵķ�ʽ����
        .6->600->5664.�����µļ���->ʹ�����������.*/
        double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 50;
        double totalWeight1 = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
        double avgWeight=totalWeight1/6;
         System.out.println
         ("������="+totalWeight1+"ƽ������="+avgWeight);

        double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8, 88.8, 1.1, 5.6, 100};
        System.out.println("===ʹ��������===");
        double totalWeight = 0;
        for (int i = 0; i < hens.length; i++) {
            System.out.println("��" + (i + 1) + "��Ԫ�ص�ֵ=" + hens[i]);
            totalWeight += hens[i];
        }
        System.out.println("������=" + totalWeight + "ƽ������=" + (totalWeight / hens.length));
    }
}

