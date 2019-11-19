package com.bit.book.operation;

import java.util.Scanner;
import com.bit.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public interface IOperation {
    Scanner scanner = new Scanner(System.in);
    void work(BookList bookList);
}
