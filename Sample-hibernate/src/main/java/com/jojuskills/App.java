package com.jojuskills;

import org.hibernate.Session;

import com.jojuskills.entity.Student;
import com.jojuskills.util.HibernateUtil;

public class App 

{
  public static void main(String[] args) {
	  
	  Session ss=HibernateUtil.getSessionFactory().openSession();
      ss.beginTransaction();
      Student s=new Student(1,"prava", "java");
	  
      ss.save(s);
      ss.getTransaction().commit();
    System.out.println("Hibernate World!");
    
  }

}