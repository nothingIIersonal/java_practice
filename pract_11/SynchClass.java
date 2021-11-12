import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class SynchClass {

    private static class Horse extends Thread  {

        public static int position = 0;  
        private String name;
        private Semaphore sem;

        Horse (Semaphore sem, String name) {
            this.sem = sem;
            this.name = name;
        }

        @Override
        public void run() {
            try {
                this.sem.acquire();
                System.out.println(++position + " \t is \t - \t " + this.name);
                this.sem.release();
            }
            catch (InterruptedException ex) {
                System.out.println("Error\n");
            }
        }
    }

    public static void main(String[] args) {
        int count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter horse count: ");
        count = scan.nextInt(); 

        Semaphore sem = new Semaphore(1); // можно добавить true, чтобы лошади распределялись сами

        Horse[] horses = new Horse[count];
        
        for (int i = 0; i < count; i++) {
            horses[i] = new Horse(sem, "Horse №" + (i+1));
        }

        for (int i = 0; i < count; i++) {
            horses[i].start();
        }        
    }
}