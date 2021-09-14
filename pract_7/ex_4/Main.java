import java.util.*;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) {
		Deque<Integer> pack_1 = new ArrayDeque<>();
		Deque<Integer> pack_2 = new ArrayDeque<>();

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			pack_1.addLast(input.nextInt());
		}

		for (int i = 0; i < 5; i++) {
			pack_2.addLast(input.nextInt());
		}

		System.out.println(pack_1);
		System.out.println(pack_2);

		String winner = "botva";
		Integer countOfIter = 0;
		while (countOfIter != 106) {
			
			if ( pack_1.isEmpty() ) {
				winner = "second"; break;
			}
			if ( pack_2.isEmpty() ) {
				winner = "first"; break;
			}

			Integer p1 = pack_1.pollFirst();
			Integer p2 = pack_2.pollFirst();

			if (p1 == p2) { winner = "error"; break; }

			System.out.printf("%d) %d VS %d", countOfIter + 1, p1, p2);

			if ( ((p1 > p2) && (p2 != 0 && p1 != 9)) || (p1 == 0 && p2 == 9) ) {
				pack_1.addLast(p1);
				pack_1.addLast(p2);

				System.out.printf(" WIN %d\n", p1);
			} 
			else if ( ((p2 > p1) && (p1 != 0 && p2 != 9)) || (p2 == 0 && p1 == 9) ) {
				pack_2.addLast(p1);
				pack_2.addLast(p2);

				System.out.printf(" WIN %d\n", p2);				
			}

			countOfIter += 1;
		}

		if (winner == "botva") {
			System.out.println("botva");
		} else {
			System.out.println(winner + " " + countOfIter.toString());
		}
	}
}