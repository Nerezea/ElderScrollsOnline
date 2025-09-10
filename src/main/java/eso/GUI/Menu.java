package eso.GUI;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eso.Database.DatabaseCreateNewChar;
import eso.Database.DatabaseQueries;
import eso.Database.DatabaseSetGet;

@Component
public class Menu {

	private final DatabaseQueries		DQ;
	private final DatabaseCreateNewChar	DCNC;
	private final DatabaseSetGet		DSG;

	@Autowired
	public Menu(DatabaseQueries dq, DatabaseCreateNewChar cnc, DatabaseSetGet dsg) {
		this.DQ = dq;
		this.DCNC = cnc;
		this.DSG = dsg;
	}

	private static Scanner console = new Scanner(System.in);

	public void MainMenu() {
		System.out.println("====================================================");
		System.out.println("Hauptmenu");
		System.out.println("====================================================");
		System.out.println("1) Add a new Character with Gear");
		System.out.println("2) Submenu Queries");
		System.out.println("3) Submenu Change Single Entries");
		System.out.println("====================================================");
		System.out.println("Please insert a Number");
		Integer nummer = Integer.parseInt(console.nextLine());
		System.out.println("====================================================");

		if (nummer == 1) {
			DCNC.addNewChar();
		} else if (nummer == 2) {
			SubMenuQueries();
		} else if (nummer == 3) {
			SubMenuSetGet();
		} else {
			System.out.println("Falsche Nummer");
		}
		System.exit(0);
	}

	public void SubMenuQueries() {
		System.out.println("====================================================");
		System.out.println("Untermen� - Queries");
		System.out.println("====================================================");
		System.out.println("01) Find a Character by Name");
		System.out.println("02) -");
		System.out.println("03) -");
		System.out.println("04) -");
		System.out.println("05) -");
		System.out.println("06) -");
		System.out.println("07) -");
		System.out.println("08) -");
		System.out.println("09) -");
		System.out.println("10) -");
		System.out.println("====================================================");
		System.out.println("Please insert a Number");
		Integer nummer = Integer.parseInt(console.nextLine());
		System.out.println("====================================================");

		if (nummer == 1) {
			DQ.firstquery();
		} else if (nummer == 2) {
			System.out.println("Not implemented");
		} else if (nummer == 3) {
			System.out.println("Not implemented");
		} else if (nummer == 4) {
			System.out.println("Not implemented");
		} else if (nummer == 5) {
			System.out.println("Not implemented");
		} else if (nummer == 6) {
			System.out.println("Not implemented");
		} else if (nummer == 7) {
			System.out.println("Not implemented");
		} else if (nummer == 8) {
			System.out.println("Not implemented");
		} else if (nummer == 9) {
			System.out.println("Not implemented");
		} else if (nummer == 10) {
			System.out.println("Not implemented");
		} else {
			System.out.println("Falsche Nummer");
		}
		System.exit(0);
	}

	public void SubMenuSetGet() {
		System.out.println("====================================================");
		System.out.println("Untermen� - Change Entries");
		System.out.println("====================================================");
		System.out.println("01) Change Single Entries for a Character");
		System.out.println("02) Change Valid Sets");
		System.out.println("03) -");
		System.out.println("04) -");
		System.out.println("05) -");
		System.out.println("06) -");
		System.out.println("07) -");
		System.out.println("08) -");
		System.out.println("09) -");
		System.out.println("10) -");
		System.out.println("====================================================");
		System.out.println("Please insert a Number");
		Integer nummer = Integer.parseInt(console.nextLine());
		System.out.println("====================================================");

		if (nummer == 1) {
			DSG.ChangingEntries();
		} else if (nummer == 2) {
			System.out.println("Not implemented");
		} else if (nummer == 3) {
			System.out.println("Not implemented");
		} else if (nummer == 4) {
			System.out.println("Not implemented");
		} else if (nummer == 5) {
			System.out.println("Not implemented");
		} else if (nummer == 6) {
			System.out.println("Not implemented");
		} else if (nummer == 7) {
			System.out.println("Not implemented");
		} else if (nummer == 8) {
			System.out.println("Not implemented");
		} else if (nummer == 9) {
			System.out.println("Not implemented");
		} else if (nummer == 10) {
			System.out.println("Not implemented");
		} else {
			System.out.println("Falsche Nummer");
		}
		System.exit(0);
	}

}
