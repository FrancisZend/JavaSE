/**
 * @author Francis
 * @create 2021-07-02 14:04
 */
public class FinalDetail01 {


        public static void main(String[] args) {
            AA aa = new AA(0.1);
            CC cc = new CC();
            new EE().cal();
        }
    }
    class AA {
        /*
        1. ����ʱ���� public final double TAX_RATE=0.08;
        2. �ڹ�������
        3. �ڴ������
        */
        public final double TAX_RATE = 0.08;//1.����ʱ��ֵ
        public final double TAX_RATE2 ;
        public final double TAX_RATE3 ;
        public AA(double a) {//�������и�ֵ
            TAX_RATE2 = a;
        }
        public AA() {//�������и�ֵ
            TAX_RATE2 = 0.1;
        }
        {//�ڴ���鸳ֵ
            TAX_RATE3 = 8.8;
        }
    }
    class BB {

        /*
        ��� final ���ε������Ǿ�̬�ģ����ʼ����λ��ֻ����
        1 ����ʱ 2 �ھ�̬����� �����ڹ������и�ֵ��
        */
        public static final double TAX_RATE = 99.9;
        public static final double TAX_RATE2 ;
        static {
            TAX_RATE2 = 3.3;
        }
    }
    //final �಻�ܼ̳У����ǿ���ʵ��������
    final class CC { }
    //����಻�� final �࣬���Ǻ��� final ��������÷�����Ȼ������д�����ǿ��Ա��̳�
//������Ȼ���ؼ̳еĻ���.
 class DD {
    public final void cal() {
        System.out.println("cal()����");
    }
}
class EE extends DD { }

