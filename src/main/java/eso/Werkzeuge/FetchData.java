package eso.Werkzeuge;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import eso.Chars.Characters;

public class FetchData {

	private static Scanner console = new Scanner(System.in);

	public void FetchingCharbyID() {
		Characters chr = new Characters();

		System.out.println("Please insert a ID");
		Integer id = Integer.parseInt(console.nextLine());

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		chr = (Characters)session.get(Characters.class, id); //Number is the PrimaryKey in Unit_Orc
		System.out.println("Name: " + chr.getName() + " (" + chr.getRole() + ")" + " with " + chr.getDamage() + " Damage und dem Waffentyp: " + chr.getWeapon() + " und den Potions: " + chr.getPotion());
	}

}
