package br.com.estudo.entendendospringboot.myConfiguration;

import br.com.estudo.entendendospringboot.myBeanConsumer.MyBeanConsumer;
import br.com.estudo.entendendospringboot.mybean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    @Bean
    public MyBeanConsumer myBeanConsumer(){
        return new MyBeanConsumer(myBean());
    }
}
