import org.example.WordCounter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class WordCounterTest {

    @Test
    public void testIfWordCounterCanCalculateCharacterCount() throws IOException {
        String fileName = "/Users/varadharajansubramanian/Documents/Studies/word_count/src/test/resources/test.txt";
        int count = WordCounter.getNoOfCharacters(fileName);
        Assert.assertEquals(342190, count);
    }

    @Test
    public void testIfWordCounterCanCalculateLinesCount() throws IOException {
        String fileName = "/Users/varadharajansubramanian/Documents/Studies/word_count/src/test/resources/test.txt";
        int lineCount = WordCounter.getNoOfLines(fileName);
        Assert.assertEquals(7145, lineCount);
    }
    @Test
    public void testIfWordCounterCanCalculateWords() throws IOException {
        String fileName = "/Users/varadharajansubramanian/Documents/Studies/word_count/src/test/resources/test.txt";
        int lineCount = WordCounter.getNoOfWords(fileName);
        Assert.assertEquals(58164, lineCount);
    }

    @Test
    public void testIfWordCounterDefaultCanDisplayCorrectly() throws IOException {
        String fileName = "/Users/varadharajansubramanian/Documents/Studies/word_count/src/test/resources/test.txt";
        String defaultOutput = WordCounter.getDefaultCount(fileName);
        Assert.assertEquals("7145\t58164\t342190\ttest.txt", defaultOutput);
    }

}
