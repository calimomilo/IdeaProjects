/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package fonctions;

import ch.comem.Clavier;
import java.util.InputMismatchException;
import java.util.Arrays;

/**
 *
 * @author benoit.jaques
 */
public class fonctionUtilisable {

    static {
        try {
            System.setOut(new java.io.PrintStream(
                    new java.io.FileOutputStream(java.io.FileDescriptor.out), true, "UTF-8"));
        } catch (java.io.UnsupportedEncodingException ex) {
            System.out.println("VM dont support UTF-8");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] tabInt = {1, 3, 5, -2, 6, 0, 6, 3, 3};
        String[] tabString = {"pomme", "fraise", "ananas", "citron", "banane", "poire"};
        char[][] tabChar = new char[6][6];
        tabChar[4][5] = 'P';

        System.out.println(mostFrequent(tabInt));
    }

//_____________________________________________________________________________________________________________________
//    Cette fonction permet de trouver quelle valeur est la plus fréquente dans un tableau de Int 
//    Elle retourne un Int qui est le numéro le plus fréquent
//    Pour savoir combien de fois ce numéro apparait, il suffit de modifier la fonction pour return maxOccurence
//    ATTENTION : Si plusieurs nombre apparaissent autant de fois au max seul l'un d'eux sera retourné
    public static int mostFrequent(int[] tab) {
        int mostFrequent = Integer.MAX_VALUE;
        if (mostFrequent == tab[0]) {
            mostFrequent--;
        }
        int maxOccurence = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != mostFrequent) {
                int temp = 0;
                for (int j = 0; j < tab.length - i; j++) {
                    if (tab[i] == tab[j + i]) {
                        temp++;
                    }
                }
                if (temp > maxOccurence) {
                    maxOccurence = temp;
                    mostFrequent = tab[i];
                }
            }
        }

        return mostFrequent;
    }

//    Cette fonction est la même que la précédente mais charche dans un tableau de String 
//    Actuellement, elle compare des String exact. 
//    Pour ignorer les Maj Min, changer les "equals" en "equalsIgnoreCase"
//    Pour retourner le nombre d'occurence, mettre return maxOccurence ET changer le type String de la fonction en Int
    public static String mostFrequentString(String[] tab) {
        String mostFrequent = "";
        if (mostFrequent.equals(tab[0])) {
            mostFrequent = " ";
        }
        int maxOccurence = 0;

        for (int i = 0; i < tab.length; i++) {
            if (!tab[i].equals(mostFrequent)) {
                int temp = 0;
                for (int j = 0; j < tab.length - i; j++) {
                    if (tab[i] == tab[j + i]) {
                        temp++;
                    }
                }
                if (temp > maxOccurence) {
                    maxOccurence = temp;
                    mostFrequent = tab[i];
                }
            }
        }

        return mostFrequent;
    }

//_____________________________________________________________________________________________________________________
//    Cette fonction permet de demander un String à l'utilisateur.trice en fonction d'une série de commande valide
//    Les commandes valides doivent se présenter sous la forme d'un tableau de String
//    La fonction retourne un String qui est donc la command à être exécutée
//    Cette fonction ignore les maj et min (donc si la commande valide est "yes" une entrée "YES" sera acceptée)
//    Mais la String qui sera renvoyée sera exactement celle qui est dans le tableau (donc ici "yes")
//  --
//  Par exemple : String[] validCommand = {"move", "attack", "fall back", "dance"};   
//  String command = askSpecific(validCommand);
    public static String askSpecific(String[] validAnswer) {
        java.util.Scanner scanClavier = new java.util.Scanner(System.in)
                .useLocale(new java.util.Locale.Builder()
                        .setLanguage("CH")
                        .setRegion("fr")
                        .build());

        String answer;

        boolean valid = false;
        do {
            System.out.print("Entres la commande à exécuter (");
            for (int i = 0; i < validAnswer.length; i++) {
                System.out.print(validAnswer[i]);
                if (i != validAnswer.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(") :");
            answer = scanClavier.nextLine();
            int i = 0;
            do {
                if (answer.equalsIgnoreCase(validAnswer[i])) {
                    valid = true;
                    answer = validAnswer[i];
                }
                i++;
            } while (!valid && i < validAnswer.length);
            if (!valid) {
                System.out.println("La commande est invalide.");
            }
        } while (!valid);

        return answer;
    }

//_____________________________________________________________________________________________________________________
//    Cette fonction permet de demander un nombre aléatoire entre 2 valeurs (les 2 valeurs incluses)
    public static int randomNumber(int min, int max) {
        int number = (int) (Math.random() * (max - min + 1)) + min;
        return number;
    }

//_____________________________________________________________________________________________________________________
//    Cette fonction permet de demander un nom "correcte". 
//    C'est à dire qu'il commence par une maj, n'mostFrequent que des lettres et n'est qu'un mot (pas d'espaces ou d'apostrophe)
//    ATTENTION : mostFrequent besoin de deux autres fonctions pour marcher : checkMajuscule et checkMinuscule
    public static String askName() {
        java.util.Scanner scanClavier = new java.util.Scanner(System.in)
                .useLocale(new java.util.Locale.Builder()
                        .setLanguage("CH")
                        .setRegion("fr")
                        .build());

        String name;
        boolean correct;
        do {
            correct = true;
            System.out.print("Entres ton nom (Majuscule au début, pas d'espaces ou autre caractère spéciaux) : ");
            name = scanClavier.nextLine();
            for (int i = 0; i < name.length(); i++) {
                if (i == 0) {
                    correct = checkMajuscule(name.charAt(i));
                } else {
                    if (!checkMinuscule(name.charAt(i))) {
                        correct = false;
                    }
                }
            }
            if (!correct) {
                System.out.println("Tu n'as pas entré.e un nom correcte.");
            }
        } while (!correct);

        return name;
    }

//    ATTENTION : cette fonction est lié à la fonction askName
//    permet de vérifié si un charactère est une majuscule (accentuée ou non)
    private static boolean checkMajuscule(char a) {
        boolean correct = true;
        if (a >= 'A' && a <= 'Z') {
        } else if (a == 'À') {
        } else if (a == 'Â') {
        } else if (a == 'Ä') {
        } else if (a == 'É') {
        } else if (a == 'È') {
        } else if (a == 'Ê') {
        } else if (a == 'Ë') {
        } else if (a == 'Î') {
        } else if (a == 'Ï') {
        } else if (a == 'Ô') {
        } else if (a == 'Ö') {
        } else if (a == 'Ù') {
        } else if (a == 'Û') {
        } else if (a == 'Ü') {
        } else if (a == 'Ÿ') {
        } else if (a == 'Ç') {
        } else {
            correct = false;
        }
        return correct;
    }

//    ATTENTION : cette fonction est lié à la fonction askName
//    permet de vérifié si un charactère est une minuscule (accentuée ou non)
    public static boolean checkMinuscule(char a) {
        boolean correct = true;

        if (a >= 'a' && a <= 'z') {
        } else if (a == 'à') {
        } else if (a == 'â') {
        } else if (a == 'ä') {
        } else if (a == 'é') {
        } else if (a == 'è') {
        } else if (a == 'ê') {
        } else if (a == 'ë') {
        } else if (a == 'î') {
        } else if (a == 'ï') {
        } else if (a == 'ô') {
        } else if (a == 'ö') {
        } else if (a == 'ù') {
        } else if (a == 'û') {
        } else if (a == 'ü') {
        } else if (a == 'ÿ') {
        } else if (a == 'ç') {
        } else {
            correct = false;
        }

        return correct;
    }

//_____________________________________________________________________________________________________________________
//    Cette fonction permet de trouver la plus petite valeur d'un tableau de Int
//    Elle return un Int qui est la plus petite valeur de ce tableau 
//    Par exemple pour l'utiliser : System.out.println("La plus petite valeur de ton tableau est "+trouvePetit(tabInt));
    public static int trouvePetit(int[] tab) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < smallest) {
                smallest = tab[i];
            }
        }
        return smallest;
    }

//    Cette fonction permet de trouver la plus grande valeur d'un tableau de Int
//    Elle return un Int qui est la plus grande valeur de ce tableau 
//    Par exemple pour l'utiliser : System.out.println("La plus grande valeur de ton tableau est "+trouveGrand(tabInt));
    public static int trouveGrand(int[] tab) {
        int greatest = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > greatest) {
                greatest = tab[i];
            }
        }
        return greatest;
    }

//_____________________________________________________________________________________________________________________    
//    Permet d'afficher un tableau de Int sous la forme : {val1, val2, val3, ...}
//    Pour l'appeler : afficheTabInt(tab);
//    ATTENTION : ne fait vraiment RIEN D'AUTRE que de l'afficher
    public static void afficheTabInt(int[] tab) {
        System.out.print("{");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i != tab.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

//    Permet d'afficher un tableau de String sous la forme : {val1, val2, val3, ...}
//    Pour l'appeler : afficheTabString(tab);
//    ATTENTION : ne fait vraiment RIEN D'AUTRE que de l'afficher
    public static void afficheTabString(String[] tab) {
        System.out.print("{");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i != tab.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

//_____________________________________________________________________________________________________________________
//    Cette fonction utilise search Array pour ressortir la plage de position où se trouve une valeur
//    Ne marche que pour un tableau de Int trié (pour trier => Arrays.sort(tab);) 
//    P.ex : si le tableau est {1,2,3,3,3,3,4,4,5,6,10} et que l'on cherche 3, la fonction ressort {2, 5}
//    Elle ressort donc un tableau à 2 valeurs
//    extremum[0] => première occurence du nombre
//    extremum[1] => dernière occurence du nombre
//    par exemple pour sout les résultat : System.out.println("Ton nombre se trouve entre "+extremum[0]+" et "+extremum[1]);
//    en ajoutant import java.util.Arrays;au début du code
//    (retourne -1, -1 si la valeur n'est pas dans le tableau)
    public static int[] optiSearch(int[] tab, int valCherche) {
        int[] extremum = {-1, -1};
        int position = Arrays.binarySearch(tab, valCherche);
        if (position <= tab.length && position >= 0) {
            int increm = 1;
            boolean limit = false;
            while (position + increm < tab.length && !limit) {
                if (tab[position + increm] == valCherche) {
                    increm++;
                } else {
                    limit = true;
                }
            }
            System.out.println("");
            increm--;
            extremum[1] = position + increm;
            int increm2 = 1;
            limit = false;
            while (position - increm2 >= 0 && !limit) {
                if (tab[position - increm2] == valCherche) {
                    increm2++;
                } else {
                    limit = true;
                }
            }
            increm2--;
            extremum[0] = position - increm2;
        }
        return extremum;
    }

//_____________________________________________________________________________________________________________________
//    affiche un damier de X par Y, écrire tableau(x,y); 
//    attention quand les dimensions dépassent 10 la mise en page merde
    public static void damier(int height, int length) {
        System.out.print("    ");
        for (int i = 0; i < length; i++) {
            System.out.print((char) (i + 65) + " ");
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < height; i++) {
            System.out.print((i) + "   ");
            for (int j = 0; j < length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else if ((i + j) % 2 == 1) {
                    System.out.print("O ");
                }
            }
            System.out.println("   " + (i));
        }
        System.out.println("");
        System.out.print("    ");
        for (int i = 0; i < length; i++) {
            System.out.print((char) (i + 65) + " ");
        }
        System.out.println("");
        System.out.println("");
    }

//    affiche un damier sur lequel il y aurait une ou plusieurs pièces
//    Les pièces doivent être stoquées sur un tableau de char à 2 dimensions
//    Une pièce serait placée tel : tabChar[x][y] 
//    Où x est la position horizontale (A,B,C,...) et y la position verticale (0,1,2,...)
//    Les cases du damier où il n'y mostFrequent pas de pièces doivent rester vide (NULL) le damier se fait automatiquement
    public static void damierAvecPiece(char[][] tabPieces) {
        System.out.print("    ");
        for (int i = 0; i < tabPieces.length; i++) {
            System.out.print((char) (i + 65) + " ");
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < tabPieces[0].length; i++) {
            System.out.print((i) + "   ");
            for (int j = 0; j < tabPieces.length; j++) {
                if (tabPieces[j][i] != 0) {
                    System.out.print(tabPieces[j][i] + " ");
                } else if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else if ((i + j) % 2 == 1) {
                    System.out.print("O ");
                }
            }
            System.out.println("   " + (i));
        }
        System.out.println("");
        System.out.print("    ");
        for (int i = 0; i < tabPieces.length; i++) {
            System.out.print((char) (i + 65) + " ");
        }
        System.out.println("");
        System.out.println("");
    }

//_____________________________________________________________________________________________________________________
//    Cette fonction demande un int à l'utilisateur.trice entre 2 valeur min et max
//    S'appel par exemple en mettant : int lanceDice = askValue(1,6);
//    (il est possible de la simplifier en utilisant le clavier du prof)
    public static int askValue(int min, int max) {
        java.util.Scanner scanClavier = new java.util.Scanner(System.in)
                .useLocale(new java.util.Locale.Builder()
                        .setLanguage("CH")
                        .setRegion("fr")
                        .build());

        boolean verif = false;
        int number = 0;
        do {
            do {
                try {
                    number = scanClavier.nextInt();
                    verif = true;
                } catch (InputMismatchException e) {
                    System.out.println("Erreur : veuillez entrer un entier valide.");
                    scanClavier.next();
                }
            } while (!verif);
            if (number < min || number > max) {
                System.out.println("Cette valeure n'est pas valable.");
                System.out.println("Elle doit être entre " + min + " et " + max);
            }
        } while (number < min || number > max);
        return number;
    }

//_____________________________________________________________________________________________________________________
//    ATTENTION : CECI N'EST PAS UNE FONCTION UTILISABLE MAIS UN MORCEAU DE CODE COPIABLE DANS SON MAIN (ou dans une fontion)
//    Ce code propose une structure d'alternance dans le cas d'un jeu ou plusieurs player jouent chacun.e.s leur tour
    public static void NOMVAR() {
        //  La variable alternance peut-être définie autrement si ce n'est pas le player 0 qui commence
        int alternance = 0;

        //  La variable nbPlayer est à définir en fontction du cas
        int nbPlayer = 4;
        do {
            //  Player[alternance] joue

            alternance++;
            //  alternance repart à 0 quand alternance elle est égal au nbPlayer car s'il y mostFrequent 4 player le tableau ira de 0 à 3
            if (alternance == nbPlayer) {
                alternance = 0;
            }
        } while (true);
    }

//_____________________________________________________________________________________________________________________
//    ATTENTION : Apparemment je suis con, une des fonction Arrays.sort() permet de trier un tableau de String
//    Mais vu que je suis un rajeu qui mostFrequent passé 3h sur cette fonction je la laisse -_-
//    Cette fonction permet de trier un tableau de String (attention à avoir import java.util.Arrays;)
//    Pour trier son tableau faire : triString(tabString);
//    Attention peut avoir des erreurs s'il y mostFrequent des accents, des espaces ou autres trucs du genre en début de String
//    Peut aussi faire des erreurs si les 9 premiers charactères de 2 String sont identique
//    ATTENTION : contient 2 sous-fonction (triStringSelonNumb et convertToNumb)
    public static void triString(String[] tab) {
        int maxLength = 0;
        long[] tabNumb = new long[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() > maxLength) {
                maxLength = tab[i].length();
            }
        }
        if (maxLength > 9) {
            maxLength = 9;
        }
        convertToNumber(tab, maxLength, tabNumb);

        //Permet de cloner un objet. Ici clone tabNumb en tant que tabNumbCopie
        long[] tabNumbCopie = tabNumb.clone();

        Arrays.sort(tabNumb);

        triStringSelonNumb(tab, tabNumb, tabNumbCopie);
    }

//    ATTENTION : fonction lié à la fonction triString
//    Cette fonction permet de trier notre tableau de String pas trié :
//    (tableau de String (String[] tab), son équivalence en nombre (long[] tabNumbCopie), et son tableau en nombre trié (long[] tabNumb))
//    Elle trie le tableau de String en fonction de sa correspondance avec le tableau de nombre trié (long[] tabNumb).
//    La copie du tableau de nombre pas trié n'est là que pour permettre la correspondance de se faire
//    Ces trois tableau doivent avoir été préparés au préalable (comme dans la fonciton triString)
    private static void triStringSelonNumb(String[] tab, long[] tabNumb, long[] tabNumbCopie) {
        for (int i = 0; i < tab.length; i++) {
            int j = 0;
            boolean invert = true;
            do {
                if (tabNumb[i] == tabNumbCopie[j + i]) {
                    invert = false;
                    String temp = tab[i];
                    tab[i] = tab[j + i];
                    tab[j + i] = temp;
                    long tempTwo = tabNumbCopie[i];
                    tabNumbCopie[i] = tabNumbCopie[j + i];
                    tabNumbCopie[j + i] = tempTwo;
                } else {
                    j++;
                }
            } while (invert);
        }
    }

//    ATTENTION : fonction lié à la fonction triString
//    Cette fonction est celle qu'utilise la fonction triString pour convertir chaques String en nombre (long) afin de les trier
//    Il est possible de réutiliser éventuellement cette fonction
//    tab est le tableau de String que l'on veut convertir 
//    tabNumb est le tableau qui contiendra l'équivalence en numéro
//    maxLength est la longueur du plus long mot du tableau et doit au maximum être à 9 pour rentrer dans un (long)
//    ces trois éléments sont créé au préalable et injectés dans la fonction
    private static void convertToNumber(String[] tab, int maxLength, long[] tabNumb) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < maxLength; j++) {
                if (tab[i].length() >= maxLength - j) {
                    if (tab[i].charAt(maxLength - j - 1) >= 'a' && tab[i].charAt(maxLength - j - 1) <= 'z') {
                        tabNumb[i] = tabNumb[i] + ((tab[i].charAt(maxLength - j - 1) - 96) * (long) Math.pow(100, j));
                    } else if (tab[i].charAt(maxLength - j - 1) >= 'A' && tab[i].charAt(maxLength - j - 1) >= 'A') {
                        tabNumb[i] = tabNumb[i] + ((tab[i].charAt(maxLength - j - 1) - 64) * (long) Math.pow(100, j));
                    } else {
                    }
                }
            }
        }
    }
}
