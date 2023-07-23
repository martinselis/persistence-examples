package org.example;

//import org.datanucleus.api.jdo.JDOPersistenceManagerFactory;
import org.example.JDBC.PostgresService;
//import org.example.JDO.JDOPersistence;
import org.example.JPA.JPAPersistence;
import org.example.JPA.UserDAO;

public class Main {
    /**
     * JDBC implementation
     * @param args
     */
//    public static void main(String[] args) {
//        PostgresService service = new PostgresService();
//        service.connect();
//    }

    /**
     * Datanucleus implementation using JDO
     * @param args
     */
//    public static void main(String[] args) {
//        JDOPersistence persist = new JDOPersistence();
//        persist.persist();
//    }

    /**
     * Hibernate implementation using JPA
     */
    public static void main(String[] args) {
        JPAPersistence persist = new JPAPersistence();
        persist.saveUser(new UserDAO("User 2", "user@email.com", 34));
    }

}