package homework.hw7;

import java.util.Scanner;

/**
 * Created by Tonja on 10.03.2015.
 */
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: \n" +
                "1 - To enter the string: \n2 - To process the data: \n3 -" +
                "To save last calculation: \n" +
                "4 - To see last result: \n5 - To see all saved results: " +
                "\n6 - Print available commands: \n" +
                "  \n  0 - Exit \n \n ");
        System.out.printf(" Please, enter your choice: ");
        int option = Integer.parseInt(sc.nextLine());

        if (option == 1) {
            System.out.printf("Enter the string: \n ");
            // text = " Think different as to be different is okay.";

            String str = sc.nextLine();
            System.out.printf("Please, enter your choice: ");
            option = Integer.parseInt(sc.nextLine());

            if (option == 2) {
                System.out.printf("Processing the data... ");
                String[] masstr = str.split("[\\s,.!?//%$#1234567890()]+");

                String max = masstr[0];
                int j = 0;
                for (int i = 1; i < masstr.length;i++) {
                    if (max.length() < masstr[i].length()) {
                        max = masstr[i];
                        j = j + 1;
                    }
                }  System.out.println("max " + max+ "   "+ j );
            }

        }

    }
}

