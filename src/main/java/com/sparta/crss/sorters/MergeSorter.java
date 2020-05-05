package com.sparta.crss.sorters;

//import java.util.ArrayList;


public class MergeSorter implements Sorter {

    // change access


    public int[] CombineSortedArrays(int[] inputArray1, int[] inputArray2) {

        int[] resultArray = new int[inputArray1.length + inputArray2.length];
        int resultArrayIndex = 0;
        int inputArray1Index = 0;
        int inputArray2Index = 0;

        while (inputArray1Index < inputArray1.length && inputArray2Index < inputArray2.length) {
            if (inputArray1[inputArray1Index] < inputArray2[inputArray2Index]) {
                resultArray[resultArrayIndex] = inputArray1[inputArray1Index];
                resultArrayIndex++;
                inputArray1Index++;
            } else {
                resultArray[resultArrayIndex] = inputArray2[inputArray2Index];
                resultArrayIndex++;
                inputArray2Index++;
            }
        }
        // adds the rest of the remaining array
        if (inputArray1Index < inputArray1.length) {
            for (int i = 0; i < inputArray1.length - inputArray1Index; i++) {
                resultArray[resultArrayIndex] = inputArray1[inputArray1Index + i];
                resultArrayIndex++;
            }
        }
        if (inputArray2Index < inputArray2.length) {
            for (int i = 0; i < inputArray2.length - inputArray2Index; i++) {
                resultArray[resultArrayIndex] = inputArray2[inputArray2Index + i];
                resultArrayIndex++;
            }
        }
        return resultArray;
    }

    public int[] divideArray(int[] inputArray) {
        //int[][] arrayInHalf = new int[][];
        int inputArrayLength = inputArray.length;
        if (inputArrayLength > 2) {
            int midpoint = inputArrayLength / 2;
            int[] left = new int[midpoint];
            int[] right = new int[inputArrayLength - midpoint];
            for (int i = 0; i < midpoint; i++) {
                left[i] = inputArray[i];
            }
            for (int i = midpoint; i < inputArrayLength; i++) {
                right[i - midpoint] = inputArray[i];
            }
            if (left.length < 3 && right.length < 3) {
                int[] sortedLeft = sortTwoNumbers(left);
                int[] sortedRight = sortTwoNumbers(right);
                int[] combinedArrays = CombineSortedArrays(sortedLeft, sortedRight);
                return combinedArrays;
            } else {
                //TODO: come back to this
//                int[] placeholder = {1, 2};
//                return placeholder;
                int[] newLeftArray = divideArray(left);
                int[] newRightArray = divideArray(right);
                return CombineSortedArrays(newLeftArray, newRightArray);
                //for testing purposes:
                //return newRightArray;
            }
        } else {
            return sortTwoNumbers(inputArray);
        }
    }

    public int[] sortTwoNumbers(int[] array) {
        if (array.length == 1) {
            return array;
        } else if (array.length == 2) {
            int temp = 0;
            if (array[1] < array[0]) {
                temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }
        }
        return array;
    }

    //
    public int[] sortArray(int[] inputArray) {

        long start = System.nanoTime();
        long end;

        int inputArrayLength = inputArray.length;
        if (inputArrayLength > 2) {
            end = System.nanoTime();
            System.out.println(end - start);

            return divideArray(inputArray);
        }
        //?
        else {
            end = System.nanoTime();
            System.out.println(end - start);

            return inputArray;
        }
    }
}