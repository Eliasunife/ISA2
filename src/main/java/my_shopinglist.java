

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class my_shopinglist {
    private List<String> items = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " è stato aggiunto alla shopping list.\n");
    }

    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println(item + " è stato cancellato della shopping list.\n");
        } else {
            System.out.println(item + " non è nella shopping list.\n");
        }
    }

   public List<String> viewItems() {
    	if (items.isEmpty()) {
            System.out.println("La shopping list è vuota.\n");
        } else {
            System.out.println("Ecco gli articoli nella shopping list:");
            for (String item : items) {
                System.out.println("- " + item);
            }
            System.out.println();
        }
        return items; 
    }
    

    public void startShopping() {
        while (true) {
            System.out.println("Opzioni:");
            System.out.println("1. Aggiungere un articolo alla shopping List");
            System.out.println("2. Cancellare un articolo della shapping List");
            System.out.println("3. Visualizzare la shopping List");
            System.out.println("4. Esci");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Scriver l'articolo da aggiungere: ");
                    addItem(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Scrivere l'articolo da cancellare: ");
                    removeItem(scanner.nextLine());
                    break;
                case 3:
                    viewItems();
                    break;
                case 4:
                    System.out.println("Uscita della shopping List.");
                    return;
                default:
                    System.out.println("Non valido, prova di nuovo!");
            }
        }
    }
}

