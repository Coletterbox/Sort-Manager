package com.sparta.crss.display;

import com.sparta.crss.exceptions.SorterException;
import com.sparta.crss.manager.SortManager;

public class Starter {

    public static void main(String[] args) {

        int[] testArray = {5,3,-4,6,4,20,0,1,2,1};
        SortManager sortManager = new SortManager();
        try {
            sortManager.runSorter(testArray);
        } catch (SorterException e) {
            System.out.println(e.getMessage());
        }
    }

}