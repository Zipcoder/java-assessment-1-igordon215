package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
        //return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        int getSecondToLastPosition = stringArray.length - 2;
        return stringArray[getSecondToLastPosition];
        //return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {
        int lastElement = stringArray.length - 1;
        return stringArray[lastElement];
        //return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
        int getSecondToLastPosition = stringArray.length - 2;
        return stringArray[getSecondToLastPosition];
        //return null;
    }
}
