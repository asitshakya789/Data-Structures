package Leetcode;

public class string_difference {
    public char finddifference(String s, String t) {
        char result = 0;
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        string_difference obj = new string_difference();
        String s = "abcd";
        String t = "abcde";
        System.out.println(obj.finddifference(s, t));
    }
}
