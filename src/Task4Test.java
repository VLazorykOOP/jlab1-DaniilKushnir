import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

    @Test
    public void testRemoveOddLengthWords_WithPunctuation() {
        String input = "Привіт! Як справи? Все добре.";
        String expected = "Привіт Як справи";
        String actual = Task4.removeOddLengthWords(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveOddLengthWords_EmptyString() {
        String input = "";
        String expected = "";
        String actual = Task4.removeOddLengthWords(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveOddLengthWords_NoEvenLengthWords() {
        String input = "А я";
        String expected = "";
        String actual = Task4.removeOddLengthWords(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveOddLengthWords_AllEvenLengthWords() {
        String input = "Це тестове слово";
        String expected = "Це";
        String actual = Task4.removeOddLengthWords(input);
        assertEquals(expected, actual);
    }
}

