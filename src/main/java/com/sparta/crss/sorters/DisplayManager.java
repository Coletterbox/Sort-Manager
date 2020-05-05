package com.sparta.crss.sorters;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    private Scanner scanner = new Scanner(System.in);

    public String displayTerminalSortTypeRequest(String path) {
        System.out.println("Enter the number of the sorter you wish to use: ");
        String[] sortNames = getMenuItems(path);
        String sortType = scanner.nextLine();
        return sortNames[Integer.parseInt(sortType)-1];
    }

    public String displayTerminalArraySizeRequest() {
        System.out.println("Please enter the size of array you wish to generate: ");
        return scanner.nextLine();
    }

    public void displayUnsortedArray(String sorterName, int[] unsortedArray) {
        System.out.println("UnsortedArray:  " + Arrays.toString(unsortedArray));
    }

    public void displaySortedArray(int[] sortedArray, long timeTaken) {
        System.out.println("SortedArray: " + Arrays.toString(sortedArray));
    }

    public void displaySortType(String type) {
        System.out.println("Sorted using " + type);
    }

    public void displayErrorMessage(String message) {}

    private String[] getMenuItems(String path) {
        File sortDirectory = new File(path);
        String[] names = sortDirectory.list();
        Arrays.sort(names != null ? names : new String[0]);
        int index = 1;
        for (String name : names) {
            name = name.substring(0, name.indexOf('.'));
            System.out.println(index + ". " + name);
            index++;
        }
        return names;
    }

    public String[] DisplaySorts(String path){
        File sortDirectory = new File(path);
        String [] names = sortDirectory.list();
        Arrays.sort(names != null ? names : new String [0]);
        int index = 1;
        for (String name : names) {
            name = name.substring(0,name.indexOf('.'));
            System.out.println(index + ". " + name);
            index++;
        }
        return names;
    }
}
