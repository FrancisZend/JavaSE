package poly;

import java.util.Objects;

/**
 * @author Francis
 * @create 2021-06-29 13:55
 */

public class Teacher extends Person {
    Student student;

    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写重写父类的 say 方法
    @Override
    public String say() {
        return "老师 " + super.say() + " salary=" + salary;
    }

    //特有方法
    public void teach() {
        System.out.println("老师 " + getName() + " 正在讲 java 课程...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Double.compare(teacher.salary, salary) == 0 && student.equals(teacher.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, salary);
    }
}

