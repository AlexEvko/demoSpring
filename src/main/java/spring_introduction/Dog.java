package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet{
    @Override
    public void say(){
        System.out.println("Gawww");
    }
    @PostConstruct
    public void init(){
        System.out.println("Class Dog:init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog:destroy method");
    }
}
