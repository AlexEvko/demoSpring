package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UnyLibrary unilibrary = context.getBean("unyLibrary", UnyLibrary.class);
        Book book = context.getBean("book",Book.class);
        unilibrary.getBook();
        unilibrary.addBook("Vlad",book);
        unilibrary.addMagazine();


        //unilibrary.returnBook();
        //SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",SchoolLibrary.class);
        //schoolLibrary.getBook();

        context.close();
    }

}
