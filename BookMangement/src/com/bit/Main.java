package com.bit;
import com.bit.book.BookList;
import com.bit.book.user.Admin;
import com.bit.book.user.NormalUser;
import com.bit.book.user.User;

import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {
    public static User login() {
        System.out.println("请输入你的名字");
        Scanner scanner=new Scanner (System.in);
        String name=scanner.nextLine();
        System.out.println("请输入你的身份（1 表示管理员，0表示读者）");
        int who=scanner.nextInt();
        if(who==1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList =new BookList();
        User user=login();
        while(true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
}
