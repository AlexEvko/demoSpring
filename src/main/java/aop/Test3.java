package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UnyLibrary library = context.getBean("unyLibrary",UnyLibrary.class);
        String bookName = library.returnBook();
        System.out.println("В библиотеку вернули книгу "+bookName);

        context.close();
        System.out.println("Method main ends");

    }
}
