import java.util.*;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> pack_1 = new LinkedList<>();
		Queue<Integer> pack_2 = new LinkedList<>();

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			pack_1.offer(input.nextInt());
		}

		for (int i = 0; i < 5; i++) {
			pack_2.offer(input.nextInt());
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

			Integer p1 = pack_1.remove();
			Integer p2 = pack_2.remove();

			if (p1 == p2) { winner = "error"; break; }

			System.out.printf("%d) %d VS %d", countOfIter + 1, p1, p2);

			if ( ((p1 > p2) && (p2 != 0 && p1 != 9)) || (p1 == 0 && p2 == 9) ) {
				pack_1.offer(p1);
				pack_1.offer(p2);

				System.out.printf(" WIN %d\n", p1);
			} 
			else if ( ((p2 > p1) && (p1 != 0 && p2 != 9)) || (p2 == 0 && p1 == 9) ) {
				pack_2.offer(p1);
				pack_2.offer(p2);

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