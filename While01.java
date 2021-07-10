/**
 * @author Francis
 * @create 2021-06-17 17:57
 */
public class While01 {
    public static void main(String[] args) {
      abc:
        for (int i=0;i<10;i++){
            System.out.println(i+"===================");
            bcd:for (int j=0;j<10;j++){
                System.out.println(i*j);
                if (i*j==36){

                    break abc;
                }
            }
        }
    }
}
