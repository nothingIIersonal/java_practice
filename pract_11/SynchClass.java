import java.util.Scanner;

public class SynchClass {

    private static class Horse extends Thread  {
        public static int position = 0;            
        
        @Override
        public void run() {
            synchronized (Horse.class) {
                System.out.println(position++ + " \t is \t - \t " + this.getName());
            }
        }
    }

    public static void main(String[] args) {
        int count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter horse count: ");
        count = scan.nextInt(); 

        Horse[] horses = new Horse[count];
        
        for (int i = 0; i < count; i++) {
            horses[i] = new Horse();
            horses[i].setName("Horse №" + i);
        }

        for (int i = 0; i < count; i++) {
            horses[i].start();
        }        
    }
}