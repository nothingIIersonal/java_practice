public class Main<T> {

	private T randomTypeVariable;

	public Main(T var) {
		randomTypeVariable = var;
	}

	public T get() {
		return randomTypeVariable;
	}

	public static void main(String[] args) {
		Main<String> var_1 = new Main<>("FAFSFAS");
		Main<Integer> var_2 = new Main<>(315142);

		System.out.println(var_1.get() + "\n" + var_2.get());
	}
}