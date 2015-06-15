/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.semeru_jsf_maven.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
/**
 *
 * @author Dani Ferreira
 */
public class HibernateUtil {
    
    private static final SessionFactory sessionfactory;
    public static final String HIBERNATESESSION = "hibernate_session";
    
    static{
        try{
            System.out.println("tentando abrir uma session factory");
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            
            sessionfactory = configuration.buildSessionFactory(serviceRegistry);
            System.out.println("Session factory criada corretamente");
        }catch (Exception ex){
            System.out.println("ocorreu um erro ao iniciar a session factory" +ex);
           throw new ExceptionInInitializerError(ex);
        }
        
    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }

    static Object getSessionFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
