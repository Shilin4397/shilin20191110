package com.bit.book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Book {
    public String name;
    public String auther;
    public int price;
    public String type;
    public boolean isBorrowed;

    public Book(String name,String auther,int price,String type) {
        this.name=name;
        this.auther=auther;
        this.price=price;
        this.type=type;
    }

    @Override
    public String toString() {
        return "Book{"+"name='"+name+'\''+",author='"+auther+'\''+
                ",price='"+price+'\''+",type='"+type+'\''+
                ((isBorrowed==true)?",已经被借出":",未被借出")+"}";
    }
}
