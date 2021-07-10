package dynamicbinding;
/**
 * @author Francis
 * @create 2021-06-29 9:48
 */
public class DynamicBingding {
    public static void main(String[] args) {
//a 的编译类型 A, 运行类型 B
        A a = new B();//向上转型
        System.out.println(a.sum());//?40 -> 30
        System.out.println(a.sum1());//?30-> 20
    }
}
class A {//父类
    public int i = 10;
    //动态绑定机制:
    public int sum() {//父类 sum()
        return getI() + 10;//20 + 10
    }
    public int sum1() {//父类 sum1()
        return i + 10;//10 + 10
    }
    public int getI() {//父类 getI
        return i;
    }
}
class B extends A {//子类
    public int i = 20;
    @Override
    public int getI() {//子类 getI()
        return i;
    }
}

