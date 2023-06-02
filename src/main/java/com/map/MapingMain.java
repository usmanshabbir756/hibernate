package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapingMain {
	public static void main(String[] args) {
		Question q1=new Question();
		q1.setQuestionId(333);
		q1.setQuestion("What is java");
		
		Answer answer=new Answer();
		answer.setAnswerId(101);
		answer.setAnswer("Java is a progamming language");
		
		q1.setAnswer(answer);
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(q1);
		s.save(answer);
		tx.commit();
		s.close();
		
		
		factory.close();
		
	}
}
