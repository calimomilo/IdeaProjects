package serie3b;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println((int)(Math.random()*6)+1);
        }

        System.out.println("\n\n");

        for (int i = 0; i < 20; i++) {
            System.out.printf("%.1f\n", Math.random()*(41.5+41.8+1)-41.8);
        }

        System.out.println("\n\n");

        for (int i = 0; i < 20; i++) {
            System.out.println((char)(Math.random()*('z'-'a'+1)+'a'));
        }

        System.out.println("\n\n");

        String[] dictons = {"On a souvent besoin d'un plus petit que soi.", "Vieille amitié ne craint pas la rouille.",
                "Mieux vaut tard que jamais.", "En avril, ne te découvre pas d'un fil.", "Rira bien qui rira le dernier."};

        int index = (int) (Math.random()*5+1);
        System.out.println(dictons[index]);
    }
}