package com.sparta.crss.sorters;

public class BubbleSorter implements Sorter {

    @Override
    public int[] sortArray(int[] inputArray) {

//        long start = System.currentTimeMillis();
        long start = System.nanoTime();

        boolean sorted = false;
        int length = inputArray.length;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < length; i++) {
            // at this point it is not necessarily actually sorted,
            // and 'sorted' may be changed back to false
            sorted = true;
            for (int j = 1; j < length; j++) {
//                if (inputArray[i] > inputArray[j]) {
//
//                }
                if (inputArray[j - 1] > inputArray[j]) {
                    temp1 = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = temp1;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }

        long end = System.nanoTime();
        System.out.println(end - start);

        return inputArray;
    }
}
