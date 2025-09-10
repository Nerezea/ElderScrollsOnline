package eso;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import eso.GUI.Menu;


@SpringBootApplication()

public class StartUp
		implements
		CommandLineRunner {

	private final Menu	menu;

	@Autowired
	public StartUp(final Menu menu) {
		this.menu = menu;
	}

	public static void main(String[] args) {
		SpringApplication.run(StartUp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		menu.MainMenu();
		System.exit(0);
	}
}
