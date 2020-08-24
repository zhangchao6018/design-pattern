package com.zc.design.pattern.creational.simplefactory;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class BookFactory {
    static Book createBook(String bookName){
        Book book = null;
        if ("spring".equals(bookName)){
            book = new BookSpring();
        }else if ("spring".equals(bookName)){
            book = new BookMybatis();
        }

        //...

        return book;
    }

    //传入Class 尽量符合开闭原则
    static Book createBook(Class clazz)  {
        Book book = null;
        try {
            book = (Book) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return book;
    }
}
