package com.hiber;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project start.." );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Student st=new Student();
        st.setId(101);
        st.setName("Usman");
        st.setCity("Lahore");
        Certificate cr=new Certificate();
        cr.setCourse("Andriod");
        cr.setDuration("2 month");
        st.setCfi(cr);
        Student st1=new Student();
        st1.setId(105);
        st1.setName("Usm");
        st1.setCity("Lah");
        Certificate cr1=new Certificate();
        cr1.setCourse("java");
        cr1.setDuration("1 month");
        st1.setCfi(cr1);
        System.out.println(st);
        System.out.println(cr);
        Session session= factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(st1);
        tx.commit();
        session.close();
        factory.close();        
        
    }
}
