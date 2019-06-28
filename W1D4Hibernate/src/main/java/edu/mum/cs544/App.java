package edu.mum.cs544;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App {
    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {

        entityManagerFactory = Persistence.createEntityManagerFactory("cs544");

        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        //Retrieve all books from the database, and then:
        TypedQuery<Students> studentsTypedQuery = em.createQuery(" from students", Students.class);
        for (Students stu : studentsTypedQuery.getResultList()) {
            System.out.println("Email = " + stu.getEmail() + ", Name=  " + stu.getName() + ", ID= " + stu.getId() + ", Password=  " + stu.getPassword());
        }
        em.getTransaction().commit();
        em.close();

        em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        Students st = new Students();
        st.setEmail("rodriguemedor@gmail.com");
        st.setName("Medor");
        st.setPassword("123445");
        st.setId(35);
        em.persist(st);

        em.getTransaction().commit();
        em.close();


        em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        //Retrieve all books from the database, and then:
        TypedQuery<Students> rty = em.createQuery(" from students", Students.class);
        for (Students stu : rty.getResultList()) {
            System.out.println("Email = " + stu.getEmail() + ", Name=  " + stu.getName() + ", ID= " + stu.getId() + ", Password=  " + stu.getPassword());
        }
        em.getTransaction().commit();
        em.close();


    }
}
