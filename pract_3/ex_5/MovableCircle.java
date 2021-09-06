public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center = new MovablePoint(0, 0, 0, 0);

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center.x = x;
		this.center.y = y;
		this.center.xSpeed = xSpeed;
		this.center.ySpeed = ySpeed;
		this.radius = radius;
	}

	public String toString() {
		return "x: " + this.center.x + ", y: " + this.center.y + ", xSpeed: " + this.center.xSpeed + ", ySpeed: " + this.center.ySpeed + ", radius: " + this.radius;
	}

	@Override
	public void moveUp() {
		center.y += 1;
	}	

	@Override
	public void moveDown() {
		center.y -= 1;
	}

	@Override
	public void moveLeft() {
		center.x -= 1;
	}

	@Override
	public void moveRight() {
		center.x += 1;
	}
}