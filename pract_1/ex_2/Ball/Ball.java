import java.lang.*;

public class Ball {
    private String brand;
    private int colour;

    public Ball(String b, int c) {
        brand = b;
        colour = c;
    }

    public Ball(String b) {
        brand = b;
        colour = 0;
    }

    public Ball(int c) {
        brand = "Adidas";
        colour = c;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getColout() {
        return colour;
    }

    public String toString() {
        return this.brand + ", colour " + this.colour;
    }

    public void printPrice() {
        if (this.brand == "Adidas") {
            System.out.println("Adidas price: 100$");
        }
        else if (this.brand == "Nike") {
            System.out.println("Nike price: 150$");
        }
        else if (this.brand == "Jogel") {
            System.out.println("Jogel price: 200$");
        }
        else {
            System.out.println(this.brand + " not found");
        }
    }
}
