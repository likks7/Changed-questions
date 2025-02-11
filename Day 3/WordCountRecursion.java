public class WordCountRecursion {
    public static void main(String[] args) {
        String text = "the cat and the hat";
        String[] words = text.split(" ");
        countWords(words, 0);
    }

    public static void countWords(String[] words, int index) {
        if (index >= words.length) return; // Base case

        String word = words[index];
        if (word.equals("")) {
            countWords(words, index + 1);
            return;
        }

        int count = 1;
        for (int i = index + 1; i < words.length; i++) {
            if (word.equals(words[i])) {
                count++;
                words[i] = ""; // Mark word as counted
            }
        }

        System.out.println(word + ": " + count);
        countWords(words, index + 1); // Recursive call
    }
}