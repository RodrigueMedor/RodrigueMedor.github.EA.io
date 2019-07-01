import model.Employee;
import model.Laptop;
import model1.Flight;
import model1.Passenger;
import model1.PassengerStatus;
import model2.School;
import model2.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("cs544");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Employee emp = new Employee("Rodrigue", 32, "Newyork", 2334000.00);

        Laptop laptop = new Laptop(2000,"DELL","AMD");
        emp.addLaptop(laptop);

        em.persist(emp);

        em.getTransaction().commit();
       em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();
        System.out.println("***********************************************************************************************");

        Passenger passenger = new Passenger("Sara Valentin", PassengerStatus.BRONZE, 1234,"Port-au-Prince");
        Flight flight = new Flight("IOWA","Port-au-Prince",123455,34,"AA3456");

        flight.getPassengers().add(passenger);
        em.persist(flight);

        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Student student = new Student(12,"Anna", "Lundi","anna@gmail.com",34);
        School school = new School("Delmas 33", "Lycee Toussaint Louverture");

        school.getStudentMap().put(student.getId(),student);
        em.persist(school);

        em.getTransaction().commit();
        em.close();

    }
}
