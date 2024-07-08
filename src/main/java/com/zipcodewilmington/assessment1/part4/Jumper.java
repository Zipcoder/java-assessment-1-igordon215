package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */

//    Tariq, the Kangaroo, is trying to reach a flag that's flagHeight units above the ground. In his attempt to reach the flag,
//    Tariq can make any number of jumps up the rock wall where it's mounted; however, he can only move up the wall (meaning he cannot overshoot the flag and move down to reach it). There are 2 types of jumps:
//
//    A jump of height 1.
//    A jump of height jumpHeight.
//    Tariq wants your help determining the minimum number of jumps it will take him to collect the flag. Complete the jumps function in your editor. It has 2 parameters:
//
//    An integer, flagHeight, the height of the flag.
//    An integer, jumpHeight, the number of units he ascends in a jump of type 2.
//    It must return an integer denoting the minimum number of times Tariq must jump to collect the flag.
//
// k = flag height and j = jump height. j = 1 unit so if j = 1 return k
// jumps and a jump counter
    public int jumps(int k, int j) {
        if (j == 1) {
           return k;
        }
        int jumps = 0;
        long currentHeight = 0;

        while(currentHeight < k) {
           if(currentHeight + j <= k) {
              currentHeight += j;
           } else {
              currentHeight++;
           }
            jumps++;
        }
        return jumps;
                //return -1;
            }
        }

