import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static List<String> readFiles(File baseDirectory) {
	    List<String> res = new ArrayList<>();

	    if (baseDirectory.isDirectory()) {
	        for (File file : baseDirectory.listFiles()) {
	        	res.add(file.getName());
	        }
	    }

	    return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File dir = new File(scan.nextLine());

		List<String> res = new ArrayList<>(readFiles(dir));

		System.out.println(res);

		int i = 0;
		for (Object item : res) {
			if (i++ < 5) {
				System.out.println(item);
			}
		}
	}
}