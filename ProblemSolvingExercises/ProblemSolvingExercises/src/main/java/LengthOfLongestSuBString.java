import java.util.HashMap;

public class LengthOfLongestSuBString {
    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
    public static int lengthOfLongestSubstring(String s) {
            HashMap<Character,Integer> map= new HashMap<>();
            int i=0;  int j=0; int maxLength=0;
            if(s.length()==0) return 0;
            while(j<s.length()){
                if(map.containsKey(s.charAt(j))) {
                    int index = map.get(s.charAt(j));
                    if (index >=i) {

                        i = index + 1;
                    }
                }
                map.put(s.charAt(j), j);
               maxLength=Math.max(maxLength,j-i+1);
                j++;

            }


            return maxLength;
        }

    }
