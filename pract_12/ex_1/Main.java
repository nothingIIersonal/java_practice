import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        HashMap<String, String> map = new HashMap<>();
        
        map.put("4566451923", "Ivanov I I");
        map.put("5561039512", "Petrov P P");
        map.put("5432406951", "Sidorov S S");
        
        String INN, name;
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Enter name: ");
        name = scan.nextLine();
        
        System.out.printf("Enter INN: ");
        INN = scan.nextLine();
        
        try {
            if (map.get(INN).equals(name)) {
                System.out.println("Operation successful!");
            }
            else {
                System.out.println("Unknown person");
            }
        }
        catch (java.lang.NullPointerException ex) {
            System.out.println("Exception: invalid INN");
        }

    }
}
