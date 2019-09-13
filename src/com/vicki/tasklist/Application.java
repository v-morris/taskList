package com.vicki.tasklist;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static int userInput;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        UserSelection userSelection = new UserSelection();
        ArrayList<String> menu = mainMenu.createMenu();

        // Run menu while input does not equal size of ArrayList menu
        do {
            mainMenu.runMenu(menu);
            try {
                System.out.println("Enter your option here: ");
                int selection = userInput();
                userSelection.getOptionSelection(selection);
            } catch (NumberFormatException ex) {
                System.out.println("Not a valid selection");
            }
        } while (userInput != menu.size());

    }

    public static int userInput() {
        userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }

}
