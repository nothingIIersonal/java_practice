import java.util.List;
import java.util.ArrayList;

public class Main {

	private static <T> List<T> convert(T[] array) {
		List<T> res = new ArrayList<T>();
		
		for (T item : array) {
			res.add(item);
		}

		return res;
	} 

	public static void main(String[] args) {
		String[] arr_str = {"fasf", "fasfasf1", "12rasf"};
		Integer[] arr_int = {5,2,3,124,12,4,124,12,-512,0,1};

		List<String> res_str = new ArrayList<String>(convert(arr_str));
		List<Integer> res_int = new ArrayList<Integer>(convert(arr_int));

		System.out.println(res_str + "\n" + res_int);	
	}
}