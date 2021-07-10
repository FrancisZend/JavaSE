/**
 * @author Francis
 * @create 2021-07-01 22:21
 */
public class SingleTon01 {


    public static void main(String[] args) {
// GirlFriend xh = new GirlFriend("С��");
// GirlFriend xb = new GirlFriend("С��");
//ͨ���������Ի�ȡ����
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);//T
//System.out.println(GirlFriend.n1);
//...
    }
}

//��һ���࣬ GirlFriend
//ֻ����һ��Ů����
class GirlFriend {
    private String name;
    //public static int n1 = 100;
//Ϊ���ܹ��ھ�̬�����У����� gf ������Ҫ��������Ϊ static
//����ͨ�����������Č���, �I�hʽ������Ʉ����ˌ��󣬵��Ǜ]��ʹ��.
 private static GirlFriend gf = new GirlFriend("С��Ů");
//��α�������ֻ�ܴ���һ�� GirlFriend ����
//����[����ģʽ-����ʽ]
//1. ��������˽�л�
//2. ������ڲ�ֱ�Ӵ�������(�ö����� static)
//3. �ṩһ�������� static ���������� gf ����
    private GirlFriend(String name) {
        System.out.println("������������.");
        this.name = name;
    }
    public static GirlFriend getInstance() {
        return gf;
    }
    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }

}

