/**
 * @author Francis
 * @create 2021-07-02 13:57
 */

public class Final01 {
    public static void main(String[] args) {

        E e = new E();
//e.TAX_RATE = 0.09;
    }
}
//�������Ҫ�� A �಻�ܱ�������̳�
//����ʹ�� final ���� A ��
final class A { }
//class B extends A {}
class C {
    //�������Ҫ�� hi ���ܱ�������д
//����ʹ�� final ���� hi ����
    public final void hi() {}
}
class D extends C {
// @Override
// public void hi() {
// System.out.println("��д�� C ��� hi ����..");
// }
}
//����ϣ����ĵ�ĳ�����Ե�ֵ���޸�,������ final ����
class E {
    public final double TAX_RATE = 0.08;//����

}
//����ϣ��ĳ���ֲ��������޸ģ�����ʹ�� final ����
class F {
    public void cry() {
//��ʱ��NUM Ҳ��Ϊ �ֲ�����
        final double NUM = 0.01;
//NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}