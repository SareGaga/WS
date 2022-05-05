package com.company;

import com.company.userStatus;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ws_Dal ws = new ws_Dal();


        Firstform Frame1 = new Firstform();
       



        userStatus u1 =new userStatus();
        u1.red="the meaning of red on the next page URGENT";
        u1.green="the meaning of green on the next page DANGER";
        u1.yellow="the meaning of yellow on the next page VERBAL ABUSE etc";
        System.out.println(u1.red);
        System.out.println(u1.green);
        System.out.println(u1.yellow);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name : ");
        String Name = scanner.next();

        System.out.println("Please enter a surname : ");
        String surname = scanner.next();


        System.out.println("Please enter a adress : ");
        String adress = scanner.next();


        System.out.println("Please enter a TC : ");
        long tc = scanner.nextLong();

        System.out.println("welcome");


        int select;
        Scanner scan = new Scanner(System.in);
        int number1, number2;
        System.out.println("please select: 1. state of being ,2. exit");
        select = scan.nextInt();


        switch (select) {
            case 1:
                System.out.println("please choose colors that indicate your status");
                userStatus status = new userStatus();

                break;
            case 2:

                System.out.println("exiting the application");
                break;



        }


    }



}
