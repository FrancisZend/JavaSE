/**
 * @author Francis
 * @create 2021-06-20 11:11
 */
public class BubbleShort {
    public static void main(String[] args) {
        int[] arr = {12, 56, 48, 369, -1, -56, 45, 96};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            //���ѭ����4��
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //4�αȽ�-3��-2��-1��//���ǰ�����>����������ͽ���
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("\n==��" + (i + 1) + "��==");
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}