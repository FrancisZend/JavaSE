/**
 * @author Francis
 * @create 2021-07-03 9:09
 */
public class Abstract01 {

    public static void main(String[] args) {
    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //˼�������� eat ������ʵ���ˣ���ʵû��ʲô����
//���� ���෽����ȷ���Ե�����
//===> ���ǽ��÷������Ϊ����(abstract)����
//===> ��ν���󷽷�����û��ʵ�ֵķ���
//===> ��νû��ʵ�־���ָ��û�з�����
//===> ��һ�����д��ڳ��󷽷�ʱ����Ҫ����������Ϊ abstract ��
//===> һ����˵��������ᱻ�̳У�����������ʵ�ֳ��󷽷�. // public void eat() {
// System.out.println("����һ��������ǲ�֪����ʲô..");
// }

    public abstract void eat();
}

class ABC {
    private void test() {
        System.out.println("����һ��˽�з���");
    }
}
class  BCD extends  ABC{

}

