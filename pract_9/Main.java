import java.awt.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

	private static void removePlanet(List<String> planets, String removablePlanet) {
		while (planets.contains(removablePlanet)) {
			planets.remove(removablePlanet);
		}
	}

	private static void addPlanet(List<String> planets, String addingPlanet) {
		planets.add(addingPlanet);
	}

	private static void editPlanet(List<String> planets, String oldPlanet, String newPlanet) {
		if (oldPlanet == newPlanet) {
			System.out.println("Planets equals...");
			return;
		}

		while (planets.contains(oldPlanet)) {
			planets.set(planets.indexOf(oldPlanet), newPlanet);
		}
	}

	private static void shufflePlanets(List<String> planets) {
		Collections.shuffle(planets);
	}

	private static String randomPlanet(List<String> planets) {
		Random rnd = new Random();
		return planets.get(rnd.nextInt(planets.size()));
	}

	private static Integer showIndexOfPlanet(List<String> planets, String searchingIndexOfPlanet) {
		return planets.indexOf(searchingIndexOfPlanet);
	}

	private static void arePlanetExist(List<String> planets, String searchingPlanet) {
		System.out.println(planets.contains(searchingPlanet));
	}


	// METHOD FROM OFFICIAL DOCUMENTATION

		// reverse planets list - returns reversed planets list
		private static void reversePlanets(List<String> planets) {
			Collections.reverse(planets);
		}

		// this method sorts the planets alphabetically
		private static void sortPlanets(List<String> planets) {
			Collections.sort(planets);
		}

		// this method replaces all elements of the list with the given one
		private static void fillPlanets(List<String> planets, String fillPlanet) {
			Collections.fill(planets, fillPlanet);
		}
	//


	// CUSTOM METHOD FOR PRINT PLANETS
	
	private static void printPlanets(List<String> solarSystemV1, List<String> solarSystemV2) {
		System.out.println();		
		System.out.println("1-st solar system: " + solarSystemV1);
		System.out.println("2-nd solar system: " + solarSystemV2);
		System.out.println();
	}
	
	//


    public static void main(java.lang.String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");

        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");
        String pluto = new String("Плутон");

        ArrayList<String> solarSystemV1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter));
		List<String> solarSystemV2 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(saturn, uranus, neptune, pluto)));
        
		printPlanets(solarSystemV1, solarSystemV2);

		removePlanet(solarSystemV1, earth); // remove all earth from 1-st solar system list

		printPlanets(solarSystemV1, solarSystemV2);

		addPlanet(solarSystemV1, earth); // add earth to 1-st solar system
		addPlanet(solarSystemV1, earth); // add earth to 1-st solar system

		printPlanets(solarSystemV1, solarSystemV2);

		removePlanet(solarSystemV1, earth); // remove all earth from 1-st solar system list

		printPlanets(solarSystemV1, solarSystemV2);

		editPlanet(solarSystemV1, mars, earth); // replace all mars to earth in 1-st solar system list 
		addPlanet(solarSystemV1, earth); // add earth to 1-st solar system
		addPlanet(solarSystemV1, earth); // add earth to 1-st solar system

		printPlanets(solarSystemV1, solarSystemV2);

		editPlanet(solarSystemV1, earth, mars); // replace all earths to mars in 1-st solar system list

		printPlanets(solarSystemV1, solarSystemV2);

		editPlanet(solarSystemV1, earth, earth); // getting custom exception because strings equals 

		shufflePlanets(solarSystemV1); // shuffle 1-s solar system list

		printPlanets(solarSystemV1, solarSystemV2);

		for (int i = 0; i < 3; i++) {
			System.out.println(randomPlanet(solarSystemV2)); // getting random planet from 2-nd solar system
		}

		printPlanets(solarSystemV1, solarSystemV2);

		System.out.println(showIndexOfPlanet(solarSystemV2, pluto)); // printing pluto index from 2-nd solar system list

		arePlanetExist(solarSystemV1, earth); // checking existing of earth planet in 1-st solar system list
		arePlanetExist(solarSystemV1, mars); // checking existing of mars planet in 1-st solar system list

		reversePlanets(solarSystemV1); // reversing 1-st solar system list and printing it below... 	
		printPlanets(solarSystemV1, solarSystemV2);

		sortPlanets(solarSystemV1); // sorting 1-st solar system list alphabetically
		
		printPlanets(solarSystemV1, solarSystemV2);

		fillPlanets(solarSystemV1, pluto); // replace all elements of 1-st solar system on "Плутон"
		
		printPlanets(solarSystemV1, solarSystemV2);
    }
}
