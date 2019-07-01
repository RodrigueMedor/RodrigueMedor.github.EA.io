import model.Car;
import model.Owner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("cs544");

        EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
        Owner owner = new Owner("Medor Rodrigue", "IOWA");
        Car car = new Car(1990, "RAV4",12334, owner);
        em.persist(car);

        em.getTransaction().commit();
        em.close();
    }
}
