package hibernate_test_2;


import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Employee.class)
                    .addAnnotatedClass(Detail.class)
                    .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            Employee employee = new Employee("Vika", "Dedt","VT",300);
            Detail detail = new Detail("Baku","12345678","test@mail.test");

            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
