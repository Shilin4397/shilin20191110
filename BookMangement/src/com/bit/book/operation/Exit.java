package com.bit.book.operation;

import com.bit.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Exit implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("byebye!");
        System.exit(0);  //退出程序
    }
}
