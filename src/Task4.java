public class Task4 {
    public static String removeOddLengthWords(String text) {
    String[] words = text.split("[ ,.:;-?!]+");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
        if (word.length() % 2 == 0 && !word.isEmpty()) {
            result.append(word).append(" ");
        }
    }
    return result.toString().trim();
}}
