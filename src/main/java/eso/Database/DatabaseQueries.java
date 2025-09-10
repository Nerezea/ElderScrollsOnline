package eso.Database;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eso.Chars.Characters;
import eso.Repository.Characters_Repository;

@Component
public class DatabaseQueries {
	
	private static Scanner console = new Scanner(System.in);
	private Characters_Repository repository;

	@Autowired
	public DatabaseQueries(Characters_Repository repository) {
		this.repository = repository;
	}
	
	public void firstquery() {
		
		System.out.println("Welcher Name wird gesucht ?");
		String name = console.nextLine();
		
		List<Characters> chars = repository.findByNameLike(name);

		System.out.println("-----------------------------------------------");
		System.out.println("There are exactly " + chars.size() + " Chars named like " + name);
		System.out.println("-----------------------------------------------");
	}
}
