public class MovableRectangle implements Movable {
	private MovablePoint topLeft = new MovablePoint(0, 0, 0, 0);
	private MovablePoint bottomRight = new MovablePoint(0, 0, 0, 0);

	private boolean checkSpeed() {
		if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed)
		{
			return true;
		}
		return false;
	}

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft.x = x1;
		this.topLeft.y = y1;
		this.bottomRight.x = x2;
		this.bottomRight.y = y2;

		this.topLeft.xSpeed = xSpeed;
		this.topLeft.ySpeed = ySpeed;
		this.bottomRight.xSpeed = xSpeed;
		this.bottomRight.ySpeed = ySpeed;
	}

	public String toString() {
		return "x1: " + this.topLeft.x + ", y1: " + this.topLeft.y + ", x2: " + this.bottomRight.x + ", y2: " + this.bottomRight.y + ", xSpeed1: " + this.topLeft.xSpeed + ", ySpeed1: " + this.topLeft.ySpeed + ", xSpeed2: " + this.topLeft.xSpeed + ", ySpeed2: " + this.topLeft.ySpeed;
	}

	@Override
	public void moveUp() {
		if (checkSpeed()) {
			topLeft.y += 1;
			bottomRight.y += 1;
		}
		else
			System.out.println("Speed's must be equal");
	}	

	@Override
	public void moveDown() {
		if (checkSpeed()) {	
			topLeft.y -= 1;
			bottomRight.y -= 1;			
		}
		else
			System.out.println("Speed's must be equal");
	}

	@Override
	public void moveLeft() {
		if (checkSpeed()) {		
			topLeft.x -= 1;
			bottomRight.x -= 1;
		}
		else
			System.out.println("Speed's must be equal");
	}

	@Override
	public void moveRight() {
		if (checkSpeed()) {		
			topLeft.x += 1;
			bottomRight.x += 1;
		}
		else
			System.out.println("Speed's must be equal");
	}
}