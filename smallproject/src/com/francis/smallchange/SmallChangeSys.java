package com.francis.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Francis
 * @create 2021-06-30 9:16
 */
public class SmallChangeSys {
    public static void main(String[] args) {
        boolean flag = true;
        double money = 0;
        double balance = 0;
        Scanner scanner = new Scanner(System.in);
        String detail = "---------------��Ǯͨ��ϸ---------------";
        while (flag) {
            System.out.println("===========��Ǯͨ�˵�=============\n");
            System.out.println("\t\t\t1����Ǯͨ��ϸ");
            System.out.println("\t\t\t2����������");
            System.out.println("\t\t\t3������");
            System.out.println("\t\t\t4���˳�");
            System.out.println("���������ѡ��\n(1-4)");
            String key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(detail + "\n" + "��ǰ���Ϊ��" + balance);
                    break;
                case "2":
                    System.out.print("���������˽��");
                    money = scanner.nextDouble();
                    balance += money;
                    detail += "\n��������\t" + new SimpleDateFormat("yyyy-MM-dd " + "HH:hh ").format(new Date()) + "\t" + money;
                    System.out.println("��������");

                    break;
                case "3":
                    System.out.print("���������ѽ��");
                    money = scanner.nextDouble();
                    balance -= money;
                    detail += "\n��  ��\t" + new SimpleDateFormat("yyyy-MM-dd " +
                            "HH:hh ").format(new Date()) + "\t" + money;
                    break;
                case "4":
                    System.out.println("�˳�");
                    System.out.println("��ȷ��Ҫ�˳���y/n");
                    key = scanner.next();
                    switch (key) {
                        case "y":
                            flag = false;
                            break;
                        case "n":
                            break;
                    }
                    break;
                default:
                    System.out.println("���������������������");
            }
        }
    }

}
