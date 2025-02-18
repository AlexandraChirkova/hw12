public class TwoString {
    public static void main(String[] args) {
        TwoString twoString = new TwoString();

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(twoString.arrayStringsAreEqual(word1, word2));

        String[] word10 = {"a", "cb"};
        String[] word12 = {"ab", "c"};
        System.out.println(twoString.arrayStringsAreEqual(word10, word12));

    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String word : word1) {
            sb1.append(word);
        }
        StringBuilder sb2 = new StringBuilder();
        for (String word : word2) {
            sb2.append(word);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
