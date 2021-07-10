/**
 * @author Francis
 * @create 2021-07-03 22:52
 */
public class AnonymousClassExercise01 {

    public static void main(String[] args) {
//����ʵ��ֱ�Ӵ��ݣ�����Ч
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("����һ������~~...");
            }
        });
//��ͳ����
        f1(new Picture());
    }
    //��̬����,�β��ǽӿ�����
    public static void f1(IL il) {
        il.show();
    }
}
//�ӿ�
interface IL {
    void show();
}
//��->ʵ�� IL => ������� (Ӳ����)
class Picture implements IL {
    @Override
    public void show() {
        System.out.println("����һ������ XX...");
    }
}

