/**
 * @author Francis
 * @create 2021-07-03 8:45
 */
public class FinalDetail02 {

    public static void main(String[] args) {
        System.out.println(BBB.num);
//��װ��,String �� final �࣬���ܱ��̳�
    }
}
//final �� static ��������ʹ�ã�Ч�ʸ��ߣ����ᵼ�������.�ײ�����������Ż�����
class BBB {
    public final static int num = 10000;

    static {
        System.out.println("BBB ��̬����鱻ִ��");
    }
}

final class AAA {
//һ����˵�����һ�����Ѿ��� final ���ˣ���û�б�Ҫ�ٽ��������γ� final ����
//public final void cry() {}
}

