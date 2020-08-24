package com.zc.design.pattern.creational.simplefactory;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Book springBook = BookFactory.createBook("spring");
        springBook.read();

        //改进
        Book book = BookFactory.createBook(BookMybatis.class);
        book.read();

    }
}
