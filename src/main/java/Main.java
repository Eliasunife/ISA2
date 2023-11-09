
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scegliere un'applicazione:");
            System.out.println("1. Shopping List");
            System.out.println("2. Manutenzione");
            System.out.println("3. Reminder");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    my_shopinglist shoppingList = new my_shopinglist();
                    shoppingList.startShopping();
                    break;
                case 2:
                    maintenance maintenance = new maintenance();
                    maintenance.startMaintenance();
                    break;
                case 3:
                    reminder reminder = new reminder();
                    System.out.print("Aggiungere il messagio Reminder: ");
                    String message = scanner.nextLine();
                    System.out.print("Aggiungere il delay in secondi: ");
                    int delay = scanner.nextInt();
                    reminder.addReminder(message, delay);
                    break;
                case 4:
                    System.out.println("Uscita dell'applicazione.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Non valido, prova di nuovo.");
            }
        }
    }
}
