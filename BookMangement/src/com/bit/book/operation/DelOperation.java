package com.bit.book.operation;

import com.bit.book.BookList;
import com.bit.book.Book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("DelOperation");
        System.out.println("输入需要删除书籍的名称");
        String name = scanner.next();
        //不会从bookList-》进行删除-》isBorrowed true
        //1、找到这本书是否存在
        //2、开始删除
        int i=0;
        for(;i<bookList.getSize();i++) {
            if(bookList.getBook(i).name.equals(name)) {
                break;
            }
        }
        if(i>=bookList.getSize()) {
            System.out.println("没有找到此书");
            return;
        }
        for(int j=i;j<bookList.getSize()-1;j++) {
            Book book=bookList.getBook(j+1);
            bookList.setBooks(j,book);
        }
        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除成功");
    }
}
