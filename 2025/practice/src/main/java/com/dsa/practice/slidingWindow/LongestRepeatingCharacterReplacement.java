package com.dsa.practice.slidingWindow;
/**
 * You are given a string s consisting of only uppercase english characters and an integer k. You can choose up to k characters of the string and replace them with any other uppercase English character.
 *
 * After performing at most k replacements, return the length of the longest substring which contains only one distinct character.
 *
 * Example 1:
 *
 * Input: s = "XYYX", k = 2
 *
 * Output: 4
 * Explanation: Either replace the 'X's with 'Y's, or replace the 'Y's with 'X's.
 *
 * Example 2:
 *
 * Input: s = "AAABABB", k = 1
 *
 * Output: 5
 */

// idea is in any substring of given length the max allowed non repeating character is length - mostFreq
    //considering maximising thr result, we have to find the maximum repeating character and subtract that from length to find out how many minim relacements can be made
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement repeatingChars = new LongestRepeatingCharacterReplacement();
        System.out.println(repeatingChars.findLongestStringBruteForce("AAABABB", 1));
    }

    public int findLongestStringBruteForce(String input, int k){
        int maxf = 0;
        int len = 0;

        for(int i = 0 ; i < input.length() ;i++){
            final int[] count = new int[26];
            for(int j = i;j<input.length();j++){
                count[input.charAt(j) -'A']++;
                maxf = Math.max(maxf, count[input.charAt(j) -'A']);
                //if valid
                if(j-i+1 - maxf <=k)
                len = Math.max(len, j-i+1);

                else
                    break;
            }
        }

return len;

    }


    //AAABABB
    //ideally we have to scan entire 26 array to find what is the maxfreq when we moved the window, but since decreasingmax freq is not going
    //to maximize the result we can skip that part
    //AABABBA k =1
    public int slidingWindow(String input, int k){
        int maxf = 0;
        int len = 0;

        int left = 0;
        int right = 0;
        final int[] count = new int[26];

        while(right <input.length()){
            count[input.charAt(right)-'A']++;
            maxf = Math.max(maxf,count[input.charAt(right)-'A']);

            //invalid window
            if(right-left+1 -maxf >k){
                count[input.charAt(left)-'A']--;
                left++;

            }
                len = Math.max(len, right-left+1);

            right++;
        }



        return len;

    }

}
