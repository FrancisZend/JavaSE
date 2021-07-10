package com.francis.enumeration_;

/**
 * @author Francis
 * @create 2021-07-04 12:07
 */
public class Enumeration03 {
        public static void main(String[] args) {
            System.out.println(Season2.AUTUMN);
            System.out.println(Season2.SUMMER);
        }
    }
    //��ʾʹ�� enum �ؼ�����ʵ��ö����
    enum Season2 {//��
//�������ĸ�����, �̶�. // public static final Season SPRING = new Season("����", "��ů");
// public static final Season WINTER = new Season("����", "����");
// public static final Season AUTUMN = new Season("����", "��ˬ");
// public static final Season SUMMER = new Season("����", "����");
//���ʹ���� enum ��ʵ��ö����
//1. ʹ�ùؼ��� enum ��� class
//2. public static final Season SPRING = new Season("����", "��ů") ֱ��ʹ��
// SPRING("����", "��ů") ��� ������(ʵ���б�)
//3. ����ж������(����)�� ʹ�� ,�ż������
//4. ���ʹ�� enum ��ʵ��ö�٣�Ҫ�󽫶��峣������д��ǰ��
//5. �������ʹ�õ����޲ι������������������������ʡ�� ()
        SPRING("����", "��ů"),
        WINTER("����", "����"),
        AUTUMN("����", "��ˬ"),
        SUMMER("����", "����")/*, What()*/;
        private String name;
        private String desc;//����
        private Season2() {//�޲ι�����
        }
        private Season2(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }
        public String getName() {
            return name;
        }
        public String getDesc() {
            return desc;
        }
        @Override
        public String toString() {
            return "Season{" +
                    "name='" + name + '\'' +
                    ", desc='" + desc + '\'' +
                    '}';
        }

}
