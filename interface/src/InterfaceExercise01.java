/**
 * @author Francis
 * @create 2021-07-03 17:44
 */
public class InterfaceExercise01 {
        public static void main(String[] args) {
            new C().pX();
        }
    }
    interface A { //
        int x = 0;
    } //�뵽 �ȼ� public static final int x = 0;
    class B {
        int x = 1;
    } //��ͨ����
    class C extends B implements A {
        public void pX() {
//System.out.println(x); //����ԭ����ȷ x

//������ȷ��ָ�� x
//���ʽӿڵ� x ��ʹ�� A.x
//���ʸ���� x ��ʹ�� super.x
            System.out.println(A.x + " " + super.x);
        }
    }

