/**
 * @author Francis
 * @create 2021-07-03 16:10
 */
public class InterfaceDetail01 {

        public static void main(String[] args) {
//�ӿ��е�����,�� public static final
            System.out.println(IB.n1);//˵�� n1 ���� static
//IB.n1 = 30; ˵�� n1 �� final
        }
    }
    interface IB {
        //�ӿ��е�����,ֻ���� final �ģ������� public static final ���η�
        int n1 = 10; //�ȼ� public static final int n1 = 10;
        void hi();
    }
    interface IC {
        void say();
    }
    interface IA{
    public void hello();
    }
    //�ӿڲ��ܼ̳���������,���ǿ��Լ̳ж����Ľӿ�,���ҷ�������ʵ��
    interface ID extends IB,IA {
    }
    //�ӿڵ����η� ֻ���� public ��Ĭ�ϣ�����������η���һ����
    interface IE{}
    //һ����ͬʱ����ʵ�ֶ���ӿ�
    class Pig implements IB,IC {
        @Override
        public void hi() {
        }
        @Override
        public void say() {
        }
    }

