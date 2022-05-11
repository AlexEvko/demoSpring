package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    /*@Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " + "списка студентов перед " +
                "методом GetStudents");
    }*/
    /*@AfterReturning(pointcut = "execution(* getStudents())",returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Yev."+nameSurname;
        firstStudent.setNameSurname(nameSurname);
        double avgGrade = firstStudent.getAvgGrade();
        double a = 0.1;
        avgGrade = avgGrade + a;
        firstStudent.setAvgGrade(avgGrade);
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после" +
                "работы метода GetStudents");
    }*/
    /*@AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exeption")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exeption){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем исключения "+ exeption);
    }*/
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice логируем нормальное окончание работы метода или " +
                "выброс исключения");
    }
}
