package br.com.estudo.entendendospringboot.myBeanConsumer;

import br.com.estudo.entendendospringboot.mybean.MyBean;

public class MyBeanConsumer {

    public MyBeanConsumer(MyBean myBean){
        System.out.println("MyBeanConsumer created");
        System.out.println("myBean hashcode = " + myBean.hashCode());
    }
}
