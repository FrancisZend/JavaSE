package poly;

/**
 * @author Francis
 * @create 2021-06-29 21:31
 */
public class Finalize_ {

    public static void main(String[] args) {
        Car bmw = new Car("����");
//��ʱ car �������һ������,�����������ͻ����(����)����, �����ٶ���ǰ������øö���� finalize ����
//,����Ա�Ϳ����� finalize �У�д�Լ���ҵ���߼�����(�����ͷ���Դ�����ݿ�����,���ߴ��ļ�..)
//,�������Ա����д finalize,��ô�ͻ���� Object ��� finalize, ��Ĭ�ϴ���
//,�������Ա��д�� finalize, �Ϳ���ʵ���Լ����߼�
        bmw = null;
        System.gc();//������������������
        System.out.println("�����˳���....");
    }
}
class Car {
    private String name;

    //����, ��Դ����
    public Car(String name) {
        this.name = name;
    }
    //��д finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("�������� ����" + name);
        System.out.println("�ͷ���ĳЩ��Դ...");
    }
}


