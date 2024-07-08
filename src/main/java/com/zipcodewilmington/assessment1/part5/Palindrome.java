package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int count = 0;
        int i = input.length();

        for (int center = 0; center < 2 * i - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

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


//https://stackoverflow.com/questions/28001132/checking-if-a-string-is-a-palindrome-in-java
//https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/

