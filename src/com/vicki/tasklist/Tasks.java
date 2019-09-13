package com.vicki.tasklist;


import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> taskList = new ArrayList<>();

    // Display complete list of tasks if any
    public void displayTasks() {
        int i = 0;
        System.out.println("\nCurrent task list");
        if (taskList.size() == 0) System.out.println("You do not have any tasks to complete at the moment.");
        for (String task : taskList) {
            i++;
            System.out.println(i + ". " + task);
        }
    }

    // Add a task to the list - run enterTaskString to store task, then add and output task that was added
    public void addTask() {
        System.out.println("\nWhat task would you like to add?");
        String task = enterTaskString();
        taskList.add(task);
        System.out.println("\n" + '"' + task + '"' + " has been added to the task list.");
    }

    // Remove a task from the list - display list of tasks, run enterTaskNumber and store the input, then output task that was removed and remove it
    public void removeTask() {
        System.out.println("\nWhich task would you like to remove?");
        displayTasks();
        int taskNumber = enterTaskNumber();
        System.out.println("\n" + '"' + taskList.get(taskNumber) + '"' + " has been removed from the task list.");
        taskList.remove(taskNumber);
    }

    // Mark task completed - display list of tasks, run enterTaskNumber and store the input, then output task marked as completed.
    public void markTaskComplete() {
        System.out.println("\nWhich task would you like to mark complete?");
        displayTasks();
        int taskNumber = enterTaskNumber();

        if (!taskList.get(taskNumber).contains("complete")) {
            taskList.set(taskNumber, taskList.get(taskNumber) + " (complete)");
            System.out.println("\n" + '"' + taskList.get(taskNumber).replace("(complete)", "").trim() + '"' + " has been marked as complete.");
        } else {
            System.out.println("\nThat task is already marked as completed.");
        }
    }

    // method to take input for an int
    public int enterTaskNumber() {
        System.out.println("\nEnter task here: ");
        return Integer.parseInt(scanner.nextLine()) - 1;
    }

    // method to take input for a String
    public String enterTaskString() {
        System.out.println("\nEnter task here: ");
        return scanner.nextLine();
    }

}
