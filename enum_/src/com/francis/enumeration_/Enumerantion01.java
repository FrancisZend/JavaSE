package com.francis.enumeration_;

/**
 * @author Francis
 * @create 2021-07-04 11:40
 */
public class Enumerantion01 {
    public static void main(String[] args) {
        //ʹ��
        Season spring = new Season("����", "��ů");
        Season winter = new Season("����", "����");
        Season summer = new Season("����", "����");
        Season autumn = new Season("����", "��ˬ");
        // autumn.setName("XXX");
        // autumn.setDesc("�ǳ�����..");
        //��Ϊ���ڼ��ڶ��ѣ����Ķ���(����ֵ)���ǹ̶����ĸ��������и���
        //�����������˼·���������ּ����ǹ̶����ĸ�����
        //��ˣ���������Ʋ���===> ö����[ö: һ��һ�� �٣� ���� , ���Ѿ���Ķ���һ��һ�����ٳ�������
        // �ͳ�Ϊö����]
        Season other = new Season("����", "~~~");
    }
}
class Season {//��
    private String name;
    private String desc;//����
    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {

        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

