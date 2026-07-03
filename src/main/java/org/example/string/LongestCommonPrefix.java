package org.example.string;

import junit.framework.Assert;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Assert.assertEquals("fl", longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        Assert.assertEquals("c", longestCommonPrefix(new String[]{"cir", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;

        int minWordLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (minWordLength > str.length()) {
                minWordLength = str.length();
            }
        }

        for (int i = 0; i < minWordLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    counter++;
                } else return stringBuilder.toString();
            }
            if (strs.length - 1 == counter) {
                stringBuilder.append(strs[0].charAt(i));
            }
            counter = 0;
        }
        return stringBuilder.toString();
    }
}
