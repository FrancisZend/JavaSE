/**
 * @author Francis
 * @create 2021-07-01 17:15
 */
public class CodeBlock01 {
        public static void main(String[] args) {
            Movie movie = new Movie("��ã����Ӣ");
            System.out.println("===============");
            Movie movie2 = new Movie("��̽ 3", 100, "��˼��");
        }
    }
    class Movie {
        private String name;
        private double price;
        private String director;
//3 ��������-������
//�Ϻ����
//(1) ���������������������ͬ�����
//(2) �������뿴�����Ƚ�����
//(3) ��ʱ���ǿ��԰���ͬ����䣬���뵽һ��������У�����
//(4) ���������ǲ��ܵ����ĸ����������������󣬶����ȵ��ô���������
//(5) �������õ�˳�������ڹ�����..
 {
System.out.println("��Ӱ��Ļ��...");
System.out.println("��濪ʼ...");
System.out.println("��Ӱ��ʽ��ʼ...");
    }
    public Movie(String name) {
//        System.out.println("��Ӱ��Ļ��...");
//        System.out.println("��濪ʼ...");
//        System.out.println("��Ӱ��ʽ��ʼ...");
        System.out.println("Movie(String name) ������...");
        this.name = name;
    }
    public Movie(String name, double price) {
//        System.out.println("��Ӱ��Ļ��...");
//        System.out.println("��濪ʼ...");
//        System.out.println("��Ӱ��ʽ��ʼ...");

        this.name = name;
        this.price = price;
    }
    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director) ������...");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
