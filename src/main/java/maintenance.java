

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maintenance {
    private List<String> activities = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addActivity(String activity) {
        activities.add(activity);
        System.out.println(activity + " è stato aggiunto alla lista di attività.");
    }

    public List<String> checkUncompletedActivities() {
        return activities; 
    }

    public void markActivityCompleted(String activity) {
        if (activities.contains(activity)) {
            activities.remove(activity);
            System.out.println(activity + " è stato segnalato come completata.");
        } else {
            System.out.println(activity + " non è nella lista di attività.");
        }
    }

    public void startMaintenance() {
        while (true) {
            System.out.println("Opzioni di manutenzioni:");
            System.out.println("1. Aggiungere un attività di manutenzione");
            System.out.println("2. Controllare le attività non completate");
            System.out.println("3. Segnalare un attività com completata");
            System.out.println("4. Esci");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Scrivere la nuova attività: ");
                    addActivity(scanner.nextLine());
                    break;
                case 2:
                    checkUncompletedActivities();
                    break;
                case 3:
                    System.out.print("Scgelere l'attività da segnalare come completata: ");
                    markActivityCompleted(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Uscita della app di manutenzione.");
                    return;
                default:
                    System.out.println("Non valido, Prova di nuovo.");
            }
        }
    }
}
