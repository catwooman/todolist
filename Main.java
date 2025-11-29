import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tâches = new ArrayList<String>();
        boolean fin = false;

        while (!fin) {
            System.out.println("votre choix : ");
            System.out.println("1: Ajouter une tâche");
            System.out.println("2: Voir les tâches");
            System.out.println("3: Quitter");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("écris ta tâche :");
                String nom = scanner.nextLine()
                tâches.add(nom);
                System.out.println("tâche ajoutée !:");
            } 
            
            else if (choice == 2) {
                System.out.println("\n--- TÂCHES ---");

                if (tâches.isEmpty()) {
                    System.out.println("Aucune tâche pour le moment.");
                } else {
                    for (int i = 0; i < tâches.size(); i++);{
                        System.out.println((i + 1) + ". " +tâches.get(i);
                    }
                }
            }

            else if (choice == 3) {
                fin = true;
                System.out.println("See u soon ;)");
            }
        }
    }
}