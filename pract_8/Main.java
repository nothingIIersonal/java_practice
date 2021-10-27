import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Map<String, Pet> pets = new HashMap<String, Pet>();

		Pet cat_1 = new Cat("Koshka_1");
		Pet cat_2 = new Cat("Koshka_2");
		Pet dog_1 = new Dog("Babaka_1");
		Pet dog_2 = new Dog("Babaka_2");
		Pet owl_1 = new Owl("Sova_1");

		pets.put(cat_1.getName(), cat_1);
		pets.put(cat_2.getName(), cat_2);
		pets.put(dog_1.getName(), dog_1);
		pets.put(dog_2.getName(), dog_2);
		pets.put(owl_1.getName(), owl_1);

		for (Map.Entry<String, Pet> entry : pets.entrySet()) {
			System.out.println("\nKey: " + entry.getKey() + "; Value: " + entry.getValue());
		}

		Pet owl_2 = new Owl("Sova_2");

		pets.put(owl_2.getName(), owl_2);

		System.out.println("\n\nNEW:");
		for (Map.Entry<String, Pet> entry : pets.entrySet()) {
			System.out.println("\nKey: " + entry.getKey() + "; Value: " + entry.getValue());
		}

		// 7
		Map<Integer, Integer> nums = new HashMap<Integer, Integer>();
		for (int i = 0; i < 100; i++) {
			int rand = (int)((Math.random() * (10 - 0)) + 0);

			if (nums.containsKey(rand)) { nums.put(rand, nums.get(rand) + 1); }
			else { nums.put(rand, 1); }
		}

		System.out.println("\n\nCONTAINS:\n");
		for (Map.Entry<Integer, Integer> entry : nums.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}	
	}
}