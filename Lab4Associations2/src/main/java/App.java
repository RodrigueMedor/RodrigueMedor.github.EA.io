import BookPublisher.Book;
import BookPublisher.Publisher;
import CustomerReservation.Customer;
import CustomerReservation.Reservation;
import DeptEmp.Department;
import DeptEmp.Employee;
import employeOffice.Employee1;
import employeOffice.Office;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.GregorianCalendar;


public class App {

    private static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("cs544");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Employee employee = new Employee("Sara Valentin");

        Department department = new Department("Management");

        department.addEmployees(employee);

        em.persist(department);

        em.getTransaction().commit();
        em.close();

        System.out.println("*****************************Book and Publisher**********************************");

        em = emf.createEntityManager();

        em.getTransaction().begin();


        Publisher publisher = new Publisher("Medor Rodrigue", "IOWA");
        Book book = new Book("ASD", "Guthrie", LocalDate.now(),"A4567",2345.00);
        book.setPublisher(publisher);

        em.persist(book);

        em.getTransaction().commit();
        em.close();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&Reservation and Customer&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


        em = emf.createEntityManager();

        em.getTransaction().begin();
        //GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();

        Customer customer = new Customer("Sara", "Valentin", LocalDate.of(2000,10,23),"saravalentin.sv@gmail.com");

        Reservation reservation = new Reservation("Medor Rodrigue", true,"14-09-2019","12-09-45",
                12,78,"ZOOM",45,78,true,3450.00,890.00);
        customer.getReservations().add(reservation);

        em.persist(customer);

        em.getTransaction().commit();
        em.close();

        System.out.println("###############################################Office And Employee####################################################################");
        em = emf.createEntityManager();

        em.getTransaction().begin();

        Employee1 employee1 = new Employee1(23, 450.00,"Natacha");

        Office office = new Office("AY89","Chicago","6412331779","Fairfield","Florida","IOWA","USA","515512","Illinoir");

        office.getEmployees().add(employee1);

        em.persist(office);

        em.getTransaction().commit();
        em.close();


    }
}
