/**
 * @author Francis
 * @create 2021-07-01 22:41
 */
public class SingleTon02 {

        public static void main(String[] args) {
//new Cat("大黃");
//System.out.println(Cat.n1);
            Cat instance = Cat.getInstance();
            System.out.println(instance);
//再次調用 getInstance
            Cat instance2 = Cat.getInstance();
            System.out.println(instance2);
            System.out.println(instance == instance2);//T
        }
    }
    //希望在程序運行過程中，只能創建一個 Cat 對象

    //使用單例模式
    class Cat {
        private String name;
        public static int n1 = 999;
        private static Cat cat ; //默認是 null
        //步驟
//1.仍然構造器私有化
//2.定義一個 static 靜態屬性對象
//3.提供一個 public 的 static 方法，可以返回一個 Cat 對象
//4.懶漢式，只有當用戶使用 getInstance 時，才返回 cat 對象, 後面再次調用時，會返回上次創建的 cat 對象
// 從而保證了單例
        private Cat(String name) {
            System.out.println("構造器調用...");
            this.name = name;
        }
        public static Cat getInstance() {
            final double num=0.01;
            if(cat == null) {//如果還沒有創建 cat 對象
                cat = new Cat("小野猫");
            }
            return cat;
        }
        @Override
        public String toString() {

            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

