package org.example.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.File;

public class JPAPersistence {

    public JPAPersistence() {

    }

    public static void saveUser(UserDAO user) {
        // Create an EntityManagerFactory using the persistence unit defined in persistence.xml
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("user");

        // Create an EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }


}
