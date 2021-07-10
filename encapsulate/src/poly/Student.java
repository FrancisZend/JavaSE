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

    //重写父类 say
    @Override
    public String say() {
        return "学生 " + super.say() + " score=" + score;
    }



    //特有的方法
    public void study() {
        System.out.println("学生 " + getName() + " 正在学 java...");
    }
    @Override
    public void finalize(){
        System.out.println("对象销毁");

    }
}

