/**
 * @author Francis
 * @create 2021-06-22 22:12
 */
public class VariableParamer01 {
    public static void main(String[] args) {
        Method m = new Method();

        System.out.println(m.sum(1, 5, 100));
        System.out.println(m.sum(1, 19));

    }

}

class Method {
    //可以计算2个数的和，3个数的和，4.5，。。//可以使用方法重载
//    public int sum(int n1, int n2) {
//        //2个数的和
//        return n1 + n2;
//    }
//
//    public int sum(int n1, int n2, int n3) {
//        //3个数的和
//        return n1 + n2 + n3;
//    }
//
//    public int sum(int n1, int n2, int n3, int n4) {
//        //4个数的和
//        return n1 + n2 + n3 + n4;
//    }
    //.....//上面的三个方法名称相同，功能相同,

    // 参数个数不同->使用可变参数优化
    //1.int...表示接受的是可变参数，类型是int,即可以接收多个int(0-多)//2.使用可变参数时，可以当做数组来使用即nums可以当做数组//3.遍历nums求和即可
    public int sum(int... nums) {
        System.out.println("接收的参数个数=" + nums.length);

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}

