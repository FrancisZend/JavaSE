/**
 * @author Francis
 * @create 2021-07-03 17:44
 */
public class InterfaceExercise01 {
        public static void main(String[] args) {
            new C().pX();
        }
    }
    interface A { //
        int x = 0;
    } //想到 等价 public static final int x = 0;
    class B {
        int x = 1;
    } //普通属性
    class C extends B implements A {
        public void pX() {
//System.out.println(x); //错误，原因不明确 x

//可以明确的指定 x
//访问接口的 x 就使用 A.x
//访问父类的 x 就使用 super.x
            System.out.println(A.x + " " + super.x);
        }
    }

