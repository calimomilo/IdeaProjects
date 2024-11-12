package m531penaparra;

import ch.comem.Clavier;

public class M531PenaParraProbleme1 {
    public static void main(String[] args) {
        // saisie des joueurs
        String player1 = Clavier.rend_String("Joueur 1 : ");
        String player2 = Clavier.rend_String("Joueur 2 : ");
        System.out.println("\nBienvenue " + player1 + " et " + player2 + "!\n");

        // saisie du mode de jeu
        byte saisie = 0;
        do {
            saisie = Clavier.rend_byte("Si le joueur qui mange le dernier stick gagne, tapez 1." +
                    "\nSi le joueur qui mange le dernier stick perd, tapez 2.\n");
            if (saisie != 1 && saisie != 2) {
                System.out.println("Saisie invalide.");
            }
        } while (saisie != 1 && saisie != 2);
        System.out.println("Le joueur qui mange le dernier stick " + (saisie == 1 ? "gagne" : "perd") + ".\n");

        boolean lastStickWins = saisie == 1;

        // génération du nombre de sticks et du premier joueur
        byte sticksNumber = (byte) (Math.round(Math.random()*20+10));
        String currentPlayer = Math.round(Math.random()*2+1) == 1? player1 : player2;
        byte currentSticks = 0;
        System.out.println("Il y a " + sticksNumber + " sticks.");

        // déroulement du jeu
        do {
            // saisie du nombre de sticks mangés
            do {
                currentSticks = Clavier.rend_byte(currentPlayer + ", combien de sticks mangez-vous?\n");
                if (currentSticks < 1 || currentSticks > 3 || currentSticks > sticksNumber) {
                    System.out.println("\nSaisie invalide. Il reste " + sticksNumber + " stick" + (sticksNumber == 1? "" : "s") +".");
                }
            } while (currentSticks < 1 || currentSticks > 3 || currentSticks > sticksNumber);

            sticksNumber -= currentSticks;
            System.out.println("\nVous avez mangé " + currentSticks + " stick" + (currentSticks == 1? "" : "s")
                    + ". Il reste " + sticksNumber + " stick" + (sticksNumber == 1? "" : "s") +".");
            currentPlayer = currentPlayer.equals(player1)? player2 : player1;

        } while (sticksNumber > 0);

        String gagnant = lastStickWins
                ? (currentPlayer.equals(player1)? player2 : player1)
                : (currentPlayer.equals(player1)? player1 : player2);

        System.out.println("\nFélicitations " + gagnant + ", vous avez gagné !");

    }
}
