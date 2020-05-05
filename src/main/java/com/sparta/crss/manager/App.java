package com.sparta.crss.manager;

import com.sparta.crss.sorters.BubbleSorter;
import com.sparta.crss.sorters.MergeSorter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map myMap = new HashMap();

        int[] exampleArray = {6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5,
                7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6,
                4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1,
                5, 7, 4, 6, 4, 2, 1, 5, 7, 4, };
        BubbleSorter bubbleSorter = new BubbleSorter();
        bubbleSorter.sortArray(exampleArray);

        int[] exampleArray2 = {6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5,
                7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6,
                4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1, 5, 7, 4, 6, 4, 2, 1,
                5, 7, 4, 6, 4, 2, 1, 5, 7, 4, };
        MergeSorter mergeSorter = new MergeSorter();
        mergeSorter.sortArray(exampleArray2);
    }
}