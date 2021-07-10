package dynamicbinding;
/**
 * @author Francis
 * @create 2021-06-29 9:48
 */
public class DynamicBingding {
    public static void main(String[] args) {
//a �ı������� A, �������� B
        A a = new B();//����ת��
        System.out.println(a.sum());//?40 -> 30
        System.out.println(a.sum1());//?30-> 20
    }
}
class A {//����
    public int i = 10;
    //��̬�󶨻���:
    public int sum() {//���� sum()
        return getI() + 10;//20 + 10
    }
    public int sum1() {//���� sum1()
        return i + 10;//10 + 10
    }
    public int getI() {//���� getI
        return i;
    }
}
class B extends A {//����
    public int i = 20;
    @Override
    public int getI() {//���� getI()
        return i;
    }
}

