package com.reetu.Spring_DIConstructor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reetu.beans.JavaBook;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
    	JavaBook b=ctx.getBean("book",JavaBook.class);
    	System.out.println(b.getName());
    	System.out.println(b.getPrice());
    	System.out.println(b.getAuthor());
    }
}
