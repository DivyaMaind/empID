package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
public class App {

		public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory factory=cfg.buildSessionFactory();
			
			Session session = factory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			demo1 e = new demo1();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter ID");
			int id = sc.nextInt();
			
			System.out.println("Enter name");
			String name = sc.next();
			
			System.out.println("Enter place");
			String place = sc.next();
			
			System.out.println("Enter pan");
			int pan = sc.nextInt();
			
			e.setCid(id);
			e.setCname(name);
			e.setPlace(place);
			e.setPan(pan);
		
			
			session.save(e);
			tx.commit();
			
			System.out.println("Data inserted successfully...!");
		}

	}



