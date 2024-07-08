package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int i = input.length();
        int count = 0;

        for (int center = 0; center < i; center++) {
            int left = center;
            int right = center;
            while (left >= 0 && right < i && input.charAt(left) == input.charAt(right)) {
                count++;
                left--;
                right++;
            }
            left = center;
            right = center + 1;
            while (left >= 0 && right < i && input.charAt(left) == input.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
        //return null;
    }
}
