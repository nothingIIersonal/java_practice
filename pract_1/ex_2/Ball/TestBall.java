import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Adidas", 128);
        Ball b2 = new Ball("Nike", 255);
        Ball b3 = new Ball("Unknown");

        b3.setColour(64);

        System.out.println(b1);
        b1.printPrice();
        b2.printPrice();
        b3.printPrice();
    }
}
