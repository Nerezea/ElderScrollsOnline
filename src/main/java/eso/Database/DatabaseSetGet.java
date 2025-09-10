package eso.Database;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eso.Chars.Characters;
import eso.Repository.Characters_Repository;

@Component
public class DatabaseSetGet {
	
	private static Scanner console = new Scanner(System.in);
	private Characters_Repository repository;

	@Autowired
	public DatabaseSetGet(Characters_Repository repository) {
		this.repository = repository;
	}
	
	public void ChangingEntries() {
		
		System.out.println("Welcher Name wird gesucht ?");
		String name = console.nextLine();
		
		List<Characters> chars = repository.findByNameLike(name);
		
		System.out.println("====================================================");
		System.out.println("What do you want to change?");
		System.out.println("====================================================");
		System.out.println("01) Change Race");
		System.out.println("02) Change Class");
		System.out.println("03) Change Role");
		System.out.println("04) Change Curse");
		System.out.println("05) Change Job");
		System.out.println("06) Change Title");
		System.out.println("07) Change Name");
		System.out.println("08) Change Alliance");
		
		System.out.println("====================================================");
		System.out.println("Please insert a Number");
		Integer nummer = Integer.parseInt(console.nextLine());
		System.out.println("====================================================");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		if (nummer == 1) {
			System.out.println("Old Race: " + chars.get(0).getRace());
			System.out.println("Enter new Race");
			chars.get(0).setRace(console.nextLine());
			session.update(chars.get(0));
		} else if (nummer == 2) {
			System.out.println("Old Class: " + chars.get(0).getType());
			System.out.println("Enter new Class");
			chars.get(0).setType(console.nextLine());
			session.update(chars.get(0));
		} else if (nummer == 3) {
			System.out.println("Old Role: " + chars.get(0).getRole());
			System.out.println("Enter new Role");
			chars.get(0).setRole(console.nextLine());
			session.update(chars.get(0));
		} else if (nummer == 4) {
			System.out.println("Old Curse: " + chars.get(0).getCurse());
			System.out.println("Enter new Curse");
			chars.get(0).setCurse(console.nextLine());
			session.update(chars.get(0));
		} else if (nummer == 5) {
			System.out.println("Old Job: " + chars.get(0).getJob());
			System.out.println("Enter new Job");
			chars.get(0).setJob(console.nextLine());
			session.update(chars.get(0));
		} else if (nummer == 6) {
			System.out.println("Old Title: " + chars.get(0).getTitle());
			System.out.println("Enter new Title");
			chars.get(0).setTitle(console.nextLine());
			session.update(chars.get(0));
		} else if (nummer == 7) {
			System.out.println("Old Name: " + chars.get(0).getName());
			System.out.println("Enter new Name");
			chars.get(0).setName(console.nextLine());
			session.update(chars.get(0));
		} else if (nummer == 8) {
			System.out.println("Old Alliance: " + chars.get(0).getAlliance());
			System.out.println("Enter new Alliance");
			chars.get(0).setAlliance(console.nextLine());
			session.update(chars.get(0));
		} else {
			System.out.println("Falsche Nummer");
		}
		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}
}