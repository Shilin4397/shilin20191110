package com.bit.book.operation;

import com.bit.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("ReturnOperation");
        System.out.println("输入需要归还书籍的名称");
        String name = scanner.next();
        int i=0;
        for(;i<bookList.getSize();i++) {
            if(bookList.getBook(i).name.equals(name)) {
                break;
            }
        }
        if(i>=bookList.getSize()) {
            System.out.println("归还失败");
        }else  {
            if(bookList.getBook(i).isBorrowed==false) {
                System.out.println("归还失败");
            }else {
                bookList.getBook(i).isBorrowed = false;
                System.out.println("归还成功");
            }
        }
    }
}
