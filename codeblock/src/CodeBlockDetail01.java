/**
 * @author Francis
 * @create 2021-07-01 20:16
 */
public class CodeBlockDetail01 {

        public static void main(String[] args) {
            A a = new A();// (1) A ��̬����� 01 (2) getN1 ������...(3)A ��ͨ����� 01(4)getN2 ������...(5)A() ����������

        }
    }
    class A {

        //�޲ι�����
        public A() {
            System.out.println("A() ������������");
        }
        { //��ͨ�����

            System.out.println("A ��ͨ����� 01");
        }
        static { //��̬�����
            System.out.println("A ��̬����� 01");
        }
        private int n2 = getN2();//��ͨ���Եĳ�ʼ��
        //��̬���Եĳ�ʼ��
        private static int n1 = getN1();
        public static int getN1() {
            System.out.println("getN1 ������...");
            return 100;
        }
        public int getN2() { //��ͨ����/�Ǿ�̬����
            System.out.println("getN2 ������...");
            return 200;
        }
    }

