package serie4;

import ch.comem.Clavier;

public class TestBlanc2023b {
    public static void main(String[] args) {
        String[] invites = {"Dumoulin", "Bovary", "Landry", "Brekker", "Martin"};
        boolean[] presence = new boolean[invites.length];

        String saisie = "";
        boolean saisieIsInvalid = false;

        do {
            do {
                saisie = Clavier.rend_String("Nom d'une personne : ");
                saisieIsInvalid = !saisie.isEmpty() && (saisie.toCharArray()[0] < 65 || saisie.toCharArray()[0] > 90 || saisie.length() < 2);
                if (saisieIsInvalid) {
                    System.out.println("Le nom doit commencer par une majuscule et contenir au moins deux lettres.");
                }
            } while (saisieIsInvalid);

            if (!saisie.isEmpty()) {
                boolean check = false;

                for (int i = 0; i < invites.length; i++) {
                    if (saisie.equals(invites[i])) {
                        check = true;
                        if (!presence[i]) {
                            presence[i] = true;
                            System.out.println("Bienvenue " + invites[i] + ", vous pouvez entrer !");
                        } else {
                            System.out.println("Cette personne est déjà entrée.");
                        }
                    }
                }

                if (!check) {
                    System.out.println("Cette personne n'a pas été invitée.");
                }
            }
        } while (!saisie.isEmpty());

        System.out.print("Liste des personnes invitées présentes : ");
        for (int i = 0; i < invites.length; i++) {
            if (presence[i]) {
                System.out.print(invites[i] + ", ");
            }
        }

        System.out.print("\nListe des personnes invitées absentes : ");
        for (int i = 0; i < invites.length; i++) {
            if (!presence[i]) {
                System.out.print(invites[i] + ", ");
            }
        }
    }
}
