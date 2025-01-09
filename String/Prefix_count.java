public class Prefix_count {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Prefix_count pc = new Prefix_count();
        String[] words = {"apple", "banana", "apricot", "avocado", "orange"};
        String pref = "ap";
        System.out.println(pc.prefixCount(words, pref));
    }
}
