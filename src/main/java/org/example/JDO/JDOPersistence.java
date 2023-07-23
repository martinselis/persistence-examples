//package org.example.JDO;
//
//import javax.jdo.JDOHelper;
//import javax.jdo.PersistenceManager;
//import javax.jdo.PersistenceManagerFactory;
//import javax.jdo.Transaction;
//
//public class JDOPersistence {
//    public void persist() {
//        PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("Users");
//        PersistenceManager pm = pmf.getPersistenceManager();
//        Transaction tx=pm.currentTransaction();
//        try {
//            tx.begin();
//            UserDAO user = new UserDAO("John", "travolta@pulpfiction.com", 34);
//            pm.makePersistent(user);
//            tx.commit();
//        } finally {
//            if (tx.isActive()) {
//                tx.rollback();
//            }
//            pm.close();
//        }
//    }
//}
