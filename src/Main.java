import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] product = {"Hot Dog", "Hamburger", "Brat", "Pulled Pork", "Salad"};
        int[] inventory = {5, 5, 5, 5, 5};

        Scanner userInput = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select the product you'd like to view");
            System.out.println("-------------------------------------");
            System.out.println("0: Hot Dog");
            System.out.println("1: Hamburger");
            System.out.println("2: Brat");
            System.out.println("3: Pulled Pork");
            System.out.println("4: Salad");
            System.out.println("5: Exit");
            choice = userInput.nextInt();
        }
        while (choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
        if (choice == 0) {
            doWhat(product[0], inventory[0]);
        }
        if (choice == 1) {
            doWhat(product[1], inventory[1]);
        }
        if (choice == 2) {
            doWhat(product[2], inventory[2]);
        }
        if (choice == 3) {
            doWhat(product[3], inventory[3]);
        }
        if (choice ==4) {
            doWhat(product[4], inventory[4]);
        }
        if (choice ==5) {
            System.exit(0);
        }
    }
    private static void doWhat(String food ,int count) {
        Scanner userInput = new Scanner(System.in);
        int choice;

        do {
            System.out.println("What would you like to do for item " + food);
            System.out.println("1: Append 1 to the item " + food);
            System.out.println("2: Subtract 1 from the item " + food);
            choice = userInput.nextInt();
        }

        while (choice != 1 && choice != 2);

        if (choice == 1){
            add(food ,count);
        }

        if (choice == 2){
            remove(food ,count);
        }
    }

    private static void add (String item , int newCount){
        newCount += 1;
        System.out.println("The item " + item + " now has " + newCount + " in inventory");
    }

    private static void remove (String item , int newCount){
        newCount -= 1;
        System.out.println("The item " + item + " now has " + newCount + " in inventory");
    }
}


