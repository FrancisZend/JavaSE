package poly;

import java.sql.Date;

/**
 * @author Francis
 * @create 2021-06-29 13:56
 */
public class PloyArray {
    public static void main(String[] args) {
//应用实例:现有一个继承结构如下：要求创建 1 个 Person 对象、
// 2 个 Student 对象和 2 个 Teacher 对象, 统一放在数组中，并调用每个对象 say 方法
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
            System.out.println(persons[i].say());//动态绑定机制
            if (persons[i] instanceof Student) {

                Student student = (Student) persons[i];//向下转型
                student.study();
            }
            else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {
            } else {
                System.out.println("你的类型有误, 请自己检查...");
            }
        }
    }
}