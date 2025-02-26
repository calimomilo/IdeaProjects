package Cours1;

public class Main {

    public static int sum(int[] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] tab = {1, 4, 6, 95, 35, 42, 18};
        System.out.println(sum(tab));

        Flight vol1 = new Flight();
        vol1.name = "LM1452";
        vol1.speed = 123;
        vol1.destination = "LAX";
        vol1.height = 10987;

        Flight vol2 = new Flight();
        vol2.name = "AR1389";
        vol2.speed = 321;
        vol2.destination = "LUG";
        vol2.height = 9879;

        User user1 = new User();
        user1.name = "John Doe";
        user1.age = 29;

        User user2 = new User();
        user2.name = "Jane Smith";
        user2.age = 16;

        CreditCard cc1 = new CreditCard();
        cc1.user = user1;
        cc1.cardNumber = "12345";
        cc1.expiryDate = "01/01/1999";
        cc1.cvv = "123";

        CreditCard cc2 = new CreditCard();
        cc2.user = user2;
        cc2.cardNumber = "34987";
        cc2.expiryDate = "09/04/2010";
        cc2.cvv = "133";

        CreditCard cc3 = new CreditCard();
        cc3.user = user1;
        cc3.cardNumber = "456789";
        cc3.expiryDate = "23/08/2009";
        cc3.cvv = "986";

        User[] users = {user1, user2};
        CreditCard[] ccs = {cc1, cc2, cc3};

        for (User user : users) {
            System.out.println(user.name);
            System.out.println(user.age);
            System.out.println();
            for (CreditCard cc : ccs) {
                if (cc.user == user) {
                    System.out.println(cc.cardNumber);
                    System.out.println(cc.expiryDate);
                    System.out.println(cc.cvv);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
