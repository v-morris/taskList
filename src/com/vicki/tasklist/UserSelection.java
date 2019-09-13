package com.vicki.tasklist;

public class UserSelection {

    private Tasks tasks = new Tasks();

    // Switch statement to get user input from main menu, then run a task method based off of input
    public void getOptionSelection(int selection) {
        switch (selection) {
            case 1:
                tasks.addTask();
                break;
            case 2:
                tasks.removeTask();
                break;
            case 3:
                tasks.markTaskComplete();
                break;
            case 4:
                tasks.displayTasks();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid selection. Please select a valid number from the menu.");
        }
    }

}
