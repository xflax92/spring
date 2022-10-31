package com.xflax.library.acx;

import com.xflax.library.acx.service.AcxService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static String hellow="Hello";


    public static void main(String[] args){
        System.out.println(hellow);
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        AcxService acxService = context.getBean(AcxService.class);

        System.out.println(acxService.getMessage());

    }

}
