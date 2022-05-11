package aop;

import org.springframework.stereotype.Component;

@Component
public class UnyLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Берем книгу из UnyLibrary ");
        System.out.println("_______________________________________________");
    }
    public String returnBook(){
        int a = 10/0;
        System.out.println("Вернем книгу в UnyLibrary");
        return "Война и мир";
    }
    public void getMagazine(){
        System.out.println("Берем журнал из UnyLibrary");
        System.out.println("_______________________________________________");
    }

    public void returnMagazine(){
        System.out.println("Вернем журнал в UnyLibrary");
        System.out.println("_______________________________________________");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Добавляем книгу в UnyLibrary");
        System.out.println("_______________________________________________");
    }
    public void addMagazine(){
        System.out.println("Добавляем журнал в UnyLibrary");
        System.out.println("_______________________________________________");
    }
}
