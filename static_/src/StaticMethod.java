/**
 * @author Francis
 * @create 2021-07-01 10:39
 */
public class StaticMethod {

    public static void main(String[] args) {
//���� 2 ��ѧ�����󣬽�ѧ��
        Stu tom = new Stu("tom");
        tom.payFee(100);
//            tom.fee=100;
        Stu.payFee(100);//�Բ���?��
        Stu mary = new Stu("mary");
//mary.payFee(200);
        Stu.payFee(200);//��
//�����ǰ�յ�����ѧ��
        Stu.showFee();//300
//�������ϣ��������ʵ����Ҳ���Ե���ĳ������(������������ʹ��)
//��ʱ���ѷ������ɾ�̬����ʱ�ǳ�����
        System.out.println("9 ��ƽ���Ľ����=" + Math.sqrt(9));
        System.out.println(MyTools.calSum(10, 30));
    }
}

class MyTools {
    //����������ĺ�
    public static double calSum(double n1, double n2) {

        return n1 + n2;
    }
//����д���ܶ������Ĺ��߷���...
}

class Stu {
    private String name;//��ͨ��Ա
    //����һ����̬���������ۻ�ѧ����ѧ��
    public static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //˵��
//1. ������ʹ���� static ���κ󣬸÷������Ǿ�̬����
//2. ��̬�����Ϳ��Է��ʾ�̬����/����
    public static void payFee(double fee) {
        Test test = new Test();
        test.say();
        Stu stu = new Stu("������");
        stu.name="����";
        Stu.fee += fee;//�ۻ���
//        this.fee+=fee;
    }

    public static void showFee() {
//        test();
        System.out.println("��ѧ����:" + Stu.fee);
    }

    public void test() {
        System.out.println(Stu.fee);
    }
    public void test2(){
        showFee();
        test();
    }

}
class Test{
    public void say(){
        System.out.println("tset�ķ���");
    }
}
