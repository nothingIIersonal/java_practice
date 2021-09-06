public class Test {
	public static void main(String[] args) {
		MovableRectangle mc = new MovableRectangle(1, 2, 3, 4, 5, 6);
		System.out.println(mc);

		mc.moveUp();
		mc.moveRight();
		System.out.println(mc);
	}
}