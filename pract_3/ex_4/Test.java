public class Test {
	public static void main(String[] args) {
		MovableCircle mc = new MovableCircle(1, 2, 3, 4, 5);
		System.out.println(mc);

		mc.moveUp();
		mc.moveRight();
		System.out.println(mc);
	}
}