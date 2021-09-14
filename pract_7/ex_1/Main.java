import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> pack_1 = new Stack<>();
		Stack<Integer> pack_2 = new Stack<>();

		Stack<Integer> additional_pack_1 = new Stack<>();
		Stack<Integer> additional_pack_2 = new Stack<>();

		Scanner input = new Scanner(System.in);

		Stack<Integer> buf = new Stack<>();

		for (int i = 0; i < 5; i++) {
			buf.push(input.nextInt());
		}
		for (int i = 0; i < 5; i++) {
			pack_1.push(buf.pop());
		}

		for (int i = 0; i < 5; i++) {
			buf.push(input.nextInt());
		}
		for (int i = 0; i < 5; i++) {
			pack_2.push(buf.pop());
		}

		System.out.println(pack_1);
		System.out.println(pack_2);

		String winner = "botva";
		Integer countOfIter = 0;
		while (countOfIter != 106) {
			
			if ( pack_1.empty() && additional_pack_1.empty() ) {
				winner = "second"; break;
			}
			if ( pack_2.empty() && additional_pack_2.empty() ) {
				winner = "first"; break;
			}

			if ( pack_1.empty() ) {
				while ( !additional_pack_1.empty() ) { pack_1.push(additional_pack_1.pop()); }
			}
			if ( pack_2.empty() ) {
				while ( !additional_pack_2.empty() ) { pack_2.push(additional_pack_2.pop()); }
			}

			Integer p1 = pack_1.pop();
			Integer p2 = pack_2.pop();

			if (p1 == p2) { winner = "error"; break; }

			System.out.printf("%d) %d VS %d", countOfIter + 1, p1, p2);

			if ( ((p1 > p2) && (p2 != 0 && p1 != 9)) || (p1 == 0 && p2 == 9) ) {
				additional_pack_1.push(p1);
				additional_pack_1.push(p2);

				System.out.printf(" WIN %d\n", p1);
			} 
			else if ( ((p2 > p1) && (p1 != 0 && p2 != 9)) || (p2 == 0 && p1 == 9) ) {
				additional_pack_2.push(p1);
				additional_pack_2.push(p2);

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