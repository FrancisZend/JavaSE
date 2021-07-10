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
        String detail = "---------------零钱通明细---------------";
        while (flag) {
            System.out.println("===========零钱通菜单=============\n");
            System.out.println("\t\t\t1、零钱通明细");
            System.out.println("\t\t\t2、收益入账");
            System.out.println("\t\t\t3、消费");
            System.out.println("\t\t\t4、退出");
            System.out.println("请输入你的选择\n(1-4)");
            String key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(detail + "\n" + "当前余额为：" + balance);
                    break;
                case "2":
                    System.out.print("请输入入账金额");
                    money = scanner.nextDouble();
                    balance += money;
                    detail += "\n收益入账\t" + new SimpleDateFormat("yyyy-MM-dd " + "HH:hh ").format(new Date()) + "\t" + money;
                    System.out.println("收益入账");

                    break;
                case "3":
                    System.out.print("请输入消费金额");
                    money = scanner.nextDouble();
                    balance -= money;
                    detail += "\n消  费\t" + new SimpleDateFormat("yyyy-MM-dd " +
                            "HH:hh ").format(new Date()) + "\t" + money;
                    break;
                case "4":
                    System.out.println("退出");
                    System.out.println("你确定要退出吗？y/n");
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
                    System.out.println("你的输入有误，请重新输入");
            }
        }
    }

}
