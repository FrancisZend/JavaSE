    /**
     * @author Francis
     * @create 2021-07-01 20:38
     */
    public class CodeBlockDetail02 {

            public static void main(String[] args) {
                new BBB();//(1)AAA ����ͨ�����(2)AAA() ������������(3)BBB ����ͨ�����(4)BBB() ������������
            }
        }
        class AAA { //���� Object
            {
                System.out.println("AAA ����ͨ�����");
            }
            public AAA() {
            //(1)super()
            //(2)���ñ������ͨ�����
                System.out.println("AAA() ������������....");
            }
        }
        class BBB extends AAA {
            {
                System.out.println("BBB ����ͨ�����...");
            }
            public BBB() {
        //(1)super()
        //(2)���ñ������ͨ�����
                System.out.println("BBB() ������������....");
            }
        }

