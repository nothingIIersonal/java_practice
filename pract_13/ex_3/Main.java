public class Main {

	public static <T> T ret(T[] arr, int ind) {
		return arr[ind];
	}

	public static void main(String[] args) {
		String[] arr = {"fasfs", "fasf132fqwS", "f3t342refwo-far32-a001666-666"};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(ret(arr, i));
		}
	}
}