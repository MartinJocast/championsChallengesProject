package fr.formation.inti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChampionsChallengesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChampionsChallengesSpringApplication.class, args);
	}
	public static void afficher() {
		System.out.println("Test");
	}
	
}
