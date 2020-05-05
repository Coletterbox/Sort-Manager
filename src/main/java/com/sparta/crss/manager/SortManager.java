package com.sparta.crss.manager;

import com.sparta.crss.sorters.Sorter;
import com.sparta.crss.display.DisplayManager;
import com.sparta.crss.exceptions.SorterException;
import com.sparta.crss.manager.SortFactory;

import java.util.Optional;

//public class SortManager {
////    public int[] SortArray(int[] arrayToSort) {
////        BubbleSort bubbleSort = new BubbleSort();
////        return bubbleSort.BubbleSort(arrayToSort);
////    }
//    public void runSorter(int[] unsortedArray, String sortType) {
//        Sorter sorter = new BubbleSort();
//        int[] sortedArray = sorter.sortArray(unsortedArray);
////        Sorter sorter = SortFactory.getInstance()
//        //display
//        System.out.println(Arrays.toString(unsortedArray));
//        System.out.println(Arrays.toString(sortedArray));
//    }
//}

public class SortManager {

    public void runSorter (int[] unsortedArray) throws SorterException {
        //Optional<Sorter> opt = SortFactory.getInstance();
        Sorter sorter = SortFactory.getInstance();
        //if (opt.isPresent()) {
        if (sorter != null) {
            //Sorter sorter = opt.get();
            int[] sortedArray = sorter.sortArray(unsortedArray.clone());
            displayOutput(unsortedArray, sortedArray, sorter.toString());
        } else {
            throw new SorterException("Unable to create the stated Sorter.");
        }
    }

    private void displayOutput(int[] unsortedArray, int[] sortedArray, String type) {
        DisplayManager displayManager = new DisplayManager();
        DisplayManager.displayUnsortedArray(unsortedArray);
        DisplayManager.displaySortType(type);
        DisplayManager.displaySortedArray(sortedArray);
        displayManager.displaySortedArray(sortedArray);
    }

}