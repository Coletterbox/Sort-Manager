package com.sparta.crss.manager;

import com.sparta.crss.sorters.BubbleSorter;
import com.sparta.crss.sorters.MergeSorter;
import com.sparta.crss.sorters.Sorter;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.Properties;

public class SortFactory {

//    public Sorter getInstance(String name) {
//        if (name.equals("bubble")) {
//            return new BubbleSort();
//        } else {
//            return new CombineAndSortArrays();
//        }
//    }

//    public static Optional<Sorter> getInstance() {
//        try (FileReader reader = new FileReader("resources/sort.properties")) {
//            Properties properties = new Properties();
//            properties.load(reader);
//            String name = properties.getProperty("sorter");
//            if (name.equals("bubble")) {
//                return Optional.of(new BubbleSorter());
//            } else if (name.equals("merge")) {
//                return Optional.of(new MergeSorter());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return Optional.ofNullable(null);
//    }

    public static Sorter getInstance() {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("resources/sort.properties"));
            String sorter = properties.getProperty("sorter");
            Class selectedSorter = Class.forName(sorter);
            return (Sorter) selectedSorter.getDeclaredConstructor().newInstance();
        } catch (IOException | ClassNotFoundException | NoSuchMethodException
                | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
