package com.sparta.crss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Before;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.sparta.crss.manager.SortFactory;
import com.sparta.crss.sorters.BubbleSorter;
import com.sparta.crss.sorters.MergeSorter;
import com.sparta.crss.sorters.Sorter;

import java.util.Random;

public class AppTest {
    int[] testArray = {6, 5, 4, 1, 2, 3};
    int[] sortedTestArray = {1, 2, 3, 4, 5, 6};

    //TODO: create new sorter
    @BeforeEach
    public void setup() {
        System.out.println("In setup:");
        Sorter sorter = SortFactory.getInstance();
        System.out.println("Testing using the " + sorter.toString());
    }

    @Test
    public void testTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void bubbleSorterTest() {
//        MergeSorter mergeSorter = new MergeSorter();
        Sorter mergeSorter = new MergeSorter();
        assertArrayEquals(mergeSorter.sortArray(testArray), sortedTestArray);
    }

    @Test
    public void mergeSorterTest() {
//        BubbleSorter bubbleSorter = new BubbleSorter();
        Sorter bubbleSorter = new BubbleSorter();
        assertArrayEquals(bubbleSorter.sortArray(testArray), sortedTestArray);
    }

//    @Test

    //@Test(timeout = 20000)
    //tests - odd number, large, duplicates, already sorted etc.

    private int[] createArray(int size) {
        Random random = new Random();
        int[] unsortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            unsortedArray[i] = random.nextInt(i);
        }
        return unsortedArray;
    }

    //@AfterEach
    //public void teardown(){}
}