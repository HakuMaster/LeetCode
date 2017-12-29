package leet6;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public void reverseWords(String str) {
        String[] split = str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = split.length - 1; i >= 0; i--) {
            list.add(split[i]);
        }
       list.stream().reduce((x,y) -> (x.concat(" "+ y))).ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
      solution.reverseWords("the sky is blue");
    }
}
