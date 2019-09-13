package com.vicki.tasklist;

import java.util.ArrayList;

public class MainMenu {

    // Create ArrayList of Main Menu Items, and run the method to loop through and display the menu
    public ArrayList<String> createMenu() {
        ArrayList<String> mainMenu = new ArrayList<>();
        mainMenu.add("Add a Task");
        mainMenu.add("Remove a task");
        mainMenu.add("Mark a task complete");
        mainMenu.add("List the tasks");
        mainMenu.add("Exit Program\n");
        return mainMenu;
    }

    // Print out the Main Menu Items in the ArrayList
    public void runMenu(ArrayList<String> menu) {
        int i = 0;
        System.out.println("\nWhat would you like to do?");
        for (String menuItem : menu) {
            i++;
            System.out.println(i + ". " + menuItem);
        }
    }

}
