package poly;

import java.sql.Date;

/**
 * @author Francis
 * @create 2021-06-29 13:56
 */
public class PloyArray {
    public static void main(String[] args) {
//Ӧ��ʵ��:����һ���̳нṹ���£�Ҫ�󴴽� 1 �� Person ����
// 2 �� Student ����� 2 �� Teacher ����, ͳһ���������У�������ÿ������ say ����
        System.out.println(10==10.0);
        "abc".equals("abc");
        String hello = new String("hello");
        Person[] persons = new Person[5];
        Student hoihg_ = new Student("HOIHG ", 23, 2);
        hoihg_=null;
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);
        System.out.println( persons[3].hashCode());
        System.out.println( persons[3]);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());//��̬�󶨻���
            if (persons[i] instanceof Student) {

                Student student = (Student) persons[i];//����ת��
                student.study();
            }
            else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {
            } else {
                System.out.println("�����������, ���Լ����...");
            }
        }
    }
}