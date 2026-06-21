package org.example.array;

import junit.framework.Assert;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Assert.assertEquals(5, lengthOfLastWord("Hello World"));
        Assert.assertEquals(4, lengthOfLastWord("   fly me   to   the moon  "));
        Assert.assertEquals(6, lengthOfLastWord("luffy is still joyboy"));
        Assert.assertEquals(1, lengthOfLastWord("a"));
        Assert.assertEquals(3, lengthOfLastWord("abc"));

        Assert.assertEquals(5, lengthOfLastWordV2("Hello World"));
        Assert.assertEquals(4, lengthOfLastWordV2("   fly me   to   the moon  "));
        Assert.assertEquals(6, lengthOfLastWordV2("luffy is still joyboy"));
        Assert.assertEquals(1, lengthOfLastWordV2("a"));
        Assert.assertEquals(3, lengthOfLastWordV2("abc"));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        boolean isStart = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == 0) return ++count;
            if (s.charAt(i - 1) == ' ' && s.charAt(i) != ' ') {
                count++;
                break;
            }

            if (s.charAt(i) != ' ' && !isStart) {
                isStart = true;
                count++;
                continue;
            }

            if (s.charAt(i) == ' ') {
                continue;
            }

            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static int lengthOfLastWordV2(String s) {
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }
}
