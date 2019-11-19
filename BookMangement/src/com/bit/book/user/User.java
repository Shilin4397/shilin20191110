package com.bit.book.user;

import com.bit.book.operation.IOperation;

import com.bit.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public abstract class User {
    protected String name;
    protected IOperation[] operations;

    public abstract int menu();
    // 根据用户选项执行操作
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
    }
}
