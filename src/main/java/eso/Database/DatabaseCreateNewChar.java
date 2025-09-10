package eso.Database;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import eso.Chars.Characters;
import eso.Chars.Characters_Potions;
import eso.Chars.Characters_Weapons;


@Component
public class DatabaseCreateNewChar {

	private static Scanner console = new Scanner(System.in);

	public void addNewChar() {
		
		System.out.println("Please insert a name");
		String name = console.nextLine();

		System.out.println("Please insert a title");
		String title = console.nextLine();

		System.out.println("Please insert a class");
		String type = console.nextLine();

		System.out.println("Please insert a race");
		String race = console.nextLine();

		System.out.println("Please insert a alliance");
		String alliance = console.nextLine();

		System.out.println("Please insert a curse");
		String curse = console.nextLine();

		System.out.println("Please insert a role");
		String role = console.nextLine();

		System.out.println("Please insert a job");
		String job = console.nextLine();

		System.out.println("Please insert a MainWeapon");
		String mainweapon = console.nextLine();

		System.out.println("Please insert a MainPotion");
		String mainpotion = console.nextLine();

		System.out.println("Please insert a SecondPotion");
		String secondpotion = console.nextLine();

		Characters chars = new Characters();
		Characters_Weapons weapon = new Characters_Weapons();
		Characters_Potions potions1 = new Characters_Potions();
		Characters_Potions potions2 = new Characters_Potions();
		
		chars.setName(name);
		chars.setRole(role);
		chars.setTitle(title);
		chars.setType(type);
		chars.setRace(race);
		chars.setAlliance(alliance);
		chars.setCurse(curse);
		chars.setJob(job);

		weapon.setMainWeapon(mainweapon);

		potions1.setMainPotion(mainpotion);

		potions2.setMainPotion(secondpotion);

		chars.getPotion().add(potions1);
		chars.getPotion().add(potions2);
		chars.setWeapon(weapon);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(weapon);
		session.save(chars);
		session.save(potions1);
		session.save(potions2);
		session.getTransaction().commit();
		session.close();
	}
}
