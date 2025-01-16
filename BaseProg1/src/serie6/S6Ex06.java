package serie6;

import java.util.Arrays;

public class S6Ex06 {

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void swap(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortPrenomsAsc(String[] arr, int[] tab)
    {
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i].compareToIgnoreCase(arr[i + 1]) > 0) {
                    swap(arr, i, i + 1);
                    swap(tab, i, i + 1);
                }
            }
        }
        affichage(arr, tab);
    }

    public static void sortPrenomsDesc(String[] arr, int[] tab)
    {
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i].compareToIgnoreCase(arr[i + 1]) < 0) {
                    swap(arr, i, i + 1);
                    swap(tab, i, i + 1);
                }
            }
        }
        affichage(arr, tab);
    }

    public static void sortAgesAsc(String[] arr, int[] tab)
    {
        for (int k = 0; k < tab.length - 1; k++) {
            for (int i = 0; i < tab.length - 1 - k; i++) {
                if (tab[i] > tab[i + 1]) {
                    swap(arr, i, i + 1);
                    swap(tab, i, i + 1);
                }
            }
        }
        affichage(arr, tab);
    }

    public static void sortAgesDesc(String[] arr, int[] tab)
    {
        for (int k = 0; k < tab.length - 1; k++) {
            for (int i = 0; i < tab.length - 1 - k; i++) {
                if (tab[i] < tab[i + 1]) {
                    swap(arr, i, i + 1);
                    swap(tab, i, i + 1);
                }
            }
        }
        affichage(arr, tab);
    }

    public static void affichage(String[] arr, int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(arr[i] + "\t" + tab[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] prenoms = {"Paul", "Simone", "Louis", "Anais"};
        int[] ages = {23, 45, 24, 16};

        affichage(prenoms, ages);

        sortPrenomsAsc(prenoms, ages);
        sortPrenomsDesc(prenoms, ages);
        sortAgesAsc(prenoms, ages);
        sortAgesDesc(prenoms, ages);
    }
}
