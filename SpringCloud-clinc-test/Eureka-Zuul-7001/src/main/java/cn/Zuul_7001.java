package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_7001 {
    public static void main(String[] args) {
        //Zuul
        SpringApplication.run(Zuul_7001.class,args);
    }

}
