/**
 * @author Francis
 * @create 2021-06-25 13:33
 */
public class ExtendsExercise01 {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A {//A ��
    public A() {
        System.out.println("���� A ��");
    }
}
class B extends A { //B ��,�̳� A �� //main �����У� C c =new C(); ���ô����? 3min
    public B() {
        System.out.println("���� B ����޲ι���");
    }
    public B(String name) {
        System.out.println(name + "���� B ����вι���");
    }
}
class C extends B { //C �࣬�̳� B ��
    public C() {
        this("hello");
        System.out.println("���� c ����޲ι���");
    }
    public C(String name) {
        super("hahah");
        System.out.println("���� c ����вι���");
    }
}

