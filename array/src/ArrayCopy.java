/**
 * @author Francis
 * @create 2021-06-19 18:56
 */
public class ArrayCopy {
    public static void main(String[] args) {
        //��int[]arr1={10,20,30};������arr2����,
        // Ҫ�����ݿռ��Ƕ�����.
        int[] arr1 = {10, 20, 30};
        //����һ���µ�����arr2,�����µ����ݿռ�
        // ��Сarr1.length;
        int[] arr2 = new int[arr1.length];
        //����arr1����ÿ��Ԫ�ؿ�����arr2��Ӧ��Ԫ��λ��
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        //�޸�arr2�������arr1��Ӱ��
        arr2[0] = 100;
        //���arr1
        System.out.println("====arr1��Ԫ��====");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);//10,20,30
        }
        System.out.println("====arr2��Ԫ��====");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }

}
