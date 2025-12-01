import java.util.ArrayList; // liste dynamique
import java.util.Scanner; // lire l'entrée clavier

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in); // création du scanner
        ArrayList<String> tâches = new ArrayList<String>(); // liste qui stock les tâches
        boolean fin = false; // variable pour savoir si on quitte le programe

        while (!fin) { 
            System.out.println("votre choix : ");
            System.out.println("1: Ajouter une tâche");
            System.out.println("2: Voir les tâches");
            System.out.println("3: Quitter");

            int choice = scanner.nextInt(); // lire le choix
            scanner.nextLine(); // vide la ligne restante
            //ici le programme attend que je tape la tâche

            if (choice == 1) { // ajoute une tâche
                System.out.println("écris ta tâche :");
                String nom = scanner.nextLine(); // lecture de la tâche
                tâches.add(nom); // ajout de la tâche
                System.out.println("tâche ajoutée !");
            } 
            
            else if (choice == 2) { //affiche les tâches
                System.out.println("\n--- TÂCHES ---");

                if (tâches.isEmpty()) { //si la liste es vide
                    System.out.println("Aucune tâche pour le moment.");
                } else {
                        for (int i = 0; i < tâches.size(); i++){ // parcours toutes les tâches
                        System.out.println((i + 1) + ". " +tâches.get(i)); // affiche chaque tâches
                    }
                }
            }

            else if (choice == 3) { // quitter
                fin = true; // la boucle s'arrête
                System.out.println("See u soon ;)");
            }
        }
    }
}