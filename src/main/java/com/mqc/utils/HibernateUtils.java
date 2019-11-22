package com.mqc.utils;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author lenovo
 * @create 2019-11-11:04
 */
public class HibernateUtils {
    private  static SessionFactory sessionFactory;
    private  static Session session;
    private  static Transaction tx;
    static {
        Configuration configure=new Configuration().configure();
        sessionFactory=configure.buildSessionFactory();
        session=sessionFactory.openSession();
        tx=session.beginTransaction();
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
    public static Query getQuery(String hql){
        return session.createQuery(hql);
    }
    public static void closeSession(){
        tx.commit();
        session.close();
        sessionFactory.close();
    }

}
