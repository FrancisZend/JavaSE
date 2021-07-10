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

    //д��д����� say ����
    @Override
    public String say() {
        return "��ʦ " + super.say() + " salary=" + salary;
    }

    //���з���
    public void teach() {
        System.out.println("��ʦ " + getName() + " ���ڽ� java �γ�...");
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

