package poly;

import java.util.Objects;

/**
 * @author Francis
 * @create 2021-06-29 13:53
 */

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {

        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //��д���� say
    @Override
    public String say() {
        return "ѧ�� " + super.say() + " score=" + score;
    }



    //���еķ���
    public void study() {
        System.out.println("ѧ�� " + getName() + " ����ѧ java...");
    }
    @Override
    public void finalize(){
        System.out.println("��������");

    }
}

