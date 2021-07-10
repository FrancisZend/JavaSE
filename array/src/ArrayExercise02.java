

/**
 * @author Francis
 * @create 2021-06-19 17:46
 */
public class ArrayExercise02 {
    public static void main(String[] args) {

        int[] array ={2,36,-1,69,32,1};
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {


                if (array[j]<array[i]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }


        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
