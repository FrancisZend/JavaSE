/**
 * @author Francis
 * @create 2021-06-22 22:12
 */
public class VariableParamer01 {
    public static void main(String[] args) {
        Method m = new Method();

        System.out.println(m.sum(1, 5, 100));
        System.out.println(m.sum(1, 19));

    }

}

class Method {
    //���Լ���2�����ĺͣ�3�����ĺͣ�4.5������//����ʹ�÷�������
//    public int sum(int n1, int n2) {
//        //2�����ĺ�
//        return n1 + n2;
//    }
//
//    public int sum(int n1, int n2, int n3) {
//        //3�����ĺ�
//        return n1 + n2 + n3;
//    }
//
//    public int sum(int n1, int n2, int n3, int n4) {
//        //4�����ĺ�
//        return n1 + n2 + n3 + n4;
//    }
    //.....//�������������������ͬ��������ͬ,

    // ����������ͬ->ʹ�ÿɱ�����Ż�
    //1.int...��ʾ���ܵ��ǿɱ������������int,�����Խ��ն��int(0-��)//2.ʹ�ÿɱ����ʱ�����Ե���������ʹ�ü�nums���Ե�������//3.����nums��ͼ���
    public int sum(int... nums) {
        System.out.println("���յĲ�������=" + nums.length);

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}

